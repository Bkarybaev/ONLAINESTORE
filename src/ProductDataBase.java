import java.util.Arrays;

public class ProductDataBase {
private Device[] devices = new Device[0];
private Book[] books = new Book[0];

public ProductDataBase(){}


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

    public void addDevise(Device devise){
    devices = Arrays.copyOf(devices, devices.length + 1);
    devices[devices.length - 1] = devise;
    }
}
