/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Produtos;

import Produtos.beansProdutos;
import DB.ConnectMYSQL;
import Funcionarios.modeloTabela;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author tiago
 */
public class telaGerenciarProdutos extends javax.swing.JFrame {
    beansProdutos mod = new beansProdutos();
    daoProdutos control = new daoProdutos();
    ConnectMYSQL conex = new ConnectMYSQL();
    
    int flag = 1;
    
    /**
     * Creates new form CadastrarProdutos
     */
    public telaGerenciarProdutos() {
        initComponents();
        preencherTabela("select *from produtos order by nome");
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
        jButtonEnviar = new javax.swing.JButton();
        jTextFieldId = new javax.swing.JTextField();
        jComboBoxTipoProduto = new javax.swing.JComboBox<>();
        jTextFieldNomeProduto = new javax.swing.JTextField();
        jTextFieldValor = new javax.swing.JTextField();
        jTextFieldEstoque = new javax.swing.JTextField();
        jButtonDeletar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProdutos = new javax.swing.JTable();
        jTextFieldPesquisar = new javax.swing.JTextField();
        jComboBoxTipoDoProduto = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButtonEnviar.setText("Enviar");
        jButtonEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnviarActionPerformed(evt);
            }
        });

        jTextFieldId.setEnabled(false);

        jComboBoxTipoProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hidráulicos", "Ferragens e Ferramentas", "Tubos", "Fabricantes", "Tintas e Abrasivos", "Ferramentas Manuais", "Material Elétrico" }));
        jComboBoxTipoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoProdutoActionPerformed(evt);
            }
        });

        jTextFieldNomeProduto.setText("Nome do Produto");
        jTextFieldNomeProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldNomeProdutoMouseClicked(evt);
            }
        });
        jTextFieldNomeProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeProdutoActionPerformed(evt);
            }
        });
        jTextFieldNomeProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldNomeProdutoKeyPressed(evt);
            }
        });

        jTextFieldValor.setText("R$");
        jTextFieldValor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldValorMouseClicked(evt);
            }
        });
        jTextFieldValor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldValorKeyPressed(evt);
            }
        });

        jTextFieldEstoque.setText("Quant.");
        jTextFieldEstoque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldEstoqueMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextFieldEstoqueMouseEntered(evt);
            }
        });
        jTextFieldEstoque.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldEstoqueKeyPressed(evt);
            }
        });

        jButtonDeletar.setText("Deletar");
        jButtonDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeletarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNomeProduto))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jComboBoxTipoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonDeletar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxTipoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jButtonEnviar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Gerenciar Produtos");

        jTableProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableProdutosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableProdutos);

        jTextFieldPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPesquisarActionPerformed(evt);
            }
        });

        jComboBoxTipoDoProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Hidráulicos", "Ferragens e Ferramentas", "Tubos", "Fabricantes", "Tintas e Abrasivos", "Ferramentas Manuais", "Material Elétrico" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldPesquisar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxTipoDoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxTipoDoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxTipoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxTipoProdutoActionPerformed

    private void jButtonEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnviarActionPerformed
       if(flag == 1){
        mod.setNome(jTextFieldNomeProduto.getText());
        mod.setTipo((String) jComboBoxTipoProduto.getSelectedItem());
        mod.setValor(Double.parseDouble(jTextFieldValor.getText()));
        mod.setEstoque(Integer.parseInt(jTextFieldEstoque.getText()));
        control.Salvar(mod);
        preencherTabela("select *from produtos order by nome");
       }else{
        mod.setNome(jTextFieldNomeProduto.getText());
        mod.setTipo((String) jComboBoxTipoProduto.getSelectedItem());
        mod.setValor(Double.parseDouble(jTextFieldValor.getText()));
        mod.setEstoque(Integer.parseInt(jTextFieldEstoque.getText()));
        mod.setId(Integer.parseInt(jTextFieldId.getText()));
        control.editar(mod);
        preencherTabela("select *from produtos order by nome");
           
       }
    }//GEN-LAST:event_jButtonEnviarActionPerformed

    private void jTextFieldNomeProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeProdutoActionPerformed

    }//GEN-LAST:event_jTextFieldNomeProdutoActionPerformed

    private void jTableProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableProdutosMouseClicked
        String nome =""+jTableProdutos.getValueAt(jTableProdutos.getSelectedRow(), 1);
         conex.conectar();
        conex.executaSql("select *from produtos where nome='"+nome+"'");
            try {
                flag = 2;
                conex.rs.first();
                jTextFieldId.setText(String.valueOf(conex.rs.getInt("id")));
                jTextFieldNomeProduto.setText(conex.rs.getString("nome"));
                jComboBoxTipoProduto.setSelectedItem(conex.rs.getString("tipo"));
                jTextFieldValor.setText(conex.rs.getString("valor"));
                jTextFieldEstoque.setText(conex.rs.getString("estoque"));
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao selecionar os dados "+ex);
            }
        
        conex.desconecta();
        
        
        
        
        
    }//GEN-LAST:event_jTableProdutosMouseClicked

    private void jButtonDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeletarActionPerformed
        int resposta =0;
        resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente excluir?");
        if(resposta ==JOptionPane.YES_OPTION){
            mod.setId(Integer.parseInt(jTextFieldId.getText()));
            control.excluir(mod);
             preencherTabela("select *from produtos order by tipo");
        }
    }//GEN-LAST:event_jButtonDeletarActionPerformed

    private void jTextFieldPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPesquisarActionPerformed
        mod.setPesquisa(jTextFieldPesquisar.getText());   
        mod.setTipoPesquisa((String) jComboBoxTipoDoProduto.getSelectedItem());
        control.buscar(mod);
        if(jComboBoxTipoDoProduto.getSelectedItem() == "Todos"){
            preencherTabela("select *from produtos where nome like'%" + mod.getPesquisa()+ "%'");
        }else{
            preencherTabela("select *from produtos where nome like'%" + mod.getPesquisa()+ "%'"+"and tipo like'"+mod.getTipoPesquisa()+"'");
        }
    }//GEN-LAST:event_jTextFieldPesquisarActionPerformed

    private void jTextFieldNomeProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldNomeProdutoMouseClicked
              if(jTextFieldNomeProduto.getText().equals("Nome do Produto")){
           jTextFieldNomeProduto.setText("");
       }         
    }//GEN-LAST:event_jTextFieldNomeProdutoMouseClicked

    private void jTextFieldNomeProdutoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNomeProdutoKeyPressed
              if(jTextFieldNomeProduto.getText().equals("Nome do Produto")){
           jTextFieldNomeProduto.setText("");
       }   
    }//GEN-LAST:event_jTextFieldNomeProdutoKeyPressed

    private void jTextFieldValorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldValorMouseClicked
              if(jTextFieldValor.getText().equals("R$")){
           jTextFieldValor.setText("");
       }         
    }//GEN-LAST:event_jTextFieldValorMouseClicked

    private void jTextFieldValorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldValorKeyPressed
              if(jTextFieldValor.getText().equals("R$")){
           jTextFieldValor.setText("");
       }         
    }//GEN-LAST:event_jTextFieldValorKeyPressed

    private void jTextFieldEstoqueMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldEstoqueMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEstoqueMouseEntered

    private void jTextFieldEstoqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldEstoqueMouseClicked
          if(jTextFieldEstoque.getText().equals("Quant.")){
           jTextFieldEstoque.setText("");
       }         
    }//GEN-LAST:event_jTextFieldEstoqueMouseClicked

    private void jTextFieldEstoqueKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldEstoqueKeyPressed
          if(jTextFieldEstoque.getText().equals("Quant.")){
           jTextFieldEstoque.setText("");
       }         
    }//GEN-LAST:event_jTextFieldEstoqueKeyPressed

     public void preencherTabela(String Sql){
          ArrayList dados = new ArrayList();
          String [] colunas = new String []{"ID","Nome","Tipo","Valor","Estoque"};
          conex.conectar();
          conex.executaSql(Sql);        
          try{
              conex.rs.first();
              do{
                  dados.add(new Object[]{conex.rs.getInt("id"),conex.rs.getString("nome"),conex.rs.getString("tipo"),conex.rs.getDouble("valor"),conex.rs.getInt("estoque")});
              }while(conex.rs.next());
          }catch(SQLException ex){
              JOptionPane.showMessageDialog(null, "Erro ao preencher Arraylist"+ex); 
          }
          modeloTabela modelo = new modeloTabela(dados, colunas);
          
          jTableProdutos.setModel(modelo);
          jTableProdutos.getColumnModel().getColumn(0).setPreferredWidth(43);
          jTableProdutos.getColumnModel().getColumn(0).setResizable(false);
          jTableProdutos.getColumnModel().getColumn(1).setPreferredWidth(121);
          jTableProdutos.getColumnModel().getColumn(1).setResizable(false);
          jTableProdutos.getColumnModel().getColumn(2).setPreferredWidth(90);
          jTableProdutos.getColumnModel().getColumn(2).setResizable(false);
          jTableProdutos.getColumnModel().getColumn(3).setPreferredWidth(85);
          jTableProdutos.getColumnModel().getColumn(3).setResizable(false);
          jTableProdutos.getColumnModel().getColumn(4).setPreferredWidth(85);
          jTableProdutos.getColumnModel().getColumn(4).setResizable(false);
          jTableProdutos.getTableHeader().setReorderingAllowed(false);
          jTableProdutos.setAutoResizeMode(jTableProdutos.AUTO_RESIZE_OFF);
          jTableProdutos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
          conex.desconecta();
      }
    
    
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(telaGerenciarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaGerenciarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaGerenciarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaGerenciarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaGerenciarProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDeletar;
    private javax.swing.JButton jButtonEnviar;
    private javax.swing.JComboBox<String> jComboBoxTipoDoProduto;
    private javax.swing.JComboBox<String> jComboBoxTipoProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableProdutos;
    private javax.swing.JTextField jTextFieldEstoque;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldNomeProduto;
    private javax.swing.JTextField jTextFieldPesquisar;
    private javax.swing.JTextField jTextFieldValor;
    // End of variables declaration//GEN-END:variables
}