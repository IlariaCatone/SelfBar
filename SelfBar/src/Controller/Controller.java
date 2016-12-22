/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import GUI.Gui;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import selfbar.CocktailBase;
import selfbar.Observer;
import selfbar.Product;

/**
 *
 * @author Remei
 */
public class Controller implements Observer{
    Gui gui=new Gui();
    JFrame applicationFrame;
    JPanel cartPanel,additionPanel;
    JList cartList,additionList;
    JLabel totalPriceLabel,priceCoffeeLabel,priceCocktailLabel,coffeeIcon,cocktailIcon;
    JButton addAdditionButton,payButton;

    public Controller() {
        initializeComponent();
        initializeGui();
        initializeListener();
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
    }
    
    public void initializeArticles(){
       
    }
    
    public void initializeGui(){
        cartPanel.setVisible(false);
        additionPanel.setVisible(false);
        totalPriceLabel.setVisible(false);
        
    }
    
    public void initializeListener(){
        coffeeIcon.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    if(!additionPanel.isVisible()) additionPanel.setVisible(true);
                }

            });
        cocktailIcon.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    if(!additionPanel.isVisible()) additionPanel.setVisible(true);
                }

            });
    }
   
    
}
