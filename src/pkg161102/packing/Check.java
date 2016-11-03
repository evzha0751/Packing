
package pkg161102.packing;

/*
 * Check Class
 */
public class Check {
    private int times;
    private String output;
    
    /**
    * constructor
    * pre: none
    * post: Get the output that is the 
    * number of times or "SCAMMED"
    */
    public Check(double check1,double boxes){

        if(check1<=1){
            output="SCAMMED";
        }else{
            times=(int)(boxes/check1)+1;
            
            output=Integer.toString(times);
        }
    }
    
    /*
    * Output 
    * pre: none
    * post: Print the output
    */   
    public void output(){
        System.out.println(output);
    }
}
