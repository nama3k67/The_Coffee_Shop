package lab.project.coffeeShop.services;

import java.util.List;
import java.util.Optional;

import lab.project.coffeeShop.entities.Payment;

public interface PaymentService {

	void deleteAll();

	void deleteAll(List<Payment> entities);

	void delete(Payment entity);

	void deleteById(Integer id);

	long count();

	Iterable<Payment> findAllById(Iterable<Integer> ids);

	Iterable<Payment> findAll();

	boolean existsById(Integer id);

	Optional<Payment> findById(Integer id);

	List<Payment> saveAll(List<Payment> entities);

	Payment save(Payment entity);

}
