package cinemaswingtest1;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
//import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;

public class MovieSeat1 extends javax.swing.JFrame {

    private int[] seat = new int[78];
    private String[] id = {"A01", "A02", "A04", "A05", "A07", "A08", "A10", "A11",
        "B01", "B03", "B05", "B07", "B09", "B11",
        "C01", "C02", "C04", "C05", "C07", "C08", "C10", "C11",
        "D01", "D03", "D05", "D07", "D09", "D11",
        "E01", "E02", "E04", "E05", "E07", "E08", "E10", "E11",
        "F01", "F03", "F05", "F07", "F09", "F11",
        "G01", "G02", "G04", "G05", "G07", "G08", "G10", "G11",
        "H01", "H03", "H05", "H07", "H09", "H11",
        "I01", "I02", "I04", "I05", "I07", "I08", "I10", "I11",
        "J01", "J03", "J05", "J07", "J09", "J11",
        "K01", "K02", "K04", "K05", "K07", "K08", "K10", "K11"};
    private int cnt;
    private List<JButton> btn = new ArrayList<>();
    List<API.Seat> seats;
    List<String> seat_id = new ArrayList<>();
    List<Integer> booked_idx = new ArrayList<>();
    List<Integer> havent_book_idx = new ArrayList<>();
    List<Integer> to_book_seat_idx = new ArrayList<>();

    /**
     * Creates new form Seat
     */
    public MovieSeat1() {
        initComponents();
        initBtn();

//        seats = API.getAllSeat("ckyil1zlx000007qoe5on5kk1");
        
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
//            
//            btn.get(booked_idx.get(i)).setEnabled(false);
//            
//        }
//
//        for (int i = 0; i < havent_book_idx.size(); i++) {
//            
//            btn.get(havent_book_idx.get(i)).setEnabled(true);
//        }
        int m =Global.movie_idx;
        for (int i = 0; i < Global.list.get(m).size(); i++) {
            
            btn.get(Global.list.get(m).get(i)).setEnabled(false);
            
        }
    }
    

