/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transportadora.view.consulta;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import transportadora.model.Caminhao;

/**
 *
 * @author USUARIO
 */
public class TableCaminhoes extends AbstractTableModel{
    List<Caminhao> caminhoes;
    
    public TableCaminhoes(List<Caminhao>caminhoes){
        this.caminhoes = caminhoes;
    }
    public void setCaminhao(List<Caminhao> caminhoes) {
        this.caminhoes = caminhoes;
    }
    
    @Override
    public int getRowCount() {
        return caminhoes.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Caminhao cam = caminhoes.get(rowIndex);
        if(columnIndex == 0){
            return cam.getNome();
        }else{
            return cam.getCapacidade();
        }
    }
    @Override
    public String getColumnName(int columnIndex){
        if(columnIndex == 0){
            return "NOME";
        }else
        return "CAPACIDADE";
    }
    
}
