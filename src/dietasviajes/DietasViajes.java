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
    private int pers;
    
    public DietasViajes (double aloj,double manu,int dias, int pers){
        this.aloj=aloj;
        this.manu=manu;
        this.dias=dias;
        this.pers=pers;
        
    }
    public double calculaCoste(){
     
        double costeTotal = 0;
        
        this.aloj=aloj*pers;
        this.manu=manu*pers;
        
        costeTotal=(aloj+manu)*dias;
        
        return costeTotal;
        
    }
    
    public double calculaCosteAloj(){
     
        double costeAloj = 0;
               
        costeAloj=(aloj*pers)*dias;
        
        return costeAloj;
        
    }
    
    public double calculaCosteManu(){
     
        double costeManu = 0;
               
        costeManu=(manu*pers)*dias;
        
        return costeManu;
        
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
