package ru.kata.spring.boot_security.demo;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootSecurityDemoApplicationTests {
//	@Autowired
//	private RoleService roleService;
//	@Autowired
//	private UserService userService;
//
//	@Test
//	void createOperation(){
//		User user = new User();
//		user.setFirstName("a");
//		user.setLastName("b");
//		user.setEmail("c1");
//		user.setPassword("d");
//		userService.addUserToDatabase(user);
//	}
//	@Test
//	void deleteOperation(){
//		userService.removeUserByIdFromDatabase(userService.findUserByUsername("c1").getId());
//	}
//
//	@Test
//	void createUserWithOneExistingRole(){
//		User user = new User();
//		user.setFirstName("a");
//		user.setLastName("b");
//		user.setEmail("c2");
//		user.setPassword("d");
//		Role role = roleService.findRoleByRoleName("USER");
//		user.addRole(role);
//		userService.addUserToDatabase(user);
//	}
//
//	@Test
//	void deleteUserWithExistingRole() {
//		userService.removeUserByIdFromDatabase(userService.findUserByUsername("c2").getId());
//	}
//
//	@Test
//	void createUserWithTwoExistingRoles() {
//		User user = new User();
//		user.setFirstName("a");
//		user.setLastName("b");
//		user.setEmail("c3");
//		user.setPassword("d");
//		Role role1 = roleService.findRoleByRoleName("USER");
//		Role role2 = roleService.findRoleByRoleName("ADMIN");
//		user.addRole(role1);
//		user.addRole(role2);
//		userService.addUserToDatabase(user);
//	}
//	@Test
//	void deleteUserWithTwoExistingRoles() {
//		userService.removeUserByIdFromDatabase(userService.findUserByUsername("c3").getId());
//	}

//	@Test
//	void editUserByHisRole() {
//		User user = userService.findUserByUsername("maksim.teron.ustinov@mail.ru");
//		user.updateRoleSet(roleService.findRoleByRoleName("ADMIN"));
//		userService.updateUserInDatabase(user);
//	}

//	@Test
//	void editUserByHisRoles() {
//		User user = userService.findUserByUsername("maksim.teron.ustinov@mail.ru");
//		user.clearRoleSet();
//		user.addRole(roleService.findRoleByRoleName("ADMIN"));
//		userService.updateUserInDatabase(user);
//	}
//
//	@Test
//	void createUserAndHisRole() {
//		User user = new User();
//		user.setFirstName("a");
//		user.setLastName("b");
//		user.setEmail("c");
//		user.setPassword("d");
//		Role role = new Role();
//		role.setRoleName("T");
//		role.setAuthority("ROLE_T");
//		roleService.saveRoleToBase(role);
//		user.addRole(role);
//		userService.addUserToDatabase(user);
//	}
//
//	@Test
//	void deleteUserAndHisRole() {
//		userService.removeUserByIdFromDatabase(userService.findUserByUsername("c").getId());
//		roleService.deleteRoleFromBase(roleService.findRoleByRoleName("T").getId());
//	}
}
