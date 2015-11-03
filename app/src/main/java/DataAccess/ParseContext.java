package DataAccess;

import java.util.List;

import BusinessObjects.Location;

/**
 * Created by Das on 03/11/15.
 */
public class ParseContext<T> implements DBContextInterface<T> {
    @Override
    public List<T> get(int categoryId, Location location) {
        return null;
    }

    @Override
    public T get(int id) {
        return null;
    }

    @Override
    public void add(T obj) {

    }

    @Override
    public void update(T obj) {

    }

    @Override
    public void delete(int id) {

    }
}
