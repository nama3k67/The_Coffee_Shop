package lab.project.coffeeShop.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import lab.project.coffeeShop.entities.Payment;

@Repository
public interface PaymentRepository extends CrudRepository<Payment, Integer>{

}
