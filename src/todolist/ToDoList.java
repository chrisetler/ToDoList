/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todolist;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Chris
 */
public class ToDoList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        // TODO code application logic here
        ToDoGUI gui = new ToDoGUI();
        gui.setVisible(true);
    }
    
}
