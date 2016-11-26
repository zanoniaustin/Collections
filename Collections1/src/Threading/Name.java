
package Threading;

import static kiss.API.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Name {
    String name;
    Order order;
    volatile boolean cooked = false;
    
    class Action extends Thread {
        public void run() {
            while (!cooked) {
                pause(random(0, 3000) * .001);
                println(name, "ordered", order.getOrder());
            }
        }
    }
    Action action;
    
    void cooked() {
        cooked = true;
        try {
            action.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Name.class.getName()).log(Level.SEVERE, null, ex);
        }
        println(name, "'s order done.");
    }
    
    Name (String _name, Order _order) {
        name = _name;
        order = _order;
        action = new Action();
        action.start();
    }
}
