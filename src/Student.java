/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dell
 */
public class Student {
    int id;
    String name;
    String addres;
    double TheoryScore;
    double PracticeScore;
    
    public  int getId (){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName (String name){
        this.name = name;
    }
    public String getAddres(){
        return addres;
    }
    public void setAddres (String addres){
        this.addres = addres;
    }
    public double getTheoryScore(){
        return  TheoryScore;
    }
    public void setTheoryScore (double theoryScore){
        this.TheoryScore = theoryScore;
    }
    public double getPracticeScore(){
        return PracticeScore;
    }
    public void setPracticeScore (double PracticeScore){
        this.PracticeScore = PracticeScore;
    }
    
}
