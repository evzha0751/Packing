

package pkg161102.packing;

import java.util.*;

public class Packing {

    public static void main(String[] args) {
        double num,l1,l2,h1,h2,w1,w2,x1,x2,x3;
        double max=0;
        double b1,b2,b3,b4,b5,b6;
        Scanner input = new Scanner (System.in);
        
        num = input.nextDouble();
        l1 = Double.parseDouble(input.next());
        h1 = Double.parseDouble(input.next());
        w1 = Double.parseDouble(input.next());
        l2 = Double.parseDouble(input.next());
        h2 = Double.parseDouble(input.next());
        w2 = Double.parseDouble(input.next());
        
        x1=Math.max(l1,h1);
        x1=Math.max(x1,w1);
        x3=Math.min(l1,h1);
        x3=Math.min(x3,w1);
        x2=l1+h1+w1-x1-x3;
        
        Pack way[] = new Pack[7];
        Check check1;
        
        for(int i=0;i<way.length;i++){
            if(i==1){
                way[1]=new Way1(x1,x2,x3,l2,w2,h2);
                b1=way[1].boxes();
                max=Math.max(max, b1);
//                System.out.println(max);
            }else if(i==2){
                way[2]=new Way1(x1,x3,x2,l2,w2,h2);
                b2=way[2].boxes();
                max=Math.max(max, b2);
//                System.out.println(max);
            }else if(i==3){
                way[3]=new Way1(x2,x1,x3,l2,w2,h2);
                b3=way[3].boxes();
                max=Math.max(max, b3);
//                System.out.println(max);
            }else if(i==4){
                way[4]=new Way1(x2,x3,x1,l2,w2,h2);
                b4=way[4].boxes();
                max=Math.max(max, b4);
//                System.out.println(max);
            }else if(i==5){
                way[5]=new Way1(x3,x2,x1,l2,w2,h2);
                b5=way[5].boxes();
                max=Math.max(max, b5);
//                System.out.println(max);
            }else if(i==6){
                way[6]=new Way1(x3,x1,x2,l2,w2,h2);
                b6=way[6].boxes();
                max=Math.max(max, b6);
//                System.out.println(max);
            }
        }
        
        check1 = new Check(max,num);
        check1.output();
        
    }
    
}
