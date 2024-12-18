import java.math.BigDecimal;
import java.time.LocalDate;

public abstract class Product {
    private String name;
    private String description;
    private String price;
    private LocalDate createdAt;
    private long id;
    private static int count = 1;

    public Product() {
    }

    public Product(String name, String description, String price, LocalDate createdAt) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.createdAt = createdAt;
        this.id = count++;
    }

    public Product(String name, String description,LocalDate createdAt) {
        this.name = name;
        this.description = description;
        this.createdAt = createdAt;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public static int getCount() {
        return count;
    }

    public void setCount(int count) {
        Product.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }
}
