/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab3;

import java.util.Arrays;

/**
 *
 * @author Danya
 */
public class Calculate {
     public static String lab3equation(float k){
       
        int res = 0;
        int min = 0;
        int[] array;
        array = new int[20];
        for (int i = 0, i1 = 1; i < array.length; i++, i1++) {
            array[i] = ((int) (Math.random() * 30));

            if (i1 == 1)  {res = i1; min = (int) Math.abs(array[i] - k);}
            if (i1 != 1 && Math.abs(array[i] - k) <= min)
            {res = i1; min = (int) Math.abs(array[i] - k);}
            
        }
          
         String ress;
         ress = Arrays.toString(array);
         ress += "    k = " + k + ", " + " sequence number = " + res;
         return (String)ress;
     }
     
}
    



         

