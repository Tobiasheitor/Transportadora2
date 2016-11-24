
package transportadora.view;

import transportadora.view.cadastro.CadastroCaminhaoView;
import transportadora.view.cadastro.CadastroFornecedorView;
import transportadora.view.cadastro.CadastroMotoristaView;
import transportadora.view.cadastro.CadastroProdutoView;
import transportadora.view.consulta.ConsultaPedidoView;


/**
 *
 * @author USUARIO
 */
public class FrameView extends javax.swing.JFrame {

    /**
     * Creates new form FrameView
     */
    public FrameView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu1 = new java.awt.PopupMenu();
        jMenuBar = new javax.swing.JMenuBar();
        jMenuCadastro = new javax.swing.JMenu();
        jCadasFornecedor = new javax.swing.JMenuItem();
        jCadasCaminhao = new javax.swing.JMenuItem();
        jCadasMotorista = new javax.swing.JMenuItem();
        jCadasProduto = new javax.swing.JMenuItem();
        jMenuConsulta = new javax.swing.JMenu();
        jConPedidos = new javax.swing.JMenuItem();
        jConMotorista = new javax.swing.JMenuItem();
        jConProdutos = new javax.swing.JMenuItem();
        jConCaminhoes = new javax.swing.JMenuItem();
        jMenuPedido = new javax.swing.JMenu();

        popupMenu1.setLabel("popupMenu1");
        popupMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popupMenu1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setSize(new java.awt.Dimension(300, 300));

        jMenuCadastro.setText("CADASTRO");
        jMenuCadastro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jCadasFornecedor.setText("FORNECEDOR");
        jCadasFornecedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCadasFornecedorMouseClicked(evt);
            }
        });
        jCadasFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCadasFornecedorActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jCadasFornecedor);

        jCadasCaminhao.setText("CAMINHAO");
        jCadasCaminhao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCadasCaminhaoActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jCadasCaminhao);

        jCadasMotorista.setText("MOTORISTA");
        jCadasMotorista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCadasMotoristaActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jCadasMotorista);

        jCadasProduto.setText("PRODUTO");
        jCadasProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCadasProdutoActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jCadasProduto);

        jMenuBar.add(jMenuCadastro);

        jMenuConsulta.setText("CONSULTA");
        jMenuConsulta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jConPedidos.setText("PEDIDOS");
        jConPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConPedidosActionPerformed(evt);
            }
        });
        jMenuConsulta.add(jConPedidos);

        jConMotorista.setText("MOTORISTAS");
        jMenuConsulta.add(jConMotorista);

        jConProdutos.setText("PRODUTOS");
        jMenuConsulta.add(jConProdutos);

        jConCaminhoes.setText("CAMINHOES");
        jMenuConsulta.add(jConCaminhoes);

        jMenuBar.add(jMenuConsulta);

        jMenuPedido.setText("NOVO PEDIDO");
        jMenuBar.add(jMenuPedido);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 498, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 261, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void popupMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popupMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_popupMenu1ActionPerformed

    private void jCadasFornecedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCadasFornecedorMouseClicked
       
    }//GEN-LAST:event_jCadasFornecedorMouseClicked

    private void jCadasFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCadasFornecedorActionPerformed
        // TODO add your handling code here:
        CadastroFornecedorView forn = new CadastroFornecedorView();
        forn.setVisible(true);
    }//GEN-LAST:event_jCadasFornecedorActionPerformed

    private void jCadasCaminhaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCadasCaminhaoActionPerformed
        // TODO add your handling code here:
        CadastroCaminhaoView cam = new CadastroCaminhaoView();
        cam.setVisible(true);
    }//GEN-LAST:event_jCadasCaminhaoActionPerformed

    private void jCadasProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCadasProdutoActionPerformed
        // TODO add your handling code here:
        CadastroProdutoView prod = new CadastroProdutoView();
        prod.setVisible(true);
    }//GEN-LAST:event_jCadasProdutoActionPerformed

    private void jCadasMotoristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCadasMotoristaActionPerformed
        // TODO add your handling code here:
        CadastroMotoristaView moto = new CadastroMotoristaView();
        moto.setVisible(true);
    }//GEN-LAST:event_jCadasMotoristaActionPerformed

    private void jConPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConPedidosActionPerformed
        // TODO add your handling code here:
        ConsultaPedidoView pedido = new ConsultaPedidoView();
        pedido.setVisible(true);
    }//GEN-LAST:event_jConPedidosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jCadasCaminhao;
    private javax.swing.JMenuItem jCadasFornecedor;
    private javax.swing.JMenuItem jCadasMotorista;
    private javax.swing.JMenuItem jCadasProduto;
    private javax.swing.JMenuItem jConCaminhoes;
    private javax.swing.JMenuItem jConMotorista;
    private javax.swing.JMenuItem jConPedidos;
    private javax.swing.JMenuItem jConProdutos;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenu jMenuConsulta;
    private javax.swing.JMenu jMenuPedido;
    private java.awt.PopupMenu popupMenu1;
    // End of variables declaration//GEN-END:variables
}