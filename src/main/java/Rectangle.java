/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johnk
 */
public class Rectangle {
   private double length;
   private double width;
   
   public double getLength() {
       return this.length;
   }
   
   public void setLength(double length) {
       // additional validation
       if (length < 0) {
           // handle this error
       }
       this.length = length;
   }
   
   public double getWidth() {
       return this.width;
   }
   
   public void setWidth(double newWidth) {
       this.width = newWidth;
   }
   
   public double getArea() {
       return this.length * this.width;
   }
}
