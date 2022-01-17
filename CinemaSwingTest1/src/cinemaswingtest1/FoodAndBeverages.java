
package cinemaswingtest1;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FoodAndBeverages extends javax.swing.JFrame {
    
    double popcornPriceS = 5.00;
    double popcornPriceM = 7.00;
    double popcornPriceL = 9.00;
    double nachosPrice = 5.50;
    double hotdogPrice = 6.00; 
    double sandwichPrice = 8.00;
    double chickenPrice = 10.00;
    double nuggetsPrice = 9.00;
    double FriesPrice = 5.00;
    double coffeePrice = 5.80;
    double icedteaPrice = 4.00;
    double fruitjuicePrice = 7.00;
    double softdrinkPrice = 4.20;
    double mineralwaterPrice = 3.00;
    double cakePrice = 8.00;
    double chocbarPrice = 5.00;
    double browniePrice = 6.30;
    double cupcakePrice = 4.00;
    double candyPrice = 3.00;
    double totalPrice;
    
    double[] itemcost = new double[19];
    
    public FoodAndBeverages() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        label4 = new java.awt.Label();
        jPanel3 = new javax.swing.JPanel();
        label2 = new java.awt.Label();
        jChkCoffee = new javax.swing.JCheckBox();
        jChkIcedTea = new javax.swing.JCheckBox();
        jChkFruitJuice = new javax.swing.JCheckBox();
        jChkSoftDrink = new javax.swing.JCheckBox();
        jChkMineralWater = new javax.swing.JCheckBox();
        jSpinner9 = new javax.swing.JSpinner();
        jSpinner10 = new javax.swing.JSpinner();
        jSpinner11 = new javax.swing.JSpinner();
        jSpinner12 = new javax.swing.JSpinner();
        jSpinner13 = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        label3 = new java.awt.Label();
        jChkCake = new javax.swing.JCheckBox();
        jChkChocolate = new javax.swing.JCheckBox();
        jChkBrownie = new javax.swing.JCheckBox();
        jChkCupcake = new javax.swing.JCheckBox();
        jChkCandy = new javax.swing.JCheckBox();
        jSpinner14 = new javax.swing.JSpinner();
        jSpinner15 = new javax.swing.JSpinner();
        jSpinner16 = new javax.swing.JSpinner();
        jSpinner17 = new javax.swing.JSpinner();
        jSpinner18 = new javax.swing.JSpinner();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jChkPopcorn = new javax.swing.JCheckBox();
        jComboBox1 = new javax.swing.JComboBox<>();
        jSpinner1 = new javax.swing.JSpinner();
        jChkChicken = new javax.swing.JCheckBox();
        jChkHotdog = new javax.swing.JCheckBox();
        jChkNuggets = new javax.swing.JCheckBox();
        jChkNachos = new javax.swing.JCheckBox();
        jChkSandwich = new javax.swing.JCheckBox();
        jChkFries = new javax.swing.JCheckBox();
        jSpinner2 = new javax.swing.JSpinner();
        jSpinner3 = new javax.swing.JSpinner();
        jSpinner4 = new javax.swing.JSpinner();
        jSpinner5 = new javax.swing.JSpinner();
        jSpinner6 = new javax.swing.JSpinner();
        jSpinner7 = new javax.swing.JSpinner();
        label1 = new java.awt.Label();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLblTotal = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        label5 = new java.awt.Label();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 4));

        label4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        label4.setForeground(new java.awt.Color(255, 255, 51));
        label4.setText("Cinema Food And Beverages");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 4));

        label2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        label2.setForeground(new java.awt.Color(255, 255, 51));
        label2.setText("Beverages");

        jChkCoffee.setBackground(new java.awt.Color(0, 0, 0));
        jChkCoffee.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jChkCoffee.setForeground(new java.awt.Color(255, 255, 255));
        jChkCoffee.setText("Coffee");
        jChkCoffee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChkCoffeeActionPerformed(evt);
            }
        });

        jChkIcedTea.setBackground(new java.awt.Color(0, 0, 0));
        jChkIcedTea.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jChkIcedTea.setForeground(new java.awt.Color(255, 255, 255));
        jChkIcedTea.setText("Iced Tea");
        jChkIcedTea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChkIcedTeaActionPerformed(evt);
            }
        });

        jChkFruitJuice.setBackground(new java.awt.Color(0, 0, 0));
        jChkFruitJuice.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jChkFruitJuice.setForeground(new java.awt.Color(255, 255, 255));
        jChkFruitJuice.setText("Fruit Juice");
        jChkFruitJuice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChkFruitJuiceActionPerformed(evt);
            }
        });

        jChkSoftDrink.setBackground(new java.awt.Color(0, 0, 0));
        jChkSoftDrink.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jChkSoftDrink.setForeground(new java.awt.Color(255, 255, 255));
        jChkSoftDrink.setText("Soft Drink");
        jChkSoftDrink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChkSoftDrinkActionPerformed(evt);
            }
        });

        jChkMineralWater.setBackground(new java.awt.Color(0, 0, 0));
        jChkMineralWater.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jChkMineralWater.setForeground(new java.awt.Color(255, 255, 255));
        jChkMineralWater.setText("Mineral Water");
        jChkMineralWater.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChkMineralWaterActionPerformed(evt);
            }
        });

        jSpinner9.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        jSpinner9.setEnabled(false);

        jSpinner10.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        jSpinner10.setEnabled(false);

        jSpinner11.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        jSpinner11.setEnabled(false);

        jSpinner12.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        jSpinner12.setEnabled(false);

        jSpinner13.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        jSpinner13.setEnabled(false);

        jLabel8.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("RM5.80");

        jLabel9.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("RM4.00");

        jLabel10.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("RM7.00");

        jLabel11.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("(Coke/Sprite/Pepsi)");

        jLabel12.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("RM4.00");

        jLabel13.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("RM3.00");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jChkCoffee, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jChkIcedTea, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jChkFruitJuice, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jChkSoftDrink)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSpinner12, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinner10, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinner9, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinner11, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jChkMineralWater)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSpinner13, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(72, 72, 72))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jChkCoffee)
                    .addComponent(jSpinner11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jChkIcedTea)
                    .addComponent(jSpinner9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jChkFruitJuice)
                    .addComponent(jSpinner10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jChkSoftDrink)
                    .addComponent(jSpinner12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jChkMineralWater)
                    .addComponent(jSpinner13, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 350, -1));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 4));

        label3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        label3.setForeground(new java.awt.Color(255, 255, 51));
        label3.setText("Sides");

        jChkCake.setBackground(new java.awt.Color(0, 0, 0));
        jChkCake.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jChkCake.setForeground(new java.awt.Color(255, 255, 255));
        jChkCake.setText("Cake");
        jChkCake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChkCakeActionPerformed(evt);
            }
        });

        jChkChocolate.setBackground(new java.awt.Color(0, 0, 0));
        jChkChocolate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jChkChocolate.setForeground(new java.awt.Color(255, 255, 255));
        jChkChocolate.setText("Chocolate Bar");
        jChkChocolate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChkChocolateActionPerformed(evt);
            }
        });

        jChkBrownie.setBackground(new java.awt.Color(0, 0, 0));
        jChkBrownie.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jChkBrownie.setForeground(new java.awt.Color(255, 255, 255));
        jChkBrownie.setText("Brownie");
        jChkBrownie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChkBrownieActionPerformed(evt);
            }
        });

        jChkCupcake.setBackground(new java.awt.Color(0, 0, 0));
        jChkCupcake.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jChkCupcake.setForeground(new java.awt.Color(255, 255, 255));
        jChkCupcake.setText("Cupcake");
        jChkCupcake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChkCupcakeActionPerformed(evt);
            }
        });

        jChkCandy.setBackground(new java.awt.Color(0, 0, 0));
        jChkCandy.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jChkCandy.setForeground(new java.awt.Color(255, 255, 255));
        jChkCandy.setText("Candy");
        jChkCandy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChkCandyActionPerformed(evt);
            }
        });

        jSpinner14.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        jSpinner14.setEnabled(false);

        jSpinner15.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        jSpinner15.setEnabled(false);

        jSpinner16.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        jSpinner16.setEnabled(false);

        jSpinner17.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        jSpinner17.setEnabled(false);

        jSpinner18.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        jSpinner18.setEnabled(false);

        jLabel14.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("RM5.00");

        jLabel15.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("RM8.00");

        jLabel16.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("RM6.00");

        jLabel17.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("RM4.00");

        jLabel18.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("RM3.00");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jChkCupcake, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSpinner17, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jChkBrownie, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSpinner16, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jChkCake, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSpinner14, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jChkCandy, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSpinner18, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jChkChocolate, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                                .addComponent(jSpinner15, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(66, 66, 66)))
                        .addContainerGap())))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jChkCake)
                    .addComponent(jSpinner14, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jChkChocolate)
                    .addComponent(jSpinner15, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jChkBrownie)
                    .addComponent(jSpinner16, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jChkCupcake)
                    .addComponent(jSpinner17, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jChkCandy)
                    .addComponent(jSpinner18, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 100, -1, 370));

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 4));

        jChkPopcorn.setBackground(new java.awt.Color(0, 0, 0));
        jChkPopcorn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jChkPopcorn.setForeground(new java.awt.Color(255, 255, 255));
        jChkPopcorn.setText("Popcorn");
        jChkPopcorn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChkPopcornActionPerformed(evt);
            }
        });

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Small", "Medium", "Large" }));
        jComboBox1.setEnabled(false);

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        jSpinner1.setEnabled(false);

        jChkChicken.setBackground(new java.awt.Color(0, 0, 0));
        jChkChicken.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jChkChicken.setForeground(new java.awt.Color(255, 255, 255));
        jChkChicken.setText("Chicken Tenders");
        jChkChicken.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChkChickenActionPerformed(evt);
            }
        });

        jChkHotdog.setBackground(new java.awt.Color(0, 0, 0));
        jChkHotdog.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jChkHotdog.setForeground(new java.awt.Color(255, 255, 255));
        jChkHotdog.setText("Hotdog");
        jChkHotdog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChkHotdogActionPerformed(evt);
            }
        });

        jChkNuggets.setBackground(new java.awt.Color(0, 0, 0));
        jChkNuggets.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jChkNuggets.setForeground(new java.awt.Color(255, 255, 255));
        jChkNuggets.setText("Nuggets (10 pc)");
        jChkNuggets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChkNuggetsActionPerformed(evt);
            }
        });

        jChkNachos.setBackground(new java.awt.Color(0, 0, 0));
        jChkNachos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jChkNachos.setForeground(new java.awt.Color(255, 255, 255));
        jChkNachos.setText("Nachos");
        jChkNachos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChkNachosActionPerformed(evt);
            }
        });

        jChkSandwich.setBackground(new java.awt.Color(0, 0, 0));
        jChkSandwich.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jChkSandwich.setForeground(new java.awt.Color(255, 255, 255));
        jChkSandwich.setText("Sandwich");
        jChkSandwich.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChkSandwichActionPerformed(evt);
            }
        });

        jChkFries.setBackground(new java.awt.Color(0, 0, 0));
        jChkFries.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jChkFries.setForeground(new java.awt.Color(255, 255, 255));
        jChkFries.setText("Fries");
        jChkFries.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChkFriesActionPerformed(evt);
            }
        });

        jSpinner2.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        jSpinner2.setEnabled(false);

        jSpinner3.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        jSpinner3.setEnabled(false);

        jSpinner4.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        jSpinner4.setEnabled(false);

        jSpinner5.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        jSpinner5.setEnabled(false);

        jSpinner6.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        jSpinner6.setEnabled(false);

        jSpinner7.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        jSpinner7.setEnabled(false);

        label1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 51));
        label1.setText("Food");

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("5.50");

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("RM5.00 / RM7.00 / RM9.00");

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("RM6.00");

        jLabel4.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("RM8.00");

        jLabel5.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("RM9.00");

        jLabel6.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("RM10.00");

        jLabel7.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("RM5.00");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jChkNachos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jChkPopcorn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jChkHotdog)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jChkSandwich)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jChkChicken)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSpinner5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jChkNuggets)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSpinner6, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jChkFries)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSpinner7, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jChkPopcorn)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jChkNachos)
                    .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jChkHotdog)
                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jChkSandwich)
                    .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jChkChicken)
                    .addComponent(jSpinner5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jChkNuggets)
                    .addComponent(jSpinner6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jChkFries)
                    .addComponent(jSpinner7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110))
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, 500));

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 4));

        jLblTotal.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("TOTAL F&B");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextField1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextField1.setEnabled(false);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jLblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(jLabel19)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel19)
                    .addComponent(jButton1))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLblTotal))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 480, -1, -1));

        label5.setBackground(new java.awt.Color(0, 0, 0));
        label5.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        label5.setForeground(new java.awt.Color(204, 204, 204));
        label5.setText("*All prices are inclusive of tax");
        getContentPane().add(label5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 600, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 255, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("NEXT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(967, 605, 70, 30));

        jButton4.setBackground(new java.awt.Color(255, 255, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton4.setText("BACK");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 605, 70, 30));

        jLabel20.setText("jLabel20");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 640));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinemaswingtest1/image/mainmenu/dark grey (2).jpg"))); // NOI18N
        jLabel21.setText("jLabel21");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jChkChocolateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChkChocolateActionPerformed

        if(jChkChocolate.isSelected()){
            jSpinner15.setEnabled(true);
        }
        else
            jSpinner15.setEnabled(false);
    }//GEN-LAST:event_jChkChocolateActionPerformed

    private void jChkBrownieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChkBrownieActionPerformed
        // TODO add your handling code here:
        if(jChkBrownie.isSelected()){
            jSpinner16.setEnabled(true);
        }
        else
            jSpinner16.setEnabled(false);
    }//GEN-LAST:event_jChkBrownieActionPerformed

    private void jChkIcedTeaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChkIcedTeaActionPerformed

        if(jChkIcedTea.isSelected()){
            jSpinner9.setEnabled(true);
        }
        else
            jSpinner9.setEnabled(false);
    }//GEN-LAST:event_jChkIcedTeaActionPerformed

    private void jChkCoffeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChkCoffeeActionPerformed

        if(jChkCoffee.isSelected()){
            jSpinner11.setEnabled(true);
        }
        else
            jSpinner11.setEnabled(false);
    }//GEN-LAST:event_jChkCoffeeActionPerformed

    private void jChkFruitJuiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChkFruitJuiceActionPerformed

        if(jChkFruitJuice.isSelected()){
            jSpinner10.setEnabled(true);
        }
        else
            jSpinner10.setEnabled(false);
    }//GEN-LAST:event_jChkFruitJuiceActionPerformed

    private void jChkSoftDrinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChkSoftDrinkActionPerformed

        if(jChkSoftDrink.isSelected()){
            jSpinner12.setEnabled(true);
        }
        else
            jSpinner12.setEnabled(false);
    }//GEN-LAST:event_jChkSoftDrinkActionPerformed

    private void jChkMineralWaterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChkMineralWaterActionPerformed

        if(jChkMineralWater.isSelected()){
            jSpinner13.setEnabled(true);
        }
        else
            jSpinner13.setEnabled(false);
    }//GEN-LAST:event_jChkMineralWaterActionPerformed

    private void jChkCakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChkCakeActionPerformed

        if(jChkCake.isSelected()){
            jSpinner14.setEnabled(true);
        }
        else
            jSpinner14.setEnabled(false);
    }//GEN-LAST:event_jChkCakeActionPerformed

    private void jChkCupcakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChkCupcakeActionPerformed

        if(jChkCupcake.isSelected()){
            jSpinner17.setEnabled(true);
        }
        else
            jSpinner17.setEnabled(false);
    }//GEN-LAST:event_jChkCupcakeActionPerformed

    private void jChkCandyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChkCandyActionPerformed

        if(jChkCandy.isSelected()){
            jSpinner18.setEnabled(true);
        }
        else
            jSpinner18.setEnabled(false);
    }//GEN-LAST:event_jChkCandyActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if(jComboBox1.getSelectedItem().equals("Small"))    //popcorn
            itemcost[0] =  5.0* Double.parseDouble(String.valueOf(jSpinner1.getValue()));
        else if(jComboBox1.getSelectedItem().equals("Medium"))
            itemcost[0] =  7.0* Double.parseDouble(String.valueOf(jSpinner1.getValue()));
        else if(jComboBox1.getSelectedItem().equals("Large"))
            itemcost[0] =  9.0* Double.parseDouble(String.valueOf(jSpinner1.getValue()));        

        itemcost[1] =  5.5*Double.parseDouble(String.valueOf(jSpinner4.getValue()));    //nachos
        itemcost[2] =  6.0*Double.parseDouble(String.valueOf(jSpinner2.getValue()));      //hotdog
        itemcost[3] =  8.0*Double.parseDouble(String.valueOf(jSpinner3.getValue()));      //sandwich
        itemcost[4] =  10.0*Double.parseDouble(String.valueOf(jSpinner5.getValue()));     //chicken tenders
        itemcost[5] =  9.0*Double.parseDouble(String.valueOf(jSpinner6.getValue()));      //nuggets
        itemcost[6] =  5.5*Double.parseDouble(String.valueOf(jSpinner7.getValue()));    //?(fries)
        itemcost[7] =  5.8*Double.parseDouble(String.valueOf(jSpinner11.getValue()));   //coffee
        itemcost[8] =  4.0*Double.parseDouble(String.valueOf(jSpinner9.getValue()));      //iced tea
        itemcost[9] =  7.0*Double.parseDouble(String.valueOf(jSpinner10.getValue()));     //fruit juice
        itemcost[10] =  4.0*Double.parseDouble(String.valueOf(jSpinner12.getValue()));    //soft drink
        itemcost[11] =  3.0*Double.parseDouble(String.valueOf(jSpinner13.getValue()));    //?(mineral water)
        itemcost[12] =  8.0*Double.parseDouble(String.valueOf(jSpinner14.getValue()));    //cake
        itemcost[13] =  5.0*Double.parseDouble(String.valueOf(jSpinner15.getValue()));    //choc bar
        itemcost[14] =  6.0*Double.parseDouble(String.valueOf(jSpinner16.getValue()));    //brownie    
        itemcost[15] =  4.0*Double.parseDouble(String.valueOf(jSpinner17.getValue()));    //cupcake
        itemcost[16] =  3.0*Double.parseDouble(String.valueOf(jSpinner18.getValue()));    //candy

            
        totalPrice = itemcost[0] + itemcost[1] + itemcost[2] + itemcost[3] + 
                itemcost[4] + itemcost[5] + itemcost[6] + itemcost[7] + itemcost[8] + 
                itemcost[9] + itemcost[10] + itemcost[11] + itemcost[12] + itemcost[13] + 
                itemcost[14] + itemcost[15] + itemcost[16] ;
        Global.fnb_price = String.valueOf(totalPrice);
        System.out.println(Global.fnb_price);
        
        jTextField1.setText(Double.toString(totalPrice));
        
        String totalFB = String.format("RM %.2f", totalPrice);
        
        jLabel19.setText(totalFB);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jChkFriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChkFriesActionPerformed

        if(jChkFries.isSelected()){
            jSpinner7.setEnabled(true);
        }
        else
        jSpinner7.setEnabled(false);
    }//GEN-LAST:event_jChkFriesActionPerformed

    private void jChkSandwichActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChkSandwichActionPerformed

        if(jChkSandwich.isSelected()){
            jSpinner3.setEnabled(true);
        }
        else
        jSpinner3.setEnabled(false);
    }//GEN-LAST:event_jChkSandwichActionPerformed

    private void jChkNachosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChkNachosActionPerformed

        if(jChkNachos.isSelected()){
            jSpinner4.setEnabled(true);
        }
        else{
            jSpinner4.setEnabled(false);
        }
    }//GEN-LAST:event_jChkNachosActionPerformed

    private void jChkNuggetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChkNuggetsActionPerformed

        if(jChkNuggets.isSelected()){
            jSpinner6.setEnabled(true);
        }
        else
        jSpinner6.setEnabled(false);
    }//GEN-LAST:event_jChkNuggetsActionPerformed

    private void jChkHotdogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChkHotdogActionPerformed

        if(jChkHotdog.isSelected()){
            jSpinner2.setEnabled(true);
        }
        else
        jSpinner2.setEnabled(false);

    }//GEN-LAST:event_jChkHotdogActionPerformed

    private void jChkChickenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChkChickenActionPerformed

        if(jChkChicken.isSelected()){
            jSpinner5.setEnabled(true);
        }
        else
        jSpinner5.setEnabled(false);
    }//GEN-LAST:event_jChkChickenActionPerformed

    private void jChkPopcornActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChkPopcornActionPerformed

        if(jChkPopcorn.isSelected()){
            jSpinner1.setEnabled(true);
            jComboBox1.setEnabled(true);
        }
        else{
            jSpinner1.setEnabled(false);
            jComboBox1.setEnabled(false);

        }
    }//GEN-LAST:event_jChkPopcornActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (totalPrice!=0)
            JOptionPane.showMessageDialog(this, "Purchase Food And Beverages Successfully !");
            
            CustomerPayment cp = new CustomerPayment();
            cp.setVisible(true);
            cp.pack();
            cp.setLocationRelativeTo(null);
            cp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        TicketClass1 tc = new TicketClass1();
        tc.setVisible(true);
        tc.pack();
        tc.setLocationRelativeTo(null);
        tc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(FoodAndBeverages.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FoodAndBeverages.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FoodAndBeverages.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FoodAndBeverages.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FoodAndBeverages().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jChkBrownie;
    private javax.swing.JCheckBox jChkCake;
    private javax.swing.JCheckBox jChkCandy;
    private javax.swing.JCheckBox jChkChicken;
    private javax.swing.JCheckBox jChkChocolate;
    private javax.swing.JCheckBox jChkCoffee;
    private javax.swing.JCheckBox jChkCupcake;
    private javax.swing.JCheckBox jChkFries;
    private javax.swing.JCheckBox jChkFruitJuice;
    private javax.swing.JCheckBox jChkHotdog;
    private javax.swing.JCheckBox jChkIcedTea;
    private javax.swing.JCheckBox jChkMineralWater;
    private javax.swing.JCheckBox jChkNachos;
    private javax.swing.JCheckBox jChkNuggets;
    private javax.swing.JCheckBox jChkPopcorn;
    private javax.swing.JCheckBox jChkSandwich;
    private javax.swing.JCheckBox jChkSoftDrink;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLblTotal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner10;
    private javax.swing.JSpinner jSpinner11;
    private javax.swing.JSpinner jSpinner12;
    private javax.swing.JSpinner jSpinner13;
    private javax.swing.JSpinner jSpinner14;
    private javax.swing.JSpinner jSpinner15;
    private javax.swing.JSpinner jSpinner16;
    private javax.swing.JSpinner jSpinner17;
    private javax.swing.JSpinner jSpinner18;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JSpinner jSpinner4;
    private javax.swing.JSpinner jSpinner5;
    private javax.swing.JSpinner jSpinner6;
    private javax.swing.JSpinner jSpinner7;
    private javax.swing.JSpinner jSpinner9;
    private javax.swing.JTextField jTextField1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    // End of variables declaration//GEN-END:variables
}
