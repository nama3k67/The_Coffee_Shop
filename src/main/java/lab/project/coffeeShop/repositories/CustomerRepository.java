package lab.project.coffeeShop.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import lab.project.coffeeShop.entities.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer>{

}
