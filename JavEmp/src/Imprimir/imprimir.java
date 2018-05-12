package imprimir;

import java.awt.Component;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import jxl.Workbook;
import jxl.WorkbookSettings;
import jxl.format.Alignment;
import jxl.format.Border;
import jxl.format.BorderLineStyle;
import jxl.format.Colour;
import jxl.write.WritableCellFormat;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
//import jxl.write.*;
import jxl.write.Label;
import jxl.write.WritableFont;
public class imprimir {

    
	public void excelTabela(JTable table) {
		try {
                      String filename = "C:\\javaEmp/Tabela de Produtos/Tabela_de_Produtos.xls";
		      WorkbookSettings ws = new WorkbookSettings();
		      ws.setLocale(new Locale("en", "EN"));

		      WritableWorkbook workbook = Workbook.createWorkbook(new File(filename), ws);
                      
		      WritableSheet s = workbook.createSheet("Folha1", 0);
                      
                      s.setColumnView(0, 10); //id
                      s.setColumnView(1, 60); //nome
                      s.setColumnView(2, 40); //tipo
                      s.setColumnView(3, 30); //marca
                      s.setColumnView(4, 20); //preço
                      s.setColumnView(5, 20); //quantidade                      
                      
                      WritableFont bold = new WritableFont(WritableFont.ARIAL, 10, WritableFont.BOLD);
                      
                      bold.setColour(Colour.BLACK);
                     
                      
                      WritableCellFormat cf2 = new WritableCellFormat(bold);
                      cf2.setBackground(Colour.BLUE);
                      cf2.setAlignment(Alignment.CENTRE);
                      cf2.setBorder(Border.ALL,BorderLineStyle.MEDIUM,Colour.BLACK);
                      
                   
                      WritableCellFormat cf1 = new WritableCellFormat(bold);
                      cf1.setBackground(Colour.WHITE);
                      cf1.setAlignment(Alignment.CENTRE);
                      cf1.setBorder(Border.ALL,BorderLineStyle.MEDIUM,Colour.BLACK);
                      
                      
                      Label idPrincipal = new Label(0, 0 , "Id", cf2);
                      Label nomeProduto = new Label(1, 0 , "Nome", cf2);                      
                      Label tipoProduto = new Label(2, 0 , "Tipo", cf2);
                      Label marcaPrincipal = new Label(3, 0 , "Marca", cf2);
                      Label precoPrincipal = new Label(4, 0 , "Preço", cf2);
                      Label quantidadePrincipal = new Label(5, 0 , "Quantidade", cf2);
                      
                      
                      s.addCell(idPrincipal);
                      s.addCell(nomeProduto);
                      s.addCell(tipoProduto);
                      s.addCell(marcaPrincipal);
                      s.addCell(precoPrincipal);
                      s.addCell(quantidadePrincipal);
                      
                      
                      for(int j=0; j<table.getColumnCount(); j++){
                         for(int i=0;i<table.getRowCount();i++){                     
                             String componente = String.valueOf(table.getValueAt(i, j).toString());
                              Label label = new Label(j,i+1, componente , cf1);
                              s.addCell(label);
                            }
                      }
		      workbook.write();
		      workbook.close();
                JOptionPane.showMessageDialog(null, "Arquivo enviado à pasta da tabela de produtos");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
        
                public String getDataAtual() {
                    Calendar calendar = new GregorianCalendar();
                    Date data = new Date(System.currentTimeMillis());  
                    SimpleDateFormat formatarDate = new SimpleDateFormat("(dd-MM-yyyy) [HH.mm.ss] "); 

                    return formatarDate.format(data);  
                }
                
                public String getDateAtual() {
                    Calendar calendar = new GregorianCalendar();
                    Date data = new Date(System.currentTimeMillis());  
                    SimpleDateFormat formatarDate = new SimpleDateFormat("dd-MM-yyyy (HH:mm)"); 

                    return formatarDate.format(data);  
                }    
                
                
        	public void excelPedido(JTable table, String cliente, String preço, String parcela, String preçoPorParcela) {
		try {
                      String nomeArquivo = getDataAtual() + cliente + ".xls";
                      String filename = "C:\\javaEmp/Pedidos/" + nomeArquivo;
		      WorkbookSettings ws = new WorkbookSettings();
		      ws.setLocale(new Locale("en", "EN"));
		      WritableWorkbook workbook = Workbook.createWorkbook(new File(filename), ws);
		      WritableSheet s = workbook.createSheet("Folha1", 0);
                      
                      s.setColumnView(0, 60); //nome
                      s.setColumnView(1, 20); //quantidade 
                      s.setColumnView(2, 20); //preço
                      s.setColumnView(3, 40); //marca
                      
                      WritableFont bold = new WritableFont(WritableFont.ARIAL, 10, WritableFont.BOLD);
                      
                      bold.setColour(Colour.BLACK);
                      
                      WritableCellFormat cf2 = new WritableCellFormat(bold);
                      
                      cf2.setBackground(Colour.GREEN);
                      cf2.setAlignment(Alignment.CENTRE);
                      cf2.setBorder(Border.ALL,BorderLineStyle.MEDIUM,Colour.BLACK); 
                      
                      Label nomeProduto = new Label(0, 0 , "Nome", cf2);   
                      Label quantidadePrincipal = new Label(1, 0 , "Quantidade", cf2);
                      Label precoPrincipal = new Label(2, 0 , "Preço", cf2);
                      Label marcaPrincipal = new Label(3, 0 , "Marca", cf2);

                      
                      s.addCell(nomeProduto);
                      s.addCell(marcaPrincipal);
                      s.addCell(precoPrincipal);
                      s.addCell(quantidadePrincipal);
                      
                      WritableCellFormat cf1 = new WritableCellFormat(bold);
                      cf1.setBackground(Colour.WHITE);
                      cf1.setAlignment(Alignment.CENTRE);
                      cf1.setBorder(Border.ALL,BorderLineStyle.MEDIUM,Colour.BLACK);
                      
                      
                      WritableCellFormat cf0 = new WritableCellFormat(bold);
                      cf0.setBackground(Colour.YELLOW2);
                      cf0.setAlignment(Alignment.CENTRE);
                      cf0.setBorder(Border.ALL,BorderLineStyle.MEDIUM,Colour.BLACK);                      
                      
                      for(int j=0; j<table.getColumnCount(); j++){
                          
                         for(int i=0;i<table.getRowCount();i++){                     
                             String componente = String.valueOf(table.getValueAt(i, j).toString());

                              Label label = new Label(j,i+1, componente , cf1);
                              s.addCell(label);
                            }
                         if(j == 0){
                              Label labelTeste = new Label(j,table.getRowCount()+1, cliente , cf0);
                              s.addCell(labelTeste);
                         }else if(j == 1){
                             if(preçoPorParcela.equals(preço)){
                              Label labelTeste = new Label(j,table.getRowCount()+1, "Sem Parcelas", cf0);
                              s.addCell(labelTeste);                                   
                             }else{
                              Label labelTeste = new Label(j,table.getRowCount()+1, parcela+"x"+ preçoPorParcela, cf0);
                              s.addCell(labelTeste);  
                             }
                         }else if(j == 2){
                              Label labelTeste = new Label(j,table.getRowCount()+1, preço , cf0);
                              s.addCell(labelTeste);                                             
                         }else if(j == 3){
                              Label labelTeste = new Label(j,table.getRowCount()+1, getDateAtual() , cf0);
                              s.addCell(labelTeste);     
                         }      
                      }
		      workbook.write();
		      workbook.close();
                      JOptionPane.showMessageDialog(null, "Arquivo enviado à pasta de pedidos");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
	}
        
}