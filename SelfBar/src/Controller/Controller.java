/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import GUI.Gui;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import selfbar.Observer;
import selfbar.Product;

/**
 *
 * @author Remei
 */
public class Controller implements Observer{
    int maximumExtraNumber=3;
    Gui gui=new Gui();
    JFrame applicationFrame;
    JPanel cartPanel,additionPanel;
    JList cartList,additionList,extraList;
    JLabel totalPriceLabel,priceCoffeeLabel,priceCocktailLabel,coffeeIcon,cocktailIcon;
    JButton addAdditionButton,payButton,addToCartButton;
    JComboBox<String> coffeeCombo,cocktailCombo;
    ItemListener comboListener;
    DefaultListModel extraSelectionModel;
    DefaultListModel extraSelectedModel;

    String[] cocktailListDefault = {"Margarita","Martini","BloodyMary"};
    String[] coffeeListDefault = {"Arabica","Barley","Decaffeinato"};
    List<String> cocktailListExtra = Arrays.asList("aldo", "giovanni", "giacomo");
    List<String> coffeeListExtra = Arrays.asList("ficarra","picone");
    
    
    public Controller() {
        this.extraSelectedModel = new DefaultListModel<String>();
        this.extraSelectionModel = new DefaultListModel<String>();
        initializeComponent();
        initializeListener();
        initializeArticles();
        initializeGui();
        showGui();
    }
    
    
    @Override
    public void updateAdd(Product product) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateRemove(Product product) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void showGui(){
        applicationFrame.setVisible(true);
    }
    
    public void initializeComponent(){
        applicationFrame=gui.getApplicationFrame();
        cartPanel=gui.getCartPanel();
        additionPanel=gui.getAdditionPanel();
        cartList=gui.getCartList();
        additionList=gui.getAdditionList();
        totalPriceLabel=gui.getTotalPrice();
        priceCocktailLabel=gui.getPriceCocktailLabel();
        priceCoffeeLabel=gui.getPriceCoffeeLabel();
        coffeeIcon=gui.getCoffeeIcon();
        cocktailIcon=gui.getCocktailIcon();
        addAdditionButton=gui.getAddAdditionButton();
        payButton=gui.getPayButton();
        addToCartButton=gui.getAddToCartButton();
        cocktailCombo=gui.getCocktailCombo();
        coffeeCombo=gui.getCoffeeCombo();
        extraList=gui.getExtraList();

    }
    
    public void initializeArticles(){
        cocktailCombo.setModel(new DefaultComboBoxModel(cocktailListDefault));
        coffeeCombo.setModel(new DefaultComboBoxModel(coffeeListDefault));
        extraList.setModel(extraSelectedModel);
        cocktailCombo.addItemListener(comboListener);
        coffeeCombo.addItemListener(comboListener);
        cocktailCombo.setSelectedItem(null);
        coffeeCombo.setSelectedItem(null);
        
    }
    
    public void initializeGui(){
        cartPanel.setVisible(false);
        additionPanel.setVisible(false);
        totalPriceLabel.setVisible(false);
    }
    
    public void initializeListener(){
       
        comboListener=new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() == ItemEvent.SELECTED) {
                    if(e.getSource().equals(coffeeCombo))
                        additionPanel.setVisible(true);
                        extraSelectedModel.removeAllElements();
                        changeListObject(coffeeListExtra);
                    }
            }
        };
        
       //Aggiunge l'ordine alla lista del tavolo
       addToCartButton.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    
                }

            });
        addAdditionButton.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    if(!additionList.isSelectionEmpty()){
                        String selection=(String) additionList.getSelectedValue();
                        extraSelectedModel.addElement(selection);
                    }
                }

            });
        cocktailIcon.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    if(!additionPanel.isVisible()) additionPanel.setVisible(true);
                }

            });
    }
    
    public void changeListObject(List<String> tmpArray){
        extraSelectionModel.removeAllElements();
        additionList.removeAll();
        for(int i=0;i<tmpArray.size();i++){
            extraSelectionModel.add(i,tmpArray.get(i));
        }
        additionList.setModel(extraSelectionModel);
    }
   
    
}