    public void confirm() {
        int m =Global.movie_idx;
        System.out.println("confirm");
//        String email= Global.customer_email;
//        System.out.println(email+"global");
//            System.out.println(to_book_seat_idx.size());
        for (int i = 0; i < to_book_seat_idx.size(); i++) {
            Global.list.get(m).add(to_book_seat_idx.get(i));
            System.out.println(Global.list.get(m).get(i));
//            System.out.println(API.bookSeat(Global.customer_email, seat_id.get(i)));
//            System.out.println(Global.customer_email + "global");
        }
    }

//    public void unused() {
//        if (havent_book_idx.get(0) != "") {
//            btnA01.setEnabled(false);
//        }
//        if (customer_email != null) {
//            btnA02.setEnabled(false);
//        }
//        if (customer_email != null) {
//            btnA04.setEnabled(false);
//        }
//        if (customer_email != null) {
//            btnA05.setEnabled(false);
//        }
//        if (customer_email != null) {
//            btnA07.setEnabled(false);
//        }
//        if (customer_email != null) {
//            btnA08.setEnabled(false);
//        }
//        if (customer_email != null) {
//            btnA10.setEnabled(false);
//        }
//        if (customer_email != null) {
//            btnA11.setEnabled(false);
//        }
//        if (customer_email != null) {
//            btnB01.setEnabled(false);
//        }
//        if (customer_email != null) {
//            btnB03.setEnabled(false);
//        }
//        if (customer_email != null) {
//            btnB05.setEnabled(false);
//        }
//        if (customer_email != null) {
//            btnB07.setEnabled(false);
//        }
//        if (customer_email != null) {
//            btnB09.setEnabled(false);
//        }
//        if (customer_email != null) {
//            btnB11.setEnabled(false);
//        }
//        if (customer_email != null) {
//            btnC01.setEnabled(false);
//        }
//        if (customer_email != null) {
//            btnC02.setEnabled(false);
//        }
//        if (customer_email != null) {
//            btnC04.setEnabled(false);
//        }
//        if (customer_email != null) {
//            btnC05.setEnabled(false);
//        }
//        if (customer_email != null) {
//            btnC07.setEnabled(false);
//        }
//        if (customer_email != null) {
//            btnC08.setEnabled(false);
//        }
//        if (customer_email != null) {
//            btnC10.setEnabled(false);
//        }
//        if (customer_email != null) {
//            btnC11.setEnabled(false);
//        }
//        if (customer_email != null) {
//            btnD01.setEnabled(false);
//        }
//        if (customer_email != null) {
//            btnD03.setEnabled(false);
//        }
//        if (customer_email != null) {
//            btnD05.setEnabled(false);
//        }
//        if (customer_email != null) {
//            btnD07.setEnabled(false);
//        }
//        if (customer_email != null) {
//            btnD09.setEnabled(false);
//        }
//        if (customer_email != null) {
//            btnD11.setEnabled(false);
//        }
//        if (customer_email != null) {
//            btnE01.setEnabled(false);
//        }
//        if (customer_email != null) {
//            btnE02.setEnabled(false);
//        }
//        if (customer_email != null) {
//            btnE04.setEnabled(false);
//        }
//        if (customer_email != null) {
//            btnE05.setEnabled(false);
//        }
//        if (customer_email != null) {
//            btnE07.setEnabled(false);
//        }
//        if (customer_email != null) {
//            btnE08.setEnabled(false);
//        }
//        if (customer_email != null) {
//            btnE10.setEnabled(false);
//        }
//        if (customer_email != null) {
//            btnE11.setEnabled(false);
//        }
//        if (customer_email != null) {
//            btnF01.setEnabled(false);
//        }
//        if (customer_email != null) {
//            btnF03.setEnabled(false);
//        }
//        if (customer_email != null) {
//            btnF05.setEnabled(false);
//        }
//        if (customer_email != null) {
//            btnF07.setEnabled(false);
//        }
//        if (customer_email != null) {
//            btnF09.setEnabled(false);
//        }
//        if (customer_email != null) {
//            btnF11.setEnabled(false);
//        }
//        if (customer_email != null) {
//            btnG01.setEnabled(false);
//        }
//        if (customer_email != null) {
//            btnG02.setEnabled(false);
//        }
//        if (customer_email != null) {
//            btnG04.setEnabled(false);
//        }
//        if (customer_email != null) {
//            btnG05.setEnabled(false);
//        }
//        if (customer_email != null) {
//            btnG07.setEnabled(false);
//        }
//        if (customer_email != null) {
//            btnG08.setEnabled(false);
//        }
//        if (customer_email != null) {
//            btnG10.setEnabled(false);
//        }
//        if (customer_email != null) {
//            btnG11.setEnabled(false);
//        }
//        if (customer_email != null) {
//            btnH01.setEnabled(false);
//        }
//        if (customer_email != null) {
//            btnH03.setEnabled(false);
//        }
//        if (customer_email != null) {
//            btnH05.setEnabled(false);
//        }
//        if (customer_email != null) {
//            btnH07.setEnabled(false);
//        }
//        if (customer_email != null) {
//            btnH09.setEnabled(false);
//        }
//        if (customer_email != null) {
//            btnH11.setEnabled(false);
//        }
//        if (customer_email != null) {
//            btnI01.setEnabled(false);
//        }
//        if (customer_email != null) {
//            btnI02.setEnabled(false);
//        }
//        if (customer_email != null) {
//            btnI04.setEnabled(false);
//        }
//        if (customer_email != null) {
//            btnI05.setEnabled(false);
//        }
//        if (customer_email != null) {
//            btnI07.setEnabled(false);
//        }
//        if (customer_email != null) {
//            btnI08.setEnabled(false);
//        }
//        if (customer_email != null) {
//            btnI10.setEnabled(false);
//        }
//        if (customer_email != null) {
//            btnI11.setEnabled(false);
//        }
//        if (customer_email != null) {
//            btnJ01.setEnabled(false);
//        }
//        if (customer_email != null) {
//            btnJ03.setEnabled(false);
//        }
//        if (customer_email != null) {
//            btnJ05.setEnabled(false);
//        }
//        if (customer_email != null) {
//            btnJ07.setEnabled(false);
//        }
//        if (customer_email != null) {
//            btnJ09.setEnabled(false);
//        }
//        if (customer_email != null) {
//            btnJ11.setEnabled(false);
//        }
//        if (customer_email != null) {
//            btnK01.setEnabled(false);
//        }
//        if (customer_email != null) {
//            btnK02.setEnabled(false);
//        }
//        if (customer_email != null) {
//            btnK04.setEnabled(false);
//        }
//        if (customer_email != null) {
//            btnK05.setEnabled(false);
//        }
//        if (customer_email != null) {
//            btnK07.setEnabled(false);
//        }
//        if (customer_email != null) {
//            btnK08.setEnabled(false);
//        }
//        if (customer_email != null) {
//            btnK10.setEnabled(false);
//        }
//        if (customer_email != null) {
//            btnK11.setEnabled(false);
//        }
//    }
    public void initBtn() {
        btn.add(btnA01);
        btn.add(btnA02);
        btn.add(btnA04);
        btn.add(btnA05);
        btn.add(btnA07);
        btn.add(btnA08);
        btn.add(btnA10);
        btn.add(btnA11);
        btn.add(btnB01);
        btn.add(btnB03);
        btn.add(btnB05);
        btn.add(btnB07);
        btn.add(btnB09);
        btn.add(btnB11);
        btn.add(btnC01);
        btn.add(btnC02);
        btn.add(btnC04);
        btn.add(btnC05);
        btn.add(btnC07);
        btn.add(btnC08);
        btn.add(btnC10);
        btn.add(btnC11);
        btn.add(btnD01);
        btn.add(btnD03);
        btn.add(btnD05);
        btn.add(btnD07);
        btn.add(btnD09);
        btn.add(btnD11);
        btn.add(btnE01);
        btn.add(btnE02);
        btn.add(btnE04);
        btn.add(btnE05);
        btn.add(btnE07);
        btn.add(btnE08);
        btn.add(btnE10);
        btn.add(btnE11);
        btn.add(btnF01);
        btn.add(btnF03);
        btn.add(btnF05);
        btn.add(btnF07);
        btn.add(btnF09);
        btn.add(btnF11);
        btn.add(btnG01);
        btn.add(btnG02);
        btn.add(btnG04);
        btn.add(btnG05);
        btn.add(btnG07);
        btn.add(btnG08);
        btn.add(btnG10);
        btn.add(btnG11);
        btn.add(btnH01);
        btn.add(btnH03);
        btn.add(btnH05);
        btn.add(btnH07);
        btn.add(btnH09);
        btn.add(btnH11);
        btn.add(btnI01);
        btn.add(btnI02);
        btn.add(btnI04);
        btn.add(btnI05);
        btn.add(btnI07);
        btn.add(btnI08);
        btn.add(btnI10);
        btn.add(btnI11);
        btn.add(btnJ01);
        btn.add(btnJ03);
        btn.add(btnJ05);
        btn.add(btnJ07);
        btn.add(btnJ09);
        btn.add(btnJ11);
        btn.add(btnK01);
        btn.add(btnK02);
        btn.add(btnK04);
        btn.add(btnK05);
        btn.add(btnK07);
        btn.add(btnK08);
        btn.add(btnK10);
        btn.add(btnK11);
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
        btnSelected = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnTwin1 = new javax.swing.JButton();
        btnTwin2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnAvailable = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btnUnavailable = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 57, 1030, -1));

        btnNext.setText("NEXT");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        getContentPane().add(btnNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(978, 602, 60, 25));

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
        getContentPane().add(btnA01, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 92, -1, -1));

        btnA02.setBackground(new java.awt.Color(255, 204, 255));
        btnA02.setText("A02");
        btnA02.setPreferredSize(new java.awt.Dimension(55, 25));
        btnA02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnA02ActionPerformed(evt);
            }
        });
        getContentPane().add(btnA02, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 92, -1, -1));

        btnA05.setBackground(new java.awt.Color(255, 204, 255));
        btnA05.setText("A05");
        btnA05.setPreferredSize(new java.awt.Dimension(55, 25));
        btnA05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnA05ActionPerformed(evt);
            }
        });
        getContentPane().add(btnA05, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 92, -1, -1));

        btnA04.setBackground(new java.awt.Color(255, 204, 255));
        btnA04.setText("A04");
        btnA04.setPreferredSize(new java.awt.Dimension(55, 25));
        btnA04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnA04ActionPerformed(evt);
            }
        });
        getContentPane().add(btnA04, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 92, -1, -1));

        btnA08.setBackground(new java.awt.Color(255, 204, 255));
        btnA08.setText("A08");
        btnA08.setPreferredSize(new java.awt.Dimension(55, 25));
        btnA08.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnA08ActionPerformed(evt);
            }
        });
        getContentPane().add(btnA08, new org.netbeans.lib.awtextra.AbsoluteConstraints(618, 92, -1, -1));

        btnA07.setBackground(new java.awt.Color(255, 204, 255));
        btnA07.setText("A07");
        btnA07.setPreferredSize(new java.awt.Dimension(55, 25));
        btnA07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnA07ActionPerformed(evt);
            }
        });
        getContentPane().add(btnA07, new org.netbeans.lib.awtextra.AbsoluteConstraints(557, 92, -1, -1));

        btnA11.setBackground(new java.awt.Color(255, 204, 255));
        btnA11.setText("A11");
        btnA11.setPreferredSize(new java.awt.Dimension(55, 25));
        btnA11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnA11ActionPerformed(evt);
            }
        });
        getContentPane().add(btnA11, new org.netbeans.lib.awtextra.AbsoluteConstraints(801, 92, -1, -1));

        btnA10.setBackground(new java.awt.Color(255, 204, 255));
        btnA10.setText("A10");
        btnA10.setPreferredSize(new java.awt.Dimension(55, 25));
        btnA10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnA10ActionPerformed(evt);
            }
        });
        getContentPane().add(btnA10, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 92, -1, -1));

        btnB01.setBackground(new java.awt.Color(255, 255, 255));
        btnB01.setText("B01");
        btnB01.setPreferredSize(new java.awt.Dimension(55, 25));
        btnB01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnB01ActionPerformed(evt);
            }
        });
        getContentPane().add(btnB01, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 135, -1, -1));

        btnB11.setBackground(new java.awt.Color(255, 255, 255));
        btnB11.setText("B11");
        btnB11.setPreferredSize(new java.awt.Dimension(55, 25));
        btnB11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnB11ActionPerformed(evt);
            }
        });
        getContentPane().add(btnB11, new org.netbeans.lib.awtextra.AbsoluteConstraints(801, 135, -1, -1));

        btnB03.setBackground(new java.awt.Color(255, 255, 255));
        btnB03.setText("B03");
        btnB03.setPreferredSize(new java.awt.Dimension(55, 25));
        btnB03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnB03ActionPerformed(evt);
            }
        });
        getContentPane().add(btnB03, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 135, -1, -1));

        btnB05.setBackground(new java.awt.Color(255, 255, 255));
        btnB05.setText("B05");
        btnB05.setPreferredSize(new java.awt.Dimension(55, 25));
        btnB05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnB05ActionPerformed(evt);
            }
        });
        getContentPane().add(btnB05, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 135, -1, -1));

        btnB07.setBackground(new java.awt.Color(255, 255, 255));
        btnB07.setText("B07");
        btnB07.setPreferredSize(new java.awt.Dimension(55, 25));
        btnB07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnB07ActionPerformed(evt);
            }
        });
        getContentPane().add(btnB07, new org.netbeans.lib.awtextra.AbsoluteConstraints(557, 135, -1, -1));

        btnB09.setBackground(new java.awt.Color(255, 255, 255));
        btnB09.setText("B09");
        btnB09.setPreferredSize(new java.awt.Dimension(55, 25));
        btnB09.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnB09ActionPerformed(evt);
            }
        });
        getContentPane().add(btnB09, new org.netbeans.lib.awtextra.AbsoluteConstraints(679, 135, -1, -1));

        btnC10.setBackground(new java.awt.Color(255, 204, 255));
        btnC10.setText("C10");
        btnC10.setPreferredSize(new java.awt.Dimension(55, 25));
        btnC10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC10ActionPerformed(evt);
            }
        });
        getContentPane().add(btnC10, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 178, -1, -1));

        btnC01.setBackground(new java.awt.Color(255, 204, 255));
        btnC01.setText("C01");
        btnC01.setPreferredSize(new java.awt.Dimension(55, 25));
        btnC01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC01ActionPerformed(evt);
            }
        });
        getContentPane().add(btnC01, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 178, -1, -1));

        btnC02.setBackground(new java.awt.Color(255, 204, 255));
        btnC02.setText("C02");
        btnC02.setPreferredSize(new java.awt.Dimension(55, 25));
        btnC02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC02ActionPerformed(evt);
            }
        });
        getContentPane().add(btnC02, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 178, -1, -1));

        btnD01.setBackground(new java.awt.Color(255, 255, 255));
        btnD01.setText("D01");
        btnD01.setPreferredSize(new java.awt.Dimension(55, 25));
        btnD01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnD01ActionPerformed(evt);
            }
        });
        getContentPane().add(btnD01, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 221, -1, -1));

        btnD11.setBackground(new java.awt.Color(255, 255, 255));
        btnD11.setText("D11");
        btnD11.setPreferredSize(new java.awt.Dimension(55, 25));
        btnD11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnD11ActionPerformed(evt);
            }
        });
        getContentPane().add(btnD11, new org.netbeans.lib.awtextra.AbsoluteConstraints(801, 221, -1, -1));

        btnC05.setBackground(new java.awt.Color(255, 204, 255));
        btnC05.setText("C05");
        btnC05.setPreferredSize(new java.awt.Dimension(55, 25));
        btnC05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC05ActionPerformed(evt);
            }
        });
        getContentPane().add(btnC05, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 178, -1, -1));

        btnD03.setBackground(new java.awt.Color(255, 255, 255));
        btnD03.setText("D03");
        btnD03.setPreferredSize(new java.awt.Dimension(55, 25));
        btnD03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnD03ActionPerformed(evt);
            }
        });
        getContentPane().add(btnD03, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 221, -1, -1));

        btnD05.setBackground(new java.awt.Color(255, 255, 255));
        btnD05.setText("D05");
        btnD05.setPreferredSize(new java.awt.Dimension(55, 25));
        btnD05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnD05ActionPerformed(evt);
            }
        });
        getContentPane().add(btnD05, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 221, -1, -1));

        btnC04.setBackground(new java.awt.Color(255, 204, 255));
        btnC04.setText("C04");
        btnC04.setPreferredSize(new java.awt.Dimension(55, 25));
        btnC04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC04ActionPerformed(evt);
            }
        });
        getContentPane().add(btnC04, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 178, -1, -1));

        btnD07.setBackground(new java.awt.Color(255, 255, 255));
        btnD07.setText("D07");
        btnD07.setPreferredSize(new java.awt.Dimension(55, 25));
        btnD07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnD07ActionPerformed(evt);
            }
        });
        getContentPane().add(btnD07, new org.netbeans.lib.awtextra.AbsoluteConstraints(557, 221, -1, -1));

        btnC08.setBackground(new java.awt.Color(255, 204, 255));
        btnC08.setText("C08");
        btnC08.setPreferredSize(new java.awt.Dimension(55, 25));
        btnC08.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC08ActionPerformed(evt);
            }
        });
        getContentPane().add(btnC08, new org.netbeans.lib.awtextra.AbsoluteConstraints(618, 178, -1, -1));

        btnD09.setBackground(new java.awt.Color(255, 255, 255));
        btnD09.setText("D09");
        btnD09.setPreferredSize(new java.awt.Dimension(55, 25));
        btnD09.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnD09ActionPerformed(evt);
            }
        });
        getContentPane().add(btnD09, new org.netbeans.lib.awtextra.AbsoluteConstraints(679, 221, -1, -1));

        btnC07.setBackground(new java.awt.Color(255, 204, 255));
        btnC07.setText("C07");
        btnC07.setPreferredSize(new java.awt.Dimension(55, 25));
        btnC07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC07ActionPerformed(evt);
            }
        });
        getContentPane().add(btnC07, new org.netbeans.lib.awtextra.AbsoluteConstraints(557, 178, -1, -1));

        btnC11.setBackground(new java.awt.Color(255, 204, 255));
        btnC11.setText("C11");
        btnC11.setPreferredSize(new java.awt.Dimension(55, 25));
        btnC11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC11ActionPerformed(evt);
            }
        });
        getContentPane().add(btnC11, new org.netbeans.lib.awtextra.AbsoluteConstraints(801, 178, -1, -1));

        btnE10.setBackground(new java.awt.Color(255, 204, 255));
        btnE10.setText("E10");
        btnE10.setPreferredSize(new java.awt.Dimension(55, 25));
        btnE10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnE10ActionPerformed(evt);
            }
        });
        getContentPane().add(btnE10, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 264, -1, -1));

        btnE01.setBackground(new java.awt.Color(255, 204, 255));
        btnE01.setText("E01");
        btnE01.setPreferredSize(new java.awt.Dimension(55, 25));
        btnE01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnE01ActionPerformed(evt);
            }
        });
        getContentPane().add(btnE01, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 264, -1, -1));

        btnE02.setBackground(new java.awt.Color(255, 204, 255));
        btnE02.setText("E02");
        btnE02.setPreferredSize(new java.awt.Dimension(55, 25));
        btnE02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnE02ActionPerformed(evt);
            }
        });
        getContentPane().add(btnE02, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 264, -1, -1));

        btnF01.setBackground(new java.awt.Color(255, 255, 255));
        btnF01.setText("F01");
        btnF01.setPreferredSize(new java.awt.Dimension(55, 25));
        btnF01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnF01ActionPerformed(evt);
            }
        });
        getContentPane().add(btnF01, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 307, -1, -1));

        btnF11.setBackground(new java.awt.Color(255, 255, 255));
        btnF11.setText("F11");
        btnF11.setPreferredSize(new java.awt.Dimension(55, 25));
        btnF11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnF11ActionPerformed(evt);
            }
        });
        getContentPane().add(btnF11, new org.netbeans.lib.awtextra.AbsoluteConstraints(801, 307, -1, -1));

        btnE05.setBackground(new java.awt.Color(255, 204, 255));
        btnE05.setText("E05");
        btnE05.setPreferredSize(new java.awt.Dimension(55, 25));
        btnE05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnE05ActionPerformed(evt);
            }
        });
        getContentPane().add(btnE05, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 264, -1, -1));

        btnF03.setBackground(new java.awt.Color(255, 255, 255));
        btnF03.setText("F03");
        btnF03.setPreferredSize(new java.awt.Dimension(55, 25));
        btnF03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnF03ActionPerformed(evt);
            }
        });
        getContentPane().add(btnF03, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 307, -1, -1));

        btnF05.setBackground(new java.awt.Color(255, 255, 255));
        btnF05.setText("F05");
        btnF05.setPreferredSize(new java.awt.Dimension(55, 25));
        btnF05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnF05ActionPerformed(evt);
            }
        });
        getContentPane().add(btnF05, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 307, -1, -1));

        btnE04.setBackground(new java.awt.Color(255, 204, 255));
        btnE04.setText("E04");
        btnE04.setPreferredSize(new java.awt.Dimension(55, 25));
        btnE04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnE04ActionPerformed(evt);
            }
        });
        getContentPane().add(btnE04, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 264, -1, -1));

        btnF07.setBackground(new java.awt.Color(255, 255, 255));
        btnF07.setText("F07");
        btnF07.setPreferredSize(new java.awt.Dimension(55, 25));
        btnF07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnF07ActionPerformed(evt);
            }
        });
        getContentPane().add(btnF07, new org.netbeans.lib.awtextra.AbsoluteConstraints(557, 307, -1, -1));

        btnE08.setBackground(new java.awt.Color(255, 204, 255));
        btnE08.setText("E08");
        btnE08.setPreferredSize(new java.awt.Dimension(55, 25));
        btnE08.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnE08ActionPerformed(evt);
            }
        });
        getContentPane().add(btnE08, new org.netbeans.lib.awtextra.AbsoluteConstraints(618, 264, -1, -1));

        btnF09.setBackground(new java.awt.Color(255, 255, 255));
        btnF09.setText("F09");
        btnF09.setPreferredSize(new java.awt.Dimension(55, 25));
        btnF09.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnF09ActionPerformed(evt);
            }
        });
        getContentPane().add(btnF09, new org.netbeans.lib.awtextra.AbsoluteConstraints(679, 307, -1, -1));

        btnE07.setBackground(new java.awt.Color(255, 204, 255));
        btnE07.setText("E07");
        btnE07.setPreferredSize(new java.awt.Dimension(55, 25));
        btnE07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnE07ActionPerformed(evt);
            }
        });
        getContentPane().add(btnE07, new org.netbeans.lib.awtextra.AbsoluteConstraints(557, 264, -1, -1));

        btnE11.setBackground(new java.awt.Color(255, 204, 255));
        btnE11.setText("E11");
        btnE11.setPreferredSize(new java.awt.Dimension(55, 25));
        btnE11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnE11ActionPerformed(evt);
            }
        });
        getContentPane().add(btnE11, new org.netbeans.lib.awtextra.AbsoluteConstraints(801, 264, -1, -1));

        btnG10.setBackground(new java.awt.Color(255, 204, 255));
        btnG10.setText("G10");
        btnG10.setPreferredSize(new java.awt.Dimension(55, 25));
        btnG10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnG10ActionPerformed(evt);
            }
        });
        getContentPane().add(btnG10, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 350, -1, -1));

        btnG01.setBackground(new java.awt.Color(255, 204, 255));
        btnG01.setText("G01");
        btnG01.setPreferredSize(new java.awt.Dimension(55, 25));
        btnG01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnG01ActionPerformed(evt);
            }
        });
        getContentPane().add(btnG01, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 350, -1, -1));

        btnG02.setBackground(new java.awt.Color(255, 204, 255));
        btnG02.setText("G02");
        btnG02.setPreferredSize(new java.awt.Dimension(55, 25));
        btnG02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnG02ActionPerformed(evt);
            }
        });
        getContentPane().add(btnG02, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 350, -1, -1));

        btnH01.setBackground(new java.awt.Color(255, 255, 255));
        btnH01.setText("H01");
        btnH01.setPreferredSize(new java.awt.Dimension(55, 25));
        btnH01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnH01ActionPerformed(evt);
            }
        });
        getContentPane().add(btnH01, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 393, -1, -1));

        btnH11.setBackground(new java.awt.Color(255, 255, 255));
        btnH11.setText("H11");
        btnH11.setPreferredSize(new java.awt.Dimension(55, 25));
        btnH11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnH11ActionPerformed(evt);
            }
        });
        getContentPane().add(btnH11, new org.netbeans.lib.awtextra.AbsoluteConstraints(801, 393, -1, -1));

        btnG05.setBackground(new java.awt.Color(255, 204, 255));
        btnG05.setText("G05");
        btnG05.setPreferredSize(new java.awt.Dimension(55, 25));
        btnG05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnG05ActionPerformed(evt);
            }
        });
        getContentPane().add(btnG05, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 350, -1, -1));

        btnH03.setBackground(new java.awt.Color(255, 255, 255));
        btnH03.setText("H03");
        btnH03.setPreferredSize(new java.awt.Dimension(55, 25));
        btnH03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnH03ActionPerformed(evt);
            }
        });
        getContentPane().add(btnH03, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 393, -1, -1));

        btnH05.setBackground(new java.awt.Color(255, 255, 255));
        btnH05.setText("H05");
        btnH05.setPreferredSize(new java.awt.Dimension(55, 25));
        btnH05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnH05ActionPerformed(evt);
            }
        });
        getContentPane().add(btnH05, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 393, -1, -1));

        btnG04.setBackground(new java.awt.Color(255, 204, 255));
        btnG04.setText("G04");
        btnG04.setPreferredSize(new java.awt.Dimension(55, 25));
        btnG04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnG04ActionPerformed(evt);
            }
        });
        getContentPane().add(btnG04, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 350, -1, -1));

        btnH07.setBackground(new java.awt.Color(255, 255, 255));
        btnH07.setText("H07");
        btnH07.setPreferredSize(new java.awt.Dimension(55, 25));
        btnH07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnH07ActionPerformed(evt);
            }
        });
        getContentPane().add(btnH07, new org.netbeans.lib.awtextra.AbsoluteConstraints(557, 393, -1, -1));

        btnG08.setBackground(new java.awt.Color(255, 204, 255));
        btnG08.setText("G08");
        btnG08.setPreferredSize(new java.awt.Dimension(55, 25));
        btnG08.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnG08ActionPerformed(evt);
            }
        });
        getContentPane().add(btnG08, new org.netbeans.lib.awtextra.AbsoluteConstraints(618, 350, -1, -1));

        btnH09.setBackground(new java.awt.Color(255, 255, 255));
        btnH09.setText("H09");
        btnH09.setPreferredSize(new java.awt.Dimension(55, 25));
        btnH09.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnH09ActionPerformed(evt);
            }
        });
        getContentPane().add(btnH09, new org.netbeans.lib.awtextra.AbsoluteConstraints(679, 393, -1, -1));

        btnG07.setBackground(new java.awt.Color(255, 204, 255));
        btnG07.setText("G07");
        btnG07.setPreferredSize(new java.awt.Dimension(55, 25));
        btnG07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnG07ActionPerformed(evt);
            }
        });
        getContentPane().add(btnG07, new org.netbeans.lib.awtextra.AbsoluteConstraints(557, 350, -1, -1));

        btnG11.setBackground(new java.awt.Color(255, 204, 255));
        btnG11.setText("G11");
        btnG11.setPreferredSize(new java.awt.Dimension(55, 25));
        btnG11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnG11ActionPerformed(evt);
            }
        });
        getContentPane().add(btnG11, new org.netbeans.lib.awtextra.AbsoluteConstraints(801, 350, -1, -1));

        btnI10.setBackground(new java.awt.Color(255, 204, 255));
        btnI10.setText("I10");
        btnI10.setPreferredSize(new java.awt.Dimension(55, 25));
        btnI10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnI10ActionPerformed(evt);
            }
        });
        getContentPane().add(btnI10, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 436, -1, -1));

        btnI01.setBackground(new java.awt.Color(255, 204, 255));
        btnI01.setText("I01");
        btnI01.setPreferredSize(new java.awt.Dimension(55, 25));
        btnI01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnI01ActionPerformed(evt);
            }
        });
        getContentPane().add(btnI01, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 436, -1, -1));

        btnI02.setBackground(new java.awt.Color(255, 204, 255));
        btnI02.setText("I02");
        btnI02.setPreferredSize(new java.awt.Dimension(55, 25));
        btnI02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnI02ActionPerformed(evt);
            }
        });
        getContentPane().add(btnI02, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 436, -1, -1));

        btnJ01.setBackground(new java.awt.Color(255, 255, 255));
        btnJ01.setText("J01");
        btnJ01.setPreferredSize(new java.awt.Dimension(55, 25));
        btnJ01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJ01ActionPerformed(evt);
            }
        });
        getContentPane().add(btnJ01, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 479, -1, -1));

        btnJ11.setBackground(new java.awt.Color(255, 255, 255));
        btnJ11.setText("J11");
        btnJ11.setPreferredSize(new java.awt.Dimension(55, 25));
        btnJ11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJ11ActionPerformed(evt);
            }
        });
        getContentPane().add(btnJ11, new org.netbeans.lib.awtextra.AbsoluteConstraints(801, 479, -1, -1));

        btnI05.setBackground(new java.awt.Color(255, 204, 255));
        btnI05.setText("I05");
        btnI05.setPreferredSize(new java.awt.Dimension(55, 25));
        btnI05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnI05ActionPerformed(evt);
            }
        });
        getContentPane().add(btnI05, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 436, -1, -1));

        btnJ03.setBackground(new java.awt.Color(255, 255, 255));
        btnJ03.setText("J03");
        btnJ03.setPreferredSize(new java.awt.Dimension(55, 25));
        btnJ03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJ03ActionPerformed(evt);
            }
        });
        getContentPane().add(btnJ03, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 479, -1, -1));

        btnJ05.setBackground(new java.awt.Color(255, 255, 255));
        btnJ05.setText("J05");
        btnJ05.setPreferredSize(new java.awt.Dimension(55, 25));
        btnJ05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJ05ActionPerformed(evt);
            }
        });
        getContentPane().add(btnJ05, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 479, -1, -1));

        btnI04.setBackground(new java.awt.Color(255, 204, 255));
        btnI04.setText("I04");
        btnI04.setPreferredSize(new java.awt.Dimension(55, 25));
        btnI04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnI04ActionPerformed(evt);
            }
        });
        getContentPane().add(btnI04, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 436, -1, -1));

        btnJ07.setBackground(new java.awt.Color(255, 255, 255));
        btnJ07.setText("J07");
        btnJ07.setPreferredSize(new java.awt.Dimension(55, 25));
        btnJ07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJ07ActionPerformed(evt);
            }
        });
        getContentPane().add(btnJ07, new org.netbeans.lib.awtextra.AbsoluteConstraints(557, 479, -1, -1));

        btnI08.setBackground(new java.awt.Color(255, 204, 255));
        btnI08.setText("I08");
        btnI08.setPreferredSize(new java.awt.Dimension(55, 25));
        btnI08.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnI08ActionPerformed(evt);
            }
        });
        getContentPane().add(btnI08, new org.netbeans.lib.awtextra.AbsoluteConstraints(618, 436, -1, -1));

        btnJ09.setBackground(new java.awt.Color(255, 255, 255));
        btnJ09.setText("J09");
        btnJ09.setPreferredSize(new java.awt.Dimension(55, 25));
        btnJ09.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJ09ActionPerformed(evt);
            }
        });
        getContentPane().add(btnJ09, new org.netbeans.lib.awtextra.AbsoluteConstraints(679, 479, -1, -1));

        btnI07.setBackground(new java.awt.Color(255, 204, 255));
        btnI07.setText("I07");
        btnI07.setPreferredSize(new java.awt.Dimension(55, 25));
        btnI07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnI07ActionPerformed(evt);
            }
        });
        getContentPane().add(btnI07, new org.netbeans.lib.awtextra.AbsoluteConstraints(557, 436, -1, -1));

        btnI11.setBackground(new java.awt.Color(255, 204, 255));
        btnI11.setText("I11");
        btnI11.setPreferredSize(new java.awt.Dimension(55, 25));
        btnI11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnI11ActionPerformed(evt);
            }
        });
        getContentPane().add(btnI11, new org.netbeans.lib.awtextra.AbsoluteConstraints(801, 436, -1, -1));

        btnK10.setBackground(new java.awt.Color(255, 204, 255));
        btnK10.setText("K10");
        btnK10.setPreferredSize(new java.awt.Dimension(55, 25));
        btnK10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnK10ActionPerformed(evt);
            }
        });
        getContentPane().add(btnK10, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 522, -1, -1));

        btnK01.setBackground(new java.awt.Color(255, 204, 255));
        btnK01.setText("K01");
        btnK01.setPreferredSize(new java.awt.Dimension(55, 25));
        btnK01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnK01ActionPerformed(evt);
            }
        });
        getContentPane().add(btnK01, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 522, -1, -1));

        btnK02.setBackground(new java.awt.Color(255, 204, 255));
        btnK02.setText("K02");
        btnK02.setPreferredSize(new java.awt.Dimension(55, 25));
        btnK02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnK02ActionPerformed(evt);
            }
        });
        getContentPane().add(btnK02, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 522, -1, -1));

        btnK05.setBackground(new java.awt.Color(255, 204, 255));
        btnK05.setText("K05");
        btnK05.setPreferredSize(new java.awt.Dimension(55, 25));
        btnK05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnK05ActionPerformed(evt);
            }
        });
        getContentPane().add(btnK05, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 522, -1, -1));

        btnK04.setBackground(new java.awt.Color(255, 204, 255));
        btnK04.setText("K04");
        btnK04.setPreferredSize(new java.awt.Dimension(55, 25));
        btnK04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnK04ActionPerformed(evt);
            }
        });
        getContentPane().add(btnK04, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 522, -1, -1));

        btnK08.setBackground(new java.awt.Color(255, 204, 255));
        btnK08.setText("K08");
        btnK08.setPreferredSize(new java.awt.Dimension(55, 25));
        btnK08.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnK08ActionPerformed(evt);
            }
        });
        getContentPane().add(btnK08, new org.netbeans.lib.awtextra.AbsoluteConstraints(618, 522, -1, -1));

        btnK07.setBackground(new java.awt.Color(255, 204, 255));
        btnK07.setText("K07");
        btnK07.setPreferredSize(new java.awt.Dimension(55, 25));
        btnK07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnK07ActionPerformed(evt);
            }
        });
        getContentPane().add(btnK07, new org.netbeans.lib.awtextra.AbsoluteConstraints(557, 522, -1, -1));

        btnK11.setBackground(new java.awt.Color(255, 204, 255));
        btnK11.setText("K11");
        btnK11.setPreferredSize(new java.awt.Dimension(55, 25));
        btnK11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnK11ActionPerformed(evt);
            }
        });
        getContentPane().add(btnK11, new org.netbeans.lib.awtextra.AbsoluteConstraints(801, 522, -1, -1));

        btnSelected.setBackground(new java.awt.Color(255, 255, 0));
        btnSelected.setPreferredSize(new java.awt.Dimension(55, 25));
        getContentPane().add(btnSelected, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 604, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Selected");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 602, 50, 30));

        btnTwin1.setBackground(new java.awt.Color(255, 204, 255));
        btnTwin1.setPreferredSize(new java.awt.Dimension(55, 25));
        getContentPane().add(btnTwin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 604, -1, -1));

        btnTwin2.setBackground(new java.awt.Color(255, 204, 255));
        btnTwin2.setPreferredSize(new java.awt.Dimension(55, 25));
        getContentPane().add(btnTwin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(441, 604, -1, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Twin");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(506, 604, -1, 25));

        btnAvailable.setBackground(new java.awt.Color(255, 255, 255));
        btnAvailable.setPreferredSize(new java.awt.Dimension(55, 25));
        getContentPane().add(btnAvailable, new org.netbeans.lib.awtextra.AbsoluteConstraints(553, 604, -1, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Available");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(618, 604, 50, 25));

        btnUnavailable.setBackground(new java.awt.Color(102, 102, 102));
        btnUnavailable.setEnabled(false);
        btnUnavailable.setPreferredSize(new java.awt.Dimension(55, 25));
        getContentPane().add(btnUnavailable, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 602, -1, -1));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Unavailable");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 602, 60, 25));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinemaswingtest1/image/mainmenu/dark grey (2).jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnA01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA01ActionPerformed
        if (seat[0] == 1) {
            btnA01.setBackground(new Color(255, 204, 255));
            btnA02.setBackground(new Color(255, 204, 255));
            seat[0] = 0;
            seat[1] = 0;
            cnt -= 2;
            to_book_seat_idx.remove(0);
            to_book_seat_idx.remove(1);
        } else if (seat[0] == 0) {
            btnA01.setBackground(Color.YELLOW);
            btnA02.setBackground(Color.YELLOW);
            seat[0] = 1;
            seat[1] = 1;
            cnt += 2;
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
            cnt -= 2;
            to_book_seat_idx.remove(0);
            to_book_seat_idx.remove(1);
        } else if (seat[0] == 0) {
            btnA01.setBackground(Color.YELLOW);
            btnA02.setBackground(Color.YELLOW);
            seat[0] = 1;
            seat[1] = 1;
            cnt += 2;
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
            cnt -= 2;
            to_book_seat_idx.remove(2);
            to_book_seat_idx.remove(3);
        } else if (seat[2] == 0) {
            btnA04.setBackground(Color.YELLOW);
            btnA05.setBackground(Color.YELLOW);
            seat[2] = 1;
            seat[3] = 1;
            cnt += 2;
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
            cnt -= 2;
            to_book_seat_idx.remove(2);
            to_book_seat_idx.remove(3);
        } else if (seat[2] == 0) {
            btnA04.setBackground(Color.YELLOW);
            btnA05.setBackground(Color.YELLOW);
            seat[2] = 1;
            seat[3] = 1;
            cnt += 2;
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
            cnt -= 2;
            to_book_seat_idx.remove(4);
            to_book_seat_idx.remove(5);
        } else if (seat[4] == 0) {
            btnA07.setBackground(Color.YELLOW);
            btnA08.setBackground(Color.YELLOW);
            seat[4] = 1;
            seat[5] = 1;
            cnt += 2;
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
            cnt -= 2;
            to_book_seat_idx.remove(4);
            to_book_seat_idx.remove(5);
        } else if (seat[4] == 0) {
            btnA07.setBackground(Color.YELLOW);
            btnA08.setBackground(Color.YELLOW);
            seat[4] = 1;
            seat[5] = 1;
            cnt += 2;
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
            cnt -= 2;
            to_book_seat_idx.remove(6);
            to_book_seat_idx.remove(7);
        } else if (seat[6] == 0) {
            btnA10.setBackground(Color.YELLOW);
            btnA11.setBackground(Color.YELLOW);
            seat[6] = 1;
            seat[7] = 1;
            cnt += 2;
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
            cnt -= 2;
            to_book_seat_idx.remove(6);
            to_book_seat_idx.remove(7);
        } else if (seat[6] == 0) {
            btnA10.setBackground(Color.YELLOW);
            btnA11.setBackground(Color.YELLOW);
            seat[6] = 1;
            seat[7] = 1;
            cnt += 2;
            to_book_seat_idx.add(6);
            to_book_seat_idx.add(7);
        }
    }//GEN-LAST:event_btnA11ActionPerformed

    private void btnB01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnB01ActionPerformed
        if (seat[8] == 1) {
            btnB01.setBackground(Color.WHITE);
            seat[8] = 0;
            cnt -= 1;
            to_book_seat_idx.remove(8);
        } else if (seat[8] == 0) {
            btnB01.setBackground(Color.YELLOW);
            seat[8] = 1;
            cnt += 1;
            to_book_seat_idx.add(8);
        }
        
    }//GEN-LAST:event_btnB01ActionPerformed

    private void btnB03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnB03ActionPerformed
        if (seat[9] == 1) {
            btnB03.setBackground(Color.WHITE);
            seat[9] = 0;
            cnt -= 1;
            to_book_seat_idx.remove(9);
        } else if (seat[9] == 0) {
            btnB03.setBackground(Color.YELLOW);
            seat[9] = 1;
            cnt += 1;
            to_book_seat_idx.add(9);
        }
    }//GEN-LAST:event_btnB03ActionPerformed

    private void btnB05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnB05ActionPerformed
        if (seat[10] == 1) {
            btnB05.setBackground(Color.WHITE);
            seat[10] = 0;
            cnt -= 1;
            to_book_seat_idx.remove(10);
        } else if (seat[10] == 0) {
            btnB05.setBackground(Color.YELLOW);
            seat[10] = 1;
            cnt += 1;
            to_book_seat_idx.add(10);
        }
    }//GEN-LAST:event_btnB05ActionPerformed

    private void btnB07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnB07ActionPerformed
        if (seat[11] == 1) {
            btnB07.setBackground(Color.WHITE);
            seat[11] = 0;
            cnt -= 1;
            to_book_seat_idx.remove(11);
        } else if (seat[11] == 0) {
            btnB07.setBackground(Color.YELLOW);
            seat[11] = 1;
            cnt += 1;
            to_book_seat_idx.add(11);
        }
    }//GEN-LAST:event_btnB07ActionPerformed

    private void btnB09ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnB09ActionPerformed
        if (seat[12] == 1) {
            btnB09.setBackground(Color.WHITE);
            seat[12] = 0;
            cnt -= 1;
            to_book_seat_idx.remove(12);
        } else if (seat[12] == 0) {
            btnB09.setBackground(Color.YELLOW);
            seat[12] = 1;
            cnt += 1;
            to_book_seat_idx.remove(12);
        }
    }//GEN-LAST:event_btnB09ActionPerformed

    private void btnB11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnB11ActionPerformed
        if (seat[13] == 1) {
            btnB11.setBackground(Color.WHITE);
            seat[13] = 0;
            cnt -= 1;
            to_book_seat_idx.remove(13);
        } else if (seat[13] == 0) {
            btnB11.setBackground(Color.YELLOW);
            seat[13] = 1;
            cnt += 1;
            to_book_seat_idx.add(13);
        }
    }//GEN-LAST:event_btnB11ActionPerformed

    private void btnC01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC01ActionPerformed
        if (seat[14] == 1) {
            btnC01.setBackground(new Color(255, 204, 255));
            btnC02.setBackground(new Color(255, 204, 255));
            seat[14] = 0;
            seat[15] = 0;
            cnt -= 2;
            to_book_seat_idx.remove(14);
            to_book_seat_idx.remove(15);
        } else if (seat[14] == 0) {
            btnC01.setBackground(Color.YELLOW);
            btnC02.setBackground(Color.YELLOW);
            seat[14] = 1;
            seat[15] = 1;
            cnt += 2;
            to_book_seat_idx.add(14);
            to_book_seat_idx.add(15);
        }
    }//GEN-LAST:event_btnC01ActionPerformed

    private void btnC02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC02ActionPerformed
        if (seat[14] == 1) {
            btnC01.setBackground(new Color(255, 204, 255));
            btnC02.setBackground(new Color(255, 204, 255));
            seat[14] = 0;
            seat[15] = 0;
            cnt -= 2;
            to_book_seat_idx.remove(14);
            to_book_seat_idx.remove(15);
        } else if (seat[14] == 0) {
            btnC01.setBackground(Color.YELLOW);
            btnC02.setBackground(Color.YELLOW);
            seat[14] = 1;
            seat[15] = 1;
            cnt += 2;
            to_book_seat_idx.add(14);
            to_book_seat_idx.add(15);
        }
    }//GEN-LAST:event_btnC02ActionPerformed

    private void btnC04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC04ActionPerformed
        if (seat[16] == 1) {
            btnC04.setBackground(new Color(255, 204, 255));
            btnC05.setBackground(new Color(255, 204, 255));
            seat[16] = 0;
            seat[17] = 0;
            cnt -= 2;
            to_book_seat_idx.remove(16);
            to_book_seat_idx.remove(17);
        } else if (seat[16] == 0) {
            btnC04.setBackground(Color.YELLOW);
            btnC05.setBackground(Color.YELLOW);
            seat[16] = 1;
            seat[17] = 1;
            cnt += 2;
            to_book_seat_idx.add(16);
            to_book_seat_idx.add(17);
        }
    }//GEN-LAST:event_btnC04ActionPerformed

    private void btnC05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC05ActionPerformed
        if (seat[16] == 1) {
            btnC04.setBackground(new Color(255, 204, 255));
            btnC05.setBackground(new Color(255, 204, 255));
            seat[16] = 0;
            seat[17] = 0;
            cnt -= 2;
            to_book_seat_idx.remove(16);
            to_book_seat_idx.remove(17);
        } else if (seat[16] == 0) {
            btnC04.setBackground(Color.YELLOW);
            btnC05.setBackground(Color.YELLOW);
            seat[16] = 1;
            seat[17] = 1;
            cnt += 2;
            to_book_seat_idx.add(16);
            to_book_seat_idx.add(17);
        }
    }//GEN-LAST:event_btnC05ActionPerformed

    private void btnC07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC07ActionPerformed
        if (seat[18] == 1) {
            btnC07.setBackground(new Color(255, 204, 255));
            btnC08.setBackground(new Color(255, 204, 255));
            seat[18] = 0;
            seat[19] = 0;
            cnt -= 2;
            to_book_seat_idx.remove(18);
            to_book_seat_idx.remove(19);
        } else if (seat[18] == 0) {
            btnC07.setBackground(Color.YELLOW);
            btnC08.setBackground(Color.YELLOW);
            seat[18] = 1;
            seat[19] = 1;
            cnt += 2;
            to_book_seat_idx.add(18);
            to_book_seat_idx.add(19);
        }
    }//GEN-LAST:event_btnC07ActionPerformed

    private void btnC08ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC08ActionPerformed
        if (seat[18] == 1) {
            btnC07.setBackground(new Color(255, 204, 255));
            btnC08.setBackground(new Color(255, 204, 255));
            seat[18] = 0;
            seat[19] = 0;
            cnt -= 2;
            to_book_seat_idx.remove(18);
            to_book_seat_idx.remove(19);
        } else if (seat[18] == 0) {
            btnC07.setBackground(Color.YELLOW);
            btnC08.setBackground(Color.YELLOW);
            seat[18] = 1;
            seat[19] = 1;
            cnt += 2;
            to_book_seat_idx.add(18);
            to_book_seat_idx.add(19);
        }
    }//GEN-LAST:event_btnC08ActionPerformed

    private void btnC10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC10ActionPerformed
        if (seat[20] == 1) {
            btnC10.setBackground(new Color(255, 204, 255));
            btnC11.setBackground(new Color(255, 204, 255));
            seat[20] = 0;
            seat[21] = 0;
            cnt -= 2;
            to_book_seat_idx.remove(20);
            to_book_seat_idx.remove(21);
        } else if (seat[20] == 0) {
            btnC10.setBackground(Color.YELLOW);
            btnC11.setBackground(Color.YELLOW);
            seat[20] = 1;
            seat[21] = 1;
            cnt += 2;
            to_book_seat_idx.add(20);
            to_book_seat_idx.add(21);
        }
    }//GEN-LAST:event_btnC10ActionPerformed

    private void btnC11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC11ActionPerformed
        if (seat[20] == 1) {
            btnC10.setBackground(new Color(255, 204, 255));
            btnC11.setBackground(new Color(255, 204, 255));
            seat[20] = 0;
            seat[21] = 0;
            cnt -= 2;
            to_book_seat_idx.remove(20);
            to_book_seat_idx.remove(21);
        } else if (seat[20] == 0) {
            btnC10.setBackground(Color.YELLOW);
            btnC11.setBackground(Color.YELLOW);
            seat[20] = 1;
            seat[21] = 1;
            cnt += 2;
            to_book_seat_idx.add(20);
            to_book_seat_idx.add(21);
        }
    }//GEN-LAST:event_btnC11ActionPerformed

    private void btnD01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnD01ActionPerformed
        if (seat[22] == 1) {
            btnD01.setBackground(Color.WHITE);
            seat[22] = 0;
            cnt -= 1;
            to_book_seat_idx.remove(22);
        } else if (seat[22] == 0) {
            btnD01.setBackground(Color.YELLOW);
            seat[22] = 1;
            cnt += 1;
            to_book_seat_idx.add(22);
        }
    }//GEN-LAST:event_btnD01ActionPerformed

    private void btnD03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnD03ActionPerformed
        if (seat[23] == 1) {
            btnD03.setBackground(Color.WHITE);
            seat[23] = 0;
            cnt -= 1;
            to_book_seat_idx.add(23);
        } else if (seat[23] == 0) {
            btnD03.setBackground(Color.YELLOW);
            seat[23] = 1;
            cnt += 1;
            to_book_seat_idx.add(23);
        }
    }//GEN-LAST:event_btnD03ActionPerformed

    private void btnD05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnD05ActionPerformed
        if (seat[24] == 1) {
            btnD05.setBackground(Color.WHITE);
            seat[24] = 0;
            cnt -= 1;
            to_book_seat_idx.add(24);
        } else if (seat[24] == 0) {
            btnD05.setBackground(Color.YELLOW);
            seat[24] = 1;
            cnt += 1;
            to_book_seat_idx.add(24);
        }
    }//GEN-LAST:event_btnD05ActionPerformed

    private void btnD07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnD07ActionPerformed
        if (seat[25] == 1) {
            btnD07.setBackground(Color.WHITE);
            seat[25] = 0;
            cnt -= 1;
            to_book_seat_idx.remove(25);
        } else if (seat[25] == 0) {
            btnD07.setBackground(Color.YELLOW);
            seat[25] = 1;
            cnt += 1;
            to_book_seat_idx.add(25);
        }
    }//GEN-LAST:event_btnD07ActionPerformed

    private void btnD09ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnD09ActionPerformed
        if (seat[26] == 1) {
            btnD09.setBackground(Color.WHITE);
            seat[26] = 0;
            cnt -= 1;
            to_book_seat_idx.remove(26);
        } else if (seat[26] == 0) {
            btnD09.setBackground(Color.YELLOW);
            seat[26] = 1;
            cnt += 1;
            to_book_seat_idx.add(26);
        }
    }//GEN-LAST:event_btnD09ActionPerformed

    private void btnD11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnD11ActionPerformed
        if (seat[27] == 1) {
            btnD11.setBackground(Color.WHITE);
            seat[27] = 0;
            cnt -= 1;
            to_book_seat_idx.remove(27);
        } else if (seat[27] == 0) {
            btnD11.setBackground(Color.YELLOW);
            seat[27] = 1;
            cnt += 1;
            to_book_seat_idx.add(27);
        }
    }//GEN-LAST:event_btnD11ActionPerformed

    private void btnE01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnE01ActionPerformed
        if (seat[28] == 1) {
            btnE01.setBackground(new Color(255, 204, 255));
            btnE02.setBackground(new Color(255, 204, 255));
            seat[28] = 0;
            seat[29] = 0;
            cnt -= 2;
            to_book_seat_idx.remove(28);
            to_book_seat_idx.remove(29);
        } else if (seat[28] == 0) {
            btnE01.setBackground(Color.YELLOW);
            btnE02.setBackground(Color.YELLOW);
            seat[28] = 1;
            seat[29] = 1;
            cnt += 2;
            to_book_seat_idx.add(28);
            to_book_seat_idx.add(29);
        }
    }//GEN-LAST:event_btnE01ActionPerformed

    private void btnE02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnE02ActionPerformed
        if (seat[28] == 1) {
            btnE01.setBackground(new Color(255, 204, 255));
            btnE02.setBackground(new Color(255, 204, 255));
            seat[28] = 0;
            seat[29] = 0;
            cnt -= 2;
            to_book_seat_idx.remove(28);
            to_book_seat_idx.remove(29);
        } else if (seat[28] == 0) {
            btnE01.setBackground(Color.YELLOW);
            btnE02.setBackground(Color.YELLOW);
            seat[28] = 1;
            seat[29] = 1;
            cnt += 2;
            to_book_seat_idx.add(28);
            to_book_seat_idx.add(29);
        }
    }//GEN-LAST:event_btnE02ActionPerformed

    private void btnE04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnE04ActionPerformed
        if (seat[30] == 1) {
            btnE04.setBackground(new Color(255, 204, 255));
            btnE05.setBackground(new Color(255, 204, 255));
            seat[30] = 0;
            seat[31] = 0;
            cnt -= 2;
            to_book_seat_idx.remove(30);
            to_book_seat_idx.remove(21);
        } else if (seat[30] == 0) {
            btnE04.setBackground(Color.YELLOW);
            btnE05.setBackground(Color.YELLOW);
            seat[30] = 1;
            seat[31] = 1;
            cnt += 2;
            to_book_seat_idx.add(30);
            to_book_seat_idx.add(31);
        }
    }//GEN-LAST:event_btnE04ActionPerformed

    private void btnE05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnE05ActionPerformed
        if (seat[30] == 1) {
            btnE04.setBackground(new Color(255, 204, 255));
            btnE05.setBackground(new Color(255, 204, 255));
            seat[30] = 0;
            seat[31] = 0;
            cnt -= 2;
            to_book_seat_idx.remove(30);
            to_book_seat_idx.remove(31);
        } else if (seat[30] == 0) {
            btnE04.setBackground(Color.YELLOW);
            btnE05.setBackground(Color.YELLOW);
            seat[30] = 1;
            seat[31] = 1;
            cnt += 2;
            to_book_seat_idx.add(30);
            to_book_seat_idx.add(31);
        }
    }//GEN-LAST:event_btnE05ActionPerformed

    private void btnE07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnE07ActionPerformed
        if (seat[32] == 1) {
            btnE07.setBackground(new Color(255, 204, 255));
            btnE08.setBackground(new Color(255, 204, 255));
            seat[32] = 0;
            seat[33] = 0;
            cnt -= 2;
            to_book_seat_idx.remove(32);
            to_book_seat_idx.remove(33);
        } else if (seat[32] == 0) {
            btnE07.setBackground(Color.YELLOW);
            btnE08.setBackground(Color.YELLOW);
            seat[32] = 1;
            seat[33] = 1;
            cnt += 2;
            to_book_seat_idx.add(32);
            to_book_seat_idx.add(33);
        }
    }//GEN-LAST:event_btnE07ActionPerformed

    private void btnE08ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnE08ActionPerformed
        if (seat[32] == 1) {
            btnE07.setBackground(new Color(255, 204, 255));
            btnE08.setBackground(new Color(255, 204, 255));
            seat[32] = 0;
            seat[33] = 0;
            cnt -= 2;
            to_book_seat_idx.remove(32);
            to_book_seat_idx.remove(33);
        } else if (seat[32] == 0) {
            btnE07.setBackground(Color.YELLOW);
            btnE08.setBackground(Color.YELLOW);
            seat[32] = 1;
            seat[33] = 1;
            cnt += 2;
            to_book_seat_idx.add(32);
            to_book_seat_idx.add(33);
        }
    }//GEN-LAST:event_btnE08ActionPerformed

    private void btnE10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnE10ActionPerformed
        if (seat[34] == 1) {
            btnE10.setBackground(new Color(255, 204, 255));
            btnE11.setBackground(new Color(255, 204, 255));
            seat[34] = 0;
            seat[35] = 0;
            cnt -= 2;
            to_book_seat_idx.remove(34);
            to_book_seat_idx.remove(35);
        } else if (seat[34] == 0) {
            btnE10.setBackground(Color.YELLOW);
            btnE11.setBackground(Color.YELLOW);
            seat[34] = 1;
            seat[35] = 1;
            cnt += 2;
            to_book_seat_idx.add(34);
            to_book_seat_idx.add(35);
        }
    }//GEN-LAST:event_btnE10ActionPerformed

    private void btnE11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnE11ActionPerformed
        if (seat[34] == 1) {
            btnE10.setBackground(new Color(255, 204, 255));
            btnE11.setBackground(new Color(255, 204, 255));
            seat[34] = 0;
            seat[35] = 0;
            cnt -= 2;
            to_book_seat_idx.remove(34);
            to_book_seat_idx.remove(35);
        } else if (seat[34] == 0) {
            btnE10.setBackground(Color.YELLOW);
            btnE11.setBackground(Color.YELLOW);
            seat[34] = 1;
            seat[35] = 1;
            cnt += 2;
            to_book_seat_idx.add(34);
            to_book_seat_idx.add(35);
        }
    }//GEN-LAST:event_btnE11ActionPerformed

    private void btnF01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnF01ActionPerformed
        if (seat[36] == 1) {
            btnF01.setBackground(Color.WHITE);
            seat[36] = 0;
            cnt -= 1;
            to_book_seat_idx.remove(36);
        } else if (seat[36] == 0) {
            btnF01.setBackground(Color.YELLOW);
            seat[36] = 1;
            cnt += 1;
            to_book_seat_idx.add(36);
        }
    }//GEN-LAST:event_btnF01ActionPerformed

    private void btnF03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnF03ActionPerformed
        if (seat[37] == 1) {
            btnF03.setBackground(Color.WHITE);
            seat[37] = 0;
            cnt -= 1;
            to_book_seat_idx.remove(37);
        } else if (seat[37] == 0) {
            btnF03.setBackground(Color.YELLOW);
            seat[37] = 1;
            cnt += 1;
            to_book_seat_idx.add(37);
        }
    }//GEN-LAST:event_btnF03ActionPerformed

    private void btnF05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnF05ActionPerformed
        if (seat[38] == 1) {
            btnF05.setBackground(Color.WHITE);
            seat[38] = 0;
            cnt -= 1;
            to_book_seat_idx.remove(38);
        } else if (seat[38] == 0) {
            btnF05.setBackground(Color.YELLOW);
            seat[38] = 1;
            cnt += 1;
            to_book_seat_idx.add(38);
        }
    }//GEN-LAST:event_btnF05ActionPerformed

    private void btnF07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnF07ActionPerformed
        if (seat[39] == 1) {
            btnF07.setBackground(Color.WHITE);
            seat[39] = 0;
            cnt -= 1;
            to_book_seat_idx.remove(39);
        } else if (seat[39] == 0) {
            btnF07.setBackground(Color.YELLOW);
            seat[39] = 1;
            cnt += 1;
            to_book_seat_idx.add(39);
        }
    }//GEN-LAST:event_btnF07ActionPerformed

    private void btnF09ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnF09ActionPerformed
        if (seat[40] == 1) {
            btnF09.setBackground(Color.WHITE);
            seat[40] = 0;
            cnt -= 1;
            to_book_seat_idx.remove(40);
        } else if (seat[40] == 0) {
            btnF09.setBackground(Color.YELLOW);
            seat[40] = 1;
            cnt += 1;
            to_book_seat_idx.add(40);
        }
    }//GEN-LAST:event_btnF09ActionPerformed

    private void btnF11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnF11ActionPerformed
        if (seat[41] == 1) {
            btnF11.setBackground(Color.WHITE);
            seat[41] = 0;
            cnt -= 1;
            to_book_seat_idx.remove(41);
        } else if (seat[41] == 0) {
            btnF11.setBackground(Color.YELLOW);
            seat[41] = 1;
            cnt += 1;
            to_book_seat_idx.add(41);
        }
    }//GEN-LAST:event_btnF11ActionPerformed

    private void btnG01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnG01ActionPerformed
        if (seat[42] == 1) {
            btnG01.setBackground(new Color(255, 204, 255));
            btnG02.setBackground(new Color(255, 204, 255));
            seat[42] = 0;
            seat[43] = 0;
            cnt -= 2;
            to_book_seat_idx.remove(42);
            to_book_seat_idx.remove(43);
        } else if (seat[42] == 0) {
            btnG01.setBackground(Color.YELLOW);
            btnG02.setBackground(Color.YELLOW);
            seat[42] = 1;
            seat[43] = 1;
            cnt += 2;
            to_book_seat_idx.add(42);
            to_book_seat_idx.add(43);
        }
    }//GEN-LAST:event_btnG01ActionPerformed

    private void btnG02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnG02ActionPerformed
        if (seat[42] == 1) {
            btnG01.setBackground(new Color(255, 204, 255));
            btnG02.setBackground(new Color(255, 204, 255));
            seat[42] = 0;
            seat[43] = 0;
            cnt -= 2;
            to_book_seat_idx.remove(42);
            to_book_seat_idx.remove(43);
        } else if (seat[42] == 0) {
            btnG01.setBackground(Color.YELLOW);
            btnG02.setBackground(Color.YELLOW);
            seat[42] = 1;
            seat[43] = 1;
            cnt += 2;
            to_book_seat_idx.add(42);
            to_book_seat_idx.add(43);
        }
    }//GEN-LAST:event_btnG02ActionPerformed

    private void btnG04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnG04ActionPerformed
        if (seat[44] == 1) {
            btnG04.setBackground(new Color(255, 204, 255));
            btnG05.setBackground(new Color(255, 204, 255));
            seat[44] = 0;
            seat[45] = 0;
            cnt -= 2;
            to_book_seat_idx.remove(44);
            to_book_seat_idx.remove(45);
        } else if (seat[44] == 0) {
            btnG04.setBackground(Color.YELLOW);
            btnG05.setBackground(Color.YELLOW);
            seat[44] = 1;
            seat[45] = 1;
            cnt += 2;
            to_book_seat_idx.add(44);
            to_book_seat_idx.add(45);
        }
    }//GEN-LAST:event_btnG04ActionPerformed

    private void btnG05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnG05ActionPerformed
        if (seat[44] == 1) {
            btnG04.setBackground(new Color(255, 204, 255));
            btnG05.setBackground(new Color(255, 204, 255));
            seat[44] = 0;
            seat[45] = 0;
            cnt -= 2;
            to_book_seat_idx.remove(44);
            to_book_seat_idx.remove(45);
        } else if (seat[44] == 0) {
            btnG04.setBackground(Color.YELLOW);
            btnG05.setBackground(Color.YELLOW);
            seat[44] = 1;
            seat[45] = 1;
            cnt += 2;
            to_book_seat_idx.add(44);
            to_book_seat_idx.add(45);
        }
    }//GEN-LAST:event_btnG05ActionPerformed

    private void btnG07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnG07ActionPerformed
        if (seat[46] == 1) {
            btnG07.setBackground(new Color(255, 204, 255));
            btnG08.setBackground(new Color(255, 204, 255));
            seat[46] = 0;
            seat[47] = 0;
            cnt -= 2;
            to_book_seat_idx.remove(46);
            to_book_seat_idx.remove(47);
        } else if (seat[46] == 0) {
            btnG07.setBackground(Color.YELLOW);
            btnG08.setBackground(Color.YELLOW);
            seat[46] = 1;
            seat[47] = 1;
            cnt += 2;
            to_book_seat_idx.add(46);
            to_book_seat_idx.add(47);
        }
    }//GEN-LAST:event_btnG07ActionPerformed

    private void btnG08ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnG08ActionPerformed
        if (seat[46] == 1) {
            btnG07.setBackground(new Color(255, 204, 255));
            btnG08.setBackground(new Color(255, 204, 255));
            seat[46] = 0;
            seat[47] = 0;
            cnt -= 2;
            to_book_seat_idx.remove(46);
            to_book_seat_idx.remove(47);
        } else if (seat[46] == 0) {
            btnG07.setBackground(Color.YELLOW);
            btnG08.setBackground(Color.YELLOW);
            seat[46] = 1;
            seat[47] = 1;
            cnt += 2;
            to_book_seat_idx.add(46);
            to_book_seat_idx.add(47);
        }
    }//GEN-LAST:event_btnG08ActionPerformed

    private void btnG10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnG10ActionPerformed
        if (seat[48] == 1) {
            btnG10.setBackground(new Color(255, 204, 255));
            btnG11.setBackground(new Color(255, 204, 255));
            seat[48] = 0;
            seat[49] = 0;
            cnt -= 2;
            to_book_seat_idx.remove(48);
            to_book_seat_idx.remove(49);
        } else if (seat[48] == 0) {
            btnG10.setBackground(Color.YELLOW);
            btnG11.setBackground(Color.YELLOW);
            seat[48] = 1;
            seat[49] = 1;
            cnt += 2;
            to_book_seat_idx.add(48);
            to_book_seat_idx.add(49);
        }
    }//GEN-LAST:event_btnG10ActionPerformed

    private void btnG11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnG11ActionPerformed
        if (seat[48] == 1) {
            btnG10.setBackground(new Color(255, 204, 255));
            btnG11.setBackground(new Color(255, 204, 255));
            seat[48] = 0;
            seat[49] = 0;
            cnt -= 2;
            to_book_seat_idx.remove(48);
            to_book_seat_idx.remove(49);
        } else if (seat[48] == 0) {
            btnG10.setBackground(Color.YELLOW);
            btnG11.setBackground(Color.YELLOW);
            seat[48] = 1;
            seat[49] = 1;
            cnt += 2;
            to_book_seat_idx.add(48);
            to_book_seat_idx.add(49);
        }
    }//GEN-LAST:event_btnG11ActionPerformed

    private void btnH01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnH01ActionPerformed
        if (seat[50] == 1) {
            btnH01.setBackground(Color.WHITE);
            seat[50] = 0;
            cnt -= 1;
            to_book_seat_idx.remove(50);
        } else if (seat[50] == 0) {
            btnH01.setBackground(Color.YELLOW);
            seat[50] = 1;
            cnt += 1;
            to_book_seat_idx.add(50);
        }
    }//GEN-LAST:event_btnH01ActionPerformed

    private void btnH03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnH03ActionPerformed
        if (seat[51] == 1) {
            btnH03.setBackground(Color.WHITE);
            seat[51] = 0;
            cnt -= 1;
            to_book_seat_idx.remove(51);
        } else if (seat[51] == 0) {
            btnH03.setBackground(Color.YELLOW);
            seat[51] = 1;
            cnt += 1;
            to_book_seat_idx.add(51);
        }
    }//GEN-LAST:event_btnH03ActionPerformed

    private void btnH05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnH05ActionPerformed
        if (seat[52] == 1) {
            btnH05.setBackground(Color.WHITE);
            seat[52] = 0;
            cnt -= 1;
            to_book_seat_idx.remove(52);
        } else if (seat[52] == 0) {
            btnH05.setBackground(Color.YELLOW);
            seat[52] = 1;
            cnt += 1;
            to_book_seat_idx.add(52);

        }
    }//GEN-LAST:event_btnH05ActionPerformed

    private void btnH07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnH07ActionPerformed
        if (seat[53] == 1) {
            btnH07.setBackground(Color.WHITE);
            seat[53] = 0;
            cnt -= 1;
            to_book_seat_idx.remove(53);
        } else if (seat[53] == 0) {
            btnH07.setBackground(Color.YELLOW);
            seat[53] = 1;
            cnt += 1;
            to_book_seat_idx.add(53);
        }
    }//GEN-LAST:event_btnH07ActionPerformed

    private void btnH09ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnH09ActionPerformed
        if (seat[54] == 1) {
            btnH09.setBackground(Color.WHITE);
            seat[54] = 0;
            cnt -= 1;
            to_book_seat_idx.remove(54);
        } else if (seat[54] == 0) {
            btnH09.setBackground(Color.YELLOW);
            seat[54] = 1;
            cnt += 1;
            to_book_seat_idx.add(54);
        }
    }//GEN-LAST:event_btnH09ActionPerformed

    private void btnH11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnH11ActionPerformed
        if (seat[55] == 1) {
            btnH11.setBackground(Color.WHITE);
            seat[55] = 0;
            cnt -= 1;
            to_book_seat_idx.remove(55);
        } else if (seat[55] == 0) {
            btnH11.setBackground(Color.YELLOW);
            seat[55] = 1;
            cnt += 1;
            to_book_seat_idx.add(55);
        }
    }//GEN-LAST:event_btnH11ActionPerformed

    private void btnI01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnI01ActionPerformed
        if (seat[56] == 1) {
            btnI01.setBackground(new Color(255, 204, 255));
            btnI02.setBackground(new Color(255, 204, 255));
            seat[56] = 0;
            seat[57] = 0;
            cnt -= 2;
            to_book_seat_idx.remove(56);
            to_book_seat_idx.remove(57);
        } else if (seat[56] == 0) {
            btnI01.setBackground(Color.YELLOW);
            btnI02.setBackground(Color.YELLOW);
            seat[56] = 1;
            seat[57] = 1;
            cnt += 2;
            to_book_seat_idx.add(56);
            to_book_seat_idx.add(57);
        }
    }//GEN-LAST:event_btnI01ActionPerformed

    private void btnI02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnI02ActionPerformed
        if (seat[56] == 1) {
            btnI01.setBackground(new Color(255, 204, 255));
            btnI02.setBackground(new Color(255, 204, 255));
            seat[56] = 0;
            seat[57] = 0;
            cnt -= 2;
            to_book_seat_idx.remove(56);
            to_book_seat_idx.remove(57);
        } else if (seat[56] == 0) {
            btnI01.setBackground(Color.YELLOW);
            btnI02.setBackground(Color.YELLOW);
            seat[56] = 1;
            seat[57] = 1;
            cnt += 2;
            to_book_seat_idx.add(56);
            to_book_seat_idx.add(57);
        }
    }//GEN-LAST:event_btnI02ActionPerformed

    private void btnI04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnI04ActionPerformed
        if (seat[58] == 1) {
            btnI04.setBackground(new Color(255, 204, 255));
            btnI05.setBackground(new Color(255, 204, 255));
            seat[58] = 0;
            seat[59] = 0;
            cnt -= 2;
            to_book_seat_idx.remove(58);
            to_book_seat_idx.remove(59);
        } else if (seat[58] == 0) {
            btnI04.setBackground(Color.YELLOW);
            btnI05.setBackground(Color.YELLOW);
            seat[58] = 1;
            seat[59] = 1;
            cnt += 2;
            to_book_seat_idx.remove(58);
            to_book_seat_idx.remove(59);
        }
    }//GEN-LAST:event_btnI04ActionPerformed

    private void btnI05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnI05ActionPerformed
        if (seat[58] == 1) {
            btnI04.setBackground(new Color(255, 204, 255));
            btnI05.setBackground(new Color(255, 204, 255));
            seat[58] = 0;
            seat[59] = 0;
            cnt -= 2;
            to_book_seat_idx.remove(58);
            to_book_seat_idx.remove(59);
        } else if (seat[58] == 0) {
            btnI04.setBackground(Color.YELLOW);
            btnI05.setBackground(Color.YELLOW);
            seat[58] = 1;
            seat[59] = 1;
            cnt += 2;
            to_book_seat_idx.add(58);
            to_book_seat_idx.add(59);
        }
    }//GEN-LAST:event_btnI05ActionPerformed

    private void btnI07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnI07ActionPerformed
        if (seat[60] == 1) {
            btnI07.setBackground(new Color(255, 204, 255));
            btnI08.setBackground(new Color(255, 204, 255));
            seat[60] = 0;
            seat[61] = 0;
            cnt -= 2;
            to_book_seat_idx.remove(60);
            to_book_seat_idx.remove(61);
        } else if (seat[60] == 0) {
            btnI07.setBackground(Color.YELLOW);
            btnI08.setBackground(Color.YELLOW);
            seat[60] = 1;
            seat[61] = 1;
            cnt += 2;
            to_book_seat_idx.add(60);
            to_book_seat_idx.add(61);
        }
    }//GEN-LAST:event_btnI07ActionPerformed

    private void btnI08ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnI08ActionPerformed
        if (seat[60] == 1) {
            btnI07.setBackground(new Color(255, 204, 255));
            btnI08.setBackground(new Color(255, 204, 255));
            seat[60] = 0;
            seat[61] = 0;
            cnt -= 2;
            to_book_seat_idx.remove(60);
            to_book_seat_idx.remove(61);
        } else if (seat[60] == 0) {
            btnI07.setBackground(Color.YELLOW);
            btnI08.setBackground(Color.YELLOW);
            seat[60] = 1;
            seat[61] = 1;
            cnt += 2;
            to_book_seat_idx.add(60);
            to_book_seat_idx.add(61);
        }
    }//GEN-LAST:event_btnI08ActionPerformed

    private void btnI10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnI10ActionPerformed
        if (seat[62] == 1) {
            btnI10.setBackground(new Color(255, 204, 255));
            btnI11.setBackground(new Color(255, 204, 255));
            seat[62] = 0;
            seat[63] = 0;
            cnt -= 2;
            to_book_seat_idx.remove(62);
            to_book_seat_idx.remove(63);
        } else if (seat[62] == 0) {
            btnI10.setBackground(Color.YELLOW);
            btnI11.setBackground(Color.YELLOW);
            seat[62] = 1;
            seat[63] = 1;
            cnt += 2;
            to_book_seat_idx.add(62);
            to_book_seat_idx.add(63);
        }
    }//GEN-LAST:event_btnI10ActionPerformed

    private void btnI11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnI11ActionPerformed
        if (seat[62] == 1) {
            btnI10.setBackground(new Color(255, 204, 255));
            btnI11.setBackground(new Color(255, 204, 255));
            seat[62] = 0;
            seat[63] = 0;
            cnt -= 2;
            to_book_seat_idx.remove(62);
            to_book_seat_idx.remove(63);
        } else if (seat[62] == 0) {
            btnI10.setBackground(Color.YELLOW);
            btnI11.setBackground(Color.YELLOW);
            seat[62] = 1;
            seat[63] = 1;
            cnt += 2;
            to_book_seat_idx.add(62);
            to_book_seat_idx.add(63);
        }
    }//GEN-LAST:event_btnI11ActionPerformed

    private void btnJ01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJ01ActionPerformed
        if (seat[64] == 1) {
            btnJ01.setBackground(Color.WHITE);
            seat[64] = 0;
            cnt -= 1;
            to_book_seat_idx.remove(64);
        } else if (seat[64] == 0) {
            btnJ01.setBackground(Color.YELLOW);
            seat[64] = 1;
            cnt += 1;
            to_book_seat_idx.add(64);
        }
    }//GEN-LAST:event_btnJ01ActionPerformed

    private void btnJ03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJ03ActionPerformed
        if (seat[65] == 1) {
            btnJ03.setBackground(Color.WHITE);
            seat[65] = 0;
            cnt -= 1;
            to_book_seat_idx.remove(65);
        } else if (seat[65] == 0) {
            btnJ03.setBackground(Color.YELLOW);
            seat[65] = 1;
            cnt += 1;
            to_book_seat_idx.add(65);
        }
    }//GEN-LAST:event_btnJ03ActionPerformed

    private void btnJ05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJ05ActionPerformed
        if (seat[66] == 1) {
            btnJ05.setBackground(Color.WHITE);
            seat[66] = 0;
            cnt -= 1;
            to_book_seat_idx.remove(66);
        } else if (seat[66] == 0) {
            btnJ05.setBackground(Color.YELLOW);
            seat[66] = 1;
            cnt += 1;
            to_book_seat_idx.add(66);
        }
    }//GEN-LAST:event_btnJ05ActionPerformed

    private void btnJ07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJ07ActionPerformed
        if (seat[67] == 1) {
            btnJ07.setBackground(Color.WHITE);
            seat[67] = 0;
            cnt -= 1;
            to_book_seat_idx.remove(67);
        } else if (seat[67] == 0) {
            btnJ07.setBackground(Color.YELLOW);
            seat[67] = 1;
            cnt += 1;
            to_book_seat_idx.add(67);
        }
    }//GEN-LAST:event_btnJ07ActionPerformed

    private void btnJ09ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJ09ActionPerformed
        if (seat[68] == 1) {
            btnJ09.setBackground(Color.WHITE);
            seat[68] = 0;
            cnt -= 1;
            to_book_seat_idx.remove(68);
        } else if (seat[68] == 0) {
            btnJ09.setBackground(Color.YELLOW);
            seat[68] = 1;
            cnt += 1;
            to_book_seat_idx.add(68);
        }
    }//GEN-LAST:event_btnJ09ActionPerformed

    private void btnJ11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJ11ActionPerformed
        if (seat[69] == 1) {
            btnJ11.setBackground(Color.WHITE);
            seat[69] = 0;
            cnt -= 1;
            to_book_seat_idx.remove(69);
        } else if (seat[69] == 0) {
            btnJ11.setBackground(Color.YELLOW);
            seat[69] = 1;
            cnt += 1;
            to_book_seat_idx.add(69);
        }
    }//GEN-LAST:event_btnJ11ActionPerformed

    private void btnK01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnK01ActionPerformed
        if (seat[70] == 1) {
            btnK01.setBackground(new Color(255, 204, 255));
            btnK02.setBackground(new Color(255, 204, 255));
            seat[70] = 0;
            seat[71] = 0;
            cnt -= 2;
            to_book_seat_idx.remove(70);
            to_book_seat_idx.remove(71);
        } else if (seat[70] == 0) {
            btnK01.setBackground(Color.YELLOW);
            btnK02.setBackground(Color.YELLOW);
            seat[70] = 1;
            seat[71] = 1;
            cnt += 2;
            to_book_seat_idx.add(70);
            to_book_seat_idx.add(71);
        }
    }//GEN-LAST:event_btnK01ActionPerformed

    private void btnK02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnK02ActionPerformed
        if (seat[70] == 1) {
            btnK01.setBackground(new Color(255, 204, 255));
            btnK02.setBackground(new Color(255, 204, 255));
            seat[70] = 0;
            seat[71] = 0;
            cnt -= 2;
            to_book_seat_idx.remove(70);
            to_book_seat_idx.remove(71);
        } else if (seat[70] == 0) {
            btnK01.setBackground(Color.YELLOW);
            btnK02.setBackground(Color.YELLOW);
            seat[70] = 1;
            seat[71] = 1;
            cnt += 2;
            to_book_seat_idx.add(70);
            to_book_seat_idx.add(71);
        }
    }//GEN-LAST:event_btnK02ActionPerformed

    private void btnK04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnK04ActionPerformed
        if (seat[72] == 1) {
            btnK04.setBackground(new Color(255, 204, 255));
            btnK05.setBackground(new Color(255, 204, 255));
            seat[72] = 0;
            seat[73] = 0;
            cnt -= 2;
            to_book_seat_idx.remove(72);
            to_book_seat_idx.remove(73);
        } else if (seat[72] == 0) {
            btnK04.setBackground(Color.YELLOW);
            btnK05.setBackground(Color.YELLOW);
            seat[72] = 1;
            seat[73] = 1;
            cnt += 2;
            to_book_seat_idx.add(72);
            to_book_seat_idx.add(73);
        }
    }//GEN-LAST:event_btnK04ActionPerformed

    private void btnK05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnK05ActionPerformed
        if (seat[72] == 1) {
            btnK04.setBackground(new Color(255, 204, 255));
            btnK05.setBackground(new Color(255, 204, 255));
            seat[72] = 0;
            seat[73] = 0;
            cnt -= 2;
            to_book_seat_idx.remove(72);
            to_book_seat_idx.remove(73);
        } else if (seat[72] == 0) {
            btnK04.setBackground(Color.YELLOW);
            btnK05.setBackground(Color.YELLOW);
            seat[72] = 1;
            seat[73] = 1;
            cnt += 2;
            to_book_seat_idx.add(72);
            to_book_seat_idx.add(73);
        }
    }//GEN-LAST:event_btnK05ActionPerformed

    private void btnK07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnK07ActionPerformed
        if (seat[74] == 1) {
            btnK07.setBackground(new Color(255, 204, 255));
            btnK08.setBackground(new Color(255, 204, 255));
            seat[74] = 0;
            seat[75] = 0;
            cnt -= 2;
            to_book_seat_idx.remove(74);
            to_book_seat_idx.remove(75);
        } else if (seat[74] == 0) {
            btnK07.setBackground(Color.YELLOW);
            btnK08.setBackground(Color.YELLOW);
            seat[74] = 1;
            seat[75] = 1;
            cnt += 2;
            to_book_seat_idx.add(74);
            to_book_seat_idx.add(75);
        }
    }//GEN-LAST:event_btnK07ActionPerformed

    private void btnK08ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnK08ActionPerformed
        if (seat[74] == 1) {
            btnK07.setBackground(new Color(255, 204, 255));
            btnK08.setBackground(new Color(255, 204, 255));
            seat[74] = 0;
            seat[75] = 0;
            cnt -= 2;
            to_book_seat_idx.remove(74);
            to_book_seat_idx.remove(75);
        } else if (seat[74] == 0) {
            btnK07.setBackground(Color.YELLOW);
            btnK08.setBackground(Color.YELLOW);
            seat[74] = 1;
            seat[75] = 1;
            cnt += 2;
            to_book_seat_idx.add(74);
            to_book_seat_idx.add(75);
        }
    }//GEN-LAST:event_btnK08ActionPerformed

    private void btnK10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnK10ActionPerformed
        if (seat[76] == 1) {
            btnK10.setBackground(new Color(255, 204, 255));
            btnK11.setBackground(new Color(255, 204, 255));
            seat[76] = 0;
            seat[77] = 0;
            cnt -= 2;
            to_book_seat_idx.remove(76);
            to_book_seat_idx.remove(77);
        } else if (seat[76] == 0) {
            btnK10.setBackground(Color.YELLOW);
            btnK11.setBackground(Color.YELLOW);
            seat[76] = 1;
            seat[77] = 1;
            cnt += 2;
            to_book_seat_idx.add(76);
            to_book_seat_idx.add(77);
        }
    }//GEN-LAST:event_btnK10ActionPerformed

    private void btnK11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnK11ActionPerformed
        if (seat[76] == 1) {
            btnK10.setBackground(new Color(255, 204, 255));
            btnK11.setBackground(new Color(255, 204, 255));
            seat[76] = 0;
            seat[77] = 0;
            cnt -= 2;
            to_book_seat_idx.remove(76);
            to_book_seat_idx.remove(77);
        } else if (seat[76] == 0) {
            btnK10.setBackground(Color.YELLOW);
            btnK11.setBackground(Color.YELLOW);
            seat[76] = 1;
            seat[77] = 1;
            cnt += 2;
            to_book_seat_idx.add(76);
            to_book_seat_idx.add(77);
        }
    }//GEN-LAST:event_btnK11ActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        try {
            Global.seat_no = "";
            for (int i = 0; i < seat.length; i++) {
                if (seat[i] == 1) {
                    Global.seat_no += id[i] + " ";
//                    API.bookSeat(Global.customer_email, seat_id);
//                    confirm();
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        if (cnt == 0) {
            JOptionPane.showMessageDialog(this, "Please Select Your Seat !");
        } else {
            JOptionPane.showMessageDialog(this, "You Have Selected " + cnt + " Seat(s)");
            Global.cnt_seat = String.valueOf(cnt);
            confirm();
            TicketClass1 tc1 = new TicketClass1();
            tc1.setVisible(true);
            tc1.pack();
            tc1.setLocationRelativeTo(null);
            tc1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
        }
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        Global.movie_idx=-Global.remove_movie_idx;
        System.out.println(Global.movie_idx);
        Global.remove_movie_idx=0;
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
            java.util.logging.Logger.getLogger(MovieSeat1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MovieSeat1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MovieSeat1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MovieSeat1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new MovieSeat1().setVisible(true);
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
    private javax.swing.JButton btnAvailable;
    private javax.swing.JButton btnB01;
    private javax.swing.JButton btnB03;
    private javax.swing.JButton btnB05;
    private javax.swing.JButton btnB07;
    private javax.swing.JButton btnB09;
    private javax.swing.JButton btnB11;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnC01;
    private javax.swing.JButton btnC02;
    private javax.swing.JButton btnC04;
    private javax.swing.JButton btnC05;
    private javax.swing.JButton btnC07;
    private javax.swing.JButton btnC08;
    private javax.swing.JButton btnC10;
    private javax.swing.JButton btnC11;
    private javax.swing.JButton btnD01;
    private javax.swing.JButton btnD03;
    private javax.swing.JButton btnD05;
    private javax.swing.JButton btnD07;
    private javax.swing.JButton btnD09;
    private javax.swing.JButton btnD11;
    private javax.swing.JButton btnE01;
    private javax.swing.JButton btnE02;
    private javax.swing.JButton btnE04;
    private javax.swing.JButton btnE05;
    private javax.swing.JButton btnE07;
    private javax.swing.JButton btnE08;
    private javax.swing.JButton btnE10;
    private javax.swing.JButton btnE11;
    private javax.swing.JButton btnF01;
    private javax.swing.JButton btnF03;
    private javax.swing.JButton btnF05;
    private javax.swing.JButton btnF07;
    private javax.swing.JButton btnF09;
    private javax.swing.JButton btnF11;
    private javax.swing.JButton btnG01;
    private javax.swing.JButton btnG02;
    private javax.swing.JButton btnG04;
    private javax.swing.JButton btnG05;
    private javax.swing.JButton btnG07;
    private javax.swing.JButton btnG08;
    private javax.swing.JButton btnG10;
    private javax.swing.JButton btnG11;
    private javax.swing.JButton btnH01;
    private javax.swing.JButton btnH03;
    private javax.swing.JButton btnH05;
    private javax.swing.JButton btnH07;
    private javax.swing.JButton btnH09;
    private javax.swing.JButton btnH11;
    private javax.swing.JButton btnI01;
    private javax.swing.JButton btnI02;
    private javax.swing.JButton btnI04;
    private javax.swing.JButton btnI05;
    private javax.swing.JButton btnI07;
    private javax.swing.JButton btnI08;
    private javax.swing.JButton btnI10;
    private javax.swing.JButton btnI11;
    private javax.swing.JButton btnJ01;
    private javax.swing.JButton btnJ03;
    private javax.swing.JButton btnJ05;
    private javax.swing.JButton btnJ07;
    private javax.swing.JButton btnJ09;
    private javax.swing.JButton btnJ11;
    private javax.swing.JButton btnK01;
    private javax.swing.JButton btnK02;
    private javax.swing.JButton btnK04;
    private javax.swing.JButton btnK05;
    private javax.swing.JButton btnK07;
    private javax.swing.JButton btnK08;
    private javax.swing.JButton btnK10;
    private javax.swing.JButton btnK11;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnSelected;
    private javax.swing.JButton btnTwin1;
    private javax.swing.JButton btnTwin2;
    private javax.swing.JButton btnUnavailable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
