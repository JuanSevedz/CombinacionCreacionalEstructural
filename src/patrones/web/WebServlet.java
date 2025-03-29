package src.patrones.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/procesar")
public class WebServlet extends HttpServlet {
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String dato = request.getParameter("dato");
    response.setContentType("text/html");
    response.getWriter().write("<script>alert('Recibido: " + dato + "'); window.location.href='index.html';</script>");
  }
}
