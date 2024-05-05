package data;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class Base {
    @Id
    @GeneratedValue
    private long id;



    @Override
    public String toString() {
        return "Base{" +
                "id=" + id +
                '}';
    }

    public Base() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
