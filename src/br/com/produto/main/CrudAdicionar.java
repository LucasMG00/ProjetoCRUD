package br.com.produto.main;

import br.com.produto.dao.ProdutoDAO;
import br.com.produto.model.Produto;

import java.awt.*;

import java.util.logging.*;

import javax.swing.*;

public class CrudAdicionar extends javax.swing.JFrame {

    public CrudAdicionar() {
        
        initComponents();
        
        setLocationRelativeTo(null);
        
        setDefaultCloseOperation(CrudAdicionar.DISPOSE_ON_CLOSE);
        
        ImageIcon img = new ImageIcon("C:\\Users\\brzad\\OneDrive\\Documentos\\Projects BACKUP\\JavaCRUD\\src\\resources/AddIcon.png");
        this.setIconImage(img.getImage());
        
        Clean();

    }

    public void Clean() {
        this.numId.setValue(1);
        this.txtNome.setText("");
        this.numVal.setValue(1);
        this.numQtd.setValue(1);
        this.lblErro.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSave = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        numId = new javax.swing.JSpinner();
        txtNome = new javax.swing.JTextField();
        numVal = new javax.swing.JSpinner();
        numQtd = new javax.swing.JSpinner();
        lblErro = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Adicionar");
        setBackground(new java.awt.Color(0, 0, 0));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSave.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/SaveIcon.png"))); // NOI18N
        btnSave.setText("Salvar");
        btnSave.setToolTipText("Salvar novo produto");
        btnSave.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnSave.setMaximumSize(new java.awt.Dimension(80, 30));
        btnSave.setMinimumSize(new java.awt.Dimension(80, 30));
        btnSave.setPreferredSize(new java.awt.Dimension(80, 30));
        btnSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSaveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSaveMouseExited(evt);
            }
        });
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 100, -1));

        jPanel1.setBackground(new java.awt.Color(80, 162, 238));
        jPanel1.setMaximumSize(new java.awt.Dimension(330, 180));
        jPanel1.setMinimumSize(new java.awt.Dimension(330, 180));
        jPanel1.setPreferredSize(new java.awt.Dimension(330, 180));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID:");
        jLabel2.setToolTipText("Id do produto (apenas números inteiros são aceitos)");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 11, -1, -1));

        jLabel3.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nome:");
        jLabel3.setToolTipText("Nome do produto");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        jLabel4.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Valor:");
        jLabel4.setToolTipText("Valor do produto (apenas números inteiros são aceitos)");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 69, -1, -1));

        jLabel5.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Quantidade:");
        jLabel5.setToolTipText("Quantidade do produto (apenas números inteiros são aceitos)");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 98, -1, -1));

        numId.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        jPanel2.add(numId, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 11, 60, -1));
        jPanel2.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 40, 160, -1));

        numVal.setModel(new javax.swing.SpinnerNumberModel(1.0d, 1.0d, null, 1.0d));
        jPanel2.add(numVal, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 69, 160, -1));

        numQtd.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        jPanel2.add(numQtd, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 98, 160, -1));

        lblErro.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        lblErro.setForeground(new java.awt.Color(153, 153, 153));
        jPanel2.add(lblErro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 250, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 160));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/LogoIconBlack.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 210));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        if (this.txtNome.getText().length() == 0) {

            this.lblErro.setText("! Todos os campos são obrigatórios !");

        } else {

            Produto p = new Produto();

            int pidd = (Integer) this.numId.getValue();
            double pvv = (Double) this.numVal.getValue();
            int pqq = (Integer) this.numQtd.getValue();

            String pid = Integer.toString(pidd);
            String pv = Double.toString(pvv);
            String pq = Integer.toString(pqq);

            p.setId(pid);
            p.setNome(this.txtNome.getText());
            p.setValor("R$" + pv);
            p.setQuantidade(pq);

            try {
                ProdutoDAO.Insert(p);
                JOptionPane.showMessageDialog(this, "Registro feito com sucesso!","Sucesso",JOptionPane.INFORMATION_MESSAGE);
                Clean();

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "ERRO", "ERRO", JOptionPane.ERROR_MESSAGE);
                Logger.getLogger(CrudAdicionar.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                ProdutoDAO.setSelect("");
            } catch (Exception ex) {
                Logger.getLogger(CrudAdicionar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnSaveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseEntered
        btnSave.setBackground(Color.green);
        btnSave.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnSaveMouseEntered

    private void btnSaveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseExited
        btnSave.setBackground(null);
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_btnSaveMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CrudAdicionar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrudAdicionar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrudAdicionar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrudAdicionar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrudAdicionar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblErro;
    public javax.swing.JSpinner numId;
    public javax.swing.JSpinner numQtd;
    public javax.swing.JSpinner numVal;
    public javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}