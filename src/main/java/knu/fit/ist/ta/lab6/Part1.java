/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab6;

/**
 *
 * @author Danya
 */
public class Part1 {
    public static String reverseString (String str){
        String rightStr;
        String leftStr;
        int length = str.length();

        if (length <= 1) {
            return str;
        }

        leftStr = str.substring(0, length / 2);
        rightStr = str.substring(length / 2, length);

        String res = reverseString(rightStr) + reverseString(leftStr);
        return (String)res;
    }
    
    
}
