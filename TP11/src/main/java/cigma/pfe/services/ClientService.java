package cigma.pfe.services;

import cigma.pfe.models.Client;

import java.util.List;

public interface ClientService {
    Client save(Client c);
   Client modify(Client c);
    void remove(long id);
    Client getOne(long id);
    List<Client> getAll();
    List<Client> Find(String c);

}
