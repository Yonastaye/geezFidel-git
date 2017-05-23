
import java.awt.Color;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;

public class UI extends javax.swing.JFrame {

    private int tSpeed = 2000;    // controls the speed of dynamicaly changing buttons
    private final ImageIcon logo = new ImageIcon("app files\\image\\logo.png");  // logo of the frame

    public UI() {

        initComponents();

        setupUI();

    }   //  constructor 

    private void setupUI() {   // setup's the frame and other componets  

        this.add(startPanel);

        startPanel.setVisible(true);
        mainPanel.setVisible(false);
        helpPanel.setVisible(false);
        aboutPanel.setVisible(false);

        ButtonGroup bg = new ButtonGroup();
        bg.add(oneSecond);
        bg.add(twoSecond);
        bg.add(thereSecond);

        GeezText();          // starts loading ge'ez text 

        setGeezButtonText(); // start the method witch sets button fidel text 

    }

    private void GeezText() {

        String text = ("ልጆች የግዕዝ ፊደላትን አብረን እንማር");

        char[] fidel = text.toCharArray();

        Thread t;
        t = new Thread() {

            @Override

            public void run() {  // override the run() method to specify the running behavior

                for (char character : fidel) {

                    firstLable.setText(firstLable.getText().concat((String.valueOf(character))));

                    try {
                        sleep(400);  // milliseconds
                    } catch (InterruptedException ex) {
                        System.out.println("Interupted exception has occured");
                    }

                }

            }   // end of the run method
        };  // end of thread object Definiation

        t.start();  // call back run() method

    }

