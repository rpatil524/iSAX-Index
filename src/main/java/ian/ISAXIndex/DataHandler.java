/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ian.ISAXIndex;

/**
 *
 * @author ian
 */
public abstract class DataHandler implements java.io.Serializable{

    public abstract long size();

    public abstract double[] get(long i);
    
    public abstract int windowSize();
}
