/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transportadora.view.consulta;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import transportadora.model.Fornecedor;

/**
 *
 * @author USUARIO
 */
public class TableFornecedores extends AbstractTableModel{
    
    List<Fornecedor> fornecedores;
    
    public TableFornecedores(List<Fornecedor>fornecedores){
        this.fornecedores = fornecedores;
    }
    public void setFornecedor(List<Fornecedor> fornecedores) {
        this.fornecedores = fornecedores;
    }

    @Override
    public int getRowCount() {
        return fornecedores.size();
    }

    @Override
    public int getColumnCount() {
        return 1;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Fornecedor fornecedor = fornecedores.get(rowIndex);
        return fornecedor.getNome();
    }
    
    public String getColumnName(){
        return "FORNECEDORES";
    }
    
}
