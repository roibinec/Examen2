/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.test;

import java.time.LocalDateTime;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Roibin
 */
public class AguinaldoTest {
    
    public AguinaldoTest() {
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
     * Este metodo testea el calculo de aguinaldo de uno de los limites en este caso el inferior
     * calculando el calculo de aguinaldo por un solo mes 
     */
    @Test
    public void testFindbonusLimiteInferior() {
        System.out.println("findbonus");
        LocalDateTime startDate = LocalDateTime.of(2021,12,01,10,30);
        LocalDateTime endDate = LocalDateTime.of(2021,12,31,10,30);
        float amount = 1000000;
        float expResult = 83333.3359375F;
        float result = Aguinaldo.findbonus(startDate, endDate, amount);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Este metodo testea el calculo de aguinaldo de uno de los limites en este caso el inferior
     * calculando el calculo de aguinaldo por un solo mes 
     */
    @Test
    public void testBonusLimiteInferior() {
        System.out.println("bonus");
        long moth = 01;
        float amount = 1000000;
        float expResult = 83333.3359375F;
        float result = Aguinaldo.bonus(moth, amount);
        assertEquals(expResult, result, 0.0);
    }
//---------------------------------------------------------------------------------------------------//
    /**
     * Este metodo testea el calculo de aguinaldo de uno de los limites en este caso el superior
     * calculando el calculo de aguinaldo para 12 meses 
     */
    @Test
    public void testFindbonusLimiteSuperior() {
        System.out.println("findbonus");
        LocalDateTime startDate = LocalDateTime.of(2021,12,01,10,30);
        LocalDateTime endDate = LocalDateTime.of(2022,11,30,10,30);
        float amount = 1000000;
        float expResult = 1000000;
        float result = Aguinaldo.findbonus(startDate, endDate, amount);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Este metodo testea el calculo de aguinaldo de uno de los limites en este caso el inferior
     * calculando el calculo de aguinaldo por un solo mes 
     */
    @Test
    public void testBonusLimiteSuperior() {
        System.out.println("bonus");
        long moth = 12;
        float amount = 1000000;
        float expResult = 1000000;
        float result = Aguinaldo.bonus(moth, amount);
        assertEquals(expResult, result, 0.0);
    }
    //---------------------------------------------------------------------------------------------------//
    /**
     * Este metodo testea el calculo de aguinaldo de uno de los limites en este caso el inferior -1
     * calculando el calculo de aguinaldo para 0 meses 
     */
    @Test
    public void testFindbonusLimiteInferiorError() {
        System.out.println("findbonus");
        LocalDateTime startDate = LocalDateTime.of(2021,12,01,10,30);
        LocalDateTime endDate = LocalDateTime.of(2021,12,01,10,30);
        float amount = 1000000;
        float expResult = 83333.336F ;
        float result = Aguinaldo.findbonus(startDate, endDate, amount);
        assertEquals(expResult, result, 0.0);
    }
    /**
     * Este metodo testea el calculo de aguinaldo de uno de los limites en este caso el inferior -1
     * calculando el calculo de aguinaldo para 0 meses 
     */
    public void testBonusLimiteInferiorError() {
        System.out.println("bonus");
        long moth = 0;
        float amount = 1000000;
        float expResult = 0;
        float result = Aguinaldo.bonus(moth, amount);
        assertEquals(expResult, result, 0.0);
    }
    //---------------------------------------------------------------------------------------------------//
    /**
     * Este metodo testea el calculo de aguinaldo de uno de los limites en este caso el superior +1
     * calculando el calculo de aguinaldo para 13 meses 
     */
    @Test
    public void testFindbonusLimiteSuperiorError() {
        System.out.println("findbonus");
        LocalDateTime startDate = LocalDateTime.of(2021,12,01,10,30);
        LocalDateTime endDate = LocalDateTime.of(2022,12,31,10,30);
        float amount = 1000000;
        float expResult = 1083333.4F ;
        float result = Aguinaldo.findbonus(startDate, endDate, amount);
        assertEquals(expResult, result, 0);
    }
    /**
     * Este metodo testea el calculo de aguinaldo de uno de los limites en este caso el superior +1
     * calculando el calculo de aguinaldo para 13 meses 
     */
    public void testBonusLimiteSuperiorError() {
        System.out.println("bonus");
        long moth = 13;
        float amount = 1000000;
        float expResult = 0;
        float result = Aguinaldo.bonus(moth, amount);
        assertEquals(expResult, result, 0.0);
    }
    //---------------------------------------------------------------------------------------------------//
    /**
     * Este metodo testea el calculo de aguinaldo para un salario minimo
     * calculando el aguinaldo para 12 meses con un salario de 300.000
     */
    @Test
    public void testFindbonusSalarioMinimo() {
        System.out.println("findbonus");
        LocalDateTime startDate = LocalDateTime.of(2021,12,01,10,30);
        LocalDateTime endDate = LocalDateTime.of(2022,11,30,10,30);
        float amount = 299999;
        float expResult = -2;
        float result = Aguinaldo.findbonus(startDate, endDate, amount);
        assertEquals(expResult, result, 0);
    }
    /**
     * Este metodo testea el calculo de aguinaldo de uno de los limites en este caso el superior +1
     * calculando el calculo de aguinaldo para 13 meses 
     */
    public void testBonusSalarioMinimo() {
        System.out.println("bonus");
        long moth = 12;
        float amount = 300000;
        float expResult = 300000;
        float result = Aguinaldo.bonus(moth, amount);
        assertEquals(expResult, result, 0.0);
    }
    //---------------------------------------------------------------------------------------------------//
    /**
     * Este metodo testea el calculo de aguinaldo para menos de un salario minimo
     * calculando el aguinaldo para 12 meses con un salario de 299.999
     */
    @Test
    public void testFindbonusMenosSalarioMinimo() {
        System.out.println("findbonus");
        LocalDateTime startDate = LocalDateTime.of(2021,12,01,10,30);
        LocalDateTime endDate = LocalDateTime.of(2022,11,30,10,30);
        float amount = 299999;
        float expResult = -2;
        float result = Aguinaldo.findbonus(startDate, endDate, amount);
        assertEquals(expResult, result, 0);
    }
    /**
     * Este metodo testea el calculo de aguinaldo para menos de un salario minimo
     * calculando el aguinaldo para 12 meses con un salario de 299.999
     */
    public void testBonusMenosSalarioMinimo() {
        System.out.println("bonus");
        long moth = 12;
        float amount = 299999;
        float expResult = -2;
        float result = Aguinaldo.bonus(moth, amount);
        assertEquals(expResult, result, 0.0);
    }
    //---------------------------------------------------------------------------------------------------//
    /**
     * Este metodo testea el calculo de aguinaldo para obtener como resultado -3
     * eso significa qeu la fecha de inicio no esta en el rango adecuado
     */
    @Test
    public void testFindbonusFechaFueraRango() {
        System.out.println("findbonus");
        LocalDateTime startDate = LocalDateTime.of(2021,11,01,10,30);
        LocalDateTime endDate = LocalDateTime.of(2022,02,28,10,30);
        float amount = 299999;
        float expResult = -2;
        float result = Aguinaldo.findbonus(startDate, endDate, amount);
        assertEquals(expResult, result, 0);
    }
    
    //---------------------------------------------------------------------------------------------------//
    /**
     * Este metodo testea el calculo de aguinaldo para obtener como resultado -1
     * eso significa qeu la fecha de inicio es posterior a la fecha fin
     */
    @Test
    public void testFindbonusFechaInicioPosterior() {
        System.out.println("findbonus");
        LocalDateTime startDate = LocalDateTime.of(2022,11,01,10,30);
        LocalDateTime endDate = LocalDateTime.of(2021,02,28,10,30);
        float amount = 1000000;
        float expResult = -1;
        float result = Aguinaldo.findbonus(startDate, endDate, amount);
        assertEquals(expResult, result, 0);
    }
    
    //---------------------------------------------------------------------------------------------------//
    /**
     * Este metodo testea el calculo de aguinaldo con datos erroneos, cadena de texto en monto
     */
//    @Test
//    public void testFindbonusString() {
//        System.out.println("findbonus");
//        LocalDateTime startDate = LocalDateTime.of(2022,11,01,10,30);
//        LocalDateTime endDate = LocalDateTime.of(2021,02,28,10,30);
//        float amount = "hola mundo";
//        float expResult = -1;
//        float result = Aguinaldo.findbonus(startDate, endDate, amount);
//        assertEquals(expResult, result, 0);
//    }
    
    //---------------------------------------------------------------------------------------------------//
    /**
     * Este metodo testea el calculo de aguinaldo con datos erroneos monto negativo
     */
//    @Test
//    public void testFindbonusString() {
//        System.out.println("findbonus");
//        LocalDateTime startDate = LocalDateTime.of(2022,11,01,10,30);
//        LocalDateTime endDate = LocalDateTime.of(2021,02,28,10,30);
//        float amount = -1000000;
//        float expResult = 1000000;
//        float result = Aguinaldo.findbonus(startDate, endDate, amount);
//        assertEquals(expResult, result, 0);
//    }

}
