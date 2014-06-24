package kovalenko;

import javax.swing.DefaultListModel;
import kovalenko.CurrencyCourseUpdater;

public class my_inter extends javax.swing.JFrame {
    private CurrencyCourseUpdater updater = new CurrencyCourseUpdater(); // класс, позволяющих обновить информацию о курсе валют 
    
    private DefaultListModel model = new DefaultListModel();  // модель, через которую происходит взаимодействие со списком.
    private CurrencyCourseIntr mass_value[];
    
    public my_inter() {
        initComponents();
        Panel1.setVisible(false);
        Panel2.setVisible(false);
        list.setModel(model);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        exchange_rates = new javax.swing.JButton();
        converting = new javax.swing.JButton();
        Panel1 = new javax.swing.JPanel();
        currency_list = new javax.swing.JScrollPane();
        list = new javax.swing.JList();
        update_list = new javax.swing.JButton();
        Panel2 = new javax.swing.JPanel();
        Tabbed = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        TextField = new javax.swing.JTextField();
        ComboBox = new javax.swing.JComboBox();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        TextField1 = new javax.swing.JTextField();
        ComboBox1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        TextField2 = new javax.swing.JTextField();
        ComboBox2 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Converter");
        setResizable(false);

        exchange_rates.setText("Курс валют");
        exchange_rates.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exchange_ratesActionPerformed(evt);
            }
        });

        converting.setText("Конвертация");
        converting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertingActionPerformed(evt);
            }
        });

        list.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        currency_list.setViewportView(list);

        update_list.setText("Update");
        update_list.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_listActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addComponent(currency_list)
                .addContainerGap())
            .addGroup(Panel1Layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(update_list)
                .addContainerGap(147, Short.MAX_VALUE))
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel1Layout.createSequentialGroup()
                .addComponent(update_list)
                .addGap(18, 18, 18)
                .addComponent(currency_list, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                .addContainerGap())
        );

        TextField.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                TextFieldInputMethodTextChanged(evt);
            }
        });
        TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldActionPerformed(evt);
            }
        });
        TextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TextFieldKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextFieldKeyTyped(evt);
            }
        });

        ComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "USD", "EUR", "RUB" }));
        ComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboBoxItemStateChanged(evt);
            }
        });
        ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "USD", "EUR", "RUB" }));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Результат:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        Tabbed.addTab("Купить", jPanel1);

        ComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "USD", "EUR", "RUB" }));
        ComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboBox1ItemStateChanged(evt);
            }
        });
        ComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBox1ActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Результат:");

        TextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField2ActionPerformed(evt);
            }
        });
        TextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TextField2KeyReleased(evt);
            }
        });

        ComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "USD", "EUR", "RUB" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(TextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(TextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 34, Short.MAX_VALUE))
        );

        Tabbed.addTab("Продать", jPanel2);

        javax.swing.GroupLayout Panel2Layout = new javax.swing.GroupLayout(Panel2);
        Panel2.setLayout(Panel2Layout);
        Panel2Layout.setHorizontalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Tabbed, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        Panel2Layout.setVerticalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(Tabbed, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(exchange_rates, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(converting, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exchange_rates)
                    .addComponent(converting))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exchange_ratesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exchange_ratesActionPerformed
        Panel1.setVisible(!Panel1.isVisible());   
    }//GEN-LAST:event_exchange_ratesActionPerformed

    private void convertingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertingActionPerformed
        Panel2.setVisible(!Panel2.isVisible());
    }//GEN-LAST:event_convertingActionPerformed

    private void update_listActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_listActionPerformed
         //CurrencyCourse[] courses = updater.getCurrenctCourses(); // загрузить курсы валют с сайта и получить их массив (из трех элементов), где

        Runnable t = new Thread() {
            @Override
            public void run() {
                mass_value = updater.getCurrenctCourses();
            // courses[i].getBuyValue() - цена покупки 
            // courses[i].getSaleValue() - цена продажи
            // courses[i].getBankValue() - цена НБУ (Национального Банка Украины)
            // courses[i].getCurrencyName() - узнать тип валюты (Доллар, евро, рубль)

            model.clear(); // очистить список

            for (int i = 0; i<mass_value.length; ++i)
                model.addElement(mass_value[i].toString()); // добавить в список валюты
            }
        };
                
        t.run();
        
    }//GEN-LAST:event_update_listActionPerformed

    private void ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxActionPerformed

    public int getIndexInArrayForFirstComboBoxBuy() {
        String str = (String)ComboBox.getSelectedItem();
        for (int i =0; i<mass_value.length; ++i)
            if (mass_value[i].getCurrencyName().equals(str))
                return i;
        return -1;
    }
    
       public int getIndexInArrayForSecondComboBoxBuy() {
        String str = (String)jComboBox1.getSelectedItem();
        for (int i =0; i<mass_value.length; ++i)
            if (mass_value[i].getCurrencyName().equals(str))
                return i;
        return -1;
    }
       
         public int getIndexInArrayForFirstComboBoxSale() {
        String str = (String)ComboBox1.getSelectedItem();
        for (int i =0; i<mass_value.length; ++i)
            if (mass_value[i].getCurrencyName().equals(str))
                return i;
        return -1;
    }
    
       public int getIndexInArrayForSecondComboBoxSale() {
        String str = (String)ComboBox2.getSelectedItem();
        for (int i =0; i<mass_value.length; ++i)
            if (mass_value[i].getCurrencyName().equals(str))
                return i;
        return -1;
    }
       
    public void calcNewValueForBuy() {
        int pos = getIndexInArrayForFirstComboBoxBuy();
        try {
                double curValue = Double.parseDouble(TextField.getText().toString());
                double newValInHrn = curValue * mass_value[pos].getBuyValue();
                
        int pos2 = getIndexInArrayForSecondComboBoxBuy();
        double result = newValInHrn / mass_value[pos2].getBuyValue();
        jTextField1.setText(String.valueOf(result));
        }
        catch (Exception e) {jTextField1.setText("");}
    }

    public void calNewValueForSale() {
        int pos = getIndexInArrayForFirstComboBoxSale();
        try {
                double curValue = Double.parseDouble(TextField2.getText().toString());
                double newValInHrn = curValue * mass_value[pos].getSaleValue();
                
        int pos2 = getIndexInArrayForSecondComboBoxSale();
        double result = newValInHrn / mass_value[pos2].getSaleValue();
        TextField1.setText(String.valueOf(result));
        }
        catch (Exception e) {TextField1.setText("");}
    }
    
    private void TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldActionPerformed
        
        
    }//GEN-LAST:event_TextFieldActionPerformed

    private void TextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextFieldKeyTyped
        
    }//GEN-LAST:event_TextFieldKeyTyped

    private void TextFieldInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_TextFieldInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldInputMethodTextChanged

    private void TextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextFieldKeyReleased

       calcNewValueForBuy();
        
        
    }//GEN-LAST:event_TextFieldKeyReleased

    private void ComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComboBoxItemStateChanged
        calcNewValueForBuy();
    }//GEN-LAST:event_ComboBoxItemStateChanged

    private void TextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField2ActionPerformed

    private void ComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComboBox1ItemStateChanged
        calNewValueForSale();
    }//GEN-LAST:event_ComboBox1ItemStateChanged

    private void TextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextField2KeyReleased
        calNewValueForSale();
    }//GEN-LAST:event_TextField2KeyReleased

    private void ComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBox1ActionPerformed

    @Override
    public void setTitle(String title) {
        super.setTitle(title); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(my_inter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(my_inter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(my_inter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(my_inter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new my_inter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ComboBox;
    private javax.swing.JComboBox ComboBox1;
    private javax.swing.JComboBox ComboBox2;
    private javax.swing.JPanel Panel1;
    private javax.swing.JPanel Panel2;
    private javax.swing.JTabbedPane Tabbed;
    private javax.swing.JTextField TextField;
    private javax.swing.JTextField TextField1;
    private javax.swing.JTextField TextField2;
    private javax.swing.JButton converting;
    private javax.swing.JScrollPane currency_list;
    private javax.swing.JButton exchange_rates;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JList list;
    private javax.swing.JButton update_list;
    // End of variables declaration//GEN-END:variables
}