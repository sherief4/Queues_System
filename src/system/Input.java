package system;

import javax.swing.JTextField;
public class Input {
    JTextField T1,T2,T3,T4;
    double A,S , At, St;
    int C, X , T ,  K , M ;
    double L , Lq, W, Wq, Ti;
    
    
    
    public void IN(JTextField T1 , JTextField T2){

        //M/M/1 input method
    A = Double.parseDouble(T1.getText().trim());
    S = Double.parseDouble(T2.getText().trim());
       
    }
    
    public void IN(JTextField T1, JTextField T2, JTextField T3){
   //M/M/C and M/M/1/K input method

    A = Double.parseDouble(T1.getText().trim());
    S = Double.parseDouble(T2.getText().trim());
    C = Integer.parseInt(T3.getText().trim());
    X = Integer.parseInt(T3.getText().trim()); 
          
    }
    public void IN (JTextField T1 , JTextField T2 , JTextField T3 , JTextField T4 ){
    //M/M/C/K Input method 
    A = Double.parseDouble(T1.getText().trim());
    S = Double.parseDouble(T2.getText().trim());
    C = Integer.parseInt(T3.getText().trim());
    X = Integer.parseInt(T4.getText().trim());   
        
    
    
    }
    public void IN (JTextField T1, JTextField T2, JTextField T3, JTextField T6 , JTextField T7){
 
 //D/D/1/K input method
       
    A = Double.parseDouble(T1.getText().trim());
    S = Double.parseDouble(T2.getText().trim());
    C = Integer.parseInt(T3.getText().trim());
    T = Integer.parseInt(T6.getText().trim());
    M = Integer.parseInt(T7.getText().trim()); 
      
    
    
    
    }
    
    
}
