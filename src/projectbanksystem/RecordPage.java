/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projectbanksystem;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.*;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
/**
 *
 * @author nakka
 */
public class RecordPage extends javax.swing.JFrame {

    /**
     * Creates new form RecordPage
     */
    public RecordPage() {
        initComponents();
        loadFileLocation();
        loadAccounts();
        setLocationRelativeTo(null);
        pack();
        
//        try{
//            txtRecord.setText("");
//        for (TransactionRecord transactionRecord : transactionRecords) {
//            String recordString = String.format("%d | %-10s | %-12s | %,.2f%n",
//                    transactionRecord.getTransactionNumber(),
//                    transactionRecord.getTransactionType(), 
//                    transactionRecord.getTransactionDate(), 
//                    transactionRecord.getTransactionAmount());
//            txtRecord.append(recordString);
//        }}catch (NullPointerException e){JOptionPane.showMessageDialog(null, "ERROR "+e);}
    }
    
    HashMap<String, Account> hashAccount = new HashMap<>();
    private int nextAccountNumber = 1;
    private List<TransactionRecord> transactionRecords = new ArrayList<>();
    private File lastLoadedFile;
    
    
    public List<TransactionRecord> getAllTransactionRecords() {
        return transactionRecords;
    }
    
    public void addTransactionRecord(TransactionRecord record) {
        transactionRecords.add(record);
    }
    
    
    
//    private void saveAccounts() {
//        try {
//            FileOutputStream fos = new FileOutputStream("accounts.dat");
//            ObjectOutputStream oos = new ObjectOutputStream(fos);
//            AccountData data = new AccountData(hashAccount, nextAccountNumber, transactionRecords);
//            oos.writeObject(data);
//            oos.close();
//            fos.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
    
    private void saveAccounts() {
        File file = lastLoadedFile;// Get selected file
        try {
            // create an output stream for writing to the selected file
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            AccountData data = new AccountData(hashAccount, nextAccountNumber, transactionRecords);
            oos.writeObject(data); // Write data to file
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    

//    private void loadAccounts() {
//        try {
//            FileInputStream fis = new FileInputStream("accounts.dat");
//            ObjectInputStream ois = new ObjectInputStream(fis);
//            AccountData data = (AccountData) ois.readObject();
//            hashAccount = data.getAccounts();
//            nextAccountNumber = data.getNextAccountNumber();
//            transactionRecords = data.getTransactionRecords();
//            ois.close();
//            fis.close();
//        } catch (IOException | ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//    }
    
    private void loadAccounts() {
        if (lastLoadedFile != null) { // If last loaded file location exists, use it
            try {
                FileInputStream fis = new FileInputStream(lastLoadedFile);
                ObjectInputStream ois = new ObjectInputStream(fis);

                AccountData data = (AccountData) ois.readObject();

                hashAccount = data.getAccounts();
                nextAccountNumber = data.getNextAccountNumber();
                transactionRecords = data.getTransactionRecords();

                ois.close();
                fis.close();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        } else { // Otherwise, show open dialog
            JFileChooser fileChooser = new JFileChooser();
            int result = fileChooser.showOpenDialog(null);

            if (result == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                try {
                    FileInputStream fis = new FileInputStream(file);
                    ObjectInputStream ois = new ObjectInputStream(fis);

                    AccountData data = (AccountData) ois.readObject();

                    hashAccount = data.getAccounts();
                    nextAccountNumber = data.getNextAccountNumber();
                    transactionRecords = data.getTransactionRecords();

                    ois.close();
                    fis.close();

                    lastLoadedFile = file; // Store the loaded file location as lastLoadedFile
                } catch (IOException | ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    
    private void loadFileLocation() {
        try {
            FileInputStream fis = new FileInputStream("fileLocation.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            FileLocationSaver fileLocation = (FileLocationSaver) ois.readObject();
            lastLoadedFile = fileLocation.getLastedLoadedFile();
            ois.close();
            fis.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
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

        jLabel1 = new javax.swing.JLabel();
        btnGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        panelBorder1 = new Swing.PanelBorder();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtRecord = new javax.swing.JTextArea();
        txtNumber = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnShow = new javax.swing.JButton();
        rdAll = new javax.swing.JRadioButton();
        rdNumber = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        panelBorder2 = new Swing.PanelBorder();
        txtDigit = new javax.swing.JTextField();
        labelAmount1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        btnDelete = new javax.swing.JButton();
        btnShow1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(14, 36, 32));
        jPanel1.setPreferredSize(new java.awt.Dimension(919, 468));

        panelBorder1.setBackground(new java.awt.Color(39, 89, 71));

        txtRecord.setEditable(false);
        txtRecord.setColumns(20);
        txtRecord.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtRecord.setRows(5);
        jScrollPane1.setViewportView(txtRecord);

        txtNumber.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Show Account Number");

        btnShow.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnShow.setForeground(new java.awt.Color(14, 36, 32));
        btnShow.setText("Show");
        btnShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowActionPerformed(evt);
            }
        });

        btnGroup1.add(rdAll);
        rdAll.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        rdAll.setForeground(new java.awt.Color(255, 255, 255));
        rdAll.setSelected(true);
        rdAll.setText("All");

        btnGroup1.add(rdNumber);
        rdNumber.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        rdNumber.setForeground(new java.awt.Color(255, 255, 255));
        rdNumber.setText("Number");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Back");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        panelBorder2.setBackground(new java.awt.Color(14, 36, 32));

        txtDigit.setColumns(16);
        txtDigit.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        labelAmount1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        labelAmount1.setForeground(new java.awt.Color(255, 255, 255));
        labelAmount1.setText("Digit");

        txtArea.setEditable(false);
        txtArea.setColumns(20);
        txtArea.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtArea.setRows(5);
        jScrollPane2.setViewportView(txtArea);

        btnDelete.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(14, 36, 32));
        btnDelete.setText("delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnShow1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnShow1.setForeground(new java.awt.Color(14, 36, 32));
        btnShow1.setText("Show");
        btnShow1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShow1ActionPerformed(evt);
            }
        });

        panelBorder2.setLayer(txtDigit, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelBorder2.setLayer(labelAmount1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelBorder2.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelBorder2.setLayer(btnDelete, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelBorder2.setLayer(btnShow1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout panelBorder2Layout = new javax.swing.GroupLayout(panelBorder2);
        panelBorder2.setLayout(panelBorder2Layout);
        panelBorder2Layout.setHorizontalGroup(
            panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addComponent(labelAmount1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDigit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnShow1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete)))
                .addGap(32, 32, 32))
        );
        panelBorder2Layout.setVerticalGroup(
            panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDigit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelAmount1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnShow1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDelete)))
                .addGap(16, 16, 16)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
        );

        panelBorder1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelBorder1.setLayer(txtNumber, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelBorder1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelBorder1.setLayer(btnShow, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelBorder1.setLayer(rdAll, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelBorder1.setLayer(rdNumber, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelBorder1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelBorder1.setLayer(panelBorder2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addComponent(rdAll)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdNumber))
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnShow))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(panelBorder2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdAll)
                    .addComponent(rdNumber))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(btnShow))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelBorder2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addGap(32, 32, 32))
        );

        jPanel5.setBackground(new java.awt.Color(39, 89, 71));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/bank.png"))); // NOI18N
        jLabel6.setText(" Bank System Record");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/gross-dark-cross 1.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(8, 8, 8))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel7)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1143, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        Main m = new Main();
        m.setVisible(true);
        saveAccounts();
        dispose();
        
        addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
                saveAccounts();
                
            }
            
        
        });
        
    }//GEN-LAST:event_jLabel2MouseClicked

    private void btnShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowActionPerformed
        // TODO add your handling code here:
