package cinema.config;

import cinema.model.Role;
import cinema.model.User;
import cinema.service.RoleService;
import cinema.service.UserService;
import java.util.Set;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class Datainitializer {
    private final RoleService roleService;
    private final UserService userService;

    public Datainitializer(RoleService roleService, UserService userService) {
        this.roleService = roleService;
        this.userService = userService;
    }

    @PostConstruct
    public void inject() {
        Role adminRole = new Role();
        adminRole.setRoleName(Role.RoleName.ADMIN);
        roleService.add(adminRole);
        Role userRole = new Role();
        userRole.setRoleName(Role.RoleName.USER);
        roleService.add(userRole);

        User adminUser = new User();
        adminUser.setEmail("admin@i.ua");
        adminUser.setPassword("admin123123");
        adminUser.setRoles(Set.of(adminRole));
        userService.add(adminUser);

        User normalUser = new User();
        normalUser.setEmail("t@g.com");
        normalUser.setPassword("test1234578");
        normalUser.setRoles(Set.of(userRole));
        userService.add(normalUser);
    }
}
