package BehavioralDesignPattern.ObserverPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        Channel channel = new Channel();
        Subscriber ab = new Subscriber();
        ab.name = "abc";
        channel.subscribe(ab);


        Subscriber cd = new Subscriber();
        cd.name="xyz";
        channel.subscribe(cd);
        channel.notifyChanges("java");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            System.out.println("Press 1 upload\nPress 2 create subscribe\nPress 3 exit");
//            int n = input.nextInt();
            int n= Integer.parseInt(bufferedReader.readLine());
            if(n==1) {
                System.out.print("Input title: ");
                String title = bufferedReader.readLine();
                channel.notifyChanges(title);

            } else if(n==2) {
                System.out.print("Input subscriber name: ");
                String name = bufferedReader.readLine();
               Subscriber sub = new Subscriber();
               sub.name = name;
                channel.subscribe(sub);

            } else if(n==3) {
                System.out.println("Thank you!");
                break;
            } else {
                System.out.println("Wrong input!!");
                break;
            }


        }

    }
}
