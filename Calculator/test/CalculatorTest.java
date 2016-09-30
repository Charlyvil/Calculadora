/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.JButton;
import javax.swing.JTextField;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Diana_G
 */
public class CalculatorTest {
    
    public CalculatorTest() {
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
     * Test of funSum method, of class Calculator.
     */
    @Test
    public void testFunSum() {
        System.out.println("funSum");
        double a = 2;
        double b =3;
        Calculator instance = new Calculator();
        double expResult = 5; 
        double result = instance.funSum(a,b);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(expResult, result, 5.0);
    }

    /**
     * Test of funRes method, of class Calculator.
     */
    @Test
    public void testFunRes() {
        System.out.println("funRes");
        Calculator instance = new Calculator();
        instance.funRes();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of funDiv method, of class Calculator.
     */
    @Test
    public void testFunDiv() {
        System.out.println("funDiv");
        Calculator instance = new Calculator();
        instance.funDiv();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of funMul method, of class Calculator.
     */
    @Test
    public void testFunMul() {
        System.out.println("funMul");
        Calculator instance = new Calculator();
        instance.funMul();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of funSen method, of class Calculator.
     */
    @Test
    public void testFunSen() {
        System.out.println("funSen");
        Calculator instance = new Calculator();
        instance.funSen();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of funCos method, of class Calculator.
     */
    @Test
    public void testFunCos() {
        System.out.println("funCos");
        Calculator instance = new Calculator();
        instance.funCos();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of funMod method, of class Calculator.
     */
    @Test
    public void testFunMod() {
        System.out.println("funMod");
        Calculator instance = new Calculator();
        instance.funMod();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    /**
     * Test of funTan method, of class Calculator.
     */
    @Test
    public void testFunTan() {
        System.out.println("funTan");
        double valor1 = -2;
        int variable = 0;
        Calculator instance = new Calculator();
        double expResult = 2.18503986; 
        double result = instance.funSum(valor1,variable);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(expResult, result, 2.18503986);
    }
    
    /**
     * Test of funTan method, of class Calculator.
     */
    @Test
    public void testFunCot() {
        System.out.println("funCot");
        double valor1 = -2;
        int variable = 1;
        Calculator instance = new Calculator();
        double expResult = -28.65370834; 
        double result = instance.funSum(valor1,variable);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(expResult, result, 0);
    }
    
    
    /**
     * Test of funTan method, of class Calculator.
     */
    @Test
    public void testFunSec() {
        System.out.println("funSec");
        double valor1 = -2;
        int variable = 1;
        Calculator instance = new Calculator();
        double expResult = 1.000609544; 
        double result = instance.funSum(valor1,variable);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(expResult, result, 1.000609544);
    }
    
    /**
     * Test of borrarPantalla method, of class Calculator.
     */
    @Test
    public void testBorrarPantalla() {
        System.out.println("borrarPantalla");
        Calculator instance = new Calculator();
        instance.borrarPantalla();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of borrarValores method, of class Calculator.
     */
    @Test
    public void testBorrarValores() {
        System.out.println("borrarValores");
        Calculator instance = new Calculator();
        instance.borrarValores();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of extValores method, of class Calculator.
     */
    @Test
    public void testExtValores() {
        System.out.println("extValores");
        String textoOperacion = "";
        Calculator instance = new Calculator();
        instance.extValores(textoOperacion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of extValor method, of class Calculator.
     */
    @Test
    public void testExtValor() {
        System.out.println("extValor");
        String textoOperacion = "";
        Calculator instance = new Calculator();
        instance.extValor(textoOperacion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verPantalla method, of class Calculator.
     */
    @Test
    public void testVerPantalla() {
        System.out.println("verPantalla");
        Calculator instance = new Calculator();
        JTextField expResult = null;
        JTextField result = instance.verPantalla();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of conPantalla method, of class Calculator.
     */
    @Test
    public void testConPantalla() {
        System.out.println("conPantalla");
        JButton botonNumero = null;
        Calculator instance = new Calculator();
        instance.conPantalla(botonNumero);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Calculator.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Calculator.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
