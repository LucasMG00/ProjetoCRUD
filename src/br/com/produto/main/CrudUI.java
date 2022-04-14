package br.com.produto.main;

import br.com.produto.dao.ProdutoDAO;
import br.com.produto.model.Produto;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class CrudUI extends javax.swing.JFrame {

    public CrudUI() throws Exception {

        initComponents();

        setLocationRelativeTo(null);

        ProdutoDAO.setSelect("");

        ImageIcon img = new ImageIcon("src\\resources/Logo.png");
        this.setIconImage(img.getImage());

        btnEdt.setEnabled(false);
        btnDel.setEnabled(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblProduto = new javax.swing.JTable();
        btnAdc = new javax.swing.JButton();
        btnEdt = new javax.swing.JButton();
        btnDel = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Loja que Existe");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblProduto.setBackground(new java.awt.Color(50, 50, 50));
        tblProduto.setForeground(new java.awt.Color(204, 204, 204));
        tblProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Valor", "Quantidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblProduto.setGridColor(new java.awt.Color(0, 102, 102));
        tblProduto.setSelectionBackground(new java.awt.Color(80, 162, 238));
        tblProduto.getTableHeader().setReorderingAllowed(false);
        tblProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProdutoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProduto);
        if (tblProduto.getColumnModel().getColumnCount() > 0) {
            tblProduto.getColumnModel().getColumn(0).setPreferredWidth(55);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 179, 310, 300));

        btnAdc.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        btnAdc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/AddIcon.png"))); // NOI18N
        btnAdc.setText("Adicionar");
        btnAdc.setToolTipText("Adicionar novo produto");
        btnAdc.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnAdc.setMaximumSize(new java.awt.Dimension(80, 30));
        btnAdc.setMinimumSize(new java.awt.Dimension(80, 30));
        btnAdc.setPreferredSize(new java.awt.Dimension(80, 30));
        btnAdc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAdcMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAdcMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAdcMouseExited(evt);
            }
        });
        btnAdc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdcActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdc, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 90, -1));

        btnEdt.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        btnEdt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/EditIcon.png"))); // NOI18N
        btnEdt.setText("Editar");
        btnEdt.setToolTipText("Editar produto selecionado");
        btnEdt.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnEdt.setMaximumSize(new java.awt.Dimension(80, 30));
        btnEdt.setMinimumSize(new java.awt.Dimension(80, 30));
        btnEdt.setPreferredSize(new java.awt.Dimension(80, 30));
        btnEdt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEdtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEdtMouseExited(evt);
            }
        });
        btnEdt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEdtActionPerformed(evt);
            }
        });
        getContentPane().add(btnEdt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 510, 90, -1));

        btnDel.setBackground(new java.awt.Color(0, 0, 0));
        btnDel.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        btnDel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/DeleteIcon.png"))); // NOI18N
        btnDel.setText("Deletar");
        btnDel.setToolTipText("Deletar produto selecionado");
        btnDel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnDel.setMaximumSize(new java.awt.Dimension(80, 30));
        btnDel.setMinimumSize(new java.awt.Dimension(80, 30));
        btnDel.setPreferredSize(new java.awt.Dimension(80, 30));
        btnDel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDelMouseExited(evt);
            }
        });
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });
        getContentPane().add(btnDel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 510, 90, -1));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Logo.png"))); // NOI18N
        jLabel1.setToolTipText("Loja que Existe!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(104, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(349, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 500));

        jPanel2.setBackground(new java.awt.Color(80, 162, 238));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 330, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdcActionPerformed

        CrudAdicionar adc = new CrudAdicionar();
        adc.setVisible(true);

    }//GEN-LAST:event_btnAdcActionPerformed

    private void btnEdtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEdtActionPerformed

        CrudEditar edt = new CrudEditar();

        int fila = tblProduto.getSelectedRow();
        String string;
        double str;
        

        edt.numId.setText((String) tblProduto.getValueAt(fila, 0));
        
        edt.txtNome.setText(tblProduto.getValueAt(fila, 1).toString());
        
        string = (String) tblProduto.getValueAt(fila, 2);
        string = string.substring(2);
        str = Double.parseDouble(string);
        
        edt.numVal.setValue(str);
        
        edt.numQtd.setValue(Integer.parseInt((String) tblProduto.getValueAt(fila, 3)));

        edt.setVisible(true);
        
        btnEdt.setEnabled(false);
        btnDel.setEnabled(false);
        btnDel.setForeground(Color.gray);

    }//GEN-LAST:event_btnEdtActionPerformed

    private void btnAdcMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdcMouseEntered
        btnAdc.setBackground(Color.green);
        btnAdc.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnAdcMouseEntered

    private void btnAdcMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdcMouseExited
        btnAdc.setBackground(null);
        btnAdc.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_btnAdcMouseExited

    private void btnEdtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEdtMouseEntered
        btnEdt.setBackground(Color.yellow);
        btnEdt.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnEdtMouseEntered

    private void btnEdtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEdtMouseExited
        btnEdt.setBackground(null);
        btnEdt.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_btnEdtMouseExited

    private void btnDelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDelMouseEntered

        if (btnDel.isEnabled() == true) {

            btnDel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            btnDel.setBackground(Color.gray);
            btnDel.setForeground(Color.red);
            btnDel.setFont(new java.awt.Font("Calibri Light", 1, 12));

        }

    }//GEN-LAST:event_btnDelMouseEntered

    private void btnDelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDelMouseExited

        if (btnDel.isEnabled() == true) {

            btnDel.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
            btnDel.setBackground(Color.black);
            btnDel.setForeground(Color.white);
            btnDel.setFont(new java.awt.Font("Calibri Light", 0, 12));

        }

    }//GEN-LAST:event_btnDelMouseExited

    private void tblProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProdutoMouseClicked

        btnEdt.setEnabled(true);
        btnDel.setEnabled(true);
        btnDel.setForeground(Color.white);

    }//GEN-LAST:event_tblProdutoMouseClicked

    private void btnAdcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdcMouseClicked

    }//GEN-LAST:event_btnAdcMouseClicked

    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed

        String data;
        String cnome;

        Produto p = new Produto();

        int fila = tblProduto.getSelectedRow();

        data = tblProduto.getValueAt(fila, 0).toString();
        cnome = tblProduto.getValueAt(fila, 1).toString();

        p.setId(data);

        if (JOptionPane.showConfirmDialog(this, "Deseja deletar o produto?",
                "O produto " + cnome + " sera deletado!",
                JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {

            ProdutoDAO.Delete(p);

            try {
                ProdutoDAO.setSelect("");
            } catch (Exception ex) {
                Logger.getLogger(CrudUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        btnEdt.setEnabled(false);
        btnDel.setEnabled(false);
        btnDel.setForeground(Color.gray);
        btnDel.setBackground(Color.black);
        btnDel.setFont(new java.awt.Font("Calibri Light", 0, 12));

    }//GEN-LAST:event_btnDelActionPerformed

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
            java.util.logging.Logger.getLogger(CrudUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrudUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrudUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrudUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new CrudUI().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(CrudUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdc;
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnEdt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tblProduto;
    // End of variables declaration//GEN-END:variables
}