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
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
import selfbar.cocktail.BloodyMary;
import selfbar.cocktail.Margarita;
import selfbar.cocktail.Martini;
import selfbar.cocktaildecorators.Appetizer;
import selfbar.cocktaildecorators.Lime;
import selfbar.cocktaildecorators.Soda;
import selfbar.coffeebase.Arabica;
import selfbar.coffeebase.Barley;
import selfbar.coffeebase.Decaffeinato;
import selfbar.coffeedecorators.Cocoa;
import selfbar.coffeedecorators.Cream;
import selfbar.coffeedecorators.Milk;

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
    JButton addAdditionButton,payButton,addToCartButton,removeFromCartButton;
    JComboBox<String> coffeeCombo,cocktailCombo;
    ItemListener comboListener;
    DefaultListModel extraSelectionModel,extraSelectedModel;
    DefaultListModel<Product> cartModel;

    String[] cocktailListDefault = {"Margarita","Martini","BloodyMary"};
    String[] coffeeListDefault = {"Arabica","D'orzo","Decaffeinato"};
    List<String> cocktailListExtra = Arrays.asList("Stuzzichini","Lime","Soda");
    List<String> coffeeListExtra = Arrays.asList("Cacao", "Latte", "Panna");
    Boolean isCoffee;
    int totalPrice=0;
    Coffee productCoffee;
    Cocktail productCocktail;
    
    public Controller() {
        this.extraSelectedModel = new DefaultListModel<String>();
        this.extraSelectionModel = new DefaultListModel<String>();
        this.cartModel = new DefaultListModel<Product>();
        initializeComponent();
        initializeListener();
        initializeArticles();
        initializeGui();
        showGui();
    }
    
    @Override
    public void updateAdd(Product product) {
        cartPanel.setVisible(true);
        updateAddCartModel(product);
        updateTotalPrice(product.getPrice());
    }

    @Override
    public void updateRemove(Product product) {
        System.out.println("removing...");
        
         System.out.println("update : "+product.getDescription());
        updateTotalPrice(product.getPrice()*-1);
        updateRemoveCartModel(product);

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
        removeFromCartButton=gui.getRemoveFromCartButton();
        addToCartButton=gui.getAddToCartButton();
        cocktailCombo=gui.getCocktailCombo();
        coffeeCombo=gui.getCoffeeCombo();
        extraList=gui.getExtraList();
    }
    
    public void initializeArticles(){
        cocktailCombo.setModel(new DefaultComboBoxModel(cocktailListDefault));
        coffeeCombo.setModel(new DefaultComboBoxModel(coffeeListDefault));
        cartList.setModel(cartModel);
        extraList.setModel(extraSelectedModel);
        cocktailCombo.addItemListener(comboListener);
        coffeeCombo.addItemListener(comboListener);
        cocktailCombo.setSelectedItem(null);
        coffeeCombo.setSelectedItem(null);
        
    }
    
    public void initializeGui(){
        cartPanel.setVisible(false);
        additionPanel.setVisible(false);
        
    }
    
    public void initializeListener(){
        
        comboListener=new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() == ItemEvent.SELECTED) {
                    additionPanel.setVisible(true);
                    extraSelectedModel.removeAllElements();
                    if(e.getSource().equals(coffeeCombo)){
                        isCoffee=true;
                        changeListObject(coffeeListExtra);
                        initCoffee(coffeeCombo.getSelectedItem().toString());
                        //addCoffeeDecoration("Latte");
                        
                        cocktailCombo.setSelectedIndex(-1);
                    }
                else{
                        isCoffee=false;
                        changeListObject(cocktailListExtra);
                        initCocktail(cocktailCombo.getSelectedItem().toString());
                        coffeeCombo.setSelectedIndex(-1);
                }
            }
        }};
        
       //Aggiunge l'ordine alla lista del tavolo
       addToCartButton.addMouseListener(new MouseAdapter() {
                Product product;
                public void mouseClicked(MouseEvent e) {
                 if(isCoffee){
                     product= productCoffee;
                     System.out.println("Caffe prova "+product.getDescription());
                     
                    }else{
                     product=productCocktail;
                     //System.out.println("Cocktail prova "+product.getDescription());

                    }
       
                table.addProduct(product);
                }});
       
       removeFromCartButton.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
               if(!cartModel.isEmpty()&&cartList.getSelectedIndex()!=-1){
               Product tmp=(Product) cartList.getSelectedValue();
               table.removeProduct(tmp);    
            }  
}});
        addAdditionButton.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    if(!additionList.isSelectionEmpty()&&checkAddiction(additionList.getSelectedValue().toString())){
                        String selection=(String) additionList.getSelectedValue();
                        if (extraSelectedModel.getSize()<MAX_ADDICTION)
                        extraSelectedModel.addElement(selection);
                        if (isCoffee){
                            addCoffeeDecoration(selection);
                        }else{
                            addCocktailDecoration(selection);
                        }
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
        
        payButton.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    if(!additionPanel.isVisible()) additionPanel.setVisible(true);
                }
            });
        
    }
   
    public boolean checkAddiction(String str){
        if (extraSelectedModel.contains(str))
            return false;
        return true;
    }
    
    public void changeListObject(List<String> tmpArray){
        extraSelectionModel.removeAllElements();
        additionList.removeAll();
        for(int i=0;i<tmpArray.size();i++){
            extraSelectionModel.add(i,tmpArray.get(i));
        }
        additionList.setModel(extraSelectionModel);
    }
   
    private ArrayList<String> modelToList(DefaultListModel defaultListModel ){
        ArrayList<String> res=new ArrayList<>();
        int n=defaultListModel.getSize();
        for(int i=0;i<n;i++){
            res.add((String) defaultListModel.get(i));
        }
        return res;
    }

    public void setTable(Table table) {
        this.table = table;
    }
    
    public void initCoffee(String tmp){
        switch(tmp){
            case "Arabica":
                productCoffee= new Arabica();
                System.out.println("init " + tmp);
                break;
            case "D'orzo":
                productCoffee= new Barley();
                System.out.println("init " + tmp);
                break;
            case "Decaffeinato":
                productCoffee= new Decaffeinato();
                System.out.println("init " + tmp);
                break;                                
        }
        
    }
    
    public void initCocktail(String tmp){
        switch(tmp){
            case "BloodyMary":
                productCocktail= new BloodyMary();
                break;
            case "Margarita":
                productCocktail= new Margarita();
                break;
            case "Martini":
                productCocktail= new Martini();
                break;                                
        }   
    }
    
    public void addCoffeeDecoration(String tmp){
         switch(tmp){
               case "Cacao":
                   productCoffee=new Cocoa(productCoffee);
                   break;
               case "Panna":
                   productCoffee=new Cream(productCoffee);
                   break;
               case "Latte":
                   productCoffee=new Milk(productCoffee);
                   break;
           }
    }
    
     public void addCocktailDecoration(String tmp){
         switch(tmp){
               case "Stuzzichini":
                   productCocktail=new Appetizer(productCocktail);
                   break;
               case "Soda":
                   productCocktail=new Soda(productCocktail);
                   break;
               case "Lime":
                   productCocktail=new Lime(productCocktail);
                   break;
           }
    }
    
    public void updateAddCartModel(Product tmp){
        cartModel.addElement(tmp);
    }
    
     public void updateRemoveCartModel(Product pr){
        cartModel.removeElement(pr);
        /*int i=cartModel.indexOf(pr);
        System.out.println("s"+i);
        cartModel.removeAllElements();
                System.out.println("s"+cartModel.size());

        cartList.removeAll();
        cartList.updateUI();*/
        //cartList.setModel(cartModel);
    }
    
    public void updateTotalPrice(double tmp){
        totalPrice+=tmp;
        totalPriceLabel.setText("Prezzo: "+totalPrice);
    }
    
}
