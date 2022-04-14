package br.com.produto.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class ConnectionFactory {

    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    private static final String DATABASE_URL = "jdbc:mysql://localhost/loja";

    public static Connection createConnectionToMySQL() throws Exception {

        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
        return connection;
        
    }

    public static void main(String[] args) throws Exception {

        Connection con = createConnectionToMySQL();

        if (con != null) {

            JOptionPane.showMessageDialog(null, "Conexão com sucesso!");
            con.close();
            
        }
    }
}