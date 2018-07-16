package example.dao_impl;


import example.dao_abstract.RoleDao;
import example.models.Role;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Transactional
@Repository
public class RoleDaoImpl extends AbstractDao<Long, Role> implements RoleDao {

	public Role getRoleByRoleName(String roleName) {
		return (Role) getSession().createQuery("FROM Role WHERE name = :name").setParameter("name", roleName).uniqueResult();
	}

	@Override
	public <S extends Role> S save(S s) {
		return null;
	}

	@Override
	public <S extends Role> Iterable<S> saveAll(Iterable<S> iterable) {
		return null;
	}

	@Override
	public Optional<Role> findById(Long aLong) {
		return Optional.empty();
	}

	@Override
	public boolean existsById(Long aLong) {
		return false;
	}

	@Override
	public Iterable<Role> findAll() {
		return null;
	}

	@Override
	public Iterable<Role> findAllById(Iterable<Long> iterable) {
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
	public void delete(Role role) {

	}

	@Override
	public void deleteAll(Iterable<? extends Role> iterable) {

	}

	@Override
	public void deleteAll() {

	}
}