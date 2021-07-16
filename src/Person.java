/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dell
 */
public class Person {
    private String firstName;
    private String lastName;
    private int height;
    private double weight;
    
    public void setFirstName (String FirstName){
        this.firstName = FirstName;
    }
    public  String getfirstName(){
        return firstName;
}
    public String getLastName(){
        return lastName;
    }
    public void setlastName (String lastName){
        this.lastName = lastName; 
   }
    public  int getHeight(){
        return height;
    }
    public  void setHeight (int height){
        this.height = height;
    }
    public double getWeight (){
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
}


