package lab.project.coffeeShop.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import lab.project.coffeeShop.entities.User;
@Repository
public interface UserRepository extends CrudRepository<User, Integer>{

}