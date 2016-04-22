/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ifunpas.rkppl.rkppl16;
import org.junit.Test;
import org.junit.*;
/**
 *
 * @author SB604-06
 */
public class Testing {
    boolean result;
    Main m = new Main();
    
    
    
    @Test
    public void Test1(){
        m.setA(5);
        m.setB(4);
        m.setC(m.pengurangan(m.getA(), m.getB()));
        if(m.getC()==1){
            result = true;
        }else{
            result = false;
        }
        Assert.assertTrue("harusnya benar", result);
        System.out.println("Hasil Test 1 : "+result);
    }
    
    @Test
    public void Test2(){
        m.setA(7);
        m.setB(4);
        m.setC(m.pertambahan(m.getA(), m.getB()));
        if(m.getC()==11){
            result = true;
        }else{
            result = false;
        }
        Assert.assertFalse("harusnya salah", result);
        System.out.println("Hasil Test 2 : "+result);
    }
    
    @Ignore
    public void Test3(){
        m.setA(11);
        m.setB(7);
        m.setC(m.perkalian(m.getA(), m.getB()));
        if (m.getC()==77) {
            result = true;
        }else{
            result = false;
        }
        Assert.assertNotNull("harusnya tidak kosong", result);
        System.out.println("Hasil Test 3 : "+result);
    }
    
    public static void main(String[] args) {
        Testing t = new Testing();
        System.out.println("Hasil Test : ");
        t.Test1();
        t.Test2();
        t.Test3();
        
    }
}
