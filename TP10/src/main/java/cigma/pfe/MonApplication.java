package cigma.pfe;


import cigma.pfe.controllers.ClientController;
import cigma.pfe.controllers.FactureController;
import cigma.pfe.models.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class MonApplication {
    public static void main(String[] args) {
        ApplicationContext context =new
                ClassPathXmlApplicationContext("spring.xml");
        ClientController ctrl = (ClientController)
                context.getBean("idCtrl");
        // Test save use case for three clients
        ctrl.save(new Client("MOSAB"));

        // Test modify use case for client with id==1
        //ctrl.modify(new Client(2L,"new Name"));
        // Test remove use case for client with id==1
        //ctrl.removeById(1L);
        // Test find use case for client with id==1
        /*Client found = ctrl.getById(2L);
        ctrl.getAll();
        FactureController fct = (FactureController) context.getBean("idCtrlF");
        fct.creates(new Facture(new Date(22/02/2001),20));
        fct.reads();
        fct.deletes(1);
        fct.updates(new Facture(new Date(17/02/1991),30));

        Client client=new Client("loli");
        List<Facture> factures=Arrays.asList(new Facture(2001,"fact1"),new Facture(1991,"fact2"));
        client.setFactures(factures);
        ctrl.save(client);*/
        Client client=new Client("LAYLOUCH");
        /*List<Promotion> promotions=Arrays.asList(new Promotion("remise 10%"),new Promotion("solde 40%"));
        client.setPromotions(promotions);
        ctrl.save(client);

        CarteFidelio carteFidelio=new CarteFidelio("A20011991");
        carteFidelio.setClient(client);
        client.setCarteFidelio(carteFidelio);
        ctrl.save(client);

        Facture facture=new Facture("200.0","fact1");
        List<Produit> produits=Arrays.asList(new Produit("pro1","20.0"),new Produit("pro2","30.0"));
        facture.setProduits(produits);
        ctrl.create(facture);

        List<Adresse> adresses=Arrays.asList(new Adresse("HY MY RCHID","CASA","MAROC"));
        client.setAdresse(adresses);
        ctrl.save(client);*/









    }
}