package cinemaswingtest1;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MovieTime extends javax.swing.JFrame {

    private String day = "", time;
    
    /**
     * Creates new form MovieTime
     */
    public MovieTime() {
        initComponents();
        
        btnDay1.setText("20/01/22");
        btnDay2.setText("21/01/22");
        btnDay3.setText("22/01/22");
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
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel9am = new javax.swing.JLabel();
        jLabel3pm = new javax.swing.JLabel();
        jLabel9pm = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnDay1 = new javax.swing.JButton();
        btnDay2 = new javax.swing.JButton();
        btnDay3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1050, 640));
        setMinimumSize(new java.awt.Dimension(1050, 640));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinemaswingtest1/image/mainmenu/logo (1).png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 95, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Select Date");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 145, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Select Time");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 362, 130, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Thu");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 73, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Fri");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, 73, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Sat");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 210, 73, -1));

        jLabel9am.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel9am.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9am.setText("09:00 AM");
        jLabel9am.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9amMouseClicked(evt);
            }
        });
        getContentPane().add(jLabel9am, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, -1, -1));

        jLabel3pm.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3pm.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3pm.setText("03:00 PM");
        jLabel3pm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3pmMouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3pm, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 440, -1, -1));

        jLabel9pm.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel9pm.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9pm.setText("09:00 PM");
        jLabel9pm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9pmMouseClicked(evt);
            }
        });
        getContentPane().add(jLabel9pm, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 440, -1, -1));

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Date & Time");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 69, 1030, -1));

        btnBack.setBackground(new java.awt.Color(255, 255, 0));
        btnBack.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 590, 90, -1));

        btnDay1.setBackground(new java.awt.Color(0, 0, 0));
        btnDay1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnDay1.setForeground(new java.awt.Color(255, 255, 255));
        btnDay1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDay1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnDay1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, -1, -1));

        btnDay2.setBackground(new java.awt.Color(0, 0, 0));
        btnDay2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnDay2.setForeground(new java.awt.Color(255, 255, 255));
        btnDay2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDay2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnDay2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, -1, -1));

        btnDay3.setBackground(new java.awt.Color(0, 0, 0));
        btnDay3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnDay3.setForeground(new java.awt.Color(255, 255, 255));
        btnDay3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDay3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnDay3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 250, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinemaswingtest1/image/mainmenu/dark grey (2).jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        Global.movie_idx=0;
        MainMenu mm = new MainMenu();
        mm.setVisible(true);
        mm.pack();
        mm.setLocationRelativeTo(null);
        mm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void jLabel9amMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9amMouseClicked
        if (day == "") {
            JOptionPane.showMessageDialog(this, "Please Select Your Date !");
        }
        
        else {
            Global.movie_idx=+0;
            Global.day = day;
            Global.time = "9:00AM";
            
            MovieSeat1 ms1 = new MovieSeat1();
            ms1.setVisible(true);
            ms1.pack();
            ms1.setLocationRelativeTo(null);
            ms1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
        }
        
//        MovieSeat2 ms2 = new MovieSeat2();
//        ms2.setVisible(true);
//        ms2.pack();
//        ms2.setLocationRelativeTo(null);
//        ms2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        this.dispose();
    }//GEN-LAST:event_jLabel9amMouseClicked

    private void jLabel3pmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3pmMouseClicked
        if (day == "") {
            JOptionPane.showMessageDialog(this, "Please Select Your Date !");
        }
        
        else {
            Global.movie_idx=+5;
            Global.day = day;
            Global.time = "3:00PM";
            
            MovieSeat1 ms1 = new MovieSeat1();
            ms1.setVisible(true);
            ms1.pack();
            ms1.setLocationRelativeTo(null);
            ms1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
        }
        
//        MovieSeat2 ms2 = new MovieSeat2();
//        ms2.setVisible(true);
//        ms2.pack();
//        ms2.setLocationRelativeTo(null);
//        ms2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        this.dispose();
    }//GEN-LAST:event_jLabel3pmMouseClicked

    private void jLabel9pmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9pmMouseClicked
        if (day == "") {
            JOptionPane.showMessageDialog(this, "Please Select Your Date !");
        }
        
        else {
            Global.movie_idx=+10;
            Global.day = day;
            Global.time = "9:00PM";
            
            MovieSeat1 ms1 = new MovieSeat1();
            ms1.setVisible(true);
            ms1.pack();
            ms1.setLocationRelativeTo(null);
            ms1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
        }
        
//        MovieSeat2 ms2 = new MovieSeat2();
//        ms2.setVisible(true);
//        ms2.pack();
//        ms2.setLocationRelativeTo(null);
//        ms2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        this.dispose();
    }//GEN-LAST:event_jLabel9pmMouseClicked

    private void btnDay1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDay1ActionPerformed
        Global.movie_idx=+0;
        btnDay1.setBackground(Color.yellow);
        btnDay1.setForeground(Color.black);
        if (day.equals("21/01/22")) {
            btnDay2.setBackground(Color.black);
            btnDay2.setForeground(Color.white);
        }
        else if (day.equals("22/01/22")) {
            btnDay3.setBackground(Color.black);
            btnDay3.setForeground(Color.white);
        }
        day = "20/01/22";
    }//GEN-LAST:event_btnDay1ActionPerformed

    private void btnDay2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDay2ActionPerformed
        Global.movie_idx=+15;
        btnDay2.setBackground(Color.yellow);
        btnDay2.setForeground(Color.black);
        if (day.equals("20/01/22")) {
            btnDay1.setBackground(Color.black);
            btnDay1.setForeground(Color.white);
        }
        else if (day.equals("22/01/22")) {
            btnDay3.setBackground(Color.black);
            btnDay3.setForeground(Color.white);
        }
        day = "21/01/22";
    }//GEN-LAST:event_btnDay2ActionPerformed

    private void btnDay3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDay3ActionPerformed
        Global.movie_idx=+30;
        btnDay3.setBackground(Color.yellow);
        btnDay3.setForeground(Color.black);
        if (day.equals("20/01/22")) {
            btnDay1.setBackground(Color.black);
            btnDay1.setForeground(Color.white);
        }
        else if (day.equals("21/01/22")) {
            btnDay2.setBackground(Color.black);
            btnDay2.setForeground(Color.white);
        }
        day = "22/01/22";
    }//GEN-LAST:event_btnDay3ActionPerformed

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
            java.util.logging.Logger.getLogger(MovieTime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MovieTime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MovieTime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MovieTime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MovieTime().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDay1;
    private javax.swing.JButton btnDay2;
    private javax.swing.JButton btnDay3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel3pm;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9am;
    private javax.swing.JLabel jLabel9pm;
    // End of variables declaration//GEN-END:variables
}
