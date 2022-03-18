package cigma.pfe.controllers;

import cigma.pfe.models.Client;
import cigma.pfe.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import sun.tools.jar.SignatureFile;

import java.util.List;

@Controller("idCtrl")
public class ClientController {

    @Autowired
    ClientService service ;

    public Client save(Client c){
        return service.save(c);
    }
    public Client modify(Client c){
        return service.modify(c);
    }
    public void remove(long idc){
        service.remove(idc);
    }
    public Client getOne(long idc){
        return service.getOne(idc);
    }
    public List<Client> getAll(){
        return service.getAll();
    }
    public List<Client> Find(String name){
        return service.Find(name);
    }
}
