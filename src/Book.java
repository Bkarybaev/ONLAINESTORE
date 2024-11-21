import java.math.BigDecimal;
import java.time.LocalDate;

public class Book extends Product{
    private String authorFullName;

    public Book() {
    }

    public Book(String name, String description, String price, LocalDate createdAt, String authorFullName) {
        super(name, description, price, createdAt);
        this.authorFullName = authorFullName;
    }
}
