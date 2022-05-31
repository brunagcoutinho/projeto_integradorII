package view;

import controller.ClientesController;
import controller.ProdutosController;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.Cliente;
import view.telaPrincipal;

/**
 *
 * @author Bruna
 */
public class telaClientes extends javax.swing.JFrame {
    
    ArrayList<Cliente> clientes;

    /**
     * Creates new form telaClientes
     */
    public telaClientes() {
        initComponents();
        setLocationRelativeTo(null);
        clientes = ClientesController.Clientes();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        for (int i = 0; i < clientes.size(); i++) {
            model.addRow(new Object[]{clientes.get(i).getId(),
                clientes.get(i).getNome(),
                clientes.get(i).getSexo(),
                clientes.get(i).getCpf(),
                clientes.get(i).getEmail(),
                clientes.get(i).getTelefone(),
                clientes.get(i).getEndereço(),
                clientes.get(i).getEstadoCivil(),
                clientes.get(i).getDataNasc()});
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelProd = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        BtnAdd = new javax.swing.JButton();
        BtnEdit = new javax.swing.JButton();
        BtnExc = new javax.swing.JButton();
        BtnAtt = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        BtnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(1013, 519));

        labelProd.setBackground(new java.awt.Color(255, 0, 255));
        labelProd.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 18)); // NOI18N
        labelProd.setForeground(new java.awt.Color(204, 102, 255));
        labelProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgtelaCliente.png"))); // NOI18N
        labelProd.setText("CLIENTES");
        labelProd.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 204, 255), new java.awt.Color(204, 153, 255), new java.awt.Color(153, 204, 255), new java.awt.Color(204, 153, 255)));

        jTable1.setBackground(new java.awt.Color(204, 255, 255));
        jTable1.setForeground(new java.awt.Color(51, 51, 51));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Sexo", "CPF", "E-mail", "Telefone", "Endereço", "Estado CV", "Data de Nascimento"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMaxWidth(55);
            jTable1.getColumnModel().getColumn(2).setMaxWidth(40);
        }

        BtnAdd.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        BtnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgAdd.png"))); // NOI18N
        BtnAdd.setText("Adicionar");
        BtnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAddActionPerformed(evt);
            }
        });

        BtnEdit.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        BtnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgEditar.png"))); // NOI18N
        BtnEdit.setText("Editar");
        BtnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditActionPerformed(evt);
            }
        });

        BtnExc.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        BtnExc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgExcluir.png"))); // NOI18N
        BtnExc.setText("Excluir");
        BtnExc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExcActionPerformed(evt);
            }
        });

        BtnAtt.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        BtnAtt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgLogin.png"))); // NOI18N
        BtnAtt.setText("Atualizar");
        BtnAtt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAttActionPerformed(evt);
            }
        });

        jButton1.setText("Filtrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.setToolTipText("Filtrar por nome ou CPF do cliente");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField1)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 890, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnAdd)
                            .addComponent(BtnExc, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnAtt, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(labelProd)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BtnAdd)
                        .addGap(46, 46, 46)
                        .addComponent(BtnEdit)
                        .addGap(46, 46, 46)
                        .addComponent(BtnExc)
                        .addGap(45, 45, 45)
                        .addComponent(BtnAtt)
                        .addContainerGap(114, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );

        BtnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgtelaClienteHouse.png"))); // NOI18N
        BtnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnVoltar)
                .addGap(15, 15, 15))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1116, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(BtnVoltar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVoltarActionPerformed
        
        telaPrincipal tela = new telaPrincipal();
        tela.setVisible(true);
        dispose();

    }//GEN-LAST:event_BtnVoltarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (!jTextField1.getText().isBlank()) {
            clientes = ClientesController.Filtar(jTextField1.getText());
            attTela(clientes);
        } else {
            clientes = ClientesController.Clientes();
            attTela(clientes);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BtnAttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAttActionPerformed
        this.attTela(ClientesController.Clientes());
    }//GEN-LAST:event_BtnAttActionPerformed

    private void BtnExcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExcActionPerformed
        int selectedIndex = jTable1.getSelectedRow();
        ((DefaultTableModel) jTable1.getModel()).removeRow(selectedIndex);
        int id = clientes.get(selectedIndex).getId();
        ClientesController.Excluir(id);
    }//GEN-LAST:event_BtnExcActionPerformed

    private void BtnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditActionPerformed
        if (jTable1.getSelectedRow() != -1) {
        telaAltCliente telaC = new telaAltCliente();
        int selectedIndex = jTable1.getSelectedRow();
        telaC.setCBoxECivil(clientes.get(selectedIndex).getEstadoCivil());
        telaC.setCBoxGenero(clientes.get(selectedIndex).getSexo());
        telaC.setTxtCPF(clientes.get(selectedIndex).getCpf());
        telaC.setTxtDataNasc(clientes.get(selectedIndex).getDataNasc().replace("-", ""));
        telaC.setTxtEmail(clientes.get(selectedIndex).getEmail());
        telaC.setTxtEnde(clientes.get(selectedIndex).getEndereço());
        telaC.setTxtFone(clientes.get(selectedIndex).getTelefone());
        telaC.setTxtNomeCliente(clientes.get(selectedIndex).getNome());
        telaC.setId(clientes.get(selectedIndex).getId());
        telaC.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Escolha uma linha primeiro");

        }

    }//GEN-LAST:event_BtnEditActionPerformed

    private void BtnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddActionPerformed
        telaAddCliente telaC = new telaAddCliente();
        telaC.setVisible(true);
    }//GEN-LAST:event_BtnAddActionPerformed

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
            java.util.logging.Logger.getLogger(telaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAdd;
    private javax.swing.JButton BtnAtt;
    private javax.swing.JButton BtnEdit;
    private javax.swing.JButton BtnExc;
    private javax.swing.JButton BtnVoltar;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel labelProd;
    // End of variables declaration//GEN-END:variables
 public void attTela(ArrayList<Cliente> listaClientes) {
        clientes = listaClientes;
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        for (int i = 0; i < clientes.size(); i++) {
            model.addRow(new Object[]{clientes.get(i).getId(),
                clientes.get(i).getNome(),
                clientes.get(i).getSexo(),
                clientes.get(i).getCpf(),
                clientes.get(i).getEmail(),
                clientes.get(i).getTelefone(),
                clientes.get(i).getEndereço(),
                clientes.get(i).getEstadoCivil(),
                clientes.get(i).getDataNasc()});
        }
    }    
}
