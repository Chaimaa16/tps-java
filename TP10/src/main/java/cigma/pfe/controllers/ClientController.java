package cigma.pfe.controllers;

import cigma.pfe.models.Client;
import cigma.pfe.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller("idCtrl")
public class ClientController {

    @Autowired
    private ClientService service ;

    public void save(Client c){
        service.save(c);
    }

    public ClientController() {
        System.out.println("creation bean controller");
    }


}
