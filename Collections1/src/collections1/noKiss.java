package collections1;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.HashMap;

public class noKiss {

    public int SameNameHashSet(String name){
        Set<String> Names;
        Names = new HashSet<>();
        Names.add(name);
        Names.add(name);
        return Names.size();
    }
    
    public int TreeSet(int a, int b, int c, int d) {
        Set<Integer> numbers;
        numbers = new TreeSet<>();
        numbers.add(a);
        numbers.add(a);
        numbers.add(b);
        numbers.add(c);
        numbers.add(a);
        numbers.add(d);
        return numbers.size();
    }
    
    public int HashMap(String name1, Character grade1, String name2, Character grade2,
            Character grade3) {
        Map<String, Character> grades;
        grades = new HashMap<>();
        grades.put(name1, grade1);
        grades.put(name1, grade1);
        grades.put(name2, grade2);
        grades.put(name1, grade3);
        grades.put(name2, grade3);
        return grades.size();
    }
    
    public int LinkedList(String name1, String name2, String name3) {
        List<String> names;
        names = new LinkedList<>();
        names.add(name1);
        names.add(name1);
        names.add(name2);
        names.add(name3);
        names.add(name1);
        names.add(name2);
        names.add(name3);
        return names.size();
    }
    
    
    
    
    
    public static void main(String[] args) {
        
       

        // Hash Set
        Set<String> hsetNames;
        hsetNames = new HashSet<>();
        hsetNames.add("john smith");
        hsetNames.add("john smith");
        System.out.println(hsetNames);
        
        hsetNames.add("john tom");
        
        hsetNames.add("susan peak");
        hsetNames.add("John Tom");
        hsetNames.add("john tom");
        System.out.println(hsetNames);
        
        
        // Tree Set
        Set<Integer> numbers;
        numbers = new TreeSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(7);
        numbers.add(0);
        
        numbers.add(10);
        numbers.add(1);
        numbers.remove(1);
        
        
        // Hash Map
        Map<String, Character> grades;
        grades = new HashMap<>();
        
        grades.put("Betty", 'A');
        grades.put("Betty", 'A');
        grades.put("Betty", 'B');
        
        grades.put("Steven", 'C');
        grades.put("Betty G", 'F');
        
        // Linked List
        List<String> names;
        names = new LinkedList<>();
        names.add("Betty");
        names.add("Steven");
        names.add("Robert");
        names.add("Betty");
        
        names.add("John");
        
        names.remove("Betty");
    }

}
