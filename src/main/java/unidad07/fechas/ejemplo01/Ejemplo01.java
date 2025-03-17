package unidad07.fechas.ejemplo01;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

/**
 * Para la Era, consultar: https://en.wikipedia.org/wiki/Common_Era
 *
 * @author diego
 */
public class Ejemplo01 {

    public static void main(String args[]) {
        LocalDate fechaHoy = LocalDate.now();
        LocalTime horaAhora = LocalTime.now();
        LocalDateTime fechaHoraHoy = LocalDateTime.now();

        System.out.println("La fecha actual es: " + fechaHoy);
        System.out.println("La hora actual es: " + horaAhora);
        System.out.println("La fecha y hora actuales son: " + fechaHoraHoy);

        System.out.println("El instante actual es: " + Instant.now());
        System.out.println("La fecha y hora actuales con zona horaria son: " + ZonedDateTime.now());

        System.out.println();
        System.out.println();
        System.out.println("----------------------------------------------------");
        System.out.println("Fechas concretas distintas a las de hoy");
        System.out.println("----------------------------------------------------");

        LocalDate fechaConcreta = LocalDate.of(1972, Month.MAY, 23);
        LocalDate fechaConcreta2 = LocalDate.parse("1972-05-23");
        LocalTime horaConcreta = LocalTime.of(15, 40, 44);
        LocalDateTime fechaHoraConcreta = LocalDateTime.of(1972, Month.MAY, 23, 20, 01, 15, 0023);
        LocalDateTime fechaHoraConcreta2 = LocalDateTime.of(LocalDate.of(1972, Month.MAY, 23), LocalTime.now());

        System.out.println("Fecha concreta 1: " + fechaConcreta);
        System.out.println("Fecha concreta 2: " + fechaConcreta2);
        System.out.println("Hora concreta: " + horaConcreta);
        System.out.println("Fecha y hora concretas: " + fechaHoraConcreta);
        System.out.println("Fecha y hora concretas: " + fechaHoraConcreta2);

        System.out.println();
        System.out.println();
        System.out.println("----------------------------------------------------");
        System.out.println("Fecha anterior o posterior");
        System.out.println("----------------------------------------------------");

        LocalDate dentroDe5Dias = fechaHoy.plusDays(5);
        System.out.println("dentroDe5Dias: " + dentroDe5Dias);
        LocalDate hace5Dias = fechaHoy.minusDays(5);
        System.out.println("hace 5 Dias: " + hace5Dias);
        System.out.println("hace 5 Dias: " + fechaHoy.plusDays(-5));

        System.out.println();
        System.out.println();
        System.out.println("----------------------------------------------------");
        System.out.println("Datos relativos a la fecha");
        System.out.println("----------------------------------------------------");

        System.out.println();
        System.out.println("Fecha actual. Día de la semana: " + fechaHoy.getDayOfWeek());
        System.out.println("Fecha actual. Día del mes: " + fechaHoy.getDayOfMonth());
        System.out.println("Fecha actual. Día del año: " + fechaHoy.getDayOfYear());
        System.out.println("Fecha actual. ¿Cuántos días tiene este mes?: " + fechaHoy.lengthOfMonth());

        System.out.println();
        System.out.println("Fecha: " + fechaConcreta);
        System.out.println(fechaConcreta + ". Mes: " + fechaConcreta.getMonth());
        System.out.println(fechaConcreta + ". Mes (número): " + fechaConcreta.getMonthValue());

        System.out.println();
        System.out.println(fechaConcreta + ". Día de la semana: " + fechaConcreta.getDayOfWeek());
        System.out.println(fechaConcreta + ". Día de la semana (número): " + fechaConcreta.getDayOfWeek().getValue());

        System.out.println();
        System.out.println(fechaConcreta + ". Día del mes: " + fechaConcreta.getDayOfMonth());
        System.out.println(fechaConcreta + ". Día del año: " + fechaConcreta.getDayOfYear());

        System.out.println();
        System.out.println("Fecha actual. Antes/Después de Cristo: " + fechaHoy.getEra());
        System.out.println("CE = Common Era (después de Cristo)");
        LocalDate fechaAntesDeCristo = LocalDate.of(-200, 10, 10);
        System.out.println(fechaAntesDeCristo + ". Antes: " + fechaAntesDeCristo.getEra());
        System.out.println("BCE = Before the Common Era (antes de Cristo)");

        System.out.println();
        System.out.println("Fecha actual: " + fechaHoy);
        System.out.println("Días formato Epoch : " + fechaHoy.toEpochDay() + " días transcurridos desde 1970-01-01 (1 de enero de 1970)");

        System.out.println();
        LocalDate fechaFutura = fechaHoy.plusYears(4);
        fechaFutura = fechaFutura.plusMonths(2);
        fechaFutura = fechaFutura.plusDays(3);
        System.out.println("La fecha dentro de 4 años, 2 meses y 3 días será: " + fechaFutura);

        System.out.println();
        System.out.println("Para la fecha " + fechaHoy + ", ¿el año es bisiesto?  " + fechaHoy.isLeapYear());

        System.out.println();
        System.out.println("¿Ha pasado ya el aniversario del descubrimiento de América (12 de octubre de 1942)? ");
        LocalDate fechaDescubrimiento = LocalDate.of(1942, Month.OCTOBER, 12);
        fechaDescubrimiento = fechaDescubrimiento.withYear(fechaHoy.getYear());
        System.out.println("fechaHoy = " + fechaHoy);
        System.out.println("fechaDescubrimiento aniversario = " + fechaDescubrimiento);
        if (fechaHoy.isBefore(fechaDescubrimiento)) {
            System.out.println("Aún no hemos llegado al aniversario.");
        }
        else {
            System.out.println("El aniversario ya ha pasado este año.");
        }

        System.out.println();
        System.out.println();
        System.out.println("----------------------------------------------------");
        System.out.println("Excepciones");
        System.out.println("----------------------------------------------------");

        try {
            System.out.println("Día bisiesto de 2019: " + LocalDate.of(2019, Month.FEBRUARY, 29));
        } catch (java.time.DateTimeException e) {
            System.out.println("La fecha no es correcta.");
        }

        System.out.println();
        System.out.println("----------------------------------------------------");
        System.out.println("Intervalos de fechas y horas");
        System.out.println("----------------------------------------------------");

        System.out.println();
        long intervalo = fechaHoy.toEpochDay() - fechaConcreta.toEpochDay();
        System.out.println("Días transcurridos entre " + fechaHoy + " y " + fechaConcreta + " = " + intervalo);

        System.out.println();
        long dias = ChronoUnit.DAYS.between(fechaHoy, fechaFutura);
        long semanas = ChronoUnit.WEEKS.between(fechaHoy, fechaFutura);
        long meses = ChronoUnit.MONTHS.between(fechaHoy, fechaFutura);

        System.out.println("Días entre " + fechaHoy + " y " + fechaFutura + " = " + dias);
        System.out.println("Semanas entre " + fechaHoy + " y " + fechaFutura + " = " + semanas);
        System.out.println("Meses entre " + fechaHoy + " y " + fechaFutura + " = " + meses);

        System.out.println();
        fechaFutura = LocalDate.of(fechaHoy.getYear() + 1, fechaHoy.getMonthValue() + 3, fechaHoy.getDayOfMonth() + 4);
        Period periodo = Period.between(fechaHoy, fechaFutura);
        System.out.println("Periodo entre " + fechaHoy + " y " + fechaFutura);
        System.out.println("Entre ambas fechas hay " + periodo.getDays() + " días, " + periodo.getMonths() + " meses y " + periodo.getYears() + " años.");

        System.out.println();
        System.out.println("¿Cuántos días faltan para el fin de año?");
        System.out.println("El año tiene " + fechaHoy.lengthOfYear() + " días. Estamos en el día " + fechaHoy.getDayOfYear() + " del año.");
        System.out.println("¿Cuántos días faltan para el fin de año? = " + (fechaHoy.lengthOfYear() - fechaHoy.getDayOfYear()));
    }
}
