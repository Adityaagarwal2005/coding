import java.util.Scanner;
class Solution{
    public void insert(int[] arr,int a,int b){
        for(int j=arr.length-1;j>=a;j--){
            arr[j]=arr[j-1];
           
        }
        arr[a - 1] = b;
       for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    
    }
}
public class Day1 {
    public static void main( String [] args){
    int n;
    System.out.println("enter n");
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    int[] arr=new int[n+1];
    System.out.println("enter the array elements");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
     System.out.println("enter the position");
     int a=sc.nextInt();
     System.out.println("enter the element");
     int b=sc.nextInt();
     Solution s=new Solution();
     s.insert(arr/*arr*/,a/*pos*/,b/*to enter*/);
     sc.close();
}
}