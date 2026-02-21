/**
 *  Java program to demonstrate trigonometrical methods.
 */

package com.mymath;

/**
 *  Main class.
 */
public class Main {

    // Entry point for JVM.
    public static void main(String[] args) {

        // Variable with PI value.
        final double PI = Math.PI;

        // Printing PI value to console.
        System.out.println(PI); // Output: 3.141592653589793

        // Finding value of cos 30 degrees.
        double a = Math.cos(PI / 6);

        // Printing variable a to console.
        System.out.println(a); // Output: 0.8660254037844387

        // Finding value of sin 30 degrees.
        double b = Math.sin(PI / 6);

        // Printing variable a to console.
        System.out.println(b); // Output: 0.49999999999999994

        // Finding value of cos 0 degrees.
        double c = Math.cos(0);

        // Printing variable a to console.
        System.out.println(c); // Output: 1.0

        // Finding value of sin 0 degrees.
        double d = Math.sin(2 * PI);

        // Printing variable a to console.
        System.out.println(0); // Output: 0

        // Finding value of cos 45 degrees.
        double f = Math.cos(PI / 4);

        // Printing variable a to console.
        System.out.println(f); // Output: 0.7071067811865476

        // Finding value of sin 45 degrees.
        double g = Math.sin(PI / 4);

        // Printing variable a to console.
        System.out.println(g); // Output: 0.7071067811865475

    }
}