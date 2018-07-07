/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsuldeminas.view;

import br.edu.ifsuldeminas.controller.ControllerCustomerList;
import br.edu.ifsuldeminas.controller.ControllerCliente;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import br.edu.ifsuldeminas.model.Cliente;

/**
 *
 * @author Marcos
 */
public class ViewCustomerList extends javax.swing.JFrame {

    /**
     * Creates new form ViewCustomerList
     */
    ControllerCustomerList controllerCustomerList = new ControllerCustomerList();

    public ViewCustomerList() {
        initComponents();
        setIcon();
        addRowToJTable();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbCustomerTable = new javax.swing.JTable();
        btnRemove = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Listar clientes");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Nome:");

        btnSearch.setText("Pesquisar");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        tbCustomerTable.setAutoCreateRowSorter(true);
        tbCustomerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Telefone", "Email"
            }
        ));
        jScrollPane1.setViewportView(tbCustomerTable);

        btnRemove.setText("Remover");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnEdit.setText("Alterar");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEdit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRemove))
                    .addComponent(btnSearch)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtName))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRemove)
                    .addComponent(btnEdit))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:

        try {

            int id = controllerCustomerList.searchForNameDelete((String) tbCustomerTable.getValueAt(tbCustomerTable.getSelectedRow(), 1), ControllerCliente.customers);

            ViewEdit viewEdit = new ViewEdit(tbCustomerTable);
            viewEdit.populateFields(id);
            viewEdit.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Nenhuma linha selecionada.", "Aviso", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btnEditActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        // TODO add your handling code here:

        try {

            int id = controllerCustomerList.searchForNameDelete((String) tbCustomerTable.getValueAt(tbCustomerTable.getSelectedRow(), 1), ControllerCliente.customers);
            ControllerCliente.customers.remove(id);
            addRowToJTable();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Nenhuma linha selecionada.", "Aviso", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        ArrayList<Integer> itens = controllerCustomerList.searchForName(txtName.getText(), ControllerCliente.customers);
        if (itens.size() == 0) {
            addRowToJTable();
            JOptionPane.showMessageDialog(this, "Nenhum nome encontrado.", "Aviso", JOptionPane.WARNING_MESSAGE);
        } else {
            addRowToJTable(itens);
        }

    }//GEN-LAST:event_btnSearchActionPerformed

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
            java.util.logging.Logger.getLogger(ViewCustomerList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewCustomerList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewCustomerList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewCustomerList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewCustomerList().setVisible(true);
            }
        });
    }

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/edu/ifsuldeminas/imagens/icone_cliente.png")));
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbCustomerTable;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables

    public void addRowToJTable() {

        clearTable();
        DefaultTableModel model = (DefaultTableModel) tbCustomerTable.getModel();
        Object rowData[] = new Object[4];

        for (int i = 0; i < ControllerCliente.customers.size(); i++) {
            rowData[0] = ControllerCliente.customers.get(i).getId();
            rowData[1] = ControllerCliente.customers.get(i).getName();
            rowData[2] = ControllerCliente.customers.get(i).getTelephoneNumber();
            rowData[3] = ControllerCliente.customers.get(i).getEmail();
            model.addRow(rowData);
        }
        tbCustomerTable.repaint();
    }
    
    public void addRowToJTable(ArrayList<Integer> itens) {

        clearTable();
        DefaultTableModel model = (DefaultTableModel) tbCustomerTable.getModel();
        Object rowData[] = new Object[4];

        for (int i = 0; i < itens.size(); i++) {
            rowData[0] = ControllerCliente.customers.get(itens.get(i)).getId();
            rowData[1] = ControllerCliente.customers.get(itens.get(i)).getName();
            rowData[2] = ControllerCliente.customers.get(itens.get(i)).getTelephoneNumber();
            rowData[3] = ControllerCliente.customers.get(itens.get(i)).getEmail();
            model.addRow(rowData);
        }
        tbCustomerTable.repaint();
    }
    

    public void addRowToJTable(Cliente customer) {
        clearTable();
        DefaultTableModel model = (DefaultTableModel) tbCustomerTable.getModel();
        Object rowData[] = new Object[4];

        rowData[0] = customer.getId();
        rowData[1] = customer.getName();
        rowData[2] = customer.getTelephoneNumber();
        rowData[3] = customer.getEmail();
        model.addRow(rowData);
        tbCustomerTable.repaint();
    }

    public void clearTable() {

        tbCustomerTable.setModel(new DefaultTableModel(null, new String[]{"ID", "Nome", "Telefone", "Email"}));

    }

    public void clearTable(JTable tabela) {

        tabela.setModel(new DefaultTableModel(null, new String[]{"ID", "Nome", "Telefone", "Email"}));

    }

    void addRowToJTable(JTable tabela) {

        clearTable();
        DefaultTableModel model = (DefaultTableModel) tabela.getModel();
        Object rowData[] = new Object[4];

        for (int i = 0; i < ControllerCliente.customers.size(); i++) {
            rowData[0] = ControllerCliente.customers.get(i).getId();
            rowData[1] = ControllerCliente.customers.get(i).getName();
            rowData[2] = ControllerCliente.customers.get(i).getTelephoneNumber();
            rowData[3] = ControllerCliente.customers.get(i).getEmail();
            model.addRow(rowData);
        }
    }
}
