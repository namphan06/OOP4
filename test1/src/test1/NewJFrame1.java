/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package test1;

import javax.swing.JOptionPane;
import javax.swing.*;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.sql.*;

/**
 *
 * @author ASUS
 */
public class NewJFrame1 extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame1
     */
    public NewJFrame1() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ADD = new javax.swing.JButton();
        UPDATE = new javax.swing.JButton();
        DELETE = new javax.swing.JButton();
        CLEAR = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        SEARCH = new javax.swing.JTextField();
        NAME = new javax.swing.JTextField();
        SIM = new javax.swing.JTextField();
        DATE = new javax.swing.JTextField();
        HOMENETWORK = new javax.swing.JTextField();
        LOCATION = new javax.swing.JTextField();
        PHONE = new javax.swing.JTextField();
        PRINT = new javax.swing.JButton();
        SEARCHBUTTOM = new javax.swing.JButton();
        statistic = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "NAME", "DATE", "LOCATION", "SIM", "HOME NETWORK", "PHONE"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Name :");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("SIM :");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Phone :");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Date :");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Home Network :");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Location :");

        ADD.setText("ADD");
        ADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDActionPerformed(evt);
            }
        });

        UPDATE.setText("UPDATE");
        UPDATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UPDATEActionPerformed(evt);
            }
        });

        DELETE.setText("DELETE");
        DELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELETEActionPerformed(evt);
            }
        });

        CLEAR.setText("CLEAR");
        CLEAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLEARActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setText("Search :");

        PRINT.setText("PRINT");
        PRINT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PRINTActionPerformed(evt);
            }
        });

        SEARCHBUTTOM.setText("SEARCH");
        SEARCHBUTTOM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SEARCHBUTTOMActionPerformed(evt);
            }
        });

        statistic.setText("STATISTIC");
        statistic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statisticActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 704, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(39, 39, 39)
                                        .addComponent(ADD)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(69, 69, 69)
                                        .addComponent(UPDATE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(47, 47, 47)
                                        .addComponent(SEARCH, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(CLEAR))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(56, 56, 56)
                                        .addComponent(SEARCHBUTTOM)))))
                        .addContainerGap(191, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(NAME)
                            .addComponent(SIM, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(DATE, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(HOMENETWORK)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(PHONE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(LOCATION, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(DELETE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(PRINT)
                                        .addGap(91, 91, 91)))
                                .addComponent(statistic)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SEARCH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SEARCHBUTTOM))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(NAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DATE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LOCATION, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(SIM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HOMENETWORK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PHONE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ADD)
                    .addComponent(UPDATE)
                    .addComponent(DELETE)
                    .addComponent(CLEAR)
                    .addComponent(PRINT)
                    .addComponent(statistic))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UPDATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UPDATEActionPerformed

       if (NAME.getText().equals("") || DATE.getText().equals("")
                || LOCATION.getText().equals("") || SIM.getText().equals("")||HOMENETWORK.getText().equals("")||PHONE.getText().equals(""))
            JOptionPane.showMessageDialog(this, "Please enter all the required details.");
        else {
            boolean bl = true,tl,pl;
            bl = checkName(NAME.getText());
            tl = isValidDate(DATE.getText());
            pl = checkPhone(PHONE.getText());
            if(bl == true&&tl==true&&pl==true){
            ContactDTO ContactDTO = new ContactDTO();
            ContactDTO.setName(NAME.getText());
            ContactDTO.setDate(DATE.getText());
            ContactDTO.setLocation(LOCATION.getText());
            ContactDTO.setSim(SIM.getText());
            ContactDTO.setHomeNetWork(HOMENETWORK.getText());
            ContactDTO.setPhone(PHONE.getText());
            new ContactDAO().editContactDAO(ContactDTO);
            loadDataSeT();
            }
        }
      
    }//GEN-LAST:event_UPDATEActionPerformed

    private void DELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELETEActionPerformed
        if (jTable1.getSelectedRow() < 0)
            JOptionPane.showMessageDialog(this, "Select a contact from the table.");
        else {
            int opt = JOptionPane.showConfirmDialog(
                    this,
                    "Are you sure you want to delete this contact?",
                    "Confirmation",
                    JOptionPane.YES_NO_OPTION);
            if (opt == JOptionPane.YES_OPTION) {
                new ContactDAO().deleteContactDAO(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
                loadDataSet();
            }
        }
    }//GEN-LAST:event_DELETEActionPerformed

    private void ADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDActionPerformed

        if (NAME.getText().equals("") || DATE.getText().equals("")
                || LOCATION.getText().equals("") || SIM.getText().equals("")||HOMENETWORK.getText().equals("")||PHONE.getText().equals(""))
            JOptionPane.showMessageDialog(this, "Please enter all the required details.");
        else {
            boolean bl = true,tl,pl;
            bl = checkName(NAME.getText());
            tl = isValidDate(DATE.getText());
            pl = checkPhone(PHONE.getText());
            if(bl == true&&tl==true&&pl==true){
            ContactDTO ContactDTO = new ContactDTO();
            ContactDTO.setName(NAME.getText());
            ContactDTO.setDate(DATE.getText());
            ContactDTO.setLocation(LOCATION.getText());
            ContactDTO.setSim(SIM.getText());
            ContactDTO.setHomeNetWork(HOMENETWORK.getText());
            ContactDTO.setPhone(PHONE.getText());
            new ContactDAO().addContactDAO(ContactDTO);
            loadDataSeT();
            }
        }
    }//GEN-LAST:event_ADDActionPerformed

    private void CLEARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLEARActionPerformed
        NAME.setText("");
        DATE.setText("");
        LOCATION.setText("");
        SIM.setText("");
        HOMENETWORK.setText("");
        PHONE.setText("");
    }//GEN-LAST:event_CLEARActionPerformed

    private void PRINTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PRINTActionPerformed
        new ContactDAO().getQueryResult();
        loadDataSeT();
    }//GEN-LAST:event_PRINTActionPerformed

    private void SEARCHBUTTOMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SEARCHBUTTOMActionPerformed
        if (SEARCH.getText().equals(""))
            JOptionPane.showMessageDialog(this, "Please enter all the required details.");
        else {
           loadSearchData(SEARCH.getText());
        }
    }//GEN-LAST:event_SEARCHBUTTOMActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int row = jTable1.getSelectedRow();
        int col = jTable1.getColumnCount();
        Object[] data = new Object[col];

        for (int i = 0; i < col; i++)
            data[i] = jTable1.getValueAt(row, i);
        NAME.setText((String) data[0]);
        DATE.setText((String) data[1]);
        LOCATION.setText((String) data[2]);
        SIM.setText((String) data[3]);
        HOMENETWORK.setText((String) data[4]);
        PHONE.setText((String) data[5]);
    }//GEN-LAST:event_jTable1MouseClicked

    private void statisticActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statisticActionPerformed
    String url = "jdbc:sqlserver://localhost:1433;databaseName=test;integratedSecurity=true;" + "encrypt=true;trustServerCertificate=true";
    String query = "SELECT sim, COUNT(*) AS contact_count FROM Contacts GROUP BY sim";
    String user = "sa";
    String password = "nam42160";

    try (Connection connection = DriverManager.getConnection(url, user, password);
         Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
         ResultSet resultSet = statement.executeQuery(query)) {

        resultSet.last();
        int rowCount = resultSet.getRow();
        resultSet.beforeFirst();

        String[] simTypes = new String[rowCount];
        int[] contactCounts = new int[rowCount];
        int index = 0;

        while (resultSet.next()) {
            simTypes[index] = resultSet.getString("sim");
            contactCounts[index] = resultSet.getInt("contact_count");
            index++;
        }

        LineChartWithDatabase chart = new LineChartWithDatabase(simTypes, contactCounts);
        JFrame frame = new JFrame("statistic sim");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(600, 400);
        frame.add(chart);
        frame.setVisible(true);

    } catch (SQLException e) {
        e.printStackTrace();
    }
    }//GEN-LAST:event_statisticActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADD;
    private javax.swing.JButton CLEAR;
    private javax.swing.JTextField DATE;
    private javax.swing.JButton DELETE;
    private javax.swing.JTextField HOMENETWORK;
    private javax.swing.JTextField LOCATION;
    private javax.swing.JTextField NAME;
    private javax.swing.JTextField PHONE;
    private javax.swing.JButton PRINT;
    private javax.swing.JTextField SEARCH;
    private javax.swing.JButton SEARCHBUTTOM;
    private javax.swing.JTextField SIM;
    private javax.swing.JButton UPDATE;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton statistic;
    // End of variables declaration//GEN-END:variables


    private void loadDataSeT() {
       try {
            ContactDAO ContactDAO = new ContactDAO();
            jTable1.setModel(ContactDAO.buildTableModel(ContactDAO.getQueryResult()));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void loadDataSet() {
        try {
            ContactDAO ContactDAO = new ContactDAO();
            jTable1.setModel(ContactDAO.buildTableModel(ContactDAO.getQueryResult()));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void loadSearchData(String text) {
         try {
            ContactDAO ContactDAO = new ContactDAO();
            jTable1.setModel(ContactDAO.buildTableModel(ContactDAO.getContactSearch(text)));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private void custTableMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_custTableMouseClicked
        int row = jTable1.getSelectedRow();
        int col = jTable1.getColumnCount();
        Object[] data = new Object[col];

        for (int i = 0; i < col; i++)
            data[i] = jTable1.getValueAt(row, i);
        NAME.setText((String) data[0]);
        DATE.setText((String) data[1]);
        LOCATION.setText((String) data[2]);
        SIM.setText((String) data[3]);
        HOMENETWORK.setText((String) data[4]);
        PHONE.setText((String) data[5]);
    }
    private boolean checkName(String name){
         if(name.matches("^[a-zA-Z\\s]+$")) {
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Invalid name");
            return false;
        }
    }
    public boolean isValidDate(String dateString) {
        Pattern dateRegexPattern = Pattern.compile("(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((19|20)\\d\\d)");
        Matcher dateMatcher = dateRegexPattern.matcher(dateString);

        if (dateMatcher.matches()) {

           dateMatcher.reset();

           if (dateMatcher.find()) {
               String day = dateMatcher.group(1);
               String month = dateMatcher.group(2);
               int year = Integer.parseInt(dateMatcher.group(3));

               if ("31".equals(day) && 
                  ("4".equals(month) || "6".equals(month) || "9".equals(month) ||
                   "11".equals(month) || "04".equals(month) || "06".equals(month) || 
                   "09".equals(month))) {
                   JOptionPane.showMessageDialog(this, "Invalid date");
                   return false; // 1, 3, 5, 7, 8, 10, 12 has 31 days
               } else if ("2".equals(month) || "02".equals(month)) {
                    //leap year
                    boolean bl ,vl;
                    if (year % 4 == 0) {
                        bl=!"30".equals(day) && !"31".equals(day);
                        if(bl == false){
                            JOptionPane.showMessageDialog(this, "Invalid date");
                        }
                        return bl;
                    } else {
                        vl=!"29".equals(day) && !"30".equals(day) && !"31".equals(day);
                        if(vl == false){
                            JOptionPane.showMessageDialog(this, "Invalid date");
                        }
                        return vl;
                    }
                    
               } else {
                   return true;
               }
           } else {
               JOptionPane.showMessageDialog(this, "Invalid date");
               return false;
           }
        } else {
            JOptionPane.showMessageDialog(this, "Invalid date");
            return false;
        }
    }
    private boolean checkPhone(String str){
        String reg = "(84|0[35789])+([0-9]{8})\\b";
        boolean kt = str.matches(reg);
        if (kt == false) {
            JOptionPane.showMessageDialog(this, "Invalid phone");
            return false;
        } else {
            return true;
        }
    }
}
