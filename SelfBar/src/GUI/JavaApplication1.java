package GUI;

import Controller.Controller;
import selfbar.Table;

public class JavaApplication1 {

    public static void main(String[] args) {
        Table table = new Table();
        Controller contr=new Controller();
        table.addObserver(contr);
        contr.setTable(table);
    }
}
