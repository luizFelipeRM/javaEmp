
package Funcionarios;

import DB.ConnectMYSQL;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class daoFuncionarios {
    ConnectMYSQL conex = new ConnectMYSQL();
    beansFuncionarios mod = new beansFuncionarios();
    
    public void Salvar(beansFuncionarios mod){
        conex.conectar();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into funcionarios(usuario,senha,cargo,ramal,nomecompleto,email,rua,bairro,cpf) values(?,?,?,?,?,?,?,?,?)");
            pst.setString(1, mod.getUsuario());
            pst.setString(2, mod.getSenha());
            pst.setString(3, mod.getCargo());
            pst.setInt   (4, mod.getRamal());
            pst.setString(5, mod.getNomeCompleto());
            pst.setString(6, mod.getEmail());
            pst.setString(7, mod.getRua());
            pst.setString(8, mod.getBairro());
            pst.setLong   (9, mod.getCpf());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados /n"+ex);
        }
        conex.desconecta();
    }
    
    public void excluir(beansFuncionarios mod){
        conex.conectar();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from funcionarios where id=?");
            pst.setInt(1, mod.getId());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados excluidos com sucessos");
        } catch (SQLException ex) {
            Logger.getLogger(daoFuncionarios.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao excluir dados/nErro:" +ex);
        }
        conex.desconecta();
    }
    
    public void editar(beansFuncionarios mod) {
      conex.conectar();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update funcionarios set usuario=?, senha=?, cargo=?, ramal=?, nomecompleto=?, email =?, rua =?, bairro=?, cpf=? where id=?"); //alteração
            pst.setString   (1, mod.getUsuario());
            pst.setString   (2, mod.getSenha());
            pst.setString   (3, mod.getCargo());
            pst.setInt      (4, mod.getRamal());
            pst.setString   (5, mod.getNomeCompleto());
            pst.setString   (6, mod.getEmail());
            pst.setString   (7, mod.getRua());
            pst.setString   (8, mod.getBairro());
            pst.setLong      (9, mod.getCpf());
            pst.setInt      (10, mod.getId());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados alterados com sucessos");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na alteração dos dados /nErro:"+ex );
        }
      conex.desconecta();
    }
          
    public beansFuncionarios buscar(beansFuncionarios mod){
        conex.conectar(); 
        try {  
            // preencherTabela("select *from funcionarios order by usuario");
            conex.executaSql("select *from produtos where nome like'%" + mod.getPesquisa()+ "%'"+"and tipo like'"+mod.getTipoPesquisa()+"'");
            conex.rs.first();
            mod.setId(conex.rs.getInt("id"));
            mod.setUsuario(conex.rs.getString("usuario"));
            mod.setCargo(conex.rs.getString("cargo"));
            mod.setSenha(conex.rs.getString("senha")); 
            mod.setRamal(conex.rs.getInt("ramal"));
            mod.setNomeCompleto(conex.rs.getString("nomecompleto"));
            mod.setEmail(conex.rs.getString("email"));
            mod.setRua(conex.rs.getString("rua"));
            mod.setBairro(conex.rs.getString("bairro"));
            mod.setCpf(conex.rs.getLong("cpf"));
        } catch (SQLException ex) {
            
        }       
        conex.desconecta();       
        return mod;
    }        
    
}
