package ru.urfu.lab_7_security.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import ru.urfu.lab_7_security.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
