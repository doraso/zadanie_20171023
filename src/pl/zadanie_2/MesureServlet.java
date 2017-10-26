package pl.zadanie_2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/mesure")
public class MesureServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        MesureUnits mesure = new MesureUnits();
        String meter = request.getParameter("meter");
        String kilogram = request.getParameter("kilogram");
        double number1 = Double.parseDouble(meter);
        double number2 = Double.parseDouble(kilogram);
        writer.println(number1 + " metr(y) to " + mesure.meterToCentimeter(number1) + " centymetrów </br>");
        writer.println(number1 + " metr(y) to " + mesure.meterToMilimeter(number1) + " milimetrów</br>");
        writer.println(number2 + " kilogram(y) to " + mesure.kilogramToGram(number2) + " gramów</br>");
        writer.println(number2 + " kilogram(y) to " + mesure.kilogramToMiligram(number2) + " miligramów</br>");


    }

}
