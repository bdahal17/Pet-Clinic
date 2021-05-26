package guru.springframework.sfgpetclinic.services;

public interface DataService<T, ID> {
    Iterable<T> findAll();
    T findById(ID id);
    T save(T obj);
    void delete(T obj);
    void deleteById(ID id);
}
