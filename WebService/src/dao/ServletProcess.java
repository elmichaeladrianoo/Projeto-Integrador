package dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ServletProcess extends HttpServlet {  
	private static String URL = "jdbc:mysql://127.0.0.1:3306/projetoproduto";
    private static String USER = "root";
    private static String SENHA = "faesp";
	private static Connection con;
	private static final long serialVersionUID = 5101324881088599222L;

    public ServletProcess() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//doGet(request, response);
		Processa(request, response);
	}
	protected void Processa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String id 			= request.getParameter("codProd");
		String nomeProduto 	= request.getParameter("nProduto");
		String preco 		= request.getParameter("preco");
		String marcas 		= request.getParameter("marcas");
		String modelo 		= request.getParameter("modelo");
		String categoria	= request.getParameter("categoria");		
		//String dataCadastro = request.getParameter("datacadastro");
		String descricao	= request.getParameter("mensagem");
			 try {
				 Class.forName("com.mysql.jdbc.Driver");
				 con = DriverManager.getConnection(URL,USER,SENHA);
				 System.out.println("Conexão OK");
				 String query = "INSERT INTO produto()VALUES(?,?,?,?,?,?,?,?)";
				 PreparedStatement st = (PreparedStatement) con.prepareStatement(query);
				 	st.setString(1, id);
					st.setString(2, nomeProduto);
					st.setString(3, preco);
					st.setString(4, marcas);
					st.setString(5, modelo);
					st.setString(6, categoria);						
					//st.setString(7, "%" +dataCadastro+ "%");
					st.setDate(7, new java.sql.Date(System.currentTimeMillis()));
					st.setString(8, descricao);
					st.executeUpdate();
					st.close();
					System.out.println("DEU CERTO");

			 }catch(SQLException | ClassNotFoundException ex) {
				 System.out.println("Erro: " + ex.getMessage());
			 } 
	}
	 public void desconectar() {
		 try {
			 con.close();
		 }catch(SQLException ex) {
			 System.out.println("Erro de conexão!" + ex.getMessage());
			 }
		 }
}