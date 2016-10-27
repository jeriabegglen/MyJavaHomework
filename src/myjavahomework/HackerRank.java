/**
 *  
 * @author jeriabegglen
 * URL to problem chosen:
 * https://www.hackerrank.com/challenges/camelcase
 */
package myjavahomework;

import static kiss.API.*;

public class HackerRank {
    
    String words = "howManyWordsAreInThisCamelCase";
//    String words = "now";
//    String words = "";
    char[] stringToChar = words.toCharArray();
    
    int len = words.length();       
    int i;
    int numWords = 0;
   
    void testWord() {
        if(len == 0){
            numWords = 0;
        }
        else{
            numWords = 1;
            for (i = 0; i < len; ++i){
                if (Character.isUpperCase(stringToChar[i])==true) {
                    numWords += 1;  
    
                }
            }
        }
    
        println(words + " has " + numWords + " words in it! ");
    }    
} 
