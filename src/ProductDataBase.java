import java.math.BigDecimal;
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
    String brand;
    String color;
    String isNew;
    String memory;
    BigDecimal price;
    public Device addDevise(Scanner scanner) {
            System.out.print("Brand Devise : ");
            brand = scanner.nextLine();

            System.out.print("Color : ");
            color = scanner.nextLine();

            System.out.print("is new : ");
            isNew = scanner.nextLine();

            System.out.print("Memory : ");
            memory = scanner.nextLine();

            System.out.print("Price : ");
            price = new Scanner(System.in).nextBigDecimal();



        return new Device(brand, color, isNew, memory, price);

    }


}
