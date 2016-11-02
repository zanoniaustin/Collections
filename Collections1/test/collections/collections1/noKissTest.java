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
    
}
