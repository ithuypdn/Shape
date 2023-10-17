/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

/**
 *
 * @author huypd
 */
public class Validation {
    Library l = new Library();
    public boolean isRectangle(double sideA, double sideB, double sideC) {
        return (sideA + sideB > sideC 
                && sideB + sideC > sideA && sideC + sideA > sideB);
    }
//
//    public boolean checkPositiveNumber(String s) {
//        try {
//            double a = Double.parseDouble(s);
//            if (a <= 0)
//                throw new NumberFormatException();
//            return true;
//        } 
//        catch (NumberFormatException e) {
//            System.err.println("Invalid number, please input again.");
//            return false;
//        }
//    }
}
