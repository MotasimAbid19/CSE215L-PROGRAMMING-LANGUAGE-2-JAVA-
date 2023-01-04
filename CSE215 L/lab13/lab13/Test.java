/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab13;

import java.util.Scanner ;

public class Test {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Base and height : ");
        double base = input.nextDouble() ;
        double height = input.nextDouble() ;
        Triangle t = new Triangle (base , height );
        System.out.println(t.toString());
        System.out.println("Enter length and width : ");
        double length = input.nextDouble() ;
        double width = input.nextDouble() ;
        Rectangle r = new Rectangle( length,  width);
        System.out.println(r.toString());
        
        
    }
    
    
}
