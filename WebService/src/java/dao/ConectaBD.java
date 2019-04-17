package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

import com.mysql.jdbc.PreparedStatement;

public class ConectaBD {
	private static String URL ="jdbc:mysql://127.0.0.1:3306/projetoproduto";
    private static String USER = "root";
    private static String SENHA = "faesp";
    
	 private static Connection con;
	    
	 public void conexao() {
		 try {
			 con = DriverManager.getConnection(URL,USER,SENHA);
			 JOptionPane.showMessageDialog(null,  "Conexão OK");
		 }catch(SQLException ex) {
			 JOptionPane.showMessageDialog(null,  "Erro de conexão!" + ex.getMessage());
		 }
	 }
	 public void desconectar() {
		 try {
			 con.close();
		 }catch(SQLException ex) {
			 JOptionPane.showMessageDialog(null,  "Erro ao fechar conexão!" + ex.getMessage());
		 }
	 }
    public static void main (String[] args) {
    	
    	ConectaBD conexao = new ConectaBD();
    	conexao.conexao();
    	String query = "INSERT INTO produto()VALUES(?,?,?,?,?,?,?,?);";
    		 try {
				PreparedStatement stmt = (PreparedStatement) con.prepareStatement(query);
				stmt.setString(1, "01");
				stmt.setString(2, "produtoTESTE");
				stmt.setString(3, "100.00");
				stmt.setString(4, "marcanull");
				stmt.setString(5, "modelonull");
				stmt.setString(6, "infantil");
				stmt.setString(7, "2019-04-15");
				stmt.setString(8, "Primeiro insert");
					stmt.executeUpdate();
					stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	 }
}
