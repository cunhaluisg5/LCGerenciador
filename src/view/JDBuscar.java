/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.ArquivoDAO;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.Arquivo;

/**
 *
 * @author luisg
 */
public class JDBuscar extends javax.swing.JDialog {

    DefaultTableModel modelo = new DefaultTableModel();
    List<Arquivo> arquivos;
    ArquivoDAO dao = new ArquivoDAO();
    
    public JDBuscar(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        buscarArquivos();
    }

    private void buscarArquivos(){
        arquivos = dao.buscarArquivos();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grFiltros = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        tfCampo = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        brNome = new javax.swing.JRadioButton();
        brTipo = new javax.swing.JRadioButton();
        brTodos = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbInfo = new javax.swing.JTable();
        btLimpar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Buscar");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tfCampo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfCampoKeyReleased(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Filtros", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        grFiltros.add(brNome);
        brNome.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        brNome.setSelected(true);
        brNome.setText("Nome");
        brNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brNomeActionPerformed(evt);
            }
        });

        grFiltros.add(brTipo);
        brTipo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        brTipo.setText("Tipo");
        brTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brTipoActionPerformed(evt);
            }
        });

        grFiltros.add(brTodos);
        brTodos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        brTodos.setText("Todos");
        brTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brTodosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(brNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(brTipo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(brTodos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(brNome)
                .addComponent(brTipo)
                .addComponent(brTodos))
        );

        tbInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Arquivo", "Conta", "Tipo", "Data", "Detalhes"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbInfo.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tbInfo);
        if (tbInfo.getColumnModel().getColumnCount() > 0) {
            tbInfo.getColumnModel().getColumn(0).setResizable(false);
            tbInfo.getColumnModel().getColumn(1).setResizable(false);
            tbInfo.getColumnModel().getColumn(2).setResizable(false);
            tbInfo.getColumnModel().getColumn(3).setResizable(false);
            tbInfo.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(tfCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        btLimpar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/limpar.png"))); // NOI18N
        btLimpar.setText("Limpar");
        btLimpar.setMaximumSize(new java.awt.Dimension(140, 40));
        btLimpar.setPreferredSize(new java.awt.Dimension(140, 40));

        btSair.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sair.png"))); // NOI18N
        btSair.setText("Sair");
        btSair.setMaximumSize(new java.awt.Dimension(140, 40));
        btSair.setPreferredSize(new java.awt.Dimension(140, 40));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(579, 480));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfCampoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCampoKeyReleased
        String campo = tfCampo.getText().trim();
        if(!campo.isEmpty()){
            List<Arquivo> arq = null;
            if(brNome.isSelected()){
                arq = dao.buscarArquivoFiltro("nomeArquivo", campo);
            }else if(brTipo.isSelected()){
                arq = dao.buscarArquivoFiltro("tipoArquivo", campo);
            }
            completaTabela(arq);
        }
    }//GEN-LAST:event_tfCampoKeyReleased

    private void brTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brTodosActionPerformed
        if(brTodos.isSelected()){
            completaTabela(arquivos);
        }
    }//GEN-LAST:event_brTodosActionPerformed

    private void brNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brNomeActionPerformed
        if(brNome.isSelected())
            tfCampo.setEnabled(true);
    }//GEN-LAST:event_brNomeActionPerformed

    private void brTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brTipoActionPerformed
        if(brTipo.isSelected())
            tfCampo.setEnabled(true);
    }//GEN-LAST:event_brTipoActionPerformed

    private void completaTabela(List<Arquivo> arq){
        limpaTabela();
        modelo = (DefaultTableModel) tbInfo.getModel();
        for(Arquivo a : arq){
            modelo.addRow(new Object[]{
                a.getNomeArquivo(),
                a.getNomeConta(),
                a.getTipoArquivo(),
                a.getDataCriacao(),
                a.getDetalhes()
            });
        }
    }
    
    private void limpaTabela(){
        for(int i = tbInfo.getRowCount() - 1; i >= 0; --i){ 
            modelo.removeRow(i); 
        } 
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JDBuscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDBuscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDBuscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDBuscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDBuscar dialog = new JDBuscar(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton brNome;
    private javax.swing.JRadioButton brTipo;
    private javax.swing.JRadioButton brTodos;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSair;
    private javax.swing.ButtonGroup grFiltros;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbInfo;
    private javax.swing.JTextField tfCampo;
    // End of variables declaration//GEN-END:variables
}
