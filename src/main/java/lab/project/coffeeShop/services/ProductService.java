package lab.project.coffeeShop.services;

import java.util.List;
import java.util.Optional;

import lab.project.coffeeShop.entities.Product;

public interface ProductService {

	void deleteAll();

	void deleteAll(List<Product> entities);

	void delete(Product entity);

	void deleteById(Integer id);

	long count();

	Iterable<Product> findAllById(Iterable<Integer> ids);

	Iterable<Product> findAll();

	boolean existsById(Integer id);

	Optional<Product> findById(Integer id);

	List<Product> saveAll(List<Product> entities);

	Product save(Product entity);

}
