/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Marca;

import DB.ConnectMYSQL;
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
public class daoFrameMarca {
        ConnectMYSQL conex = new ConnectMYSQL();
        beansFrameMarca mod = new beansFrameMarca();
    
        
        public void Salvar(beansFrameMarca mod) {
        conex.conectar();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into marca(nome) values(?)");
            pst.setString(1, mod.getNome());
            
            pst.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados /n"+ex);
        }
        conex.desconecta();
    }
    
    
    
    public void excluir(beansFrameMarca mod){
        conex.conectar();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from marca where id=?");
            pst.setInt(1, mod.getId());
            pst.execute();
            
        } catch (SQLException ex) {
            Logger.getLogger(daoFuncionarios.class.getName()).log(Level.SEVERE, null, ex);
             JOptionPane.showMessageDialog(null, "Erro ao excluir dados/nErro:" +ex);
        }
        
        conex.desconecta();
        
    }
    
    public void editar(beansFrameMarca mod){
      conex.conectar();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update marca set nome=? where id=?"); //alteração
            pst.setString   (1, mod.getNome());
            pst.setInt      (2, mod.getId());
            
            pst.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na alteração dos dados /nErro:"+ex );
        }
        
      conex.desconecta();
        
    }
    
    public beansFrameMarca buscar(beansFrameMarca mod){
        conex.conectar(); 
        try {  
            // preencherTabela("select *from funcionarios order by usuario");
            conex.executaSql("select *from marca where nome like'%" + mod.getPesquisa()+ "%'");
            conex.rs.first();
            mod.setId(conex.rs.getInt("id"));
            mod.setNome(conex.rs.getString("nome"));
            
        } catch (SQLException ex) {
            
        }       
        conex.desconecta();       
        return mod;
    }        
        
}
