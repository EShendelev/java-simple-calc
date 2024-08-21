package org.example.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.service.Calculator;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculationServlet", urlPatterns = "/calculate")
public class CalculationServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Calculator calculator = new Calculator();
        PrintWriter pw = response.getWriter();
        pw.println(request.getRequestURL());

        String firstOperand = request.getParameter("fo");
        String operator = request.getParameter("op");
        String secondOperand = request.getParameter("so");
        long res = calculator.calc(firstOperand, operator, secondOperand);

        pw.println(res);
        pw.close();
    }
}
