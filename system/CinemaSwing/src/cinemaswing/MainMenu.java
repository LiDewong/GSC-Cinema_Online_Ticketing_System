package cinemaswingtest1;

import javax.swing.JFrame;

public class MainMenu extends javax.swing.JFrame {

    public MainMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label2 = new javax.swing.JLabel();
        label = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        jLabel = new javax.swing.JLabel();
        label4 = new javax.swing.JLabel();
        label5 = new javax.swing.JLabel();
        label6 = new javax.swing.JLabel();
        label7 = new javax.swing.JLabel();
        label8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinemaswingtest1/image/mainmenu/OIP.jpg"))); // NOI18N
        label2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label2MouseClicked(evt);
            }
        });
        getContentPane().add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 160, 190));

        label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinemaswingtest1/image/mainmenu/fop pic3.jpg"))); // NOI18N
        label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelMouseClicked(evt);
            }
        });
        getContentPane().add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        label3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinemaswingtest1/image/mainmenu/fop.jpg"))); // NOI18N
        label3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label3MouseClicked(evt);
            }
        });
        getContentPane().add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, 156, 188));

        jLabel.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 48)); // NOI18N
        jLabel.setForeground(new java.awt.Color(255, 255, 255));
        jLabel.setText("Now Showing");
        getContentPane().add(jLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 250, 110));

        label4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinemaswingtest1/image/mainmenu/pic.jpg"))); // NOI18N
        label4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label4MouseClicked(evt);
            }
        });
        getContentPane().add(label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 170, 150, -1));

        label5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinemaswingtest1/image/mainmenu/poster.jpg"))); // NOI18N
        label5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label5MouseClicked(evt);
            }
        });
        getContentPane().add(label5, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 170, -1, -1));

        label6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinemaswingtest1/image/mainmenu/logo.png"))); // NOI18N
        getContentPane().add(label6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        label7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinemaswingtest1/image/mainmenu/pic1.jpg"))); // NOI18N
        getContentPane().add(label7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, -1, -1));

        label8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinemaswingtest1/image/mainmenu/black 1.jpg"))); // NOI18N
        getContentPane().add(label8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 470));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMouseClicked
        Movie1Detail movie = new Movie1Detail();
        movie.setVisible(true);
        movie.pack();
        movie.setLocationRelativeTo(null);
        movie.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_labelMouseClicked

    private void label2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label2MouseClicked
        Movie2Detail movie = new Movie2Detail();
        movie.setVisible(true);
        movie.pack();
        movie.setLocationRelativeTo(null);
        movie.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_label2MouseClicked

    private void label3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label3MouseClicked
        Movie3Detail movie = new Movie3Detail();
        movie.setVisible(true);
        movie.pack();
        movie.setLocationRelativeTo(null);
        movie.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_label3MouseClicked

    private void label4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label4MouseClicked
        Movie4Detail movie = new Movie4Detail();
        movie.setVisible(true);
        movie.pack();
        movie.setLocationRelativeTo(null);
        movie.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_label4MouseClicked

    private void label5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label5MouseClicked
        Movie5Detail movie = new Movie5Detail();
        movie.setVisible(true);
        movie.pack();
        movie.setLocationRelativeTo(null);
        movie.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_label5MouseClicked

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel;
    private javax.swing.JLabel label;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel label5;
    private javax.swing.JLabel label6;
    private javax.swing.JLabel label7;
    private javax.swing.JLabel label8;
    // End of variables declaration//GEN-END:variables
}
