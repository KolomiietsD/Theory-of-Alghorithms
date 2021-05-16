/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab3;

import java.text.DecimalFormat;

/**
 *
 * @author Danya
 */
public class Lab3View {


    public String showResult(String kString) {
        if (kString.equals("")) {return "Please enter k";}
        Float k = Float.parseFloat(kString);

        if (k < 0) {
            return "Wrong k. must be positive";
        }
        else if (1<1) {return "";}
        else {
            return (Calculate.lab3equation(k));
        }
    }
    
}
