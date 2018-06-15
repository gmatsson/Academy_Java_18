package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ovn_3_2 {
    public static void main(String[] arg) throws FileNotFoundException{
        File file = new File("C:\\Users\\Administrator\\hello.txt");
        Scanner sc = new Scanner(file);

        System.out.printf("%s\n", sc.next());
        System.out.printf("%s",sc.next());
        sc.close();

    }
}
