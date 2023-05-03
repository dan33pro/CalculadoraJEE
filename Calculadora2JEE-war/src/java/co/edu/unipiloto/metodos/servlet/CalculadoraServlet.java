/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.metodos.servlet;

import co.edu.unipiloto.metodos.numbers.NumbersHandler;
import co.edu.unipiloto.metodos.session.CalculadoraBeanLocal;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author DanielC
 */
@WebServlet(name = "CalculadoraServlet", urlPatterns = {"/CalculadoraServlet"})
public class CalculadoraServlet extends HttpServlet {

    private NumbersHandler ctrl = new NumbersHandler();
    private boolean semaforo = false;
    private String operacion;

    @EJB
    private CalculadoraBeanLocal calculadoraBean;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String num = request.getParameter("number");
        
        if (!this.semaforo) {
            if (num != null) {
                this.ctrl.setNumber1S(num);
                request.setAttribute("actualNum", this.ctrl.getNumber1S());
            }
        } else {
            if (num != null) {
                this.ctrl.setNumber2S(num);
                request.setAttribute("actualNum", this.ctrl.getNumber2S());
            }
        }

        String action = request.getParameter("action");
        if (action != null) {
            if (!action.equals("=")) {
                this.semaforo = true;
            }
            switch (action) {
                case "=":
                    double rst = this.calcular(this.operacion, this.ctrl.getNum1(), this.ctrl.getNum2());
                    request.setAttribute("rst", rst);
                    request.setAttribute("actualNum", rst);
                    this.ctrl = new NumbersHandler();
                    this.semaforo = false;
                    break;
                default:
                    this.operacion = action;
                    break;
            }
        }

        request.getRequestDispatcher("index.jsp").forward(request, response);
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CalculadoraServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CalculadoraServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    private double calcular(String operacion, double val1, double val2) {
        double rst = 0;
        switch (operacion) {
            case "+":
                rst = calculadoraBean.suma(val1, val2);
                break;
            case "-":
                rst = calculadoraBean.resta(val1, val2);
                break;
            case "*":
                rst = calculadoraBean.multiplicacion(val1, val2);
                break;
            case "/":
                rst = calculadoraBean.division(val1, val2);
                break;
            case "%":
                rst = calculadoraBean.modulo(val1, val2);
                break;
        }
        return rst;
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
