
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author johnk
 */
public class Main {

    public static void main(String[] args) {

//        Scanner keyboard = new Scanner(System.in);
//        System.out.println("How many rooms:");
//        int numberOfRooms = keyboard.nextInt();
//        
//        double totalSqFootage = 0;
//        for (int i=0; i<numberOfRooms; i++) {
//            System.out.println("Enter sq footage for room");
//            totalSqFootage += keyboard.nextDouble();
//        }
//        System.out.println(totalSqFootage);
        
        
        Random rand1 = new Random();
        Random rand2 = new Random();
        Random rand3 = new Random();

        Rectangle myRectangle = new Rectangle(5,20);

        Rectangle myRectangle2 = new Rectangle();
        myRectangle2.setLength(5);
        myRectangle2.setWidth(10);
        
        double area1 = myRectangle.getArea();
        
        boolean firstRectIsBigger = rectangleIsBiggerThanOtherRectangle(myRectangle2, myRectangle);
        
        
        // String is also a type of object!
        String name = "John";
        String otherName = new String("Bob");
        int length = otherName.length();
        
        int result = addNumber(1,5);
    }
    
    public static int addNumber(int num1, int num2) {
        return num1+num2;
    }
    
    
    public static boolean rectangleIsBiggerThanOtherRectangle(Rectangle rect1, Rectangle rect2) {
        if (rect1.getArea() > rect2.getArea()) {
            return true;
        } else {
            return false;
        }
    }
}