    private void setGeezButtonText() {  // set's button text to GE'EZ Fidel  

        jButton1.setText("\u1200");
        jButton2.setText("\u1208");
        jButton3.setText("\u1210");
        jButton4.setText("\u1218");
        jButton5.setText("\u1220");
        jButton6.setText("\u1228");
        jButton7.setText("\u1230");
        jButton8.setText("\u12D8");
        jButton9.setText("\u1238");
        jButton10.setText("\u1240");
        jButton11.setText("\u1260");
        jButton12.setText("\u1320");
        jButton13.setText("\u1270");
        jButton14.setText("\u1278");
        jButton15.setText("\u1280");
        jButton16.setText("\u1290");
        jButton17.setText("\u1298");
        jButton18.setText("\u12A0");
        jButton19.setText("\u12A8");
        jButton20.setText("\u1348");
        jButton21.setText("\u12C8");
        jButtons.setText("\u12D0");
        jButton23.setText("\u1350");
        jButton24.setText("\u12E8");
        jButton25.setText("\u12F0");
        jButton26.setText("\u1340");
        jButton27.setText("\u1300");
        jButton28.setText("\u1308");

        jButton29.setText("\u1369");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        helpPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        aboutPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        startPanel = new javax.swing.JPanel();
        startBtn = new javax.swing.JButton();
        firstLable = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        fidelsPanel = new javax.swing.JPanel();
        jButton17 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButtons = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        kutirPanel = new javax.swing.JPanel();
        jButton29 = new javax.swing.JButton();
        punctuation = new javax.swing.JPanel();
        huletNetb = new javax.swing.JButton();
        aratNetb = new javax.swing.JButton();
        netela = new javax.swing.JButton();
        drib = new javax.swing.JButton();
        tyeka = new javax.swing.JButton();
        Menu = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        closeItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        speed = new javax.swing.JMenu();
        oneSecond = new javax.swing.JCheckBoxMenuItem();
        twoSecond = new javax.swing.JCheckBoxMenuItem();
        thereSecond = new javax.swing.JCheckBoxMenuItem();
        kalManbebia = new javax.swing.JMenu();
        help = new javax.swing.JMenu();
        aboutApp = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("\u130D\u12D5\u12DD");
        setIconImage( logo.getImage());
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Nyala", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 0));
        jLabel1.setText("                 አጠቃቀም");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(0, 51, 51));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Nyala", 0, 17)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setRows(5);
        jTextArea1.setText("፩ ፕሮግራሙን ለማስጀመር ጀመር የሚለውን ይጫኑ።  \n\n፪ የግዕዝ ፊደላትን፣ቁጥሮችን የያዙትን በተኖች በመጫን የፊደሉን\n ተከታዬች ከነድምፃቸው መስማት ይቻላል። \n\n፫ ማስተካከያ ከዛም ፍጥነት የሚለውን በመጫን የፊደላትን እንዲሁም\n የቁጥሮችን የመቀያየር ፍጥነት መጨመር እንዲሁም መቀነስ ይቻላል።\n\n፬ ፊደል ማንበቢያ የሚለውን በመጫን ከዛም በሚመጣው ሰሌዳ ላይ\n  እንዲነበብ የሚፈልጉትን ቃል በማስገባት አንብብየሚለውን በመጫን \n  የፊደሎቹን ድምፅ መስማት ይቻላል።\n");
        jTextArea1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout helpPanelLayout = new javax.swing.GroupLayout(helpPanel);
        helpPanel.setLayout(helpPanelLayout);
        helpPanelLayout.setHorizontalGroup(
            helpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE)
        );
        helpPanelLayout.setVerticalGroup(
            helpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(helpPanelLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        jLabel2.setFont(new java.awt.Font("Visual Geez Unicode", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 0));
        jLabel2.setText("  ስለ ግዕዝ ለልጆች ሶፍትዌር ");
        jLabel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextArea2.setEditable(false);
        jTextArea2.setBackground(new java.awt.Color(0, 51, 51));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Visual Geez Unicode", 0, 17)); // NOI18N
        jTextArea2.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea2.setRows(5);
        jTextArea2.setText("   \n    ይህ ሶፍትዌር  በ   - ዳዊት እሸቴ\n                          - አቤል ዘውዱ\n                          - ዬናስ ታየ\n  የ ባህር ዳር ዩኒቨርሲቲ  ሁለተኟ አመት የሶፍትዌር \n  ኢንጂነሪግ ተማሪዎች በ 2009 ዓ.ም ተሰራ");
        jTextArea2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane2.setViewportView(jTextArea2);

        javax.swing.GroupLayout aboutPanelLayout = new javax.swing.GroupLayout(aboutPanel);
        aboutPanel.setLayout(aboutPanelLayout);
        aboutPanelLayout.setHorizontalGroup(
            aboutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aboutPanelLayout.createSequentialGroup()
                .addGroup(aboutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
                    .addGroup(aboutPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        aboutPanelLayout.setVerticalGroup(
            aboutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aboutPanelLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );

        startPanel.setPreferredSize(new java.awt.Dimension(948, 677));

        startBtn.setFont(new java.awt.Font("Visual Geez Unicode", 1, 36)); // NOI18N
        startBtn.setForeground(new java.awt.Color(102, 153, 0));
        startBtn.setText("ጀምር");
        startBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startBtnActionPerformed(evt);
            }
        });

        firstLable.setFont(new java.awt.Font("Visual Geez Unicode", 3, 48)); // NOI18N
        firstLable.setForeground(new java.awt.Color(102, 163, 87));

        javax.swing.GroupLayout startPanelLayout = new javax.swing.GroupLayout(startPanel);
        startPanel.setLayout(startPanelLayout);
        startPanelLayout.setHorizontalGroup(
            startPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(startPanelLayout.createSequentialGroup()
                .addGap(353, 353, 353)
                .addComponent(startBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, startPanelLayout.createSequentialGroup()
                .addContainerGap(180, Short.MAX_VALUE)
                .addComponent(firstLable, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113))
        );
        startPanelLayout.setVerticalGroup(
            startPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(startPanelLayout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(firstLable, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(startBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(284, Short.MAX_VALUE))
        );

        fidelsPanel.setBackground(new java.awt.Color(88, 188, 103));
        fidelsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ፊደላት", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nyala", 1, 24))); // NOI18N
        fidelsPanel.setFont(new java.awt.Font("Nyala", 1, 18)); // NOI18N

        jButton17.setBackground(new java.awt.Color(204, 204, 255));
        jButton17.setFont(new java.awt.Font("Nyala", 0, 72)); // NOI18N
        jButton17.setForeground(new java.awt.Color(102, 102, 0));
        jButton17.setText("ኘ");
        jButton17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(204, 204, 255));
        jButton11.setFont(new java.awt.Font("Nyala", 0, 72)); // NOI18N
        jButton11.setForeground(new java.awt.Color(102, 102, 0));
        jButton11.setText("በ");
        jButton11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton18.setBackground(new java.awt.Color(204, 204, 255));
        jButton18.setFont(new java.awt.Font("Nyala", 0, 72)); // NOI18N
        jButton18.setForeground(new java.awt.Color(102, 102, 0));
        jButton18.setText("አ");
        jButton18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 204, 255));
        jButton2.setFont(new java.awt.Font("Nyala", 0, 72)); // NOI18N
        jButton2.setForeground(new java.awt.Color(102, 102, 0));
        jButton2.setText("ለ");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton15.setBackground(new java.awt.Color(204, 204, 255));
        jButton15.setFont(new java.awt.Font("Nyala", 0, 72)); // NOI18N
        jButton15.setForeground(new java.awt.Color(102, 102, 0));
        jButton15.setText("ኀ");
        jButton15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(204, 204, 255));
        jButton5.setFont(new java.awt.Font("Nyala", 0, 72)); // NOI18N
        jButton5.setForeground(new java.awt.Color(102, 102, 0));
        jButton5.setText("ሰ");
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton25.setBackground(new java.awt.Color(204, 204, 255));
        jButton25.setFont(new java.awt.Font("Nyala", 0, 72)); // NOI18N
        jButton25.setForeground(new java.awt.Color(102, 102, 0));
        jButton25.setText("ደ");
        jButton25.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(204, 204, 255));
        jButton3.setFont(new java.awt.Font("Nyala", 0, 72)); // NOI18N
        jButton3.setForeground(new java.awt.Color(102, 102, 0));
        jButton3.setText("ሐ");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton19.setBackground(new java.awt.Color(204, 204, 255));
        jButton19.setFont(new java.awt.Font("Nyala", 0, 72)); // NOI18N
        jButton19.setForeground(new java.awt.Color(102, 102, 0));
        jButton19.setText("ከ");
        jButton19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton28.setBackground(new java.awt.Color(204, 204, 255));
        jButton28.setFont(new java.awt.Font("Nyala", 0, 72)); // NOI18N
        jButton28.setForeground(new java.awt.Color(102, 102, 0));
        jButton28.setText("ገ");
        jButton28.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        jButton14.setBackground(new java.awt.Color(204, 204, 255));
        jButton14.setFont(new java.awt.Font("Nyala", 0, 72)); // NOI18N
        jButton14.setForeground(new java.awt.Color(102, 102, 0));
        jButton14.setText("ቸ");
        jButton14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton13.setBackground(new java.awt.Color(204, 204, 255));
        jButton13.setFont(new java.awt.Font("Nyala", 0, 72)); // NOI18N
        jButton13.setForeground(new java.awt.Color(102, 102, 0));
        jButton13.setText("ተ");
        jButton13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton12.setBackground(new java.awt.Color(204, 204, 255));
        jButton12.setFont(new java.awt.Font("Nyala", 0, 72)); // NOI18N
        jButton12.setForeground(new java.awt.Color(102, 102, 0));
        jButton12.setText("ጠ");
        jButton12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setFont(new java.awt.Font("Nyala", 0, 72)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 102, 0));
        jButton1.setText("ሀ");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(204, 204, 255));
        jButton10.setFont(new java.awt.Font("Nyala", 0, 72)); // NOI18N
        jButton10.setForeground(new java.awt.Color(102, 102, 0));
        jButton10.setText("ቀ");
        jButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(204, 204, 255));
        jButton7.setFont(new java.awt.Font("Nyala", 0, 72)); // NOI18N
        jButton7.setForeground(new java.awt.Color(102, 102, 0));
        jButton7.setText("ሠ");
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButtons.setBackground(new java.awt.Color(204, 204, 255));
        jButtons.setFont(new java.awt.Font("Nyala", 0, 72)); // NOI18N
        jButtons.setForeground(new java.awt.Color(102, 102, 0));
        jButtons.setText("ዐ");
        jButtons.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonsActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(204, 204, 255));
        jButton6.setFont(new java.awt.Font("Nyala", 0, 72)); // NOI18N
        jButton6.setForeground(new java.awt.Color(102, 102, 0));
        jButton6.setText("ረ");
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton16.setBackground(new java.awt.Color(204, 204, 255));
        jButton16.setFont(new java.awt.Font("Nyala", 0, 72)); // NOI18N
        jButton16.setForeground(new java.awt.Color(102, 102, 0));
        jButton16.setText("ነ");
        jButton16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton20.setBackground(new java.awt.Color(204, 204, 255));
        jButton20.setFont(new java.awt.Font("Nyala", 0, 72)); // NOI18N
        jButton20.setForeground(new java.awt.Color(102, 102, 0));
        jButton20.setText("ፈ");
        jButton20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(204, 204, 255));
        jButton9.setFont(new java.awt.Font("Nyala", 0, 72)); // NOI18N
        jButton9.setForeground(new java.awt.Color(102, 102, 0));
        jButton9.setText("ሸ");
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton27.setBackground(new java.awt.Color(204, 204, 255));
        jButton27.setFont(new java.awt.Font("Nyala", 0, 72)); // NOI18N
        jButton27.setForeground(new java.awt.Color(102, 102, 0));
        jButton27.setText("ጀ");
        jButton27.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(204, 204, 255));
        jButton8.setFont(new java.awt.Font("Nyala", 0, 72)); // NOI18N
        jButton8.setForeground(new java.awt.Color(102, 102, 0));
        jButton8.setText("ዘ");
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton26.setBackground(new java.awt.Color(204, 204, 255));
        jButton26.setFont(new java.awt.Font("Nyala", 0, 72)); // NOI18N
        jButton26.setForeground(new java.awt.Color(102, 102, 0));
        jButton26.setText("ፀ");
        jButton26.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        jButton23.setBackground(new java.awt.Color(204, 204, 255));
        jButton23.setFont(new java.awt.Font("Nyala", 0, 72)); // NOI18N
        jButton23.setForeground(new java.awt.Color(102, 102, 0));
        jButton23.setText("ፐ");
        jButton23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jButton21.setBackground(new java.awt.Color(204, 204, 255));
        jButton21.setFont(new java.awt.Font("Nyala", 0, 72)); // NOI18N
        jButton21.setForeground(new java.awt.Color(102, 102, 0));
        jButton21.setText("ወ");
        jButton21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(204, 204, 255));
        jButton4.setFont(new java.awt.Font("Nyala", 0, 72)); // NOI18N
        jButton4.setForeground(new java.awt.Color(102, 102, 0));
        jButton4.setText("መ");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton24.setBackground(new java.awt.Color(204, 204, 255));
        jButton24.setFont(new java.awt.Font("Nyala", 0, 72)); // NOI18N
        jButton24.setForeground(new java.awt.Color(102, 102, 0));
        jButton24.setText("የ");
        jButton24.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout fidelsPanelLayout = new javax.swing.GroupLayout(fidelsPanel);
        fidelsPanel.setLayout(fidelsPanelLayout);
        fidelsPanelLayout.setHorizontalGroup(
            fidelsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fidelsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fidelsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fidelsPanelLayout.createSequentialGroup()
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fidelsPanelLayout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fidelsPanelLayout.createSequentialGroup()
                        .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fidelsPanelLayout.createSequentialGroup()
                        .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtons, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        fidelsPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton2, jButton4, jButton5, jButton6, jButton7});

        fidelsPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton10, jButton11, jButton12, jButton14, jButton15, jButton9});

        fidelsPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton16, jButton17, jButton18, jButton19, jButton20, jButton21, jButton23, jButton24, jButton25, jButton26, jButton27, jButton28, jButton8, jButtons});

        fidelsPanelLayout.setVerticalGroup(
            fidelsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fidelsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fidelsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(fidelsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fidelsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fidelsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton10)
                        .addComponent(jButton11)))
                .addGap(18, 18, 18)
                .addGroup(fidelsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtons, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton17)
                    .addComponent(jButton18)
                    .addComponent(jButton19)
                    .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(fidelsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton27)
                    .addComponent(jButton25)
                    .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12)
                    .addComponent(jButton26))
                .addContainerGap())
        );

        fidelsPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton1, jButton2, jButton4, jButton5, jButton6, jButton7});

        fidelsPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton10, jButton11, jButton12, jButton14, jButton15, jButton9});

        fidelsPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton16, jButton17, jButton18, jButton19, jButton20, jButton21, jButton23, jButton24, jButton25, jButton26, jButton27, jButton28, jButton8, jButtons});

        kutirPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ቁጥር", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nyala", 1, 24))); // NOI18N

        jButton29.setFont(new java.awt.Font("Nyala", 1, 72)); // NOI18N
        jButton29.setText("ቁጥር");
        jButton29.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kutirPanelLayout = new javax.swing.GroupLayout(kutirPanel);
        kutirPanel.setLayout(kutirPanelLayout);
        kutirPanelLayout.setHorizontalGroup(
            kutirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kutirPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        kutirPanelLayout.setVerticalGroup(
            kutirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kutirPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        punctuation.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ምልክቶች", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nyala", 1, 24))); // NOI18N

        huletNetb.setFont(new java.awt.Font("Nyala", 0, 72)); // NOI18N
        huletNetb.setForeground(new java.awt.Color(51, 51, 51));
        huletNetb.setText("፡");
        huletNetb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        huletNetb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                huletNetbActionPerformed(evt);
            }
        });

        aratNetb.setFont(new java.awt.Font("Nyala", 0, 72)); // NOI18N
        aratNetb.setForeground(new java.awt.Color(51, 51, 51));
        aratNetb.setText("።");
        aratNetb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        aratNetb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aratNetbActionPerformed(evt);
            }
        });

        netela.setFont(new java.awt.Font("Nyala", 0, 72)); // NOI18N
        netela.setForeground(new java.awt.Color(51, 51, 51));
        netela.setText("፣");
        netela.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        netela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                netelaActionPerformed(evt);
            }
        });

        drib.setFont(new java.awt.Font("Nyala", 0, 72)); // NOI18N
        drib.setForeground(new java.awt.Color(51, 51, 51));
        drib.setText("፤");
        drib.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        drib.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dribActionPerformed(evt);
            }
        });

        tyeka.setFont(new java.awt.Font("Nyala", 0, 72)); // NOI18N
        tyeka.setForeground(new java.awt.Color(51, 51, 51));
        tyeka.setText("፧");
        tyeka.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tyeka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tyekaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout punctuationLayout = new javax.swing.GroupLayout(punctuation);
        punctuation.setLayout(punctuationLayout);
        punctuationLayout.setHorizontalGroup(
            punctuationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(punctuationLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(huletNetb, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(aratNetb, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(netela, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(drib, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(tyeka, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        punctuationLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {aratNetb, drib, huletNetb, netela, tyeka});

        punctuationLayout.setVerticalGroup(
            punctuationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(punctuationLayout.createSequentialGroup()
                .addGroup(punctuationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(huletNetb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(aratNetb)
                    .addComponent(netela, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(drib, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tyeka))
                .addGap(0, 14, Short.MAX_VALUE))
        );

        punctuationLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {aratNetb, drib, huletNetb, netela, tyeka});

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(kutirPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(punctuation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(fidelsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(fidelsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(kutirPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(punctuation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        fileMenu.setText("ፋይል");
        fileMenu.setFont(new java.awt.Font("Visual Geez Unicode", 0, 14)); // NOI18N

        closeItem.setFont(new java.awt.Font("Visual Geez Unicode", 0, 14)); // NOI18N
        closeItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c.png"))); // NOI18N
        closeItem.setText("ዝጋ");
        closeItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeItemActionPerformed(evt);
            }
        });
        fileMenu.add(closeItem);

        Menu.add(fileMenu);

        editMenu.setText("ማስተካከያ");
        editMenu.setFont(new java.awt.Font("Visual Geez Unicode", 0, 14)); // NOI18N

        speed.setText("ፍጥነት");
        speed.setFont(new java.awt.Font("Visual Geez Unicode", 0, 14)); // NOI18N

        oneSecond.setFont(new java.awt.Font("Visual Geez Unicode", 0, 14)); // NOI18N
        oneSecond.setText("፩ ሰከንድ");
        oneSecond.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                oneSecondItemStateChanged(evt);
            }
        });
        speed.add(oneSecond);

        twoSecond.setFont(new java.awt.Font("Visual Geez Unicode", 0, 14)); // NOI18N
        twoSecond.setText("፪ ሰከንድ");
        twoSecond.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                twoSecondItemStateChanged(evt);
            }
        });
        speed.add(twoSecond);

        thereSecond.setFont(new java.awt.Font("Visual Geez Unicode", 0, 14)); // NOI18N
        thereSecond.setText("፫ ሰከንድ");
        thereSecond.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thereSecondActionPerformed(evt);
            }
        });
        speed.add(thereSecond);

        editMenu.add(speed);

        Menu.add(editMenu);

        kalManbebia.setText("ፊደል ማንበቢያ ");
        kalManbebia.setFont(new java.awt.Font("Visual Geez Unicode", 0, 14)); // NOI18N
        kalManbebia.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                kalManbebiaMenuSelected(evt);
            }
        });
        Menu.add(kalManbebia);

        help.setText("መመሪያ");
        help.setFont(new java.awt.Font("Visual Geez Unicode", 0, 14)); // NOI18N
        help.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                helpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                helpMouseExited(evt);
            }
        });
        Menu.add(help);

        aboutApp.setText("ስለ ፕሮግራሙ");
        aboutApp.setFont(new java.awt.Font("Visual Geez Unicode", 0, 14)); // NOI18N
        aboutApp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                aboutAppMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                aboutAppMouseExited(evt);
            }
        });
        Menu.add(aboutApp);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(startPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 945, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(28, 28, 28)
                    .addComponent(helpPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(544, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(226, 226, 226)
                    .addComponent(aboutPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(201, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(11, 11, 11)
                    .addComponent(startPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 745, Short.MAX_VALUE)
                    .addGap(11, 11, 11)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(helpPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 412, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(aboutPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 515, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String fidel[] = new String[7]; // array of Ge'ez Fidels 

		//ha
        fidel[0] = "\u1200";
        fidel[1] = "\u1201";
        fidel[2] = "\u1202";
        fidel[3] = "\u1203";
        fidel[4] = "\u1204";
        fidel[5] = "\u1205";
        fidel[6] = "\u1206";

        Thread t;
        t = new Thread() {

            @Override

            public void run() {  // override the run() method to specify the running behavior

                Color colors[] = {Color.GREEN, Color.YELLOW, Color.RED, Color.BLUE, Color.ORANGE, Color.WHITE, Color.cyan};

                for (int i = 0; i < fidel.length; i++) {

                    jButton1.setText(fidel[i]);
                    jButton1.setBackground(colors[i]);
                    SoundNarrator.playFidel(jButton1.getText()); //call the static method playFidel from SoundNarrator class 

                    try {

                        Thread.sleep(tSpeed); // milliseconds
                    } catch (InterruptedException ex) {
                        System.out.println("Interupted exception has occured");
                    }

                }
                setGeezButtonText();
            }   // end of the run method
        };  // end of thread object Definiation

        t.start();   // call back run() method

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        String fidel[] = new String[7];

	    //le
        fidel[0] = "\u1208";
        fidel[1] = "\u1209";
        fidel[2] = "\u120A";
        fidel[3] = "\u120B";
        fidel[4] = "\u120C";
        fidel[5] = "\u120D";
        fidel[6] = "\u120E";

        Thread t;
        t = new Thread() {

            @Override

            public void run() {  // override the run() to specify the running behavior

                Color colors[] = {Color.GREEN, Color.YELLOW, Color.RED, Color.BLUE, Color.ORANGE, Color.WHITE, Color.CYAN};

                for (int i = 0; i < fidel.length; i++) {

                    jButton2.setText(fidel[i]);
                    jButton2.setBackground(colors[i]);
                    SoundNarrator.playFidel(jButton2.getText());

                    try {
                        sleep(tSpeed); // milliseconds
                    } catch (InterruptedException ex) {
                        System.out.println("Interupted exception has occured");
                    }

                }
                setGeezButtonText();

            }// end of run method
        };

        t.start();  // call back run() method

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        String fidel[] = new String[7];

          //hameru ha
        fidel[0] = "\u1210";
        fidel[1] = "\u1211";
        fidel[2] = "\u1212";
        fidel[3] = "\u1213";
        fidel[4] = "\u1214";
        fidel[5] = "\u1215";
        fidel[6] = "\u1216";

        Thread t;
        t = new Thread() {
            @Override

            public void run() {  // override the run() to specify the running behavior

                Color colors[] = {Color.GREEN, Color.YELLOW, Color.RED, Color.BLUE, Color.ORANGE, Color.WHITE, Color.CYAN};

                for (int i = 0; i < fidel.length; i++) {

                    jButton3.setText(fidel[i]);
                    jButton3.setBackground(colors[i]);
                    SoundNarrator.playFidel(jButton3.getText());

                    try {
                        sleep(tSpeed); // milliseconds
                    } catch (InterruptedException ex) {
                        System.out.println("Interupted exception has occured");
                    }
                }

                setGeezButtonText();

            }// end of run method
        };

        t.start();  // call back run()

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        String fidel[] = new String[7];

             // me
        fidel[0] = "\u1218";
        fidel[1] = "\u1219";
        fidel[2] = "\u121A";
        fidel[3] = "\u121B";
        fidel[4] = "\u121C";
        fidel[5] = "\u121D";
        fidel[6] = "\u121E";

        Thread t;
        t = new Thread() {
            @Override

            public void run() {  // override the run() to specify the running behavior

                Color colorss[] = {Color.GREEN, Color.YELLOW, Color.RED, Color.BLUE, Color.ORANGE, Color.WHITE, Color.CYAN};

                for (int i = 0; i < fidel.length; i++) {

                    jButton4.setText(fidel[i]);
                    jButton4.setBackground(colorss[i]);
                    SoundNarrator.playFidel(jButton4.getText());

                    try {
                        sleep(tSpeed); // milliseconds
                    } catch (InterruptedException ex) {
                        System.out.println("Interupted exception has occured");
                    }
                }
                setGeezButtonText();
            }// end of run method
        };

        t.start();  // call back run()

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        String fidel[] = new String[7];

          // esatu se
        fidel[0] = "\u1220";
        fidel[1] = "\u1221";
        fidel[2] = "\u1222";
        fidel[3] = "\u1223";
        fidel[4] = "\u1224";
        fidel[5] = "\u1225";
        fidel[6] = "\u1226";

        Thread t;
        t = new Thread() {

            @Override

            public void run() {  // override the run() to specify the running behavior

                Color colors[] = {Color.GREEN, Color.YELLOW, Color.RED, Color.BLUE, Color.ORANGE, Color.WHITE, Color.CYAN};

                for (int i = 0; i < fidel.length; i++) {

                    jButton5.setText(fidel[i]);
                    jButton5.setBackground(colors[i]);
                    SoundNarrator.playFidel(jButton5.getText());

                    try {
                        sleep(tSpeed); // milliseconds
                    } catch (InterruptedException ex) {
                        System.out.println("Interupted exception has occured");
                    }
                }

                setGeezButtonText();
            }   // end of run method
        };

        t.start();  // call back run()

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        String fidel[] = new String[7];

           // re
        fidel[0] = "\u1228";
        fidel[1] = "\u1229";
        fidel[2] = "\u122A";
        fidel[3] = "\u122B";
        fidel[4] = "\u122C";
        fidel[5] = "\u122D";
        fidel[6] = "\u122E";

        Thread t;
        t = new Thread() {
            @Override

            public void run() {  // override the run() to specify the running behavior

                Color colors[] = {Color.GREEN, Color.YELLOW, Color.RED, Color.BLUE, Color.ORANGE, Color.WHITE, Color.CYAN};

                for (int i = 0; i < fidel.length; i++) {

                    jButton6.setText(fidel[i]);
                    jButton6.setBackground(colors[i]);
                    SoundNarrator.playFidel(jButton6.getText());

                    try {
                        sleep(tSpeed); // milliseconds
                    } catch (InterruptedException ex) {
                    }
                }
                setGeezButtonText();
            }  // end of run method 
        };

        t.start();  // call back run() method

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        String fidel[] = new String[7];

          // se
        fidel[0] = "\u1230";
        fidel[1] = "\u1231";
        fidel[2] = "\u1232";
        fidel[3] = "\u1233";
        fidel[4] = "\u1234";
        fidel[5] = "\u1235";
        fidel[6] = "\u1236";

        Thread t;
        t = new Thread() {
            @Override

            public void run() {  // override the run() to specify the running behavior

                Color colors[] = {Color.GREEN, Color.YELLOW, Color.RED, Color.BLUE, Color.ORANGE, Color.WHITE, Color.CYAN};

                for (int i = 0; i < fidel.length; i++) {

                    jButton7.setText(fidel[i]);
                    jButton7.setBackground(colors[i]);
                    SoundNarrator.playFidel(jButton7.getText());
                    try {
                        sleep(tSpeed); // milliseconds
                    } catch (InterruptedException ex) {
                        System.out.println("Interupted exception has occured");
                    }
                }
                setGeezButtonText();
            }
        };

        t.start();  // call back run() method

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed

        String fidel[] = new String[7];

          // sh'e  
        fidel[0] = "\u1238";
        fidel[1] = "\u1239";
        fidel[2] = "\u123A";
        fidel[3] = "\u123B";
        fidel[4] = "\u123C";
        fidel[5] = "\u123D";
        fidel[6] = "\u123E";

        Thread t;
        t = new Thread() {
            @Override

            public void run() {  // override the run() to specify the running behavior

                Color colorss[] = {Color.GREEN, Color.YELLOW, Color.RED, Color.BLUE, Color.ORANGE, Color.WHITE, Color.CYAN};

                for (int i = 0; i < fidel.length; i++) {

                    jButton9.setText(fidel[i]);
                    jButton9.setBackground(colorss[i]);
                    SoundNarrator.playFidel(jButton9.getText());

                    try {
                        sleep(tSpeed); // milliseconds
                    } catch (InterruptedException ex) {
                        System.out.println("Interupted exception has occured");
                    }
                }
                setGeezButtonText();
            } // end of the run method 
        };

        t.start();  // call back run()

    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed

        String fidel[] = new String[7];

              // qe
        fidel[0] = "\u1240";
        fidel[1] = "\u1241";
        fidel[2] = "\u1242";
        fidel[3] = "\u1243";
        fidel[4] = "\u1244";
        fidel[5] = "\u1245";
        fidel[6] = "\u1246";

        Thread t;
        t = new Thread() {
            @Override

            public void run() {  // override the run() to specify the running behavior

                Color colors[] = {Color.GREEN, Color.YELLOW, Color.RED, Color.BLUE, Color.ORANGE, Color.WHITE, Color.CYAN};

                for (int i = 0; i < fidel.length; i++) {

                    jButton10.setText(fidel[i]);
                    jButton10.setBackground(colors[i]);
                    SoundNarrator.playFidel(jButton10.getText());

                    try {
                        sleep(tSpeed); // milliseconds
                    } catch (InterruptedException ex) {
                        System.out.println("Interupted exception has occured");
                    }
                }
                setGeezButtonText();
            } // end of the run method
        };

        t.start();  // call back run()

    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed

        String fidel[] = new String[7];

           // be 
        fidel[0] = "\u1260";
        fidel[1] = "\u1261";
        fidel[2] = "\u1262";
        fidel[3] = "\u1263";
        fidel[4] = "\u1264";
        fidel[5] = "\u1265";
        fidel[6] = "\u1266";

        Thread t;
        t = new Thread() {
            @Override

            public void run() {  // override the run() to specify the running behavior

                Color colors[] = {Color.GREEN, Color.YELLOW, Color.RED, Color.BLUE, Color.ORANGE, Color.WHITE, Color.CYAN};

                for (int i = 0; i < fidel.length; i++) {

                    jButton11.setText(fidel[i]);
                    jButton11.setBackground(colors[i]);
                    SoundNarrator.playFidel(jButton11.getText());

                    try {
                        sleep(tSpeed); // milliseconds
                    } catch (InterruptedException ex) {
                        System.out.println("Interupted exception has occured");
                    }

                }
                setGeezButtonText();
            }// end of run method
        };

        t.start();  // call back run() method

    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed

        String fidel[] = new String[7];

        fidel[0] = "\u1320";
        fidel[1] = "\u1321";
        fidel[2] = "\u1322";
        fidel[3] = "\u1323";
        fidel[4] = "\u1324";
        fidel[5] = "\u1325";
        fidel[6] = "\u1326";

        Thread t;
        t = new Thread() {
            @Override

            public void run() {  // override the run() to specify the running behavior

                Color colors[] = {Color.GREEN, Color.YELLOW, Color.RED, Color.BLUE, Color.ORANGE, Color.WHITE, Color.CYAN};

                for (int i = 0; i < fidel.length; i++) {

                    jButton12.setText(fidel[i]);
                    jButton12.setBackground(colors[i]);
                    SoundNarrator.playFidel(jButton12.getText());

                    try {
                        sleep(tSpeed); // milliseconds
                    } catch (InterruptedException ex) {
                        System.out.println("Interupted exception has occured");
                    }

                }
                setGeezButtonText();
            }  // end of run method
        };

        t.start();  // call back run()

    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed

        String fidel[] = new String[7];

              //TE
        fidel[0] = "\u1270";
        fidel[1] = "\u1271";
        fidel[2] = "\u1272";
        fidel[3] = "\u1273";
        fidel[4] = "\u1274";
        fidel[5] = "\u1275";
        fidel[6] = "\u1276";

        Thread t;
        t = new Thread() {
            @Override

            public void run() {  // override the run() to specify the running behavior

                Color colorss[] = {Color.GREEN, Color.YELLOW, Color.RED, Color.BLUE, Color.ORANGE, Color.WHITE, Color.CYAN};

                for (int i = 0; i < fidel.length; i++) {

                    jButton13.setText(fidel[i]);
                    jButton13.setBackground(colorss[i]);
                    SoundNarrator.playFidel(jButton13.getText());

                    try {
                        sleep(tSpeed); // milliseconds
                    } catch (InterruptedException ex) {
                        System.out.println("Interupted exception has occured");
                    }

                }
                setGeezButtonText();
            }  // end of run method
        };

        t.start();  // call back run()

    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed

        String fidel[] = new String[7];

               // che 
        fidel[0] = "\u1278";
        fidel[1] = "\u1279";
        fidel[2] = "\u127A";
        fidel[3] = "\u127B";
        fidel[4] = "\u127C";
        fidel[5] = "\u127D";
        fidel[6] = "\u127E";

        Thread t;
        t = new Thread() {
            @Override

            public void run() {  // override the run() to specify the running behavior

                Color colorss[] = {Color.GREEN, Color.YELLOW, Color.RED, Color.BLUE, Color.ORANGE, Color.WHITE, Color.CYAN};
                for (int i = 0; i < fidel.length; i++) {

                    jButton14.setText(fidel[i]);
                    jButton14.setBackground(colorss[i]);
                    SoundNarrator.playFidel(jButton14.getText());

                    try {
                        sleep(tSpeed); // milliseconds
                    } catch (InterruptedException ex) {
                        System.out.println("Interupted exception has occured");
                    }

                }
                setGeezButtonText();
            }// end of run method
        };

        t.start();  // call back run()

    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed

        String fidel[] = new String[7];

            //ha
        fidel[0] = "\u1280";
        fidel[1] = "\u1281";
        fidel[2] = "\u1282";
        fidel[3] = "\u1283";
        fidel[4] = "\u1284";
        fidel[5] = "\u1285";
        fidel[6] = "\u1286";

        Thread t;
        t = new Thread() {
            @Override

            public void run() {  // override the run() to specify the running behavior

                Color colors[] = {Color.GREEN, Color.YELLOW, Color.RED, Color.BLUE, Color.ORANGE, Color.WHITE, Color.CYAN};

                for (int i = 0; i < fidel.length; i++) {

                    jButton15.setText(fidel[i]);
                    jButton15.setBackground(colors[i]);
                    SoundNarrator.playFidel(jButton15.getText());

                    try {
                        sleep(tSpeed); // milliseconds
                    } catch (InterruptedException ex) {
                        System.out.println("Interupted exception has occured");
                    }

                }
                setGeezButtonText();
            }  // end of the run method

        };

        t.start();  // call back run()

    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed

        String fidel[] = new String[7];

              // nie    
        fidel[0] = ("\u1290");
        fidel[1] = ("\u1291");
        fidel[2] = ("\u1292");
        fidel[3] = ("\u1293");
        fidel[4] = ("\u1294");
        fidel[5] = ("\u1295");
        fidel[6] = ("\u1296");

        Thread t;
        t = new Thread() {
            @Override

            public void run() {  // override the run() to specify the running behavior

                Color colors[] = {Color.GREEN, Color.YELLOW, Color.RED, Color.BLUE, Color.ORANGE, Color.WHITE, Color.CYAN};

                for (int i = 0; i < fidel.length; i++) {

                    jButton16.setText(fidel[i]);
                    jButton16.setBackground(colors[i]);
                    SoundNarrator.playFidel(jButton16.getText());

                    try {
                        sleep(tSpeed); // milliseconds
                    } catch (InterruptedException ex) {
                        System.out.println("Interupted exception has occured");
                    }

                }
                setGeezButtonText();
            }   // end of run method 

        };

        t.start();
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed

        String fidel[] = new String[7];

         // nye
        fidel[0] = ("\u1298");
        fidel[1] = ("\u1299");
        fidel[2] = ("\u129A");
        fidel[3] = ("\u129B");
        fidel[4] = ("\u129C");
        fidel[5] = ("\u129D");
        fidel[6] = ("\u129E");

        Thread t;
        t = new Thread() {
            @Override

            public void run() {  // override the run() to specify the running behavior

                Color colors[] = {Color.GREEN, Color.YELLOW, Color.RED, Color.BLUE, Color.ORANGE, Color.WHITE, Color.CYAN};

                for (int i = 0; i < fidel.length; i++) {

                    jButton17.setText(fidel[i]);
                    jButton17.setBackground(colors[i]);
                    SoundNarrator.playFidel(jButton17.getText());

                    try {
                        sleep(tSpeed); // milliseconds
                    } catch (InterruptedException ex) {
                        System.out.println("Interupted exception has occured");
                    }

                }
                setGeezButtonText();
            }    // end of run method
        };

        t.start();  //

    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed

        String fidel[] = new String[7];

            // AA
        fidel[0] = ("\u12A0");
        fidel[1] = ("\u12A1");
        fidel[2] = ("\u12A2");
        fidel[3] = ("\u12A3");
        fidel[4] = ("\u12A4");
        fidel[5] = ("\u12A5");
        fidel[6] = ("\u12A6");

        Thread t;
        t = new Thread() {
            @Override

            public void run() {  // override the run() to specify the running behavior

                Color colors[] = {Color.GREEN, Color.YELLOW, Color.RED, Color.BLUE, Color.ORANGE, Color.WHITE, Color.CYAN};

                for (int i = 0; i < fidel.length; i++) {

                    jButton18.setText(fidel[i]);
                    jButton18.setBackground(colors[i]);
                    SoundNarrator.playFidel(jButton18.getText());

                    try {
                        sleep(tSpeed); // milliseconds
                    } catch (InterruptedException ex) {
                    }
                }
                setGeezButtonText();
            } // end of run method
        };

        t.start();
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed

        String fidel[] = new String[7];

       // ke
        fidel[0] = ("\u12A8");
        fidel[1] = ("\u12A9");
        fidel[2] = ("\u12AA");
        fidel[3] = ("\u12AB");
        fidel[4] = ("\u12AC");
        fidel[5] = ("\u12AD");
        fidel[6] = ("\u12AE");

        Thread t;
        t = new Thread() {

            @Override

            public void run() {  // override the run() to specify the running behavior

                Color colorss[] = {Color.GREEN, Color.YELLOW, Color.RED, Color.BLUE, Color.ORANGE, Color.WHITE, Color.CYAN};

                for (int i = 0; i < fidel.length; i++) {

                    jButton19.setText(fidel[i]);
                    jButton19.setBackground(colorss[i]);
                    SoundNarrator.playFidel(jButton19.getText());

                    try {
                        sleep(tSpeed); // milliseconds
                    } catch (InterruptedException ex) {
                        System.out.println("Interupted exception has occured");
                    }

                }
                setGeezButtonText();
            }  // end of run method
        };

        t.start();  //

    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed

        String fidel[] = new String[7];

	// fua
        fidel[0] = "\u1348";
        fidel[1] = "\u1349";
        fidel[2] = "\u134A";
        fidel[3] = "\u134B";
        fidel[4] = "\u134C";
        fidel[5] = "\u134D";
        fidel[6] = "\u134E";

        Thread t;
        t = new Thread() {

            @Override

            public void run() {  // override the run() to specify the running behavior

                Color colors[] = {Color.GREEN, Color.YELLOW, Color.RED, Color.BLUE, Color.ORANGE, Color.WHITE, Color.CYAN};

                for (int i = 0; i < fidel.length; i++) {

                    jButton20.setText(fidel[i]);
                    jButton20.setBackground(colors[i]);
                    SoundNarrator.playFidel(jButton20.getText());

                    try {
                        sleep(tSpeed); // milliseconds
                    } catch (InterruptedException ex) {
                        System.out.println("Interupted exception has occured");
                    }

                }
                setGeezButtonText();
            }    // end of run method
        };

        t.start();  //

    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed

        String fidel[] = new String[7];

           // wie
        fidel[0] = ("\u12C8");
        fidel[1] = ("\u12C9");
        fidel[2] = ("\u12CA");
        fidel[3] = ("\u12CB");
        fidel[4] = ("\u12CC");
        fidel[5] = ("\u12CD");
        fidel[6] = ("\u12CE");

        Thread t;
        t = new Thread() {

            @Override

            public void run() {  // override the run() to specify the running behavior

                Color colors[] = {Color.GREEN, Color.YELLOW, Color.RED, Color.BLUE, Color.ORANGE, Color.WHITE, Color.CYAN};

                for (int i = 0; i < fidel.length; i++) {

                    jButton21.setText(fidel[i]);
                    jButton21.setBackground(colors[i]);
                    SoundNarrator.playFidel(jButton21.getText());

                    try {
                        sleep(tSpeed); // milliseconds
                    } catch (InterruptedException ex) {
                        System.out.println("Interupted exception has occured");
                    }
                }
                setGeezButtonText();

            }    // end of run method
        };

        t.start();  //
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButtonsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonsActionPerformed

        String fidel[] = new String[7];

         // Anothe A
        jButton1.getLocation();
        fidel[0] = ("\u12D0");
        fidel[1] = ("\u12D1");
        fidel[2] = ("\u12D2");
        fidel[3] = ("\u12D3");
        fidel[4] = ("\u12D4");
        fidel[5] = ("\u12D5");
        fidel[6] = ("\u12D6");

        Thread t;
        t = new Thread() {

            @Override

            public void run() {  // override the run() to specify the running behavior

                Color colors[] = {Color.GREEN, Color.YELLOW, Color.RED, Color.BLUE, Color.ORANGE, Color.WHITE, Color.CYAN};

                for (int i = 0; i < fidel.length; i++) {

                    jButtons.setText(fidel[i]);
                    jButtons.setBackground(colors[i]);
                    SoundNarrator.playFidel(jButtons.getText());

                    try {
                        sleep(tSpeed); // milliseconds
                    } catch (InterruptedException ex) {
                        System.out.println("Interupted exception has occured");
                    }

                }
                setGeezButtonText();
            }// end run method
        };

        t.start();  //
    }//GEN-LAST:event_jButtonsActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

        String fidel[] = new String[7];

          // Zie
        fidel[0] = ("\u12D8");
        fidel[1] = ("\u12D9");
        fidel[2] = ("\u12DA");
        fidel[3] = ("\u12DB");
        fidel[4] = ("\u12DC");
        fidel[5] = ("\u12DD");
        fidel[6] = ("\u12DE");

        Thread t;
        t = new Thread() {

            @Override

            public void run() {  // override the run() to specify the running behavior

                Color colors[] = {Color.GREEN, Color.YELLOW, Color.RED, Color.BLUE, Color.ORANGE, Color.WHITE, Color.CYAN};

                for (int i = 0; i < fidel.length; i++) {

                    jButton8.setText(fidel[i]);
                    jButton8.setBackground(colors[i]);
                    SoundNarrator.playFidel(jButton8.getText());

                    try {
                        sleep(tSpeed); // milliseconds
                    } catch (InterruptedException ex) {
                        System.out.println("Interupted exception has occured");
                    }

                }
                setGeezButtonText();
            }    // end of run method

        };

        t.start();  //
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed

        String fidel[] = new String[7];

	    // p	
        fidel[0] = ("\u1350");
        fidel[1] = ("\u1351");
        fidel[2] = ("\u1352");
        fidel[3] = ("\u1353");
        fidel[4] = ("\u1354");
        fidel[5] = ("\u1355");
        fidel[6] = ("\u1356");

        Thread t;
        t = new Thread() {

            @Override

            public void run() {  // override the run() to specify the running behavior

                Color colorss[] = {Color.GREEN, Color.YELLOW, Color.RED, Color.BLUE, Color.ORANGE, Color.WHITE, Color.CYAN};

                for (int i = 0; i < fidel.length; i++) {

                    jButton23.setText(fidel[i]);
                    jButton23.setBackground(colorss[i]);
                    SoundNarrator.playFidel(jButton23.getText());

                    try {
                        sleep(tSpeed); // milliseconds
                    } catch (InterruptedException ex) {
                        System.out.println("Interupted exception has occured");
                    }
                }
                setGeezButtonText();
            } // end of run method
        };

        t.start();  //

    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed

        String fidel[] = new String[7];

          // yie
        fidel[0] = ("\u12E8");
        fidel[1] = ("\u12E9");
        fidel[2] = ("\u12EA");
        fidel[3] = ("\u12EB");
        fidel[4] = ("\u12EC");
        fidel[5] = ("\u12ED");
        fidel[6] = ("\u12EE");

        Thread t;
        t = new Thread() {

            @Override

            public void run() {  // override the run() to specify the running behavior

                Color colors[] = {Color.GREEN, Color.YELLOW, Color.RED, Color.BLUE, Color.ORANGE, Color.WHITE, Color.CYAN};

                for (int i = 0; i < fidel.length; i++) {

                    jButton24.setText(fidel[i]);
                    jButton24.setBackground(colors[i]);
                    SoundNarrator.playFidel(jButton24.getText());

                    try {
                        sleep(tSpeed); // milliseconds
                    } catch (InterruptedException ex) {
                        System.out.println("Interupted exception has occured");
                    }

                }
                setGeezButtonText();
            } // end of run method
        };

        t.start();  //

    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed

        String fidel[] = new String[7];

       	  // die
        fidel[0] = ("\u12F0");
        fidel[1] = ("\u12F1");
        fidel[2] = ("\u12F2");
        fidel[3] = ("\u12F3");
        fidel[4] = ("\u12F4");
        fidel[5] = ("\u12F5");
        fidel[6] = ("\u12F6");

        Thread t;
        t = new Thread() {

            @Override

            public void run() {  // override the run() to specify the running behavior

                Color colors[] = {Color.GREEN, Color.YELLOW, Color.RED, Color.BLUE, Color.ORANGE, Color.WHITE, Color.CYAN};

                for (int i = 0; i < fidel.length; i++) {

                    jButton25.setText(fidel[i]);
                    jButton25.setBackground(colors[i]);
                    SoundNarrator.playFidel(jButton25.getText());

                    try {
                        sleep(tSpeed); // milliseconds
                    } catch (InterruptedException ex) {
                        System.out.println("Interupted exception has occured");
                    }
                }
                setGeezButtonText();
            }     //  end of run method

        };

        t.start();  //
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed

        String fidel[] = new String[7];

           // Tse
        fidel[0] = ("\u1340");
        fidel[1] = ("\u1341");
        fidel[2] = ("\u1342");
        fidel[3] = ("\u1343");
        fidel[4] = ("\u1344");
        fidel[5] = ("\u1345");
        fidel[6] = ("\u1346");

        Thread t;
        t = new Thread() {

            @Override

            public void run() {  // override the run() to specify the running behavior

                Color colorss[] = {Color.GREEN, Color.YELLOW, Color.RED, Color.BLUE, Color.ORANGE, Color.WHITE, Color.CYAN};

                for (int i = 0; i < fidel.length; i++) {

                    jButton26.setText(fidel[i]);
                    jButton26.setBackground(colorss[i]);
                    SoundNarrator.playFidel(jButton26.getText());

                    try {
                        sleep(tSpeed); // milliseconds
                    } catch (InterruptedException ex) {
                        System.out.println("Interupted exception has occured");
                    }
                }
                setGeezButtonText();
            }  // end of run method
        };

        t.start();  //

    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed

        String fidel[] = new String[7];

        // jie
        fidel[0] = ("\u1300");
        fidel[1] = ("\u1301");
        fidel[2] = ("\u1302");
        fidel[3] = ("\u1303");
        fidel[4] = ("\u1304");
        fidel[5] = ("\u1305");
        fidel[6] = ("\u1306");

        Thread t;
        t = new Thread() {

            @Override

            public void run() {  // override the run() to specify the running behavior

                Color colorss[] = {Color.GREEN, Color.YELLOW, Color.RED, Color.BLUE, Color.ORANGE, Color.WHITE, Color.CYAN};

                for (int i = 0; i < fidel.length; i++) {

                    jButton27.setText(fidel[i]);
                    jButton27.setBackground(colorss[i]);
                    SoundNarrator.playFidel(jButton27.getText());

                    try {
                        sleep(tSpeed); // milliseconds
                    } catch (InterruptedException ex) {
                    }
                }
                setGeezButtonText();

            }         // end of run method 

        };

        t.start();  //
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed

        String fidel[] = new String[7];

         // gie
        fidel[0] = ("\u1308");
        fidel[1] = ("\u1309");
        fidel[2] = ("\u130A");
        fidel[3] = ("\u130B");
        fidel[4] = ("\u130C");
        fidel[5] = ("\u130D");
        fidel[6] = ("\u130E");

        Thread t;
        t = new Thread() {

            @Override

            public void run() {  // override the run() to specify the running behavior

                Color colorss[] = {Color.GREEN, Color.YELLOW, Color.RED, Color.BLUE, Color.ORANGE, Color.WHITE, Color.CYAN};

                for (int i = 0; i < fidel.length; i++) {

                    jButton28.setText(fidel[i]);
                    jButton28.setBackground(colorss[i]);
                    SoundNarrator.playFidel(jButton28.getText());

                    try {
                        sleep(tSpeed); // milliseconds
                    } catch (InterruptedException ex) {
                        System.out.println("Interupted exception has occured");
                    }
                }
                setGeezButtonText();
            }       // end of run method

        };

        t.start();  //

    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed

        String qutir[] = new String[19];// array of geez number from 1 upto 10,000 

        qutir[0] = "\u1369";
        qutir[1] = "\u136A";
        qutir[2] = "\u136B";
        qutir[3] = "\u136C";
        qutir[4] = "\u136D";
        qutir[5] = "\u136E";
        qutir[6] = "\u136F";
        qutir[7] = "\u1370";
        qutir[8] = "\u1371";
        qutir[9] = "\u1372";
        qutir[10] = "\u1373";
        qutir[11] = "\u1374";
        qutir[12] = "\u1375";
        qutir[13] = "\u1376";
        qutir[14] = "\u1377";
        qutir[15] = "\u1378";
        qutir[16] = "\u1379";
        qutir[17] = "\u137a";
        qutir[18] = "\u137b";
                   // qutir [19]="\u137c";

        Thread t;
        t = new Thread() {
            @Override

            public void run() {  // override the run() to specify the running behavior

                Color colors[] = {Color.GREEN, Color.YELLOW, Color.RED, Color.BLUE, Color.ORANGE, Color.WHITE, Color.CYAN, Color.GREEN, Color.YELLOW, Color.RED, Color.BLUE, Color.ORANGE, Color.GREEN, Color.YELLOW, Color.RED, Color.BLUE, Color.ORANGE, Color.WHITE, Color.CYAN, Color.GREEN};

                for (int i = 0; i < qutir.length; i++) {

                    jButton29.setText(qutir[i]);
                    jButton29.setBackground(colors[i]);
                    SoundNarrator.playFidel(jButton29.getText());

                    try {
                        sleep(tSpeed); // milliseconds
                    } catch (InterruptedException ex) {
                        System.out.println("Interupted exception has occured");
                    }
                }
                setGeezButtonText();
            } // end of the run method
        };

        t.start();  // call back run()      

    }//GEN-LAST:event_jButton29ActionPerformed

    private void startBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startBtnActionPerformed
        startPanel.setVisible(false);
        mainPanel.setVisible(true);
    }//GEN-LAST:event_startBtnActionPerformed

    private void closeItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_closeItemActionPerformed

    private void oneSecondItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_oneSecondItemStateChanged
        tSpeed = 1000;
    }//GEN-LAST:event_oneSecondItemStateChanged

    private void twoSecondItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_twoSecondItemStateChanged
        tSpeed = 2000;
    }//GEN-LAST:event_twoSecondItemStateChanged

    private void kalManbebiaMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_kalManbebiaMenuSelected

        VoiceTranslator vt = new VoiceTranslator();
        vt.setVisible(true);
        vt.setAlwaysOnTop(true);
    }//GEN-LAST:event_kalManbebiaMenuSelected

    private void helpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpMouseEntered

        helpPanel.setVisible(true);
    }//GEN-LAST:event_helpMouseEntered

    private void helpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpMouseExited
        helpPanel.setVisible(false);
    }//GEN-LAST:event_helpMouseExited

    private void aboutAppMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutAppMouseEntered
        aboutPanel.setVisible(true);
    }//GEN-LAST:event_aboutAppMouseEntered

    private void aboutAppMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutAppMouseExited
        aboutPanel.setVisible(false);
    }//GEN-LAST:event_aboutAppMouseExited

    private void netelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_netelaActionPerformed
        SoundNarrator.playFidel(netela.getText());
    }//GEN-LAST:event_netelaActionPerformed

    private void huletNetbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_huletNetbActionPerformed
        SoundNarrator.playFidel(huletNetb.getText());
    }//GEN-LAST:event_huletNetbActionPerformed

    private void aratNetbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aratNetbActionPerformed
        SoundNarrator.playFidel(aratNetb.getText());
    }//GEN-LAST:event_aratNetbActionPerformed

    private void dribActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dribActionPerformed
        SoundNarrator.playFidel(drib.getText());
    }//GEN-LAST:event_dribActionPerformed

    private void tyekaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tyekaActionPerformed
        SoundNarrator.playFidel(tyeka.getText());
    }//GEN-LAST:event_tyekaActionPerformed

    private void thereSecondActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thereSecondActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_thereSecondActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar Menu;
    private javax.swing.JMenu aboutApp;
    private javax.swing.JPanel aboutPanel;
    private javax.swing.JButton aratNetb;
    private javax.swing.JMenuItem closeItem;
    private javax.swing.JButton drib;
    private javax.swing.JMenu editMenu;
    private javax.swing.JPanel fidelsPanel;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JLabel firstLable;
    private javax.swing.JMenu help;
    private javax.swing.JPanel helpPanel;
    private javax.swing.JButton huletNetb;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtons;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JMenu kalManbebia;
    private javax.swing.JPanel kutirPanel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton netela;
    private javax.swing.JCheckBoxMenuItem oneSecond;
    private javax.swing.JPanel punctuation;
    private javax.swing.JMenu speed;
    private javax.swing.JButton startBtn;
    private javax.swing.JPanel startPanel;
    private javax.swing.JCheckBoxMenuItem thereSecond;
    private javax.swing.JCheckBoxMenuItem twoSecond;
    private javax.swing.JButton tyeka;
    // End of variables declaration//GEN-END:variables
}
