package br.com.produto.dao;

import br.com.produto.factory.ConnectionFactory;
import br.com.produto.main.CrudUI;
import br.com.produto.model.Produto;
import java.sql.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class ProdutoDAO {
    
    Connection conn = null;
    PreparedStatement pstm = null;

    public static void Insert(Produto produto) throws Exception {

        String sql = "INSERT INTO produto(id, nome, valor, quantidade) VALUES (?, ?, ?, ?)";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {

            conn = ConnectionFactory.createConnectionToMySQL();
            pstm = (PreparedStatement) conn.prepareStatement(sql);

            pstm.setString(1, produto.getId());
            pstm.setString(2, produto.getNome());
            pstm.setString(3, produto.getValor());
            pstm.setString(4, produto.getQuantidade());

            pstm.execute();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstm != null) {
                    pstm.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void Update(Produto produto) {

        String sql = "UPDATE produto SET nome = ?, valor = ?, quantidade = ? "
                + "WHERE id = ?";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {

            conn = ConnectionFactory.createConnectionToMySQL();
            pstm = (PreparedStatement) conn.prepareStatement(sql);

            pstm.setString(1, produto.getNome());
            pstm.setString(2, produto.getValor());
            pstm.setString(3, produto.getQuantidade());
            pstm.setString(4, produto.getId());

            pstm.execute();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstm != null) {
                    pstm.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void Delete(Produto id) {

        String sql = "DELETE FROM produto WHERE id = ?";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {

            conn = ConnectionFactory.createConnectionToMySQL();
            pstm = (PreparedStatement) conn.prepareStatement(sql);

            pstm.setString(1, id.getId());

            pstm.execute();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstm != null) {
                    pstm.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void setSelect(String buscar) throws Exception{
        
        Connection conn = null;
        conn = ConnectionFactory.createConnectionToMySQL();
        DefaultTableModel mod = (DefaultTableModel)CrudUI.tblProduto.getModel();
        
        while(mod.getRowCount()>0){
            mod.removeRow(0);
        }
        
        String sql = "";
        
        if(buscar.equals("")){
            sql = "SELECT * FROM produto";
        }else{
            sql = "SELECT * FROM produto WHERE ("
                    + "nome LIKE'"+buscar+"%' OR"
                    + "valor LIKE'"+buscar+"%' OR"
                    + "quantidade LIKE'"+buscar+"%'"
                    + ")";
        }
        
        String dados[] = new String[4];
        
        
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                dados[0] = rs.getString("id");
                dados[1] = rs.getString("nome");
                dados[2] = rs.getString("valor");
                dados[3] = rs.getString("quantidade");
                mod.addRow(dados);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
/*****
    public static List<Produto> getProdutos() {

        String sql = "SELECT * FROM produto";

        List<Produto> produtos = new ArrayList<Produto>();

        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;

        try {

            conn = ConnectionFactory.createConnectionToMySQL();
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            rset = pstm.executeQuery();

            while (rset.next()) {

                Produto produto = new Produto();

                produto.setId(rset.getString("id"));
                produto.setNome(rset.getString("nome"));
                produto.setValor(rset.getString("valor"));
                produto.setQuantidade(rset.getString("quantidade"));

                produtos.add(produto);

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (rset != null) {
                    rset.close();
                }
                if (pstm != null) {
                    pstm.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return produtos;
    }
*****/
}