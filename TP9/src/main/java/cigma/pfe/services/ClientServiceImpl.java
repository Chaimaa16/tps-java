package cigma.pfe.services;

import cigma.pfe.models.Client;
import cigma.pfe.repositories.ClientRepository;
import cigma.pfe.repositories.ClientRepositoryImpl;

import java.util.List;

public class ClientServiceImpl implements ClientService {
    private ClientRepository dao;
    public void setDao(ClientRepository dao) {
        this.dao = dao;
    }
    @Override
    public Client save(Client c) {
        return dao.save(c);
    }
    @Override
    public Client modify(Client c) {
        return dao.update(c);
    }

    public ClientServiceImpl(ClientRepository dao){
        this.dao=dao;
    }

    @Override
    public void removeById(long id) {
        dao.deleteById(id);
    }

    @Override
    public Client getById(long id) {
        return dao.findById(id);
    }

    @Override
    public List<Client> getAll() {
        return dao.findAll();
    }
}
