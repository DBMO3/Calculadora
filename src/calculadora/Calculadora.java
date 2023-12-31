package calculadora;

import com.formdev.flatlaf.FlatLightLaf;
import org.nfunk.jep.JEP;

public class Calculadora extends javax.swing.JFrame { 
    // Library JEP
    private boolean inputNumber = false;
    private final JEP jep;
    
    /**
     * Creates new form Calculadora
     */
    public Calculadora() {
        initComponents();
        
        // Start JEP
        jep = new JEP();
        jep.addStandardFunctions();
        jep.addStandardConstants();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField = new javax.swing.JTextField();
        jPanel = new javax.swing.JPanel();
        jButton_Clear = new javax.swing.JButton();
        jButton_OFF = new javax.swing.JButton();
        jButton_Mod = new javax.swing.JButton();
        jButton_Div = new javax.swing.JButton();
        jButton_N7 = new javax.swing.JButton();
        jButton_N8 = new javax.swing.JButton();
        jButton_N9 = new javax.swing.JButton();
        jButton_Mul = new javax.swing.JButton();
        jButton_N4 = new javax.swing.JButton();
        jButton_N5 = new javax.swing.JButton();
        jButton_N6 = new javax.swing.JButton();
        jButton_Min = new javax.swing.JButton();
        jButton_N1 = new javax.swing.JButton();
        jButton_N2 = new javax.swing.JButton();
        jButton_N3 = new javax.swing.JButton();
        jButton_Plus = new javax.swing.JButton();
        jButton_N0 = new javax.swing.JButton();
        jButton_Dot = new javax.swing.JButton();
        jButton_Equals = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");

        jTextField.setEditable(false);
        jTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jButton_Clear.setText("C");
        jButton_Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ClearActionPerformed(evt);
            }
        });

        jButton_OFF.setText("OFF");
        jButton_OFF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_OFFActionPerformed(evt);
            }
        });

        jButton_Mod.setText("%");
        jButton_Mod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ModActionPerformed(evt);
            }
        });

        jButton_Div.setText("/");
        jButton_Div.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DivActionPerformed(evt);
            }
        });

        jButton_N7.setText("7");
        jButton_N7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_N7ActionPerformed(evt);
            }
        });

        jButton_N8.setText("8");
        jButton_N8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_N8ActionPerformed(evt);
            }
        });

        jButton_N9.setText("9");
        jButton_N9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_N9ActionPerformed(evt);
            }
        });

        jButton_Mul.setText("*");
        jButton_Mul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_MulActionPerformed(evt);
            }
        });

        jButton_N4.setText("4");
        jButton_N4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_N4ActionPerformed(evt);
            }
        });

        jButton_N5.setText("5");
        jButton_N5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_N5ActionPerformed(evt);
            }
        });

        jButton_N6.setText("6");
        jButton_N6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_N6ActionPerformed(evt);
            }
        });

        jButton_Min.setText("-");
        jButton_Min.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_MinActionPerformed(evt);
            }
        });

        jButton_N1.setText("1");
        jButton_N1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_N1ActionPerformed(evt);
            }
        });

        jButton_N2.setText("2");
        jButton_N2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_N2ActionPerformed(evt);
            }
        });

        jButton_N3.setText("3");
        jButton_N3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_N3ActionPerformed(evt);
            }
        });

        jButton_Plus.setText("+");
        jButton_Plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_PlusActionPerformed(evt);
            }
        });

        jButton_N0.setText("0");
        jButton_N0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_N0ActionPerformed(evt);
            }
        });

        jButton_Dot.setText(".");
        jButton_Dot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DotActionPerformed(evt);
            }
        });

        jButton_Equals.setText("=");
        jButton_Equals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EqualsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton_N1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(jButton_N4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_N7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_Clear, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_N0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton_N8, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(jButton_N5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_N2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_Dot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_OFF, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_N9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Mod, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_N6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_N3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Equals, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_Plus, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Min, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Mul, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Div, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 1, Short.MAX_VALUE))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Clear)
                    .addComponent(jButton_Div)
                    .addComponent(jButton_Mod)
                    .addComponent(jButton_OFF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_N7)
                    .addComponent(jButton_N8)
                    .addComponent(jButton_N9)
                    .addComponent(jButton_Mul))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_N4)
                    .addComponent(jButton_N5)
                    .addComponent(jButton_N6)
                    .addComponent(jButton_Min))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_N1)
                            .addComponent(jButton_N2)
                            .addComponent(jButton_N3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_N0)
                            .addComponent(jButton_Dot)
                            .addComponent(jButton_Equals)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                        .addComponent(jButton_Plus, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ClearActionPerformed
        jTextField.setText("");
    }//GEN-LAST:event_jButton_ClearActionPerformed

    private void jButton_N7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_N7ActionPerformed
        String text = jTextField.getText();
        jTextField.setText(text + "7");
        inputNumber = true;
    }//GEN-LAST:event_jButton_N7ActionPerformed

    private void jButton_OFFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_OFFActionPerformed
        // Exit
        System.exit(0);
    }//GEN-LAST:event_jButton_OFFActionPerformed

    private void jButton_ModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ModActionPerformed
        if (inputNumber) {
           String text = jTextField.getText();
           if (!text.endsWith("%")) {
               jTextField.setText(text + "%");
           }
       }
    }//GEN-LAST:event_jButton_ModActionPerformed

    private void jButton_DivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DivActionPerformed
        if (inputNumber) {
           String text = jTextField.getText();
           if (!text.endsWith("/")) {
               jTextField.setText(text + "/");
           }
       }
    }//GEN-LAST:event_jButton_DivActionPerformed

    private void jButton_N8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_N8ActionPerformed
        String text = jTextField.getText();
        jTextField.setText(text + "8");
        inputNumber = true;
    }//GEN-LAST:event_jButton_N8ActionPerformed

    private void jButton_N9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_N9ActionPerformed
        String text = jTextField.getText();
        jTextField.setText(text + "9");
        inputNumber = true;
    }//GEN-LAST:event_jButton_N9ActionPerformed

    private void jButton_MulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_MulActionPerformed
        if (inputNumber) {
           String text = jTextField.getText();
           if (!text.endsWith("*")) {
               jTextField.setText(text + "*");
           }
       }
    }//GEN-LAST:event_jButton_MulActionPerformed

    private void jButton_N4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_N4ActionPerformed
        String text = jTextField.getText();
        jTextField.setText(text + "4");
        inputNumber = true;
    }//GEN-LAST:event_jButton_N4ActionPerformed

    private void jButton_N5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_N5ActionPerformed
        String text = jTextField.getText();
        jTextField.setText(text + "5");
        inputNumber = true;
    }//GEN-LAST:event_jButton_N5ActionPerformed

    private void jButton_N6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_N6ActionPerformed
        String text = jTextField.getText();
        jTextField.setText(text + "6");
        inputNumber = true;
    }//GEN-LAST:event_jButton_N6ActionPerformed

    private void jButton_MinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_MinActionPerformed
        if (inputNumber) {
           String text = jTextField.getText();
           if (!text.endsWith("-")) {
               jTextField.setText(text + "-");
           }
       }
    }//GEN-LAST:event_jButton_MinActionPerformed

    private void jButton_N1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_N1ActionPerformed
        String text = jTextField.getText();
        jTextField.setText(text + "1");
        inputNumber = true;
    }//GEN-LAST:event_jButton_N1ActionPerformed

    private void jButton_N2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_N2ActionPerformed
        String text = jTextField.getText();
        jTextField.setText(text + "2");
        inputNumber = true;
    }//GEN-LAST:event_jButton_N2ActionPerformed

    private void jButton_N3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_N3ActionPerformed
        String text = jTextField.getText();
        jTextField.setText(text + "3");
        inputNumber = true;
    }//GEN-LAST:event_jButton_N3ActionPerformed

    private void jButton_N0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_N0ActionPerformed
        String text = jTextField.getText();
        jTextField.setText(text + "0");
        inputNumber = true;
    }//GEN-LAST:event_jButton_N0ActionPerformed

    private void jButton_DotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DotActionPerformed
        String text = jTextField.getText();

        // Get text last after operator
        String[] parts = text.split("[-+*/%]");
        String lastPart = parts[parts.length - 1];

        // Put dot
        if (!lastPart.contains(".")) {
            jTextField.setText(text + ".");
        }
    }//GEN-LAST:event_jButton_DotActionPerformed

    private void jButton_PlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_PlusActionPerformed
        if (inputNumber) {
           String text = jTextField.getText();
           if (!text.endsWith("+")) {
               jTextField.setText(text + "+");
           }
       }
    }//GEN-LAST:event_jButton_PlusActionPerformed

    private void jButton_EqualsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_EqualsActionPerformed
       // Get text
       String expression = jTextField.getText();
       
       // Eval expression
       jep.parseExpression(expression);
       
       // Show error message
       if(!jep.hasError()){
           double result = jep.getValue();
           jTextField.setText(Double.toString(result));
       } else {
           jTextField.setText("Error");
       }
    }//GEN-LAST:event_jButton_EqualsActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        FlatLightLaf.setup();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Calculadora().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Clear;
    private javax.swing.JButton jButton_Div;
    private javax.swing.JButton jButton_Dot;
    private javax.swing.JButton jButton_Equals;
    private javax.swing.JButton jButton_Min;
    private javax.swing.JButton jButton_Mod;
    private javax.swing.JButton jButton_Mul;
    private javax.swing.JButton jButton_N0;
    private javax.swing.JButton jButton_N1;
    private javax.swing.JButton jButton_N2;
    private javax.swing.JButton jButton_N3;
    private javax.swing.JButton jButton_N4;
    private javax.swing.JButton jButton_N5;
    private javax.swing.JButton jButton_N6;
    private javax.swing.JButton jButton_N7;
    private javax.swing.JButton jButton_N8;
    private javax.swing.JButton jButton_N9;
    private javax.swing.JButton jButton_OFF;
    private javax.swing.JButton jButton_Plus;
    private javax.swing.JPanel jPanel;
    private javax.swing.JTextField jTextField;
    // End of variables declaration//GEN-END:variables
}
