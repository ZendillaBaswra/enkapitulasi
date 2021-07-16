
import java.util.jar.Attributes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dell
 */
public class StudentTest {
    public static void main(String[] args) {
        Student s = new Student();
        s.setId(1);
        s.setAddres("Kediri");
        s.setName("Zendilla");
        s.setTheoryScore(90);
        s.setPracticeScore(88);
        
        System.out.println("ID:" +s.getId()+ " Addres:" +s.getAddres()+ " Name:" +s.getName()+ " TheoryScore:" + s.TheoryScore+ " PracticeScore: " + s.PracticeScore);
        
        
    }
    
}
