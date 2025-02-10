package Codes;
/*You are given an array consisting of N integers, and an integer, K. 
Your task is to determine the minimum element in subarrays of size K.

Sample Input1:
--------------
5
10 12 14 11 15
3

Sample Output1:
---------------
10 11 11

Sample Input2:
--------------
5
5 2 1 1 1
4

Sample Output2:
---------------
1 1

 */
import java.util.*;

public class SmallestElement{
    
    public static void getMinElementInRange(int n, int[] nums, int k){
        
        int minElement = Integer.MAX_VALUE;
        int i = 0;
        int j = 0;
        
        while(j < n)
        {
            if(i + k > j)
            {
                minElement = Math.min(minElement, nums[j]);
                j += 1;
            }
            else
            {
                System.out.print(minElement + " ");
                i += 1;
                j = i;
                minElement = Integer.MAX_VALUE;
                
            }
            
        }
        System.out.print(minElement);
    }
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        
        int k = sc.nextInt();
        
        getMinElementInRange(n, nums, k);
    }
}