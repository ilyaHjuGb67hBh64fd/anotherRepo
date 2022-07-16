package org.java.projects;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        String scanString = " This message show in console ";


        Scanner scanner = new Scanner(scanString);
        String outString = scanner.nextLine();
        /*PrintStream printStream = new PrintStream(scanner);
        InputStream inputStream = new InputStream() {
            @Override
            public int read() throws IOException {
                return 0;
            }
        };*/
        System.out.println(" *************** " + outString +  "**************** \n");
        System.out.println(" *************** end line **************\n ");
        System.out.println(" *************** begin scan line ************** ");
        Scanner scan = new Scanner(System.in);
        System.out.println(" Insert any word ");
        String str = scan.nextLine();
        System.out.printf("12Your number: %s \n", str);
        scan.close();
        System.out.println(" *************** end line ************** \n");
        System.out.println(" *************** begin inter line ************** ");
        Scanner inter = new Scanner(System.in);
        System.out.print("Input name: ");
        String name = inter.nextLine();
        System.out.print("Input age: ");
        int age = inter.nextInt();
        System.out.print("Input height: ");
        float height = inter.nextFloat();
        System.out.printf("Name: %s  Age: %d  Height: %.2f \n", name, age, height);
        inter.close();
    }
}
