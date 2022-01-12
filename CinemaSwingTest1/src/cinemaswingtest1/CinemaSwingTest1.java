package cinemaswingtest1;

import javax.swing.JFrame;

public class CinemaSwingTest1 {

    public static void main(String[] args) {
        CustomerOrStaff cos = new CustomerOrStaff();
        cos.setVisible(true);
        cos.pack();
        cos.setLocationRelativeTo(null);
        cos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
