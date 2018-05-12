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
 * @author Luiz Felipe
 */
public class daoParcelas {
        ConnectMYSQL conex = new ConnectMYSQL();
        beansParcela mod = new beansParcela();
        
        
        
   public void Salvar(beansParcela mod) {
        conex.conectar();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into parcelas(nome,valor,parcelanum,data,valorTotalRestante,valorTotal) values(?,?,?,?,?,?)");
            pst.setString(1, mod.getNome());
            pst.setDouble(2, mod.getValor());
            pst.setInt   (3, mod.getParcelaNum());
            pst.setString(4, mod.getData());
            pst.setDouble   (5, mod.getValorTotalRestante());
            pst.setDouble(6, mod.getValorTotal());
       
            pst.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados /n"+ex);
        }
        conex.desconecta();
    }        
    public void Excluir(beansParcela mod){
        conex.conectar();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from parcelas where id=?");
            pst.setInt(1, mod.getId());
            pst.execute();
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Erro ao excluir dados/nErro:" +ex);
        }
        
        conex.desconecta();
        
    }

    public beansParcela Buscar(beansParcela mod){
        conex.conectar(); 
        try {   
            
            conex.executaSql("select *from parcelas where nome like'%" + mod.getBuscar()+ "%'");
            conex.rs.first();
            
            mod.setId(conex.rs.getInt("id"));
            mod.setNome(conex.rs.getString("nome"));
            mod.setValor(conex.rs.getDouble("valor"));
            mod.setValorTotalRestante(conex.rs.getInt("valorTotalRestante"));
            mod.setData(conex.rs.getString("data"));            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Nenhuma parcela registrada com esse nome");
        }       
        conex.desconecta();       
        return mod;
    }      
}
