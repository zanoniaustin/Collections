/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Final;

import static kiss.API.*;
import java.awt.*;

public class Pong extends java.applet.Applet{
    
    TextArea ta = null;
    
    
    
    public void init(){
        Panel p = new Panel();
        
        //setLayout(new BorderLayout());
        
        
        ta = new TextArea();
        
        p.add(ta);
        add("Center", p);
        p = new Panel();
        
        add(new Button("One"));
        add(new Button("Two"));
        
        Choice c = new Choice();
        c.addItem("one");
        c.addItem("two");
        c.addItem("three");
        
        p.add(c);
        add("South", p);
    }
    
     public boolean action(Event e, String o) {
         String str = (String)o;
         ta.appendText(str + "\n");
         return false;
     }
    
    
    
    public static void main(String[] args) {
        Frame f = new Frame("Pong");
        Pong ex = new Pong();
        
        ex.init();
        
        f.add("Center", ex);
        f.pack();
        f.show();
    }
}
