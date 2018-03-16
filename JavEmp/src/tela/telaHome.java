/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tela;

import Clientes.telaGerenciarClientes;
import Funcionarios.telaGerenciarFuncionarios;
import DB.ConnectMYSQL;
import Logando.telaLogin;
import Logando.telaTrocaSenha;
import Marca.frameMarca;
import Pedidos.telaTirarPedido;
import Produtos.telaEstoque;
import Produtos.telaGenrenciarProdutos;
import Pedidos.telaFecharPedido;
import java.awt.Dimension;
import java.awt.Frame;
import java.beans.PropertyVetoException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author tduarte
 */
public class telaHome extends javax.swing.JFrame {

    ConnectMYSQL conex = new ConnectMYSQL();
    public telaHome(String usuario) {
        initComponents();
     //   setExtendedState(java.awt.Frame.MAXIMIZED_BOTH); // iniciar com tela full
        conex.conectar();   
        
        jLabelUsuario.setText(usuario);
        //DEIXAR O ADMIN VISIVEL CASO SEJA ADMIN A1
        try {
            conex.conectar();
            conex.executaSql("select *from funcionarios where usuario ='"+jLabelUsuario.getText()+"'");
            conex.rs.first();
            if(conex.rs.getString("cargo").equals("Administrador")){
               jMenuAdmin.setVisible(true);
                
            }else{
                jMenuAdmin.setVisible(false);
            }
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "ERRO "+ex);
        }
        conex.desconecta();
        //FIM A1
    }

    private telaHome() {

        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jLabelUsuario = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuAdmin = new javax.swing.JMenu();
        jMenuItem_CriarUsuario = new javax.swing.JMenuItem();
        jMenuItemGerenciarProdutos = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu_Minimizar = new javax.swing.JMenu();
        jMenu_Fechar = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jDesktopPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDesktopPane1MouseClicked(evt);
            }
        });

        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTabbedPane1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jLabelUsuario.setText("jLabel1");

        jDesktopPane1.setLayer(jTabbedPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabelUsuario, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelUsuario)
                .addContainerGap(1299, Short.MAX_VALUE))
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelUsuario)
                .addContainerGap())
        );

        getContentPane().add(jDesktopPane1);
        jDesktopPane1.setBounds(0, 0, 1360, 730);

        jMenu1.setText("Arquivo");
        jMenu1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jMenuItem6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenuItem6.setText("Alterar Senha");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuItem3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenuItem3.setText("Sair");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Sistema");
        jMenu2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenuItem1.setText("Estoque");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenuItem4.setText("Tirar Pedido");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenuItem5.setText("Gerenciar Clientes");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenuItem11.setText("Pedidos");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem11);

        jMenuItem2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenuItem2.setText("Adicionar Marca");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        jMenuAdmin.setText("Admin");
        jMenuAdmin.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jMenuItem_CriarUsuario.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenuItem_CriarUsuario.setText("Gerenciar Funcionarios");
        jMenuItem_CriarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_CriarUsuarioActionPerformed(evt);
            }
        });
        jMenuAdmin.add(jMenuItem_CriarUsuario);

        jMenuItemGerenciarProdutos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenuItemGerenciarProdutos.setText("Gerenciar Produtos");
        jMenuItemGerenciarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGerenciarProdutosActionPerformed(evt);
            }
        });
        jMenuAdmin.add(jMenuItemGerenciarProdutos);

        jMenuItem9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenuItem9.setText("Estatísticas de Venda");
        jMenuItem9.setEnabled(false);
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenuAdmin.add(jMenuItem9);

        jMenuBar1.add(jMenuAdmin);

        jMenu_Minimizar.setText("-");
        jMenu_Minimizar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenu_Minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu_MinimizarMouseClicked(evt);
            }
        });
        jMenu_Minimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_MinimizarActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu_Minimizar);

        jMenu_Fechar.setText("X");
        jMenu_Fechar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenu_Fechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu_FecharMouseClicked(evt);
            }
        });
        jMenu_Fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_FecharActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu_Fechar);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(1360, 745));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

        
    
    private void jMenuItem_CriarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_CriarUsuarioActionPerformed
        try {
            conex.conectar();
            conex.executaSql("select *from funcionarios where usuario ='"+jLabelUsuario.getText()+"'");
            conex.rs.first();
            if(conex.rs.getString("cargo").equals("Administrador")){
               telaGerenciarFuncionarios criarFunc = new telaGerenciarFuncionarios();
               criarFunc.setVisible(true);
               jDesktopPane1.add(criarFunc);
               jTabbedPane1.addTab("Gerencias Funcionarios", criarFunc);
               jTabbedPane1.setSelectedComponent(criarFunc);
                criarFunc.pack();
                criarFunc.setMaximizable(true);
                criarFunc.setVisible(true);
                Dimension resolucao = this.getSize();
                criarFunc.setSize(resolucao);
                try { criarFunc.setMaximum(true); } catch (PropertyVetoException ex) { Logger.getLogger(telaHome.class.getName()).log(Level.SEVERE, null, ex); }

            }else{
                JOptionPane.showMessageDialog(null, "Você não tem autorização para esta função");
            }                

        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "ERRO "+ex);
        }
        conex.desconecta();          
    }//GEN-LAST:event_jMenuItem_CriarUsuarioActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:

                 telaEstoque estoque = new telaEstoque(); 
                    String teste;

                    estoque.setVisible(true);
                    jDesktopPane1.add(estoque);
                    jTabbedPane1.addTab("Estoque", estoque);
                    jTabbedPane1.setSelectedComponent(estoque);             
      
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItemGerenciarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGerenciarProdutosActionPerformed
        // TODO add your handling code here:
         try {
            conex.conectar();
            conex.executaSql("select *from funcionarios where usuario ='"+jLabelUsuario.getText()+"'");
            conex.rs.first();
            if(conex.rs.getString("cargo").equals("Administrador")){
                telaGenrenciarProdutos gerenciarProdutos = new telaGenrenciarProdutos();
                
                
               gerenciarProdutos.setVisible(true);
               jDesktopPane1.add(gerenciarProdutos);
               jTabbedPane1.addTab("Gerenciar Produtos", gerenciarProdutos);
               jTabbedPane1.setSelectedComponent(gerenciarProdutos);
               
            }else{
                JOptionPane.showMessageDialog(null, "Você não tem autorização para esta função");
            }                

        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "ERRO "+ex);
        }
        conex.desconecta();      
    }//GEN-LAST:event_jMenuItemGerenciarProdutosActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
            telaTirarPedido gerenciarPedido = new telaTirarPedido();
