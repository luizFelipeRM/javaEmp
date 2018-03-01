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
            PreparedStatement pst = conex.con.prepareStatement("insert into compra(nome,valor,quantidade,data) values(?,?,?,?)");
            pst.setString(1, mod.getNomeClienteCompra());
            pst.setDouble(2, mod.getValorCompral());
            pst.setInt(3, mod.getQuantidadeCompra());
            pst.setString(4, mod.getData());
            
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados /n"+ex);
        }
        conex.desconecta();
    }
    
    
    
    
    
}
