public class Customer {
    private static Long nextId = 1L;
    private Long id;
    private String name;
    private Integer tier;

    public Customer( String name, Integer tier) {
        this.id = nextId;
        nextId ++;
        this.name = name;
        this.tier = tier;
    }

    @Override
    public String toString() {
        return String.format("Customer  [nome=%s, id=%d, tier=%d]%n",name, id, tier);
    }
}
