/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Produtos;

import DB.ConnectMYSQL;
import Funcionarios.daoFuncionarios;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author tiago
*/
public class daoProdutos {
    ConnectMYSQL conex = new ConnectMYSQL();
    beansProdutos mod = new beansProdutos();
    
    public void Salvar(beansProdutos mod) {
        conex.conectar();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into produtos(nome,tipo,valor,estoque) values(?,?,?,?)");
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getTipo());
            pst.setDouble(3, mod.getValor());
            pst.setInt   (4, mod.getEstoque());
            
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados /n"+ex);
        }
        conex.desconecta();
    }
    
    
    
    public void excluir(beansProdutos mod){
        conex.conectar();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from produtos where id=?");
            pst.setInt(1, mod.getId());
            pst.execute();
             JOptionPane.showMessageDialog(null, "Dados excluidos com sucessos");
            
        } catch (SQLException ex) {
            Logger.getLogger(daoFuncionarios.class.getName()).log(Level.SEVERE, null, ex);
             JOptionPane.showMessageDialog(null, "Erro ao excluir dados/nErro:" +ex);
        }
        
        conex.desconecta();
        
    }
    
    public void editar(beansProdutos mod){
      conex.conectar();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update produtos set nome=?, tipo=?, valor=?, estoque=? where id=?"); //alteração
            pst.setString   (1, mod.getNome());
            pst.setString   (2, mod.getTipo());
            pst.setDouble   (3, mod.getValor());
            pst.setInt      (4, mod.getEstoque());
            pst.setInt      (5, mod.getId());
            
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados alterados com sucessos");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na alteração dos dados /nErro:"+ex );
        }
        
      conex.desconecta();
        
    }
    
    public void editarQuantidade(beansProdutos mod){
        conex.conectar();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update produtos set estoque=? where id=?"); //alteração
            pst.setInt      (1, mod.getEstoque());
            pst.setInt      (2, mod.getId());
            
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados alterados com sucessos");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na alteração dos dados /nErro:"+ex );
        }
        
        
    }
    
    public beansProdutos buscar(beansProdutos mod){
        conex.conectar(); 
        try {  
            // preencherTabela("select *from funcionarios order by usuario");
            conex.executaSql("select *from produtos where nome like'%" + mod.getPesquisa()+ "%'"+"and tipo like'"+mod.getTipoPesquisa()+"'");
            conex.rs.first();
            mod.setId(conex.rs.getInt("id"));
            mod.setNome(conex.rs.getString("nome"));
            mod.setTipo(conex.rs.getString("tipo"));
            mod.setValor(conex.rs.getDouble("valor"));
            mod.setEstoque(conex.rs.getInt("estoque")); 
            
        } catch (SQLException ex) {
            
        }       
        conex.desconecta();       
        return mod;
    }        


    
        
    
    
    
}
