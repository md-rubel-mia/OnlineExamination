import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import javax.swing.ButtonModel;
import java.util.*;

public class Exam extends javax.swing.JFrame {

    public Exam() {
        initComponents();
    }
    
    public static void set_up(String path_question) throws FileNotFoundException , IOException{
        
        System.out.println(path_question);
        
        setUp();
        
        //String path_question = pathQuestion;
        
        Question question_temp = new Question(); 
        
        FileReader fr = new FileReader(path_question + ".txt");
        
        BufferedReader br = new BufferedReader(fr);
        
        System.out.println("Path: " + path_question);
        
        //label_question.setVisible(false);
        
        String ar;
        
        while((ar = br.readLine())!=null){
            
            question_temp.setQuestion(ar);
            question_temp.setOption1(br.readLine());
            question_temp.setOption2(br.readLine());
            question_temp.setOption3(br.readLine());
            question_temp.setOption4(br.readLine());
            question_temp.setAnswer(br.readLine());
            question_temp.setTime(br.readLine());
            question_temp.setMarks(br.readLine());
            //System.out.println(br.readLine());
            m++;
            //System.out.println(question_temp.getTime() + question_temp.getMarks());
            
            ArrayListQuestion.add(new Question(question_temp));
            
            
        }
        
        br.close();
        fr.close();
        
        counter = 1;
        
        ButtonNext.doClick();
        
    }
    
