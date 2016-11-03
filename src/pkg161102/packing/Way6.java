/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg161102.packing;

/**
 *Class Way6
 */
public class Way6 extends Pack{
    private double box;
    
    /**
    * constructor
    * pre: none
    * post: Get the number the boxes 
    * that is able to take
    */
    public Way6(double x1,double x2,double x3,double l2,double w2,double h2){
    box=(l2/x1)*(w2/x2)*(h2/x3);
}
    
    /**
     * return the box
     * pre: none
     * post: return the value of box
     * @return 
     */
    public double boxes(){
        
        return(box);
    }
}
