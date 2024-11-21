import java.math.BigDecimal;
import java.time.LocalDate;

public class Device extends Product{
    private String brand;
    private String color;
    private String isNew;
    private String memory;
    private String price;

    public Device() {
    }

    public Device(String brand, String color, String isNew, String memory,String price) {
        this.brand = brand;
        this.color = color;
        this.isNew = isNew;
        this.memory = memory;
        this.price = price;
    }

    public Device(String name, String description, String price, LocalDate createdAt, String brand, String color, String isNew, String memory) {
        super(name, description, price, createdAt);
        this.brand = brand;
        this.color = color;
        this.isNew = isNew;
        this.memory = memory;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getIsNew() {
        return isNew;
    }

    public void setIsNew(String isNew) {
        this.isNew = isNew;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
