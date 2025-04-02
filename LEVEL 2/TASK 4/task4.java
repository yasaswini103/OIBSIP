import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LoginAuthSystem {
    private static Map<String, String> users = new HashMap<>(); // Simulated user database

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Choose an option: register, login, secure, logout, exit");
            String option = scanner.nextLine();
            
            switch (option.toLowerCase()) {
                case "register":
                    register(scanner);
                    break;
                case "login":
                    login(scanner);
                    break;
                case "secure":
                    securePage();
                    break;
                case "logout":
                    logout();
                    break;
                case "exit":
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option, try again.");
            }
        }
    }

    private static void register(Scanner scanner) {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        if (users.containsKey(username)) {
            System.out.println("User already exists!");
            return;
        }
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        users.put(username, password);
        System.out.println("User registered successfully!");
    }

    private static void login(Scanner scanner) {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        if (users.containsKey(username) && users.get(username).equals(password)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid credentials!");
        }
    }

    private static void securePage() {
        System.out.println("Accessing secured page...");
        System.out.println("Welcome to the secure page!");
    }

    private static void logout() {
        System.out.println("Logged out successfully!");
    }
}
