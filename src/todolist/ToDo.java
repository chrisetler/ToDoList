/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todolist;
import java.util.Calendar;
import java.util.Locale;
import java.util.Date;
enum Priority {
    Very_Low, Low, Medium, High, Very_High
}
/**
 *
 * @author Chris
 */
public class ToDo {
private Priority priority;
private String description;
private Date date = new Date();

    public ToDo(String desc, Priority p, Calendar d){
        description = desc;
        priority = p;
       
    }
    /**
     * takes priority as String. Only for use with GUI which doesn't allow direct user input for priority String, as there is no error checking.
     * @param desc
     * @param p
     * @param d 
     */
    public ToDo(String desc, String p, String d){
        //this.date = new Calendar();
        description = desc;
        if(p.equals("Very Low")) priority = Priority.Very_Low;
        else if(p.equals("Low")) priority = Priority.Low;
        else if(p.equals("Medium")) priority = Priority.Medium;
        else if(p.equals("High")) priority = Priority.High;
        else priority = Priority.Very_High;
        
        int Month = Integer.parseInt(d.substring(0,2));
        int Day = Integer.parseInt(d.substring(3,5));
        int Year = Integer.parseInt(d.substring(6,10));
        System.out.println(p);
        System.out.println(priority);
        date.setDate(Day);
        date.setMonth(Month);
        date.setYear(Year);
        
        
        
        
    }
    /***
     * 
     * @return the date of the item
     */
    public Date getDate(){
        return date;
    }
    public String getDateStr(){
        return date.getMonth() + "/"+date.getDate() +"/"+date.getYear();
    }
    /**
     * 
     * @return The description (title) of the item 
     */
    public String getDesc(){
        return description;
    }
    
    /**
     * 
     * @return the priority of the item 
     */
    public Priority getPriority(){
        return priority; 
    }
    public String getPriorityStr(){
        
        if (priority.equals(Priority.Very_Low)) return "Very Low";
        if (priority.equals(Priority.Low))  return "Low";
        if (priority.equals(Priority.Medium))  return "Medium";
        if (priority.equals(Priority.High))  return "High";
        return "Very High";
    }
    /**
     * 
     * @return the object as a string
     */
    @Override
    public String toString(){
        return description + "\t"+ getDateStr() + "\t"+ getPriorityStr();
        
    }
}

