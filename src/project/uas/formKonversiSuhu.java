package project.uas;

import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class formKonversiSuhu extends javax.swing.JFrame {

    public boolean leftSelect = true;

    public formKonversiSuhu() {
        initComponents();
        jTisi.setEditable(false);
        jisi.setEditable(false);
        CBSuhu1.setSelectedItem("°C (Celcius)");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jversi = new javax.swing.JPanel();
        jB5 = new javax.swing.JButton();
        CBSuhu1 = new javax.swing.JComboBox<>();
        jTisi = new javax.swing.JTextField();
        jB2 = new javax.swing.JButton();
        jKoma = new javax.swing.JButton();
        jB0 = new javax.swing.JButton();
        jB3 = new javax.swing.JButton();
        jBdelete = new javax.swing.JButton();
        jAc = new javax.swing.JButton();
        jTo = new javax.swing.JLabel();
        btnKonvers = new javax.swing.JButton();
        CBSuhu2 = new javax.swing.JComboBox<>();
        jB7 = new javax.swing.JButton();
        jisi = new javax.swing.JTextField();
        jB8 = new javax.swing.JButton();
        jB9 = new javax.swing.JButton();
        jB6 = new javax.swing.JButton();
        jB4 = new javax.swing.JButton();
        jB1 = new javax.swing.JButton();
        jBack = new javax.swing.JButton();
        jsuhu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jversi.setBackground(new java.awt.Color(116, 155, 194));

        jB5.setBackground(new java.awt.Color(241, 246, 249));
        jB5.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jB5.setText("5");
        jB5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(197, 223, 248)));
        jB5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB5ActionPerformed(evt);
            }
        });

        CBSuhu1.setBackground(new java.awt.Color(241, 246, 249));
        CBSuhu1.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        CBSuhu1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "°R (Reamur)", "°C (Celcius)", "°F (Fahrenheit)", " K (Kelvin)" }));
        CBSuhu1.setMinimumSize(new java.awt.Dimension(143, 22));
        CBSuhu1.setPreferredSize(new java.awt.Dimension(143, 22));

        jTisi.setColumns(4);
        jTisi.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTisi.setMinimumSize(new java.awt.Dimension(64, 22));
        jTisi.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTisiFocusGained(evt);
            }
        });

        jB2.setBackground(new java.awt.Color(241, 246, 249));
        jB2.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jB2.setText("2");
        jB2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(197, 223, 248)));
        jB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB2ActionPerformed(evt);
            }
        });

        jKoma.setBackground(new java.awt.Color(241, 246, 249));
        jKoma.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jKoma.setText(".");
        jKoma.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(197, 223, 248)));
        jKoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jKomaActionPerformed(evt);
            }
        });

        jB0.setBackground(new java.awt.Color(241, 246, 249));
        jB0.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jB0.setText("0");
        jB0.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(197, 223, 248)));
        jB0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB0ActionPerformed(evt);
            }
        });

        jB3.setBackground(new java.awt.Color(241, 246, 249));
        jB3.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jB3.setText("3");
        jB3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(197, 223, 248)));
        jB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB3ActionPerformed(evt);
            }
        });

        jBdelete.setBackground(new java.awt.Color(197, 223, 248));
        jBdelete.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jBdelete.setForeground(new java.awt.Color(0, 102, 153));
        jBdelete.setText("DELETE");
        jBdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBdeleteActionPerformed(evt);
            }
        });

        jAc.setBackground(new java.awt.Color(197, 223, 248));
        jAc.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jAc.setForeground(new java.awt.Color(0, 102, 153));
        jAc.setText("AC");
        jAc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAcActionPerformed(evt);
            }
        });

        jTo.setFont(new java.awt.Font("Century", 1, 36)); // NOI18N
        jTo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jTo.setText("↓");
        jTo.setMaximumSize(new java.awt.Dimension(32767, 32767));
        jTo.setMinimumSize(new java.awt.Dimension(0, 0));

        btnKonvers.setBackground(new java.awt.Color(197, 223, 248));
        btnKonvers.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnKonvers.setForeground(new java.awt.Color(0, 102, 153));
        btnKonvers.setText("KONVERS");
        btnKonvers.setMaximumSize(new java.awt.Dimension(89, 22));
        btnKonvers.setMinimumSize(new java.awt.Dimension(89, 22));
        btnKonvers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKonversActionPerformed(evt);
            }
        });

        CBSuhu2.setBackground(new java.awt.Color(241, 246, 249));
        CBSuhu2.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        CBSuhu2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "°R (Reamur)", "°C (Celcius)", "°F (Fahrenheit)", " K (Kelvin)" }));
        CBSuhu2.setMinimumSize(new java.awt.Dimension(143, 22));
        CBSuhu2.setPreferredSize(new java.awt.Dimension(143, 22));

        jB7.setBackground(new java.awt.Color(241, 246, 249));
        jB7.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jB7.setText("7");
        jB7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(197, 223, 248)));
        jB7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB7ActionPerformed(evt);
            }
        });

        jisi.setColumns(4);
        jisi.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jisi.setMinimumSize(new java.awt.Dimension(64, 22));

        jB8.setBackground(new java.awt.Color(241, 246, 249));
        jB8.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jB8.setText("8");
        jB8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(197, 223, 248)));
        jB8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB8ActionPerformed(evt);
            }
        });

        jB9.setBackground(new java.awt.Color(241, 246, 249));
        jB9.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jB9.setText("9");
        jB9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(197, 223, 248)));
        jB9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB9ActionPerformed(evt);
            }
        });

        jB6.setBackground(new java.awt.Color(241, 246, 249));
        jB6.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jB6.setText("6");
        jB6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(197, 223, 248)));
        jB6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB6ActionPerformed(evt);
            }
        });

        jB4.setBackground(new java.awt.Color(241, 246, 249));
        jB4.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jB4.setText("4");
        jB4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(197, 223, 248)));
        jB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB4ActionPerformed(evt);
            }
        });

        jB1.setBackground(new java.awt.Color(241, 246, 249));
        jB1.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jB1.setText("1");
        jB1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(197, 223, 248)));
        jB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB1ActionPerformed(evt);
            }
        });

        jBack.setBackground(new java.awt.Color(241, 246, 249));
        jBack.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jBack.setText("BACK");
        jBack.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(197, 223, 248), 3));
        jBack.setMaximumSize(new java.awt.Dimension(39, 20));
        jBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBackActionPerformed(evt);
            }
        });

        jsuhu.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jsuhu.setText("KONVERSI SUHU");

        javax.swing.GroupLayout jversiLayout = new javax.swing.GroupLayout(jversi);
        jversi.setLayout(jversiLayout);
        jversiLayout.setHorizontalGroup(
            jversiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jversiLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jversiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jversiLayout.createSequentialGroup()
                        .addGroup(jversiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jversiLayout.createSequentialGroup()
                                .addComponent(jB1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jB2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jB3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jversiLayout.createSequentialGroup()
                                .addComponent(jB4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jB5, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jB6, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jversiLayout.createSequentialGroup()
                                .addComponent(jB7, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jB8, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jB9, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(13, 13, 13))
                    .addGroup(jversiLayout.createSequentialGroup()
                        .addComponent(jTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(btnKonvers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(jversiLayout.createSequentialGroup()
                .addGroup(jversiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jversiLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jversiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jversiLayout.createSequentialGroup()
                                .addGroup(jversiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(CBSuhu2, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CBSuhu1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jversiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTisi, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                                    .addComponent(jisi, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)))
                            .addGroup(jversiLayout.createSequentialGroup()
                                .addComponent(jBack, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(jsuhu, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jversiLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jAc, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBdelete, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jversiLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jB0, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jKoma, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jversiLayout.setVerticalGroup(
            jversiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jversiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jversiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jsuhu)
                    .addComponent(jBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jversiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBSuhu1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jversiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jversiLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(btnKonvers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jversiLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)))
                .addGroup(jversiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBSuhu2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jversiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jAc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBdelete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jversiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB8, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB9, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jversiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jversiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jversiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jKoma, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB0, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jversi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jversi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jKomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jKomaActionPerformed
        // TODO add your handling code here:
        if (leftSelect) {
            if (jTisi.getText().length() != 0) {
                jTisi.setText(jTisi.getText() + '.');
            }
        }
    }//GEN-LAST:event_jKomaActionPerformed

    private void jB0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB0ActionPerformed
        // TODO add your handling code here:
        if (leftSelect) {
            jTisi.setText(jTisi.getText() + '0');
        }
    }//GEN-LAST:event_jB0ActionPerformed

    private void jB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB1ActionPerformed
        // TODO add your handling code here:
        if (leftSelect) {
            jTisi.setText(jTisi.getText() + '1');
        }
    }//GEN-LAST:event_jB1ActionPerformed

    private void jB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB2ActionPerformed
        // TODO add your handling code here:
        if (leftSelect) {
            jTisi.setText(jTisi.getText() + '2');
        }
    }//GEN-LAST:event_jB2ActionPerformed

    private void jB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB3ActionPerformed
        // TODO add your handling code here:
        if (leftSelect) {
            jTisi.setText(jTisi.getText() + '3');
        }
    }//GEN-LAST:event_jB3ActionPerformed

    private void jB4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB4ActionPerformed
        // TODO add your handling code here:
        if (leftSelect) {
            jTisi.setText(jTisi.getText() + '4');
        }
    }//GEN-LAST:event_jB4ActionPerformed

    private void jB5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB5ActionPerformed
        // TODO add your handling code here:
        if (leftSelect) {
            jTisi.setText(jTisi.getText() + '5');
        }
    }//GEN-LAST:event_jB5ActionPerformed

    private void jB6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB6ActionPerformed
        // TODO add your handling code here:
        if (leftSelect) {
            jTisi.setText(jTisi.getText() + '6');
        }
    }//GEN-LAST:event_jB6ActionPerformed

    private void kembaliKeFormUtama() {
        // Close the current form (formKonversiData)
        this.dispose();

        // Create and display the formUtama
        FormUtama formUtama = new FormUtama();
        formUtama.setVisible(true);
    }

    private void jB7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB7ActionPerformed
        // TODO add your handling code here:
        if (leftSelect) {
            jTisi.setText(jTisi.getText() + '7');
        }
    }//GEN-LAST:event_jB7ActionPerformed

    private void jB8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB8ActionPerformed
        // TODO add your handling code here:
        if (leftSelect) {
            jTisi.setText(jTisi.getText() + '8');
        }
    }//GEN-LAST:event_jB8ActionPerformed

    private void jB9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB9ActionPerformed
        // TODO add your handling code here:
        if (leftSelect) {
            jTisi.setText(jTisi.getText() + '9');
        }
    }//GEN-LAST:event_jB9ActionPerformed

    private void jTisiFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTisiFocusGained
        // TODO add your handling code here:
        leftSelect = true;
    }//GEN-LAST:event_jTisiFocusGained

    private void jBdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBdeleteActionPerformed
        // TODO add your handling code here:
        // untuk menghapus satu persatu kolom hasil konversi sebelah kiri
        if (leftSelect) {
            String str = jTisi.getText();
            String newstr = str.substring(0, str.length() - 1);
            jTisi.setText(newstr);
        }
    }//GEN-LAST:event_jBdeleteActionPerformed

    private void jAcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAcActionPerformed
        // TODO add your handling code here:
        // untuk kolom hasil konversi sebelah kiri
        if (leftSelect) {
            jTisi.setText(null);
            jisi.setText(null);
        }
    }//GEN-LAST:event_jAcActionPerformed

    private void btnKonversActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKonversActionPerformed
        int operator1 = CBSuhu1.getSelectedIndex();
        int operator2 = CBSuhu2.getSelectedIndex();
        if (operator1 == operator2) {
            JOptionPane.showMessageDialog(this, "Unit selections tidak boleh sama", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Exit the method to avoid further processing
        }
        // TODO add your handling code here:

        float kolom = Float.parseFloat(jTisi.getText());
        float result = 0;
        if (operator1 == 0 && operator2 == 0) {
            result = kolom;
        } else if (operator1 == 0 && operator2 == 1) {
            result = (5 / 4f) * kolom;
        } else if (operator1 == 0 && operator2 == 2) {
            result = (9 / 4f) * kolom + 32;
        } else if (operator1 == 0 && operator2 == 3) {
            result = (5 / 4f) * kolom + 273;
        }
        if (operator1 == 1 && operator2 == 0) {
            result = (4 / 5f) * kolom;
        } else if (operator1 == 1 && operator2 == 1) {
            result = kolom;
        } else if (operator1 == 1 && operator2 == 2) {
            result = (9 / 4f) * kolom + 32;
        } else if (operator1 == 1 && operator2 == 3) {
            result = kolom + 273;
        }
        if (operator1 == 2 && operator2 == 0) {
            result = 4 / 9f * (kolom - 32);
        } else if (operator1 == 2 && operator2 == 1) {
            result = 5 / 9f * (kolom - 32);
        } else if (operator1 == 2 && operator2 == 2) {
            result = kolom;
        } else if (operator1 == 2 && operator2 == 3) {
            result = 5 / 9f * (kolom - 32) + 273;
        }
        if (operator1 == 3 && operator2 == 0) {
            result = 4 / 5f * (kolom - 273);
        } else if (operator1 == 3 && operator2 == 1) {
            result = kolom - 273;
        } else if (operator1 == 3 && operator2 == 2) {
            result = 9 / 5f * (kolom - 273) + 32;
        } else if (operator1 == 3 && operator2 == 3) {
            result = kolom;
        }
        jisi.setText(Float.toString(result));
    }//GEN-LAST:event_btnKonversActionPerformed

    private void jBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBackActionPerformed
        // TODO add your handling code here:
        kembaliKeFormUtama();
    }//GEN-LAST:event_jBackActionPerformed

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
            java.util.logging.Logger.getLogger(formKonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formKonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formKonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formKonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formKonversiSuhu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBSuhu1;
    private javax.swing.JComboBox<String> CBSuhu2;
    private javax.swing.JButton btnKonvers;
    private javax.swing.JButton jAc;
    private javax.swing.JButton jB0;
    private javax.swing.JButton jB1;
    private javax.swing.JButton jB2;
    private javax.swing.JButton jB3;
    private javax.swing.JButton jB4;
    private javax.swing.JButton jB5;
    private javax.swing.JButton jB6;
    private javax.swing.JButton jB7;
    private javax.swing.JButton jB8;
    private javax.swing.JButton jB9;
    private javax.swing.JButton jBack;
    private javax.swing.JButton jBdelete;
    private javax.swing.JButton jKoma;
    private javax.swing.JTextField jTisi;
    private javax.swing.JLabel jTo;
    private javax.swing.JTextField jisi;
    private javax.swing.JLabel jsuhu;
    private javax.swing.JPanel jversi;
    // End of variables declaration//GEN-END:variables
}
