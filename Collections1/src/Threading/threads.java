
package Threading;

import static kiss.API.*;

public class threads {
    
    void testOrders() {
        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order();
        Order order4 = new Order();
        order1.addOrder("Burger");
        order1.addOrder("Chips");
        order2.addOrder("Fries");
        order3.addOrder("Salad");
        order2.addOrder("Grilled cheese");
        order3.addOrder("Chili");
        order4.addOrder("Quesidilla");
        order4.addOrder("Milkshake");
        
        Name john = new Name("john", order1);
        Name susie = new Name("susie", order2);
        Name nathan = new Name("nathan", order4);
        
       
        
    }
    
}
