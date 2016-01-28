/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dietasviajes;

/**
 *
 * @author AGRAUL
 */
public class DietasViajes {
        
    private double aloj;
    private double manu;
    private int dias;
    
    public DietasViajes (double aloj,double manu,int dias){
        this.aloj=aloj;
        this.manu=manu;
        this.dias=dias;
        
    }
    public double calculaCoste(){
     
        double costeTotal = 0;
        
        costeTotal=(aloj*manu)*dias;
        
        return costeTotal;
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        UIDietas();
    }

    private static void UIDietas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
