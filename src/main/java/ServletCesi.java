import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/hello")
public class ServletCesi extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        handleRequest(request, response);
    }

    private void handleRequest(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String nom = req.getParameter("NOM");
        String answer = "<h3>Hello World! Nique sa mère sombre inconnu ! </h3>" ;
        if(nom != null) {
            answer = "<h3>Hello World! Nique sa mère "+ nom + "</h3>";
        }
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println(answer);
    }
}


