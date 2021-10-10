package Strings;

public class powerSet {

    void powerSet(String baby , int i , String curr){

        if(i==baby.length()){
            System.out.println(curr);
            return;
        }
        
        powerSet(baby, i, curr+ baby.charAt(i));
        powerSet(baby, i, curr);
    }
    
}
