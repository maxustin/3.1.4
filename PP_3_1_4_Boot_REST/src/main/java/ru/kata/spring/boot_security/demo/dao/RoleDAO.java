package ru.kata.spring.boot_security.demo.dao;

import ru.kata.spring.boot_security.demo.model.Role;

import java.util.List;
import java.util.Set;

public interface RoleDAO {
    List<Role> getAllRoles();
    Role getRoleById(long id);
    Role findRoleByRoleName(String roleName);
    Set<Role> findByIdRoles(List<Long>roles);

    void addRole(Role role);
}
