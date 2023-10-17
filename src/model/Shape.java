/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package model;
public abstract class Shape {
    public abstract double getPerimeter();
    public abstract double getArea();
    public void printResult() {
        System.out.println("Area: "+getArea());
        System.out.println("Perimeter: "+getPerimeter());
    }
    
    
}
