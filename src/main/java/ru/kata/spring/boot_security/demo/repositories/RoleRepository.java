package ru.kata.spring.boot_security.demo.repositories;

import ru.kata.spring.boot_security.demo.models.Role;

import java.util.List;

public interface RoleRepository {
    List<Role> allRoles();
    Role getRoleByName(String name);
    Role getRoleById(Long id);
    Role getDefaultRole();
}
