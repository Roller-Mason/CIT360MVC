/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
//import byui.cit260.oregonTrail.control.GameControl;
//import byui.cit260.oregonTrail.exceptions.GameControlException;
//import byui.cit260.oregonTrail.model.Player;
//import java.util.Scanner;

/**
 *
 * @author Mason
 */
public class StartProgramView extends View{
    
    public StartProgramView(){
        super("\n"
                + "Please enter the first number you want to add together below:\n");
    }
    
    @Override
    public boolean doAction(String value){
        
        try{
            Integer.parseInt(value);
        }
        catch (NumberFormatException e){
            ErrorView.display(this.getClass().getName(), "Your input was not valid: " + e.getMessage());
            return false;
        }
        
        SecondNumberView secondNumberView = new SecondNumberView(value);
        secondNumberView.display();
        
        return true;
    }
    
}
