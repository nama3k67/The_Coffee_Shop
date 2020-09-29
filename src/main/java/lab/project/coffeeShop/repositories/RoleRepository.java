package lab.project.coffeeShop.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import lab.project.coffeeShop.entities.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Integer>{

}
