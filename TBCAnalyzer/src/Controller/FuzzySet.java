/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.*;
/**
 *
 * @author User
 */
public class FuzzySet {
    Point pointA;
    Point pointB;

    public FuzzySet(Point pointA, Point pointB) {
        this.pointA = pointA;
        this.pointB = pointB;
    }
    
    public double fuzzify(double a){
        if (a < pointA.x){
            return pointA.y;
        } else if (a > pointB.x){
            return pointB.y;
        } else if (pointA.y < pointB.y) {
            return ((a-pointA.x)/(pointB.x-pointA.x));
        } else {
            return ((pointB.x-a)/(pointB.x-pointA.x));
        }  
    }
    
}
