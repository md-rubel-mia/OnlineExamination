
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ExamSelectionMenu extends javax.swing.JFrame {

   
    public static void setUp() throws IOException{
        
        examName1.setVisible(false);
        examName2.setVisible(false);
        examName3.setVisible(false);
        examName4.setVisible(false);
        examName5.setVisible(false);
        examName6.setVisible(false);
        examName7.setVisible(false);
        examName8.setVisible(false);
        examName9.setVisible(false);
        examName10.setVisible(false);
        examName11.setVisible(false);
        examName12.setVisible(false);
        examName13.setVisible(false);
        examName14.setVisible(false);
        examName15.setVisible(false);
        examName16.setVisible(false);
        examName17.setVisible(false);
        examName18.setVisible(false);
        
        radioButton1.setVisible(false);
        radioButton2.setVisible(false);
        radioButton3.setVisible(false);
        radioButton4.setVisible(false);
        radioButton5.setVisible(false);
        radioButton6.setVisible(false);
        radioButton7.setVisible(false);
        radioButton8.setVisible(false);
        radioButton9.setVisible(false);
        radioButton10.setVisible(false);
        radioButton11.setVisible(false);
        radioButton12.setVisible(false);
        radioButton13.setVisible(false);
        radioButton14.setVisible(false);
        radioButton15.setVisible(false);
        radioButton16.setVisible(false);
        radioButton17.setVisible(false);
        radioButton18.setVisible(false);
        
        doTheWork();
    }
    
    public static void showAll(String str , int counter){
        
        if(counter==1){
            
            radioButton1.setVisible(true);
            examName1.setText(str);
            examName1.setVisible(true);
            
        }
        
        else if(counter==2){
            
            radioButton2.setVisible(true);
            examName2.setText(str);
            examName2.setVisible(true);
        }
        
        
        else if(counter==3){
            
            radioButton3.setVisible(true);
            examName3.setText(str);
            examName3.setVisible(true);
        }
        
        
        else if(counter==4){
            
            radioButton4.setVisible(true);
            examName4.setText(str);
            examName4.setVisible(true);
        }
        
        else if(counter==5){
            
            radioButton5.setVisible(true);
            examName5.setText(str);
            examName5.setVisible(true);
        }
        
        
        else if(counter==6){
            
            radioButton6.setVisible(true);
            examName6.setText(str);
            examName6.setVisible(true);
        }
        
        
        else if(counter==7){
            
            radioButton7.setVisible(true);
            examName7.setText(str);
            examName7.setVisible(true);
        }
        
        
        else if(counter==8){
            
            radioButton8.setVisible(true);
            examName8.setText(str);
            examName8.setVisible(true);
        }
        
        
        else if(counter==9){
            
            radioButton9.setVisible(true);
            examName9.setText(str);
            examName9.setVisible(true);
        }
        
        
        else if(counter==10){
            
            radioButton10.setVisible(true);
            examName10.setText(str);
            examName10.setVisible(true);
        }
        
        
        else if(counter==11){
            
            radioButton11.setVisible(true);
            examName11.setText(str);
            examName11.setVisible(true);
        }
        
        
        else if(counter==12){
            
            radioButton12.setVisible(true);
            examName12.setText(str);
            examName12.setVisible(true);
        }
        
        
        else if(counter==13){
            
            radioButton13.setVisible(true);
            examName13.setText(str);
            examName13.setVisible(true);
        }
        
        
        else if(counter==14){
            
            radioButton14.setVisible(true);
            examName14.setText(str);
            examName14.setVisible(true);
        }
        
        
        else if(counter==15){
            
            radioButton15.setVisible(true);
            examName15.setText(str);
            examName15.setVisible(true);
        }
        
        
        else if(counter==16){
            
            radioButton16.setVisible(true);
            examName16.setText(str);
            examName16.setVisible(true);
        }
        
        
        else if(counter==17){
            
            radioButton17.setVisible(true);
            examName17.setText(str);
            examName17.setVisible(true);
        }
        
        
        else if(counter==18){
            
            radioButton18.setVisible(true);
            examName18.setText(str);
            examName18.setVisible(true);
        }
        
    }
    
    public static void doTheWork() throws FileNotFoundException, IOException{
        
        FileReader fr = new FileReader("ExamNameList.txt");
        
        BufferedReader br = new BufferedReader(fr);
        
        String ar;
        int counter = 0;
        
        while((ar = br.readLine())!=null){
            
            ++counter;
            showAll(ar , counter);
            
        }
        
    }
    
    public ExamSelectionMenu() throws IOException {
        initComponents();
        setUp();
    }
    
    public ExamSelectionMenu(MemberInfo mi) throws IOException{
        
        initComponents();
        setUp();
        this.mi = mi;
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        examName1 = new javax.swing.JLabel();
        examName2 = new javax.swing.JLabel();
        examName3 = new javax.swing.JLabel();
        examName14 = new javax.swing.JLabel();
        examName6 = new javax.swing.JLabel();
        examName7 = new javax.swing.JLabel();
        examName17 = new javax.swing.JLabel();
        examName9 = new javax.swing.JLabel();
        examName18 = new javax.swing.JLabel();
        examName8 = new javax.swing.JLabel();
        examName10 = new javax.swing.JLabel();
        examName16 = new javax.swing.JLabel();
        examName4 = new javax.swing.JLabel();
        examName5 = new javax.swing.JLabel();
        examName11 = new javax.swing.JLabel();
        examName13 = new javax.swing.JLabel();
        examName12 = new javax.swing.JLabel();
        examName15 = new javax.swing.JLabel();
        radioButton1 = new javax.swing.JRadioButton();
        radioButton2 = new javax.swing.JRadioButton();
        radioButton3 = new javax.swing.JRadioButton();
        radioButton4 = new javax.swing.JRadioButton();
        radioButton5 = new javax.swing.JRadioButton();
        radioButton6 = new javax.swing.JRadioButton();
        radioButton7 = new javax.swing.JRadioButton();
        radioButton8 = new javax.swing.JRadioButton();
        radioButton9 = new javax.swing.JRadioButton();
        radioButton10 = new javax.swing.JRadioButton();
        radioButton11 = new javax.swing.JRadioButton();
        radioButton12 = new javax.swing.JRadioButton();
        radioButton13 = new javax.swing.JRadioButton();
        radioButton14 = new javax.swing.JRadioButton();
        radioButton15 = new javax.swing.JRadioButton();
        radioButton16 = new javax.swing.JRadioButton();
        radioButton17 = new javax.swing.JRadioButton();
        radioButton18 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Exam Selection Menu");

        examName1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        examName1.setText("E1");

        examName2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        examName2.setText("E1");

        examName3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        examName3.setText("E1");

        examName14.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        examName14.setText("E1");

        examName6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        examName6.setText("E1");

        examName7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        examName7.setText("E1");

        examName17.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        examName17.setText("E1");

        examName9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        examName9.setText("E1");

        examName18.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        examName18.setText("E1");

        examName8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        examName8.setText("E1");

        examName10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        examName10.setText("E1");

        examName16.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        examName16.setText("E1");

        examName4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        examName4.setText("E1");

        examName5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        examName5.setText("E1");

        examName11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        examName11.setText("E1");

        examName13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        examName13.setText("E1");

        examName12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        examName12.setText("E1");

        examName15.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        examName15.setText("E1");

        buttonGroup1.add(radioButton1);
        radioButton1.setText("jRadioButton1");
        radioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioButton2);
        radioButton2.setText("jRadioButton1");
        radioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButton2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioButton3);
        radioButton3.setText("jRadioButton1");
        radioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButton3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioButton4);
        radioButton4.setText("jRadioButton1");
        radioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButton4ActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioButton5);
        radioButton5.setText("jRadioButton1");
        radioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButton5ActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioButton6);
        radioButton6.setText("jRadioButton1");
        radioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButton6ActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioButton7);
        radioButton7.setText("jRadioButton1");
        radioButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButton7ActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioButton8);
        radioButton8.setText("jRadioButton1");
        radioButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButton8ActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioButton9);
        radioButton9.setText("jRadioButton1");
        radioButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButton9ActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioButton10);
        radioButton10.setText("jRadioButton1");
        radioButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButton10ActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioButton11);
        radioButton11.setText("jRadioButton1");
        radioButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButton11ActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioButton12);
        radioButton12.setText("jRadioButton1");
        radioButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButton12ActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioButton13);
        radioButton13.setText("jRadioButton1");
        radioButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButton13ActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioButton14);
        radioButton14.setText("jRadioButton1");
        radioButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButton14ActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioButton15);
        radioButton15.setText("jRadioButton1");
        radioButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButton15ActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioButton16);
        radioButton16.setText("jRadioButton1");
        radioButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButton16ActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioButton17);
        radioButton17.setText("jRadioButton1");
        radioButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButton17ActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioButton18);
        radioButton18.setText("jRadioButton1");
        radioButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButton18ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton1.setText("Start Exam");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(504, 504, 504)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(367, 367, 367)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(radioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radioButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radioButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radioButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(examName1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(examName2, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                            .addComponent(examName3, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                            .addComponent(examName4, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                            .addComponent(examName6, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                            .addComponent(examName5, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE))
                        .addGap(96, 96, 96)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(radioButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radioButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radioButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radioButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radioButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radioButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(examName11, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                                .addComponent(radioButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(examName12, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(radioButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(examName10, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(radioButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(examName9, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(radioButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(examName8, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(radioButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(examName7, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(radioButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(examName14, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(examName13, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(examName17, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(examName18, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(examName15, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(examName16, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(452, 452, 452))
            .addGroup(layout.createSequentialGroup()
                .addGap(551, 551, 551)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(examName7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(examName13, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(examName1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(examName8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(examName14, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(examName2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(examName3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(examName9, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(examName15, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(examName4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(examName10, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(examName16, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(examName11, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(examName17, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(examName5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(examName6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(examName12, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(examName18, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 233, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        this.setVisible(false);
        
        if(whichButtonIsClicked==1){
            try {
                Exam ex = new Exam(examName1.getText() ,mi);
                ex.setVisible(true);
            } catch (IOException ex1) {
                Logger.getLogger(ExamSelectionMenu.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
        
        else if(whichButtonIsClicked==2){
            try {
                Exam ex = new Exam(examName2.getText() , mi);
                ex.setVisible(true);
            } catch (IOException ex1) {
                Logger.getLogger(ExamSelectionMenu.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
        
        
        else if(whichButtonIsClicked==3){
            try {
              
                Exam ex = new Exam(examName3.getText() , mi);
                ex.setVisible(true);
            } catch (IOException ex1) {
                Logger.getLogger(ExamSelectionMenu.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
        
        
        else if(whichButtonIsClicked==4){
            try {
               
                Exam ex = new Exam(examName4.getText() , mi);
                ex.setVisible(true);
            } catch (IOException ex1) {
                Logger.getLogger(ExamSelectionMenu.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
        
        
        else if(whichButtonIsClicked==5){
            try {
                
                Exam ex = new Exam(examName5.getText() , mi);
                ex.setVisible(true);
            } catch (IOException ex1) {
                Logger.getLogger(ExamSelectionMenu.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
        
        
        else if(whichButtonIsClicked==6){
            try {
           
                Exam ex = new Exam(examName6.getText() , mi);
                ex.setVisible(true);
            } catch (IOException ex1) {
                Logger.getLogger(ExamSelectionMenu.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
        
        
        else if(whichButtonIsClicked==7){
            try {
             
                Exam ex = new Exam(examName7.getText() , mi);
                ex.setVisible(true);
            } catch (IOException ex1) {
                Logger.getLogger(ExamSelectionMenu.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
        
        
        else if(whichButtonIsClicked==8){
            try {
            
                Exam ex = new Exam(examName8.getText() , mi);
                ex.setVisible(true);
            } catch (IOException ex1) {
                Logger.getLogger(ExamSelectionMenu.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
        
        
        else if(whichButtonIsClicked==9){
            try {
              
                Exam ex = new Exam(examName9.getText() , mi);
                ex.setVisible(true);
            } catch (IOException ex1) {
                Logger.getLogger(ExamSelectionMenu.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
        
        
        else if(whichButtonIsClicked==10){
            try {
     
                Exam ex = new Exam(examName10.getText() , mi);
                ex.setVisible(true);
            } catch (IOException ex1) {
                Logger.getLogger(ExamSelectionMenu.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
        
        
        else if(whichButtonIsClicked==11){
            try {
                
                Exam ex = new Exam(examName11.getText() , mi);
                ex.setVisible(true);
            } catch (IOException ex1) {
                Logger.getLogger(ExamSelectionMenu.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
        
        
        else if(whichButtonIsClicked==12){
            try {
                
                Exam ex = new Exam(examName12.getText() , mi);
                ex.setVisible(true);
            } catch (IOException ex1) {
                Logger.getLogger(ExamSelectionMenu.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
        
        else if(whichButtonIsClicked==13){
            try {
            
                Exam ex = new Exam(examName13.getText() , mi);
                ex.setVisible(true);
            } catch (IOException ex1) {
                Logger.getLogger(ExamSelectionMenu.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
        
        else if(whichButtonIsClicked==14){
            try {
              
                Exam ex = new Exam(examName14.getText() , mi);
                ex.setVisible(true);
            } catch (IOException ex1) {
                Logger.getLogger(ExamSelectionMenu.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
        
        else if(whichButtonIsClicked==15){
            try {
              
                Exam ex = new Exam(examName15.getText() , mi);
                ex.setVisible(true);
            } catch (IOException ex1) {
                Logger.getLogger(ExamSelectionMenu.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
        
        else if(whichButtonIsClicked==16){
            try {
              
                Exam ex = new Exam(examName16.getText() , mi);
                ex.setVisible(true);
            } catch (IOException ex1) {
                Logger.getLogger(ExamSelectionMenu.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
        
        else if(whichButtonIsClicked==17){
            try {
               
                Exam ex = new Exam(examName17.getText() , mi);
                ex.setVisible(true);
            } catch (IOException ex1) {
                Logger.getLogger(ExamSelectionMenu.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
        
        
        else if(whichButtonIsClicked==18){
            try {
              
                Exam ex = new Exam(examName18.getText() , mi);
                ex.setVisible(true);
            } catch (IOException ex1) {
                Logger.getLogger(ExamSelectionMenu.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
        
        else this.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void radioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButton1ActionPerformed
        whichButtonIsClicked = 1;
    }//GEN-LAST:event_radioButton1ActionPerformed

    private void radioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButton2ActionPerformed
        whichButtonIsClicked = 2;
    }//GEN-LAST:event_radioButton2ActionPerformed

    private void radioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButton3ActionPerformed
        whichButtonIsClicked = 3;
    }//GEN-LAST:event_radioButton3ActionPerformed

    private void radioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButton4ActionPerformed
        whichButtonIsClicked = 4;
    }//GEN-LAST:event_radioButton4ActionPerformed

    private void radioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButton5ActionPerformed
        whichButtonIsClicked = 5;
    }//GEN-LAST:event_radioButton5ActionPerformed

    private void radioButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButton6ActionPerformed
        whichButtonIsClicked = 6;
    }//GEN-LAST:event_radioButton6ActionPerformed

    private void radioButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButton7ActionPerformed
        whichButtonIsClicked = 7;
    }//GEN-LAST:event_radioButton7ActionPerformed

    private void radioButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButton8ActionPerformed
        whichButtonIsClicked = 8;
    }//GEN-LAST:event_radioButton8ActionPerformed

    private void radioButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButton9ActionPerformed
        whichButtonIsClicked = 9;
    }//GEN-LAST:event_radioButton9ActionPerformed

    private void radioButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButton10ActionPerformed
        whichButtonIsClicked = 10;
    }//GEN-LAST:event_radioButton10ActionPerformed

    private void radioButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButton11ActionPerformed
        whichButtonIsClicked = 11;
    }//GEN-LAST:event_radioButton11ActionPerformed

    private void radioButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButton12ActionPerformed
        whichButtonIsClicked = 12;
    }//GEN-LAST:event_radioButton12ActionPerformed

    private void radioButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButton13ActionPerformed
        whichButtonIsClicked = 13;
    }//GEN-LAST:event_radioButton13ActionPerformed

    private void radioButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButton14ActionPerformed
        whichButtonIsClicked = 14;
    }//GEN-LAST:event_radioButton14ActionPerformed

    private void radioButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButton15ActionPerformed
        whichButtonIsClicked = 15;
    }//GEN-LAST:event_radioButton15ActionPerformed

    private void radioButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButton16ActionPerformed
        whichButtonIsClicked = 16;
    }//GEN-LAST:event_radioButton16ActionPerformed

    private void radioButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButton17ActionPerformed
        whichButtonIsClicked = 17;
    }//GEN-LAST:event_radioButton17ActionPerformed

    private void radioButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButton18ActionPerformed
        whichButtonIsClicked = 18;
    }//GEN-LAST:event_radioButton18ActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ExamSelectionMenu().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(ExamSelectionMenu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    private static MemberInfo mi = new MemberInfo();
    private static int whichButtonIsClicked = 0;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private static javax.swing.JLabel examName1;
    private static javax.swing.JLabel examName10;
    private static javax.swing.JLabel examName11;
    private static javax.swing.JLabel examName12;
    private static javax.swing.JLabel examName13;
    private static javax.swing.JLabel examName14;
    private static javax.swing.JLabel examName15;
    private static javax.swing.JLabel examName16;
    private static javax.swing.JLabel examName17;
    private static javax.swing.JLabel examName18;
    private static javax.swing.JLabel examName2;
    private static javax.swing.JLabel examName3;
    private static javax.swing.JLabel examName4;
    private static javax.swing.JLabel examName5;
    private static javax.swing.JLabel examName6;
    private static javax.swing.JLabel examName7;
    private static javax.swing.JLabel examName8;
    private static javax.swing.JLabel examName9;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private static javax.swing.JRadioButton radioButton1;
    private static javax.swing.JRadioButton radioButton10;
    private static javax.swing.JRadioButton radioButton11;
    private static javax.swing.JRadioButton radioButton12;
    private static javax.swing.JRadioButton radioButton13;
    private static javax.swing.JRadioButton radioButton14;
    private static javax.swing.JRadioButton radioButton15;
    private static javax.swing.JRadioButton radioButton16;
    private static javax.swing.JRadioButton radioButton17;
    private static javax.swing.JRadioButton radioButton18;
    private static javax.swing.JRadioButton radioButton2;
    private static javax.swing.JRadioButton radioButton3;
    private static javax.swing.JRadioButton radioButton4;
    private static javax.swing.JRadioButton radioButton5;
    private static javax.swing.JRadioButton radioButton6;
    private static javax.swing.JRadioButton radioButton7;
    private static javax.swing.JRadioButton radioButton8;
    private static javax.swing.JRadioButton radioButton9;
    // End of variables declaration//GEN-END:variables
}
