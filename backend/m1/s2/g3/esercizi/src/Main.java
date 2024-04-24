import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        List<Product> lista = new ArrayList<>();
        List<Order> ordini = new ArrayList<>();
        Product prodotto = new Product("mario","Books",105D);
        Product prodotto2 = new Product("MAESTRO","Books",89D);
        Product prodotto3 = new Product("Luca","baby",10D);
        lista.add(prodotto);
        lista.add(prodotto2);
        lista.add(prodotto3);
        lista.stream()
                .filter(el -> el.getCategory().equals("Books") && el.getPrice() > 100).forEach(System.out::println);

        Customer Lui = new Customer("Daniele",2);
        Customer Ferro = new Customer("Tiziano",2);

        Order ordine = new Order("forse arriva", LocalDate.of(2022,8,5),LocalDate.of(2024,4,24),List.of(prodotto3,prodotto2) ,Lui);
        Order ordine2 = new Order("arriva", LocalDate.of(2023,8,5),LocalDate.of(2024,2,24),List.of(prodotto) ,Ferro);
        ordini.add(ordine);
        ordini.add(ordine2);
        var a = ordini.stream()
                .filter(order -> order.getLista().stream().anyMatch(product -> product.getCategory())).toList();
        a.forEach(el -> System.out.println(el));


    }

    }
