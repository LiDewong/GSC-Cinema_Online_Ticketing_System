package cinemaswingtest1;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MovieSeat2 extends javax.swing.JFrame {
    
    private int[] seat = new int[117];
    private String[] id = {"A01","A02","A04","A05","A07","A08","A10","A11","A13","A14","A16","A17",
                            "B01","B03","B05","B07","B09","B11","B13","B15","B17",
                            "C01","C02","C04","C05","C07","C08","C10","C11","C13","C14","C16","C17",
                            "D01","D03","D05","D07","D09","D11","D13","D15","D17",
                            "E01","E02","E04","E05","E07","E08","E10","E11","E13","E14","E16","E17",
                            "F01","F03","F05","F07","F09","F11","F13","F15","F17",
                            "G01","G02","G04","G05","G07","G08","G10","G11","G13","G14","G16","G17",
                            "H01","H03","H05","H07","H09","H11","H13","H15","H17",
                            "I01","I02","I04","I05","I07","I08","I10","I11","I13","I14","I16","I17",
                            "J01","J03","J05","J07","J09","J11","J13","J15","J17",
                            "K01","K02","K04","K05","K07","K08","K10","K11","K13","K14","K16","K17"};
    private int cnt;

    /**
     * Creates new form Seat
     */
    private List<JButton> btn = new ArrayList<>();
    List<API.Seat> seats;
    List<String> seat_id = new ArrayList<>();
    List<Integer> booked_idx = new ArrayList<>();
    List<Integer> havent_book_idx = new ArrayList<>();
    List<Integer> to_book_seat_idx = new ArrayList<>();
    
    public MovieSeat2() {
        initComponents();
        initBtn();
        int m =Global.movie_idx;
        for (int i = 0; i < Global.listL.get(m).size(); i++) {
            
            btn.get(Global.listL.get(m).get(i)).setEnabled(false);
            
        }

//        seats = API.getAllSeat("ckygxcx3h000207obwxdgiaz2");
//
//        for (int i = 0; i < seats.size(); i++) {
//            seat_id.add(seats.get(i).id);
//            if (seats.get(i).customer_id == "") {
//                havent_book_idx.add(i);
//            } else {
//                booked_idx.add(i);
//            }
//        }
//
//        for (int i = 0; i < booked_idx.size(); i++) {
//            btn.get(i).setEnabled(false);
//        }
//
//        for (int i = 0; i < havent_book_idx.size(); i++) {
//            btn.get(i).setEnabled(true);
//        }

    }
    public void confirm() {
        int m =Global.movie_idx;
        System.out.println("confirm");
        
        for (int i = 0; i < to_book_seat_idx.size(); i++) {
            Global.listL.get(m).add(to_book_seat_idx.get(i));
            System.out.println(Global.listL.get(m).get(i));
//        for (int i = 0; i < to_book_seat_idx.size(); i++) {
//            System.out.println(API.bookSeat(Global.customer_email, seat_id.get(i)));
        }
    }
  
    public void initBtn() {
        btn.add(btnA01);
        btn.add(btnA02);
        btn.add(btnA04);
        btn.add(btnA05);
        btn.add(btnA07);
        btn.add(btnA08);
        btn.add(btnA10);
        btn.add(btnA11);
        btn.add(btnA13);
        btn.add(btnA14);
        btn.add(btnA16);
        btn.add(btnA17);
        btn.add(btnB01);
        btn.add(btnB03);
        btn.add(btnB05);
        btn.add(btnB07);
        btn.add(btnB09);
        btn.add(btnB11);
        btn.add(btnB13);
        btn.add(btnB15);
        btn.add(btnB17);
        btn.add(btnC01);
        btn.add(btnC02);
        btn.add(btnC04);
        btn.add(btnC05);
        btn.add(btnC07);
        btn.add(btnC08);
        btn.add(btnC10);
        btn.add(btnC11);
        btn.add(btnC13);
        btn.add(btnC14);
        btn.add(btnC16);
        btn.add(btnC17);
        btn.add(btnD01);
        btn.add(btnD03);
        btn.add(btnD05);
        btn.add(btnD07);
        btn.add(btnD09);
        btn.add(btnD11);
        btn.add(btnD13);
        btn.add(btnD15);
        btn.add(btnD17);
        btn.add(btnE01);
        btn.add(btnE02);
        btn.add(btnE04);
        btn.add(btnE05);
        btn.add(btnE07);
        btn.add(btnE08);
        btn.add(btnE10);
        btn.add(btnE11);
        btn.add(btnE13);
        btn.add(btnE14);
        btn.add(btnE16);
        btn.add(btnE17);
        btn.add(btnF01);
        btn.add(btnF03);
        btn.add(btnF05);
        btn.add(btnF07);
        btn.add(btnF09);
        btn.add(btnF11);
        btn.add(btnF13);
        btn.add(btnF15);
        btn.add(btnF17);
        btn.add(btnG01);
        btn.add(btnG02);
        btn.add(btnG04);
        btn.add(btnG05);
        btn.add(btnG07);
        btn.add(btnG08);
        btn.add(btnG10);
        btn.add(btnG11);
        btn.add(btnG13);
        btn.add(btnG14);
        btn.add(btnG16);
        btn.add(btnG17);
        btn.add(btnH01);
        btn.add(btnH03);
        btn.add(btnH05);
        btn.add(btnH07);
        btn.add(btnH09);
        btn.add(btnH11);
        btn.add(btnH13);
        btn.add(btnH15);
        btn.add(btnH17);
        btn.add(btnI01);
        btn.add(btnI02);
        btn.add(btnI04);
        btn.add(btnI05);
        btn.add(btnI07);
        btn.add(btnI08);
        btn.add(btnI10);
        btn.add(btnI11);
        btn.add(btnI13);
        btn.add(btnI14);
        btn.add(btnI16);
        btn.add(btnI17);
        btn.add(btnJ01);
        btn.add(btnJ03);
        btn.add(btnJ05);
        btn.add(btnJ07);
        btn.add(btnJ09);
        btn.add(btnJ11);
        btn.add(btnJ13);
        btn.add(btnJ15);
        btn.add(btnJ17);
        btn.add(btnK01);
        btn.add(btnK02);
        btn.add(btnK04);
        btn.add(btnK05);
        btn.add(btnK07);
        btn.add(btnK08);
        btn.add(btnK10);
        btn.add(btnK11);
        btn.add(btnK13);
        btn.add(btnK14);
        btn.add(btnK16);
        btn.add(btnK17);

    }
    
public void unused(){
    //        if (customer_email != null) {btnA01.setEnabled(false);}
//        if (customer_email != null) {btnA02.setEnabled(false);}
//        if (customer_email != null) {btnA04.setEnabled(false);}
//        if (customer_email != null) {btnA05.setEnabled(false);}
//        if (customer_email != null) {btnA07.setEnabled(false);}
//        if (customer_email != null) {btnA08.setEnabled(false);}
//        if (customer_email != null) {btnA10.setEnabled(false);}
//        if (customer_email != null) {btnA11.setEnabled(false);}
//        if (customer_email != null) {btnA13.setEnabled(false);}
//        if (customer_email != null) {btnA14.setEnabled(false);}
//        if (customer_email != null) {btnA16.setEnabled(false);}
//        if (customer_email != null) {btnA17.setEnabled(false);}
//        if (customer_email != null) {btnB01.setEnabled(false);}
//        if (customer_email != null) {btnB03.setEnabled(false);}
//        if (customer_email != null) {btnB05.setEnabled(false);}
//        if (customer_email != null) {btnB07.setEnabled(false);}
//        if (customer_email != null) {btnB09.setEnabled(false);}
//        if (customer_email != null) {btnB11.setEnabled(false);}
//        if (customer_email != null) {btnB13.setEnabled(false);}
//        if (customer_email != null) {btnB15.setEnabled(false);}
//        if (customer_email != null) {btnB17.setEnabled(false);}
//        if (customer_email != null) {btnC01.setEnabled(false);}
//        if (customer_email != null) {btnC02.setEnabled(false);}
//        if (customer_email != null) {btnC04.setEnabled(false);}
//        if (customer_email != null) {btnC05.setEnabled(false);}
//        if (customer_email != null) {btnC07.setEnabled(false);}
//        if (customer_email != null) {btnC08.setEnabled(false);}
//        if (customer_email != null) {btnC10.setEnabled(false);}
//        if (customer_email != null) {btnC11.setEnabled(false);}
//        if (customer_email != null) {btnC13.setEnabled(false);}
//        if (customer_email != null) {btnC14.setEnabled(false);}
//        if (customer_email != null) {btnC16.setEnabled(false);}
//        if (customer_email != null) {btnC17.setEnabled(false);}
//        if (customer_email != null) {btnD01.setEnabled(false);}
//        if (customer_email != null) {btnD03.setEnabled(false);}
//        if (customer_email != null) {btnD05.setEnabled(false);}
//        if (customer_email != null) {btnD07.setEnabled(false);}
//        if (customer_email != null) {btnD09.setEnabled(false);}
//        if (customer_email != null) {btnD11.setEnabled(false);}
//        if (customer_email != null) {btnD13.setEnabled(false);}
//        if (customer_email != null) {btnD15.setEnabled(false);}
//        if (customer_email != null) {btnD17.setEnabled(false);}
//        if (customer_email != null) {btnE01.setEnabled(false);}
//        if (customer_email != null) {btnE02.setEnabled(false);}
//        if (customer_email != null) {btnE04.setEnabled(false);}
//        if (customer_email != null) {btnE05.setEnabled(false);}
//        if (customer_email != null) {btnE07.setEnabled(false);}
//        if (customer_email != null) {btnE08.setEnabled(false);}
//        if (customer_email != null) {btnE10.setEnabled(false);}
//        if (customer_email != null) {btnE11.setEnabled(false);}
//        if (customer_email != null) {btnE13.setEnabled(false);}
//        if (customer_email != null) {btnE14.setEnabled(false);}
//        if (customer_email != null) {btnE16.setEnabled(false);}
//        if (customer_email != null) {btnE17.setEnabled(false);}
//        if (customer_email != null) {btnF01.setEnabled(false);}
//        if (customer_email != null) {btnF03.setEnabled(false);}
//        if (customer_email != null) {btnF05.setEnabled(false);}
//        if (customer_email != null) {btnF07.setEnabled(false);}
//        if (customer_email != null) {btnF09.setEnabled(false);}
//        if (customer_email != null) {btnF11.setEnabled(false);}
//        if (customer_email != null) {btnF13.setEnabled(false);}
//        if (customer_email != null) {btnF15.setEnabled(false);}
//        if (customer_email != null) {btnF17.setEnabled(false);}
//        if (customer_email != null) {btnG01.setEnabled(false);}
//        if (customer_email != null) {btnG02.setEnabled(false);}
//        if (customer_email != null) {btnG04.setEnabled(false);}
//        if (customer_email != null) {btnG05.setEnabled(false);}
//        if (customer_email != null) {btnG07.setEnabled(false);}
//        if (customer_email != null) {btnG08.setEnabled(false);}
//        if (customer_email != null) {btnG10.setEnabled(false);}
//        if (customer_email != null) {btnG11.setEnabled(false);}
//        if (customer_email != null) {btnG13.setEnabled(false);}
//        if (customer_email != null) {btnG14.setEnabled(false);}
//        if (customer_email != null) {btnG16.setEnabled(false);}
//        if (customer_email != null) {btnG17.setEnabled(false);}
//        if (customer_email != null) {btnH01.setEnabled(false);}
//        if (customer_email != null) {btnH03.setEnabled(false);}
//        if (customer_email != null) {btnH05.setEnabled(false);}
//        if (customer_email != null) {btnH07.setEnabled(false);}
//        if (customer_email != null) {btnH09.setEnabled(false);}
//        if (customer_email != null) {btnH11.setEnabled(false);}
//        if (customer_email != null) {btnH13.setEnabled(false);}
//        if (customer_email != null) {btnH15.setEnabled(false);}
//        if (customer_email != null) {btnH17.setEnabled(false);}
//        if (customer_email != null) {btnI01.setEnabled(false);}
//        if (customer_email != null) {btnI02.setEnabled(false);}
//        if (customer_email != null) {btnI04.setEnabled(false);}
//        if (customer_email != null) {btnI05.setEnabled(false);}
//        if (customer_email != null) {btnI07.setEnabled(false);}
//        if (customer_email != null) {btnI08.setEnabled(false);}
//        if (customer_email != null) {btnI10.setEnabled(false);}
//        if (customer_email != null) {btnI11.setEnabled(false);}
//        if (customer_email != null) {btnI13.setEnabled(false);}
//        if (customer_email != null) {btnI14.setEnabled(false);}
//        if (customer_email != null) {btnI16.setEnabled(false);}
//        if (customer_email != null) {btnI17.setEnabled(false);}
//        if (customer_email != null) {btnJ01.setEnabled(false);}
//        if (customer_email != null) {btnJ03.setEnabled(false);}
//        if (customer_email != null) {btnJ05.setEnabled(false);}
//        if (customer_email != null) {btnJ07.setEnabled(false);}
//        if (customer_email != null) {btnJ09.setEnabled(false);}
//        if (customer_email != null) {btnJ11.setEnabled(false);}
//        if (customer_email != null) {btnJ13.setEnabled(false);}
//        if (customer_email != null) {btnJ15.setEnabled(false);}
//        if (customer_email != null) {btnJ17.setEnabled(false);}
//        if (customer_email != null) {btnK01.setEnabled(false);}
//        if (customer_email != null) {btnK02.setEnabled(false);}
//        if (customer_email != null) {btnK04.setEnabled(false);}
//        if (customer_email != null) {btnK05.setEnabled(false);}
//        if (customer_email != null) {btnK07.setEnabled(false);}
//        if (customer_email != null) {btnK08.setEnabled(false);}
//        if (customer_email != null) {btnK10.setEnabled(false);}
//        if (customer_email != null) {btnK11.setEnabled(false);}
//        if (customer_email != null) {btnK13.setEnabled(false);}
//        if (customer_email != null) {btnK14.setEnabled(false);}
//        if (customer_email != null) {btnK16.setEnabled(false);}
//        if (customer_email != null) {btnK17.setEnabled(false);}
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
        jLabel2 = new javax.swing.JLabel();
        btnNext = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnA01 = new javax.swing.JButton();
        btnA02 = new javax.swing.JButton();
        btnA05 = new javax.swing.JButton();
        btnA04 = new javax.swing.JButton();
        btnA08 = new javax.swing.JButton();
        btnA07 = new javax.swing.JButton();
        btnA11 = new javax.swing.JButton();
        btnA10 = new javax.swing.JButton();
        btnB01 = new javax.swing.JButton();
        btnB11 = new javax.swing.JButton();
        btnB03 = new javax.swing.JButton();
        btnB05 = new javax.swing.JButton();
        btnB07 = new javax.swing.JButton();
        btnB09 = new javax.swing.JButton();
        btnC10 = new javax.swing.JButton();
        btnC01 = new javax.swing.JButton();
        btnC02 = new javax.swing.JButton();
        btnD01 = new javax.swing.JButton();
        btnD11 = new javax.swing.JButton();
        btnC05 = new javax.swing.JButton();
        btnD03 = new javax.swing.JButton();
        btnD05 = new javax.swing.JButton();
        btnC04 = new javax.swing.JButton();
        btnD07 = new javax.swing.JButton();
        btnC08 = new javax.swing.JButton();
        btnD09 = new javax.swing.JButton();
        btnC07 = new javax.swing.JButton();
        btnC11 = new javax.swing.JButton();
        btnE10 = new javax.swing.JButton();
        btnE01 = new javax.swing.JButton();
        btnE02 = new javax.swing.JButton();
        btnF01 = new javax.swing.JButton();
        btnF11 = new javax.swing.JButton();
        btnE05 = new javax.swing.JButton();
        btnF03 = new javax.swing.JButton();
        btnF05 = new javax.swing.JButton();
        btnE04 = new javax.swing.JButton();
        btnF07 = new javax.swing.JButton();
        btnE08 = new javax.swing.JButton();
        btnF09 = new javax.swing.JButton();
        btnE07 = new javax.swing.JButton();
        btnE11 = new javax.swing.JButton();
        btnG10 = new javax.swing.JButton();
        btnG01 = new javax.swing.JButton();
        btnG02 = new javax.swing.JButton();
        btnH01 = new javax.swing.JButton();
        btnH11 = new javax.swing.JButton();
        btnG05 = new javax.swing.JButton();
        btnH03 = new javax.swing.JButton();
        btnH05 = new javax.swing.JButton();
        btnG04 = new javax.swing.JButton();
        btnH07 = new javax.swing.JButton();
        btnG08 = new javax.swing.JButton();
        btnH09 = new javax.swing.JButton();
        btnG07 = new javax.swing.JButton();
        btnG11 = new javax.swing.JButton();
        btnI10 = new javax.swing.JButton();
        btnI01 = new javax.swing.JButton();
        btnI02 = new javax.swing.JButton();
        btnJ01 = new javax.swing.JButton();
        btnJ11 = new javax.swing.JButton();
        btnI05 = new javax.swing.JButton();
        btnJ03 = new javax.swing.JButton();
        btnJ05 = new javax.swing.JButton();
        btnI04 = new javax.swing.JButton();
        btnJ07 = new javax.swing.JButton();
        btnI08 = new javax.swing.JButton();
        btnJ09 = new javax.swing.JButton();
        btnI07 = new javax.swing.JButton();
        btnI11 = new javax.swing.JButton();
        btnK10 = new javax.swing.JButton();
        btnK01 = new javax.swing.JButton();
        btnK02 = new javax.swing.JButton();
        btnK05 = new javax.swing.JButton();
        btnK04 = new javax.swing.JButton();
        btnK08 = new javax.swing.JButton();
        btnK07 = new javax.swing.JButton();
        btnK11 = new javax.swing.JButton();
        btnTwin1 = new javax.swing.JButton();
        btnTwin2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnAvailable = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnJ17 = new javax.swing.JButton();
        btnJ13 = new javax.swing.JButton();
        btnI14 = new javax.swing.JButton();
        btnJ15 = new javax.swing.JButton();
        btnI13 = new javax.swing.JButton();
        btnI17 = new javax.swing.JButton();
        btnK16 = new javax.swing.JButton();
        btnK14 = new javax.swing.JButton();
        btnK13 = new javax.swing.JButton();
        btnK17 = new javax.swing.JButton();
        btnA14 = new javax.swing.JButton();
        btnA13 = new javax.swing.JButton();
        btnA17 = new javax.swing.JButton();
        btnA16 = new javax.swing.JButton();
        btnB17 = new javax.swing.JButton();
        btnB13 = new javax.swing.JButton();
        btnB15 = new javax.swing.JButton();
        btnC16 = new javax.swing.JButton();
        btnD17 = new javax.swing.JButton();
        btnD13 = new javax.swing.JButton();
        btnC14 = new javax.swing.JButton();
        btnD15 = new javax.swing.JButton();
        btnC13 = new javax.swing.JButton();
        btnC17 = new javax.swing.JButton();
        btnE16 = new javax.swing.JButton();
        btnF17 = new javax.swing.JButton();
        btnF13 = new javax.swing.JButton();
        btnE14 = new javax.swing.JButton();
        btnF15 = new javax.swing.JButton();
        btnE13 = new javax.swing.JButton();
        btnE17 = new javax.swing.JButton();
        btnG16 = new javax.swing.JButton();
        btnH17 = new javax.swing.JButton();
        btnH13 = new javax.swing.JButton();
        btnG14 = new javax.swing.JButton();
        btnH15 = new javax.swing.JButton();
        btnG13 = new javax.swing.JButton();
        btnG17 = new javax.swing.JButton();
        btnI16 = new javax.swing.JButton();
        btnSelected = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnUnavailable = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1050, 640));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Seat");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 70, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("S C R E E N");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 57, 1031, -1));

        btnNext.setText("NEXT");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        getContentPane().add(btnNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 600, 60, 25));

        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 602, -1, 25));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinemaswingtest1/image/mainmenu/logo (1).png"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, -1));

        btnA01.setBackground(new java.awt.Color(255, 204, 255));
        btnA01.setText("A01");
        btnA01.setPreferredSize(new java.awt.Dimension(55, 25));
        btnA01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnA01ActionPerformed(evt);
            }
        });
        getContentPane().add(btnA01, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        btnA02.setBackground(new java.awt.Color(255, 204, 255));
        btnA02.setText("A02");
        btnA02.setPreferredSize(new java.awt.Dimension(55, 25));
        btnA02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnA02ActionPerformed(evt);
            }
        });
        getContentPane().add(btnA02, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 90, -1, -1));

        btnA05.setBackground(new java.awt.Color(255, 204, 255));
        btnA05.setText("A05");
        btnA05.setPreferredSize(new java.awt.Dimension(55, 25));
        btnA05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnA05ActionPerformed(evt);
            }
        });
        getContentPane().add(btnA05, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 90, -1, -1));

        btnA04.setBackground(new java.awt.Color(255, 204, 255));
        btnA04.setText("A04");
        btnA04.setPreferredSize(new java.awt.Dimension(55, 25));
        btnA04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnA04ActionPerformed(evt);
            }
        });
        getContentPane().add(btnA04, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 90, -1, -1));

        btnA08.setBackground(new java.awt.Color(255, 204, 255));
        btnA08.setText("A08");
        btnA08.setPreferredSize(new java.awt.Dimension(55, 25));
        btnA08.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnA08ActionPerformed(evt);
            }
        });
        getContentPane().add(btnA08, new org.netbeans.lib.awtextra.AbsoluteConstraints(437, 90, -1, -1));

        btnA07.setBackground(new java.awt.Color(255, 204, 255));
        btnA07.setText("A07");
        btnA07.setPreferredSize(new java.awt.Dimension(55, 25));
        btnA07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnA07ActionPerformed(evt);
            }
        });
        getContentPane().add(btnA07, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 90, -1, -1));

        btnA11.setBackground(new java.awt.Color(255, 204, 255));
        btnA11.setText("A11");
        btnA11.setPreferredSize(new java.awt.Dimension(55, 25));
        btnA11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnA11ActionPerformed(evt);
            }
        });
        getContentPane().add(btnA11, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 90, -1, -1));

        btnA10.setBackground(new java.awt.Color(255, 204, 255));
        btnA10.setText("A10");
        btnA10.setPreferredSize(new java.awt.Dimension(55, 25));
        btnA10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnA10ActionPerformed(evt);
            }
        });
        getContentPane().add(btnA10, new org.netbeans.lib.awtextra.AbsoluteConstraints(559, 90, -1, -1));

        btnB01.setBackground(new java.awt.Color(255, 255, 255));
        btnB01.setText("B01");
        btnB01.setPreferredSize(new java.awt.Dimension(55, 25));
        btnB01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnB01ActionPerformed(evt);
            }
        });
        getContentPane().add(btnB01, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 133, -1, -1));

        btnB11.setBackground(new java.awt.Color(255, 255, 255));
        btnB11.setText("B11");
        btnB11.setPreferredSize(new java.awt.Dimension(55, 25));
        btnB11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnB11ActionPerformed(evt);
            }
        });
        getContentPane().add(btnB11, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 133, -1, -1));

        btnB03.setBackground(new java.awt.Color(255, 255, 255));
        btnB03.setText("B03");
        btnB03.setPreferredSize(new java.awt.Dimension(55, 25));
        btnB03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnB03ActionPerformed(evt);
            }
        });
        getContentPane().add(btnB03, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 133, -1, -1));

        btnB05.setBackground(new java.awt.Color(255, 255, 255));
        btnB05.setText("B05");
        btnB05.setPreferredSize(new java.awt.Dimension(55, 25));
        btnB05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnB05ActionPerformed(evt);
            }
        });
        getContentPane().add(btnB05, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 133, -1, -1));

        btnB07.setBackground(new java.awt.Color(255, 255, 255));
        btnB07.setText("B07");
        btnB07.setPreferredSize(new java.awt.Dimension(55, 25));
        btnB07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnB07ActionPerformed(evt);
            }
        });
        getContentPane().add(btnB07, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 133, -1, -1));

        btnB09.setBackground(new java.awt.Color(255, 255, 255));
        btnB09.setText("B09");
        btnB09.setPreferredSize(new java.awt.Dimension(55, 25));
        btnB09.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnB09ActionPerformed(evt);
            }
        });
        getContentPane().add(btnB09, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 133, -1, -1));

        btnC10.setBackground(new java.awt.Color(255, 204, 255));
        btnC10.setText("C10");
        btnC10.setPreferredSize(new java.awt.Dimension(55, 25));
        btnC10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC10ActionPerformed(evt);
            }
        });
        getContentPane().add(btnC10, new org.netbeans.lib.awtextra.AbsoluteConstraints(559, 176, -1, -1));

        btnC01.setBackground(new java.awt.Color(255, 204, 255));
        btnC01.setText("C01");
        btnC01.setPreferredSize(new java.awt.Dimension(55, 25));
        btnC01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC01ActionPerformed(evt);
            }
        });
        getContentPane().add(btnC01, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 176, -1, -1));

        btnC02.setBackground(new java.awt.Color(255, 204, 255));
        btnC02.setText("C02");
        btnC02.setPreferredSize(new java.awt.Dimension(55, 25));
        btnC02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC02ActionPerformed(evt);
            }
        });
        getContentPane().add(btnC02, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 176, -1, -1));

        btnD01.setBackground(new java.awt.Color(255, 255, 255));
        btnD01.setText("D01");
        btnD01.setPreferredSize(new java.awt.Dimension(55, 25));
        btnD01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnD01ActionPerformed(evt);
            }
        });
        getContentPane().add(btnD01, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 219, -1, -1));

        btnD11.setBackground(new java.awt.Color(255, 255, 255));
        btnD11.setText("D11");
        btnD11.setPreferredSize(new java.awt.Dimension(55, 25));
        btnD11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnD11ActionPerformed(evt);
            }
        });
        getContentPane().add(btnD11, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 219, -1, -1));

        btnC05.setBackground(new java.awt.Color(255, 204, 255));
        btnC05.setText("C05");
        btnC05.setPreferredSize(new java.awt.Dimension(55, 25));
        btnC05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC05ActionPerformed(evt);
            }
        });
        getContentPane().add(btnC05, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 176, -1, -1));

        btnD03.setBackground(new java.awt.Color(255, 255, 255));
        btnD03.setText("D03");
        btnD03.setPreferredSize(new java.awt.Dimension(55, 25));
        btnD03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnD03ActionPerformed(evt);
            }
        });
        getContentPane().add(btnD03, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 219, -1, -1));

        btnD05.setBackground(new java.awt.Color(255, 255, 255));
        btnD05.setText("D05");
        btnD05.setPreferredSize(new java.awt.Dimension(55, 25));
        btnD05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnD05ActionPerformed(evt);
            }
        });
        getContentPane().add(btnD05, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 219, -1, -1));

        btnC04.setBackground(new java.awt.Color(255, 204, 255));
        btnC04.setText("C04");
        btnC04.setPreferredSize(new java.awt.Dimension(55, 25));
        btnC04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC04ActionPerformed(evt);
            }
        });
        getContentPane().add(btnC04, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 176, -1, -1));

        btnD07.setBackground(new java.awt.Color(255, 255, 255));
        btnD07.setText("D07");
        btnD07.setPreferredSize(new java.awt.Dimension(55, 25));
        btnD07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnD07ActionPerformed(evt);
            }
        });
        getContentPane().add(btnD07, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 219, -1, -1));

        btnC08.setBackground(new java.awt.Color(255, 204, 255));
        btnC08.setText("C08");
        btnC08.setPreferredSize(new java.awt.Dimension(55, 25));
        btnC08.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC08ActionPerformed(evt);
            }
        });
        getContentPane().add(btnC08, new org.netbeans.lib.awtextra.AbsoluteConstraints(437, 176, -1, -1));

        btnD09.setBackground(new java.awt.Color(255, 255, 255));
        btnD09.setText("D09");
        btnD09.setPreferredSize(new java.awt.Dimension(55, 25));
        btnD09.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnD09ActionPerformed(evt);
            }
        });
        getContentPane().add(btnD09, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 219, -1, -1));

        btnC07.setBackground(new java.awt.Color(255, 204, 255));
        btnC07.setText("C07");
        btnC07.setPreferredSize(new java.awt.Dimension(55, 25));
        btnC07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC07ActionPerformed(evt);
            }
        });
        getContentPane().add(btnC07, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 176, -1, -1));

        btnC11.setBackground(new java.awt.Color(255, 204, 255));
        btnC11.setText("C11");
        btnC11.setPreferredSize(new java.awt.Dimension(55, 25));
        btnC11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC11ActionPerformed(evt);
            }
        });
        getContentPane().add(btnC11, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 176, -1, -1));

        btnE10.setBackground(new java.awt.Color(255, 204, 255));
        btnE10.setText("E10");
        btnE10.setPreferredSize(new java.awt.Dimension(55, 25));
        btnE10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnE10ActionPerformed(evt);
            }
        });
        getContentPane().add(btnE10, new org.netbeans.lib.awtextra.AbsoluteConstraints(559, 262, -1, -1));

        btnE01.setBackground(new java.awt.Color(255, 204, 255));
        btnE01.setText("E01");
        btnE01.setPreferredSize(new java.awt.Dimension(55, 25));
        btnE01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnE01ActionPerformed(evt);
            }
        });
        getContentPane().add(btnE01, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 262, -1, -1));

        btnE02.setBackground(new java.awt.Color(255, 204, 255));
        btnE02.setText("E02");
        btnE02.setPreferredSize(new java.awt.Dimension(55, 25));
        btnE02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnE02ActionPerformed(evt);
            }
        });
        getContentPane().add(btnE02, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 262, -1, -1));

        btnF01.setBackground(new java.awt.Color(255, 255, 255));
        btnF01.setText("F01");
        btnF01.setPreferredSize(new java.awt.Dimension(55, 25));
        btnF01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnF01ActionPerformed(evt);
            }
        });
        getContentPane().add(btnF01, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 305, -1, -1));

        btnF11.setBackground(new java.awt.Color(255, 255, 255));
        btnF11.setText("F11");
        btnF11.setPreferredSize(new java.awt.Dimension(55, 25));
        btnF11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnF11ActionPerformed(evt);
            }
        });
        getContentPane().add(btnF11, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 305, -1, -1));

        btnE05.setBackground(new java.awt.Color(255, 204, 255));
        btnE05.setText("E05");
        btnE05.setPreferredSize(new java.awt.Dimension(55, 25));
        btnE05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnE05ActionPerformed(evt);
            }
        });
        getContentPane().add(btnE05, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 262, -1, -1));

        btnF03.setBackground(new java.awt.Color(255, 255, 255));
        btnF03.setText("F03");
        btnF03.setPreferredSize(new java.awt.Dimension(55, 25));
        btnF03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnF03ActionPerformed(evt);
            }
        });
        getContentPane().add(btnF03, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 305, -1, -1));

        btnF05.setBackground(new java.awt.Color(255, 255, 255));
        btnF05.setText("F05");
        btnF05.setPreferredSize(new java.awt.Dimension(55, 25));
        btnF05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnF05ActionPerformed(evt);
            }
        });
        getContentPane().add(btnF05, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 305, -1, -1));

        btnE04.setBackground(new java.awt.Color(255, 204, 255));
        btnE04.setText("E04");
        btnE04.setPreferredSize(new java.awt.Dimension(55, 25));
        btnE04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnE04ActionPerformed(evt);
            }
        });
        getContentPane().add(btnE04, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 262, -1, -1));

        btnF07.setBackground(new java.awt.Color(255, 255, 255));
        btnF07.setText("F07");
        btnF07.setPreferredSize(new java.awt.Dimension(55, 25));
        btnF07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnF07ActionPerformed(evt);
            }
        });
        getContentPane().add(btnF07, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 305, -1, -1));

        btnE08.setBackground(new java.awt.Color(255, 204, 255));
        btnE08.setText("E08");
        btnE08.setPreferredSize(new java.awt.Dimension(55, 25));
        btnE08.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnE08ActionPerformed(evt);
            }
        });
        getContentPane().add(btnE08, new org.netbeans.lib.awtextra.AbsoluteConstraints(437, 262, -1, -1));

        btnF09.setBackground(new java.awt.Color(255, 255, 255));
        btnF09.setText("F09");
        btnF09.setPreferredSize(new java.awt.Dimension(55, 25));
        btnF09.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnF09ActionPerformed(evt);
            }
        });
        getContentPane().add(btnF09, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 305, -1, -1));

        btnE07.setBackground(new java.awt.Color(255, 204, 255));
        btnE07.setText("E07");
        btnE07.setPreferredSize(new java.awt.Dimension(55, 25));
        btnE07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnE07ActionPerformed(evt);
            }
        });
        getContentPane().add(btnE07, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 262, -1, -1));

        btnE11.setBackground(new java.awt.Color(255, 204, 255));
        btnE11.setText("E11");
        btnE11.setPreferredSize(new java.awt.Dimension(55, 25));
        btnE11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnE11ActionPerformed(evt);
            }
        });
        getContentPane().add(btnE11, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 262, -1, -1));

        btnG10.setBackground(new java.awt.Color(255, 204, 255));
        btnG10.setText("G10");
        btnG10.setPreferredSize(new java.awt.Dimension(55, 25));
        btnG10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnG10ActionPerformed(evt);
            }
        });
        getContentPane().add(btnG10, new org.netbeans.lib.awtextra.AbsoluteConstraints(559, 348, -1, -1));

        btnG01.setBackground(new java.awt.Color(255, 204, 255));
        btnG01.setText("G01");
        btnG01.setPreferredSize(new java.awt.Dimension(55, 25));
        btnG01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnG01ActionPerformed(evt);
            }
        });
        getContentPane().add(btnG01, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 348, -1, -1));

        btnG02.setBackground(new java.awt.Color(255, 204, 255));
        btnG02.setText("G02");
        btnG02.setPreferredSize(new java.awt.Dimension(55, 25));
        btnG02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnG02ActionPerformed(evt);
            }
        });
        getContentPane().add(btnG02, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 348, -1, -1));

        btnH01.setBackground(new java.awt.Color(255, 255, 255));
        btnH01.setText("H01");
        btnH01.setPreferredSize(new java.awt.Dimension(55, 25));
        btnH01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnH01ActionPerformed(evt);
            }
        });
        getContentPane().add(btnH01, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 391, -1, -1));

        btnH11.setBackground(new java.awt.Color(255, 255, 255));
        btnH11.setText("H11");
        btnH11.setPreferredSize(new java.awt.Dimension(55, 25));
        btnH11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnH11ActionPerformed(evt);
            }
        });
        getContentPane().add(btnH11, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 391, -1, -1));

        btnG05.setBackground(new java.awt.Color(255, 204, 255));
        btnG05.setText("G05");
        btnG05.setPreferredSize(new java.awt.Dimension(55, 25));
        btnG05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnG05ActionPerformed(evt);
            }
        });
        getContentPane().add(btnG05, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 348, -1, -1));

        btnH03.setBackground(new java.awt.Color(255, 255, 255));
        btnH03.setText("H03");
        btnH03.setPreferredSize(new java.awt.Dimension(55, 25));
        btnH03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnH03ActionPerformed(evt);
            }
        });
        getContentPane().add(btnH03, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 391, -1, -1));

        btnH05.setBackground(new java.awt.Color(255, 255, 255));
        btnH05.setText("H05");
        btnH05.setPreferredSize(new java.awt.Dimension(55, 25));
        btnH05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnH05ActionPerformed(evt);
            }
        });
        getContentPane().add(btnH05, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 391, -1, -1));

        btnG04.setBackground(new java.awt.Color(255, 204, 255));
        btnG04.setText("G04");
        btnG04.setPreferredSize(new java.awt.Dimension(55, 25));
        btnG04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnG04ActionPerformed(evt);
            }
        });
        getContentPane().add(btnG04, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 348, -1, -1));

        btnH07.setBackground(new java.awt.Color(255, 255, 255));
        btnH07.setText("H07");
        btnH07.setPreferredSize(new java.awt.Dimension(55, 25));
        btnH07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnH07ActionPerformed(evt);
            }
        });
        getContentPane().add(btnH07, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 391, -1, -1));

        btnG08.setBackground(new java.awt.Color(255, 204, 255));
        btnG08.setText("G08");
        btnG08.setPreferredSize(new java.awt.Dimension(55, 25));
        btnG08.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnG08ActionPerformed(evt);
            }
        });
        getContentPane().add(btnG08, new org.netbeans.lib.awtextra.AbsoluteConstraints(437, 348, -1, -1));

        btnH09.setBackground(new java.awt.Color(255, 255, 255));
        btnH09.setText("H09");
        btnH09.setPreferredSize(new java.awt.Dimension(55, 25));
        btnH09.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnH09ActionPerformed(evt);
            }
        });
        getContentPane().add(btnH09, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 391, -1, -1));

        btnG07.setBackground(new java.awt.Color(255, 204, 255));
        btnG07.setText("G07");
        btnG07.setPreferredSize(new java.awt.Dimension(55, 25));
        btnG07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnG07ActionPerformed(evt);
            }
        });
        getContentPane().add(btnG07, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 348, -1, -1));

        btnG11.setBackground(new java.awt.Color(255, 204, 255));
        btnG11.setText("G11");
        btnG11.setPreferredSize(new java.awt.Dimension(55, 25));
        btnG11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnG11ActionPerformed(evt);
            }
        });
        getContentPane().add(btnG11, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 348, -1, -1));

        btnI10.setBackground(new java.awt.Color(255, 204, 255));
        btnI10.setText("I10");
        btnI10.setPreferredSize(new java.awt.Dimension(55, 25));
        btnI10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnI10ActionPerformed(evt);
            }
        });
        getContentPane().add(btnI10, new org.netbeans.lib.awtextra.AbsoluteConstraints(559, 434, -1, -1));

        btnI01.setBackground(new java.awt.Color(255, 204, 255));
        btnI01.setText("I01");
        btnI01.setPreferredSize(new java.awt.Dimension(55, 25));
        btnI01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnI01ActionPerformed(evt);
            }
        });
        getContentPane().add(btnI01, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 434, -1, -1));

        btnI02.setBackground(new java.awt.Color(255, 204, 255));
        btnI02.setText("I02");
        btnI02.setPreferredSize(new java.awt.Dimension(55, 25));
        btnI02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnI02ActionPerformed(evt);
            }
        });
        getContentPane().add(btnI02, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 434, -1, -1));

        btnJ01.setBackground(new java.awt.Color(255, 255, 255));
        btnJ01.setText("J01");
        btnJ01.setPreferredSize(new java.awt.Dimension(55, 25));
        btnJ01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJ01ActionPerformed(evt);
            }
        });
        getContentPane().add(btnJ01, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 477, -1, -1));

        btnJ11.setBackground(new java.awt.Color(255, 255, 255));
        btnJ11.setText("J11");
        btnJ11.setPreferredSize(new java.awt.Dimension(55, 25));
        btnJ11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJ11ActionPerformed(evt);
            }
        });
        getContentPane().add(btnJ11, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 477, -1, -1));

        btnI05.setBackground(new java.awt.Color(255, 204, 255));
        btnI05.setText("I05");
        btnI05.setPreferredSize(new java.awt.Dimension(55, 25));
        btnI05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnI05ActionPerformed(evt);
            }
        });
        getContentPane().add(btnI05, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 434, -1, -1));

        btnJ03.setBackground(new java.awt.Color(255, 255, 255));
        btnJ03.setText("J03");
        btnJ03.setPreferredSize(new java.awt.Dimension(55, 25));
        btnJ03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJ03ActionPerformed(evt);
            }
        });
        getContentPane().add(btnJ03, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 477, -1, -1));

        btnJ05.setBackground(new java.awt.Color(255, 255, 255));
        btnJ05.setText("J05");
        btnJ05.setPreferredSize(new java.awt.Dimension(55, 25));
        btnJ05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJ05ActionPerformed(evt);
            }
        });
        getContentPane().add(btnJ05, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 477, -1, -1));

        btnI04.setBackground(new java.awt.Color(255, 204, 255));
        btnI04.setText("I04");
        btnI04.setPreferredSize(new java.awt.Dimension(55, 25));
        btnI04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnI04ActionPerformed(evt);
            }
        });
        getContentPane().add(btnI04, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 434, -1, -1));

        btnJ07.setBackground(new java.awt.Color(255, 255, 255));
        btnJ07.setText("J07");
        btnJ07.setPreferredSize(new java.awt.Dimension(55, 25));
        btnJ07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJ07ActionPerformed(evt);
            }
        });
        getContentPane().add(btnJ07, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 477, -1, -1));

        btnI08.setBackground(new java.awt.Color(255, 204, 255));
        btnI08.setText("I08");
        btnI08.setPreferredSize(new java.awt.Dimension(55, 25));
        btnI08.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnI08ActionPerformed(evt);
            }
        });
        getContentPane().add(btnI08, new org.netbeans.lib.awtextra.AbsoluteConstraints(437, 434, -1, -1));

        btnJ09.setBackground(new java.awt.Color(255, 255, 255));
        btnJ09.setText("J09");
        btnJ09.setPreferredSize(new java.awt.Dimension(55, 25));
        btnJ09.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJ09ActionPerformed(evt);
            }
        });
        getContentPane().add(btnJ09, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 477, -1, -1));

        btnI07.setBackground(new java.awt.Color(255, 204, 255));
        btnI07.setText("I07");
        btnI07.setPreferredSize(new java.awt.Dimension(55, 25));
        btnI07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnI07ActionPerformed(evt);
            }
        });
        getContentPane().add(btnI07, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 434, -1, -1));

        btnI11.setBackground(new java.awt.Color(255, 204, 255));
        btnI11.setText("I11");
        btnI11.setPreferredSize(new java.awt.Dimension(55, 25));
        btnI11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnI11ActionPerformed(evt);
            }
        });
        getContentPane().add(btnI11, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 434, -1, -1));

        btnK10.setBackground(new java.awt.Color(255, 204, 255));
        btnK10.setText("K10");
        btnK10.setPreferredSize(new java.awt.Dimension(55, 25));
        btnK10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnK10ActionPerformed(evt);
            }
        });
        getContentPane().add(btnK10, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 520, -1, -1));

        btnK01.setBackground(new java.awt.Color(255, 204, 255));
        btnK01.setText("K01");
        btnK01.setPreferredSize(new java.awt.Dimension(55, 25));
        btnK01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnK01ActionPerformed(evt);
            }
        });
        getContentPane().add(btnK01, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, -1, -1));

        btnK02.setBackground(new java.awt.Color(255, 204, 255));
        btnK02.setText("K02");
        btnK02.setPreferredSize(new java.awt.Dimension(55, 25));
        btnK02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnK02ActionPerformed(evt);
            }
        });
        getContentPane().add(btnK02, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 520, -1, -1));

        btnK05.setBackground(new java.awt.Color(255, 204, 255));
        btnK05.setText("K05");
        btnK05.setPreferredSize(new java.awt.Dimension(55, 25));
        btnK05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnK05ActionPerformed(evt);
            }
        });
        getContentPane().add(btnK05, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 520, -1, -1));

        btnK04.setBackground(new java.awt.Color(255, 204, 255));
        btnK04.setText("K04");
        btnK04.setPreferredSize(new java.awt.Dimension(55, 25));
        btnK04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnK04ActionPerformed(evt);
            }
        });
        getContentPane().add(btnK04, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 520, -1, -1));

        btnK08.setBackground(new java.awt.Color(255, 204, 255));
        btnK08.setText("K08");
        btnK08.setPreferredSize(new java.awt.Dimension(55, 25));
        btnK08.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnK08ActionPerformed(evt);
            }
        });
        getContentPane().add(btnK08, new org.netbeans.lib.awtextra.AbsoluteConstraints(437, 520, -1, -1));

        btnK07.setBackground(new java.awt.Color(255, 204, 255));
        btnK07.setText("K07");
        btnK07.setPreferredSize(new java.awt.Dimension(55, 25));
        btnK07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnK07ActionPerformed(evt);
            }
        });
        getContentPane().add(btnK07, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 520, -1, -1));

        btnK11.setBackground(new java.awt.Color(255, 204, 255));
        btnK11.setText("K11");
        btnK11.setPreferredSize(new java.awt.Dimension(55, 25));
        btnK11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnK11ActionPerformed(evt);
            }
        });
        getContentPane().add(btnK11, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 520, -1, -1));

        btnTwin1.setBackground(new java.awt.Color(255, 204, 255));
        btnTwin1.setPreferredSize(new java.awt.Dimension(55, 25));
        getContentPane().add(btnTwin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 602, -1, -1));

        btnTwin2.setBackground(new java.awt.Color(255, 204, 255));
        btnTwin2.setPreferredSize(new java.awt.Dimension(55, 25));
        getContentPane().add(btnTwin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(441, 602, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Twin");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(506, 602, -1, 25));

        btnAvailable.setBackground(new java.awt.Color(255, 255, 255));
        btnAvailable.setPreferredSize(new java.awt.Dimension(55, 25));
        getContentPane().add(btnAvailable, new org.netbeans.lib.awtextra.AbsoluteConstraints(553, 602, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Available");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(618, 602, 50, 25));

        btnJ17.setBackground(new java.awt.Color(255, 255, 255));
        btnJ17.setText("J17");
        btnJ17.setPreferredSize(new java.awt.Dimension(55, 25));
        btnJ17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJ17ActionPerformed(evt);
            }
        });
        getContentPane().add(btnJ17, new org.netbeans.lib.awtextra.AbsoluteConstraints(986, 477, -1, -1));

        btnJ13.setBackground(new java.awt.Color(255, 255, 255));
        btnJ13.setText("J13");
        btnJ13.setPreferredSize(new java.awt.Dimension(55, 25));
        btnJ13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJ13ActionPerformed(evt);
            }
        });
        getContentPane().add(btnJ13, new org.netbeans.lib.awtextra.AbsoluteConstraints(742, 477, -1, -1));

        btnI14.setBackground(new java.awt.Color(255, 204, 255));
        btnI14.setText("I14");
        btnI14.setPreferredSize(new java.awt.Dimension(55, 25));
        btnI14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnI14ActionPerformed(evt);
            }
        });
        getContentPane().add(btnI14, new org.netbeans.lib.awtextra.AbsoluteConstraints(803, 434, -1, -1));

        btnJ15.setBackground(new java.awt.Color(255, 255, 255));
        btnJ15.setText("J15");
        btnJ15.setPreferredSize(new java.awt.Dimension(55, 25));
        btnJ15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJ15ActionPerformed(evt);
            }
        });
        getContentPane().add(btnJ15, new org.netbeans.lib.awtextra.AbsoluteConstraints(864, 477, -1, -1));

        btnI13.setBackground(new java.awt.Color(255, 204, 255));
        btnI13.setText("I13");
        btnI13.setPreferredSize(new java.awt.Dimension(55, 25));
        btnI13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnI13ActionPerformed(evt);
            }
        });
        getContentPane().add(btnI13, new org.netbeans.lib.awtextra.AbsoluteConstraints(742, 434, -1, -1));

        btnI17.setBackground(new java.awt.Color(255, 204, 255));
        btnI17.setText("I17");
        btnI17.setPreferredSize(new java.awt.Dimension(55, 25));
        btnI17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnI17ActionPerformed(evt);
            }
        });
        getContentPane().add(btnI17, new org.netbeans.lib.awtextra.AbsoluteConstraints(986, 434, -1, -1));

        btnK16.setBackground(new java.awt.Color(255, 204, 255));
        btnK16.setText("K16");
        btnK16.setPreferredSize(new java.awt.Dimension(55, 25));
        btnK16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnK16ActionPerformed(evt);
            }
        });
        getContentPane().add(btnK16, new org.netbeans.lib.awtextra.AbsoluteConstraints(925, 520, -1, -1));

        btnK14.setBackground(new java.awt.Color(255, 204, 255));
        btnK14.setText("K14");
        btnK14.setPreferredSize(new java.awt.Dimension(55, 25));
        btnK14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnK14ActionPerformed(evt);
            }
        });
        getContentPane().add(btnK14, new org.netbeans.lib.awtextra.AbsoluteConstraints(803, 520, -1, -1));

        btnK13.setBackground(new java.awt.Color(255, 204, 255));
        btnK13.setText("K13");
        btnK13.setPreferredSize(new java.awt.Dimension(55, 25));
        btnK13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnK13ActionPerformed(evt);
            }
        });
        getContentPane().add(btnK13, new org.netbeans.lib.awtextra.AbsoluteConstraints(742, 520, -1, -1));

        btnK17.setBackground(new java.awt.Color(255, 204, 255));
        btnK17.setText("K17");
        btnK17.setPreferredSize(new java.awt.Dimension(55, 25));
        btnK17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnK17ActionPerformed(evt);
            }
        });
        getContentPane().add(btnK17, new org.netbeans.lib.awtextra.AbsoluteConstraints(986, 520, -1, -1));

        btnA14.setBackground(new java.awt.Color(255, 204, 255));
        btnA14.setText("A14");
        btnA14.setPreferredSize(new java.awt.Dimension(55, 25));
        btnA14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnA14ActionPerformed(evt);
            }
        });
        getContentPane().add(btnA14, new org.netbeans.lib.awtextra.AbsoluteConstraints(803, 90, -1, -1));

        btnA13.setBackground(new java.awt.Color(255, 204, 255));
        btnA13.setText("A13");
        btnA13.setPreferredSize(new java.awt.Dimension(55, 25));
        btnA13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnA13ActionPerformed(evt);
            }
        });
        getContentPane().add(btnA13, new org.netbeans.lib.awtextra.AbsoluteConstraints(742, 90, -1, -1));

        btnA17.setBackground(new java.awt.Color(255, 204, 255));
        btnA17.setText("A17");
        btnA17.setPreferredSize(new java.awt.Dimension(55, 25));
        btnA17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnA17ActionPerformed(evt);
            }
        });
        getContentPane().add(btnA17, new org.netbeans.lib.awtextra.AbsoluteConstraints(986, 90, -1, -1));

        btnA16.setBackground(new java.awt.Color(255, 204, 255));
        btnA16.setText("A16");
        btnA16.setPreferredSize(new java.awt.Dimension(55, 25));
        btnA16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnA16ActionPerformed(evt);
            }
        });
        getContentPane().add(btnA16, new org.netbeans.lib.awtextra.AbsoluteConstraints(925, 90, -1, -1));

        btnB17.setBackground(new java.awt.Color(255, 255, 255));
        btnB17.setText("B17");
        btnB17.setPreferredSize(new java.awt.Dimension(55, 25));
        btnB17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnB17ActionPerformed(evt);
            }
        });
        getContentPane().add(btnB17, new org.netbeans.lib.awtextra.AbsoluteConstraints(986, 133, -1, -1));

        btnB13.setBackground(new java.awt.Color(255, 255, 255));
        btnB13.setText("B13");
        btnB13.setPreferredSize(new java.awt.Dimension(55, 25));
        btnB13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnB13ActionPerformed(evt);
            }
        });
        getContentPane().add(btnB13, new org.netbeans.lib.awtextra.AbsoluteConstraints(742, 133, -1, -1));

        btnB15.setBackground(new java.awt.Color(255, 255, 255));
        btnB15.setText("B15");
        btnB15.setPreferredSize(new java.awt.Dimension(55, 25));
        btnB15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnB15ActionPerformed(evt);
            }
        });
        getContentPane().add(btnB15, new org.netbeans.lib.awtextra.AbsoluteConstraints(864, 133, -1, -1));

        btnC16.setBackground(new java.awt.Color(255, 204, 255));
        btnC16.setText("C16");
        btnC16.setPreferredSize(new java.awt.Dimension(55, 25));
        btnC16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC16ActionPerformed(evt);
            }
        });
        getContentPane().add(btnC16, new org.netbeans.lib.awtextra.AbsoluteConstraints(925, 176, -1, -1));

        btnD17.setBackground(new java.awt.Color(255, 255, 255));
        btnD17.setText("D17");
        btnD17.setPreferredSize(new java.awt.Dimension(55, 25));
        btnD17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnD17ActionPerformed(evt);
            }
        });
        getContentPane().add(btnD17, new org.netbeans.lib.awtextra.AbsoluteConstraints(986, 219, -1, -1));

        btnD13.setBackground(new java.awt.Color(255, 255, 255));
        btnD13.setText("D13");
        btnD13.setPreferredSize(new java.awt.Dimension(55, 25));
        btnD13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnD13ActionPerformed(evt);
            }
        });
        getContentPane().add(btnD13, new org.netbeans.lib.awtextra.AbsoluteConstraints(742, 219, -1, -1));

        btnC14.setBackground(new java.awt.Color(255, 204, 255));
        btnC14.setText("C14");
        btnC14.setPreferredSize(new java.awt.Dimension(55, 25));
        btnC14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC14ActionPerformed(evt);
            }
        });
        getContentPane().add(btnC14, new org.netbeans.lib.awtextra.AbsoluteConstraints(803, 176, -1, -1));

        btnD15.setBackground(new java.awt.Color(255, 255, 255));
        btnD15.setText("D15");
        btnD15.setPreferredSize(new java.awt.Dimension(55, 25));
        btnD15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnD15ActionPerformed(evt);
            }
        });
        getContentPane().add(btnD15, new org.netbeans.lib.awtextra.AbsoluteConstraints(864, 219, -1, -1));

        btnC13.setBackground(new java.awt.Color(255, 204, 255));
        btnC13.setText("C13");
        btnC13.setPreferredSize(new java.awt.Dimension(55, 25));
        btnC13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC13ActionPerformed(evt);
            }
        });
        getContentPane().add(btnC13, new org.netbeans.lib.awtextra.AbsoluteConstraints(742, 176, -1, -1));

        btnC17.setBackground(new java.awt.Color(255, 204, 255));
        btnC17.setText("C17");
        btnC17.setPreferredSize(new java.awt.Dimension(55, 25));
        btnC17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC17ActionPerformed(evt);
            }
        });
        getContentPane().add(btnC17, new org.netbeans.lib.awtextra.AbsoluteConstraints(986, 176, -1, -1));

        btnE16.setBackground(new java.awt.Color(255, 204, 255));
        btnE16.setText("E16");
        btnE16.setPreferredSize(new java.awt.Dimension(55, 25));
        btnE16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnE16ActionPerformed(evt);
            }
        });
        getContentPane().add(btnE16, new org.netbeans.lib.awtextra.AbsoluteConstraints(925, 262, -1, -1));

        btnF17.setBackground(new java.awt.Color(255, 255, 255));
        btnF17.setText("F17");
        btnF17.setPreferredSize(new java.awt.Dimension(55, 25));
        btnF17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnF17ActionPerformed(evt);
            }
        });
        getContentPane().add(btnF17, new org.netbeans.lib.awtextra.AbsoluteConstraints(986, 305, -1, -1));

        btnF13.setBackground(new java.awt.Color(255, 255, 255));
        btnF13.setText("F13");
        btnF13.setPreferredSize(new java.awt.Dimension(55, 25));
        btnF13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnF13ActionPerformed(evt);
            }
        });
        getContentPane().add(btnF13, new org.netbeans.lib.awtextra.AbsoluteConstraints(742, 305, -1, -1));

        btnE14.setBackground(new java.awt.Color(255, 204, 255));
        btnE14.setText("E14");
        btnE14.setPreferredSize(new java.awt.Dimension(55, 25));
        btnE14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnE14ActionPerformed(evt);
            }
        });
        getContentPane().add(btnE14, new org.netbeans.lib.awtextra.AbsoluteConstraints(803, 262, -1, -1));

        btnF15.setBackground(new java.awt.Color(255, 255, 255));
        btnF15.setText("F15");
        btnF15.setPreferredSize(new java.awt.Dimension(55, 25));
        btnF15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnF15ActionPerformed(evt);
            }
        });
        getContentPane().add(btnF15, new org.netbeans.lib.awtextra.AbsoluteConstraints(864, 305, -1, -1));

        btnE13.setBackground(new java.awt.Color(255, 204, 255));
        btnE13.setText("E13");
        btnE13.setPreferredSize(new java.awt.Dimension(55, 25));
        btnE13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnE13ActionPerformed(evt);
            }
        });
        getContentPane().add(btnE13, new org.netbeans.lib.awtextra.AbsoluteConstraints(742, 262, -1, -1));

        btnE17.setBackground(new java.awt.Color(255, 204, 255));
        btnE17.setText("E17");
        btnE17.setPreferredSize(new java.awt.Dimension(55, 25));
        btnE17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnE17ActionPerformed(evt);
            }
        });
        getContentPane().add(btnE17, new org.netbeans.lib.awtextra.AbsoluteConstraints(986, 262, -1, -1));

        btnG16.setBackground(new java.awt.Color(255, 204, 255));
        btnG16.setText("G16");
        btnG16.setPreferredSize(new java.awt.Dimension(55, 25));
        btnG16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnG16ActionPerformed(evt);
            }
        });
        getContentPane().add(btnG16, new org.netbeans.lib.awtextra.AbsoluteConstraints(925, 348, -1, -1));

        btnH17.setBackground(new java.awt.Color(255, 255, 255));
        btnH17.setText("H17");
        btnH17.setPreferredSize(new java.awt.Dimension(55, 25));
        btnH17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnH17ActionPerformed(evt);
            }
        });
        getContentPane().add(btnH17, new org.netbeans.lib.awtextra.AbsoluteConstraints(986, 391, -1, -1));

        btnH13.setBackground(new java.awt.Color(255, 255, 255));
        btnH13.setText("H13");
        btnH13.setPreferredSize(new java.awt.Dimension(55, 25));
        btnH13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnH13ActionPerformed(evt);
            }
        });
        getContentPane().add(btnH13, new org.netbeans.lib.awtextra.AbsoluteConstraints(742, 391, -1, -1));

        btnG14.setBackground(new java.awt.Color(255, 204, 255));
        btnG14.setText("G14");
        btnG14.setPreferredSize(new java.awt.Dimension(55, 25));
        btnG14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnG14ActionPerformed(evt);
            }
        });
        getContentPane().add(btnG14, new org.netbeans.lib.awtextra.AbsoluteConstraints(803, 348, -1, -1));

        btnH15.setBackground(new java.awt.Color(255, 255, 255));
        btnH15.setText("H15");
        btnH15.setPreferredSize(new java.awt.Dimension(55, 25));
        btnH15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnH15ActionPerformed(evt);
            }
        });
        getContentPane().add(btnH15, new org.netbeans.lib.awtextra.AbsoluteConstraints(864, 391, -1, -1));

        btnG13.setBackground(new java.awt.Color(255, 204, 255));
        btnG13.setText("G13");
        btnG13.setPreferredSize(new java.awt.Dimension(55, 25));
        btnG13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnG13ActionPerformed(evt);
            }
        });
        getContentPane().add(btnG13, new org.netbeans.lib.awtextra.AbsoluteConstraints(742, 348, -1, -1));

        btnG17.setBackground(new java.awt.Color(255, 204, 255));
        btnG17.setText("G17");
        btnG17.setPreferredSize(new java.awt.Dimension(55, 25));
        btnG17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnG17ActionPerformed(evt);
            }
        });
        getContentPane().add(btnG17, new org.netbeans.lib.awtextra.AbsoluteConstraints(986, 348, -1, -1));

        btnI16.setBackground(new java.awt.Color(255, 204, 255));
        btnI16.setText("I16");
        btnI16.setPreferredSize(new java.awt.Dimension(55, 25));
        btnI16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnI16ActionPerformed(evt);
            }
        });
        getContentPane().add(btnI16, new org.netbeans.lib.awtextra.AbsoluteConstraints(925, 434, -1, -1));

        btnSelected.setBackground(new java.awt.Color(255, 255, 0));
        btnSelected.setPreferredSize(new java.awt.Dimension(55, 25));
        getContentPane().add(btnSelected, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 602, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Selected");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 600, 50, 30));

        btnUnavailable.setEnabled(false);
        btnUnavailable.setPreferredSize(new java.awt.Dimension(55, 25));
        getContentPane().add(btnUnavailable, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 600, -1, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Unavailable");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 600, 60, 25));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinemaswingtest1/image/mainmenu/dark grey (2).jpg"))); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnA01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA01ActionPerformed
        if (seat[0] == 1) {
            btnA01.setBackground(new Color(255, 204, 255));
            btnA02.setBackground(new Color(255, 204, 255));
            seat[0] = 0;
            seat[1] = 0;
            cnt-=2;
            to_book_seat_idx.remove(0);
            to_book_seat_idx.remove(1);
        }
        else if (seat[0] == 0) {
            btnA01.setBackground(Color.YELLOW);
            btnA02.setBackground(Color.YELLOW);
            seat[0] = 1;
            seat[1] = 1;
            cnt+=2;
            to_book_seat_idx.add(0);
            to_book_seat_idx.add(1);
        }
    }//GEN-LAST:event_btnA01ActionPerformed

    private void btnA02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA02ActionPerformed
        if (seat[0] == 1) {
            btnA01.setBackground(new Color(255, 204, 255));
            btnA02.setBackground(new Color(255, 204, 255));
            seat[0] = 0;
            seat[1] = 0;
            cnt-=2;
            to_book_seat_idx.remove(0);
            to_book_seat_idx.remove(1);
        }
        else if (seat[0] == 0) {
            btnA01.setBackground(Color.YELLOW);
            btnA02.setBackground(Color.YELLOW);
            seat[0] = 1;
            seat[1] = 1;
            cnt+=2;
            to_book_seat_idx.add(0);
            to_book_seat_idx.add(1);
        }
    }//GEN-LAST:event_btnA02ActionPerformed

    private void btnA04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA04ActionPerformed
        if (seat[2] == 1) {
            btnA04.setBackground(new Color(255, 204, 255));
            btnA05.setBackground(new Color(255, 204, 255));
            seat[2] = 0;
            seat[3] = 0;
            cnt-=2;
            to_book_seat_idx.remove(2);
            to_book_seat_idx.remove(3);
        }
        else if (seat[2] == 0) {
            btnA04.setBackground(Color.YELLOW);
            btnA05.setBackground(Color.YELLOW);
            seat[2] = 1;
            seat[3] = 1;
            cnt+=2;
            to_book_seat_idx.add(2);
            to_book_seat_idx.add(3);
        }
    }//GEN-LAST:event_btnA04ActionPerformed

    private void btnA05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA05ActionPerformed
        if (seat[2] == 1) {
            btnA04.setBackground(new Color(255, 204, 255));
            btnA05.setBackground(new Color(255, 204, 255));
            seat[2] = 0;
            seat[3] = 0;
            cnt-=2;
            to_book_seat_idx.remove(2);
            to_book_seat_idx.remove(3);
        }
        else if (seat[2] == 0) {
            btnA04.setBackground(Color.YELLOW);
            btnA05.setBackground(Color.YELLOW);
            seat[2] = 1;
            seat[3] = 1;
            cnt+=2;
            to_book_seat_idx.add(2);
            to_book_seat_idx.add(3);
        }
    }//GEN-LAST:event_btnA05ActionPerformed

    private void btnA07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA07ActionPerformed
        if (seat[4] == 1) {
            btnA07.setBackground(new Color(255, 204, 255));
            btnA08.setBackground(new Color(255, 204, 255));
            seat[4] = 0;
            seat[5] = 0;
            cnt-=2;
            to_book_seat_idx.remove(4);
            to_book_seat_idx.remove(5);
        }
        else if (seat[4] == 0) {
            btnA07.setBackground(Color.YELLOW);
            btnA08.setBackground(Color.YELLOW);
            seat[4] = 1;
            seat[5] = 1;
            cnt+=2;
            to_book_seat_idx.add(4);
            to_book_seat_idx.add(5);
        }
    }//GEN-LAST:event_btnA07ActionPerformed

    private void btnA08ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA08ActionPerformed
        if (seat[4] == 1) {
            btnA07.setBackground(new Color(255, 204, 255));
            btnA08.setBackground(new Color(255, 204, 255));
            seat[4] = 0;
            seat[5] = 0;
            cnt-=2;
            to_book_seat_idx.remove(4);
            to_book_seat_idx.remove(5);
        }
        else if (seat[4] == 0) {
            btnA07.setBackground(Color.YELLOW);
            btnA08.setBackground(Color.YELLOW);
            seat[4] = 1;
            seat[5] = 1;
            cnt+=2;
            to_book_seat_idx.add(4);
            to_book_seat_idx.add(5);
        }
    }//GEN-LAST:event_btnA08ActionPerformed

    private void btnA10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA10ActionPerformed
        if (seat[6] == 1) {
            btnA10.setBackground(new Color(255, 204, 255));
            btnA11.setBackground(new Color(255, 204, 255));
            seat[6] = 0;
            seat[7] = 0;
            cnt-=2;
            to_book_seat_idx.remove(6);
            to_book_seat_idx.remove(7);
        }
        else if (seat[6] == 0) {
            btnA10.setBackground(Color.YELLOW);
            btnA11.setBackground(Color.YELLOW);
            seat[6] = 1;
            seat[7] = 1;
            cnt+=2;
            to_book_seat_idx.add(6);
            to_book_seat_idx.add(7);
        }
    }//GEN-LAST:event_btnA10ActionPerformed

    private void btnA11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA11ActionPerformed
        if (seat[6] == 1) {
            btnA10.setBackground(new Color(255, 204, 255));
            btnA11.setBackground(new Color(255, 204, 255));
            seat[6] = 0;
            seat[7] = 0;
            cnt-=2;
            to_book_seat_idx.remove(6);
            to_book_seat_idx.remove(7);
        }
        else if (seat[6] == 0) {
            btnA10.setBackground(Color.YELLOW);
            btnA11.setBackground(Color.YELLOW);
            seat[6] = 1;
            seat[7] = 1;
            cnt+=2;
            to_book_seat_idx.add(6);
            to_book_seat_idx.add(7);
        }
    }//GEN-LAST:event_btnA11ActionPerformed

    private void btnA13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA13ActionPerformed
        if (seat[8] == 1) {
            btnA13.setBackground(new Color(255, 204, 255));
            btnA14.setBackground(new Color(255, 204, 255));
            seat[8] = 0;
            seat[9] = 0;
            cnt-=2;
            to_book_seat_idx.remove(8);
            to_book_seat_idx.remove(9);
        }
        else if (seat[8] == 0) {
            btnA13.setBackground(Color.YELLOW);
            btnA14.setBackground(Color.YELLOW);
            seat[8] = 1;
            seat[9] = 1;
            cnt+=2;
            to_book_seat_idx.add(8);
            to_book_seat_idx.add(9);
        }
    }//GEN-LAST:event_btnA13ActionPerformed

    private void btnA14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA14ActionPerformed
        if (seat[8] == 1) {
            btnA13.setBackground(new Color(255, 204, 255));
            btnA14.setBackground(new Color(255, 204, 255));
            seat[8] = 0;
            seat[9] = 0;
            cnt-=2;
            to_book_seat_idx.remove(8);
            to_book_seat_idx.remove(9);
        }
        else if (seat[8] == 0) {
            btnA13.setBackground(Color.YELLOW);
            btnA14.setBackground(Color.YELLOW);
            seat[8] = 1;
            seat[9] = 1;
            cnt+=2;
            to_book_seat_idx.add(8);
            to_book_seat_idx.add(9);
        }
    }//GEN-LAST:event_btnA14ActionPerformed

    private void btnA16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA16ActionPerformed
        if (seat[10] == 1) {
            btnA16.setBackground(new Color(255, 204, 255));
            btnA17.setBackground(new Color(255, 204, 255));
            seat[10] = 0;
            seat[11] = 0;
            cnt-=2;
            to_book_seat_idx.remove(10);
            to_book_seat_idx.remove(11);
        }
        else if (seat[10] == 0) {
            btnA16.setBackground(Color.YELLOW);
            btnA17.setBackground(Color.YELLOW);
            seat[10] = 1;
            seat[11] = 1;
            cnt+=2;
            to_book_seat_idx.add(10);
            to_book_seat_idx.add(11);
        }
    }//GEN-LAST:event_btnA16ActionPerformed

    private void btnA17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA17ActionPerformed
        if (seat[10] == 1) {
            btnA16.setBackground(new Color(255, 204, 255));
            btnA17.setBackground(new Color(255, 204, 255));
            seat[10] = 0;
            seat[11] = 0;
            cnt-=2;
            to_book_seat_idx.remove(10);
            to_book_seat_idx.remove(11);
        }
        else if (seat[10] == 0) {
            btnA16.setBackground(Color.YELLOW);
            btnA17.setBackground(Color.YELLOW);
            seat[10] = 1;
            seat[11] = 1;
            cnt+=2;
            to_book_seat_idx.add(10);
            to_book_seat_idx.add(11);
        }
    }//GEN-LAST:event_btnA17ActionPerformed

    private void btnB01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnB01ActionPerformed
        if (seat[12] == 1) {
            btnB01.setBackground(Color.WHITE);
            seat[12] = 0;
            cnt-=1;
            to_book_seat_idx.remove(12);
        }
        else if (seat[12] == 0) {
            btnB01.setBackground(Color.YELLOW);
            seat[12] = 1;
            cnt+=1;
            to_book_seat_idx.add(12);
        }
    }//GEN-LAST:event_btnB01ActionPerformed

    private void btnB03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnB03ActionPerformed
        if (seat[13] == 1) {
            btnB03.setBackground(Color.WHITE);
            seat[13] = 0;
            cnt-=1;
            to_book_seat_idx.remove(13);
        }
        else if (seat[13] == 0) {
            btnB03.setBackground(Color.YELLOW);
            seat[13] = 1;
            cnt+=1;
            to_book_seat_idx.add(13);
        }
    }//GEN-LAST:event_btnB03ActionPerformed

    private void btnB05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnB05ActionPerformed
        if (seat[14] == 1) {
            btnB05.setBackground(Color.WHITE);
            seat[14] = 0;
            cnt-=1;
            to_book_seat_idx.remove(14);
        }
        else if (seat[14] == 0) {
            btnB05.setBackground(Color.YELLOW);
            seat[14] = 1;
            cnt+=1;
            to_book_seat_idx.add(14);
        }
    }//GEN-LAST:event_btnB05ActionPerformed

    private void btnB07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnB07ActionPerformed
        if (seat[15] == 1) {
            btnB07.setBackground(Color.WHITE);
            seat[15] = 0;
            cnt-=1;
            to_book_seat_idx.remove(15);
        }
        else if (seat[15] == 0) {
            btnB07.setBackground(Color.YELLOW);
            seat[15] = 1;
            cnt+=1;
            to_book_seat_idx.add(15);
        }
    }//GEN-LAST:event_btnB07ActionPerformed

    private void btnB09ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnB09ActionPerformed
        if (seat[16] == 1) {
            btnB09.setBackground(Color.WHITE);
            seat[16] = 0;
            cnt-=1;
            to_book_seat_idx.remove(16);
        }
        else if (seat[16] == 0) {
            btnB09.setBackground(Color.YELLOW);
            seat[16] = 1;
            cnt+=1;
            to_book_seat_idx.add(16);
        }
    }//GEN-LAST:event_btnB09ActionPerformed

    private void btnB11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnB11ActionPerformed
        if (seat[17] == 1) {
            btnB11.setBackground(Color.WHITE);
            seat[17] = 0;
            cnt-=1;
            to_book_seat_idx.remove(17);
        }
        else if (seat[17] == 0) {
            btnB11.setBackground(Color.YELLOW);
            seat[17] = 1;
            cnt+=1;
            to_book_seat_idx.add(17);
        }
    }//GEN-LAST:event_btnB11ActionPerformed

    private void btnB13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnB13ActionPerformed
        if (seat[18] == 1) {
            btnB13.setBackground(Color.WHITE);
            seat[18] = 0;
            cnt-=1;
            to_book_seat_idx.remove(18);
        }
        else if (seat[18] == 0) {
            btnB13.setBackground(Color.YELLOW);
            seat[18] = 1;
            cnt+=1;
            to_book_seat_idx.add(18);
        }
    }//GEN-LAST:event_btnB13ActionPerformed

    private void btnB15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnB15ActionPerformed
        if (seat[19] == 1) {
            btnB15.setBackground(Color.WHITE);
            seat[19] = 0;
            cnt-=1;
            to_book_seat_idx.remove(19);
        }
        else if (seat[19] == 0) {
            btnB15.setBackground(Color.YELLOW);
            seat[19] = 1;
            cnt+=1;
            to_book_seat_idx.add(19);
        }
    }//GEN-LAST:event_btnB15ActionPerformed

    private void btnB17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnB17ActionPerformed
        if (seat[20] == 1) {
            btnB17.setBackground(Color.WHITE);
            seat[20] = 0;
            cnt-=1;
            to_book_seat_idx.remove(20);
        }
        else if (seat[20] == 0) {
            btnB17.setBackground(Color.YELLOW);
            seat[20] = 1;
            cnt+=1;
            to_book_seat_idx.add(20);
        }
    }//GEN-LAST:event_btnB17ActionPerformed

    private void btnC01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC01ActionPerformed
        if (seat[21] == 1) {
            btnC01.setBackground(new Color(255, 204, 255));
            btnC02.setBackground(new Color(255, 204, 255));
            seat[21] = 0;
            seat[22] = 0;
            cnt-=2;
            to_book_seat_idx.remove(21);
            to_book_seat_idx.remove(22);
        }
        else if (seat[21] == 0) {
            btnC01.setBackground(Color.YELLOW);
            btnC02.setBackground(Color.YELLOW);
            seat[21] = 1;
            seat[22] = 1;
            cnt+=2;
            to_book_seat_idx.add(21);
            to_book_seat_idx.add(22);
        }
    }//GEN-LAST:event_btnC01ActionPerformed

    private void btnC02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC02ActionPerformed
        if (seat[21] == 1) {
            btnC01.setBackground(new Color(255, 204, 255));
            btnC02.setBackground(new Color(255, 204, 255));
            seat[21] = 0;
            seat[22] = 0;
            cnt-=2;
            to_book_seat_idx.remove(21);
            to_book_seat_idx.remove(22);
        }
        else if (seat[21] == 0) {
            btnC01.setBackground(Color.YELLOW);
            btnC02.setBackground(Color.YELLOW);
            seat[21] = 1;
            seat[22] = 1;
            cnt+=2;
            to_book_seat_idx.add(21);
            to_book_seat_idx.add(22);
        }
    }//GEN-LAST:event_btnC02ActionPerformed

    private void btnC04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC04ActionPerformed
        if (seat[23] == 1) {
            btnC04.setBackground(new Color(255, 204, 255));
            btnC05.setBackground(new Color(255, 204, 255));
            seat[23] = 0;
            seat[24] = 0;
            cnt-=2;
            to_book_seat_idx.remove(23);
            to_book_seat_idx.remove(24);
        }
        else if (seat[23] == 0) {
            btnC04.setBackground(Color.YELLOW);
            btnC05.setBackground(Color.YELLOW);
            seat[23] = 1;
            seat[24] = 1;
            cnt+=2;
            to_book_seat_idx.add(23);
            to_book_seat_idx.add(24);
        }
    }//GEN-LAST:event_btnC04ActionPerformed

    private void btnC05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC05ActionPerformed
        if (seat[23] == 1) {
            btnC04.setBackground(new Color(255, 204, 255));
            btnC05.setBackground(new Color(255, 204, 255));
            seat[23] = 0;
            seat[24] = 0;
            cnt-=2;
            to_book_seat_idx.remove(23);
            to_book_seat_idx.remove(24);
        }
        else if (seat[23] == 0) {
            btnC04.setBackground(Color.YELLOW);
            btnC05.setBackground(Color.YELLOW);
            seat[23] = 1;
            seat[24] = 1;
            cnt+=2;
            to_book_seat_idx.add(23);
            to_book_seat_idx.add(24);
        }
    }//GEN-LAST:event_btnC05ActionPerformed

    private void btnC07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC07ActionPerformed
        if (seat[25] == 1) {
            btnC07.setBackground(new Color(255, 204, 255));
            btnC08.setBackground(new Color(255, 204, 255));
            seat[25] = 0;
            seat[26] = 0;
            cnt-=2;
            to_book_seat_idx.remove(25);
            to_book_seat_idx.remove(26);
        }
        else if (seat[25] == 0) {
            btnC07.setBackground(Color.YELLOW);
            btnC08.setBackground(Color.YELLOW);
            seat[25] = 1;
            seat[26] = 1;
            cnt+=2;
            to_book_seat_idx.add(25);
            to_book_seat_idx.add(26);
        }
    }//GEN-LAST:event_btnC07ActionPerformed

    private void btnC08ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC08ActionPerformed
        if (seat[25] == 1) {
            btnC07.setBackground(new Color(255, 204, 255));
            btnC08.setBackground(new Color(255, 204, 255));
            seat[25] = 0;
            seat[26] = 0;
            cnt-=2;
            to_book_seat_idx.remove(25);
            to_book_seat_idx.remove(26);
        }
        else if (seat[25] == 0) {
            btnC07.setBackground(Color.YELLOW);
            btnC08.setBackground(Color.YELLOW);
            seat[25] = 1;
            seat[26] = 1;
            cnt+=2;
            to_book_seat_idx.add(25);
            to_book_seat_idx.add(26);
        }
    }//GEN-LAST:event_btnC08ActionPerformed

    private void btnC10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC10ActionPerformed
        if (seat[27] == 1) {
            btnC10.setBackground(new Color(255, 204, 255));
            btnC11.setBackground(new Color(255, 204, 255));
            seat[27] = 0;
            seat[28] = 0;
            cnt-=2;
            to_book_seat_idx.remove(27);
            to_book_seat_idx.remove(28);
        }
        else if (seat[27] == 0) {
            btnC10.setBackground(Color.YELLOW);
            btnC11.setBackground(Color.YELLOW);
            seat[27] = 1;
            seat[28] = 1;
            cnt+=2;
            to_book_seat_idx.add(27);
            to_book_seat_idx.add(28);
        }
    }//GEN-LAST:event_btnC10ActionPerformed

    private void btnC11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC11ActionPerformed
        if (seat[27] == 1) {
            btnC10.setBackground(new Color(255, 204, 255));
            btnC11.setBackground(new Color(255, 204, 255));
            seat[27] = 0;
            seat[28] = 0;
            cnt-=2;
            to_book_seat_idx.remove(27);
            to_book_seat_idx.remove(28);
        }
        else if (seat[27] == 0) {
            btnC10.setBackground(Color.YELLOW);
            btnC11.setBackground(Color.YELLOW);
            seat[27] = 1;
            seat[28] = 1;
            cnt+=2;
            to_book_seat_idx.add(27);
            to_book_seat_idx.add(28);
        }
    }//GEN-LAST:event_btnC11ActionPerformed

    private void btnC13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC13ActionPerformed
        if (seat[29] == 1) {
            btnC13.setBackground(new Color(255, 204, 255));
            btnC14.setBackground(new Color(255, 204, 255));
            seat[29] = 0;
            seat[30] = 0;
            cnt-=2;
            to_book_seat_idx.remove(29);
            to_book_seat_idx.remove(30);
        }
        else if (seat[29] == 0) {
            btnC13.setBackground(Color.YELLOW);
            btnC14.setBackground(Color.YELLOW);
            seat[29] = 1;
            seat[30] = 1;
            cnt+=2;
            to_book_seat_idx.add(29);
            to_book_seat_idx.add(30);
        }
    }//GEN-LAST:event_btnC13ActionPerformed

    private void btnC14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC14ActionPerformed
        if (seat[29] == 1) {
            btnC13.setBackground(new Color(255, 204, 255));
            btnC14.setBackground(new Color(255, 204, 255));
            seat[29] = 0;
            seat[30] = 0;
            cnt-=2;
            to_book_seat_idx.remove(29);
            to_book_seat_idx.remove(30);
        }
        else if (seat[29] == 0) {
            btnC13.setBackground(Color.YELLOW);
            btnC14.setBackground(Color.YELLOW);
            seat[29] = 1;
            seat[30] = 1;
            cnt+=2;
            to_book_seat_idx.add(29);
            to_book_seat_idx.add(30);
        }
    }//GEN-LAST:event_btnC14ActionPerformed

    private void btnC16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC16ActionPerformed
        if (seat[31] == 1) {
            btnC16.setBackground(new Color(255, 204, 255));
            btnC17.setBackground(new Color(255, 204, 255));
            seat[31] = 0;
            seat[32] = 0;
            cnt-=2;
            to_book_seat_idx.remove(31);
            to_book_seat_idx.remove(32);
        }
        else if (seat[31] == 0) {
            btnC16.setBackground(Color.YELLOW);
            btnC17.setBackground(Color.YELLOW);
            seat[31] = 1;
            seat[32] = 1;
            cnt+=2;
            to_book_seat_idx.add(31);
            to_book_seat_idx.add(32);
        }
    }//GEN-LAST:event_btnC16ActionPerformed

    private void btnC17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC17ActionPerformed
        if (seat[31] == 1) {
            btnC16.setBackground(new Color(255, 204, 255));
            btnC17.setBackground(new Color(255, 204, 255));
            seat[31] = 0;
            seat[32] = 0;
            cnt-=2;
            to_book_seat_idx.remove(31);
            to_book_seat_idx.remove(32);
        }
        else if (seat[31] == 0) {
            btnC16.setBackground(Color.YELLOW);
            btnC17.setBackground(Color.YELLOW);
            seat[31] = 1;
            seat[32] = 1;
            cnt+=2;
            to_book_seat_idx.add(31);
            to_book_seat_idx.add(32);
        }
    }//GEN-LAST:event_btnC17ActionPerformed

    private void btnD01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnD01ActionPerformed
        if (seat[33] == 1) {
            btnD01.setBackground(Color.WHITE);
            seat[33] = 0;
            cnt-=1;
            to_book_seat_idx.remove(33);
        }
        else if (seat[33] == 0) {
            btnD01.setBackground(Color.YELLOW);
            seat[33] = 1;
            cnt+=1;
            to_book_seat_idx.add(33);
        }
    }//GEN-LAST:event_btnD01ActionPerformed

    private void btnD03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnD03ActionPerformed
        if (seat[34] == 1) {
            btnD03.setBackground(Color.WHITE);
            seat[34] = 0;
            cnt-=1;
            to_book_seat_idx.remove(34);
        }
        else if (seat[34] == 0) {
            btnD03.setBackground(Color.YELLOW);
            seat[34] = 1;
            cnt+=1;
            to_book_seat_idx.add(34);
        }
    }//GEN-LAST:event_btnD03ActionPerformed

    private void btnD05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnD05ActionPerformed
        if (seat[35] == 1) {
            btnD05.setBackground(Color.WHITE);
            seat[35] = 0;
            cnt-=1;
            to_book_seat_idx.remove(35);
        }
        else if (seat[35] == 0) {
            btnD05.setBackground(Color.YELLOW);
            seat[35] = 1;
            cnt+=1;
            to_book_seat_idx.add(35);
        }
    }//GEN-LAST:event_btnD05ActionPerformed

    private void btnD07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnD07ActionPerformed
        if (seat[36] == 1) {
            btnD07.setBackground(Color.WHITE);
            seat[36] = 0;
            cnt-=1;
            to_book_seat_idx.remove(36);
        }
        else if (seat[36] == 0) {
            btnD07.setBackground(Color.YELLOW);
            seat[36] = 1;
            cnt+=1;
            to_book_seat_idx.add(36);
        }
    }//GEN-LAST:event_btnD07ActionPerformed

    private void btnD09ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnD09ActionPerformed
        if (seat[37] == 1) {
            btnD09.setBackground(Color.WHITE);
            seat[37] = 0;
            cnt-=1;
            to_book_seat_idx.remove(37);
        }
        else if (seat[37] == 0) {
            btnD09.setBackground(Color.YELLOW);
            seat[37] = 1;
            cnt+=1;
            to_book_seat_idx.add(37);
        }
    }//GEN-LAST:event_btnD09ActionPerformed

    private void btnD11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnD11ActionPerformed
        if (seat[38] == 1) {
            btnD11.setBackground(Color.WHITE);
            seat[38] = 0;
            cnt-=1;
            to_book_seat_idx.remove(38);
        }
        else if (seat[38] == 0) {
            btnD11.setBackground(Color.YELLOW);
            seat[38] = 1;
            cnt+=1;
            to_book_seat_idx.add(38);
        }
    }//GEN-LAST:event_btnD11ActionPerformed

    private void btnD13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnD13ActionPerformed
        if (seat[39] == 1) {
            btnD13.setBackground(Color.WHITE);
            seat[39] = 0;
            cnt-=1;
            to_book_seat_idx.remove(39);
        }
        else if (seat[39] == 0) {
            btnD13.setBackground(Color.YELLOW);
            seat[39] = 1;
            cnt+=1;
            to_book_seat_idx.add(39);
        }
    }//GEN-LAST:event_btnD13ActionPerformed

    private void btnD15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnD15ActionPerformed
        if (seat[40] == 1) {
            btnD15.setBackground(Color.WHITE);
            seat[40] = 0;
            cnt-=1;
            to_book_seat_idx.remove(40);
        }
        else if (seat[40] == 0) {
            btnD15.setBackground(Color.YELLOW);
            seat[40] = 1;
            cnt+=1;
            to_book_seat_idx.add(40);
        }
    }//GEN-LAST:event_btnD15ActionPerformed

    private void btnD17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnD17ActionPerformed
        if (seat[41] == 1) {
            btnD17.setBackground(Color.WHITE);
            seat[41] = 0;
            cnt-=1;
            to_book_seat_idx.remove(41);
        }
        else if (seat[41] == 0) {
            btnD17.setBackground(Color.YELLOW);
            seat[41] = 1;
            cnt+=1;
            to_book_seat_idx.add(41);
        }
    }//GEN-LAST:event_btnD17ActionPerformed

    private void btnE01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnE01ActionPerformed
        if (seat[42] == 1) {
            btnE01.setBackground(new Color(255, 204, 255));
            btnE02.setBackground(new Color(255, 204, 255));
            seat[42] = 0;
            seat[43] = 0;
            cnt-=2;
            to_book_seat_idx.remove(42);
            to_book_seat_idx.remove(43);
        }
        else if (seat[42] == 0) {
            btnE01.setBackground(Color.YELLOW);
            btnE02.setBackground(Color.YELLOW);
            seat[42] = 1;
            seat[43] = 1;
            cnt+=2;
            to_book_seat_idx.add(42);
            to_book_seat_idx.add(43);
        }
    }//GEN-LAST:event_btnE01ActionPerformed

    private void btnE02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnE02ActionPerformed
        if (seat[42] == 1) {
            btnE01.setBackground(new Color(255, 204, 255));
            btnE02.setBackground(new Color(255, 204, 255));
            seat[42] = 0;
            seat[43] = 0;
            cnt-=2;
            to_book_seat_idx.remove(42);
            to_book_seat_idx.remove(43);
        }
        else if (seat[42] == 0) {
            btnE01.setBackground(Color.YELLOW);
            btnE02.setBackground(Color.YELLOW);
            seat[42] = 1;
            seat[43] = 1;
            cnt+=2;
            to_book_seat_idx.add(42);
            to_book_seat_idx.add(43);
        }
    }//GEN-LAST:event_btnE02ActionPerformed

    private void btnE04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnE04ActionPerformed
        if (seat[44] == 1) {
            btnE04.setBackground(new Color(255, 204, 255));
            btnE05.setBackground(new Color(255, 204, 255));
            seat[44] = 0;
            seat[45] = 0;
            cnt-=2;
            to_book_seat_idx.remove(44);
            to_book_seat_idx.remove(45);
        }
        else if (seat[44] == 0) {
            btnE04.setBackground(Color.YELLOW);
            btnE05.setBackground(Color.YELLOW);
            seat[44] = 1;
            seat[45] = 1;
            cnt+=2;
            to_book_seat_idx.add(44);
            to_book_seat_idx.add(45);
        }
    }//GEN-LAST:event_btnE04ActionPerformed

    private void btnE05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnE05ActionPerformed
        if (seat[44] == 1) {
            btnE04.setBackground(new Color(255, 204, 255));
            btnE05.setBackground(new Color(255, 204, 255));
            seat[44] = 0;
            seat[45] = 0;
            cnt-=2;
            to_book_seat_idx.remove(44);
            to_book_seat_idx.remove(45);
        }
        else if (seat[44] == 0) {
            btnE04.setBackground(Color.YELLOW);
            btnE05.setBackground(Color.YELLOW);
            seat[44] = 1;
            seat[45] = 1;
            cnt+=2;
            to_book_seat_idx.add(44);
            to_book_seat_idx.add(45);
        }
    }//GEN-LAST:event_btnE05ActionPerformed

    private void btnE07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnE07ActionPerformed
        if (seat[46] == 1) {
            btnE07.setBackground(new Color(255, 204, 255));
            btnE08.setBackground(new Color(255, 204, 255));
            seat[46] = 0;
            seat[47] = 0;
            cnt-=2;
            to_book_seat_idx.remove(46);
            to_book_seat_idx.remove(47);
        }
        else if (seat[46] == 0) {
            btnE07.setBackground(Color.YELLOW);
            btnE08.setBackground(Color.YELLOW);
            seat[46] = 1;
            seat[47] = 1;
            cnt+=2;
            to_book_seat_idx.add(46);
            to_book_seat_idx.add(47);
        }
    }//GEN-LAST:event_btnE07ActionPerformed

    private void btnE08ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnE08ActionPerformed
        if (seat[46] == 1) {
            btnE07.setBackground(new Color(255, 204, 255));
            btnE08.setBackground(new Color(255, 204, 255));
            seat[46] = 0;
            seat[47] = 0;
            cnt-=2;
            to_book_seat_idx.remove(46);
            to_book_seat_idx.remove(47);
        }
        else if (seat[46] == 0) {
            btnE07.setBackground(Color.YELLOW);
            btnE08.setBackground(Color.YELLOW);
            seat[46] = 1;
            seat[47] = 1;
            cnt+=2;
            to_book_seat_idx.add(46);
            to_book_seat_idx.add(47);
        }
    }//GEN-LAST:event_btnE08ActionPerformed

    private void btnE10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnE10ActionPerformed
        if (seat[48] == 1) {
            btnE10.setBackground(new Color(255, 204, 255));
            btnE11.setBackground(new Color(255, 204, 255));
            seat[48] = 0;
            seat[49] = 0;
            cnt-=2;
            to_book_seat_idx.remove(48);
            to_book_seat_idx.remove(49);
        }
        else if (seat[48] == 0) {
            btnE10.setBackground(Color.YELLOW);
            btnE11.setBackground(Color.YELLOW);
            seat[48] = 1;
            seat[49] = 1;
            cnt+=2;
            to_book_seat_idx.add(48);
            to_book_seat_idx.add(49);
        }
    }//GEN-LAST:event_btnE10ActionPerformed

    private void btnE11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnE11ActionPerformed
        if (seat[48] == 1) {
            btnE10.setBackground(new Color(255, 204, 255));
            btnE11.setBackground(new Color(255, 204, 255));
            seat[48] = 0;
            seat[49] = 0;
            cnt-=2;
            to_book_seat_idx.remove(48);
            to_book_seat_idx.remove(49);
        }
        else if (seat[48] == 0) {
            btnE10.setBackground(Color.YELLOW);
            btnE11.setBackground(Color.YELLOW);
            seat[48] = 1;
            seat[49] = 1;
            cnt+=2;
            to_book_seat_idx.add(48);
            to_book_seat_idx.add(49);
        }
    }//GEN-LAST:event_btnE11ActionPerformed

    private void btnE13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnE13ActionPerformed
        if (seat[50] == 1) {
            btnE13.setBackground(new Color(255, 204, 255));
            btnE14.setBackground(new Color(255, 204, 255));
            seat[50] = 0;
            seat[51] = 0;
            cnt-=2;
            to_book_seat_idx.remove(50);
            to_book_seat_idx.remove(51);
        }
        else if (seat[50] == 0) {
            btnE13.setBackground(Color.YELLOW);
            btnE14.setBackground(Color.YELLOW);
            seat[50] = 1;
            seat[51] = 1;
            cnt+=2;
            to_book_seat_idx.add(50);
            to_book_seat_idx.add(51);
        }
    }//GEN-LAST:event_btnE13ActionPerformed

    private void btnE14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnE14ActionPerformed
        if (seat[50] == 1) {
            btnE13.setBackground(new Color(255, 204, 255));
            btnE14.setBackground(new Color(255, 204, 255));
            seat[50] = 0;
            seat[51] = 0;
            cnt-=2;
            to_book_seat_idx.remove(50);
            to_book_seat_idx.remove(51);
        }
        else if (seat[50] == 0) {
            btnE13.setBackground(Color.YELLOW);
            btnE14.setBackground(Color.YELLOW);
            seat[50] = 1;
            seat[51] = 1;
            cnt+=2;
            to_book_seat_idx.add(50);
            to_book_seat_idx.add(51);
        }
    }//GEN-LAST:event_btnE14ActionPerformed

    private void btnE16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnE16ActionPerformed
        if (seat[52] == 1) {
            btnE16.setBackground(new Color(255, 204, 255));
            btnE17.setBackground(new Color(255, 204, 255));
            seat[52] = 0;
            seat[53] = 0;
            cnt-=2;
            to_book_seat_idx.remove(52);
            to_book_seat_idx.remove(53);
        }
        else if (seat[52] == 0) {
            btnE16.setBackground(Color.YELLOW);
            btnE17.setBackground(Color.YELLOW);
            seat[52] = 1;
            seat[53] = 1;
            cnt+=2;
            to_book_seat_idx.add(52);
            to_book_seat_idx.add(53);
        }
    }//GEN-LAST:event_btnE16ActionPerformed

    private void btnE17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnE17ActionPerformed
        if (seat[52] == 1) {
            btnE16.setBackground(new Color(255, 204, 255));
            btnE17.setBackground(new Color(255, 204, 255));
            seat[52] = 0;
            seat[53] = 0;
            cnt-=2;
            to_book_seat_idx.remove(52);
            to_book_seat_idx.remove(53);
        }
        else if (seat[52] == 0) {
            btnE16.setBackground(Color.YELLOW);
            btnE17.setBackground(Color.YELLOW);
            seat[52] = 1;
            seat[53] = 1;
            cnt+=2;
            to_book_seat_idx.add(52);
            to_book_seat_idx.add(53);
        }
    }//GEN-LAST:event_btnE17ActionPerformed

    private void btnF01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnF01ActionPerformed
        if (seat[54] == 1) {
            btnF01.setBackground(Color.WHITE);
            seat[54] = 0;
            cnt-=1;
            to_book_seat_idx.remove(54);
        }
        else if (seat[54] == 0) {
            btnF01.setBackground(Color.YELLOW);
            seat[54] = 1;
            cnt+=1;
            to_book_seat_idx.add(54);
        }
    }//GEN-LAST:event_btnF01ActionPerformed

    private void btnF03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnF03ActionPerformed
        if (seat[55] == 1) {
            btnF03.setBackground(Color.WHITE);
            seat[55] = 0;
            cnt-=1;
            to_book_seat_idx.remove(55);
        }
        else if (seat[55] == 0) {
            btnF03.setBackground(Color.YELLOW);
            seat[55] = 1;
            cnt+=1;
            to_book_seat_idx.add(55);
        }
    }//GEN-LAST:event_btnF03ActionPerformed

    private void btnF05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnF05ActionPerformed
        if (seat[56] == 1) {
            btnF05.setBackground(Color.WHITE);
            seat[56] = 0;
            cnt-=1;
            to_book_seat_idx.remove(56);
        }
        else if (seat[56] == 0) {
            btnF05.setBackground(Color.YELLOW);
            seat[56] = 1;
            cnt+=1;
            to_book_seat_idx.add(56);
        }
    }//GEN-LAST:event_btnF05ActionPerformed

    private void btnF07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnF07ActionPerformed
        if (seat[57] == 1) {
            btnF07.setBackground(Color.WHITE);
            seat[57] = 0;
            cnt-=1;
            to_book_seat_idx.remove(57);
        }
        else if (seat[57] == 0) {
            btnF07.setBackground(Color.YELLOW);
            seat[57] = 1;
            cnt+=1;
            to_book_seat_idx.add(57);
        }
    }//GEN-LAST:event_btnF07ActionPerformed

    private void btnF09ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnF09ActionPerformed
        if (seat[58] == 1) {
            btnF09.setBackground(Color.WHITE);
            seat[58] = 0;
            cnt-=1;
            to_book_seat_idx.remove(58);
        }
        else if (seat[58] == 0) {
            btnF09.setBackground(Color.YELLOW);
            seat[58] = 1;
            cnt+=1;
            to_book_seat_idx.add(58);
        }
    }//GEN-LAST:event_btnF09ActionPerformed

    private void btnF11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnF11ActionPerformed
        if (seat[59] == 1) {
            btnF11.setBackground(Color.WHITE);
            seat[59] = 0;
            cnt-=1;
            to_book_seat_idx.remove(59);
        }
        else if (seat[59] == 0) {
            btnF11.setBackground(Color.YELLOW);
            seat[59] = 1;
            cnt+=1;
            to_book_seat_idx.add(59);
        }
    }//GEN-LAST:event_btnF11ActionPerformed

    private void btnF13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnF13ActionPerformed
        if (seat[60] == 1) {
            btnF13.setBackground(Color.WHITE);
            seat[60] = 0;
            cnt-=1;
            to_book_seat_idx.remove(60);
        }
        else if (seat[60] == 0) {
            btnF13.setBackground(Color.YELLOW);
            seat[60] = 1;
            cnt+=1;
            to_book_seat_idx.add(60);
        }
    }//GEN-LAST:event_btnF13ActionPerformed

    private void btnF15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnF15ActionPerformed
        if (seat[61] == 1) {
            btnF15.setBackground(Color.WHITE);
            seat[61] = 0;
            cnt-=1;
            to_book_seat_idx.remove(61);
        }
        else if (seat[61] == 0) {
            btnF15.setBackground(Color.YELLOW);
            seat[61] = 1;
            cnt+=1;
            to_book_seat_idx.add(61);
        }
    }//GEN-LAST:event_btnF15ActionPerformed

    private void btnF17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnF17ActionPerformed
        if (seat[62] == 1) {
            btnF17.setBackground(Color.WHITE);
            seat[62] = 0;
            cnt-=1;
            to_book_seat_idx.remove(62);
        }
        else if (seat[62] == 0) {
            btnF17.setBackground(Color.YELLOW);
            seat[62] = 1;
            cnt+=1;
            to_book_seat_idx.add(62);
        }
    }//GEN-LAST:event_btnF17ActionPerformed

    private void btnG01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnG01ActionPerformed
        if (seat[63] == 1) {
            btnG01.setBackground(new Color(255, 204, 255));
            btnG02.setBackground(new Color(255, 204, 255));
            seat[63] = 0;
            seat[64] = 0;
            cnt-=2;
            to_book_seat_idx.remove(63);
            to_book_seat_idx.remove(64);
        }
        else if (seat[63] == 0) {
            btnG01.setBackground(Color.YELLOW);
            btnG02.setBackground(Color.YELLOW);
            seat[63] = 1;
            seat[64] = 1;
            cnt+=2; 
            to_book_seat_idx.add(63);
            to_book_seat_idx.add(64);
        }
    }//GEN-LAST:event_btnG01ActionPerformed

    private void btnG02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnG02ActionPerformed
        if (seat[63] == 1) {
            btnG01.setBackground(new Color(255, 204, 255));
            btnG02.setBackground(new Color(255, 204, 255));
            seat[63] = 0;
            seat[64] = 0;
            cnt-=2;
            to_book_seat_idx.remove(63);
            to_book_seat_idx.remove(64);
        }
        else if (seat[63] == 0) {
            btnG01.setBackground(Color.YELLOW);
            btnG02.setBackground(Color.YELLOW);
            seat[63] = 1;
            seat[64] = 1;
            cnt+=2; 
            to_book_seat_idx.add(63);
            to_book_seat_idx.add(64);
        }
    }//GEN-LAST:event_btnG02ActionPerformed

    private void btnG04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnG04ActionPerformed
        if (seat[65] == 1) {
            btnG04.setBackground(new Color(255, 204, 255));
            btnG05.setBackground(new Color(255, 204, 255));
            seat[65] = 0;
            seat[66] = 0;
            cnt-=2;
            to_book_seat_idx.remove(65);
            to_book_seat_idx.remove(66);
        }
        else if (seat[65] == 0) {
            btnG04.setBackground(Color.YELLOW);
            btnG05.setBackground(Color.YELLOW);
            seat[65] = 1;
            seat[66] = 1;
            cnt+=2; 
            to_book_seat_idx.add(65);
            to_book_seat_idx.add(66);
        }
    }//GEN-LAST:event_btnG04ActionPerformed

    private void btnG05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnG05ActionPerformed
        if (seat[65] == 1) {
            btnG04.setBackground(new Color(255, 204, 255));
            btnG05.setBackground(new Color(255, 204, 255));
            seat[65] = 0;
            seat[66] = 0;
            cnt-=2;
            to_book_seat_idx.remove(65);
            to_book_seat_idx.remove(66);
        }
        else if (seat[65] == 0) {
            btnG04.setBackground(Color.YELLOW);
            btnG05.setBackground(Color.YELLOW);
            seat[65] = 1;
            seat[66] = 1;
            cnt+=2; 
            to_book_seat_idx.add(65);
            to_book_seat_idx.add(66);
        }
    }//GEN-LAST:event_btnG05ActionPerformed

    private void btnG07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnG07ActionPerformed
        if (seat[67] == 1) {
            btnG07.setBackground(new Color(255, 204, 255));
            btnG08.setBackground(new Color(255, 204, 255));
            seat[67] = 0;
            seat[68] = 0;
            cnt-=2;
            to_book_seat_idx.remove(67);
            to_book_seat_idx.remove(68);
        }
        else if (seat[67] == 0) {
            btnG07.setBackground(Color.YELLOW);
            btnG08.setBackground(Color.YELLOW);
            seat[67] = 1;
            seat[68] = 1;
            cnt+=2; 
            to_book_seat_idx.add(67);
            to_book_seat_idx.add(68);
        }
    }//GEN-LAST:event_btnG07ActionPerformed

    private void btnG08ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnG08ActionPerformed
        if (seat[67] == 1) {
            btnG07.setBackground(new Color(255, 204, 255));
            btnG08.setBackground(new Color(255, 204, 255));
            seat[67] = 0;
            seat[68] = 0;
            cnt-=2;
            to_book_seat_idx.remove(67);
            to_book_seat_idx.remove(68);
        }
        else if (seat[67] == 0) {
            btnG07.setBackground(Color.YELLOW);
            btnG08.setBackground(Color.YELLOW);
            seat[67] = 1;
            seat[68] = 1;
            cnt+=2; 
            to_book_seat_idx.add(67);
            to_book_seat_idx.add(68);
        }
    }//GEN-LAST:event_btnG08ActionPerformed

    private void btnG10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnG10ActionPerformed
        if (seat[69] == 1) {
            btnG10.setBackground(new Color(255, 204, 255));
            btnG11.setBackground(new Color(255, 204, 255));
            seat[69] = 0;
            seat[70] = 0;
            cnt-=2;
            to_book_seat_idx.remove(69);
            to_book_seat_idx.remove(70);
        }
        else if (seat[69] == 0) {
            btnG10.setBackground(Color.YELLOW);
            btnG11.setBackground(Color.YELLOW);
            seat[69] = 1;
            seat[70] = 1;
            cnt+=2; 
            to_book_seat_idx.add(69);
            to_book_seat_idx.add(70);
        }
    }//GEN-LAST:event_btnG10ActionPerformed

    private void btnG11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnG11ActionPerformed
        if (seat[69] == 1) {
            btnG10.setBackground(new Color(255, 204, 255));
            btnG11.setBackground(new Color(255, 204, 255));
            seat[69] = 0;
            seat[70] = 0;
            cnt-=2;
            to_book_seat_idx.remove(69);
            to_book_seat_idx.remove(70);
        }
        else if (seat[69] == 0) {
            btnG10.setBackground(Color.YELLOW);
            btnG11.setBackground(Color.YELLOW);
            seat[69] = 1;
            seat[70] = 1;
            cnt+=2; 
            to_book_seat_idx.add(69);
            to_book_seat_idx.add(70);
        }
    }//GEN-LAST:event_btnG11ActionPerformed

    private void btnG13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnG13ActionPerformed
        if (seat[71] == 1) {
            btnG13.setBackground(new Color(255, 204, 255));
            btnG14.setBackground(new Color(255, 204, 255));
            seat[71] = 0;
            seat[72] = 0;
            cnt-=2;
            to_book_seat_idx.remove(71);
            to_book_seat_idx.remove(72);
        }
        else if (seat[71] == 0) {
            btnG13.setBackground(Color.YELLOW);
            btnG14.setBackground(Color.YELLOW);
            seat[71] = 1;
            seat[72] = 1;
            cnt+=2;  
            to_book_seat_idx.add(71);
            to_book_seat_idx.add(72);
        }
    }//GEN-LAST:event_btnG13ActionPerformed

    private void btnG14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnG14ActionPerformed
        if (seat[71] == 1) {
            btnG13.setBackground(new Color(255, 204, 255));
            btnG14.setBackground(new Color(255, 204, 255));
            seat[71] = 0;
            seat[72] = 0;
            cnt-=2;
            to_book_seat_idx.remove(71);
            to_book_seat_idx.remove(72);
        }
        else if (seat[71] == 0) {
            btnG13.setBackground(Color.YELLOW);
            btnG14.setBackground(Color.YELLOW);
            seat[71] = 1;
            seat[72] = 1;
            cnt+=2;  
            to_book_seat_idx.add(71);
            to_book_seat_idx.add(72);
        }
    }//GEN-LAST:event_btnG14ActionPerformed

    private void btnG16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnG16ActionPerformed
        if (seat[73] == 1) {
            btnG16.setBackground(new Color(255, 204, 255));
            btnG17.setBackground(new Color(255, 204, 255));
            seat[73] = 0;
            seat[74] = 0;
            cnt-=2;
            to_book_seat_idx.remove(73);
            to_book_seat_idx.remove(74);
        }
        else if (seat[73] == 0) {
            btnG16.setBackground(Color.YELLOW);
            btnG17.setBackground(Color.YELLOW);
            seat[73] = 1;
            seat[74] = 1;
            cnt+=2; 
            to_book_seat_idx.add(73);
            to_book_seat_idx.add(74);
        }
    }//GEN-LAST:event_btnG16ActionPerformed

    private void btnG17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnG17ActionPerformed
        if (seat[73] == 1) {
            btnG16.setBackground(new Color(255, 204, 255));
            btnG17.setBackground(new Color(255, 204, 255));
            seat[73] = 0;
            seat[74] = 0;
            cnt-=2;
            to_book_seat_idx.remove(73);
            to_book_seat_idx.remove(74);
        }
        else if (seat[73] == 0) {
            btnG16.setBackground(Color.YELLOW);
            btnG17.setBackground(Color.YELLOW);
            seat[73] = 1;
            seat[74] = 1;
            cnt+=2; 
            to_book_seat_idx.add(73);
            to_book_seat_idx.add(74);
        }
    }//GEN-LAST:event_btnG17ActionPerformed

    private void btnH01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnH01ActionPerformed
        if (seat[75] == 1) {
            btnH01.setBackground(Color.WHITE);
            seat[75] = 0;
            cnt-=1;
            to_book_seat_idx.remove(75);
        }
        else if (seat[75] == 0) {
            btnH01.setBackground(Color.YELLOW);
            seat[75] = 1;
            cnt+=1; 
            to_book_seat_idx.add(75);
        }
    }//GEN-LAST:event_btnH01ActionPerformed

    private void btnH03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnH03ActionPerformed
        if (seat[76] == 1) {
            btnH03.setBackground(Color.WHITE);
            seat[76] = 0;
            cnt-=1;
            to_book_seat_idx.remove(76);
        }
        else if (seat[76] == 0) {
            btnH03.setBackground(Color.YELLOW);
            seat[76] = 1;
            cnt+=1; 
            to_book_seat_idx.add(76);
        }
    }//GEN-LAST:event_btnH03ActionPerformed

    private void btnH05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnH05ActionPerformed
        if (seat[77] == 1) {
            btnH05.setBackground(Color.WHITE);
            seat[77] = 0;
            cnt-=1;
            to_book_seat_idx.remove(77);
        }
        else if (seat[77] == 0) {
            btnH05.setBackground(Color.YELLOW);
            seat[77] = 1;
            cnt+=1;
            to_book_seat_idx.add(77);
        }
    }//GEN-LAST:event_btnH05ActionPerformed

    private void btnH07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnH07ActionPerformed
        if (seat[78] == 1) {
            btnH07.setBackground(Color.WHITE);
            seat[78] = 0;
            cnt-=1;
            to_book_seat_idx.remove(78);
        }
        else if (seat[78] == 0) {
            btnH07.setBackground(Color.YELLOW);
            seat[78] = 1;
            cnt+=1;
            to_book_seat_idx.add(78);
        }
    }//GEN-LAST:event_btnH07ActionPerformed

    private void btnH09ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnH09ActionPerformed
        if (seat[79] == 1) {
            btnH09.setBackground(Color.WHITE);
            seat[79] = 0;
            cnt-=1;
            to_book_seat_idx.remove(79);
        }
        else if (seat[79] == 0) {
            btnH09.setBackground(Color.YELLOW);
            seat[79] = 1;
            cnt+=1;
            to_book_seat_idx.add(79);
        }
    }//GEN-LAST:event_btnH09ActionPerformed

    private void btnH11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnH11ActionPerformed
        if (seat[80] == 1) {
            btnH11.setBackground(Color.WHITE);
            seat[80] = 0;
            cnt-=1;
            to_book_seat_idx.remove(80);
        }
        else if (seat[80] == 0) {
            btnH11.setBackground(Color.YELLOW);
            seat[80] = 1;
            cnt+=1;
            to_book_seat_idx.add(80);
        }
    }//GEN-LAST:event_btnH11ActionPerformed

    private void btnH13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnH13ActionPerformed
        if (seat[81] == 1) {
            btnH13.setBackground(Color.WHITE);
            seat[81] = 0;
            cnt-=1;
            to_book_seat_idx.remove(81);
        }
        else if (seat[81] == 0) {
            btnH13.setBackground(Color.YELLOW);
            seat[81] = 1;
            cnt+=1;
            to_book_seat_idx.add(81);
        }
    }//GEN-LAST:event_btnH13ActionPerformed

    private void btnH15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnH15ActionPerformed
        if (seat[82] == 1) {
            btnH15.setBackground(Color.WHITE);
            seat[82] = 0;
            cnt-=1;
            to_book_seat_idx.remove(82);
        }
        else if (seat[82] == 0) {
            btnH15.setBackground(Color.YELLOW);
            seat[82] = 1;
            cnt+=1;
            to_book_seat_idx.add(82);
        }
    }//GEN-LAST:event_btnH15ActionPerformed

    private void btnH17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnH17ActionPerformed
        if (seat[83] == 1) {
            btnH17.setBackground(Color.WHITE);
            seat[83] = 0;
            cnt-=1;
            to_book_seat_idx.remove(83);
        }
        else if (seat[83] == 0) {
            btnH17.setBackground(Color.YELLOW);
            seat[83] = 1;
            cnt+=1;
            to_book_seat_idx.add(83);
        }
    }//GEN-LAST:event_btnH17ActionPerformed

    private void btnI01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnI01ActionPerformed
        if (seat[84] == 1) {
            btnI01.setBackground(new Color(255, 204, 255));
            btnI02.setBackground(new Color(255, 204, 255));
            seat[84] = 0;
            seat[85] = 0;
            cnt-=2;
            to_book_seat_idx.remove(84);
            to_book_seat_idx.remove(85);
        }
        else if (seat[84] == 0) {
            btnI01.setBackground(Color.YELLOW);
            btnI02.setBackground(Color.YELLOW);
            seat[84] = 1;
            seat[85] = 1;
            cnt+=2;
            to_book_seat_idx.add(84);
            to_book_seat_idx.add(85);
        }
    }//GEN-LAST:event_btnI01ActionPerformed

    private void btnI02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnI02ActionPerformed
        if (seat[84] == 1) {
            btnI01.setBackground(new Color(255, 204, 255));
            btnI02.setBackground(new Color(255, 204, 255));
            seat[84] = 0;
            seat[85] = 0;
            cnt-=2;
            to_book_seat_idx.remove(84);
            to_book_seat_idx.remove(85);
        }
        else if (seat[84] == 0) {
            btnI01.setBackground(Color.YELLOW);
            btnI02.setBackground(Color.YELLOW);
            seat[84] = 1;
            seat[85] = 1;
            cnt+=2;
            to_book_seat_idx.add(84);
            to_book_seat_idx.add(85);
        }
    }//GEN-LAST:event_btnI02ActionPerformed

    private void btnI04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnI04ActionPerformed
        if (seat[86] == 1) {
            btnI04.setBackground(new Color(255, 204, 255));
            btnI05.setBackground(new Color(255, 204, 255));
            seat[86] = 0;
            seat[87] = 0;
            cnt-=2;
            to_book_seat_idx.remove(86);
            to_book_seat_idx.remove(87);
        }
        else if (seat[86] == 0) {
            btnI04.setBackground(Color.YELLOW);
            btnI05.setBackground(Color.YELLOW);
            seat[86] = 1;
            seat[87] = 1;
            cnt+=2;
            to_book_seat_idx.add(86);
            to_book_seat_idx.add(87);
        }
    }//GEN-LAST:event_btnI04ActionPerformed

    private void btnI05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnI05ActionPerformed
        if (seat[86] == 1) {
            btnI04.setBackground(new Color(255, 204, 255));
            btnI05.setBackground(new Color(255, 204, 255));
            seat[86] = 0;
            seat[87] = 0;
            cnt-=2;
            to_book_seat_idx.remove(86);
            to_book_seat_idx.remove(87);
        }
        else if (seat[86] == 0) {
            btnI04.setBackground(Color.YELLOW);
            btnI05.setBackground(Color.YELLOW);
            seat[86] = 1;
            seat[87] = 1;
            cnt+=2;
            to_book_seat_idx.add(86);
            to_book_seat_idx.add(87);
        }
    }//GEN-LAST:event_btnI05ActionPerformed

    private void btnI07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnI07ActionPerformed
        if (seat[88] == 1) {
            btnI07.setBackground(new Color(255, 204, 255));
            btnI08.setBackground(new Color(255, 204, 255));
            seat[88] = 0;
            seat[89] = 0;
            cnt-=2;
            to_book_seat_idx.remove(88);
            to_book_seat_idx.remove(89);
        }
        else if (seat[88] == 0) {
            btnI07.setBackground(Color.YELLOW);
            btnI08.setBackground(Color.YELLOW);
            seat[88] = 1;
            seat[89] = 1;
            cnt+=2;
            to_book_seat_idx.add(88);
            to_book_seat_idx.add(89);
        }
    }//GEN-LAST:event_btnI07ActionPerformed

    private void btnI08ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnI08ActionPerformed
        if (seat[88] == 1) {
            btnI07.setBackground(new Color(255, 204, 255));
            btnI08.setBackground(new Color(255, 204, 255));
            seat[88] = 0;
            seat[89] = 0;
            cnt-=2;
            to_book_seat_idx.remove(88);
            to_book_seat_idx.remove(89);
        }
        else if (seat[88] == 0) {
            btnI07.setBackground(Color.YELLOW);
            btnI08.setBackground(Color.YELLOW);
            seat[88] = 1;
            seat[89] = 1;
            cnt+=2;
            to_book_seat_idx.add(88);
            to_book_seat_idx.add(89);
        }
    }//GEN-LAST:event_btnI08ActionPerformed

    private void btnI10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnI10ActionPerformed
        if (seat[90] == 1) {
            btnI10.setBackground(new Color(255, 204, 255));
            btnI11.setBackground(new Color(255, 204, 255));
            seat[90] = 0;
            seat[91] = 0;
            cnt-=2;
            to_book_seat_idx.remove(90);
            to_book_seat_idx.remove(91);
        }
        else if (seat[90] == 0) {
            btnI10.setBackground(Color.YELLOW);
            btnI11.setBackground(Color.YELLOW);
            seat[90] = 1;
            seat[91] = 1;
            cnt+=2;
            to_book_seat_idx.add(90);
            to_book_seat_idx.add(91);
        }
    }//GEN-LAST:event_btnI10ActionPerformed

    private void btnI11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnI11ActionPerformed
        if (seat[90] == 1) {
            btnI10.setBackground(new Color(255, 204, 255));
            btnI11.setBackground(new Color(255, 204, 255));
            seat[90] = 0;
            seat[91] = 0;
            cnt-=2;
            to_book_seat_idx.remove(90);
            to_book_seat_idx.remove(91);
        }
        else if (seat[90] == 0) {
            btnI10.setBackground(Color.YELLOW);
            btnI11.setBackground(Color.YELLOW);
            seat[90] = 1;
            seat[91] = 1;
            cnt+=2;
            to_book_seat_idx.add(90);
            to_book_seat_idx.add(91);
        }
    }//GEN-LAST:event_btnI11ActionPerformed

    private void btnI13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnI13ActionPerformed
        if (seat[92] == 1) {
            btnI13.setBackground(new Color(255, 204, 255));
            btnI14.setBackground(new Color(255, 204, 255));
            seat[92] = 0;
            seat[93] = 0;
            cnt-=2;
            to_book_seat_idx.remove(92);
            to_book_seat_idx.remove(93);
        }
        else if (seat[92] == 0) {
            btnI13.setBackground(Color.YELLOW);
            btnI14.setBackground(Color.YELLOW);
            seat[92] = 1;
            seat[93] = 1;
            cnt+=2;
            to_book_seat_idx.add(92);
            to_book_seat_idx.add(93);
        }
    }//GEN-LAST:event_btnI13ActionPerformed

    private void btnI14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnI14ActionPerformed
        if (seat[92] == 1) {
            btnI13.setBackground(new Color(255, 204, 255));
            btnI14.setBackground(new Color(255, 204, 255));
            seat[92] = 0;
            seat[93] = 0;
            cnt-=2;
            to_book_seat_idx.remove(92);
            to_book_seat_idx.remove(93);
        }
        else if (seat[92] == 0) {
            btnI13.setBackground(Color.YELLOW);
            btnI14.setBackground(Color.YELLOW);
            seat[92] = 1;
            seat[93] = 1;
            cnt+=2;
            to_book_seat_idx.add(92);
            to_book_seat_idx.add(93);
        }
    }//GEN-LAST:event_btnI14ActionPerformed

    private void btnI16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnI16ActionPerformed
        if (seat[94] == 1) {
            btnI16.setBackground(new Color(255, 204, 255));
            btnI17.setBackground(new Color(255, 204, 255));
            seat[94] = 0;
            seat[95] = 0;
            cnt-=2;
            to_book_seat_idx.remove(94);
            to_book_seat_idx.remove(95);
        }
        else if (seat[94] == 0) {
            btnI16.setBackground(Color.YELLOW);
            btnI17.setBackground(Color.YELLOW);
            seat[94] = 1;
            seat[95] = 1;
            cnt+=2;
            to_book_seat_idx.add(94);
            to_book_seat_idx.add(95);
        }
    }//GEN-LAST:event_btnI16ActionPerformed

    private void btnI17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnI17ActionPerformed
        if (seat[94] == 1) {
            btnI16.setBackground(new Color(255, 204, 255));
            btnI17.setBackground(new Color(255, 204, 255));
            seat[94] = 0;
            seat[95] = 0;
            cnt-=2;
            to_book_seat_idx.remove(94);
            to_book_seat_idx.remove(95);
        }
        else if (seat[94] == 0) {
            btnI16.setBackground(Color.YELLOW);
            btnI17.setBackground(Color.YELLOW);
            seat[94] = 1;
            seat[95] = 1;
            cnt+=2;
            to_book_seat_idx.add(94);
            to_book_seat_idx.add(95);
        }
    }//GEN-LAST:event_btnI17ActionPerformed

    private void btnJ01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJ01ActionPerformed
        if (seat[96] == 1) {
            btnJ01.setBackground(Color.WHITE);
            seat[96] = 0;
            cnt-=1;
            to_book_seat_idx.remove(96);
        }
        else if (seat[96] == 0) {
            btnJ01.setBackground(Color.YELLOW);
            seat[96] = 1;
            cnt+=1;
            to_book_seat_idx.add(96);
        }
    }//GEN-LAST:event_btnJ01ActionPerformed

    private void btnJ03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJ03ActionPerformed
        if (seat[97] == 1) {
            btnJ03.setBackground(Color.WHITE);
            seat[97] = 0;
            cnt-=1;
            to_book_seat_idx.remove(97);
        }
        else if (seat[97] == 0) {
            btnJ03.setBackground(Color.YELLOW);
            seat[97] = 1;
            cnt+=1;
            to_book_seat_idx.add(97);
        }
    }//GEN-LAST:event_btnJ03ActionPerformed

    private void btnJ05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJ05ActionPerformed
        if (seat[98] == 1) {
            btnJ05.setBackground(Color.WHITE);
            seat[98] = 0;
            cnt-=1;
            to_book_seat_idx.remove(98);
        }
        else if (seat[98] == 0) {
            btnJ05.setBackground(Color.YELLOW);
            seat[98] = 1;
            cnt+=1;
            to_book_seat_idx.add(98);
        }
    }//GEN-LAST:event_btnJ05ActionPerformed

    private void btnJ07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJ07ActionPerformed
        if (seat[99] == 1) {
            btnJ07.setBackground(Color.WHITE);
            seat[99] = 0;
            cnt-=1;
            to_book_seat_idx.remove(99);
        }
        else if (seat[99] == 0) {
            btnJ07.setBackground(Color.YELLOW);
            seat[99] = 1;
            cnt+=1;
            to_book_seat_idx.add(99);
        }
    }//GEN-LAST:event_btnJ07ActionPerformed

    private void btnJ09ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJ09ActionPerformed
        if (seat[100] == 1) {
            btnJ09.setBackground(Color.WHITE);
            seat[100] = 0;
            cnt-=1;
            to_book_seat_idx.remove(100);
        }
        else if (seat[100] == 0) {
            btnJ09.setBackground(Color.YELLOW);
            seat[100] = 1;
            cnt+=1;
            to_book_seat_idx.add(100);
        }
    }//GEN-LAST:event_btnJ09ActionPerformed

    private void btnJ11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJ11ActionPerformed
        if (seat[101] == 1) {
            btnJ11.setBackground(Color.WHITE);
            seat[101] = 0;
            cnt-=1;
            to_book_seat_idx.remove(101);
        }
        else if (seat[101] == 0) {
            btnJ11.setBackground(Color.YELLOW);
            seat[101] = 1;
            cnt+=1;
            to_book_seat_idx.add(101);
        }
    }//GEN-LAST:event_btnJ11ActionPerformed

    private void btnJ13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJ13ActionPerformed
        if (seat[102] == 1) {
            btnJ13.setBackground(Color.WHITE);
            seat[102] = 0;
            cnt-=1;
            to_book_seat_idx.remove(102);
        }
        else if (seat[102] == 0) {
            btnJ13.setBackground(Color.YELLOW);
            seat[102] = 1;
            cnt+=1; 
            to_book_seat_idx.add(102);
        }
    }//GEN-LAST:event_btnJ13ActionPerformed

    private void btnJ15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJ15ActionPerformed
        if (seat[103] == 1) {
            btnJ15.setBackground(Color.WHITE);
            seat[103] = 0;
            cnt-=1;
            to_book_seat_idx.remove(103);
        }
        else if (seat[103] == 0) {
            btnJ15.setBackground(Color.YELLOW);
            seat[103] = 1;
            cnt+=1;
            to_book_seat_idx.add(103);
        }
    }//GEN-LAST:event_btnJ15ActionPerformed

    private void btnJ17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJ17ActionPerformed
        if (seat[104] == 1) {
            btnJ17.setBackground(Color.WHITE);
            seat[104] = 0;
            cnt-=1;
            to_book_seat_idx.remove(104);
        }
        else if (seat[104] == 0) {
            btnJ17.setBackground(Color.YELLOW);
            seat[104] = 1;
            cnt+=1;
            to_book_seat_idx.add(104);
        }
    }//GEN-LAST:event_btnJ17ActionPerformed

    private void btnK01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnK01ActionPerformed
        if (seat[105] == 1) {
            btnK01.setBackground(new Color(255, 204, 255));
            btnK02.setBackground(new Color(255, 204, 255));
            seat[105] = 0;
            seat[106] = 0;
            cnt-=2;
            to_book_seat_idx.remove(105);
            to_book_seat_idx.remove(106);
        }
        else if (seat[105] == 0) {
            btnK01.setBackground(Color.YELLOW);
            btnK02.setBackground(Color.YELLOW);
            seat[105] = 1;
            seat[106] = 1;
            cnt+=2;
            to_book_seat_idx.add(105);
            to_book_seat_idx.add(106);
        }
    }//GEN-LAST:event_btnK01ActionPerformed

    private void btnK02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnK02ActionPerformed
        if (seat[105] == 1) {
            btnK01.setBackground(new Color(255, 204, 255));
            btnK02.setBackground(new Color(255, 204, 255));
            seat[105] = 0;
            seat[106] = 0;
            cnt-=2;
            to_book_seat_idx.remove(105);
            to_book_seat_idx.remove(106);
        }
        else if (seat[105] == 0) {
            btnK01.setBackground(Color.YELLOW);
            btnK02.setBackground(Color.YELLOW);
            seat[105] = 1;
            seat[106] = 1;
            cnt+=2;
            to_book_seat_idx.add(105);
            to_book_seat_idx.add(106);
        }
    }//GEN-LAST:event_btnK02ActionPerformed

    private void btnK04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnK04ActionPerformed
        if (seat[107] == 1) {
            btnK04.setBackground(new Color(255, 204, 255));
            btnK05.setBackground(new Color(255, 204, 255));
            seat[107] = 0;
            seat[108] = 0;
            cnt-=2;
            to_book_seat_idx.remove(107);
            to_book_seat_idx.remove(108);
        }
        else if (seat[107] == 0) {
            btnK04.setBackground(Color.YELLOW);
            btnK05.setBackground(Color.YELLOW);
            seat[107] = 1;
            seat[108] = 1;
            cnt+=2;
            to_book_seat_idx.add(107);
            to_book_seat_idx.add(108);
        }
    }//GEN-LAST:event_btnK04ActionPerformed

    private void btnK05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnK05ActionPerformed
        if (seat[107] == 1) {
            btnK04.setBackground(new Color(255, 204, 255));
            btnK05.setBackground(new Color(255, 204, 255));
            seat[107] = 0;
            seat[108] = 0;
            cnt-=2;
            to_book_seat_idx.remove(107);
            to_book_seat_idx.remove(108);
        }
        else if (seat[107] == 0) {
            btnK04.setBackground(Color.YELLOW);
            btnK05.setBackground(Color.YELLOW);
            seat[107] = 1;
            seat[108] = 1;
            cnt+=2;
            to_book_seat_idx.add(107);
            to_book_seat_idx.add(108);
        }
    }//GEN-LAST:event_btnK05ActionPerformed

    private void btnK07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnK07ActionPerformed
        if (seat[109] == 1) {
            btnK07.setBackground(new Color(255, 204, 255));
            btnK08.setBackground(new Color(255, 204, 255));
            seat[109] = 0;
            seat[110] = 0;
            cnt-=2;
            to_book_seat_idx.remove(109);
            to_book_seat_idx.remove(110);
        }
        else if (seat[109] == 0) {
            btnK07.setBackground(Color.YELLOW);
            btnK08.setBackground(Color.YELLOW);
            seat[109] = 1;
            seat[110] = 1;
            cnt+=2;
            to_book_seat_idx.add(109);
            to_book_seat_idx.add(110);
        }
    }//GEN-LAST:event_btnK07ActionPerformed

    private void btnK08ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnK08ActionPerformed
        if (seat[109] == 1) {
            btnK07.setBackground(new Color(255, 204, 255));
            btnK08.setBackground(new Color(255, 204, 255));
            seat[109] = 0;
            seat[110] = 0;
            cnt-=2;
            to_book_seat_idx.remove(109);
            to_book_seat_idx.remove(110);
        }
        else if (seat[109] == 0) {
            btnK07.setBackground(Color.YELLOW);
            btnK08.setBackground(Color.YELLOW);
            seat[109] = 1;
            seat[110] = 1;
            cnt+=2;
            to_book_seat_idx.add(109);
            to_book_seat_idx.add(110);
        }
    }//GEN-LAST:event_btnK08ActionPerformed

    private void btnK10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnK10ActionPerformed
        if (seat[111] == 1) {
            btnK10.setBackground(new Color(255, 204, 255));
            btnK11.setBackground(new Color(255, 204, 255));
            seat[111] = 0;
            seat[112] = 0;
            cnt-=2;
            to_book_seat_idx.remove(111);
            to_book_seat_idx.remove(112);
        }
        else if (seat[111] == 0) {
            btnK10.setBackground(Color.YELLOW);
            btnK11.setBackground(Color.YELLOW);
            seat[111] = 1;
            seat[112] = 1;
            cnt+=2;
            to_book_seat_idx.add(111);
            to_book_seat_idx.add(112);
        }
    }//GEN-LAST:event_btnK10ActionPerformed

    private void btnK11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnK11ActionPerformed
        if (seat[111] == 1) {
            btnK10.setBackground(new Color(255, 204, 255));
            btnK11.setBackground(new Color(255, 204, 255));
            seat[111] = 0;
            seat[112] = 0;
            cnt-=2;
            to_book_seat_idx.remove(111);
            to_book_seat_idx.remove(112);
        }
        else if (seat[111] == 0) {
            btnK10.setBackground(Color.YELLOW);
            btnK11.setBackground(Color.YELLOW);
            seat[111] = 1;
            seat[112] = 1;
            cnt+=2;
            to_book_seat_idx.add(111);
            to_book_seat_idx.add(112);
        }
    }//GEN-LAST:event_btnK11ActionPerformed

    private void btnK13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnK13ActionPerformed
        if (seat[113] == 1) {
            btnK13.setBackground(new Color(255, 204, 255));
            btnK14.setBackground(new Color(255, 204, 255));
            seat[113] = 0;
            seat[114] = 0;
            cnt-=2;
            to_book_seat_idx.remove(113);
            to_book_seat_idx.remove(114);
        }
        else if (seat[113] == 0) {
            btnK13.setBackground(Color.YELLOW);
            btnK14.setBackground(Color.YELLOW);
            seat[113] = 1;
            seat[114] = 1;
            cnt+=2;
            to_book_seat_idx.add(113);
            to_book_seat_idx.add(114);
        }
    }//GEN-LAST:event_btnK13ActionPerformed

    private void btnK14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnK14ActionPerformed
        if (seat[113] == 1) {
            btnK13.setBackground(new Color(255, 204, 255));
            btnK14.setBackground(new Color(255, 204, 255));
            seat[113] = 0;
            seat[114] = 0;
            cnt-=2;
            to_book_seat_idx.remove(113);
            to_book_seat_idx.remove(114);
        }
        else if (seat[113] == 0) {
            btnK13.setBackground(Color.YELLOW);
            btnK14.setBackground(Color.YELLOW);
            seat[113] = 1;
            seat[114] = 1;
            cnt+=2;
            to_book_seat_idx.add(113);
            to_book_seat_idx.add(114);
        }
    }//GEN-LAST:event_btnK14ActionPerformed

    private void btnK16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnK16ActionPerformed
        if (seat[115] == 1) {
            btnK16.setBackground(new Color(255, 204, 255));
            btnK17.setBackground(new Color(255, 204, 255));
            seat[115] = 0;
            seat[116] = 0;
            cnt-=2;
            to_book_seat_idx.remove(115);
            to_book_seat_idx.remove(116);
        }
        else if (seat[115] == 0) {
            btnK16.setBackground(Color.YELLOW);
            btnK17.setBackground(Color.YELLOW);
            seat[115] = 1;
            seat[116] = 1;
            cnt+=2;
            to_book_seat_idx.add(115);
            to_book_seat_idx.add(116);
        }
    }//GEN-LAST:event_btnK16ActionPerformed

    private void btnK17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnK17ActionPerformed
        if (seat[115] == 1) {
            btnK16.setBackground(new Color(255, 204, 255));
            btnK17.setBackground(new Color(255, 204, 255));
            seat[115] = 0;
            seat[116] = 0;
            cnt-=2;
            to_book_seat_idx.remove(115);
            to_book_seat_idx.remove(116);
        }
        else if (seat[115] == 0) {
            btnK16.setBackground(Color.YELLOW);
            btnK17.setBackground(Color.YELLOW);
            seat[115] = 1;
            seat[116] = 1;
            cnt+=2;
            to_book_seat_idx.add(115);
            to_book_seat_idx.add(116);
        }
    }//GEN-LAST:event_btnK17ActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        try {
            Global.seat_no = "";
            for (int i = 0; i < seat.length; i++) {
                if (seat[i] == 1) {
                    Global.seat_no += id[i] + " ";
//                    API.bookSeat(Global.customer_email, seat_id);
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        if (cnt==0){
            JOptionPane.showMessageDialog(this, "Please Select Your Seat !");
        }
        else{
            JOptionPane.showMessageDialog(this, "You Have Selected "+cnt+" Seat(s)");
            Global.cnt_seat = String.valueOf(cnt);

            TicketClass2 tc2 = new TicketClass2();
            tc2.setVisible(true);
            tc2.pack();
            tc2.setLocationRelativeTo(null);
            tc2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
        }
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        MovieTime mt = new MovieTime();
        mt.setVisible(true);
        mt.pack();
        mt.setLocationRelativeTo(null);
        mt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(MovieSeat2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MovieSeat2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MovieSeat2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MovieSeat2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MovieSeat2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnA01;
    private javax.swing.JButton btnA02;
    private javax.swing.JButton btnA04;
    private javax.swing.JButton btnA05;
    private javax.swing.JButton btnA07;
    private javax.swing.JButton btnA08;
    private javax.swing.JButton btnA10;
    private javax.swing.JButton btnA11;
    private javax.swing.JButton btnA13;
    private javax.swing.JButton btnA14;
    private javax.swing.JButton btnA16;
    private javax.swing.JButton btnA17;
    private javax.swing.JButton btnAvailable;
    private javax.swing.JButton btnB01;
    private javax.swing.JButton btnB03;
    private javax.swing.JButton btnB05;
    private javax.swing.JButton btnB07;
    private javax.swing.JButton btnB09;
    private javax.swing.JButton btnB11;
    private javax.swing.JButton btnB13;
    private javax.swing.JButton btnB15;
    private javax.swing.JButton btnB17;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnC01;
    private javax.swing.JButton btnC02;
    private javax.swing.JButton btnC04;
    private javax.swing.JButton btnC05;
    private javax.swing.JButton btnC07;
    private javax.swing.JButton btnC08;
    private javax.swing.JButton btnC10;
    private javax.swing.JButton btnC11;
    private javax.swing.JButton btnC13;
    private javax.swing.JButton btnC14;
    private javax.swing.JButton btnC16;
    private javax.swing.JButton btnC17;
    private javax.swing.JButton btnD01;
    private javax.swing.JButton btnD03;
    private javax.swing.JButton btnD05;
    private javax.swing.JButton btnD07;
    private javax.swing.JButton btnD09;
    private javax.swing.JButton btnD11;
    private javax.swing.JButton btnD13;
    private javax.swing.JButton btnD15;
    private javax.swing.JButton btnD17;
    private javax.swing.JButton btnE01;
    private javax.swing.JButton btnE02;
    private javax.swing.JButton btnE04;
    private javax.swing.JButton btnE05;
    private javax.swing.JButton btnE07;
    private javax.swing.JButton btnE08;
    private javax.swing.JButton btnE10;
    private javax.swing.JButton btnE11;
    private javax.swing.JButton btnE13;
    private javax.swing.JButton btnE14;
    private javax.swing.JButton btnE16;
    private javax.swing.JButton btnE17;
    private javax.swing.JButton btnF01;
    private javax.swing.JButton btnF03;
    private javax.swing.JButton btnF05;
    private javax.swing.JButton btnF07;
    private javax.swing.JButton btnF09;
    private javax.swing.JButton btnF11;
    private javax.swing.JButton btnF13;
    private javax.swing.JButton btnF15;
    private javax.swing.JButton btnF17;
    private javax.swing.JButton btnG01;
    private javax.swing.JButton btnG02;
    private javax.swing.JButton btnG04;
    private javax.swing.JButton btnG05;
    private javax.swing.JButton btnG07;
    private javax.swing.JButton btnG08;
    private javax.swing.JButton btnG10;
    private javax.swing.JButton btnG11;
    private javax.swing.JButton btnG13;
    private javax.swing.JButton btnG14;
    private javax.swing.JButton btnG16;
    private javax.swing.JButton btnG17;
    private javax.swing.JButton btnH01;
    private javax.swing.JButton btnH03;
    private javax.swing.JButton btnH05;
    private javax.swing.JButton btnH07;
    private javax.swing.JButton btnH09;
    private javax.swing.JButton btnH11;
    private javax.swing.JButton btnH13;
    private javax.swing.JButton btnH15;
    private javax.swing.JButton btnH17;
    private javax.swing.JButton btnI01;
    private javax.swing.JButton btnI02;
    private javax.swing.JButton btnI04;
    private javax.swing.JButton btnI05;
    private javax.swing.JButton btnI07;
    private javax.swing.JButton btnI08;
    private javax.swing.JButton btnI10;
    private javax.swing.JButton btnI11;
    private javax.swing.JButton btnI13;
    private javax.swing.JButton btnI14;
    private javax.swing.JButton btnI16;
    private javax.swing.JButton btnI17;
    private javax.swing.JButton btnJ01;
    private javax.swing.JButton btnJ03;
    private javax.swing.JButton btnJ05;
    private javax.swing.JButton btnJ07;
    private javax.swing.JButton btnJ09;
    private javax.swing.JButton btnJ11;
    private javax.swing.JButton btnJ13;
    private javax.swing.JButton btnJ15;
    private javax.swing.JButton btnJ17;
    private javax.swing.JButton btnK01;
    private javax.swing.JButton btnK02;
    private javax.swing.JButton btnK04;
    private javax.swing.JButton btnK05;
    private javax.swing.JButton btnK07;
    private javax.swing.JButton btnK08;
    private javax.swing.JButton btnK10;
    private javax.swing.JButton btnK11;
    private javax.swing.JButton btnK13;
    private javax.swing.JButton btnK14;
    private javax.swing.JButton btnK16;
    private javax.swing.JButton btnK17;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnSelected;
    private javax.swing.JButton btnTwin1;
    private javax.swing.JButton btnTwin2;
    private javax.swing.JButton btnUnavailable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
