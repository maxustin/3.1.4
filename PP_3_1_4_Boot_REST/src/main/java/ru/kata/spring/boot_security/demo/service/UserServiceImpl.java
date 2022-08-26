package ru.kata.spring.boot_security.demo.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.kata.spring.boot_security.demo.dao.RoleDAO;
import ru.kata.spring.boot_security.demo.dao.UserDAO;
import ru.kata.spring.boot_security.demo.model.Role;
import ru.kata.spring.boot_security.demo.model.User;

import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

@Service
public class UserServiceImpl implements UserService, UserDetailsService {

    private static final Logger logger = Logger.getLogger("Authentication Log");

    private final UserDAO userDAO;
    private final RoleDAO roleDAO;

    public UserServiceImpl(UserDAO userDAO, RoleDAO roleDAO) {
        this.userDAO = userDAO;
        this.roleDAO = roleDAO;
    }


    @Override
    public List<User> findAll() {
        return userDAO.getAllUsers();
    }

    @Override
    public User getById(long id) {
        return userDAO.getUserById(id);
    }

    @Override
    @Transactional
    public void save(User user) {
        userDAO.addUser(user);
    }

    @Override
    @Transactional
    public void update(User user) {
        userDAO.updateUser(user);
    }

    @Override
    @Transactional
    public void deleteById(long id) {
        userDAO.removeUserById(id);
    }

    @Override
    public User findByUsername(String username) {
        return userDAO.findByUsername(username);
    }

    @Override
    @PostConstruct
    public void addDefaultUser() {
        roleDAO.addRole(new Role("ROLE_USER"));
        roleDAO.addRole(new Role("ROLE_ADMIN"));
        Set<Role> roles1 = new HashSet<>();
        roles1.add(roleDAO.getRoleById(1L));
        Set<Role> roles2 = new HashSet<>();
        roles2.add(roleDAO.getRoleById(1L));
        roles2.add(roleDAO.getRoleById(2L));
        User user1 = new User("Steve","Jobs",(byte) 25, "user@mail.com", "12345", roles1);
        User user2 = new User("Garry","Potter",(byte) 30, "admin@mail.com","admin", roles2);
        userDAO.addDefaultUser(user1);
        userDAO.addDefaultUser(user2);
        }

    @Override
    public UserDetails loadUserByUsername(String s){
        try{
            return findByUsername(s);
        } catch(RuntimeException e) {
            logger.log(Level.SEVERE, "user hasn't been found due to incorrect entered data or \"users\" content", e);
        }
        return null;
    }
}

