package practice;

/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */

/**
 *
 * @author alexbazzi
 */
import java.util.Scanner;

public class TriangleTester
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the width of the triangle: ");
        int n = in.nextInt();
        Triangle triangle = new Triangle(n);
        int area = triangle.getArea();
        System.out.println("The are of the triangle is: " + area);
                
    }
}
