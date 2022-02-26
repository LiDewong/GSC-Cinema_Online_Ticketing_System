
package cinemaswingtest1;

import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class StaffAddMovie extends javax.swing.JFrame {

    /**
     * Creates new form StaffAddMovie
     */
    public StaffAddMovie() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtTitle = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCast = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        txtSynopsis = new javax.swing.JTextField();
        label1 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        txtDay = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txtTime = new javax.swing.JTextField();
        label = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTitleActionPerformed(evt);
            }
        });
        getContentPane().add(txtTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 290, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Release Date");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 114, -1));
        getContentPane().add(txtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 290, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cast");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 103, -1));
        getContentPane().add(txtCast, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 290, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Synopsis");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 114, -1));

        btnAdd.setBackground(new java.awt.Color(255, 255, 51));
        btnAdd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 540, 140, 37));
        getContentPane().add(txtSynopsis, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 460, 290, 30));

        label1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("Title");
        getContentPane().add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 114, -1));

        label2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        label2.setForeground(new java.awt.Color(255, 255, 255));
        label2.setText("Day");
        getContentPane().add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 250, 114, -1));

        label3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        label3.setForeground(new java.awt.Color(255, 255, 255));
        label3.setText("Time");
        getContentPane().add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 320, 114, -1));
        getContentPane().add(txtDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 250, 290, 30));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Upload Image");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 157, -1));
        getContentPane().add(txtTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 320, 290, 30));
        getContentPane().add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, 165, 204));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinemaswingtest1/image/mainmenu/black 2.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser fileChooser=new JFileChooser();
        FileNameExtensionFilter filter=new FileNameExtensionFilter("4 Extensions Supported","jpg","png","jpeg","gif");
        fileChooser.setFileFilter(filter);
        int selected=fileChooser.showOpenDialog(null);
        if(selected==JFileChooser.APPROVE_OPTION){
            File file=fileChooser.getSelectedFile();
            String getselectedImage=file.getAbsolutePath();
            JOptionPane.showMessageDialog(null,getselectedImage);
            ImageIcon imIco=new ImageIcon(getselectedImage);
            //make image fit
            Image imFit=imIco.getImage();
            Image imgFit=imFit.getScaledInstance(label.getWidth(),label.getHeight(),Image.SCALE_SMOOTH);
            label.setIcon(new ImageIcon(imgFit));
            Global.Url = getselectedImage;
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        //code to load date into table
        //validation for not leave blank data
        if(txtTitle.getText().equals("")||txtDate.getText().equals("")||txtCast.getText().equals("")||
                txtSynopsis.getText().equals("")||txtDay.getText().equals("")||txtTime.getText().equals("")||
                label.getIcon()==null){
            //if any field left blank then show message
            JOptionPane.showMessageDialog(this, "Please Enter All Data !");
        }
        else{
            //successfully added message
            JOptionPane.showMessageDialog(this,"Add Data Successfully !");
        
        StaffAddRemoveMovie mainMenu=new StaffAddRemoveMovie();
        mainMenu.show();     
        
        dispose(); 
        }
        
        StaffAddRemoveMovie.AddRowToJTable(new Object[]{
                                                        txtTitle.getText(),
                                                        txtDate.getText(),
                                                        txtCast.getText(),
                                                        txtSynopsis.getText(),
                                                        txtDay.getText(),
                                                        txtTime.getText()
        }); 
        
        try {
            String title = txtTitle.getText();
            String date = txtDate.getText();
            String cast = txtCast.getText();
            String synopsis = txtSynopsis.getText();
            String day =txtDay.getText();
            String time =txtTime.getText();
            String url = Global.Url;
            
            API.createMovie(title, date, cast, synopsis, day, time, url);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTitleActionPerformed

    }//GEN-LAST:event_txtTitleActionPerformed

    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StaffAddMovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StaffAddMovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StaffAddMovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StaffAddMovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StaffAddMovie().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel label;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JTextField txtCast;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtDay;
    private javax.swing.JTextField txtSynopsis;
    private javax.swing.JTextField txtTime;
    private javax.swing.JTextField txtTitle;
    // End of variables declaration//GEN-END:variables
}
