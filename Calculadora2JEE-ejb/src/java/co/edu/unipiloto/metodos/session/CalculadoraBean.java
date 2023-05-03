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
    public Double suma(double val1, double val2) {
        return val1 + val2;
    }

    @Override
    public Double resta(double val1, double val2) {
        return val1 - val2;
    }

    @Override
    public Double multiplicacion(double val1, double val2) {
        return val1 * val2;
    }

    @Override
    public Double modulo(double val1, double val2) {
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
