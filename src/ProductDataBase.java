import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class ProductDataBase {
    private Device[] devices = new Device[0];
    private Book[] books = new Book[0];

    public ProductDataBase() {
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

    public void addDevise(Device devise) {
        devices = Arrays.copyOf(devices, devices.length + 1);
        devices[devices.length - 1] = devise;
    }

    public void addBook(Book book) {
        books = Arrays.copyOf(books, books.length + 1);
        books[books.length - 1] = book;
    }

    String brand;
    String color;
    String isNew;
    String memory;
    String price;

    public Device addDevise() {
        while (true) {
            System.out.print("Brand Devise : ");
            brand = new Scanner(System.in).nextLine();
            if (brand != null) {
                break;
            }
        }
        while (true) {
            System.out.print("Color : ");
            color = new Scanner(System.in).nextLine();
            if (color != null) {
                break;
            }
        }

        while (true) {
            System.out.print("is new : ");
            isNew = new Scanner(System.in).nextLine();
            if (isNew != null) {
                break;
            }
        }
        while (true) {
            System.out.print("Memory : ");
            memory = new Scanner(System.in).nextLine();
            if (memory != null) {
                break;
            }
        }
        while (true) {
            System.out.print("Price : ");
            price = new Scanner(System.in).nextLine();
            if (price != null) {
                break;
            }
        }
        return new Device(brand, color, isNew, memory, price);

    }

    public Book addBook() {
        Scanner scanner = new Scanner(System.in);
        String name;
        String description;
        String price;
        LocalDate createdAt;
        String authorName;

        System.out.println("китептин атын жазыныз : ");
        name = scanner.nextLine();

        System.out.println("описания калтырыныз : ");
        description = scanner.nextLine();

        System.out.println("баасын киргизиниз : ");
        price = scanner.nextLine();

        System.out.println("качан жуктолгон убактысы : " + LocalDate.now());//todo avtomat
        createdAt = LocalDate.now();

        System.out.println("атордун аты - жону : ");
        authorName = scanner.nextLine();

        return new Book(name,description,price,createdAt,authorName);

    }


}
