package cigma.pfe.models;

import lombok.*;
import javax.persistence.*;
import java.util.List;

@Data
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Entity
public class Client {
   @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private long id;
    private String name;


    public Client(String name) {
     this.name = name;
    }

    public Client(){

    }


}

