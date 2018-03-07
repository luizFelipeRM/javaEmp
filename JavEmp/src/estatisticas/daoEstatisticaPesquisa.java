/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estatisticas;

import DB.ConnectMYSQL;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author luiz
 */
public class daoEstatisticaPesquisa {
            beansEstatisticaPedidos beans = new beansEstatisticaPedidos();
            ConnectMYSQL conex = new ConnectMYSQL();

    
     public beansEstatisticaPedidos buscar(beansEstatisticaPedidos mod){
        conex.conectar(); 
        try {   
            
            conex.executaSql("select *from compraFeita where nome like'%" + mod.getPesquisa()+ "%'");
            conex.rs.first();
            
            mod.setId(conex.rs.getInt("id"));
            mod.setNome(conex.rs.getString("nome"));
            mod.setMarca(conex.rs.getString("marca"));
            mod.setValor(conex.rs.getDouble("valor"));
            mod.setQuantidade(conex.rs.getInt("quantidade"));
            mod.setData(conex.rs.getString("data"));
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar compra \n"+ex);
        }       
        conex.desconecta();       
        return mod;
    }  
     
     
      public void Salvar(beansEstatisticaPedidos mod) {
        conex.conectar();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into compraFeita(clienteCompraFeita, nomeCompraFeita, valorCompraFeita, quantidadeCompraFeita, marcaCompraFeita, mesCompraFeita) values(?,?,?,?,?,?)");
            pst.setString   (1, mod.getNomeCliente());
            pst.setString   (2, mod.getNome());
            pst.setDouble   (3, mod.getValor());
            pst.setInt      (4, mod.getQuantidade());
            pst.setString   (5, mod.getMarca());
            pst.setString   (6, mod.getData());
            
            pst.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados /n"+ex);
        }
        conex.desconecta();
    }
     public void Excluir(beansEstatisticaPedidos mod){
        conex.conectar();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from compraFeita where idCompraFeita=?");
            pst.setInt(1, mod.getId());
            pst.execute();
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Erro ao excluir dados/nErro:" +ex);
        }
        
        conex.desconecta();
        
    }
      
      
     
}