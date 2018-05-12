/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pedidos;

import DB.ConnectMYSQL;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author luiz
 */
public class daoPedidos {
    
    ConnectMYSQL conex = new ConnectMYSQL();
    beansPedido mod = new beansPedido();
    
    public void Salvar(beansPedido mod) {
        conex.conectar();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into compra(nome,valor,quantidade,data,parcela) values(?,?,?,?,?)");
            pst.setString(1, mod.getNomeClienteCompra());
            pst.setDouble(2, mod.getValorCompral());
            pst.setInt   (3, mod.getQuantidadeCompra());
            pst.setString(4, mod.getData());
            pst.setInt   (5, mod.getParcela());
       
            pst.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados /n"+ex);
        }
        conex.desconecta();
    }
    
    public void Excluir(beansPedido mod){
        conex.conectar();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from compra where id=?");
            pst.setInt(1, mod.getIdCompra());
            pst.execute();
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Erro ao excluir dados/nErro:" +ex);
        }
        
        conex.desconecta();
        
    }
    
    public beansPedido Buscar(beansPedido mod){
        conex.conectar(); 
        try {   
            
            conex.executaSql("select *from compra where nome like'%" + mod.getPesquisa()+ "%'");
            conex.rs.first();
            
            mod.setIdCompra(conex.rs.getInt("id"));
            mod.setNomeClienteCompra(conex.rs.getString("nome"));
            mod.setValorCompra(conex.rs.getDouble("valor"));
            mod.setQuantidadeCompra(conex.rs.getInt("quantidade"));
            mod.setData(conex.rs.getString("data"));            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Esse Cliente Não Fez um Pedido");
        }       
        conex.desconecta();       
        return mod;
    }  
       
    
    
}