//        int accountNumber = Integer.parseInt(txtNumber.getText());
        if(rdAll.isSelected()){
            try{
            txtRecord.setText("no| Transactions |    Date   |  amount  |\n");
                for (TransactionRecord transactionRecord : transactionRecords) {
                String recordString = String.format(" %d | %-10s | %-12s | %,.2f%n",
                    transactionRecord.getTransactionNumber(),
                    transactionRecord.getTransactionType(), 
                    transactionRecord.getTransactionDate(), 
                    transactionRecord.getTransactionAmount());
                txtRecord.append(recordString);
                }
            }catch (NullPointerException e){JOptionPane.showMessageDialog(null, "ERROR "+e);}
        }
        else{
            int accountNumber = Integer.parseInt(txtNumber.getText());
//            txtRecord.setText("NONE");
            try{
            txtRecord.setText("no| Transactions |    Date   |  amount  |\n");
                for (TransactionRecord transactionRecord : transactionRecords) {
                    if(transactionRecord.getTransactionNumber()== accountNumber){
                    String recordString = String.format(" %d | %-10s | %-12s | %,.2f%n",
                    transactionRecord.getTransactionNumber(),
                    transactionRecord.getTransactionType(), 
                    transactionRecord.getTransactionDate(), 
                    transactionRecord.getTransactionAmount());
                txtRecord.append(recordString);
                    }
//                String recordString = String.format("%d | %-10s | %-12s | %,.2f%n",
//                    transactionRecord.getTransactionNumber(),
//                    transactionRecord.getTransactionType(), 
//                    transactionRecord.getTransactionDate(), 
//                    transactionRecord.getTransactionAmount());
//                txtRecord.append(recordString);
                }
            }catch (NullPointerException e){
                txtRecord.setText("ERROR");
                JOptionPane.showMessageDialog(null, "ERROR "+e);
            }
            
        }
    }//GEN-LAST:event_btnShowActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        //Create object
        try{
            int accountNumber = Integer.parseInt(txtDigit.getText());
            Account account = hashAccount.get(txtDigit.getText());
            double amount = account.balance;
            hashAccount.remove(txtDigit.getText());
            JOptionPane.showMessageDialog(null,
                "account number : " + txtDigit.getText()
                + "\n" + account.information() + "\n removed!");

            String transactionType = "CLOSE";
            LocalDate transactionDate = LocalDate.now();
            TransactionRecord record = new TransactionRecord(transactionType, transactionDate, accountNumber ,amount);
            addTransactionRecord(record);
        } catch( NumberFormatException e ){
            JOptionPane.showMessageDialog(null, "Please, fill account digit number");
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Account not found");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnShow1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShow1ActionPerformed
        // TODO add your handling code here:
        try {
            int accountNNumber = Integer.parseInt(txtDigit.getText());
            Account account = hashAccount.get(txtDigit.getText());
            txtArea.setText(account.information());
        } catch( NumberFormatException e ){
            JOptionPane.showMessageDialog(null, "Please, fill account digit number");
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Account not found");
        }
    }//GEN-LAST:event_btnShow1ActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel7MouseClicked

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
            java.util.logging.Logger.getLogger(RecordPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RecordPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RecordPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RecordPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RecordPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.ButtonGroup btnGroup1;
    private javax.swing.JButton btnShow;
    private javax.swing.JButton btnShow1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelAmount1;
    private Swing.PanelBorder panelBorder1;
    private Swing.PanelBorder panelBorder2;
    private javax.swing.JRadioButton rdAll;
    private javax.swing.JRadioButton rdNumber;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextField txtDigit;
    private javax.swing.JTextField txtNumber;
    private javax.swing.JTextArea txtRecord;
    // End of variables declaration//GEN-END:variables
}
