import java.util.Arrays;
import java.util.Scanner;

public class UserDataBase {
    private User[] users = new User[0];
    String password;

    ProductDataBase productDataBase = new ProductDataBase();

    public UserDataBase() {
    }

    public void addLogin(User users1) {
        users = Arrays.copyOf(users, users.length + 1);
        users[users.length - 1] = users1;
        for (User user : this.users) {
            System.out.println("\nFirst Name : " + user.getFirstName());
            System.out.println("Last Name : " + user.getLastName());
            System.out.println("Email : " + user.getEmail());
            System.out.println("Password : " + user.getPassword());
        }
    }

    public User[] getUsers() {
        return users;
    }

    public void loginUser(Scanner scanner) {
        System.out.println("сиздин акаунт:");
        int j = 1;
        for (User user : getUsers()) {
            System.out.println(j + ". " + user.getEmail() + "\n");
            j++;
        }
        System.out.println("0. Logout              Чыгуу");

        System.out.print("танданыз : ");
        int userLogin = scanner.nextInt();
        if (userLogin == 0) {
            return;
        }
        while (true) {
            System.out.println("Password : ");
            this.password = new Scanner(System.in).nextLine();
            if (password != null) {
                break;
            }
        }

        for (User user : users) {
            if (user.getPassword().equals(password)) {
                while (true) {
                    System.out.println("0. Logout              Чыгуу");
                    System.out.println("1. Add new Product     Жаңы продукт кошуңуз");
                    System.out.println("2. Get all Products    Бардык продукталарды алыңыз");
                    System.out.println("3. Get all Book        Бардык китепти алыңыз");
                    System.out.println("4. Get all Device.     Бардык устройстволарды алыңыз");
                    System.out.print("Тандаңыз: ");
                    int command = scanner.nextInt();
                    switch (command) {
                        case 0 -> {
                            password = null;
                            return;
                        }
                        case 1 -> addDevice();
                        case 2 -> getAllProducts();
                        case 3 -> getAllBooks();
                        case 4 -> getAllDevice();
                        default -> System.out.println("туура эмес тандоо!");
                    }
                }
            }

        }
            System.out.println("Invalid password!!!");
    }

    public void addDevice() {
        while (true) {
            System.out.println("\n1. add Device");
            System.out.println("2. add Book");
            System.out.println("0. артка кайтуу\n");
            System.out.print("Тандаңыз: ");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> {
                    Device newDevice = productDataBase.addDevise();
                    addDevise(newDevice, password);
                }
                case 2 -> {
                    Book book = productDataBase.addBook();
                    addBook(book, password);
                }

                case 0 -> {
                    return;
                }
            }
        }
    }

    public void getAllProducts() {
        System.out.println("hello  ");
        for (User user : users) {
            if (user.getPassword().equals(password)) {
                for (Device device : user.getDevices()) {
                    System.out.println("Brand : " + device.getBrand());
                    System.out.println("Color : " + device.getColor());
                    System.out.println("Is new : " + device.getIsNew());
                    System.out.println("Memory : " + device.getMemory());
                    System.out.println("Price $ : " + device.getPrice() + "\n");
                }
                for (Book book : user.getBooks()) {
                    System.out.println("name : " + book.getName());
                    System.out.println("description : " + book.getDescription());
                    System.out.println("price : " + book.getPrice());
                    System.out.println("createdAt : " + book.getCreatedAt());
                    System.out.println("authorFullName : " + book.getAuthorFullName() + "\n");
                }
            }
        }


    }

    public void getAllBooks() {
        for (User user : users) {
            if (user.getPassword().equals(password)) {
                for (Book book : user.getBooks()) {
                    System.out.println("name : " + book.getName());
                    System.out.println("description : " + book.getDescription());
                    System.out.println("price : " + book.getPrice());
                    System.out.println("createdAt : " + book.getCreatedAt());
                    System.out.println("authorFullName : " + book.getAuthorFullName() + "\n");
                }
            }
        }

    }

    public void getAllDevice() {
        for (User user : users) {
            if (user.getPassword().equals(password)) {
                for (Device device : user.getDevices()) {
                    System.out.println("Brand : " + device.getBrand());
                    System.out.println("Color : " + device.getColor());
                    System.out.println("Is new : " + device.getIsNew());
                    System.out.println("Memory : " + device.getMemory());
                    System.out.println("Price $ : " + device.getPrice() + "\n");
                }
            }
        }

    }
    public void addDevise(Device devise, String password) {
        for (User user : users) {
            if (user.getPassword().equalsIgnoreCase(password)) {
                user.addProduct(devise);
            }
        }
    }
    public void addBook(Book book,String password) {
        for (User user : users) {
            if (user.getPassword().equalsIgnoreCase(password)) {
                user.addProduct(book);
            }
        }
    }



}
