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

    Double suma(double val1, double val2);

    Double resta(double val1, double val2);

    Double multiplicacion(double val1, double val2);

    Double modulo(double val1, double val2);

    Double division(double val1, double val2);

    Double raiz(double val1);
    
}
