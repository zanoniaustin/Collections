/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author austi
 */
public class noKissTest {
    
    public noKissTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class noKiss.
     */
    @Test
    public void testHashSet() {
        System.out.println("No repeat names in hash set.");
        String name = "john smith";
        noKiss instance = new noKiss();
        int expected = 1;
        int result = instance.SameNameHashSet(name);
        assertEquals(expected, result);
    }
    
    @Test
    public void TestTreeSet() {
        System.out.println("Tree set no repeating numebrs.");
        int a =1, b = 2, c = 7, d = 10;
        noKiss instance = new noKiss();
        int expected = 4;
        int result = instance.TreeSet(a, b, c, d);
        assertEquals(expected, result);
    }
    
    @Test
    public void TestHashMap() {
        System.out.println("Hash Map no repeating names.");
        char grade1 = 'A', grade2 = 'B', grade3 = 'F';
        String name1 = "Betty", name2 = "John";
        noKiss instance = new noKiss();
        int expected = 2;
        int result = instance.HashMap(name1, grade1, name2, grade2, grade3);
        assertEquals(expected, result);
    }
    
    @Test
    public void TestLinkedList() {
        System.out.println("Linked List allows repeating names");
        String name1 = "John", name2 = "Betty", name3 = "Jose";
        noKiss instance = new noKiss();
        int expected = 7;
        int result = instance.LinkedList(name1, name2, name3);
        assertEquals(expected, result);
    }
    
}
