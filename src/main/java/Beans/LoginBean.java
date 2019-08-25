/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Ayberk
 */


@ManagedBean
@ViewScoped
public class LoginBean {
    /**
     * Creates a new instance of LoginBean
     */
    public LoginBean() {
    }
    
    
    private String name;
    
    public void isimYaz(){
        System.out.println("Name : "+name);
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
    
    
}
