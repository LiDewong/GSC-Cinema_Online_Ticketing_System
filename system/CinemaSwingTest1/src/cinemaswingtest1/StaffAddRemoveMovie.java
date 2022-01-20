
package cinemaswingtest1;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class StaffAddRemoveMovie extends javax.swing.JFrame {

    public StaffAddRemoveMovie() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"No Time To Die", "25 Nov 2021", "Daniel Craig, Rami Malek, Ana de Armas", "In No Time To Die, Bond has left active service and is enjoying a tranquil life in Jamaica. His peace is short-lived when his old friend Felix Leiter from the CIA turns up asking for help. The mission to rescue a kidnappted scientist turns out to be far more treachrous than expected, leading Bond onto the trail of a mysterious villain armed with dangerous new technology.", "20/01/22, 21/01/22, 22/01/22", "9:00AM, 3:00PM, 9:00 PM"},
                {"Eternals", "04 Nov 2021", "Angelina Jolie, Salma Hayek, Richard Madden", "The saga of the Eternals, a race of immortal beings who lived on Earth and shaped its history and civilizations.", "20/01/22, 21/01/22, 22/01/22", "9:00AM, 3:00PM, 9:00 PM"},
                {"The Medium", "02 Dec 2021", " Narilya Gulmongkolpech, Sawanee Utoomma, Sirani Yankittikan", "A horrifying story of a shaman's inheritance in the Isan region of Thailand. What could be possessing a family member might not be the Goddess they make it out to be.", "20/01/22, 21/01/22, 22/01/22", "9:00AM, 3:00PM, 9:00 PM"},
                {"Ghostbusters: Afterlife", "02 Dec 2021", "Carrie Coon, Mckenna Grace, Finn Wolfhard, Paul Rudd", "From director Jason Reitman and producer Ivan Reitman, comes the next chapter in the original Ghostbusters universe in Ghostbusters Afterlife, when a single mom and her two kids arrive in a small town, they begin to discover their connection to the original ghostbusters and the secret legacy their grandfather left behind. The film is written by Jason Reitman Gil Kenan.", "20/01/22, 21/01/22, 22/01/22", "9:00AM, 3:00PM, 9:00 PM"},
                {"Sing 2", "30 Dec 2021", "Matthew McConaughey, Scarlett Johansson, Reese Witherspoon", "Years after the singin competition, Buster Moon's shows have turned into an unqualified success. Howver, the others are facing troubles. Rosita still hasn't chosen a record label to sign with. Mike is a family man and has quit jazz to become a singer. Ash, still not used to life without her boyfriend, does performances at an old restaurant. Johnny has become a faous singer but he is finding it hard to persuade a record label to help him with his career. Meena, now part of choir, has difficulties earning the trust of her newfound friend. But when a gang of lowlifes tear down the whole town, Buster has to reunite the gang, look for new contestants and even sing a tune or two himself", "20/01/22, 21/01/22, 22/01/22", "9:00AM, 3:00PM, 9:00 PM"}
            },
            new String [] {
                "Title", "Release Date", "Casts", "Synopsis", "Day", "Time"
            }
        ));
        jTable1.setRowHeight(23);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(20);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(20);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(20);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 1000, 300));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton1.setText("Back To Option");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, 140, 37));

        btnAdd.setBackground(new java.awt.Color(255, 255, 51));
        btnAdd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 140, 37));

        btnRemove.setBackground(new java.awt.Color(255, 255, 51));
        btnRemove.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });
        getContentPane().add(btnRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, 140, 37));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinemaswingtest1/image/mainmenu/black 2.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        
        StaffAddMovie mainMenu=new StaffAddMovie();
        mainMenu.show();     //display Main Menu here
        
        dispose(); 
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        
        //get jtable model first
        DefaultTableModel tblModel=(DefaultTableModel)jTable1.getModel();
        //delete row
        if(jTable1.getSelectedRowCount()==1){
           //if single row is selected than delete
           tblModel.removeRow(jTable1.getSelectedRow());
        }
        else{
            if(jTable1.getRowCount()==0){
                JOptionPane.showMessageDialog(this, "Table is Empty.");
            }
            else{
                JOptionPane.showMessageDialog(this, "Please select Single Row for Delete.");
            }
        }
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        StaffMainMenu mainMenu=new StaffMainMenu();
        mainMenu.show();     //display Main Menu here
        
        dispose(); 
    }//GEN-LAST:event_jButton1ActionPerformed
    public static void AddRowToJTable(Object[] dataRow){
        DefaultTableModel tblModel=(DefaultTableModel)jTable1.getModel();
        tblModel.addRow(dataRow);
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
            java.util.logging.Logger.getLogger(StaffAddRemoveMovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StaffAddRemoveMovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StaffAddRemoveMovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StaffAddRemoveMovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StaffAddRemoveMovie().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
