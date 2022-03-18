package cigma.pfe;


import cigma.pfe.controllers.ClientController;

import cigma.pfe.models.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class MonApplication {
    public static void main(String[] args) {
        ApplicationContext context =new
                ClassPathXmlApplicationContext("spring.xml");
        ClientController ctrl = (ClientController) context.getBean("idCtrl");
        // Test save use case for three clients

        Client client=new Client("layla");
        Client client1=new Client("AYEG");
        Client client2=new Client("ZAYNA");
        // Test1 => save 3 Clients
        ctrl.save(client);
        ctrl.save(client1);
        ctrl.save(client2);
        // Test2 => getAll Clients before modify and remove
        //ctrl.getAll().stream().forEach(i-> System.out.println(i));
        // Test3 => getOne Client service
        //System.out.println(ctrl.getOne(1));
        // Test4 => modify Client service
        //client1.setName("Mossy");
        //ctrl.modify(client1);
        //Test5 => remove Client service
        //ctrl.remove(2);
        // Test getAll Client after modify and remove
        //ctrl.getAll().stream().forEach(i-> System.out.println(i));




    }
}