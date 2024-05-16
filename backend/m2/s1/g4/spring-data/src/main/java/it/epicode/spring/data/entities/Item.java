package it.epicode.spring.data.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Item {
	@Id
	@GeneratedValue
	private Long id;

	protected int calories;
	protected double price;

	public Item(int calories, double price) {
		this.calories = calories;
		this.price = price;
	}

}
