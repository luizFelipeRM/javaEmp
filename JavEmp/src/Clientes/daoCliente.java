/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clientes;

import DB.ConnectMYSQL;
import Funcionarios.beansFuncionarios;
import Funcionarios.daoFuncionarios;
import Produtos.beansProdutos;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author luiz
 */
public class daoCliente {
        ConnectMYSQL conex = new ConnectMYSQL();
        beansCliente mod = new beansCliente();
        
        
        public void Salvar(beansCliente mod){
        conex.conectar();
        
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into clientes(nome,rua,bairro,complemento,cpfcnpj) values(?,?,?,?,?)");
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getRua());
            pst.setString(3, mod.getBairro());
            pst.setString(4, mod.getComplemento());
            pst.setString   (5, mod.getCpfcnpj());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados /n"+ex);
        }
        conex.desconecta();
    }
        
         public void editar(beansCliente mod){
      conex.conectar();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update clientes set nome=?, rua=?, bairro=?, complemento=?, cpfcnpj=? where id=?"); //alteração
            pst.setString   (1, mod.getNome());
            pst.setString   (2, mod.getRua());
            pst.setString   (3, mod.getBairro());
            pst.setString   (4, mod.getComplemento());
            pst.setString     (5, mod.getCpfcnpj());
            pst.setInt      (6, mod.getId());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados alterados com sucessos");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na alteração dos dados /nErro:"+ex );
        }
        
      conex.desconecta();
        
    }
         
         public void excluir(beansCliente mod){
        conex.conectar();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from clientes where id=?");
            pst.setInt(1, mod.getId());
            pst.execute();
             JOptionPane.showMessageDialog(null, "Dados excluidos com sucessos");
            
        } catch (SQLException ex) {
            Logger.getLogger(daoFuncionarios.class.getName()).log(Level.SEVERE, null, ex);
             JOptionPane.showMessageDialog(null, "Erro ao excluir dados/nErro:" +ex);
        }
        
        conex.desconecta();
        
    }
         
         public beansCliente buscar(beansCliente mod){
        conex.conectar(); 
        try {  
            // preencherTabela("select *from funcionarios order by usuario");
            conex.executaSql("select *from clientes where nome like'%" + mod.getPesquisa()+"%'");
            conex.rs.first();
            mod.setId           (conex.rs.getInt("id"));
            mod.setNome         (conex.rs.getString("nome"));
            mod.setRua          (conex.rs.getString("rua"));
            mod.setBairro       (conex.rs.getString("bairro"));
            mod.setComplemento  (conex.rs.getString("complemento"));
            mod.setCpfcnpj      (conex.rs.getString("cpfcnpj"));
            
        } catch (SQLException ex) {
        }       
        conex.desconecta();       
        return mod;
    }        
    
}
        
        
    
    

