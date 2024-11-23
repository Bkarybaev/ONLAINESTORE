import java.util.Arrays;
import java.util.Scanner;

public class User {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Device[] devices = new Device[0];
    private Book[] books = new Book[0];


    public User() {
    }

    public User(String firstName, String lastName, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

    public Device[] getDevices() {
        return devices;
    }

    public void setDevices(Device[] devices) {
        this.devices = devices;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public void addProduct(Book product) {
        books = Arrays.copyOf(books, books.length + 1);
        books[books.length - 1] = product;
    }

    public void addProduct(Device product) {
        devices = Arrays.copyOf(devices, devices.length + 1);
        devices[devices.length - 1] = product;
    }

    public User Register(Scanner scanner) {

        String firsName1;
        String lastName1;
        String emil;
        String pass;
        while (true) {
            System.out.print("атынызды жазыныз : ");
            String firsName = scanner.nextLine();
            if (firsName.length() > 2) {
                firsName1 = firsName;
                break;
            } else {
                System.out.println("koburook tamga jazynyz!");
            }
        }
        while (true) {
            System.out.print("фамилиянызды жазыныз : ");
            String lastName = scanner.nextLine();
            if (lastName.length() > 2) {
                lastName1 = lastName;
                break;
            } else {
                System.out.println("koburook tamga jazynyz!");
            }
        }
        while (true) {
            System.out.print("email жазыныз : ");
            String email = scanner.nextLine();
            if (email.contains("@gmail.com")) {
                emil = email;
                break;
            } else {
                System.out.println("созсуз турдо @gmail.com жазыныз");
            }
        }
        while (true) {
            System.out.print("парол жазыныз (узундугу 4 тон коп болсун ж/а сан камтысын): ");
            String password = scanner.nextLine();
            if (password.contains("1") || password.contains("2") || password.contains("3") || password.contains("4") || password.contains("5") ||
                    password.contains("6") || password.contains("7") || password.contains("8") ||
                    password.contains("9") || password.contains("0") && password.length() > 3) {
                pass = password;
                break;
            } else {
                System.out.println("эскетуу узундугу 4 тон коп болсун ж/а сан камтысын !!!");
            }
        }
        System.out.println("ийгиликтуу катталды!!!");
        return new User(firsName1, lastName1, emil, pass);
    }
}
