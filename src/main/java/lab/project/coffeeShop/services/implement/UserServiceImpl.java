package lab.project.coffeeShop.services.implement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lab.project.coffeeShop.entities.User;
import lab.project.coffeeShop.repositories.UserRepository;
import lab.project.coffeeShop.services.UserService;

@Service
public class UserServiceImpl implements UserService{
	@Autowired 
	private UserRepository userRepository;

	@Override
	public User save(User entity) {
		return userRepository.save(entity);
	}

	@Override
	public List<User> saveAll(List<User> entities) {
		return (List<User>)userRepository.saveAll(entities);
	}

	@Override
	public Optional<User> findById(Integer id) {
		return userRepository.findById(id);
	}

	@Override
	public boolean existsById(Integer id) {
		return userRepository.existsById(id);
	}

	@Override
	public Iterable<User> findAll() {
		return userRepository.findAll();
	}

	@Override
	public Iterable<User> findAllById(Iterable<Integer> ids) {
		return userRepository.findAllById(ids);
	}

	@Override
	public long count() {
		return userRepository.count();
	}

	@Override
	public void deleteById(Integer id) {
		userRepository.deleteById(id);
	}

	@Override
	public void delete(User entity) {
		userRepository.delete(entity);
	}

	@Override
	public void deleteAll(List<User> entities) {
		userRepository.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		userRepository.deleteAll();
	} 
	
}
