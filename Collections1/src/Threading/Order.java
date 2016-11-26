
package Threading;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Order {
    private LinkedList<String> data = new LinkedList<>();
    
    public synchronized void addOrder(String order){
        data.add(order);
    }
    
    public synchronized List<String> getOrder(){
        return new ArrayList<>(data);
    }
}
