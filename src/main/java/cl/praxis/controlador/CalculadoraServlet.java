package cl.praxis.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CalculadoraServlet")
public class CalculadoraServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            Double num1 = Double.parseDouble(request.getParameter("numero1"));
            Double num2 = Double.parseDouble(request.getParameter("numero2"));
            String operacion = request.getParameter("operacion");

           
            String resultado = "";
            
            switch (operacion) {
                case "sumar":
                    resultado = "El resultado de la Suma es: " + (num1 + num2);
                    break;
                case "restar":
                    resultado = "El resultado de la Resta es: " + (num1 - num2);
                    break;
                case "multiplicar":
                    resultado = "El resultado de la Multiplicación es: " + (num1 * num2);
                    break;
                case "dividir":
                    if (num2 == 0) {
                        throw new ArithmeticException("División por cero");
                    }
                    resultado = "El resultado de la División es: " + (num1 / num2);
                    break;
                case "ordenarAsc":
                    resultado = "Ordenados de menor a mayor: " + Math.min(num1, num2) + ", " + Math.max(num1, num2);
                    break;
                case "ordenarDesc":
                    resultado = "Ordenados de mayor a menor: " + Math.max(num1, num2) + ", " + Math.min(num1, num2);
                    break;
                case "paresImpares":
                    String num1ParImpar = (num1 % 2 == 0) ? "par" : "impar";
                    String num2ParImpar = (num2 % 2 == 0) ? "par" : "impar";
                    resultado = "El primer número es " + num1ParImpar + " y segundo número es " + num2ParImpar;
                    break;
                default:
                    throw new IllegalArgumentException("Operación no válida");
            }

            request.setAttribute("resultado", resultado);
            getServletContext().getRequestDispatcher("/resultado.jsp").forward(request, response);
        } catch (NumberFormatException e) {
            request.setAttribute("error", "Por favor ingrese números válidos.");
            request.getRequestDispatcher("error.jsp").forward(request, response);
        } catch (ArithmeticException e) {
            request.setAttribute("error", "Error: " + e.getMessage());
            request.getRequestDispatcher("error.jsp").forward(request, response);
        } catch (Exception e) {
            request.setAttribute("error", "Error: " + e.getMessage());
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }          
    }
}