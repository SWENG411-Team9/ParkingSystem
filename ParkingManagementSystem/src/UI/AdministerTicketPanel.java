package UI;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Registrant.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;
/**
 *
 * @author chilly.godfrey
 */
public class AdministerTicketPanel extends javax.swing.JPanel {

    /**
     * Creates new form AdministerTicketPanel
     */
    public AdministerTicketPanel() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        licensePlateLabel = new javax.swing.JLabel();
        headingLabel = new javax.swing.JLabel();
        registrationNumberLabel = new javax.swing.JLabel();
        colorLabel = new javax.swing.JLabel();
        makeLabel = new javax.swing.JLabel();
        modelLabel = new javax.swing.JLabel();
        reasonLabel = new javax.swing.JLabel();
        fineLabel = new javax.swing.JLabel();
        badgeNumLabel = new javax.swing.JLabel();
        cancelButton = new javax.swing.JButton();
        regNumTextField = new javax.swing.JTextField();
        makeTextField = new javax.swing.JTextField();
        modelTextField = new javax.swing.JTextField();
        colorTextField = new javax.swing.JTextField();
        reasonScrollPane = new javax.swing.JScrollPane();
        reasonTextArea = new javax.swing.JTextArea();
        licensePlateTextField = new javax.swing.JTextField();
        fineTextField = new javax.swing.JTextField();
        badgeNumTextField = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();
        errorLabel = new javax.swing.JLabel();
        lotLabel = new javax.swing.JLabel();
        parkingLotTextField = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(860, 540));

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(300, 540));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel10)
                .addContainerGap(166, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        licensePlateLabel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        licensePlateLabel.setForeground(new java.awt.Color(20, 20, 20));
        licensePlateLabel.setText("License Plate:");

        headingLabel.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        headingLabel.setForeground(new java.awt.Color(102, 102, 102));
        headingLabel.setText("Administer Ticket");

        registrationNumberLabel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        registrationNumberLabel.setForeground(new java.awt.Color(20, 20, 20));
        registrationNumberLabel.setText("Registration Number:");

        colorLabel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        colorLabel.setForeground(new java.awt.Color(20, 20, 20));
        colorLabel.setText("Color:");

        makeLabel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        makeLabel.setForeground(new java.awt.Color(20, 20, 20));
        makeLabel.setText("Make:");

        modelLabel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        modelLabel.setForeground(new java.awt.Color(20, 20, 20));
        modelLabel.setText("Model:");

        reasonLabel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        reasonLabel.setForeground(new java.awt.Color(20, 20, 20));
        reasonLabel.setText("Violation:");

        fineLabel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        fineLabel.setForeground(new java.awt.Color(20, 20, 20));
        fineLabel.setText("Fine Amount:");

        badgeNumLabel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        badgeNumLabel.setForeground(new java.awt.Color(20, 20, 20));
        badgeNumLabel.setText("Badge Number:");

        cancelButton.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        cancelButton.setText("Cancel");

        reasonTextArea.setColumns(20);
        reasonTextArea.setRows(5);
        reasonScrollPane.setViewportView(reasonTextArea);

        submitButton.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        errorLabel.setForeground(new java.awt.Color(255, 0, 0));
        errorLabel.setPreferredSize(new java.awt.Dimension(7, 12));

        lotLabel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lotLabel.setForeground(new java.awt.Color(20, 20, 20));
        lotLabel.setText("Parking Lot:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(submitButton)
                .addGap(18, 18, 18)
                .addComponent(cancelButton)
                .addGap(49, 49, 49))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(headingLabel)
                    .addComponent(errorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(licensePlateLabel)
                            .addComponent(registrationNumberLabel)
                            .addComponent(makeLabel)
                            .addComponent(modelLabel)
                            .addComponent(colorLabel)
                            .addComponent(reasonLabel)
                            .addComponent(fineLabel)
                            .addComponent(badgeNumLabel)
                            .addComponent(lotLabel))
                        .addGap(63, 63, 63)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(parkingLotTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                            .addComponent(reasonScrollPane, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                            .addComponent(licensePlateTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(regNumTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(makeTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(modelTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(colorTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fineTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(badgeNumTextField, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(headingLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(licensePlateLabel)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(registrationNumberLabel)
                                    .addComponent(regNumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(makeLabel)
                                    .addComponent(makeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(modelLabel)
                                    .addComponent(modelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(colorLabel))
                            .addComponent(colorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(reasonLabel)
                            .addComponent(reasonScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lotLabel)
                            .addComponent(parkingLotTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fineLabel)
                            .addComponent(fineTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(licensePlateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(badgeNumLabel)
                    .addComponent(badgeNumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton)
                    .addComponent(submitButton))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private static Ticket ticket = null;
    
    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        String licenseTemp = this.licensePlateTextField.getText();
        licenseTemp = licenseTemp.toUpperCase();
        for (int i = 0; i < licenseTemp.length(); i++) {
            if ((licenseTemp.charAt(i) >= 48 && licenseTemp.charAt(i) <= 57) || (licenseTemp.charAt(i) >= 65 && licenseTemp.charAt(i) <= 90)) {
                
            }
            else {
                errorLabel.setText("Error: Invalid License Plate");
                return;
            }
        }
        
        String regNumTemp = this.regNumTextField.getText();
        if (regNumTemp.length() != 10) {
            errorLabel.setText("Error: Invalid Registration Number Length");
            return;
        }
        
        double fine = Double.parseDouble(this.fineTextField.getText());
        
        Car carTemp = new Car(licenseTemp, this.makeTextField.getText(), this.modelTextField.getText(), this.colorTextField.getText());
        
        Random rand = new Random();
        String id = String.valueOf(rand.nextInt(9000000) + 1000000);
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate localDate = LocalDate.now();
        ticket = new Ticket(this.licensePlateTextField.getText(), id, this.badgeNumTextField.getText(), this.regNumTextField.getText(), fine, localDate.toString(), this.reasonTextArea.getText(), carTemp, parkingLotTextField.getText());
        ParkingSystem.func = 1;
        return;
    }//GEN-LAST:event_submitButtonActionPerformed
    
    public Ticket getTicket() {
        return ticket;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel badgeNumLabel;
    private javax.swing.JTextField badgeNumTextField;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel colorLabel;
    private javax.swing.JTextField colorTextField;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JLabel fineLabel;
    private javax.swing.JTextField fineTextField;
    private javax.swing.JLabel headingLabel;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel licensePlateLabel;
    private javax.swing.JTextField licensePlateTextField;
    private javax.swing.JLabel lotLabel;
    private javax.swing.JLabel makeLabel;
    private javax.swing.JTextField makeTextField;
    private javax.swing.JLabel modelLabel;
    private javax.swing.JTextField modelTextField;
    private javax.swing.JTextField parkingLotTextField;
    private javax.swing.JLabel reasonLabel;
    private javax.swing.JScrollPane reasonScrollPane;
    private javax.swing.JTextArea reasonTextArea;
    private javax.swing.JTextField regNumTextField;
    private javax.swing.JLabel registrationNumberLabel;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}
