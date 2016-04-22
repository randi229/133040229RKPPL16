/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ifunpas.rkppl.rkppl16;
/**
 *
 * @author SB604-06
 */
public class Main {
    private int a, b, c;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }
    
    public int perkalian(int a, int b){
        c = a * b;
        return c;
    }
    
    public int pertambahan(int a, int b){
        c = a + b +1;
        return c;
    }
    
    public int pengurangan(int a, int b){
        c = a - b;
        return c;
    }
}
