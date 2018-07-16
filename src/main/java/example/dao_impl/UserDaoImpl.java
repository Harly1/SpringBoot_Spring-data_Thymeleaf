package example.dao_impl;


import example.dao_abstract.UserDao;
import example.models.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;


@Transactional
@Repository
public class UserDaoImpl extends AbstractDao<Long, User> implements UserDao {

	public User getUserByUsername(String username) {
		User user = (User) entityManager.createQuery("SELECT u FROM User u WHERE u.login =:username").setParameter("username", username).getSingleResult();
		return user;
	}

	@Override
	public void update(User entity) {

		entityManager.merge(entity);
	}

	@Override
	public void persist(User entity) {
		super.persist(entity);
	}

	@Override
	public void deleteByKey(Long aLong) {
		User userFromDB = entityManager.find(User.class, aLong);
		entityManager.remove(userFromDB);
	}

	@Override
	public <S extends User> S save(S s) {
		return null;
	}

	@Override
	public <S extends User> Iterable<S> saveAll(Iterable<S> iterable) {
		return null;
	}

	@Override
	public Optional<User> findById(Long aLong) {
		return Optional.empty();
	}

	@Override
	public boolean existsById(Long aLong) {
		return false;
	}

	@Override
	public Iterable<User> findAll() {
		return null;
	}

	@Override
	public Iterable<User> findAllById(Iterable<Long> iterable) {
		return null;
	}

	@Override
	public long count() {
		return 0;
	}

	@Override
	public void deleteById(Long aLong) {

	}

	@Override
	public void delete(User user) {

	}

	@Override
	public void deleteAll(Iterable<? extends User> iterable) {

	}

	@Override
	public void deleteAll() {

	}
}
