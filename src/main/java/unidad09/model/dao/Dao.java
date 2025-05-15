package unidad09.model.dao;

import unidad09.model.Alumno;

import java.util.ArrayList;

public interface Dao<T, V> {
    public ArrayList<T> select();

    public T select(V id);

    public void insert(T a);

    public void insert(T... a);

    public void update(T a);

    public void delete(T a);
}
