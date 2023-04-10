/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.metodos.session;

import javax.ejb.Stateless;

/**
 *
 * @author DanielC
 */
@Stateless
public class CalculadoraBean implements CalculadoraBeanLocal {

    @Override
    public Integer suma(int val1, int val2) {
        return val1 + val2;
    }
    
    
    @Override
    public Integer resta(int val1, int val2) {
        return val1 - val2;
    }

    @Override
    public Integer multiplicacion(int val1, int val2) {
        return val1 * val2;
    }
    

    @Override
    public Integer modulo(int val1, int val2) {
        return val1 % val2;
    }

    

    @Override
    public Double division(double val1, double val2) {
        return val1 / val2;
    }

    @Override
    public Double raiz(double val1) {
        return Math.sqrt(val1);
    }
    
    
}
