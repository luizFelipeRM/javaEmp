/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tela;

import Clientes.telaGerenciarClientes;
import Funcionarios.telaGerenciarFuncionarios;
import DB.ConnectMYSQL;
import Funcionarios.telaEntradaSaida;
import Logando.telaLogin;
import Logando.telaTrocaSenha;
import Pedidos.telaTirarPedido;
import Produtos.telaGerenciarProdutos;
import estatisticas.telaEstatisticaPedidos;
import java.awt.Dimension;
import java.awt.Frame;
import java.beans.PropertyVetoException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Box;
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

        jLabelUsuario = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItemControleDeMaterial = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuAdmin = new javax.swing.JMenu();
        jMenuItem_CriarUsuario = new javax.swing.JMenuItem();
        jMenuItemGerenciarProdutos = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItemEntradaESaída = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu_Minimizar = new javax.swing.JMenu();
        jMenu_Redimencionar = new javax.swing.JMenu();
        jMenu_Fechar = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jLabelUsuario.setText("jLabelUsuario");
        getContentPane().add(jLabelUsuario);
        jLabelUsuario.setBounds(10, 550, 93, 15);

        jDesktopPane1.setLayer(jTabbedPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1300, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5, Short.MAX_VALUE))
        );

        getContentPane().add(jDesktopPane1);
        jDesktopPane1.setBounds(0, 0, 1300, 550);

        jMenu1.setText("Arquivo");

        jMenuItem6.setText("Alterar Senha");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuItem3.setText("Sair");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Sistema");

        jMenuItem1.setText("Estoque");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setText("Entrade e saída");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem4.setText("Tirar Pedido");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem8.setText("Alocação");
        jMenu2.add(jMenuItem8);

        jMenuItemControleDeMaterial.setText("Controle de Material");
        jMenuItemControleDeMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemControleDeMaterialActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemControleDeMaterial);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Janelas");
        jMenuBar1.add(jMenu3);

        jMenuAdmin.setText("Admin");

        jMenuItem_CriarUsuario.setText("Gerenciar Funcionarios");
        jMenuItem_CriarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_CriarUsuarioActionPerformed(evt);
            }
        });
        jMenuAdmin.add(jMenuItem_CriarUsuario);

        jMenuItemGerenciarProdutos.setText("Gerenciar Produtos");
        jMenuItemGerenciarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGerenciarProdutosActionPerformed(evt);
            }
        });
        jMenuAdmin.add(jMenuItemGerenciarProdutos);

        jMenuItem5.setText("* Gerenciar Clientes *");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenuAdmin.add(jMenuItem5);

        jMenuItem7.setText("Logs Movimentação");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenuAdmin.add(jMenuItem7);

        jMenuItem9.setText("Estatísticas de Venda");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenuAdmin.add(jMenuItem9);

        jMenuItemEntradaESaída.setText("Entrada e Saída");
        jMenuItemEntradaESaída.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEntradaESaídaActionPerformed(evt);
            }
        });
        jMenuAdmin.add(jMenuItemEntradaESaída);

        jMenuItem11.setText("Pedidos");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenuAdmin.add(jMenuItem11);

        jMenuBar1.add(jMenuAdmin);

        jMenu_Minimizar.setText("-");
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

        jMenu_Redimencionar.setText("[]");
        jMenu_Redimencionar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu_RedimencionarMouseClicked(evt);
            }
        });
        jMenu_Redimencionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_RedimencionarActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu_Redimencionar);

        jMenu_Fechar.setText("X");
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

        setSize(new java.awt.Dimension(1302, 600));
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

    private void jMenuItemControleDeMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemControleDeMaterialActionPerformed
   
    }//GEN-LAST:event_jMenuItemControleDeMaterialActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItemGerenciarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGerenciarProdutosActionPerformed
        // TODO add your handling code here:
         try {
            conex.conectar();
            conex.executaSql("select *from funcionarios where usuario ='"+jLabelUsuario.getText()+"'");
            conex.rs.first();
            if(conex.rs.getString("cargo").equals("Administrador")){
                telaGerenciarProdutos gerenciarProdutos = new telaGerenciarProdutos();
                
                
               gerenciarProdutos.setVisible(true);
               jDesktopPane1.add(gerenciarProdutos);
               jTabbedPane1.addTab("Gerenciar Produtos", gerenciarProdutos);
               
            }else{
                JOptionPane.showMessageDialog(null, "Você nãinitComponents();o tem autorização para esta função");
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
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        conex.desconecta();
        dispose();
        telaLogin tlogin = new telaLogin();
        tlogin.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        telaEntradaSaida tentradasaida = new telaEntradaSaida();
        tentradasaida.setVisible(true);
        jDesktopPane1.add(tentradasaida);
        jTabbedPane1.addTab("Entrada e Saída", tentradasaida);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenu_FecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_FecharActionPerformed
    }//GEN-LAST:event_jMenu_FecharActionPerformed

    private void jMenu_MinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_MinimizarActionPerformed
    }//GEN-LAST:event_jMenu_MinimizarActionPerformed

    private void jMenu_RedimencionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_RedimencionarActionPerformed
    }//GEN-LAST:event_jMenu_RedimencionarActionPerformed

    private void jMenu_FecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu_FecharMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jMenu_FecharMouseClicked

    private void jMenu_RedimencionarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu_RedimencionarMouseClicked
        if(getExtendedState() == java.awt.Frame.MAXIMIZED_BOTH) {
            this.setSize(800,600);
        } else {
            setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        }
    }//GEN-LAST:event_jMenu_RedimencionarMouseClicked

    private void jMenu_MinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu_MinimizarMouseClicked
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_jMenu_MinimizarMouseClicked

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItemEntradaESaídaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEntradaESaídaActionPerformed
        telaEntradaSaida entradaSaida = new telaEntradaSaida();
        entradaSaida.setVisible(true);
        jDesktopPane1.add(entradaSaida);
        jTabbedPane1.addTab("Entrada e Saida", entradaSaida);
    }//GEN-LAST:event_jMenuItemEntradaESaídaActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        telaEstatisticaPedidos estatisticaPedido = new telaEstatisticaPedidos();
        estatisticaPedido.setVisible(true);
        jDesktopPane1.add(estatisticaPedido);
        jTabbedPane1.addTab("Estatistica de Pedidos", estatisticaPedido);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem9ActionPerformed

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
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenuAdmin;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuItem jMenuItemControleDeMaterial;
    private javax.swing.JMenuItem jMenuItemEntradaESaída;
    private javax.swing.JMenuItem jMenuItemGerenciarProdutos;
    private javax.swing.JMenuItem jMenuItem_CriarUsuario;
    private javax.swing.JMenu jMenu_Fechar;
    private javax.swing.JMenu jMenu_Minimizar;
    private javax.swing.JMenu jMenu_Redimencionar;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
