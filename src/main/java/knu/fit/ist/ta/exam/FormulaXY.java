/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.exam;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Danya
 */

    public class FormulaXY {
    public List<Double> X;
    public static List<Double> Y;
    
    
    public FormulaXY(){
        X = new LinkedList<Double>();
        Y = new LinkedList<Double>();
    }
    
    public FormulaXY(int length){
        X = new LinkedList<Double>();
        Y = new LinkedList<Double>();
        Random randNumbers = new Random();
        
        for (int i = 0; i < length; i++)
            X.add((double)randNumbers.nextInt(10));
    }
    
    
    public String Calculate(){
        Y.clear();
        int length = X.size();

        for (int i = 0; i < length; i++)
            Y.add(calculate.Calculate(X.get(i)));
        
        return Y.toString();
    }
    
    public String GetX(){
        return X.toString();
    }

    
}
    

