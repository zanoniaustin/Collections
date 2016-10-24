/*
    Created By: Austin Zanoni
    Created: 10/10/2016
    
    
    This program uses different types of collections and shows how different
    they are and different ways to use them.

*/
package collections1;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import static kiss.API.*;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
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
        assert uniqueNames.contains("john smith") == true;
        uniqueNames.add("john smith");
        println(uniqueNames);
        assert (uniqueNames.size() == 2) == false;
        assert uniqueNames.size() == 1;
        
        uniqueNames.add("john tom");
        assert uniqueNames.size() == 2;
        
        
        uniqueNames.add("susan peak");
        assert uniqueNames.size() == 3;
        uniqueNames.add("John Tom");
        assert uniqueNames.size() == 4;
        uniqueNames.add("john tom");
        assert uniqueNames.size() == 4;
        
        try(Close out = outExpect("john smith", EOL, "susan peak", EOL, "john tom", 
                                  EOL, "John Tom", EOL)){
            for (String uniqueName : uniqueNames){
                println(uniqueName);
            }
       }
        uniqueNames.remove("John Tom");
        assert uniqueNames.size() == 3;
        try(Close out = outExpect("john smith", EOL, "susan peak", EOL, "john tom", 
                                  EOL)){
            for (String uniqueName : uniqueNames){
                println(uniqueName);
            }
       }
    }
    
    void testTreeSet(){
        Set<Integer> numbers = new TreeSet<Integer>();
        numbers.add(1);
        assert numbers.size() == 1;
        numbers.add(1);
        assert numbers.size() == 1;
        numbers.add(2);
        assert numbers.size() == 2;
        numbers.add(7);
        assert numbers.size() == 3;
        numbers.add(0);
        
        try(Close out = outExpect(0, EOL, 1, EOL, 2, EOL, 7, EOL)){
            for(Integer number : numbers)
                println(number);
        }
        
        assert numbers.size() == 4;
        numbers.add(10);
        assert numbers.size() == 5;
        numbers.add(1);
        assert numbers.size() == 5;
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
        
       try(Close out = outExpect("Betty:B", EOL)){
            grades.forEach((key, value) -> println(key + ":" + value));
       }
        
        
        
        // So I guess that you can't have someone with the same name but different
        // grade twice.
        
        grades.put("Steven", 'C');
        assert grades.size() == 2;
        grades.put("Betty G", 'F');
        assert grades.size() == 3;
        
        try(Close out = outExpect("Betty G:F", EOL, "Betty:B", EOL, "Steven:C", EOL)){
            grades.forEach((key, value) -> println(key + ":" + value));
       }
       
        
        assert grades.get("Steven") == 'C';
    }
    
    void testList(){
        List<String> names = new LinkedList<String>();
        names.add("Betty");
        assert names.size() == 1;
        names.add("Steven");
        assert names.size() == 2;
        names.add("Robert");
        assert names.size() == 3;
        names.add("Betty");
        assert names.size() == 4;
        
        // HEY! lists actually allows multiply occuring same values
        
        try(Close out = outExpect("Betty", EOL, "Steven", EOL, "Robert", EOL, 
                                  "Betty", EOL)){
            for(String name : names)
                println(name);
        }
        
        names.add(3, "John");
        assert names.size() == 5;
        try(Close out = outExpect("Betty", EOL, "Steven", EOL, "Robert", EOL, 
                                  "John", EOL, "Betty", EOL)){
            for(String name : names)
                println(name);
        }
        
        names.remove("Betty");
        
        assert names.size() == 4;
        
        try(Close out = outExpect("Steven", EOL, "Robert", EOL, "John", EOL, 
                                  "Betty", EOL)){
            for(String name : names)
                println(name);
        }
    }
}
