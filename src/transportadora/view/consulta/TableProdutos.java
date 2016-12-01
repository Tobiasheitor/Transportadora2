/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transportadora.view.consulta;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import transportadora.model.Produto;

/**
 *
 * @author USUARIO
 */
public class TableProdutos extends AbstractTableModel{
    
    List<Produto> produtos;
    
    public TableProdutos(List<Produto>produtos){
        this.produtos = produtos;
    }
    public void setProduto(List<Produto> produtos) {
        this.produtos = produtos;
    }
    
    @Override
    public int getRowCount() {
        return produtos.size();
    }

    @Override
    public int getColumnCount() {
        return 1;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Produto produto = produtos.get(rowIndex);
        return produto.getNome();
    }
    
    @Override
    public String getColumnName(int num){
        return "PRODUTOS";
    }
}
