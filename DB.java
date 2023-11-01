import java.util.List;
import java.util.ArrayList;

public class DB {
    private static List<Users> user = new ArrayList<>();
    private static List<Manager> manager = new ArrayList<>();
    private static List<Director> director = new ArrayList<>();

    public static void addUser(Users user) {
        user.add(user);
        if (user instanceof Manager) {
            manager.add((Manager) user);
        } else if (user instanceof Director) {
            director.add((Director) user);
        }
    }
    public static List<Users> getUser() {
        return user;
    }

    public static List<Manager> getManager() {
        return manager;
    }

    public static List<Director> getDirector() {
        return director;

        }
    }
