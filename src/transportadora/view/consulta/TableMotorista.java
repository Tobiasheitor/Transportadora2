
package transportadora.view.consulta;

import transportadora.model.Motorista;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author USUARIO
 */
public class TableMotorista extends AbstractTableModel {
    
    private List<Motorista> motoristas;
    
    public TableMotorista(List<Motorista>motoristas){
        this.motoristas = motoristas;
    }
    public void setMotorista(List<Motorista> motoristas) {
        this.motoristas = motoristas;
    }

    @Override
    public int getRowCount() {
        return motoristas.size();
    }

    @Override
    public int getColumnCount() {
        return 1;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Motorista motorista = motoristas.get(rowIndex);
        return motorista.getNome();
    }
    
    public String getColumnName(){
        return "Nome";
    }
    
}
