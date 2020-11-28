package lab.project.coffeeShop.services.implement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import lab.project.coffeeShop.entities.Payment;
import lab.project.coffeeShop.repositories.PaymentRepository;
import lab.project.coffeeShop.services.PaymentService;

public class PaymentServiceImpl implements PaymentService{
	@Autowired
	private PaymentRepository paymentRepository;

	@Override
	public Payment save(Payment entity) {
		return paymentRepository.save(entity);
	}

	@Override
	public List<Payment> saveAll(List<Payment> entities) {
		return (List<Payment>)paymentRepository.saveAll(entities);
	}

	@Override
	public Optional<Payment> findById(Integer id) {
		return paymentRepository.findById(id);
	}

	@Override
	public boolean existsById(Integer id) {
		return paymentRepository.existsById(id);
	}

	@Override
	public Iterable<Payment> findAll() {
		return paymentRepository.findAll();
	}

	@Override
	public Iterable<Payment> findAllById(Iterable<Integer> ids) {
		return paymentRepository.findAllById(ids);
	}

	@Override
	public long count() {
		return paymentRepository.count();
	}

	@Override
	public void deleteById(Integer id) {
		paymentRepository.deleteById(id);
	}

	@Override
	public void delete(Payment entity) {
		paymentRepository.delete(entity);
	}

	@Override
	public void deleteAll(List<Payment> entities) {
		paymentRepository.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		paymentRepository.deleteAll();
	} 
	
	
}
