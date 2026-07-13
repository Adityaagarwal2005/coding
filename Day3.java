import java.util.Scanner;
class Solution{
    public void insert(int[] arr,int a){
        int count=0;
        boolean found=false;
        for(int j=0;j<arr.length;j++){
            count++;
            if(arr[j]==a){
                found=true;
                System.out.println("found at index"+j);
                System.out.println("Comparisons"+count);
                break;
            }
        }
        if (!found){
            System.out.println("Not Found");
            System.out.println("Comparisons"+count);
        }
}}
public class Day3 {
    public static void main( String [] args){
    int n;
    System.out.println("enter n");
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    int[] arr=new int[n];
    System.out.println("enter the array elements");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println("enter the key to search");
    int a=sc.nextInt();
     Solution s=new Solution();
     s.insert(arr,a);
     sc.close();
}
}