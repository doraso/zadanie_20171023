package pl.javastart;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.Arrays;

@WebServlet("/Tekst")
public class TekstServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        String yourText = request.getParameter("yourText");
        PrintWriter writer = response.getWriter();
        int textLength = yourText.length();
        writer.println("Liczba wszystkich znaków: " + textLength + "</br>");

        String textReplace = yourText.replace(" ", "");
        int textLength2 = textReplace.length();
        writer.println("Liczba znaków bez spacji: " + textLength2 + " </br>");

        String[] text = yourText.split(" ");
        writer.println("Liczba wyrazów w tekście: " + text.length + "</br>");


        StringBuilder builder = new StringBuilder(yourText);
        boolean polindrom = true;
        if (polindrom == builder.reverse().toString().equals(yourText)) {
            writer.println("Tekst jest polindromem </br>");
        } else {
            writer.println("Tekst nie jest polindromem </br>");
        }
    }
}
