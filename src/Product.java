import java.math.BigDecimal;
import java.time.LocalDate;

public abstract class Product {
    private String name;
    private String description;
    private BigDecimal price;
    private LocalDate createdAt;

    public Product() {
    }

    public Product(String name, String description, BigDecimal price, LocalDate createdAt) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.createdAt = createdAt;
    }

    public Product(String name, String description,LocalDate createdAt) {
        this.name = name;
        this.description = description;
        this.createdAt = createdAt;
    }
}
