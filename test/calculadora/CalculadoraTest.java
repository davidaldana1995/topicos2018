/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
@RunWith(value = Parameterized.class)
public class CalculadoraTest {
    private Calculadora calc;
    private int x,y,esperado;
    private String var, var2;

    public CalculadoraTest(int x, int y, int esperado) {
        this.x = x;
        this.y = y;
        this.esperado = esperado;
    }

  
    
    @Before
    public void Before() {
        System.out.println("Antes()");
         calc = new Calculadora();
    }
  
    @After
    public void After() {
       System.out.println("Despues()");
       calc.clear();
    }
    /**
     * Test of suma method, of class Calculadora.
     */
    @Parameters
    public static Iterable<Object[]> getData(){
        return Arrays.asList(new Object[][]{
            {3,1,4},{4,3,7},{4,4,8},{10,20,30}  
        });
    }

    @Test 
    public void testSuma() {
        System.out.println("suma");
        Calculadora instance = new Calculadora();
        int result = instance.suma(x, y);
        assertEquals(esperado, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of resta method, of class Calculadora.
     */
    @Test
    public void testResta() {
        System.out.println("resta");
        int a = 2;
        int b = 1;
        Calculadora instance = new Calculadora();
        int expResult = 1;
        int result = instance.resta(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of div method, of class Calculadora.
     */
    @Test
    public void testDiv() {
        System.out.println("div");
        int a = 6;
        int b = 3;
        Calculadora instance = new Calculadora();
        int expResult = 2;
        int result = instance.div(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class Calculadora.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        int v = 0;
        Calculadora instance = new Calculadora();
        int expResult = 0;
        int result = instance.add(v);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of sub method, of class Calculadora.
     */
    @Test
    public void testSub() {
        System.out.println("sub");
        int v = 0;
        Calculadora instance = new Calculadora();
        int expResult = 0;
        int result = instance.sub(v);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of ans method, of class Calculadora.
     */
    @Test
    public void testAns() {
        System.out.println("ans");
        Calculadora instance = new Calculadora();
        int expResult = 0;
        int result = instance.ans();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of clear method, of class Calculadora.
     */
    @Test
    public void testClear() {
        System.out.println("clear");
        Calculadora instance = new Calculadora();
        instance.clear();
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of optima method, of class Calculadora.
     */
    @Test
    public void testOptima() {
        System.out.println("optima");
        Calculadora instance = new Calculadora();
        instance.optima();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testcompararString(){
        var="topicos";
        var2="topicos";
        assertEquals(var, var2);
    }
    @Test
    public void testBoolean(){
        System.out.print("boolean");
        float a=(float) 2.45;
        float b=(float)3.45;
        int c=(int) 10 ;
        int d=(int) 6 ;
        Calculadora I = new Calculadora();
        int observado= I.resta(10, 6);
        int esperado= 4;
        assertTrue(a < b);
        assertFalse(a>b);
        assertTrue(observado==esperado);
        assertFalse(observado<esperado);
    }
    
    @Test
    public void testdeterminarnull(){
        var="topicos";
        calc=new Calculadora();
        assertNotNull(var);
        assertNull(var2);
        assertNotNull(calc);
    }
    
    @Test 
    public void testidentidad(){
        Calculadora a= new Calculadora();
        Calculadora b= new Calculadora();
        var="topicos";
        var2="topicos";
        assertNotSame(a, b);
        assertSame(var, var2);
    }
    
    @Test 
    public void testigualarmatricez(){
        int [] h = {2,3,4,5};
        int [] g = {2,3,4,5};
        assertArrayEquals(h, g);
    }
}
