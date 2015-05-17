/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todolist;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * Class for importing and exporting to .ToDoIO files Takes data as array of
 * Objects per row Constructor specifies the number of columns
 *
 * @author Chris
 */
public class ToDoIO {

    private int length;
    private int rows;
    private ArrayList<Object[]> tableList = new ArrayList<>(); //list of each row

    /**
     * Base constructor. Creates a file for a specified number of columns. Use
     * the add command to add rows as an array of objects with the same length
     * as the number of columns specified.
     *
     * @param l the number of columns
     */
    public ToDoIO(int l) {
        length = l;
        rows = 0;
    }

    /**
     * Adds a row by giving an array of Objects.
     *
     * @param obj
     */
    public void add(Object[] obj) {
        tableList.add(obj);
        rows++;
    }

    /**
     * Export the data to a file
     *
     * @param filename filename to export to
     * @throws FileNotFoundException
     * @throws IOException
     */
    public void export(String filename) throws FileNotFoundException, IOException {
        FileOutputStream fos;
        fos = new FileOutputStream(filename + ".ToDoIO");
        ObjectOutputStream objStream = new ObjectOutputStream(fos);

        //ArrayList Iterator
        for (Object[] objOutArray : tableList) {
            //get to each individual object
            for (Object objOut : objOutArray) {
                objStream.writeObject(objOut);
            }
        }
        //null for EOF
        objStream.writeObject(null);
        objStream.close();
    }

    /**
     * Import the file and store as an array list
     *
     * @param filename
     * @throws FileNotFoundException
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public void importFile(String filename) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(filename + ".ToDoIO");
        ObjectInputStream objStream = new ObjectInputStream(fis);
        //reset rows and table in case this object has already been used. The import will be fresh and won't keep anything
        rows = 0;
        int currRow = 0;
        tableList.clear();
        int counter = 0;
        //the first $length objects will be row one, next will be row two, etc
        //read the fird object
        Object ObjTemp = objStream.readObject();
        while (ObjTemp != null) {
            Object[] objArray = new Object[length];
            //set first object to the beginning of the array
            objArray[0] = ObjTemp;
            if (length > 1) {
                //add the rest to the array
                for (int i = 1; i < length; i++) {
                    objArray[i] = objStream.readObject();
                }
            }
            //add the array to the arrayList
            tableList.add(objArray);
            rows++;
            //get the next object, so it can be checked for null (EOF)
            ObjTemp = objStream.readObject();

        }
        objStream.close();

    }
    /**
     * Takes in toDoIO files
     * Files should be made sure to be toDoIO files if this method is to be used
     * @param file
     * @throws FileNotFoundException 
     */
    public void importFile(File file) throws FileNotFoundException, IOException, ClassNotFoundException {
       
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream objStream = new ObjectInputStream(fis);
        //reset rows and table in case this object has already been used. The import will be fresh and won't keep anything
        rows = 0;
        int currRow = 0;
        tableList.clear();
        int counter = 0;
        //the first $length objects will be row one, next will be row two, etc
        //read the fird object
        Object ObjTemp = objStream.readObject();
        while (ObjTemp != null) {
            Object[] objArray = new Object[length];
            //set first object to the beginning of the array
            objArray[0] = ObjTemp;
            if (length > 1) {
                //add the rest to the array
                for (int i = 1; i < length; i++) {
                    objArray[i] = objStream.readObject();
                }
            }
            //add the array to the arrayList
            tableList.add(objArray);
            rows++;
            //get the next object, so it can be checked for null (EOF)
            ObjTemp = objStream.readObject();

        }
        objStream.close();
        
    }

    public Object[] getRow(int i) {
        if (i < rows) {
            return tableList.get(i);
        } else {
            return null;
        }
    }

    public int getRowCount() {
        return rows;
    }
}
