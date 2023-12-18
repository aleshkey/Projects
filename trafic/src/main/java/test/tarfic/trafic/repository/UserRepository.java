package test.tarfic.trafic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import test.tarfic.trafic.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<Object> findByEmailIgnoreCase(String username);

    User findByUsername(String username);
}
