package hotel;

import java.util.Date;


public class AdminHotel extends javax.swing.JFrame {
    
    static int hargaKamar = 0;
    static float subTotal = 0;

    private void formLoad()
    {
        txnama.setText("");
        txalamat.setText("");
        tipekamar.setSelectedItem("Pilih Tipe Kamar");
        kamarno.setSelectedItem("Pilih Nomor Kamar");
        txlama.setText("");
        txtotal.setText("Rp.0");

        Date hariIni = new Date();
        float today = hariIni.getDay();
        
        if (today == 6 || today == 7)
        {
          txdiskon.setText("0%");
        }
        else
        {
           txdiskon.setText("10%");
        }
        txtotall.setText("Rp.0");
    }
    
    
    public AdminHotel() {
        initComponents();
        formLoad();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tipekamar = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        kamarno = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txnama = new javax.swing.JTextField();
        txalamat = new javax.swing.JTextField();
        txlama = new javax.swing.JTextField();
        txtotal = new javax.swing.JTextField();
        txdiskon = new javax.swing.JTextField();
        txtotall = new javax.swing.JTextField();
        btpesan = new javax.swing.JButton();
        btreset = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("JetBrains Mono", 1, 24)); // NOI18N
        jLabel1.setText("SEWA KAMAR HOTEL");

        jLabel2.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jLabel2.setText("Nama:");

        jLabel3.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jLabel3.setText("Alamat :");

        jLabel4.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jLabel4.setText("Tipe Kamar :");

        tipekamar.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        tipekamar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Tipe Kamar", "Deluxe", "Luxury", "Superior" }));
        tipekamar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipekamarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jLabel5.setText("Kamar No :");

        kamarno.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        kamarno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Nomor Kamar", "101", "102", "103", "201", "202", "203" }));

        jLabel6.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jLabel6.setText("Lama Inap :");

        jLabel7.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jLabel7.setText("Sub Total :");

        jLabel8.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jLabel8.setText("Diskon :");

        jLabel9.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jLabel9.setText("Total :");

        txalamat.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        txlama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txlamaActionPerformed(evt);
            }
        });
        txlama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txlamaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txlamaKeyReleased(evt);
            }
        });

        txtotal.setEditable(false);

        txdiskon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txdiskonActionPerformed(evt);
            }
        });

        txtotall.setEditable(false);
        txtotall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtotallActionPerformed(evt);
            }
        });

        btpesan.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        btpesan.setText("Pesan");
        btpesan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btpesanActionPerformed(evt);
            }
        });

        btreset.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        btreset.setText("Reset");
        btreset.setName(""); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tipekamar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(kamarno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txalamat)
                        .addComponent(txlama)
                        .addComponent(txnama)
                        .addComponent(txtotal)
                        .addComponent(txdiskon, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                        .addComponent(txtotall, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btpesan, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(btreset, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(138, 138, 138))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txalamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tipekamar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(kamarno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txlama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txdiskon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(txtotall, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btpesan)
                    .addComponent(btreset))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btpesanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btpesanActionPerformed
        if(txdiskon.getText().equals("10%")) {
            float potonganHarga = subTotal * 10 / 100;
            System.out.println(potonganHarga);
            subTotal = subTotal - potonganHarga;
            txtotall.setText("Rp. " + subTotal);
        } else {
            txtotall.setText("Rp. " + subTotal);
        }
    }//GEN-LAST:event_btpesanActionPerformed

    private void tipekamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipekamarActionPerformed
       String tipeKamar = tipekamar.getSelectedItem().toString();
       if (tipeKamar.equals("Deluxe"))
       {
           hargaKamar = 3000000;
       }
       else if (tipeKamar.equals("Luxury"))
       {
           hargaKamar = 4000000;
       }
       else 
       {
           hargaKamar = 5000000;
       }
               
               
    }//GEN-LAST:event_tipekamarActionPerformed

    private void txlamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txlamaActionPerformed
        
        
        
    }//GEN-LAST:event_txlamaActionPerformed

    private void txlamaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txlamaKeyPressed
        
    }//GEN-LAST:event_txlamaKeyPressed

    private void txlamaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txlamaKeyReleased
        if(txlama.getText().equals(""))
        {
            txtotal.setText("Rp.0");
        } 
        else 
        {
            int lamaInap = Integer.parseInt(txlama.getText());
            subTotal = hargaKamar * lamaInap;
            txtotal.setText("Rp. " + subTotal);
        }
    }//GEN-LAST:event_txlamaKeyReleased

    private void txdiskonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txdiskonActionPerformed
        
    }//GEN-LAST:event_txdiskonActionPerformed

    private void txtotallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtotallActionPerformed
  
    }//GEN-LAST:event_txtotallActionPerformed

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
            java.util.logging.Logger.getLogger(AdminHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminHotel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btpesan;
    private javax.swing.JButton btreset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JComboBox<String> kamarno;
    private javax.swing.JComboBox<String> tipekamar;
    private javax.swing.JTextField txalamat;
    private javax.swing.JTextField txdiskon;
    private javax.swing.JTextField txlama;
    private javax.swing.JTextField txnama;
    private javax.swing.JTextField txtotal;
    private javax.swing.JTextField txtotall;
    // End of variables declaration//GEN-END:variables
}
