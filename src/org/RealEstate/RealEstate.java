/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.RealEstate;

import java.awt.HeadlessException;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.*;
import javax.swing.JOptionPane;
import java.util.logging.Level;
import java.util.logging.Logger;


public class RealEstate extends javax.swing.JFrame {

    public RealEstate() {
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

        jPanel2 = new javax.swing.JPanel();
        btnReset = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnFind = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblLotNumber = new javax.swing.JLabel();
        lotNumber = new javax.swing.JTextField();
        lblFirstName = new javax.swing.JLabel();
        firstName = new javax.swing.JTextField();
        lblLastName = new javax.swing.JLabel();
        lastName = new javax.swing.JTextField();
        lblPrice = new javax.swing.JLabel();
        price = new javax.swing.JTextField();
        lblSquareFeet = new javax.swing.JLabel();
        squareFeet = new javax.swing.JTextField();
        lblNoOfBedrooms = new javax.swing.JLabel();
        noOfBedrooms = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().setLayout(null);

        jPanel2.setOpaque(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(440, 510));
        jPanel2.setLayout(null);

        btnReset.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnReset.setText("RESET");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        jPanel2.add(btnReset);
        btnReset.setBounds(20, 310, 200, 50);

        btnAdd.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel2.add(btnAdd);
        btnAdd.setBounds(20, 370, 200, 50);

        btnNext.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnNext.setText("NEXT");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        jPanel2.add(btnNext);
        btnNext.setBounds(220, 310, 200, 50);

        btnDelete.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel2.add(btnDelete);
        btnDelete.setBounds(220, 370, 200, 50);

        btnClear.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnClear.setText("CLEAR");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel2.add(btnClear);
        btnClear.setBounds(20, 430, 200, 50);

        btnFind.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnFind.setText("FIND");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });
        jPanel2.add(btnFind);
        btnFind.setBounds(220, 430, 200, 50);

        jLabel7.setBackground(new java.awt.Color(102, 102, 255));
        jLabel7.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("HOUSE INFORMATION");
        jLabel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jLabel7);
        jLabel7.setBounds(130, 40, 180, 43);

        jPanel1.setOpaque(false);

        lblLotNumber.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblLotNumber.setForeground(new java.awt.Color(255, 255, 255));
        lblLotNumber.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblLotNumber.setText("Lot Number:");

        lotNumber.setMaximumSize(new java.awt.Dimension(2147483630, 2147483647));
        lotNumber.setName("lotNumber"); // NOI18N
        lotNumber.setPreferredSize(new java.awt.Dimension(10, 20));
        lotNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lotNumberKeyPressed(evt);
            }
        });

        lblFirstName.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblFirstName.setForeground(new java.awt.Color(255, 255, 255));
        lblFirstName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblFirstName.setText("First Name:");

        firstName.setMaximumSize(new java.awt.Dimension(2147483630, 2147483647));
        firstName.setName(""); // NOI18N
        firstName.setPreferredSize(new java.awt.Dimension(10, 20));

        lblLastName.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblLastName.setForeground(new java.awt.Color(255, 255, 255));
        lblLastName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblLastName.setText("Last Name:");

        lastName.setMaximumSize(new java.awt.Dimension(2147483630, 2147483647));
        lastName.setName(""); // NOI18N
        lastName.setPreferredSize(new java.awt.Dimension(10, 20));

        lblPrice.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblPrice.setForeground(new java.awt.Color(255, 255, 255));
        lblPrice.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPrice.setText("Price:");

        price.setMaximumSize(new java.awt.Dimension(2147483630, 2147483647));
        price.setName(""); // NOI18N
        price.setPreferredSize(new java.awt.Dimension(10, 20));

        lblSquareFeet.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblSquareFeet.setForeground(new java.awt.Color(255, 255, 255));
        lblSquareFeet.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSquareFeet.setText("Square Feet:");

        squareFeet.setMaximumSize(new java.awt.Dimension(2147483630, 2147483647));
        squareFeet.setName(""); // NOI18N
        squareFeet.setPreferredSize(new java.awt.Dimension(10, 20));
        squareFeet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                squareFeetKeyPressed(evt);
            }
        });

        lblNoOfBedrooms.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblNoOfBedrooms.setForeground(new java.awt.Color(255, 255, 255));
        lblNoOfBedrooms.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNoOfBedrooms.setText("No. of Bedrooms:");

        noOfBedrooms.setMaximumSize(new java.awt.Dimension(2147483630, 2147483647));
        noOfBedrooms.setName(""); // NOI18N
        noOfBedrooms.setPreferredSize(new java.awt.Dimension(10, 20));
        noOfBedrooms.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                noOfBedroomsKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 7, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lblLotNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(33, 33, 33)
                            .addComponent(lotNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lblFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(33, 33, 33)
                            .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lblLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(33, 33, 33)
                            .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lblPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(33, 33, 33)
                            .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lblSquareFeet, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(33, 33, 33)
                            .addComponent(squareFeet, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lblNoOfBedrooms, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(33, 33, 33)
                            .addComponent(noOfBedrooms, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 7, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 14, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(5, 5, 5)
                            .addComponent(lblLotNumber))
                        .addComponent(lotNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(6, 6, 6)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(5, 5, 5)
                            .addComponent(lblFirstName))
                        .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(6, 6, 6)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(5, 5, 5)
                            .addComponent(lblLastName))
                        .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(6, 6, 6)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(5, 5, 5)
                            .addComponent(lblPrice))
                        .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(6, 6, 6)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(5, 5, 5)
                            .addComponent(lblSquareFeet))
                        .addComponent(squareFeet, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(6, 6, 6)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(5, 5, 5)
                            .addComponent(lblNoOfBedrooms))
                        .addComponent(noOfBedrooms, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 14, Short.MAX_VALUE)))
        );

        jPanel2.add(jPanel1);
        jPanel1.setBounds(20, 90, 400, 220);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/RealEstate/bg.jpg"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(0, 0, 440, 520);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 10, 440, 510);

        setSize(new java.awt.Dimension(450, 570));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed

        try {
            HouseFile obj = new HouseFile();
            obj.find(lotNumber.getText());
            firstName.setText(obj.fNm);
            lastName.setText(obj.lNm);
            price.setText(obj.price);
            squareFeet.setText(obj.sqFt);
            noOfBedrooms.setText(obj.noBeds);

        } catch (Exception ex) {
        }
    }//GEN-LAST:event_btnFindActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        lotNumber.setText("");
        firstName.setText("");
        lastName.setText("");
        price.setText("");
        squareFeet.setText("");
        noOfBedrooms.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            HouseFile obj = new HouseFile();
            obj.delete(lotNumber.getText().toString());
            lotNumber.setText("");
            firstName.setText("");
            lastName.setText("");
            price.setText("");
            squareFeet.setText("");
            noOfBedrooms.setText("");
