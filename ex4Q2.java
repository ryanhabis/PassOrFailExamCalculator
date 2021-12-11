/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author ryanh
 */
public class ex4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter CA grade here: ");
        int ca = scanner.nextInt();
        
        System.out.println("Enter exam grade here: ");
        int exam = scanner.nextInt();
        
        if(ca >= 40||exam >= 40)
        {
         System.out.println("U passed");
        }
        else
        {
          System.out.println("U failed");
        }
    }
}
