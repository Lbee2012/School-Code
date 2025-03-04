/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package db;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class chuotView extends javax.swing.JFrame {

    /**
     * Creates new form chuotView
     */
    Connection db = DB.getConnect();
    ArrayList<chuot> chuot = new ArrayList<>();
    
    public chuotView() {
        initComponents();
    }

    
    void load() {
        DefaultTableModel tb = (DefaultTableModel) tbn.getModel();
        tb.setRowCount(0);
        for(chuot ch : chuot) {
            tb.addRow(new Object[] {
                ch.getMa(),
                ch.getTen(),
                ch.isThuNghiem()
            });
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbn = new javax.swing.JTable();
        load = new javax.swing.JButton();
        loadbo = new javax.swing.JButton();
        rmdb = new javax.swing.JButton();
        editdb = new javax.swing.JButton();
        id = new javax.swing.JScrollPane();
        ma = new javax.swing.JTextPane();
        yes = new javax.swing.JRadioButton();
        no = new javax.swing.JRadioButton();
        cbo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        add = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbn.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Tên", "Thử nghiệm"
            }
        ));
        tbn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbnMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbn);

        load.setText("Load DB");
        load.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadActionPerformed(evt);
            }
        });

        loadbo.setText("Load CBO");
        loadbo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadboActionPerformed(evt);
            }
        });

        rmdb.setText("Remove DB");
        rmdb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rmdbActionPerformed(evt);
            }
        });

        editdb.setText("Edit DB");
        editdb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editdbActionPerformed(evt);
            }
        });

        id.setViewportView(ma);

        buttonGroup1.add(yes);
        yes.setText("Đã thử");

        buttonGroup1.add(no);
        no.setText("Chưa thử");
        no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noActionPerformed(evt);
            }
        });

        cbo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jame", "Cringe", "Phong", "TienThanh29" }));

        jLabel1.setText("ID");

        jLabel2.setText("Tên");

        jLabel3.setText("Thử nghiệm");

        add.setText("Add DB");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(load)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(loadbo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rmdb)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editdb)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(add))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(yes, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(no, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(133, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(yes)
                .addGap(7, 7, 7)
                .addComponent(no)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(load)
                    .addComponent(loadbo)
                    .addComponent(rmdb)
                    .addComponent(editdb)
                    .addComponent(add))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noActionPerformed

    private void loadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadActionPerformed
        // TODO add your handling code here:
        if (db != null) {
            chuot.clear();
            try {
                ResultSet result = db.prepareStatement("SELECT * FROM conChuot.dbo.thongTinConChuot").executeQuery();
                while(result.next()) {
                    chuot.add(new chuot(result.getInt("id"), result.getString("ten"), result.getInt("thuNghiem") == 0 ? false : true));
                }
                load();
            } catch (Exception e) {
                System.out.print(e);
            }
        }
    }//GEN-LAST:event_loadActionPerformed

    private void loadboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadboActionPerformed
        // TODO add your handling code here:
        DefaultComboBoxModel c = (DefaultComboBoxModel) cbo.getModel();
        c.removeAllElements();
        for(chuot ch : chuot) {
            c.addElement(ch.getTen());
        }
    }//GEN-LAST:event_loadboActionPerformed

    private void rmdbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rmdbActionPerformed
        // TODO add your handling code here:
        if (db != null) {
            try {
                ResultSet result = db.prepareStatement(
                        "DELETE conChuot.dbo.thongTinConChuot WHERE id = " + ma.getText() + "; Select * FROM conChuot.dbo.thongTinConChuot"
                ).executeQuery();
                chuot.clear();
                while(result.next()) {
                    chuot.add(new chuot(result.getInt("id"), result.getString("ten"), result.getInt("thuNghiem") == 0 ? false : true));
                }
                load();
            } catch (Exception e) {
                System.out.print(e);
            }
        }
    }//GEN-LAST:event_rmdbActionPerformed

    private void editdbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editdbActionPerformed
        // TODO add your handling code here:
        if (db != null) {
            try {
                int row = tbn.getSelectedRow();
                String c = String.format("N\'%s\'", cbo.getSelectedItem().toString());
                ResultSet result = db.prepareStatement(
                        "UPDATE conChuot.dbo.thongTinConChuot SET ten = " + c + " WHERE id = " + ma.getText() + "; Select * FROM conChuot.dbo.thongTinConChuot"
                ).executeQuery();
                chuot.clear();
                while(result.next()) {
                    chuot.set(row, new chuot(result.getInt("id"), result.getString("ten"), result.getInt("thuNghiem") == 0 ? false : true));
                }
            } catch (Exception e) {
                System.out.print(e);
            }
        }
    }//GEN-LAST:event_editdbActionPerformed

    private void tbnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbnMouseClicked
        // TODO add your handling code here:
        chuot ch = chuot.get(tbn.getSelectedRow());
        ma.setText(String.valueOf(ch.getMa()));
        cbo.setSelectedItem(ch.getTen());
        if(ch.isThuNghiem()) yes.setSelected(true);
        else no.setSelected(true);
    }//GEN-LAST:event_tbnMouseClicked

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        if (db != null) {
            try {
                String a = String.format("(%s, N\'%s\', %s)", ma.getText(), cbo.getSelectedItem().toString(), String.valueOf(yes.isSelected() ? 1 : 0));
                ResultSet result = db.prepareStatement(
                        "INSERT conChuot.dbo.thongTinConChuot VALUES " + a + "; Select * FROM conChuot.dbo.thongTinConChuot"
                ).executeQuery();
                chuot.clear();
                while(result.next()) {
                    chuot.add(new chuot(result.getInt("id"), result.getString("ten"), result.getInt("thuNghiem") == 0 ? false : true));
                }
                load();
            } catch (Exception e) {
                System.out.print(e);
            }
        }
    }//GEN-LAST:event_addActionPerformed

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
            java.util.logging.Logger.getLogger(chuotView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(chuotView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(chuotView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(chuotView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new chuotView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbo;
    private javax.swing.JButton editdb;
    private javax.swing.JScrollPane id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton load;
    private javax.swing.JButton loadbo;
    private javax.swing.JTextPane ma;
    private javax.swing.JRadioButton no;
    private javax.swing.JButton rmdb;
    private javax.swing.JTable tbn;
    private javax.swing.JRadioButton yes;
    // End of variables declaration//GEN-END:variables
}
