/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projectbanksystem;

import java.awt.CardLayout;

/**
 *
 * @author nakka
 */
public class TestTabPane extends javax.swing.JFrame {

    /**
     * Creates new form TestTabPane
     */
    public TestTabPane() {
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

        jSplitPane2 = new javax.swing.JSplitPane();
        panelMenu = new javax.swing.JPanel();
        panelRegis = new javax.swing.JPanel();
        lblRegis = new javax.swing.JLabel();
        panelDeposit = new javax.swing.JPanel();
        lblDeposit = new javax.swing.JLabel();
        panelWithdraw = new javax.swing.JPanel();
        lblWithdraw = new javax.swing.JLabel();
        panelRecord = new javax.swing.JPanel();
        lblRecord = new javax.swing.JLabel();
        panelContent = new javax.swing.JPanel();
        panelRegister = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        contentPanelDeposit = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        contentPanelWithdraw = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        contentPanelRecord = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane2.setDividerLocation(250);
        jSplitPane2.setDividerSize(0);

        panelMenu.setBackground(new java.awt.Color(204, 255, 204));

        lblRegis.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lblRegis.setText("Register & Close");
        lblRegis.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));

        javax.swing.GroupLayout panelRegisLayout = new javax.swing.GroupLayout(panelRegis);
        panelRegis.setLayout(panelRegisLayout);
        panelRegisLayout.setHorizontalGroup(
            panelRegisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegisLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRegis, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelRegisLayout.setVerticalGroup(
            panelRegisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRegisLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRegis, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addContainerGap())
        );

        lblDeposit.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lblDeposit.setText("Deposit");
        lblDeposit.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));

        javax.swing.GroupLayout panelDepositLayout = new javax.swing.GroupLayout(panelDeposit);
        panelDeposit.setLayout(panelDepositLayout);
        panelDepositLayout.setHorizontalGroup(
            panelDepositLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDepositLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDeposit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelDepositLayout.setVerticalGroup(
            panelDepositLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDepositLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDeposit, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addContainerGap())
        );

        lblWithdraw.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lblWithdraw.setText("Withdraw");
        lblWithdraw.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));

        javax.swing.GroupLayout panelWithdrawLayout = new javax.swing.GroupLayout(panelWithdraw);
        panelWithdraw.setLayout(panelWithdrawLayout);
        panelWithdrawLayout.setHorizontalGroup(
            panelWithdrawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelWithdrawLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblWithdraw, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelWithdrawLayout.setVerticalGroup(
            panelWithdrawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelWithdrawLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblWithdraw, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addContainerGap())
        );

        lblRecord.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lblRecord.setText("Record");
        lblRecord.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));

        javax.swing.GroupLayout panelRecordLayout = new javax.swing.GroupLayout(panelRecord);
        panelRecord.setLayout(panelRecordLayout);
        panelRecordLayout.setHorizontalGroup(
            panelRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRecordLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRecord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelRecordLayout.setVerticalGroup(
            panelRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRecordLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblRecord, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelRecord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelWithdraw, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelRegis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelDeposit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addComponent(panelRegis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelWithdraw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelRecord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(311, Short.MAX_VALUE))
        );

        jSplitPane2.setLeftComponent(panelMenu);

        panelContent.setBackground(new java.awt.Color(153, 204, 255));
        panelContent.setLayout(new java.awt.CardLayout());

        jLabel1.setText("REGISTER");

        javax.swing.GroupLayout panelRegisterLayout = new javax.swing.GroupLayout(panelRegister);
        panelRegister.setLayout(panelRegisterLayout);
        panelRegisterLayout.setHorizontalGroup(
            panelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegisterLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addContainerGap(686, Short.MAX_VALUE))
        );
        panelRegisterLayout.setVerticalGroup(
            panelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegisterLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addContainerGap(508, Short.MAX_VALUE))
        );

        panelContent.add(panelRegister, "card5");

        contentPanelDeposit.setBackground(new java.awt.Color(102, 102, 102));

        jLabel2.setText("DEPOSIT");

        javax.swing.GroupLayout contentPanelDepositLayout = new javax.swing.GroupLayout(contentPanelDeposit);
        contentPanelDeposit.setLayout(contentPanelDepositLayout);
        contentPanelDepositLayout.setHorizontalGroup(
            contentPanelDepositLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelDepositLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel2)
                .addContainerGap(685, Short.MAX_VALUE))
        );
        contentPanelDepositLayout.setVerticalGroup(
            contentPanelDepositLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelDepositLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel2)
                .addContainerGap(522, Short.MAX_VALUE))
        );

        panelContent.add(contentPanelDeposit, "card3");

        contentPanelWithdraw.setBackground(new java.awt.Color(153, 153, 153));

        jLabel3.setText("Withdraw");

        javax.swing.GroupLayout contentPanelWithdrawLayout = new javax.swing.GroupLayout(contentPanelWithdraw);
        contentPanelWithdraw.setLayout(contentPanelWithdrawLayout);
        contentPanelWithdrawLayout.setHorizontalGroup(
            contentPanelWithdrawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelWithdrawLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jLabel3)
                .addContainerGap(634, Short.MAX_VALUE))
        );
        contentPanelWithdrawLayout.setVerticalGroup(
            contentPanelWithdrawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelWithdrawLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel3)
                .addContainerGap(507, Short.MAX_VALUE))
        );

        panelContent.add(contentPanelWithdraw, "card4");

        contentPanelRecord.setBackground(new java.awt.Color(204, 204, 204));

        jLabel4.setText("Record");

        javax.swing.GroupLayout contentPanelRecordLayout = new javax.swing.GroupLayout(contentPanelRecord);
        contentPanelRecord.setLayout(contentPanelRecordLayout);
        contentPanelRecordLayout.setHorizontalGroup(
            contentPanelRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelRecordLayout.createSequentialGroup()
                .addGap(318, 318, 318)
                .addComponent(jLabel4)
                .addContainerGap(427, Short.MAX_VALUE))
        );
        contentPanelRecordLayout.setVerticalGroup(
            contentPanelRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelRecordLayout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(jLabel4)
                .addContainerGap(432, Short.MAX_VALUE))
        );

        panelContent.add(contentPanelRecord, "card2");

        jSplitPane2.setRightComponent(panelContent);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane2)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(TestTabPane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TestTabPane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TestTabPane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TestTabPane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TestTabPane().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contentPanelDeposit;
    private javax.swing.JPanel contentPanelRecord;
    private javax.swing.JPanel contentPanelWithdraw;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JLabel lblDeposit;
    private javax.swing.JLabel lblRecord;
    private javax.swing.JLabel lblRegis;
    private javax.swing.JLabel lblWithdraw;
    private javax.swing.JPanel panelContent;
    private javax.swing.JPanel panelDeposit;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelRecord;
    private javax.swing.JPanel panelRegis;
    private javax.swing.JPanel panelRegister;
    private javax.swing.JPanel panelWithdraw;
    // End of variables declaration//GEN-END:variables
}