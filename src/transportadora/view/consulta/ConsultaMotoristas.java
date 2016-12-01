/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transportadora.view.consulta;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import transportadora.dao.DataBase;
import transportadora.dao.MotoristaDAO;
import transportadora.model.Motorista;

public class ConsultaMotoristas extends javax.swing.JFrame {

    public ConsultaMotoristas() {
        initComponents();
        inicializar();
    }
    
    public void inicializar(){
         try {
            motoristaDao = new MotoristaDAO(DataBase.getEntyManegerFactory());
        } catch (Exception ex) {
            Logger.getLogger(ConsultaMotoristas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        motoristas = new ArrayList<>();
        motoristas = motoristaDao.findMotoristaEntities();
        consultaMotorista = new TableMotorista(motoristas);
        jTabelaMotoristas.setModel(consultaMotorista);
        consultaMotorista.fireTableDataChanged();
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTabelaMotoristas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        jTabelaMotoristas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTabelaMotoristas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                ""
            }
        ));
        jTabelaMotoristas.setToolTipText("");
        jTabelaMotoristas.setName("ge"); // NOI18N
        jScrollPane1.setViewportView(jTabelaMotoristas);
        jTabelaMotoristas.getAccessibleContext().setAccessibleName("nome");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("MOTORISTAS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaMotoristas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabelaMotoristas;
    // End of variables declaration//GEN-END:variables
    private MotoristaDAO motoristaDao;
    private Motorista motorista;
    private List<Motorista> motoristas;
    private TableMotorista consultaMotorista;
}
