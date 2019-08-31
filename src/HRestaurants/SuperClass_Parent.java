/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HRestaurants;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author heems
 */
public class SuperClass_Parent {
    public double ChickenBurger;
    public double ChickenBurgerM;
    public double ChickenLegend;
    public double CheeseBurger;
    public double Filet_o_Fish;
    
    public double MilkShake;
    public double VanillaCone;
    public double VanMilkShake;
    public double ClasVanilla;
    public double ChocMilkShake;
    
    public double Meals;
    public double Drinks;
    public double TotalofMd;
    
    public double AllTotalofMd;
    
    
    public double GetAmt()
    {
        Meals = ChickenBurger + ChickenBurgerM + ChickenLegend + CheeseBurger + Filet_o_Fish;
        Drinks = ChocMilkShake + ClasVanilla + VanMilkShake + VanillaCone + MilkShake;
        TotalofMd = Meals + Drinks;
        AllTotalofMd = TotalofMd;
        return AllTotalofMd;
        
    }
    
    private JFrame frame;
    public void iExitSystem()
    {
        frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit","Restaurant Management System",JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        } 
         }
    //=================================Price==========================================================================================
    public double pChickenBurger = 90;
    public double pChickenBurgerM = 120;
    public double pChickenLegend = 160.50;
    public double pCheeseBurger = 80.70;
    public double pFilet_o_Fish = 45.50;
    
    public double pMilkShake = 20;
    public double pVanillaCone = 30;
    public double pVanMilkShake = 45.50;
    public double pClasVanilla = 70.50;
    public double pChocMilkShake = 45;
    
       //===============================================================================================================================
 
    public double mcTax = 0.75;
    public Double cFindTax(double cAmount){
        double FindTax= cAmount - (cAmount*mcTax);
        return FindTax;
    }
    
}