    public Exam(String path , MemberInfo mi)throws FileNotFoundException , IOException{
        
        initComponents();
        examName.setText(path);
        this.info = mi;
        scoreValue = 10;
        timeLimit = 10;
        questionLimit = 10;
        
        System.out.println("EXAM" + path);
        pathQuestion = new String();
        
        set_up(path);
        this.pathQuestion = path;
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        radioButton_option1 = new javax.swing.JRadioButton();
        radioButton_option2 = new javax.swing.JRadioButton();
        radioButton_option3 = new javax.swing.JRadioButton();
        radioButton_option4 = new javax.swing.JRadioButton();
        ButtonNext = new javax.swing.JButton();
        questionNumber = new javax.swing.JLabel();
        label_question = new javax.swing.JLabel();
        LabelTimer = new javax.swing.JLabel();
        LabelScore = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        LabelTemp = new javax.swing.JLabel();
        examName = new javax.swing.JLabel();
        LabelTimer1 = new javax.swing.JLabel();
        LabelTimer2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonGroup1.add(radioButton_option1);
        radioButton_option1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        radioButton_option1.setText("Option1");
        radioButton_option1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButton_option1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioButton_option2);
        radioButton_option2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        radioButton_option2.setText("Option2");
        radioButton_option2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButton_option2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioButton_option3);
        radioButton_option3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        radioButton_option3.setText("Option3");
        radioButton_option3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButton_option3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioButton_option4);
        radioButton_option4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        radioButton_option4.setText("Option4");
        radioButton_option4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButton_option4ActionPerformed(evt);
            }
        });

        ButtonNext.setText("START");
        ButtonNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonNextActionPerformed(evt);
            }
        });

        questionNumber.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        questionNumber.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        questionNumber.setText("Question No");

        label_question.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        label_question.setText("Question");

        LabelTimer.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        LabelTimer.setText("Time");

        LabelTemp.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        LabelTemp.setText("Left");

        examName.setFont(new java.awt.Font("Segoe Print", 0, 36)); // NOI18N
        examName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        examName.setText("Exam Name");

        LabelTimer1.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        LabelTimer1.setText("Total Time");

        LabelTimer2.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        LabelTimer2.setText("Time Left");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(58, 58, 58))
            .addGroup(layout.createSequentialGroup()
                .addGap(491, 491, 491)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(questionNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(examName, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LabelTimer1, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                    .addComponent(LabelTimer2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelTemp, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelTimer, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(366, 366, 366)
                        .addComponent(LabelScore, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(298, 298, 298)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radioButton_option1)
                            .addComponent(label_question, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radioButton_option2)
                            .addComponent(radioButton_option3)
                            .addComponent(radioButton_option4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(603, 603, 603)
                        .addComponent(ButtonNext, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(351, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(examName, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelTimer, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelTimer1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(questionNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelTemp, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelTimer2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(47, 47, 47))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelScore, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label_question, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(radioButton_option1)
                        .addGap(35, 35, 35)
                        .addComponent(radioButton_option2)
                        .addGap(34, 34, 34)
                        .addComponent(radioButton_option3)
                        .addGap(29, 29, 29)
                        .addComponent(radioButton_option4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                        .addComponent(ButtonNext, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)))
                .addComponent(jLabel2))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radioButton_option1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButton_option1ActionPerformed
        whichButtonIsClicked = 1;       
    }//GEN-LAST:event_radioButton_option1ActionPerformed

    private void radioButton_option2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButton_option2ActionPerformed
        whichButtonIsClicked = 2;
    }//GEN-LAST:event_radioButton_option2ActionPerformed

    private void radioButton_option3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButton_option3ActionPerformed
        whichButtonIsClicked = 3;
    }//GEN-LAST:event_radioButton_option3ActionPerformed

    private void radioButton_option4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButton_option4ActionPerformed
        whichButtonIsClicked = 4;
    }//GEN-LAST:event_radioButton_option4ActionPerformed

    static int getRandomNumber(){
        
        int rand = (int) (Math.random()*50+1);
        
        while(whichNumberNow[rand%m]!=0)rand++;
        
        whichNumberNow[rand%m] = 1;
        
        return rand%m;
    }
    
    private static void startTimeCounting(){
        
        if(startTimer==true){

            t1 = new Timer(100 , new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ev) {
                    timeCounter++;
                    timeCounterTemp++;
                    LabelTimer.setText(""+ (timeCounter/10)+" S");
                    LabelTemp.setText("" + ((timeLimit*10-timeCounterTemp)/10) + " S");
                    
                    if(timeCounterTemp==timeLimit*10)ButtonNext.doClick();
                }
            });

            t1.start();

            startTimer = false;
        }
    }
    
    private static void showScore(){
        
        ExamEnd ee = new ExamEnd(arrayListData , score , info);
        ee.setVisible(true);
        t1.stop();

    }
    
    public static void questionGenerator(){
        
        questionNumber.setText("Question " + counter + ": ");

        show = new Question();
        
        show = ArrayListQuestion.get(getRandomNumber());
        //buttonGroup1.setSelected((ButtonModel) radioButton_option1, false);
        label_question.setText(show.getQuestion());
        radioButton_option1.setText(show.getOption1());
        radioButton_option2.setText(show.getOption2());
        radioButton_option3.setText(show.getOption3());
        radioButton_option4.setText(show.getOption4());
        rand = Integer.parseInt(show.getAnswer());
        System.out.println(show.getMarks() + " " + rand);
        scoreValue = Integer.parseInt(show.getMarks());
        timeLimit = Integer.parseInt(show.getTime());
        counter++;
            
    }
    
    private static void AddScore(){
        
        arrayListData.add(new QAnalysis(show , rand , whichButtonIsClicked));
        
        if(whichButtonIsClicked==rand)score+=scoreValue;
        System.out.println(score);
    }
    
    private void ButtonNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonNextActionPerformed
        
        System.out.println("counter" + counter);
        
        if(counter>=2)AddScore();
        //counter++;
        
        timeCounterCurrent = timeCounter;
        
        timeCounterTemp = timeCounter - timeCounterCurrent;
        
        ButtonNext.setText("NEXT");
        
        if(startTimer==true)startTimeCounting();
        
        buttonGroup1.clearSelection();
        
        if(counter>m){showScore();dispose();}
        
        else{
            
            if(counter==m)ButtonNext.setText("Submit");
        
            questionGenerator();
        }
        
        whichButtonIsClicked = 100;
        
    }//GEN-LAST:event_ButtonNextActionPerformed
    
    static private void setUp(){
        
        for(int i=0;i<m;i++){
            
            whichNumberNow[i] = 0;
        }
        
    }
    

    public static void main(String args[]) throws IOException {
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
            java.util.logging.Logger.getLogger(Exam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Exam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Exam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Exam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        System.out.println("Hello");
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exam().setVisible(true);
            }
        });
        
        setUp();
        
        String path_question = pathQuestion;
        String path_answer = "answer.txt";
        
        Question question_temp = new Question(); 
        
        FileReader fr = new FileReader(path_question);
        
        BufferedReader br = new BufferedReader(fr);
        
        //label_question.setVisible(false);
        
        System.out.println(path_answer);
        
        String ar;
        
        while((ar = br.readLine())!=null){
            
            question_temp.setQuestion(ar);
            question_temp.setOption1(br.readLine());
            question_temp.setOption2(br.readLine());
            question_temp.setOption3(br.readLine());
            question_temp.setOption4(br.readLine());
            question_temp.setAnswer(br.readLine());
            
            ArrayListQuestion.add(new Question(question_temp));
            
            
        }
        
        br.close();
        fr.close();
        
        counter = 1;
        
        
    }
    
    private static MemberInfo info = new MemberInfo();
    private static Question show;
    private static int m = 0;
    private static int questionLimit;
    private static int timeLimit;
    private static int scoreValue;
    private static int rand;
    private static String pathQuestion;
    private static Timer t1;
    private static int timeCounter = 0 , timeCounterTemp = 0 , timeCounterCurrent = 0;
    private static boolean startTimer = true;
    private static int[] whichNumberNow = new int [40];
    private static ArrayList<Question> ArrayListQuestion=new ArrayList<Question>();
    private static ArrayList<Integer> ArrayListAnswer = new ArrayList<Integer>();
    private static ArrayList<Integer> ArrayListAnswer2 = new ArrayList<Integer>();
    private static ArrayList<Integer> whichNumberBefore = new ArrayList<Integer>();
    private static ArrayList<QAnalysis>arrayListData = new ArrayList<QAnalysis>();
    
    private static int counter = 1 , score = 0 , whichButtonIsClicked = 0;
    static Iterator itr = ArrayListQuestion.iterator();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JButton ButtonNext;
    private static javax.swing.JLabel LabelScore;
    private static javax.swing.JLabel LabelTemp;
    private static javax.swing.JLabel LabelTimer;
    private static javax.swing.JLabel LabelTimer1;
    private static javax.swing.JLabel LabelTimer2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private static javax.swing.JLabel examName;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private static javax.swing.JLabel label_question;
    private static javax.swing.JLabel questionNumber;
    private static javax.swing.JRadioButton radioButton_option1;
    private static javax.swing.JRadioButton radioButton_option2;
    private static javax.swing.JRadioButton radioButton_option3;
    private static javax.swing.JRadioButton radioButton_option4;
    // End of variables declaration//GEN-END:variables
}
