import jdk_dynamic.service.UserService;
import jdk_dynamic.service.impl.UserServiceImpl;

public class Test01 {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        ClassLoader classLoader = UserService.class.getClassLoader();
        ClassLoader classLoader1 = userService.getClass().getClassLoader();
        System.out.println(classLoader);
        System.out.println(classLoader1);
    }
}
