/*
    Created By: Austin Zanoni
    Created: 10/10/2016
    
    
    This program uses different types of collections and shows how different
    they are and different ways to use them.

*/
package collections1;

import static kiss.API.*;
import java.util.HashSet;
import java.util.Set;


public class Collections1 {

    void testProgram(){
        int x = 0;
        assert x == 0;
    }     
    
    void testHashSet() {
        
        // Showing that sets don't restore another value if there is a equal 
        // value that is already in the set.
        
        Set<String> uniqueNames = new HashSet<String>();
        uniqueNames.add("john smith");
        uniqueNames.add("john smith");
        println(uniqueNames);
        assert (uniqueNames.size() == 2) == false;
        assert uniqueNames.size() == 1;
        
        uniqueNames.add("john tom");
        assert uniqueNames.size() == 2;
        
        uniqueNames.add("susan peak");
        uniqueNames.add("John Tom");
        uniqueNames.add("john tom");
        assert uniqueNames.size() == 4;
        
        try(Close out = outExpect("john smith", EOL, "susan peak", EOL, "john tom", EOL, "John Tom", EOL)){
            for (String uniqueName : uniqueNames){
                println(uniqueName);
            }
       }
    }
    
    
    
}
