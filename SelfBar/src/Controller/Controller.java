/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import GUI.Gui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javax.smartcardio.Card;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.ListModel;
import javax.swing.event.ChangeEvent;
import javax.xml.bind.Marshaller.Listener;
import selfbar.Observer;
import selfbar.Product;
import selfbar.Table;

/**
 *
 * @author Remei
 */
public class Controller implements Observer{
    Gui gui=new Gui();
    Table table;
    JFrame applicationFrame;
    JPanel cartPanel,additionPanel;
    ButtonGroup cocktailRadioGroup,coffeeRadioGroup;
    JList cartList,additionList;
    JLabel totalPriceLabel,priceCoffeeLabel,priceCocktailLabel,coffeeIcon,cocktailIcon;
    JButton addAdditionButton,payButton;
    Product coffee,cocktail;
    JRadioButton margaritaRadio,bloodymaryRadio,martiniRadio,arabicaRadio,barleyRadio,decRadio;
    ItemListener radioSelection;
    //Default list 
    List<String> cocktailExtra = Arrays.asList("aldo", "giovanni", "giacomo");
    List<String> coffeeExtra = Arrays.asList("ficarra","picone");
    DefaultListModel defaultListModel=new DefaultListModel<String>();
    
    public Controller() {
        initializeComponent();
        initializeListener();
        initializeGui();
        showGui();
        
        
    }
    
    @Override
    public void updateAdd(Product product) {
        //aggiornamento dell'inteerfaccia perche é stato aggiunto product
        System.out.println("Aggiunta prodotto");
    }

    @Override
    public void updateRemove(Product product) {
        //aggiornamento dell'inteerfaccia perche é stato rimosso product
        System.out.println("Rimozione prodotto");
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
        /*cocktailRadioGroup=gui.getCocktailRadioGroup();
        coffeeRadioGroup=gui.getCoffeeRadioGroup();
        margaritaRadio=gui.getMargaritaCocktailRadio();
        martiniRadio=gui.getMartiniCocktailRadio();
        bloodymaryRadio=gui.getBloodymaryCocktailRadio();
        arabicaRadio=gui.getArabicaCoffeeRadio();
        barleyRadio=gui.getBarleyCoffeeRadio();
        decRadio=gui.getDecCoffeeRadio();*/
    }
    
    public void initializeArticles(){
       priceCocktailLabel.setText("Prezzo: "+cocktail.getPrice());
       priceCoffeeLabel.setText("Prezzo: "+coffee.getPrice());
    }
    
    public void initializeGui(){
        additionList.setModel(defaultListModel);
 
        //visibility
        cartPanel.setVisible(false);
        additionPanel.setVisible(true);
        totalPriceLabel.setVisible(false);
        //listener
       /* margaritaRadio.addItemListener(radioSelection);
        martiniRadio.addItemListener(radioSelection);
        decRadio.addItemListener(radioSelection);
        bloodymaryRadio.addItemListener(radioSelection);
        barleyRadio.addItemListener(radioSelection);
        arabicaRadio.addItemListener(radioSelection); */
        
    }
    
    public void initializeListener(){
        radioSelection=new ItemListener() {
           @Override
           public void itemStateChanged(ItemEvent e) {
               if(!(cocktailRadioGroup.getSelection()==null)){
                   changeListObject(cocktailExtra);
               }  else changeListObject(coffeeExtra);
           }
       };
    }
    
    public void changeListObject(List<String> tmpArray){
        defaultListModel.removeAllElements();
        additionList.removeAll();
        for(int i=0;i<tmpArray.size();i++){
            defaultListModel.add(i,tmpArray.get(i));
        }
        additionList.setModel(defaultListModel);
    }
   
    public void setTable(Table table){
        this.table = table;
    }
     
    
            
}
