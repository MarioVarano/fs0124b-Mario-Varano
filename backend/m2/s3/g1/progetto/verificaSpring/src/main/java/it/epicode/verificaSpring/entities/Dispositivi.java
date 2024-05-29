package it.epicode.verificaSpring.entities;


import it.epicode.verificaSpring.enums.StatoDispositivo;
import it.epicode.verificaSpring.enums.TipoDispositivo;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.*;


@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "dispositivi")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(setterPrefix = "with")
public class Dispositivi extends Base{
    @ManyToOne
    @JoinColumn(name = "dipendente_id")
    private Dipendenti dipendenti;
    private TipoDispositivo tipo;
    private StatoDispositivo stato;


    public Dispositivi(TipoDispositivo tipo, StatoDispositivo stato) {
        this.tipo = tipo;
        this.stato = stato;
    }
}
