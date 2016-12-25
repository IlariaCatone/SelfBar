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
import selfbar.Cocktail;
import selfbar.Coffee;
import selfbar.Observer;
import selfbar.Product;
import selfbar.Table;
import selfbar.cocktail.*;
import selfbar.cocktaildecorators.*;
import selfbar.coffeebase.*;
import selfbar.coffeedecorators.*;

/**
 *
 * @author Remei
 */
public class Controller implements Observer{
    
    final int MAX_ADDICTION=3;
    
    Gui gui=new Gui();
    Table table;
    JFrame applicationFrame;
    JPanel cartPanel,additionPanel;
    JList cartList,additionList,extraList;
    JLabel totalPriceLabel,priceCoffeeLabel,priceCocktailLabel,coffeeIcon,cocktailIcon;
    JButton addAdditionButton,payButton,addToCartButton;
    JComboBox<String> coffeeCombo,cocktailCombo;
    ItemListener comboListener;
    DefaultListModel extraSelectionModel;
    DefaultListModel extraSelectedModel;
    
    String elementSelected;
    Coffee coffeeToAdd;
    Cocktail cocktailToAdd;

    String[] cocktailListDefault = {"Margarita","Martini","BloodyMary"};
    String[] coffeeListDefault = {"Arabica","D'orzo","Decaffeinato"};
    List<String> cocktailListExtra = Arrays.asList("Appetizer", "Lime", "Soda");
    List<String> coffeeListExtra = Arrays.asList("Cacao","Panna","Latte");
    
    
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
        System.out.println("adding...");
    }

    @Override
    public void updateRemove(Product product) {
        System.out.println("removing...");
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
                    if(e.getSource().equals(coffeeCombo)){
                        selectCoffee();
                        initCoffee(e.getItem()+"");
                    }else{
                        selectCocktail();
                        initCocktail(e.getItem()+"");
                    }
                }
            }
        };
        
       //Aggiunge l'ordine alla lista del tavolo
       addToCartButton.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    for(int i = 0; i<extraSelectedModel.getSize();i++){
                        String str = (String) extraSelectedModel.getElementAt(i);
                        if(elementSelected.equals("Coffee")){
                            addCoffeeDecorations(str);
                        }else{
                            addCocktailDecorations(str);
                        }
                    }
                    if(elementSelected.equals("Coffee")) table.addProduct(coffeeToAdd);
                    else table.addProduct(cocktailToAdd);
                }
            });
       
        addAdditionButton.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    if(!additionList.isSelectionEmpty()){
                        String selection=(String) additionList.getSelectedValue();
                        if (extraSelectedModel.getSize()<MAX_ADDICTION)
                        extraSelectedModel.addElement(selection);
                    }
                }
            });
        
        cocktailIcon.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    if(!additionPanel.isVisible()) additionPanel.setVisible(true);
                }
            });
        
        coffeeIcon.addMouseListener(new MouseAdapter() {
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
    
    public void setTable(Table table){
        this.table = table;
    }
    
    public void selectCoffee(){
        additionPanel.setVisible(true);
        extraSelectedModel.removeAllElements();
        changeListObject(coffeeListExtra);
        elementSelected = "Coffee";
        cocktailCombo.setSelectedIndex(-1);
    }
    
    public void selectCocktail(){
        additionPanel.setVisible(true);
        extraSelectedModel.removeAllElements();
        changeListObject(cocktailListExtra);
        elementSelected = "Cocktail";
        coffeeCombo.setSelectedIndex(-1);
    }
    
    public void initCoffee(String type){
        switch(type){
            case "Arabica":
                coffeeToAdd = new Arabica();
                break;
            case "D'orzo":
                coffeeToAdd = new Barley();
                break;
            case "Decaffeinato":
                coffeeToAdd = new Dec();
                break;    
        }
    }
    
    public void addCoffeeDecorations(String dec){
        switch(dec){
            case "Cacao":
                coffeeToAdd = new Cocoa(coffeeToAdd);
                break;
            case "Panna":
                coffeeToAdd = new Cream(coffeeToAdd);
                break;
            case "Latte":
                coffeeToAdd = new Milk(coffeeToAdd);
                break;    
        }
    }
    
    public void initCocktail(String type){
        switch(type){
            case "Margarita":
                cocktailToAdd = new Margarita();
                break;
            case "Martini":
                cocktailToAdd = new Martini();
                break;
            case "BloodyMary":
                cocktailToAdd = new BloodyMary();
                break;    
        }
    }
    
    public void addCocktailDecorations(String dec){
        switch(dec){
            case "Appetizer":
                cocktailToAdd = new Appetizer(cocktailToAdd);
                break;
            case "Lime":
                cocktailToAdd = new Lime(cocktailToAdd);
                break;
            case "Soda":
                cocktailToAdd = new Soda(cocktailToAdd);
                break;    
        }
    }
    
    /*  List<String> cocktailListExtra = Arrays.asList("Appetizer", "Lime", "Soda");*/

    
}
