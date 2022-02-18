package Strings;

public class powerSet {

    void powerSet(String baby , int i , String curr){

        if(i==baby.length()){
            System.out.println(curr);
            return;
        }
        
        powerSet(baby, i+1, curr+ baby.charAt(i));
        powerSet(baby, i+1, curr);
    }
    
}
