//find the position in infinite array
import java.util.Scanner;
public class Infarr{
    public static void binSearch(int[] arr,int target){
        int start=0;
        int end=1;
        while(target>arr[end]&&end<arr.length-1){
            int temp=end;
            end=Math.min(end+(end-start+1)*2,arr.length-1);
            start=temp;
        }
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid])end=mid-1;
            else if(target>arr[mid]) start=mid+1;
            else {
                System.out.println("Element found at the index "+mid);
                break;
            }
            }
            }
    public static void main(String[] args){
        int nums,target;
        System.out.println("Enter the No. of elements: ");
        Scanner h=new Scanner(System.in);
        nums=h.nextInt();
        int[] arr=new int[nums];
        for(int i=0;i<nums;i++){
            arr[i]=h.nextInt();
        }
        System.out.println("Enter the target: ");
        target=h.nextInt();
        binSearch(arr,target);
        h.close();
    }
}