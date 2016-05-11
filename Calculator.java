import java.util.Scanner;
import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JFrame {

    public Calculator()
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

      Action keyEnter = new AbstractAction() {
        public void actionPerformed(ActionEvent e) {
          btnEqualActionPerformed();
        }
      };

        jPanel1 = new JPanel();
        btn1 = new JButton();
        btn2 = new JButton();
        btn3 = new JButton();
        btn4 = new JButton();
        btn5 = new JButton();
        btn7 = new JButton();
        btn8 = new JButton();
        btn9 = new JButton();
        btn0 = new JButton();
        btnPlus = new JButton();
        btnMinus = new JButton();
        btnProduct = new JButton();
        btnDivide = new JButton();
        btnDel = new JButton();
        clear = new JButton();
        btn6 = new JButton();
        calculation = new JTextField();
        btnEqual = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        btn1.setText("1");
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setText("2");
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setText("3");
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn4.setText("4");
        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setText("5");
        btn5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn7.setText("7");
        btn7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setText("8");
        btn8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setText("9");
        btn9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn0.setText("0");
        btn0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        calculation.getInputMap().put(KeyStroke.getKeyStroke("Enter"), keyEnter);

        btnPlus.setText("+");
        btnPlus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnPlusActionPerformed(evt);
            }
        });

        btnMinus.setText("-");
        btnMinus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnMinusActionPerformed(evt);
            }
        });

        btnProduct.setText("x");
        btnProduct.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnProductActionPerformed(evt);
            }
        });

        btnDivide.setText("/");
        btnDivide.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnDivideActionPerformed(evt);
            }
        });

        btnDel.setText("Del");
        btnDel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });

        clear.setText("Clear all");
        clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        btn6.setText("6");
        btn6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btnEqual.setText("=");
        btnEqual.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnEqualActionPerformed(evt);
            }
        });

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(btn0)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn7)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn8)))
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn9)
                                .addGap(18, 18, 18)
                                .addComponent(btnEqual, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(clear, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btn4)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn5)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn6)
                            .addGap(18, 18, 18)
                            .addComponent(btnProduct)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDivide))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(calculation)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnDel))
                                .addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(btn1)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn2)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn3)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnPlus)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnMinus)))
                            .addGap(0, 0, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(btnDel)
                    .addComponent(calculation, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1)
                    .addComponent(btn3)
                    .addComponent(btn2)
                    .addComponent(btnPlus)
                    .addComponent(btnMinus))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(btn5)
                    .addComponent(btn4)
                    .addComponent(btnProduct)
                    .addComponent(btnDivide)
                    .addComponent(btn6))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(btn7)
                    .addComponent(btn8)
                    .addComponent(btn9)
                    .addComponent(btnEqual))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(btn0)
                    .addComponent(clear))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn0ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        String text = calculation.getText();
        calculation.setText(text + 0);
    }//GEN-LAST:event_btn0ActionPerformed

    private void btn1ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        String text = calculation.getText();
        calculation.setText(text + 1);
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        String text = calculation.getText();
        calculation.setText(text + 2);
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        String text = calculation.getText();
        calculation.setText(text + 3);
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        String text = calculation.getText();
        calculation.setText(text + 4);
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        String text = calculation.getText();
        calculation.setText(text + 5);
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        String text = calculation.getText();
        calculation.setText(text + 6);
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        String text = calculation.getText();
        calculation.setText(text + 7);
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        String text = calculation.getText();
        calculation.setText(text + 8);
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        String text = calculation.getText();
        calculation.setText(text + 9);
    }//GEN-LAST:event_btn9ActionPerformed

    private void clearActionPerformed(ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        calculation.setText("");
    }//GEN-LAST:event_clearActionPerformed

    private void btnDelActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed

        char[] text = calculation.getText().toCharArray();

        if (text.length != 0)
        {
            char[] newText = new char[(text.length - 1)];

            for (int i = 0; i < newText.length; i++)
            {
                newText[i] = text[i];
            }
            String a = new String(newText);
            calculation.setText(a);
        }
    }//GEN-LAST:event_btnDelActionPerformed

    private void btnPlusActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnPlusActionPerformed
        String text = calculation.getText();
        calculation.setText(text + "+");
    }//GEN-LAST:event_btnPlusActionPerformed

    private void btnMinusActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnMinusActionPerformed
        String text = calculation.getText();
        calculation.setText(text + "-");
    }//GEN-LAST:event_btnMinusActionPerformed

    private void btnProductActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnProductActionPerformed
        String text = calculation.getText();
        calculation.setText(text + "*");
    }//GEN-LAST:event_btnProductActionPerformed

    private void btnDivideActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnDivideActionPerformed
        String text = calculation.getText();
        calculation.setText(text + "/");
    }//GEN-LAST:event_btnDivideActionPerformed

    private void btnEqualActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnEqualActionPerformed
      btnEqualActionPerformed();
    }//GEN-LAST:event_btnEqualActionPerformed

    private void btnEqualActionPerformed()
    {
      Scanner in = new Scanner(System.in);

      String text = calculation.getText();
      char[] newText = text.toCharArray();
      int cuttingNo = newText.length;
      int holder = 0;
      int start = 0;
      int [] numbers = new int[10000];
      char[] symbols = new char[9999];
      char[] temp = newText;
      int x = 0;

      do
      {
          temp = newText;
          holder = 0;
          while (isInteger(String.valueOf(temp).trim()) == false)
          {
              int j = 0;
              holder++;
              char[] temp2 = new char[newText.length];
              for (int i = start; i <= (newText.length - holder); i++)
              {
                  temp2[j] = newText[i];
                  j++;
              }
              temp = temp2;
          }
          numbers[x] = Integer.parseInt(String.valueOf(temp).trim());
          start = newText.length - (holder++) + 2;


          if (start <= text.length())
          {
              symbols[x++] = newText[start - 1];
          }
      } while (start < text.length());

      int ans = numbers[0];

      for(int i = 0; i < x; i++)
      {
          switch (symbols[i])
          {
              case '+' :
                  ans += numbers[i+1];
                  break;
              case '-' :
                  ans -= numbers[i+1];
                  break;
              case 'x' :
                  ans *= numbers[i+1];
                  break;
              case '/' :
                  ans /= numbers[i+1];
          }
      }

      calculation.setText(String.valueOf(ans));
    }

    public static boolean isInteger(String s)
    {
        try
        {
            Integer.parseInt(s);
        }
        catch(NumberFormatException e)
        {
            return false;
        }
        // only got here if we didn't return false
        return true;
    }

    public static void main(String args[]) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    private JButton btn0;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btn4;
    private JButton btn5;
    private JButton btn6;
    private JButton btn7;
    private JButton btn8;
    private JButton btn9;
    private JButton btnDel;
    private JButton btnDivide;
    private JButton btnEqual;
    private JButton btnMinus;
    private JButton btnPlus;
    private JButton btnProduct;
    private JTextField calculation;
    private JButton clear;
    private JPanel jPanel1;
}
