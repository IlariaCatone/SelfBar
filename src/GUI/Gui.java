package GUI;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;

public class Gui extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public Gui() {
        initComponents();
        this.setResizable(false);
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
        coffePanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        coffeeIcon = new javax.swing.JLabel();
        priceCoffeeLabel = new javax.swing.JLabel();
        coffeeCombo = new javax.swing.JComboBox<>();
        cocktailPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        cocktailIcon = new javax.swing.JLabel();
        priceCocktailLabel = new javax.swing.JLabel();
        cocktailCombo = new javax.swing.JComboBox<>();
        additionPanel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        additionList = new javax.swing.JList<>();
        addAdditionButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        extraList = new javax.swing.JList<>();
        jLabel10 = new javax.swing.JLabel();
        addToCartButton = new javax.swing.JButton();
        removeExtraButton = new javax.swing.JButton();
        cartPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        cartList = new javax.swing.JList<>();
        totalPrice = new javax.swing.JLabel();
        payButton = new javax.swing.JButton();
        removeFromCartButton = new javax.swing.JButton();
        buyMethodCombo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setText("Caffè");

        coffeeIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        coffeeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/coffee.png"))); // NOI18N

        priceCoffeeLabel.setText("Prezzo:");

        coffeeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout coffePanelLayout = new javax.swing.GroupLayout(coffePanel);
        coffePanel.setLayout(coffePanelLayout);
        coffePanelLayout.setHorizontalGroup(
            coffePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(coffePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(coffePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(coffeeIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                    .addGroup(coffePanelLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(coffePanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(priceCoffeeLabel))
                    .addComponent(coffeeCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        coffePanelLayout.setVerticalGroup(
            coffePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(coffePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(coffeeIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(coffeeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(priceCoffeeLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cocktailPanel.setPreferredSize(new java.awt.Dimension(223, 148));

        jLabel6.setText("Cocktail");

        cocktailIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cocktailIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/cocktail.png"))); // NOI18N
        cocktailIcon.setToolTipText("");

        priceCocktailLabel.setText("Prezzo:");

        cocktailCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout cocktailPanelLayout = new javax.swing.GroupLayout(cocktailPanel);
        cocktailPanel.setLayout(cocktailPanelLayout);
        cocktailPanelLayout.setHorizontalGroup(
            cocktailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cocktailPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cocktailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cocktailIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                    .addGroup(cocktailPanelLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cocktailPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(priceCocktailLabel))
                    .addComponent(cocktailCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        cocktailPanelLayout.setVerticalGroup(
            cocktailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cocktailPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cocktailIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cocktailCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(priceCocktailLabel)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jLabel9.setText("Supplementi");

        additionList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(additionList);

        addAdditionButton.setText("Aggiungi");

        extraList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(extraList);

        jLabel10.setText("Extra aggiunti");

        addToCartButton.setText("Ordina");
        addToCartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToCartButtonActionPerformed(evt);
            }
        });

        removeExtraButton.setText("Rimuovi");
        removeExtraButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeExtraButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout additionPanelLayout = new javax.swing.GroupLayout(additionPanel);
        additionPanel.setLayout(additionPanelLayout);
        additionPanelLayout.setHorizontalGroup(
            additionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(additionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(additionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addAdditionButton)
                    .addGroup(additionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel9)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(additionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(additionPanelLayout.createSequentialGroup()
                        .addGroup(additionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(removeExtraButton)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addToCartButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        additionPanelLayout.setVerticalGroup(
            additionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(additionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(additionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addToCartButton)
                    .addGroup(additionPanelLayout.createSequentialGroup()
                        .addGroup(additionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(24, 24, 24)
                        .addGroup(additionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(additionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addAdditionButton)
                    .addComponent(removeExtraButton))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(coffePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cocktailPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
            .addComponent(additionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cocktailPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                    .addComponent(coffePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(additionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        cartPanel.setMaximumSize(new java.awt.Dimension(223, 421));
        cartPanel.setMinimumSize(new java.awt.Dimension(223, 421));

        jLabel1.setText("Carrello");

        cartList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        cartList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(cartList);

        totalPrice.setText("Totale:");

        payButton.setText("Paga");

        removeFromCartButton.setText("Rimuovi");

        buyMethodCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout cartPanelLayout = new javax.swing.GroupLayout(cartPanel);
        cartPanel.setLayout(cartPanelLayout);
        cartPanelLayout.setHorizontalGroup(
            cartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cartPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cartPanelLayout.createSequentialGroup()
                        .addComponent(removeFromCartButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                        .addComponent(totalPrice))
                    .addGroup(cartPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(cartPanelLayout.createSequentialGroup()
                        .addGroup(cartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cartPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(payButton))
                            .addComponent(buyMethodCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        cartPanelLayout.setVerticalGroup(
            cartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cartPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(cartPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(totalPrice))
                    .addComponent(removeFromCartButton))
                .addGap(18, 18, 18)
                .addComponent(buyMethodCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(payButton)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cartPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(cartPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addToCartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToCartButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addToCartButtonActionPerformed

    private void removeExtraButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeExtraButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_removeExtraButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gui().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addAdditionButton;
    private javax.swing.JButton addToCartButton;
    private javax.swing.JList<String> additionList;
    private javax.swing.JPanel additionPanel;
    private javax.swing.JComboBox<String> buyMethodCombo;
    private javax.swing.JList<String> cartList;
    private javax.swing.JPanel cartPanel;
    private javax.swing.JComboBox<String> cocktailCombo;
    private javax.swing.JLabel cocktailIcon;
    private javax.swing.JPanel cocktailPanel;
    private javax.swing.JPanel coffePanel;
    private javax.swing.JComboBox<String> coffeeCombo;
    private javax.swing.JLabel coffeeIcon;
    private javax.swing.JList<String> extraList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton payButton;
    private javax.swing.JLabel priceCocktailLabel;
    private javax.swing.JLabel priceCoffeeLabel;
    private javax.swing.JButton removeExtraButton;
    private javax.swing.JButton removeFromCartButton;
    private javax.swing.JLabel totalPrice;
    // End of variables declaration//GEN-END:variables

    public JButton getAddAdditionButton() {
        return addAdditionButton;
    }

    public JPanel getAdditionPanel() {
        return additionPanel;
    }

    public JList<String> getCartList() {
        return cartList;
    }

    public JPanel getCartPanel() {
        return cartPanel;
    }

    public JPanel getCocktailPanel() {
        return cocktailPanel;
    }

    public JPanel getCoffePanel() {
        return coffePanel;
    }

    public JButton getPayButton() {
        return payButton;
    }

    public JLabel getPriceCocktailLabel() {
        return priceCocktailLabel;
    }

    public JLabel getPriceCoffeeLabel() {
        return priceCoffeeLabel;
    }

    public JLabel getTotalPrice() {
        return totalPrice;
    }
    
// Get Method

    public JList<String> getAdditionList() {
        return additionList;
    }

    public JFrame getApplicationFrame() {
        return this;
    }

    public JLabel getCocktailIcon() {
        return cocktailIcon;
    }

    public JLabel getCoffeeIcon() {
        return coffeeIcon;
    }

    public JComboBox<String> getCocktailCombo() {
        return cocktailCombo;
    }

    public JComboBox<String> getCoffeeCombo() {
        return coffeeCombo;
    }

    public JList<String> getExtraList() {
        return extraList;
    }

    public JButton getAddToCartButton() {
        return addToCartButton;
    }

    public JButton getRemoveFromCartButton() {
        return removeFromCartButton;
    }

    public JComboBox<String> getBuyMethodCombo() {
        return buyMethodCombo;
    }

    public JButton getRemoveExtraButton() {
        return removeExtraButton;
    }
    
    

    
    
    
    
    
    


}
