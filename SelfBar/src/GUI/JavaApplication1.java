/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Controller.Controller;
import selfbar.Table;

/**
 *
 * @author Remei
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Table table = new Table();
        Controller contr=new Controller();
        table.addObserver(contr);
        contr.setTable(table);
    }
}
