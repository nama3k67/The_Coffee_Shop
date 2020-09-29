package lab.project.coffeeShop.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import lab.project.coffeeShop.entities.Comment;

@Repository
public interface CommentRepository extends CrudRepository<Comment, Integer>{

}
