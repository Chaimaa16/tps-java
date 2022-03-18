package cigma.pfe.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data
@ToString
@AllArgsConstructor
public class Adresse {
    @Id
    @GeneratedValue
    private long id;
    private String avenue;
    private String ville;
    private String pays;

    @OneToOne()
    @JoinColumn(name = "client_id")
    private Client client;

    public Adresse(){
    }
    public Adresse(String avenue,String ville,String pays){
        this.avenue=avenue;
        this.ville=ville;
        this.pays=pays;
    }


}
