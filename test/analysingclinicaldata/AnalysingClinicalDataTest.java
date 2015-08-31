/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analysingclinicaldata;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mrinalini
 */
public class AnalysingClinicalDataTest {
    
    public AnalysingClinicalDataTest() {
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
     * Test of getDichotomousData method, of class AnalysingClinicalData.
     */
    @Test
    public void testGetDichotomousData() {
        System.out.println("GetDichotomousData");
        AnalysingClinicalData instance = new AnalysingClinicalData();
        float check =1;
        float result= instance.getDichotomousData(2);
        assertEquals(check, result, 1.0);
    }

    /**
     * Test of getRawData method, of class AnalysingClinicalData.
     */

    /**
     * Test of main method, of class AnalysingClinicalData.
     */
    @Test
    public void testMain() {
        
    }
    
}
