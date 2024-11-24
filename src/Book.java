import java.time.LocalDate;

public class Book extends Product{
    private String authorFullName;
    private static int a=getCount();

    public Book() {
    }

    public Book(String name, String description, String price, LocalDate createdAt, String authorFullName) {
        super(name, description, price, createdAt);
        this.authorFullName = authorFullName;
        super.setId(a++);
        super.setCount(a++);
    }

    public String getAuthorFullName() {
        return authorFullName;
    }

    public void setAuthorFullName(String authorFullName) {
        this.authorFullName = authorFullName;
    }
}
