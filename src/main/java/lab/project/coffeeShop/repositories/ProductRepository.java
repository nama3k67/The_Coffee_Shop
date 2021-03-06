package lab.project.coffeeShop.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import lab.project.coffeeShop.entities.Product;
@Repository
public interface ProductRepository extends CrudRepository<Product, Integer>{

}
