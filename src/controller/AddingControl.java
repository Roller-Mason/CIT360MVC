/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.AddingModel;
import view.ErrorView;

/**
 *
 * @author Mason
 */
public class AddingControl {
    
    public static int addingTwoNumber(String firstNumber, String secondNumber){
        try{
            int first = Integer.parseInt(firstNumber);
            int second = Integer.parseInt(secondNumber);
            return AddingModel.addTwoNumbers(first, second);
        }
        catch (NumberFormatException e){
            return 0;
        }
    }
    
}
