/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aidan
 */
public class MatchDialog extends javax.swing.JDialog {
  
  /**
   * Creates new form MatchDialog
   */
  public MatchDialog(java.awt.Frame parent, boolean modal) {
    super(parent, modal);
    initComponents();
  }
  
  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
    
    player1Prompt = new javax.swing.JLabel();
    player1TextField = new javax.swing.JTextField();
    player2Prompt = new javax.swing.JLabel();
    player2TextField = new javax.swing.JTextField();
    submit = new javax.swing.JButton();
    errorLabel = new javax.swing.JLabel();
    matchNo = new javax.swing.JLabel();
    
    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    
    player1Prompt.setText("Player 1:");
    
    player2Prompt.setText("Player 2:");
    
    player2TextField.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        player2TextFieldActionPerformed(evt);
      }
    });
    
    submit.setText("Submit");
    submit.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        submitActionPerformed(evt);
      }
    });
    
    matchNo.setText("Match #1");
    
    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
                              layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                            .addContainerGap()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                    .addComponent(errorLabel)
                                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 265, Short.MAX_VALUE)
                                                                    .addComponent(submit)
                                                                    .addContainerGap())
                                                        .addGroup(layout.createSequentialGroup()
                                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                .addComponent(player1Prompt)
                                                                                .addComponent(player2Prompt)
                                                                                .addComponent(player1TextField, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                                                                .addComponent(player2TextField))
                                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                    .addComponent(matchNo)
                                                                    .addGap(88, 88, 88))))
                             );
    layout.setVerticalGroup(
                            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(layout.createSequentialGroup()
                                          .addContainerGap()
                                          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                      .addComponent(player1Prompt)
                                                      .addComponent(matchNo))
                                          .addGap(18, 18, 18)
                                          .addComponent(player1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addGap(18, 18, 18)
                                          .addComponent(player2Prompt)
                                          .addGap(18, 18, 18)
                                          .addComponent(player2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                                          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                      .addComponent(submit, javax.swing.GroupLayout.Alignment.TRAILING)
                                                      .addComponent(errorLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                                          .addContainerGap())
                           );
    
    pack();
  }// </editor-fold>//GEN-END:initComponents
  
  /**
   * This function is called if a particular action is done to player2TextField, but
   * it is empty
   * 
   * @param   evt  the ActionEvent that triggers the function
   */
  private void player2TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player2TextFieldActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_player2TextFieldActionPerformed
  
  /**
   * This function is called if the Submit button is pressed and makes the
   * Dialog box no longer visible
   * 
   * @param   evt  the ActionEvent that triggers the function
   */
  private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
    setVisible(false);
  }//GEN-LAST:event_submitActionPerformed
  
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
      java.util.logging.Logger.getLogger(MatchDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(MatchDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(MatchDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(MatchDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    
    /* Create and display the dialog */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        MatchDialog dialog = new MatchDialog(new javax.swing.JFrame(), true);
        dialog.addWindowListener(new java.awt.event.WindowAdapter() {
          @Override
          public void windowClosing(java.awt.event.WindowEvent e) {
            System.exit(0);
          }
        });
        dialog.setVisible(true);
      }
    });
  }
  
  /**
   * Returns the name provided by the user in player1TextField
   * 
   * @return   the content of the player1TextField
   * @see      #player1TextField
   */
  public String getPlayer1(){
    return player1TextField.getText();
  }
  
  /**
   * Returns the name provided by the user in player2TextField
   * 
   * @return   the content of the player2TextField
   * @see      #player2TextField
   */  
  public String getPlayer2(){
    return player2TextField.getText();
  }
  
  /**
   * Changes the value of errorLabel to reveal that an error has occurred
   * and the user needs to input again
   * 
   * @see    #errorLabel1
   */
  public void setError(boolean choice){
    if(choice){
      errorLabel.setText("One of those names did not parse");
    }
    else{
      errorLabel.setText("");
    }
  }
  /**
   * Sets the text of matchNo to reveal which numbered match the user is
   * entering
   * 
   * @see     #matchNo
   */
  public void setMatchNo(int n){
    matchNo.setText("Match #" + n);
  }
  
  // Variables declaration - do not modify//GEN-BEGIN:variables
  
  /**
   * This JLabel indicates whether or not an error has occurred
   */
  private javax.swing.JLabel errorLabel;
  
  /**
   * This JLabel indicates which match number the user is entering
   */
  private javax.swing.JLabel matchNo;
  
  /**
   * This JLabel holds the prompt for the user to enter the first player
   * name
   */
  private javax.swing.JLabel player1Prompt;
  
  /**
   * This JTextField takes in the first player name provided by the user
   * 
   * @see   #getPlayer1()
   */
  private javax.swing.JTextField player1TextField;
  
  /**
   * This JLabel holds the prompt for the user to enter the second
   * player name
   */
  private javax.swing.JLabel player2Prompt;
  
  /**
   * This JTextField takes in the second player name provided by the user
   * 
   * @see   #getPLayer2()
   */
  private javax.swing.JTextField player2TextField;
  
  /**
   * This JButton is the trigger to close the window and extract the user
   * provided data.
   * 
   * @see   #submitActionPerformed(java.awt.event.ActionEvent)
   */
  private javax.swing.JButton submit;
  // End of variables declaration//GEN-END:variables
}
