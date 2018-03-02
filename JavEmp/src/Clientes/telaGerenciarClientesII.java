/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clientes;

import DB.ConnectMYSQL;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author tduarte
 */
public class telaGerenciarClientesII extends javax.swing.JPanel {

    beansCliente mod = new beansCliente();
    daoCliente control = new daoCliente();
    ConnectMYSQL conex = new ConnectMYSQL();
    int flag =1;
    
    public void preencherTabela(String Sql){
      ArrayList dados = new ArrayList();
      String [] colunas = new String []{"ID","Nome","Credito"};
      conex.conectar();
      conex.executaSql(Sql);        
      try{
          conex.rs.first();
          do{
              dados.add(new Object[]{conex.rs.getInt("id"),conex.rs.getString("nome"),conex.rs.getDouble("credito")});
          }while(conex.rs.next());
      }catch(SQLException ex){
          JOptionPane.showMessageDialog(null, "Erro ao preencher Arraylist"+ex); 
      }
      Clientes.modeloTabela modelo = new Clientes.modeloTabela(dados, colunas);

      jTableCliente.setModel(modelo);
      jTableCliente.getColumnModel().getColumn(0).setPreferredWidth(70);
      jTableCliente.getColumnModel().getColumn(0).setResizable(false);
      jTableCliente.getColumnModel().getColumn(1).setPreferredWidth(780);
      jTableCliente.getColumnModel().getColumn(1).setResizable(false);
      jTableCliente.getColumnModel().getColumn(2).setPreferredWidth(500);
      jTableCliente.getColumnModel().getColumn(2).setResizable(false);
      jTableCliente.getTableHeader().setReorderingAllowed(false);
      jTableCliente.setAutoResizeMode(jTableCliente.AUTO_RESIZE_OFF);
      jTableCliente.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
      conex.desconecta();
  }
    
    /**
     * Creates new form telaGerenciarClientes
     */
    public telaGerenciarClientesII() {
        initComponents();
        preencherTabela("select *from clientes order by nome");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCliente = new javax.swing.JTable();
        jTextFieldPesquisar = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jTextFieldCredito = new javax.swing.JTextField();
        jButtonDeletar2 = new javax.swing.JButton();

        jTableCliente.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTableCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableCliente);

        jTextFieldPesquisar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextFieldPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPesquisarActionPerformed(evt);
            }
        });

        jPanel3.setBorder(new javax.swing.border.MatteBorder(null));

        jTextFieldNome.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextFieldNome.setText("Nome do Cliente");
        jTextFieldNome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldNomeMouseClicked(evt);
            }
        });
        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });
        jTextFieldNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldNomeKeyPressed(evt);
            }
        });

        jTextFieldId.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextFieldId.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Credito:");

        jButton3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton3.setText("Enviar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextFieldCredito.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextFieldCredito.setText("R$: 00,00");
        jTextFieldCredito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldCreditoMouseClicked(evt);
            }
        });

        jButtonDeletar2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonDeletar2.setText("Deletar");
        jButtonDeletar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeletar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNome))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 1227, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)))
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonDeletar2)
                .addGap(59, 59, 59))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextFieldCredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButtonDeletar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jTextFieldPesquisar))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTableClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableClienteMouseClicked

        String nome =""+jTableCliente.getValueAt(jTableCliente.getSelectedRow(), 1);
        conex.conectar();
        conex.executaSql("select *from clientes where nome='"+nome+"'");
        try {
            flag =2;
            conex.rs.first();
            jTextFieldId.setText(String.valueOf(conex.rs.getInt("id")));
            jTextFieldNome.setText(conex.rs.getString("nome"));
            jTextFieldCredito.setText(String.valueOf(conex.rs.getDouble("credito")));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar os dados "+ex);
        }

        conex.desconecta();
    }//GEN-LAST:event_jTableClienteMouseClicked

    private void jTextFieldPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPesquisarActionPerformed
        mod.setPesquisa(jTextFieldPesquisar.getText());
        control.buscar(mod);
        preencherTabela("select *from clientes where nome like '%" + mod.getPesquisa()+ "%'");
    }//GEN-LAST:event_jTextFieldPesquisarActionPerformed

    private void jTextFieldNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNomeKeyPressed
        if(jTextFieldNome.getText().equals("Nome do Cliente")){
            jTextFieldNome.setText("");
        }
    }//GEN-LAST:event_jTextFieldNomeKeyPressed

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed

    }//GEN-LAST:event_jTextFieldNomeActionPerformed

    private void jTextFieldNomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldNomeMouseClicked
        if(jTextFieldNome.getText().equals("Nome do Cliente")){
            jTextFieldNome.setText("");
        }
    }//GEN-LAST:event_jTextFieldNomeMouseClicked

    private void jTextFieldCreditoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldCreditoMouseClicked
        if(jTextFieldCredito.getText().equals("R$: 00,00")){
            jTextFieldCredito.setText("");
        }
    }//GEN-LAST:event_jTextFieldCreditoMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(flag == 1){

            mod.setNome(jTextFieldNome.getText());
            mod.setCredito(Double.parseDouble(jTextFieldCredito.getText()));
            control.Salvar(mod);
            preencherTabela("select *from clientes order by nome");
            jTextFieldNome.setText("");
            jTextFieldId.setText("");
            jTextFieldCredito.setText("");
        }else{

            mod.setNome(jTextFieldNome.getText());
            mod.setCredito(Double.parseDouble(jTextFieldCredito.getText()));
            mod.setId(Integer.parseInt(jTextFieldId.getText()));
            control.editar(mod);

            jTextFieldNome.setText("");
            jTextFieldId.setText("");
            jTextFieldCredito.setText("");

            preencherTabela("select *from clientes order by nome");

        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButtonDeletar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeletar2ActionPerformed
        int resposta = 0;
        resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir?");
        if(resposta ==JOptionPane.YES_OPTION){
            mod.setId(Integer.parseInt(jTextFieldId.getText()));
            control.excluir(mod);
            preencherTabela("select *from clientes order by nome");
        }
    }//GEN-LAST:event_jButtonDeletar2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonDeletar2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCliente;
    private javax.swing.JTextField jTextFieldCredito;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPesquisar;
    // End of variables declaration//GEN-END:variables
}
