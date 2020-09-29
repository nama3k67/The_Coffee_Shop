package lab.project.coffeeShop.services;

import java.util.List;
import java.util.Optional;

import lab.project.coffeeShop.entities.User;

public interface UserService {

	void deleteAll();

	void deleteAll(List<User> entities);

	void delete(User entity);

	void deleteById(Integer id);

	long count();

	Iterable<User> findAllById(Iterable<Integer> ids);

	Iterable<User> findAll();

	boolean existsById(Integer id);

	Optional<User> findById(Integer id);

	List<User> saveAll(List<User> entities);

	User save(User entity);

}
