/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.AddingControl;

public class SecondNumberView extends View{

    private final String firstNumber;
    
    public SecondNumberView (String first) {
      
        super(
        "====================================================="
        +"\nThe first number to add is: " + first
        +"\nPlease enter a second number below."
        +"\n====================================================="
          );
        
        firstNumber = first;
    }  
       
   @Override
    
    public boolean doAction(String value){
        
        System.out.println("First number: " + firstNumber + " and second number: " + value);
        
        try{
            Integer.parseInt(value);
        }
        catch (NumberFormatException e){
            ErrorView.display(this.getClass().getName(), "Your input was not valid: " + e.getMessage());
            return false;
        }
        
        int addingTwoNumber = AddingControl.addingTwoNumber(firstNumber, value);
        
        if(addingTwoNumber == 0){
            ErrorView.display(this.getClass().getName(), "Something went wrong, please try again");
        }
        else{
            System.out.println("=====================================================");
            System.out.println("Adding together: " + firstNumber + " and " + value);
            System.out.println("You get: " + addingTwoNumber);
            System.out.println("=====================================================");
        }
        
        return true;
    }
    
}
