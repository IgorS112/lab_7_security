package ru.urfu.lab_7_security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.urfu.lab_7_security.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(String name);

}
