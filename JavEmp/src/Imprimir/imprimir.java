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
import jxl.write.WritableCellFormat;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
//import jxl.write.*;
import jxl.write.Label;
public class imprimir {
	public void excelTabela(JTable table) {
		try {
                      String filename = "C:\\javaEmp/Tabela de Produtos/Tabela_de_Produtos.xls";
		      WorkbookSettings ws = new WorkbookSettings();
		      ws.setLocale(new Locale("en", "EN"));
		      WritableWorkbook workbook = Workbook.createWorkbook(new File(filename), ws);
		      WritableSheet s = workbook.createSheet("Folha1", 0);
                      
                      for(int j=0; j<table.getColumnCount(); j++){
                         for(int i=0;i<table.getRowCount();i++){                     
                             String componente = String.valueOf(table.getValueAt(i, j).toString());
                             WritableCellFormat cf2 = new WritableCellFormat();
                              Label label = new Label(j,i, componente , cf2);
                              s.addCell(label);
                            }
                      }
		      workbook.write();
		      workbook.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
        
                public String getDataAtual() {
                    Calendar calendar = new GregorianCalendar();
                    Date data = new Date(System.currentTimeMillis());  
                    //SimpleDateFormat formatarDate = new SimpleDateFormat("dd/MM/yyyy"); 
                    SimpleDateFormat formatarDate = new SimpleDateFormat("dd-MM-yyyy_(HH-mm-ss)"); 

                    return formatarDate.format(data);  
                }
    
        	public void excelPedido(JTable table, String cliente) {
		try {
                      String nomeArquivo = cliente + "_" + getDataAtual() +".xls";
                      JOptionPane.showMessageDialog(null, nomeArquivo);
                      String filename = "C:\\javaEmp/Pedidos/" + nomeArquivo;
		      WorkbookSettings ws = new WorkbookSettings();
		      ws.setLocale(new Locale("en", "EN"));
		      WritableWorkbook workbook = Workbook.createWorkbook(new File(filename), ws);
		      WritableSheet s = workbook.createSheet("Folha1", 0);
                      
                      for(int j=0; j<table.getColumnCount(); j++){
                         for(int i=0;i<table.getRowCount();i++){                     
                             String componente = String.valueOf(table.getValueAt(i, j).toString());
                             WritableCellFormat cf2 = new WritableCellFormat();
                              Label label = new Label(j,i, componente , cf2);
                              s.addCell(label);
                            }
                      }
		      workbook.write();
		      workbook.close();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
	}
        
}