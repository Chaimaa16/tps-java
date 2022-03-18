package cigma.pfe.controllers;

import cigma.pfe.models.Client;
import cigma.pfe.models.Facture;
import cigma.pfe.services.ClientService;
import cigma.pfe.services.ClientServiceImpl;

import javax.xml.ws.Service;
import java.util.List;

public class ClientController {
    private ClientService service ;
    public void save(Client c){
        service.save(c);
    }
    public void modify(Client c){
        service.modify(c);
    }

    public ClientController(ClientService service)
    {
        this.service = service;
    }
    public void removeById(long id){
        service.removeById(id);
    }
    public Client getById(long id){
        return service.getById(id);
    }
    public List<Client> getAll(){
        return service.getAll();
    }


}
