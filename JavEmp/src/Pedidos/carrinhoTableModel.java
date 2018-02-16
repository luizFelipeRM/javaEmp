package Pedidos;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class carrinhoTableModel extends AbstractTableModel{

    private List<beansCarrinho> dados = new ArrayList<>();
    private String[] colunas = {"Produto","QTD","Valor"};

    @Override
    public String getColumnName(int column) {
        return colunas[column]; //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public int getRowCount() {
        return dados.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        
        switch(coluna){
            case 0:
                return dados.get(linha).getDescricao();
            case 1:
                return dados.get(linha).getQtd();
            case 2: 
                return dados.get(linha).getValor();
        }
        
        return null;
        
    }
    
    public void getValor(int linha){
        dados.get(linha).getValor();
    }
    
    
    public void setQuantidade(int linha, int quantidade){
       double valor = dados.get(linha).getValor() / dados.get(linha).getQtd();
       dados.get(linha).setQtd(quantidade);  
       dados.get(linha).setValor(dados.get(linha).getQtd() * valor);
    }
    
    public void addRow(beansCarrinho p){
        this.dados.add(p);
        this.fireTableDataChanged();
    }
    
    public void removeRow(int linha){
        this.dados.remove(linha);
        this.fireTableDataChanged();
    }
    public void removeRows(int linha,int linha2){
        this.dados.remove(linha);
        this.fireTableRowsDeleted(linha, linha2);   
    }
  }


