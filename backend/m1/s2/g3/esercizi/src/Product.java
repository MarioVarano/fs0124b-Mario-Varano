public class Product {
    public static Long getNextId() {
        return nextId;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public Double getPrice() {
        return price;
    }

    private static Long nextId=1l;
    private Long id;
    private String name;
    private String category;
    private Double price;


    public Product(String name, String category, Double price) {
        this.id = nextId;
        nextId ++;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("Prodotti  [nome=%s, id=%d, category=%s, price=%f]%n",name, id, category, price);
    }
}
