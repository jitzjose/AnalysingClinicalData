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

    

    /**
     * Test of convertData method, of class AnalysingClinicalData.
     */
    @Test
    public void testConvertData() {
        System.out.println("convertData");
        float[][] records = new float[10][2];
        AnalysingClinicalData instance = new AnalysingClinicalData();
        for(int i =0 ; i<10;i++){
           records[i][1]= i+2;
           records[i][0]= instance.getDichotomousData(i);
       }
        instance.convertData(records);
         assertTrue((records[5][1]==0)||(records[5][1]==1));
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getRawData method, of class AnalysingClinicalData.
     */
    @Test
    public void testAnalysingResult() {
        System.out.println("analysingResult");
        float[][] records = new float[10][2];
        AnalysingClinicalData instance = new AnalysingClinicalData();
        for(int i =0 ; i<10;i++){
           records[i][1]= i+3;
           records[i][0]= instance.getDichotomousData(i);
       }
        instance.convertData(records);
        instance.analysingResult(records);
        assertTrue((records[3][1]==0)||(records[3][0]==0));
        // TODO review the generated test code and remove the default call to fail.
    }

    
    
    
}
