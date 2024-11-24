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
            System.out.print("Password : ");
            this.password = new Scanner(System.in).nextLine();
            if (password != null) {
                break;
            }
        }
        boolean isblok = false;
        for (User user : users) {
            if (user.getPassword().equals(password)) {
                isblok = true;
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
        if (!isblok) {
            System.out.println("Invalid password!!!");
        }
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
        for (User user : users) {
            if (user.getPassword().equals(password)) {
                if (user.getDevices() != (null))System.out.println("-_-_-_-_-_---Device---_-_-_-_-_-");
                for (Device device : user.getDevices()) {
                    System.out.println("id : " + device.getId());
                    System.out.println("Brand : " + device.getBrand());
                    System.out.println("Color : " + device.getColor());
                    System.out.println("Is new : " + device.getIsNew());
                    System.out.println("Memory : " + device.getMemory());
                    System.out.println("Price $ : " + device.getPrice() + "\n");
                }
                if (user.getBooks() != (null)) System.out.println("---------=== Book ===--------");
                for (Book book : user.getBooks()) {
                    System.out.println("id : " + book.getId());
                    System.out.println("name : " + book.getName());
                    System.out.println("description : " + book.getDescription());
                    System.out.println("price : " + book.getPrice());
                    System.out.println("createdAt : " + book.getCreatedAt());
                    System.out.println("authorFullName : " + book.getAuthorFullName() + "\n");
                }
                deleteById();
            }
        }


    }

    public void getAllBooks() {
        for (User user : users) {
            if (user.getPassword().equals(password)) {
                if (user.getBooks() != (null)) System.out.println("---------=== Book ===--------");

                for (Book book : user.getBooks()) {
                    System.out.println("name : " + book.getName());
                    System.out.println("description : " + book.getDescription());
                    System.out.println("price : " + book.getPrice());
                    System.out.println("createdAt : " + book.getCreatedAt());
                    System.out.println("authorFullName : " + book.getAuthorFullName() + "\n");
                }
            }
            deleteById();
        }

    }

    public void getAllDevice() {
        for (User user : users) {
            if (user.getPassword().equals(password)) {
                if (user.getDevices() != (null)) System.out.println("-_-_-_-_-_---Device---_-_-_-_-_-");
                for (Device device : user.getDevices()) {
                    System.out.println("Brand : " + device.getBrand());
                    System.out.println("Color : " + device.getColor());
                    System.out.println("Is new : " + device.getIsNew());
                    System.out.println("Memory : " + device.getMemory());
                    System.out.println("Price $ : " + device.getPrice() + "\n");
                }
            }
            deleteById();
        }

    }

    public void addDevise(Device devise, String password) {
        for (User user : users) {
            if (user.getPassword().equalsIgnoreCase(password)) {
                user.addProduct(devise);
            }
        }
    }

    public void addBook(Book book, String password) {
        for (User user : users) {
            if (user.getPassword().equalsIgnoreCase(password)) {
                user.addProduct(book);
            }
        }
    }

    public void deleteById() {
        System.out.println("0. Logout  - Чыгуу");
        System.out.println("Delete Product(id)");
        System.out.print("Тандаңыз: ");
        int id = new Scanner(System.in).nextInt();
        if (id == 0) return;
        boolean isblok = false;
        for (User user : users) {
            for (int i = 0; i < user.getDevices().length; i++) {
                if (id == user.getDevices()[i].getId()) {
                    for (int i1 = i; i1 < user.getDevices().length - 1; i1++) {
                        user.getDevices()[i1] = user.getDevices()[i1 + 1];
                        System.out.println("deleted id = " + id + " !!");
                    }
                }
            }
            user.setDevices(Arrays.copyOf(user.getDevices(), user.getDevices().length - 1));
            for (int i = 0; i < user.getBooks().length; i++) {
                if (id == user.getBooks()[i].getId()) {
                    for (int i1 = i; i1 < user.getBooks().length - 1; i1++) {
                        user.getBooks()[i1] = user.getBooks()[i1 + 1];
                        System.out.println("deleted id = " + id + " !!");
                    }
                }
            }
            user.setBooks(Arrays.copyOf(user.getBooks(), user.getBooks().length - 1));
        }

        if (!isblok) System.out.println("not faunt id " + id + " !!!");
    }


}
