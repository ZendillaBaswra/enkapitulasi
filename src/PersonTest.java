/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dell
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person();
        p.setFirstName("ZENDILLA");
        p.setlastName("BASWARA");
        p.setHeight(155);
        p.setWeight(40);
        System.out.println("FirstName:" +p.getfirstName()+ " LastName:" +p.getLastName()+" Height:" +p.getHeight()+ " Weight:" +p.getWeight());
        
    }
    
}
