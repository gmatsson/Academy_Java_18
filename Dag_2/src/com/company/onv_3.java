package com.company;

import java.util.*;

public class onv_3 {
    public static void main(String [] arg) {
        /*Scanner in = new Scanner(System.in);
        System.out.print("Please enter 3 numbers, one per row:\n");

        int x = Integer.parseInt(in.nextLine());
        int y = Integer.parseInt(in.nextLine());
        int z = in.nextInt();

        System.out.printf("%d %d %d", x,y,z);
*/
        Scanner sc = new Scanner("123 232 2323");
        while(sc.hasNext()){
            System.out.println(sc.next());
        }
    }
}
