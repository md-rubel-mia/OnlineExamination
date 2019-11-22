
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MainMenu extends javax.swing.JFrame {

    public MainMenu() {
        initComponents();
    }
    
    public MainMenu(boolean a){
        
        initComponents();
        this.isAdmin = a;
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelMainText = new javax.swing.JLabel();
        ButtonStartExam = new javax.swing.JButton();
        ButtonAdmin = new javax.swing.JButton();
        ButtonExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LabelMainText.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
        LabelMainText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelMainText.setText("ONLINE EXAMINATION");

        ButtonStartExam.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        ButtonStartExam.setText("Start Exam");
        ButtonStartExam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonStartExamActionPerformed(evt);
            }
        });

        ButtonAdmin.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        ButtonAdmin.setText("Admin");
        ButtonAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAdminActionPerformed(evt);
            }
        });

        ButtonExit.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        ButtonExit.setText("Exit");
        ButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LabelMainText, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ButtonStartExam, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                            .addComponent(ButtonAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ButtonExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(LabelMainText, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127)
                .addComponent(ButtonStartExam, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(ButtonAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(ButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(171, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonExitActionPerformed
        
        System.exit(0);
        
    }//GEN-LAST:event_ButtonExitActionPerformed

    private void ButtonStartExamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonStartExamActionPerformed
        this.setVisible(false);
        ExamSelectionMenu sem;
        try {
            sem = new ExamSelectionMenu();
            sem.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_ButtonStartExamActionPerformed

    private void ButtonAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAdminActionPerformed
        
        if(isAdmin==false){
            
            Resticted re = new Resticted();
            
            re.setVisible(true);
            
        }
        
        else{
            this.setVisible(false);
            AdminPanel ap = new AdminPanel();
            ap.setVisible(true);
        }
    }//GEN-LAST:event_ButtonAdminActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }
    
    private static boolean isAdmin;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAdmin;
    private javax.swing.JButton ButtonExit;
    private javax.swing.JButton ButtonStartExam;
    private javax.swing.JLabel LabelMainText;
    // End of variables declaration//GEN-END:variables
}
