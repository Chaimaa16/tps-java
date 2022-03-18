package cigma.pfe.repositories;

import cigma.pfe.models.Facture;
import cigma.pfe.services.FactureService;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class FactureRepositoryImpl implements FactureRepository{
    FactureService factory;
    EntityManagerFactory em = Persistence.createEntityManagerFactory("unit_clients");
    EntityManager er = em.createEntityManager();
    @Override
    public Facture create(Facture f) {
        er.getTransaction().begin();
        er.persist(f);
        er.getTransaction().commit();
        return  null;
    }

    @Override
    public List<Facture> read() {
        List<Facture> ListF = er.createQuery("select e from TFactures e").getResultList();
        return ListF;
    }

    @Override
    public void deleter(Long id) {
        er.getTransaction().begin();
        Facture fo = er.find(Facture.class,id);
        er.remove(fo);
        er.getTransaction().commit();

    }

    @Override
    public Facture update(Facture f) {
        er.getTransaction().begin();
        Facture fi = er.find(Facture.class,f.getId());
        fi.setAmount(f.getAmount());
        er.persist(fi);
        er.getTransaction().commit();
        return null;
    }
}
