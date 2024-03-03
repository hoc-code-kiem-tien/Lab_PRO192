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
public class Book extends Document{
    //attributes
    private int page;
    private int status;
    
    //constructor methods
    public Book(String ID, String name, int page, int status) {
        super(ID, name);
        this.page = page;
        this.status = status;
    }
    
    //getters setters
    public int getPage() {
        return page;
    }
    public void setPage(int page) {
        this.page = page;
    }
    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }
    
    //method trả về chuỗi gồm các giá thuộc tính (Add book: ID - name - page - status)
    public String entryBook() {    
        return String.format("Add book: %3s - %s - %d pages - %s"
            , getID(), getName(), page, (status==0)?"available":"unavailable");
    }
    
    // method trả về chuỗi gồm các thuộc tính (ID - name - page - status)
    public String printBook() {
        return String.format("%3s - %s - %d pages - %s"
            , getID(), getName(), page, (status==0)?"available":"unavailable");
    }
    
    // set status = 1 (sách đã được mượn, unvaiable)
    public void borrowBook() {
        status = 1;
    }
    // set status = 0 (sách đã được trả, avaiable)
    public void returnBook() {
        status = 0;
    }
    
    // Ghi đè phương thức printDoc() để gọi được thông qua class Document
    @Override
    public String printDoc(){
        return String.format("%3s - %s - %d pages - %s"
            , getID(), getName(), page, (status==0)?"available":"unavailable");
    }
          
}
