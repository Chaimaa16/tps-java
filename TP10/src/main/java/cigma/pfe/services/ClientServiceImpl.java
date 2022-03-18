package cigma.pfe.services;

import cigma.pfe.models.Client;
import cigma.pfe.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository dao;

    public ClientServiceImpl (ClientRepository dao) {
        this.dao =dao;
    }

    @Override
    public Client save(Client client) {
        dao.save(client);
        return null ;
    }
}