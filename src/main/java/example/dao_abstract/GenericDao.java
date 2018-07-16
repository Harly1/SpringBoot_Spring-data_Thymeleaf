package example.dao_abstract;

import org.springframework.data.repository.CrudRepository;

import java.io.Serializable;
import java.util.List;

public interface GenericDao<PK extends Serializable, T> extends CrudRepository<T, Long> {

	void persist(T entity);

    T getByKey(PK id);

    List<T> getAll();

    void update(T group);

    void deleteByKey(PK id);
}
