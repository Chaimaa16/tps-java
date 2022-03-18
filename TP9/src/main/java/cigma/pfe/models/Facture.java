package cigma.pfe.models;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@ToString
public class Facture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private double amount;
    private String description;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @ManyToMany(cascade = {CascadeType.PERSIST})
    @JoinTable(name = "my_join_table_Facture_Produit",joinColumns = @JoinColumn(name = "Facture_fk",referencedColumnName = "id" ),
            inverseJoinColumns = @JoinColumn(name="Produit_fk",referencedColumnName="id"))
    private List<Produit> produits;
    public Facture(){

    }
    public Facture(double amount, String description){
        this.amount=    amount;
        this.description=description;

    }






}
