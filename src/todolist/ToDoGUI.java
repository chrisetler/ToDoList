/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todolist;

import java.awt.Component;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Chris
 */
public class ToDoGUI extends javax.swing.JFrame {

    /**
     * Creates new form ToDoGUI
     */
    public ToDoGUI() {
        initComponents();
        
        //jPopupMenu1 = new JPopupMenu();
        //jPopupMenu1.add("Edit");
    }

    //Renderer for the date column
    //Renders date as MM/dd/yyyy
    TableCellRenderer dateRenderer = new DefaultTableCellRenderer() {
        SimpleDateFormat f = new SimpleDateFormat("MM/dd/yyyy");

        public Component getTableCellRendererComponent(JTable table,
                Object value, boolean isSelected, boolean hasFocus,
                int row, int column) {
            if (value instanceof Calendar) {
                value = f.format(((Calendar) value).getTime());
            }
            return super.getTableCellRendererComponent(table, value, isSelected,
                    hasFocus, row, column);
        }
    };

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    //Auto-Generated via Netbeans GUI builder, with some customized code
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        popupMenu1 = new java.awt.PopupMenu();
        popupMenu2 = new java.awt.PopupMenu();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        popupMenu1.setLabel("popupMenu1");

        popupMenu2.setLabel("popupMenu2");

