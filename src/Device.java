import java.math.BigDecimal;
import java.time.LocalDate;

public class Device extends Product{
    private String brand;
    private String color;
    private String isNew;
    private int memory;

    public Device() {
    }

    public Device(String brand, String color, String isNew, int memory) {
        this.brand = brand;
        this.color = color;
        this.isNew = isNew;
        this.memory = memory;
    }

    public Device(String name, String description, BigDecimal price, LocalDate createdAt, String brand, String color, String isNew, int memory) {
        super(name, description, price, createdAt);
        this.brand = brand;
        this.color = color;
        this.isNew = isNew;
        this.memory = memory;
    }
}
