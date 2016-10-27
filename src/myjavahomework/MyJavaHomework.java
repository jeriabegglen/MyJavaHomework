/*
 Jeri Abegglen
Use collections to convert seconds into hours minutes and seconds
 */
package myjavahomework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MyJavaHomework {
    
    void testMyCode(){
        System.out.println("Github, Please show this code!!!!");
    }
        
    public static void main(String[] args) {
        Collection<Integer> value = new ArrayList<Integer>();
        
        value.add(9630);
        value.add(8955);
        value.add(4766);
        value.add(5001);
        
        System.out.println("Seconds converter to hours:minutes:seconds ");
        int hours = 0, minutes = 0, seconds = 0, remainder = 0;
        for(int i : value){
            hours = i / 3600;
            remainder = i % 3600;
            minutes = remainder / 60;
            seconds = remainder % 60;
            System.out.println(i + " seconds = " + hours + ":" + minutes + ":" + seconds + ":");
        }        
    }
}

