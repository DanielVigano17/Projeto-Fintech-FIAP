package br.com.fintech.fintechfiap.controller;

import br.com.fintech.fintechfiap.dao.UsuarioDao;
import br.com.fintech.fintechfiap.model.Usuario;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    private UsuarioDao usuarioDao;

    @Override
    public void init() throws ServletException {
        try {
            usuarioDao = new UsuarioDao(); // Inicializa o DAO para uso no servlet
        } catch (SQLException e) {
            throw new ServletException("Erro ao inicializar o DAO do Usuário", e);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/pages/Register/register.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Obtém os parâmetros do formulário
        String nome = req.getParameter("nome");
        String sobrenome = req.getParameter("sobrenome");
        String email = req.getParameter("email");
        String telefone = req.getParameter("telefone");
        String cpf = req.getParameter("cpf");
        String senha = req.getParameter("senha");

        // Cria uma instância do usuário com os dados do formulário
        Usuario usuario = new Usuario();
        usuario.setNome(nome + " " + sobrenome);  // Concatena nome e sobrenome
        usuario.setEmail(email);
        usuario.setCpf(cpf);
        usuario.setSenha(senha);
        usuario.setSaldo(0);  // Saldo inicial como zero

        try {
            // Insere o usuário no banco de dados usando o DAO
            usuarioDao.insert(usuario);
            usuarioDao.fecharConexao();
            // Redireciona para uma página de sucesso
            resp.sendRedirect("/home");
        } catch (SQLException e) {
            e.printStackTrace();
            req.setAttribute("errorMessage", "Erro ao criar conta. Tente novamente.");
            req.getRequestDispatcher("/pages/Register/register.jsp").forward(req, resp);
        }
    }

    @Override
    public void destroy() {
        try {
            usuarioDao.fecharConexao();  // Fecha a conexão ao encerrar o servlet
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
