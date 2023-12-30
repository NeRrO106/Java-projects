
package calculatorstiintificac;

import java.awt.event.KeyEvent;

public class CalculatorStiintificCA extends javax.swing.JFrame {

    double firstnum, secondnum, result;
    String operations;
    private Object math;
    
    public CalculatorStiintificCA() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jTxtDisplay = new javax.swing.JTextField();
        jBtnBackSpace = new javax.swing.JButton();
        jBtnClear = new javax.swing.JButton();
        jBtnSqrt = new javax.swing.JButton();
        jBtnPlus = new javax.swing.JButton();
        jBtn7 = new javax.swing.JButton();
        jBtn8 = new javax.swing.JButton();
        jBtn9 = new javax.swing.JButton();
        jBtnMinus = new javax.swing.JButton();
        jBtn4 = new javax.swing.JButton();
        jBtn5 = new javax.swing.JButton();
        jBtn6 = new javax.swing.JButton();
        jBtnTimes = new javax.swing.JButton();
        jBtn1 = new javax.swing.JButton();
        jBtn2 = new javax.swing.JButton();
        jBtn3 = new javax.swing.JButton();
        jBtnDiv = new javax.swing.JButton();
        jBtn0 = new javax.swing.JButton();
        jBtnDot = new javax.swing.JButton();
        jBtnPlusMinus = new javax.swing.JButton();
        jBtnEqual = new javax.swing.JButton();
        jBtnLog = new javax.swing.JButton();
        jBtnPi = new javax.swing.JButton();
        jBtnXX = new javax.swing.JButton();
        jBtnX2 = new javax.swing.JButton();
        jBtnX3 = new javax.swing.JButton();
        jBtnBin = new javax.swing.JButton();
        jBtnHex = new javax.swing.JButton();
        jBtnOct = new javax.swing.JButton();
        jBtnRound = new javax.swing.JButton();
        jBtnCbr = new javax.swing.JButton();
        jBtnTan = new javax.swing.JButton();
        jBtnTanh = new javax.swing.JButton();
        jBtnCos = new javax.swing.JButton();
        jBtnSin = new javax.swing.JButton();
        jBtnSinh = new javax.swing.JButton();
        jBtnCosh = new javax.swing.JButton();
        jBtnLn = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jBtnMod = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        JOptionPane = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(275, 375));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jTxtDisplay.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTxtDisplay.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTxtDisplay.setPreferredSize(new java.awt.Dimension(260, 50));
        jTxtDisplay.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTxtDisplayKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtDisplayKeyTyped(evt);
            }
        });

        jBtnBackSpace.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtnBackSpace.setText("←");
        jBtnBackSpace.setPreferredSize(new java.awt.Dimension(50, 50));
        jBtnBackSpace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBackSpaceActionPerformed(evt);
            }
        });

        jBtnClear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtnClear.setText("C");
        jBtnClear.setPreferredSize(new java.awt.Dimension(50, 50));
        jBtnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnClearActionPerformed(evt);
            }
        });

        jBtnSqrt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtnSqrt.setText("√");
        jBtnSqrt.setPreferredSize(new java.awt.Dimension(50, 50));
        jBtnSqrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSqrtActionPerformed(evt);
            }
        });

        jBtnPlus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtnPlus.setText("+");
        jBtnPlus.setPreferredSize(new java.awt.Dimension(50, 50));
        jBtnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPlusActionPerformed(evt);
            }
        });

        jBtn7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtn7.setText("7");
        jBtn7.setPreferredSize(new java.awt.Dimension(50, 50));
        jBtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn7ActionPerformed(evt);
            }
        });

        jBtn8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtn8.setText("8");
        jBtn8.setPreferredSize(new java.awt.Dimension(50, 50));
        jBtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn8ActionPerformed(evt);
            }
        });

        jBtn9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtn9.setText("9");
        jBtn9.setPreferredSize(new java.awt.Dimension(50, 50));
        jBtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn9ActionPerformed(evt);
            }
        });

        jBtnMinus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtnMinus.setText("-");
        jBtnMinus.setPreferredSize(new java.awt.Dimension(50, 50));
        jBtnMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnMinusActionPerformed(evt);
            }
        });

        jBtn4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtn4.setText("4");
        jBtn4.setPreferredSize(new java.awt.Dimension(50, 50));
        jBtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn4ActionPerformed(evt);
            }
        });

        jBtn5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtn5.setText("5");
        jBtn5.setPreferredSize(new java.awt.Dimension(50, 50));
        jBtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn5ActionPerformed(evt);
            }
        });

        jBtn6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtn6.setText("6");
        jBtn6.setPreferredSize(new java.awt.Dimension(50, 50));
        jBtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn6ActionPerformed(evt);
            }
        });

        jBtnTimes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtnTimes.setText("*");
        jBtnTimes.setPreferredSize(new java.awt.Dimension(50, 50));
        jBtnTimes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnTimesActionPerformed(evt);
            }
        });

        jBtn1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtn1.setText("1");
        jBtn1.setPreferredSize(new java.awt.Dimension(50, 50));
        jBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn1ActionPerformed(evt);
            }
        });

        jBtn2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtn2.setText("2");
        jBtn2.setPreferredSize(new java.awt.Dimension(50, 50));
        jBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn2ActionPerformed(evt);
            }
        });

        jBtn3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtn3.setText("3");
        jBtn3.setPreferredSize(new java.awt.Dimension(50, 50));
        jBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn3ActionPerformed(evt);
            }
        });

        jBtnDiv.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtnDiv.setText("/");
        jBtnDiv.setPreferredSize(new java.awt.Dimension(50, 50));
        jBtnDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDivActionPerformed(evt);
            }
        });

        jBtn0.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtn0.setText("0");
        jBtn0.setPreferredSize(new java.awt.Dimension(50, 50));
        jBtn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn0ActionPerformed(evt);
            }
        });

        jBtnDot.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtnDot.setText(".");
        jBtnDot.setPreferredSize(new java.awt.Dimension(50, 50));
        jBtnDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDotActionPerformed(evt);
            }
        });

        jBtnPlusMinus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtnPlusMinus.setText("±");
        jBtnPlusMinus.setPreferredSize(new java.awt.Dimension(50, 50));
        jBtnPlusMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPlusMinusActionPerformed(evt);
            }
        });

        jBtnEqual.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtnEqual.setText("=");
        jBtnEqual.setPreferredSize(new java.awt.Dimension(50, 50));
        jBtnEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEqualActionPerformed(evt);
            }
        });

        jBtnLog.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jBtnLog.setText("Log");
        jBtnLog.setPreferredSize(new java.awt.Dimension(50, 50));
        jBtnLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLogActionPerformed(evt);
            }
        });

        jBtnPi.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jBtnPi.setText("pi");
        jBtnPi.setPreferredSize(new java.awt.Dimension(50, 50));
        jBtnPi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPiActionPerformed(evt);
            }
        });

        jBtnXX.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jBtnXX.setText("x^x");
        jBtnXX.setPreferredSize(new java.awt.Dimension(50, 50));
        jBtnXX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnXXActionPerformed(evt);
            }
        });

        jBtnX2.setFont(new java.awt.Font("Tahoma", 1, 6)); // NOI18N
        jBtnX2.setText("x^2");
        jBtnX2.setPreferredSize(new java.awt.Dimension(50, 50));
        jBtnX2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnX2ActionPerformed(evt);
            }
        });

        jBtnX3.setFont(new java.awt.Font("Tahoma", 1, 6)); // NOI18N
        jBtnX3.setText("x^3");
        jBtnX3.setPreferredSize(new java.awt.Dimension(50, 50));
        jBtnX3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnX3ActionPerformed(evt);
            }
        });

        jBtnBin.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jBtnBin.setText("BIN");
        jBtnBin.setPreferredSize(new java.awt.Dimension(50, 50));
        jBtnBin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBinActionPerformed(evt);
            }
        });

        jBtnHex.setFont(new java.awt.Font("Tahoma", 1, 6)); // NOI18N
        jBtnHex.setText("HEX");
        jBtnHex.setPreferredSize(new java.awt.Dimension(50, 50));
        jBtnHex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnHexActionPerformed(evt);
            }
        });

        jBtnOct.setFont(new java.awt.Font("Tahoma", 1, 6)); // NOI18N
        jBtnOct.setText("OCT");
        jBtnOct.setPreferredSize(new java.awt.Dimension(50, 50));
        jBtnOct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnOctActionPerformed(evt);
            }
        });

        jBtnRound.setFont(new java.awt.Font("Tahoma", 1, 5)); // NOI18N
        jBtnRound.setText("Round");
        jBtnRound.setPreferredSize(new java.awt.Dimension(50, 50));
        jBtnRound.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRoundActionPerformed(evt);
            }
        });

        jBtnCbr.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jBtnCbr.setText("Cbr");
        jBtnCbr.setPreferredSize(new java.awt.Dimension(50, 50));
        jBtnCbr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCbrActionPerformed(evt);
            }
        });

        jBtnTan.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jBtnTan.setText("Tan");
        jBtnTan.setPreferredSize(new java.awt.Dimension(50, 50));
        jBtnTan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnTanActionPerformed(evt);
            }
        });

        jBtnTanh.setFont(new java.awt.Font("Tahoma", 1, 6)); // NOI18N
        jBtnTanh.setText("Tanh");
        jBtnTanh.setPreferredSize(new java.awt.Dimension(50, 50));
        jBtnTanh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnTanhActionPerformed(evt);
            }
        });

        jBtnCos.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jBtnCos.setText("Cos");
        jBtnCos.setPreferredSize(new java.awt.Dimension(50, 50));
        jBtnCos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCosActionPerformed(evt);
            }
        });

        jBtnSin.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBtnSin.setText("Sin");
        jBtnSin.setPreferredSize(new java.awt.Dimension(50, 50));
        jBtnSin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSinActionPerformed(evt);
            }
        });

        jBtnSinh.setFont(new java.awt.Font("Tahoma", 1, 6)); // NOI18N
        jBtnSinh.setText("Sinh");
        jBtnSinh.setPreferredSize(new java.awt.Dimension(50, 50));
        jBtnSinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSinhActionPerformed(evt);
            }
        });

        jBtnCosh.setFont(new java.awt.Font("Tahoma", 1, 6)); // NOI18N
        jBtnCosh.setText("Cosh");
        jBtnCosh.setPreferredSize(new java.awt.Dimension(50, 50));
        jBtnCosh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCoshActionPerformed(evt);
            }
        });

        jBtnLn.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBtnLn.setText("Ln");
        jBtnLn.setPreferredSize(new java.awt.Dimension(50, 50));
        jBtnLn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLnActionPerformed(evt);
            }
        });

        jButton39.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton39.setPreferredSize(new java.awt.Dimension(50, 50));

        jBtnMod.setFont(new java.awt.Font("Tahoma", 1, 6)); // NOI18N
        jBtnMod.setText("MOD");
        jBtnMod.setPreferredSize(new java.awt.Dimension(50, 50));
        jBtnMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnModActionPerformed(evt);
            }
        });

        jButton40.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton40.setPreferredSize(new java.awt.Dimension(50, 50));

        JOptionPane.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JOptionPane.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Distance", "Time", "Speed" }));
        JOptionPane.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JOptionPaneActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jButton1.setText("Convert");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jMenu3.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Andrei\\Downloads\\standard.png")); // NOI18N
        jMenuItem1.setText("Standard");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Andrei\\Downloads\\standard.png")); // NOI18N
        jMenuItem2.setText("Stiintific");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Andrei\\Downloads\\standard.png")); // NOI18N
        jMenuItem3.setText("Convertor");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTxtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBtn0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jBtnDot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jBtn5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBtn7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jBtn8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBtnBackSpace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jBtnClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBtnSqrt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBtnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBtn9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBtnMinus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBtn6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBtnTimes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBtnDiv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jBtnPlusMinus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBtnEqual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBtnX3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jBtnBin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBtnX2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jBtnCbr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBtnXX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jBtnTan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBtnPi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jBtnCos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBtnLog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jBtnSin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBtnSinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBtnMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBtnCosh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBtnLn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBtnTanh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jBtnRound, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jBtnHex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBtnOct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(JOptionPane, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(8, 8, 8)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(12, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTxtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JOptionPane, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBtnBackSpace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnSqrt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBtn7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtn8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtn9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnMinus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtn5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtn6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnTimes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnDiv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBtn0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnDot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnPlusMinus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnEqual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBtnX3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnBin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnHex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jBtnOct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jBtnXX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBtnTan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBtnTanh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jBtnX2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBtnCbr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBtnRound, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jBtnLog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBtnSin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBtnSinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jBtnMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jBtnPi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jBtnCos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jBtnCosh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jBtnLn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(51, 51, 51)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.setResizable(true); 
        this.setSize(300,435); 
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        this.setResizable(true); 
        this.setSize(300,435); 
        jTxtDisplay.setSize(260,50);
    }//GEN-LAST:event_formWindowActivated

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        this.setResizable(true); 
        this.setSize(600,435); 
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        this.setResizable(true); 
        this.setSize(900,435); 
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jBtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn8ActionPerformed
        String iNum=jTxtDisplay.getText()+jBtn8.getText(); 
        jTxtDisplay.setText(iNum);
    }//GEN-LAST:event_jBtn8ActionPerformed

    private void jBtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn6ActionPerformed
        String iNum=jTxtDisplay.getText()+jBtn6.getText(); 
        jTxtDisplay.setText(iNum);
    }//GEN-LAST:event_jBtn6ActionPerformed

    private void jBtnTanhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnTanhActionPerformed
        double ops=Double.parseDouble(jTxtDisplay.getText()); 
        ops=Math.tanh(ops);
        jTxtDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jBtnTanhActionPerformed

    private void jBtnCosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCosActionPerformed
        double ops=Double.parseDouble(jTxtDisplay.getText()); 
        ops=Math.cos(ops);
        jTxtDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jBtnCosActionPerformed

    private void jBtnSinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSinhActionPerformed
        double ops=Double.parseDouble(jTxtDisplay.getText()); 
        ops=Math.sinh(ops);
        jTxtDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jBtnSinhActionPerformed

    private void jBtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn7ActionPerformed
        String iNum=jTxtDisplay.getText()+jBtn7.getText(); 
        jTxtDisplay.setText(iNum);
    }//GEN-LAST:event_jBtn7ActionPerformed

    private void jBtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn9ActionPerformed
        String iNum=jTxtDisplay.getText()+jBtn9.getText(); 
        jTxtDisplay.setText(iNum);
    }//GEN-LAST:event_jBtn9ActionPerformed

    private void jBtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn4ActionPerformed
        String iNum=jTxtDisplay.getText()+jBtn4.getText(); 
        jTxtDisplay.setText(iNum);
    }//GEN-LAST:event_jBtn4ActionPerformed

    private void jBtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn5ActionPerformed
        String iNum=jTxtDisplay.getText()+jBtn5.getText(); 
        jTxtDisplay.setText(iNum);
    }//GEN-LAST:event_jBtn5ActionPerformed

    private void jBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn1ActionPerformed
        String iNum=jTxtDisplay.getText()+jBtn1.getText(); 
        jTxtDisplay.setText(iNum);
    }//GEN-LAST:event_jBtn1ActionPerformed

    private void jBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn2ActionPerformed
        String iNum=jTxtDisplay.getText()+jBtn2.getText(); 
        jTxtDisplay.setText(iNum);
    }//GEN-LAST:event_jBtn2ActionPerformed

    private void jBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn3ActionPerformed
        String iNum=jTxtDisplay.getText()+jBtn3.getText(); 
        jTxtDisplay.setText(iNum);
    }//GEN-LAST:event_jBtn3ActionPerformed

    private void jBtn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn0ActionPerformed
        String iNum=jTxtDisplay.getText()+jBtn0.getText(); 
        jTxtDisplay.setText(iNum);
    }//GEN-LAST:event_jBtn0ActionPerformed

    private void jBtnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnClearActionPerformed
        jTxtDisplay.setText("");
    }//GEN-LAST:event_jBtnClearActionPerformed

    private void jBtnBackSpaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBackSpaceActionPerformed
        String bsp=null; 
        if (jTxtDisplay.getText().length()>0) { 
            StringBuilder strB = new StringBuilder(jTxtDisplay.getText()); 
            strB.deleteCharAt(jTxtDisplay.getText().length()-1); 
            bsp=strB.toString(); 
            jTxtDisplay.setText(bsp); 
        }
    }//GEN-LAST:event_jBtnBackSpaceActionPerformed

    private void jBtnDotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDotActionPerformed
        if (!jTxtDisplay.getText().contains(".")){ 
            jTxtDisplay.setText(jTxtDisplay.getText()+jBtnDot.getText()); 
        }
    }//GEN-LAST:event_jBtnDotActionPerformed

    private void jBtnPlusMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPlusMinusActionPerformed
        double ops=Double.parseDouble(jTxtDisplay.getText()); 
        ops=ops*(-1); 
        jTxtDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jBtnPlusMinusActionPerformed

    private void jBtnSqrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSqrtActionPerformed
        double ops=Double.parseDouble(jTxtDisplay.getText()); 
        ops=Math.sqrt(ops); 
        jTxtDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jBtnSqrtActionPerformed

    private void jBtnLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLogActionPerformed
        double ops=Double.parseDouble(jTxtDisplay.getText()); 
        ops=Math.log10(ops);
        jTxtDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jBtnLogActionPerformed

    private void jBtnLnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLnActionPerformed
        double ops=Double.parseDouble(jTxtDisplay.getText()); 
        ops=Math.log(ops);
        jTxtDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jBtnLnActionPerformed

    private void jBtnSinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSinActionPerformed
        double ops=Double.parseDouble(jTxtDisplay.getText()); 
        ops=Math.sin(ops);
        jTxtDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jBtnSinActionPerformed

    private void jBtnCoshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCoshActionPerformed
        double ops=Double.parseDouble(jTxtDisplay.getText()); 
        ops=Math.cosh(ops);
        jTxtDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jBtnCoshActionPerformed

    private void jBtnTanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnTanActionPerformed
        double ops=Double.parseDouble(jTxtDisplay.getText()); 
        ops=Math.tan(ops);
        jTxtDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jBtnTanActionPerformed

    private void jBtnXXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnXXActionPerformed
        double ops=Double.parseDouble(jTxtDisplay.getText()); 
        ops=Math.pow(ops,ops);
        jTxtDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jBtnXXActionPerformed

    private void jBtnX2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnX2ActionPerformed
        double ops=Double.parseDouble(jTxtDisplay.getText()); 
        ops=Math.pow(ops,2);
        jTxtDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jBtnX2ActionPerformed

    private void jBtnX3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnX3ActionPerformed
        double ops=Double.parseDouble(jTxtDisplay.getText()); 
        ops=Math.pow(ops,3);
        jTxtDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jBtnX3ActionPerformed

    private void jBtnCbrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCbrActionPerformed
        double ops=Double.parseDouble(jTxtDisplay.getText()); 
        ops=Math.cbrt(ops);
        jTxtDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jBtnCbrActionPerformed

    private void jBtnRoundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRoundActionPerformed
        double ops=Double.parseDouble(jTxtDisplay.getText()); 
        ops=Math.round(ops);
        jTxtDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jBtnRoundActionPerformed

    private void jBtnPiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPiActionPerformed
        double ops = 3.141592653589; 
        jTxtDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jBtnPiActionPerformed

    private void jBtnBinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBinActionPerformed
        int a = Integer.parseInt(jTxtDisplay.getText()); 
        jTxtDisplay.setText(Integer.toString(a,2));
    }//GEN-LAST:event_jBtnBinActionPerformed

    private void jBtnHexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnHexActionPerformed
        int a = Integer.parseInt(jTxtDisplay.getText()); 
        jTxtDisplay.setText(Integer.toString(a,10));
    }//GEN-LAST:event_jBtnHexActionPerformed

    private void jBtnOctActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnOctActionPerformed
        int a = Integer.parseInt(jTxtDisplay.getText()); 
        jTxtDisplay.setText(Integer.toString(a,8));
    }//GEN-LAST:event_jBtnOctActionPerformed

    private void jTxtDisplayKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtDisplayKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtDisplayKeyPressed

    private void jTxtDisplayKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtDisplayKeyTyped
        char c=evt.getKeyChar(); 
        if (!(Character.isDigit(c)||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE))){ 
            getToolkit().beep(); evt.consume();
        }
    }//GEN-LAST:event_jTxtDisplayKeyTyped

    private void jBtnPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPlusActionPerformed
        firstnum=Double.parseDouble(jTxtDisplay.getText()); 
        jTxtDisplay.setText(null); 
        operations="+";
    }//GEN-LAST:event_jBtnPlusActionPerformed

    private void jBtnMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnMinusActionPerformed
        firstnum=Double.parseDouble(jTxtDisplay.getText()); 
        jTxtDisplay.setText(null); 
        operations="-";
    }//GEN-LAST:event_jBtnMinusActionPerformed

    private void jBtnTimesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnTimesActionPerformed
        firstnum=Double.parseDouble(jTxtDisplay.getText()); 
        jTxtDisplay.setText(null); 
        operations="*";
    }//GEN-LAST:event_jBtnTimesActionPerformed

    private void jBtnDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDivActionPerformed
        firstnum=Double.parseDouble(jTxtDisplay.getText()); 
        jTxtDisplay.setText(null); 
        operations="/";
    }//GEN-LAST:event_jBtnDivActionPerformed

    private void jBtnEqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEqualActionPerformed
        String answer; 
        secondnum=Double.parseDouble(jTxtDisplay.getText());
        switch(operations){
            case "+":
                result=firstnum+secondnum;
                break;
            case "-":
                result=firstnum-secondnum;
                break;
            case "*":
                result = firstnum * secondnum;
                break;
            case "/":
                result = firstnum / secondnum;
                break;
            case "%":
                result = firstnum % secondnum;
                break;
        }
        answer=String.format("%.2f",result);
        jTxtDisplay.setText(answer);
    }//GEN-LAST:event_jBtnEqualActionPerformed

    private void jBtnModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnModActionPerformed
        firstnum=Double.parseDouble(jTxtDisplay.getText()); 
        jTxtDisplay.setText(null); 
        operations="%";
    }//GEN-LAST:event_jBtnModActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (JOptionPane.getSelectedItem().equals("Distance")){ 
            double dst1=Double.parseDouble(jTextField1.getText()); 
            double dst2=Double.parseDouble(jTextField2.getText()); 
            double dst3=dst1*dst2; 
            jLabel1.setText("Distance="); 
            jLabel2.setText("Speedx"); 
            jLabel3.setText("Time"); 
            String value=String.format("%.2f", dst3); 
            jLabel4.setText(value); 
        } 
        else if (JOptionPane.getSelectedItem().equals("Time")){ 
            double dst1=Double.parseDouble(jTextField1.getText()); 
            double dst2=Double.parseDouble(jTextField2.getText()); 
            double dst3=dst1/dst2; 
            jLabel1.setText("Time="); 
            jLabel2.setText("Distance/"); 
            jLabel3.setText("Speed"); 
            String value=String.format("%.2f", dst3); 
            jLabel4.setText(value); 
        } 
        else if (JOptionPane.getSelectedItem().equals("Speed")){ 
            double dst1=Double.parseDouble(jTextField1.getText()); 
            double dst2=Double.parseDouble(jTextField2.getText()); 
            double dst3=dst1*dst2; 
            jLabel1.setText("Speed="); 
            jLabel2.setText("Distance/"); 
            jLabel3.setText("Time"); 
            String value=String.format("%.2f", dst3); 
            jLabel4.setText(value); 
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void JOptionPaneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JOptionPaneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JOptionPaneActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jLabel4.setText(null); 
        jLabel1.setText(null); 
        jLabel2.setText(null); 
        jLabel3.setText(null); 
        jTextField1.setText(null); 
        jTextField2.setText(null); 
        JOptionPane.setSelectedItem("Distance");
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculatorStiintificCA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> JOptionPane;
    private javax.swing.JButton jBtn0;
    private javax.swing.JButton jBtn1;
    private javax.swing.JButton jBtn2;
    private javax.swing.JButton jBtn3;
    private javax.swing.JButton jBtn4;
    private javax.swing.JButton jBtn5;
    private javax.swing.JButton jBtn6;
    private javax.swing.JButton jBtn7;
    private javax.swing.JButton jBtn8;
    private javax.swing.JButton jBtn9;
    private javax.swing.JButton jBtnBackSpace;
    private javax.swing.JButton jBtnBin;
    private javax.swing.JButton jBtnCbr;
    private javax.swing.JButton jBtnClear;
    private javax.swing.JButton jBtnCos;
    private javax.swing.JButton jBtnCosh;
    private javax.swing.JButton jBtnDiv;
    private javax.swing.JButton jBtnDot;
    private javax.swing.JButton jBtnEqual;
    private javax.swing.JButton jBtnHex;
    private javax.swing.JButton jBtnLn;
    private javax.swing.JButton jBtnLog;
    private javax.swing.JButton jBtnMinus;
    private javax.swing.JButton jBtnMod;
    private javax.swing.JButton jBtnOct;
    private javax.swing.JButton jBtnPi;
    private javax.swing.JButton jBtnPlus;
    private javax.swing.JButton jBtnPlusMinus;
    private javax.swing.JButton jBtnRound;
    private javax.swing.JButton jBtnSin;
    private javax.swing.JButton jBtnSinh;
    private javax.swing.JButton jBtnSqrt;
    private javax.swing.JButton jBtnTan;
    private javax.swing.JButton jBtnTanh;
    private javax.swing.JButton jBtnTimes;
    private javax.swing.JButton jBtnX2;
    private javax.swing.JButton jBtnX3;
    private javax.swing.JButton jBtnXX;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton40;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTxtDisplay;
    // End of variables declaration//GEN-END:variables
}
