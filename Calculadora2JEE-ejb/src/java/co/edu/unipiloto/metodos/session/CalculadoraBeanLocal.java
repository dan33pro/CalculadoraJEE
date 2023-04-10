/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.metodos.session;

import javax.ejb.Local;

/**
 *
 * @author DanielC
 */
@Local
public interface CalculadoraBeanLocal {

    Integer suma(int val1, int val2);

    Integer resta(int val1, int val2);

    Integer multiplicacion(int val1, int val2);

    Integer modulo(int val1, int val2);

    Double division(double val1, double val2);

    Double raiz(double val1);
    
}
