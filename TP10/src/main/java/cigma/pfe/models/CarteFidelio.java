package cigma.pfe.models;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Data
@Entity
@ToString
public class CarteFidelio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String code;
    @OneToOne
    @JoinColumn(name = "client_id")
    private Client client;
    public CarteFidelio(String code){
        this.code=code;
    }
}
