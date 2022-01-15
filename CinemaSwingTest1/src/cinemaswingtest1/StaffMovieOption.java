
package cinemaswingtest1;
public class StaffMovieOption extends javax.swing.JFrame {

    public StaffMovieOption() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton1.setFont(new java.awt.Font("Yu Gothic", 0, 24)); // NOI18N
        jButton1.setText("Spider-Man: No Way Home");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(20, 21, 310, 50);

        jButton2.setFont(new java.awt.Font("Yu Gothic", 0, 24)); // NOI18N
        jButton2.setText("The Medium");
        getContentPane().add(jButton2);
        jButton2.setBounds(20, 75, 310, 50);

        jButton3.setFont(new java.awt.Font("Yu Gothic", 0, 24)); // NOI18N
        jButton3.setText("No Time To Die");
        getContentPane().add(jButton3);
        jButton3.setBounds(20, 133, 310, 50);

        jButton4.setFont(new java.awt.Font("Yu Gothic", 0, 24)); // NOI18N
        jButton4.setText("Eternals");
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jButton4);
        jButton4.setBounds(30, 390, 310, 50);

        jButton5.setFont(new java.awt.Font("Yu Gothic", 0, 24)); // NOI18N
        jButton5.setText("Ghostbusters: Afterlife");
        getContentPane().add(jButton5);
        jButton5.setBounds(30, 520, 310, 50);

        jButton6.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        jButton6.setText("Add Movie");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(780, 220, 210, 50);

        jButton7.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        jButton7.setText("Remove Movie");
        getContentPane().add(jButton7);
        jButton7.setBounds(780, 380, 210, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinemaswingtest1/image/mainmenu/dark grey (2).jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1050, 640);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StaffMovieOption().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
