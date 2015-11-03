package DataAccess;

import java.util.List;

import BusinessObjects.Location;

/**
 * Created by Das on 03/11/15.
 */
public interface DBContextInterface<T> {
    List<T> get(int categoryId, Location location);
    T get(int id);
    void add(T obj);
    void update(T obj);
    void delete(int id);
}
