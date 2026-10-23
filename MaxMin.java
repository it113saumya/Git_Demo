import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaxMin {
    public void findMax(){
        List<Integer> integerList = new ArrayList<>();
        System.out.println("Enter 5 integer numbers...");
        for(int i=0;i<5;i++){
            int num = new Scanner(System.in).nextInt();
            integerList.add(num);
        }
        int max = 0;
        for(int i=0;i<4;i++){
           if(integerList.indexOf(i)>=integerList.indexOf(i+1)) max = integerList.indexOf(i);
           else max = integerList.indexOf(i+1);
        }
        System.out.println("Max Number: " + max);
    }

    public void findMin(){
        List<Integer> integerList = new ArrayList<>();
        System.out.println("Enter 5 integer numbers...");
        for(int i=0;i<5;i++){
            int num = new Scanner(System.in).nextInt();
            integerList.add(num);
        }
        int min = 0;
        for(int i=0;i<4;i++){
            if(integerList.indexOf(i)<=integerList.indexOf(i+1)) min = integerList.indexOf(i);
            else min = integerList.indexOf(i+1);
        }
        System.out.println("Min Number: " + min);
    }
}
