import java.util.*;
import java.util.ArrayList;
import java.util.List;

 class QuestionTwoSolution{
    public static void main(String args[]){
        int t;
        int s,b,sum=0;
        int[] ar;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        for(int j=0;j<t;j++){
            sum=0;
        s = sc.nextInt();
        b = sc.nextInt();
             ar = new int[s];
            for(int i=0;i<s;i++)
                ar[i]=sc.nextInt();
            int min = Arrays.stream(ar).min().getAsInt();
            int max = Arrays.stream(ar).max().getAsInt();
            for( int num : ar)
                sum = sum+num;
            int x = sum-min+max;
            
            if(x>(min+max))
            System.out.println(x);
            else
                System.out.println(min+max);
        }
    }
    }
