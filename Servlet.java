import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ExemploServlet")
public class ExemploServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Aqui você pode adicionar o código para lidar com solicitações GET, se necessário
        // Por exemplo, você pode processar dados recebidos do cliente ou acessar um banco de dados
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Aqui você pode adicionar o código para lidar com solicitações POST, se necessário
        // Por exemplo, você pode processar dados de um formulário HTML enviado pelo cliente
    }
}