JOptionPane.showMessageDialog(rootPane,"Record has been deleted");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        // TODO add your handling code here:

        /* Scanner sc;
        try {
            sc = new Scanner(new File("log.txt"));

            List<String> lines = new ArrayList<String>();
            while (sc.hasNextLine()) {
                lines.add(sc.nextLine());
            }

            String[] arr = lines.toArray(new String[0]);

            JOptionPane.showMessageDialog(null, arr);

        } catch (FileNotFoundException ex) {
            Logger.getLogger(RealEstate.class.getName()).log(Level.SEVERE, null, ex);
        }
        */

        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        SortedList sortedFile= new SortedList();
        sortedFile.Listable();
        
        ListHouse obj = new ListHouse();
        ListHouse obj1 = new ListHouse();

        
        
        obj1.compareTo(lotNumber.getText());
        try{
            lotNumber.setText(obj1.ln);
           firstName.setText(obj1.fNm);
           lastName.setText(obj1.lNm);
           price.setText(obj1.price);
           squareFeet.setText(obj1.sqFt);
           noOfBedrooms.setText(obj1.noBeds);
            
        }
        catch(Exception e)
        {}
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
         boolean success = (new File("DataFileSorted.txt")).delete();
        try {
            HouseFile obj = new HouseFile();
            obj.save(lotNumber.getText(), firstName.getText(),lastName.getText(),price.getText(),squareFeet.getText(), noOfBedrooms.getText());
            JOptionPane.showMessageDialog(null, "Record Saved!");
        } catch (HeadlessException ex) {
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        ListHouse obj = new ListHouse();
        try {
            obj.copy();
        } catch (IOException ex) {
            Logger.getLogger(RealEstate.class.getName()).log(Level.SEVERE, null, ex);
        }
        try{

            lotNumber.setText(obj.ln);
            firstName.setText(obj.fNm);
            lastName.setText(obj.lNm);
            price.setText(obj.price);
            squareFeet.setText(obj.sqFt);
            noOfBedrooms.setText(obj.noBeds);
        }
        catch(Exception e)
        {}
    }//GEN-LAST:event_btnResetActionPerformed

    private void noOfBedroomsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_noOfBedroomsKeyPressed
        // TODO add your handling code here:
        noOfBedrooms.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!(Character.isDigit(c) ||
                    (c == KeyEvent.VK_BACK_SPACE) ||
                    (c == KeyEvent.VK_DELETE))) {
                e.consume();
            }
        }
        });
    }//GEN-LAST:event_noOfBedroomsKeyPressed

    private void squareFeetKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_squareFeetKeyPressed
        // TODO add your handling code here:
        squareFeet.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!(Character.isDigit(c) ||
                    (c == KeyEvent.VK_BACK_SPACE) ||
                    (c == KeyEvent.VK_DELETE))) {
                e.consume();
            }
        }
        });
    }//GEN-LAST:event_squareFeetKeyPressed

    private void lotNumberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lotNumberKeyPressed
        // TODO add your handling code here:
        lotNumber.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!(Character.isDigit(c) ||
                    (c == KeyEvent.VK_BACK_SPACE) ||
                    (c == KeyEvent.VK_DELETE))) {
                e.consume();
            }
        }
        });
    }//GEN-LAST:event_lotNumberKeyPressed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_formWindowClosed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {       
        new RealEstate();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new RealEstate().setVisible(true);
            }
        });
        
        
        
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnReset;
    private javax.swing.JTextField firstName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField lastName;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblLotNumber;
    private javax.swing.JLabel lblNoOfBedrooms;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblSquareFeet;
    private javax.swing.JTextField lotNumber;
    private javax.swing.JTextField noOfBedrooms;
    private javax.swing.JTextField price;
    private javax.swing.JTextField squareFeet;
    // End of variables declaration//GEN-END:variables
}
