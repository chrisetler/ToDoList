/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todolist;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Scanner;

/**
 * To import a settings file to store setting such as preferences, sorting mode,
 * etc. Scans the settings file and adds items that correspond to the programs
 * lists of settings
 *
 * @author Chris
 */
public class SettingsIO {

    private int length = 0;
    private String[] settingName;
    private boolean[] settingValue;
    private String[] possibleSettings;

    public SettingsIO() {
        //possibleSettings = settings;
    }

    public void importFile(String fname) throws FileNotFoundException {
        File fis = new File(fname + ".ini");
        Scanner scan = new Scanner(fis);
        settingName = new String[99];
        settingValue = new boolean[99];
        //go through the file
        while (scan.hasNext()) {
            String currentLine = scan.nextLine();
            String[] lineSplit = currentLine.split(" ");
            if (lineSplit.length > 1) {
                settingName[length] = lineSplit[0];
                if (lineSplit[1].equals("0")) {
                    settingValue[length] = false;
                } else {
                    settingValue[length] = true;
                }
                length++;
            }
        }
    }

    public void exportFile(String fname) throws FileNotFoundException, IOException {
        Writer settingsFile;
        settingsFile = new PrintWriter(fname + ".ini");
        for (int i = 0; i < length; i++) {
            settingsFile.write(settingName[i] + " ");
            int val = (settingValue[i]) ? 1 : 0;
            settingsFile.write(val + "");
            settingsFile.write("\r\n");
        }
        settingsFile.close();
    }

    /**
     * Return 1 if the setting is true, 0 if it is false and -1 if it has not
     * yet been defined
     *
     * @param setting
     * @return
     */
    public int getSetting(String setting) {
        for (int i = 0; i < length; i++) {
            if ((setting + ":").equals(settingName[i])) {
                return (settingValue[i]) ? 1 : 0;
            }
        }
        return -1;
    }

    public void setSetting(String setting, boolean value) {
        boolean settingFound = false;
        for (int i = 0; i < length; i++) {
            if ((setting + ":").equals(settingName[i])) {
                settingValue[i] = value;
                settingFound = true;
            }
        }
        if (!(settingFound)) {
            settingName[length] = setting + ":";
            settingValue[length] = value;
            length++;
        }

    }

    public void printSettings() {
        for (int i = 0; i < length; i++) {
            System.out.print(settingName[i]);
            System.out.print(" ");
            System.out.print(settingValue[i]);
            System.out.println();
        }
    }
}