        jMenuItem1.setText("Edit");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Very Low", "Low", "Medium", "High", "Very High" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jComboBox1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jComboBox1FocusLost(evt);
            }
        });

        jButton1.setText("GO!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jButton1KeyReleased(evt);
            }
        });

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField2FocusLost(evt);
            }
        });
        jTextField2.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jTextField2PropertyChange(evt);
            }
        });
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Description", "Date", "Priority"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, popupMenu1, org.jdesktop.beansbinding.ObjectProperty.create(), jTable1, org.jdesktop.beansbinding.BeanProperty.create("elements"));
        bindingGroup.addBinding(binding);
        binding.bind();
        jTable1.setAutoCreateRowSorter(true);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable1MouseReleased(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable1KeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(200);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(300);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
        }
        //set the date column to display mm/dd/yyyy
        jTable1.getColumnModel().getColumn(1).setCellRenderer(dateRenderer);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                .addContainerGap())
        );

        //set the default date to the current System date.
        String dateStr;
        SimpleDateFormat f = new SimpleDateFormat("MM/dd/yyyy");
        Calendar cal = new GregorianCalendar();

        dateStr = f.format(cal.getTime());
        jTextField2.setText(dateStr);

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_jTextField2ActionPerformed


    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        // TODO add your handling code here:


    }//GEN-LAST:event_jTextField2KeyTyped

    private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextField2KeyPressed

    private void jTextField2PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTextField2PropertyChange
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextField2PropertyChange

    /**
     * Returns true if the character is a digit (0-9)
     *
     * @param b the Character
     * @return
     */
    private boolean isDigit(char b) {
        return (b == '0' || b == '1' || b == '2' || b == '3' || b == '4'
                || b == '5' || b == '6' || b == '7' || b == '8' || b == '9');
    }

    /**
     * Parses the date is MM/dd/yyyy format. Takes in a String and returns the
     * date by removing any other characters and adding slashes
     *
     * @param s String representation of the date
     * 
     * @return
     */
    private String parseDate(String s) {
        char[] strChar = s.toCharArray();
        //get rid of all non-digits
        s = "";
        //allow user to not enter leading 0 of month
        if (strChar.length == 2 && strChar[1] == '/') {
            strChar[1] = strChar[0];
            strChar[0] = '0';
        }
        //allow user to not have to enter leading 0 of day
        if (strChar.length == 5 && strChar[4] == '/') {
            strChar[4] = strChar[3];
            strChar[3] = '0';
        }
        
        for (char x : strChar) {
            if (isDigit(x)) {
                s += x;
            }
        }
        
        //perform this when the first two digits (Month) are entered
        if (s.length() >= 2) {
            //if the month is greater than 12, get rid of it
            if (Integer.parseInt(s.substring(0, 2)) > 12) {
                return "";
            }
            s = s.substring(0, 2) + "/" + s.substring(2);
        }
        //perform this when the next two digits(Day) are entered
        if (s.length() >= 5) {
            //check to make sure the date matches up with the month
            int Month = Integer.parseInt(s.substring(0, 2));
            int Date = Integer.parseInt(s.substring(3, 5));
            //30 days has September, April, June, and November
            if (Month == 9 || Month == 4 || Month == 6 || Month == 11) {
                if (Date > 30) {
                    return Month + "/";
                }
            }
            //February is tricky, because of leap years. Once the year is added, we will check
            //if it is a leap year, and if it is, change the 29 to 28
            //the check for proper Feb date will occur when the year is entered
            if (Month == 2) {
                if (Date > 29) {
                    return Month + "/";
                }
            } else {
                if (Date > 31) {
                    return Month + "/";
                }
            }
            s = s.substring(0, 5) + "/" + s.substring(5);

        }
        //perform this when MM dd and yyyy are entered
        if (s.length() >= 10) {
            s = s.substring(0, 10);
            int Month = Integer.parseInt(s.substring(0, 2));
            int Date = Integer.parseInt(s.substring(3, 5));
            int Year = Integer.parseInt(s.substring(6, 10));
            if (Month == 2 && Date == 29) {
                //if the year is divisable by 0, and either the year is not divisible by 100 or IS disible by 400, it is a leap year
                if (!(Year % 4 == 0 && (Year % 100 != 0 || Year % 400 == 0))) {
                    //if it is not a leap year, then Date must be changed to 28
                    return "0" + Month + "/" + "28" + "/" + Year;
                }
            }
        }
        return s;

    }

    /**
     * When a key is released, parse the input and add it to the box String Then
     * parse what's in the box to get it into a date format Do nothing if the
     * user is pressing an arrow key or backspace
     *
     * @param evt the key being pressed
     */
    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased
        // TODO add your handling code here:
        //For the formatted text box, do something everytime a key is pressed
        //to keep it formated as a date
        int kbdCode = evt.getKeyCode();
        if (kbdCode == 8 || kbdCode == 37 || kbdCode == 38 || kbdCode == 39 || kbdCode == 40) {
        } else {
            jTextField2.setText(parseDate(jTextField2.getText()));
        }

    }//GEN-LAST:event_jTextField2KeyReleased

    /**
     * The 'Go' button. Adds the new item to the table by creating a new todo
     * object.
     *
     * @param evt
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        //when 'GO' button is pressed, create the new item.
        String desc = jTextField1.getText();
        String dateStr = jTextField2.getText();
        String priorityStr = (String) jComboBox1.getSelectedItem();
        //only go if the date has been fully entered
        if (dateStr.length() == 10) {
            int Month = Integer.parseInt(dateStr.substring(0, 2));
            int Date = Integer.parseInt(dateStr.substring(3, 5));
            int Year = Integer.parseInt(dateStr.substring(6, 10));

            //ToDo class parses the strings entered by the GUI for date and priority
            ToDo todo = new ToDo(desc, priorityStr, dateStr);

            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.addRow(new Object[]{todo.getDesc(), todo.getDate(), todo.getPriorityStr()});
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    /**
     * Runs when a key is pressed over the table. Delete the selected Row if the
     * 'delete' key is pressed.
     *
     * @param evt the key being pressed
     */
    private void jTable1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyReleased

        //Delete the selected Row when 'delete' is pressed
        if (evt.getKeyCode() == 65 || evt.getKeyCode() == 127) {
            int rowSelected;
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            rowSelected = jTable1.getSelectedRow();
            if (rowSelected == -1) {
                //if no Row is selected, then check if there is a row being edited
                rowSelected = jTable1.getEditingRow();
            }
            //If a row was found to delete, delete it.
            if (rowSelected != -1) {
                /**
                 * @debug
                 */
                System.out.println("Deleting row: " + rowSelected);

                model.removeRow(rowSelected);
            }
        }
    }//GEN-LAST:event_jTable1KeyReleased

    /**
     * Runs when focus Date text box is lost if the focus is lost and the date
     * is in mm/dd/yy format convert it to mm/dd/yyyy
     *
     * @param evt Event
     */
    private void jTextField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusLost
        if (jTextField2.getText().length() == 8) {
            Calendar cal = new GregorianCalendar();
            int txt = cal.get(Calendar.YEAR)/100;
            String s = jTextField2.getText().substring(0, 6) + txt + jTextField2.getText().substring(6, 8);
            jTextField2.setText(s);
        }
    }//GEN-LAST:event_jTextField2FocusLost
    /**
     * Runs when a key is pressed on the Go button if the key is 'enter', then
     * add the item to the table
     *
     * @param evt
     */
    private void jButton1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyReleased

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            System.out.println(2);
            //do the same thing as if the button is clicked
            //but also set the focus back to the first text box and select all
            //for easy input of a lot of data
            jTextField1.requestFocus();
            jTextField1.selectAll();
            this.jButton1ActionPerformed(null);
        }
    }//GEN-LAST:event_jButton1KeyReleased

    private void jTable1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseReleased
        //if Right clicked
        if (evt.getButton() == 3) {
            //DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            //int rowSelected = jTable1.getEditingRow();
            jPopupMenu1.show(evt.getComponent(), evt.getX(), evt.getY());

        }
    }//GEN-LAST:event_jTable1MouseReleased

    //When the "Edit" Button is pressed
    /**
     * Runs when the Edit button is pressed from the popup
     *
     * @param evt
     */
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        int rowSelected;
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        rowSelected = jTable1.getSelectedRow();
        if (rowSelected == -1) {
            //if no Row is selected, then check if there is a row being edited
            rowSelected = jTable1.getEditingRow();
        }
        if (rowSelected != -1) {
            SimpleDateFormat f = new SimpleDateFormat("MM/dd/yyyy");
            String desc = (String) model.getValueAt(rowSelected, 0 );
            //String dateStr = f.format((Calendar)model.getValueAt(1, rowSelected));
            String date = f.format(((Calendar) model.getValueAt(rowSelected, 1)).getTime());
            jTextField1.setText(desc);
            jTextField2.setText(date);
            jComboBox1.setSelectedIndex(getPriorityIndex((String)model.getValueAt(rowSelected,2)));

            model.removeRow(rowSelected);
        }


    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jComboBox1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBox1FocusLost
        
    }//GEN-LAST:event_jComboBox1FocusLost
    /**
     * Proper use of the ToDo API requires very low priority to be set to 0,
     * very high to 4, and everything else logically in between.
     *
     * @return
     */
    private static int getPriorityIndex(String priority) {
        if (priority.equals("Very Low")) {
            return 0;
        }
        if (priority.equals("Low")) {
            return 1;
        }
        if (priority.equals("Medium")) {
            return 2;
        }
        if (priority.equals("High")) {
            return 3;
        }
        return 4;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ToDoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ToDoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ToDoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ToDoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Date d = new Date();
                String s = d.getMonth() + "/" + d.getDate() + "/" + d.getYear();

                new ToDoGUI().setVisible(true);

            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private java.awt.PopupMenu popupMenu1;
    private java.awt.PopupMenu popupMenu2;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
