import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class MUMPAL{
    public static int flag=0;
    public  HashMap<String,String> hm =new HashMap<String,String>();
    boolean isPalindrome(String str){
        String reverse = new StringBuffer(str).reverse().toString();
        if(str.equals(reverse))
            return true;
        else
            return false;
    }
    
    void calculatePalindrome(String str, int left, int right){
    
        if(left==right){
            if(!hm.containsValue(str)){
                hm.put(str,str);
            if(isPalindrome(str)){
               //System.out.println(str);
               flag++;
            }
            }
        }
        else
            for (int i = left; i <= right; i++)
            {
                str = compute(str,left,i);
                calculatePalindrome(str, left+1, right);
                str = compute(str,left,i);
            }
    }
    
    
    public String compute(String str,int left,int i){
        char temp;
        char[] charArray = str.toCharArray();
        temp = charArray[left] ;
        charArray[left] = charArray[i];
        charArray[i] = temp;
        return String.valueOf(charArray);
    }
    
    public static void main(String args[]){
        String str;
        Scanner sc = new Scanner(System.in);
         str = sc.nextLine();
        MUMPAL m = new MUMPAL();
        m.calculatePalindrome(str,0,str.length()-1);
        System.out.println(flag);
    }
}
