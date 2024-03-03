/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1;

/**
 *
 * @author Nguyen Hoang Dat
 */
public class Document{
    // attributes
    private String ID;
    private String name;
    
    // constructor methods
    public Document(String ID, String name) {
        this.ID = ID;
        this.name = name;
    }
    
    // getter setter
    public String getID() {
        return ID;
    }
    public void setID(String ID) {
        this.ID = ID;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    // method trả về chuỗi các thuộc tính (Add document: ID - name)
    public String entryDoc(){
        return String.format("Add document: %3s - %s", ID, name);
    }
    // method trả về chuỗi các thuộc tính (ID - name)
    public String printDoc(){
        return String.format("%3s - %s", ID, name);
    }
            
}
