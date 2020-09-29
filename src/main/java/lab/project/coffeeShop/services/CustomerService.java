package lab.project.coffeeShop.services;

import java.util.List;
import java.util.Optional;

import lab.project.coffeeShop.entities.Customer;

public interface CustomerService {

	void deleteAll();

	void deleteAll(List<Customer> entities);

	void delete(Customer entity);

	void deleteById(Integer id);

	long count();

	Iterable<Customer> findAllById(Iterable<Integer> ids);

	Iterable<Customer> findAll();

	boolean existsById(Integer id);

	Optional<Customer> findById(Integer id);

	List<Customer> saveAll(List<Customer> entities);

	Customer save(Customer entity);

}
