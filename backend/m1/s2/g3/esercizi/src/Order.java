import java.time.LocalDate;
import java.util.List;

public class Order {
    private static Long nextId = 1L;
    private Long id;
    private String status;
    private LocalDate orderDate;
    private LocalDate deliveryDate;
    private List<Product> lista;
    private Customer customer;


    public Order(String status, LocalDate orderDate, LocalDate deliveryDate, List<Product> lista, Customer customer) {
        this.id = nextId;
        nextId ++;
        this.status = status;
        this.orderDate = orderDate;
        this.deliveryDate = deliveryDate;
        this.lista = lista;
        this.customer = customer;
    }

    public static Long getNextId() {
        return nextId;
    }

    public Long getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public List<Product> getLista() {
        return lista;
    }

    public Customer getCustomer() {
        return customer;
    }


    @Override
    public String toString() {
        return String.format("Ordini  [status=%s, id=%d, orderDate=%s, deliveryDate=%s, lista=%s, customer=%s ]%n",status,id,orderDate,deliveryDate,lista,customer);
    }
}
