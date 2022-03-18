package cigma.pfe.repositories;

import cigma.pfe.models.Client;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class ClientRepositoryImpl implements ClientRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public Client save(Client client){
        entityManager.persist(client);
        return null ;
    }

    public ClientRepositoryImpl() {
        System.out.println("creation bean dao");
    }

    }