//            gerenciarPedido.setMaximizable(true);
            gerenciarPedido.setVisible(true);
            jDesktopPane1.add(gerenciarPedido);
            jTabbedPane1.addTab("Tirar Pedido", gerenciarPedido);
            jTabbedPane1.setSelectedComponent(gerenciarPedido);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        conex.desconecta();
        telaTrocaSenha tsenha = new telaTrocaSenha();
        tsenha.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        telaGerenciarClientes gerenciarClientes = new telaGerenciarClientes();
        gerenciarClientes.setVisible(true);
        jDesktopPane1.add(gerenciarClientes);
        jTabbedPane1.addTab("Gerenciar Clientes", gerenciarClientes);
        jTabbedPane1.setSelectedComponent(gerenciarClientes);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        conex.desconecta();
        dispose();
        telaLogin tlogin = new telaLogin();
        tlogin.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenu_FecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_FecharActionPerformed
    }//GEN-LAST:event_jMenu_FecharActionPerformed

    private void jMenu_MinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_MinimizarActionPerformed
    }//GEN-LAST:event_jMenu_MinimizarActionPerformed

    private void jMenu_FecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu_FecharMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jMenu_FecharMouseClicked

    private void jMenu_MinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu_MinimizarMouseClicked
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_jMenu_MinimizarMouseClicked

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        telaFecharPedido estatisticaPedido = new telaFecharPedido();
        estatisticaPedido.setVisible(true);
        jDesktopPane1.add(estatisticaPedido);
        jTabbedPane1.addTab("Estatistica de Pedidos", estatisticaPedido);
        jTabbedPane1.setSelectedComponent(estatisticaPedido);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked

        
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void jTabbedPane1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MousePressed


    }//GEN-LAST:event_jTabbedPane1MousePressed

    private void jTabbedPane1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseReleased
  

    }//GEN-LAST:event_jTabbedPane1MouseReleased

    private void jDesktopPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDesktopPane1MouseClicked
 
    }//GEN-LAST:event_jDesktopPane1MouseClicked

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        frameMarca frameMarca = new frameMarca();
        frameMarca.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(telaHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaHome().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenuAdmin;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuItem jMenuItemGerenciarProdutos;
    private javax.swing.JMenuItem jMenuItem_CriarUsuario;
    private javax.swing.JMenu jMenu_Fechar;
    private javax.swing.JMenu jMenu_Minimizar;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
