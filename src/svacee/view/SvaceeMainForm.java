/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package svacee.view;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;
import svacee.controller.DadosConsumoCtrl;
import svacee.model.DadosConsumo;

/**
 *
 * @author Bianca, João Daniel e Vinícius
 */
public class SvaceeMainForm extends javax.swing.JFrame {

    DadosConsumoCtrl lcsv;

    /**
     * Creates new form SvaceeMainForm
     */
    public SvaceeMainForm() {
        initComponents();
        getContentPane().setBackground(Color.white);

        bDado.setToolTipText("Obter dados a partir de arquivos CSV");
        bGrafico.setToolTipText("Obter dados a partir do gráfico");
        bTabela.setToolTipText("Obter dados a partir da tabela");
        bSobre.setToolTipText("Obter informações sobre o software");
        bSair.setToolTipText("Sair");
        

        lcsv = new DadosConsumoCtrl();

    }
    
    public void run() {

        try {

            JFileChooser jfc = new JFileChooser();
            int retorno = jfc.showOpenDialog(null);
            if (retorno == JFileChooser.APPROVE_OPTION) {
                File arq = jfc.getSelectedFile();

                lcsv.obterCsv(arq);

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

        }
    }
    
    public void exibirTabela(){
        DefaultTableModel model = (DefaultTableModel) tabela.getModel();
        model.getDataVector().removeAllElements();
        
        for(DadosConsumo dc:lcsv.getDados()){
            model.addRow(new Object[]{dc.getDataHora(),dc.getPontoColeta(),dc.getValorKwh()});             
        } 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        barraFerramenta = new javax.swing.JToolBar();
        bDado = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        bTabela = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        bGrafico = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        bSobre = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        bSair = new javax.swing.JButton();
        painelGuias = new javax.swing.JTabbedPane();
        painelInicial = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        painelTabela = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        painelGrafico = new javax.swing.JPanel();
        menu = new javax.swing.JMenuBar();
        mArquivo = new javax.swing.JMenu();
        smDado = new javax.swing.JMenuItem();
        smSair = new javax.swing.JMenuItem();
        mVisualizar = new javax.swing.JMenu();
        smTabela = new javax.swing.JMenuItem();
        smGrafico = new javax.swing.JMenuItem();
        mAjuda = new javax.swing.JMenu();
        smSobre = new javax.swing.JMenuItem();

        jPanel1.setLayout(new java.awt.BorderLayout());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu SVACEE");
        setBackground(java.awt.Color.white);

        barraFerramenta.setBackground(java.awt.Color.lightGray);
        barraFerramenta.setRollover(true);

        bDado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/svacee/view/img/add_page (2).png"))); // NOI18N
        bDado.setFocusable(false);
        bDado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bDado.setMaximumSize(new java.awt.Dimension(60, 45));
        bDado.setMinimumSize(new java.awt.Dimension(60, 45));
        bDado.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bDado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDadoActionPerformed(evt);
            }
        });
        barraFerramenta.add(bDado);
        barraFerramenta.add(jSeparator1);

        bTabela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/svacee/view/img/tabela.png"))); // NOI18N
        bTabela.setFocusable(false);
        bTabela.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bTabela.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTabelaActionPerformed(evt);
            }
        });
        barraFerramenta.add(bTabela);
        barraFerramenta.add(jSeparator2);

        bGrafico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/svacee/view/img/chart (2).png"))); // NOI18N
        bGrafico.setFocusable(false);
        bGrafico.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bGrafico.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bGrafico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGraficoActionPerformed(evt);
            }
        });
        barraFerramenta.add(bGrafico);
        barraFerramenta.add(jSeparator3);

        bSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/svacee/view/img/info (2).png"))); // NOI18N
        bSobre.setFocusable(false);
        bSobre.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bSobre.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        barraFerramenta.add(bSobre);
        barraFerramenta.add(jSeparator4);

        bSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/svacee/view/img/sair.png"))); // NOI18N
        bSair.setFocusable(false);
        bSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bSair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSairActionPerformed(evt);
            }
        });
        barraFerramenta.add(bSair);

        painelInicial.setBackground(java.awt.Color.white);
        painelInicial.setForeground(java.awt.Color.white);

        jLabel2.setBackground(java.awt.Color.white);
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/svacee/view/img/loss(1).png"))); // NOI18N

        javax.swing.GroupLayout painelInicialLayout = new javax.swing.GroupLayout(painelInicial);
        painelInicial.setLayout(painelInicialLayout);
        painelInicialLayout.setHorizontalGroup(
            painelInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelInicialLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(64, 64, 64))
        );
        painelInicialLayout.setVerticalGroup(
            painelInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelInicialLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );

        painelGuias.addTab("Página Inicial", painelInicial);

        painelTabela.setBackground(java.awt.Color.white);
        painelTabela.setForeground(java.awt.Color.white);

        tabela.setForeground(java.awt.Color.black);
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Data e Hora", "Ponto de Coleta", "Valor em KwH"
            }
        ));
        jScrollPane1.setViewportView(tabela);

        javax.swing.GroupLayout painelTabelaLayout = new javax.swing.GroupLayout(painelTabela);
        painelTabela.setLayout(painelTabelaLayout);
        painelTabelaLayout.setHorizontalGroup(
            painelTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelTabelaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelTabelaLayout.setVerticalGroup(
            painelTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTabelaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        painelGuias.addTab("Tabela", painelTabela);

        painelGrafico.setBackground(java.awt.Color.white);
        painelGrafico.setForeground(java.awt.Color.white);

        javax.swing.GroupLayout painelGraficoLayout = new javax.swing.GroupLayout(painelGrafico);
        painelGrafico.setLayout(painelGraficoLayout);
        painelGraficoLayout.setHorizontalGroup(
            painelGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 453, Short.MAX_VALUE)
        );
        painelGraficoLayout.setVerticalGroup(
            painelGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 298, Short.MAX_VALUE)
        );

        painelGuias.addTab("Gráfico", painelGrafico);

        menu.setBackground(new java.awt.Color(109, 212, 247));
        menu.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        menu.setForeground(new java.awt.Color(109, 212, 247));
        menu.setAlignmentX(0.55F);
        menu.setAlignmentY(0.51F);

        mArquivo.setBackground(java.awt.Color.black);
        mArquivo.setText("Arquivo");
        mArquivo.setFont(new java.awt.Font("Droid Serif", 0, 18)); // NOI18N

        smDado.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        smDado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/svacee/view/img/add_page (2).png"))); // NOI18N
        smDado.setText("Obter Dados CSV");
        smDado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smDadoActionPerformed(evt);
            }
        });
        mArquivo.add(smDado);

        smSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        smSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/svacee/view/img/sair.png"))); // NOI18N
        smSair.setText("Sair");
        smSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smSairActionPerformed(evt);
            }
        });
        mArquivo.add(smSair);

        menu.add(mArquivo);

        mVisualizar.setBackground(java.awt.Color.black);
        mVisualizar.setText("Visualizar");
        mVisualizar.setFont(new java.awt.Font("Droid Serif", 0, 18)); // NOI18N

        smTabela.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        smTabela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/svacee/view/img/tabela.png"))); // NOI18N
        smTabela.setText("Tabela de Dados");
        smTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smTabelaActionPerformed(evt);
            }
        });
        mVisualizar.add(smTabela);

        smGrafico.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        smGrafico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/svacee/view/img/chart (2).png"))); // NOI18N
        smGrafico.setText("Gráfico de Consumo");
        smGrafico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smGraficoActionPerformed(evt);
            }
        });
        mVisualizar.add(smGrafico);

        menu.add(mVisualizar);

        mAjuda.setBackground(java.awt.Color.black);
        mAjuda.setText("Ajuda");
        mAjuda.setFont(new java.awt.Font("Droid Serif", 0, 18)); // NOI18N

        smSobre.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        smSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/svacee/view/img/info (2).png"))); // NOI18N
        smSobre.setText("Sobre");
        mAjuda.add(smSobre);

        menu.add(mAjuda);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(barraFerramenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(painelGuias, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(barraFerramenta, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelGuias, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSairActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_bSairActionPerformed

    private void smSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smSairActionPerformed
        // TODO add your handling code here:
        this.dispose();

    }//GEN-LAST:event_smSairActionPerformed

    private void bDadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDadoActionPerformed
        // TODO add your handling code here:
        run();
    }//GEN-LAST:event_bDadoActionPerformed

    private void smDadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smDadoActionPerformed
        // TODO add your handling code here:
        run();
    }//GEN-LAST:event_smDadoActionPerformed

    private void bTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTabelaActionPerformed
        // TODO add your handling code here:
        painelGuias.setSelectedComponent(painelTabela);
        exibirTabela();
    }//GEN-LAST:event_bTabelaActionPerformed

    private void smTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smTabelaActionPerformed
        // TODO add your handling code here:
        painelGuias.setSelectedComponent(painelTabela);
        exibirTabela();
        
    }//GEN-LAST:event_smTabelaActionPerformed

    private void bGraficoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGraficoActionPerformed
        // TODO add your handling code here:
        painelGuias.setSelectedComponent(painelGrafico);
    }//GEN-LAST:event_bGraficoActionPerformed

    private void smGraficoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smGraficoActionPerformed
        // TODO add your handling code here:
        painelGuias.setSelectedComponent(painelGrafico);
    }//GEN-LAST:event_smGraficoActionPerformed

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
            java.util.logging.Logger.getLogger(SvaceeMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SvaceeMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SvaceeMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SvaceeMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SvaceeMainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bDado;
    private javax.swing.JButton bGrafico;
    private javax.swing.JButton bSair;
    private javax.swing.JButton bSobre;
    private javax.swing.JButton bTabela;
    private javax.swing.JToolBar barraFerramenta;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JMenu mAjuda;
    private javax.swing.JMenu mArquivo;
    private javax.swing.JMenu mVisualizar;
    private javax.swing.JMenuBar menu;
    private javax.swing.JPanel painelGrafico;
    private javax.swing.JTabbedPane painelGuias;
    private javax.swing.JPanel painelInicial;
    private javax.swing.JPanel painelTabela;
    private javax.swing.JMenuItem smDado;
    private javax.swing.JMenuItem smGrafico;
    private javax.swing.JMenuItem smSair;
    private javax.swing.JMenuItem smSobre;
    private javax.swing.JMenuItem smTabela;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
