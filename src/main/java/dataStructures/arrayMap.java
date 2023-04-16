package dataStructures;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class arrayMap {

    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        Map<String, String> contacts = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            String name=in.nextLine();
            String phone=in.nextLine();
            in.nextLine();
            contacts.put(name,phone);
        }
        while(in.hasNext())
        {
            String s=in.nextLine();
            if (contacts.get(s) == null) {
                System.out.println("Not found");
            }
            else {
                System.out.println(s+"="+contacts.get(s));
            }
        }
    }

}
