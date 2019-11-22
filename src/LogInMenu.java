
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class LogInMenu extends javax.swing.JFrame {

    public LogInMenu() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        userName = new javax.swing.JTextField();
        buttonLogIn = new javax.swing.JButton();
        buttonSignUp = new javax.swing.JButton();
        radioButtonStudent = new javax.swing.JRadioButton();
        radioButtonStudent1 = new javax.swing.JRadioButton();
        userPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setText("Online Exam");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("User Id");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Password");

        userName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        buttonLogIn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        buttonLogIn.setText("LOG IN");
        buttonLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLogInActionPerformed(evt);
            }
        });

        buttonSignUp.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        buttonSignUp.setText("SIGN UP");
        buttonSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSignUpActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioButtonStudent);
        radioButtonStudent.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        radioButtonStudent.setText("Student");
        radioButtonStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonStudentActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioButtonStudent1);
        radioButtonStudent1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        radioButtonStudent1.setText("Admin");
        radioButtonStudent1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonStudent1ActionPerformed(evt);
            }
        });

        userPassword.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(userName, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                            .addComponent(userPassword)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonSignUp, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(buttonLogIn, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                                .addComponent(radioButtonStudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(radioButtonStudent1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(radioButtonStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(radioButtonStudent1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(buttonLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(buttonSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private static boolean searchAdmin(){
        
        arrayListMember.clear();
        
        path = "AdminInformation.txt";
        
        int counter = 0;
        
        try {
            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);
            
            String ar;
            MemberInfo mi = new MemberInfo();
            
            while((ar=br.readLine())!=null){
                
                ++counter;
                mi.setFullName(ar);
                mi.setUserId(br.readLine());
                mi.setUserPassword(br.readLine());
                mi.setMailId(br.readLine());
                //mi.setRollNo(br.readLine());
                
                arrayListMember.add(new MemberInfo(mi));
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LogInMenu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LogInMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for(int i=0;i<counter;i++){
            
            MemberInfo temp = new MemberInfo();
            System.out.println("Exception " + i);
            temp = arrayListMember.get(i);
            
            if(temp.getUserId().compareTo(userName.getText())==0){
                
                if(temp.getUserPassword().compareTo(userPassword.getText())==0){
                    
                    return true;
               
                }
            }
        }
        return false;
    }
    
    private static boolean searchStudent(){
        
        path = "StudentInformation.txt";
        
        int counter = 0;
        
        try {
            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);
            
            String ar;
            MemberInfo mi = new MemberInfo();
            
            while((ar=br.readLine())!=null){
                
                ++counter;
                mi.setFullName(ar);
                mi.setUserId(br.readLine());
                mi.setUserPassword(br.readLine());
                mi.setMailId(br.readLine());
                mi.setRollNo(br.readLine());
                
                arrayListMember.add(new MemberInfo(mi));
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LogInMenu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LogInMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for(int i=0;i<counter;i++){
            
            MemberInfo temp = new MemberInfo();
            
            temp = arrayListMember.get(i);
            
            if(temp.getUserId().compareTo(userName.getText())==0){
                
                if(temp.getUserPassword().compareTo(userPassword.getText())==0){
                    
                    return true;
               
                }
            }
        }
        return false;
    }
    
    private static MemberInfo findMember(){
        
        int counter = arrayListMember.size();
        
        MemberInfo temp = new MemberInfo();
        
        for(int i=0;i<counter;i++){
            
            temp = new MemberInfo();
            
            temp = arrayListMember.get(i);
            
            if(temp.getUserId().compareTo(userName.getText())==0){
                
                if(temp.getUserPassword().compareTo(userPassword.getText())==0){
                    
                    return temp;
               
                }
            }
        }
        
        return temp;
        
    }
    
    private void buttonLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLogInActionPerformed
        
        //System.out.println(whichButtonIsClicked);
        
        if(userName.getText().compareTo("")==0||userPassword.getText().compareTo("")==0||whichButtonIsClicked==0){
            
            ShowMessage ef = new ShowMessage();
            ef.setVisible(true);
        }
        
        else if(whichButtonIsClicked==1){
            
            if(searchStudent()==true){
                
                ExamSelectionMenu mm;
                try {
                    mm = new ExamSelectionMenu(findMember());
                    mm.setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(LogInMenu.class.getName()).log(Level.SEVERE, null, ex);
                }
                this.setVisible(false);
                
            }
            
            else{
                ShowMessage ef = new ShowMessage("Invalid Username or Password");
                ef.setVisible(true);
            }
        }
        
        else if(whichButtonIsClicked==2){
            
            //System.out.println("HERE");
            
            if(searchAdmin()==true){
                
                AdminPanel mm = new AdminPanel();
                this.setVisible(false);
                mm.setVisible(true);
            }
            
            else{
                
                System.out.println("Yes");
                ShowMessage ef = new ShowMessage("Invalid Username or Password");
                ef.setVisible(true);
            }
        }
        
        
    }//GEN-LAST:event_buttonLogInActionPerformed

    private void radioButtonStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonStudentActionPerformed
        whichButtonIsClicked = 1;
    }//GEN-LAST:event_radioButtonStudentActionPerformed

    private void radioButtonStudent1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonStudent1ActionPerformed
        whichButtonIsClicked = 2;
    }//GEN-LAST:event_radioButtonStudent1ActionPerformed

    private void buttonSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSignUpActionPerformed
        
        SignUpForm suf = new SignUpForm();
        suf.setVisible(true);
        dispose();
    }//GEN-LAST:event_buttonSignUpActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogInMenu().setVisible(true);
            }
        });
    }
    
    private static int whichButtonIsClicked = 0;
    private static String path = "AdminInformation.txt";
    private static ArrayList<MemberInfo> arrayListMember=new ArrayList<MemberInfo>();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private static javax.swing.JButton buttonLogIn;
    private static javax.swing.JButton buttonSignUp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private static javax.swing.JRadioButton radioButtonStudent;
    private static javax.swing.JRadioButton radioButtonStudent1;
    private static javax.swing.JTextField userName;
    private static javax.swing.JPasswordField userPassword;
    // End of variables declaration//GEN-END:variables
}
