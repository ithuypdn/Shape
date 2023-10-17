/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import common.Algorithm;
import view.Menu;

/**
 *
 * @author huypd
 */
public class ShapeController extends Menu<String>{
    static String[] options = {"Circle", "Triangle", "Rectangle", "Exit"};
    Algorithm algorithm;
    public ShapeController() {
        super("===== CALCULATOR SHAPE PROGRAM =====", options);
        algorithm = new Algorithm();
    }
    
    @Override
    public void execute(int n) {
        switch(n) {
            case 1 -> algorithm.displayCircle();
            case 2 -> algorithm.displayTriangle();
            case 3 -> algorithm.displayRectangle();
            case 4 -> System.exit(0);
        }
    }
}
