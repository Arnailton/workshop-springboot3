package course.arnailton.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import course.arnailton.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
