/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab8;

/**
 *
 * @author Danya
 */
public class AlgorithmData {
    
    private long _time;
    private int _substitutions;
    private int _comparisons;

    public AlgorithmData()
    {
        _substitutions = 0;
        _comparisons = 0;
    }
    
    public long getTime() {
        return _time;
    }

    public void setTime(long time) {
        _time = time;
    }

    public int getSubstitutions() {
        return _substitutions;
    }

    public void setSubstitutions(int substitutions) {
        _substitutions = substitutions;
    }

    public int getComparisons() {
        return _comparisons;
    }

    public void setComparisons(int comparisons) {
        _comparisons = comparisons;
    }
    
}
