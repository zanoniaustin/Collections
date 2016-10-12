/*
    Created By: Austin Zanoni
    Created: 10/10/2016
    
    
    This program uses different types of collections and shows how different
    they are and different ways to use them.

*/
package collections1;

import java.util.HashMap;
import static kiss.API.*;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;


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
        
        try(Close out = outExpect("john smith", EOL, "susan peak", EOL, "john tom", 
                                    EOL, "John Tom", EOL)){
            for (String uniqueName : uniqueNames){
                println(uniqueName);
            }
       }
    }
    
    void testTreeSet(){
        Set<Integer> numbers = new TreeSet<Integer>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(7);
        numbers.add(0);
        
        assert numbers.size() == 4;
        numbers.add(10);
        numbers.add(1);
        numbers.remove(1);
        assert numbers.size() == 4;
        
        try(Close out = outExpect(0, EOL, 2, EOL, 7, EOL, 10, EOL)){
            for(Integer number : numbers)
                println(number);
        }
    }
    
    void testHashMap(){
        Map<String, Character> grades = new HashMap<>();
        grades.put("Betty", 'A');
        assert grades.size() == 1;
        grades.put("Betty", 'A');
        assert (grades.size() == 2) == false;
        grades.put("Betty", 'B');
        assert grades.size() == 1;
        
        // So I guess that you can't have someone with the same name but different
        // grade twice.
        
        grades.put("Steven", 'C');
        assert grades.size() == 2;
        grades.put("Betty G", 'F');
        assert grades.size() == 3;
        
        assert grades.get("Steven") == 'C';
    }
    
    
  
}
