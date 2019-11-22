
import java.util.ArrayList;


public class QuestionAnalysis extends javax.swing.JFrame {

    public QuestionAnalysis() {
        initComponents();
    }
    
    public static void doTheWork(){
        
        
        yourAnswer.setText("");
        correctAnswer.setText("");
        
        si = arrayListData.size();
        //++counter;
        System.out.println(si);
        if(counter==si-1){
            
            buttonNext.setText("END");
        }
        
        if(counter==si){
            
            LogInMenu lim = new LogInMenu();
            lim.setVisible(true);
        }
        
        else{
            
            questionNo.setText("Qustion : " + (int)(counter +1));
            fullQuestion.setText(arrayListData.get(counter).getQuestion());
            int temp1 = arrayListData.get(counter).getCorrectAnswer();
            int temp2 = arrayListData.get(counter).getYourAnswer();
            
            if(temp1==1){
                correctAnswer.setText("Correct Answer : " + arrayListData.get(counter).getOption1());
            }
            
            if(temp1==2){
                correctAnswer.setText("Correct Answer : " + arrayListData.get(counter).getOption2());
            }
            
            
            if(temp1==3){
                correctAnswer.setText("Correct Answer : " + arrayListData.get(counter).getOption3());
            }
            
            
            if(temp1==4){
                correctAnswer.setText("Correct Answer : " + arrayListData.get(counter).getOption4());
            }
            
            if(temp2==1){
                yourAnswer.setText("Your Answer : " + arrayListData.get(counter).getOption1());
            }
            
            if(temp2==2){
                yourAnswer.setText("Your Answer : " + arrayListData.get(counter).getOption2());
            }
            
            
            if(temp2==3){
                yourAnswer.setText("Your Answer : " + arrayListData.get(counter).getOption3());
            }
            
            
            if(temp2==4){
                yourAnswer.setText("Your Answer : " + arrayListData.get(counter).getOption4());
            }
            
            if(temp2==0){
                
                yourAnswer.setText("Your Answer : SKIPED");
            }
            
            
            
        }
    }
    
    public QuestionAnalysis(ArrayList<QAnalysis>arrayListData){
        
        initComponents();
        this.arrayListData = arrayListData;
        ++counter;
        doTheWork();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        questionNo = new javax.swing.JLabel();
        correctAnswer = new javax.swing.JLabel();
        fullQuestion = new javax.swing.JLabel();
        yourAnswer = new javax.swing.JLabel();
        buttonNext = new javax.swing.JButton();
        buttonNext1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QUESTION ANALYSIS");

        questionNo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        questionNo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        questionNo.setText("Question No");

        correctAnswer.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        correctAnswer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        correctAnswer.setText("Question No");

        fullQuestion.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        fullQuestion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fullQuestion.setText("Question No");

        yourAnswer.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        yourAnswer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        yourAnswer.setText("Question No");

        buttonNext.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        buttonNext.setText("Next");
        buttonNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNextActionPerformed(evt);
            }
        });

        buttonNext1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        buttonNext1.setText("Main Menu");
        buttonNext1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNext1ActionPerformed(evt);
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
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(618, 618, 618)
                        .addComponent(questionNo, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(333, 333, 333)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fullQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 689, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(correctAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 689, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yourAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 689, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(494, 494, 494)
                        .addComponent(buttonNext, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(118, 118, 118)
                        .addComponent(buttonNext1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(344, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(questionNo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(fullQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(correctAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(yourAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 216, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonNext, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonNext1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(99, 99, 99))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonNext1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNext1ActionPerformed
        LogInMenu lim = new LogInMenu();
        lim.setVisible(true);
        dispose();
    }//GEN-LAST:event_buttonNext1ActionPerformed

    private void buttonNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNextActionPerformed
        
        ++counter;
        doTheWork();
        if(counter==si){
            
            LogInMenu lim = new LogInMenu();
            lim.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_buttonNextActionPerformed

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
            java.util.logging.Logger.getLogger(QuestionAnalysis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuestionAnalysis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuestionAnalysis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuestionAnalysis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuestionAnalysis().setVisible(true);
            }
        });
    }
    
    private static int si;
    private static int counter = -1;
    private static ArrayList<QAnalysis>arrayListData = new ArrayList<QAnalysis>();
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JButton buttonNext;
    private static javax.swing.JButton buttonNext1;
    private static javax.swing.JLabel correctAnswer;
    private static javax.swing.JLabel fullQuestion;
    private javax.swing.JLabel jLabel1;
    private static javax.swing.JLabel questionNo;
    private static javax.swing.JLabel yourAnswer;
    // End of variables declaration//GEN-END:variables
}
