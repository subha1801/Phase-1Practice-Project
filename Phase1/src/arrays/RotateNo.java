package arrays;
class RotateArr{ 
public void rotate(int[] n, int x) {
    		if(x > n.length) 
       			x=x%n.length;
 		int[] result = new int[n.length];
 		for(int i=0; i < x; i++){
        			result[i] = n[n.length-x+i];
 		}
 		int j=0;
    		for(int i=x; i<n.length; i++){
        			result[i] = n[j];
j++;
    		}
 		System.arraycopy( result, 0, n, 0, n.length );
}
} 

public class RotateNo
{
	public static void main(String[] args) {
		RotateArr r = new RotateArr();
        		int arr[] = { 10, 20, 30, 40, 50, 60, 70,80 }; 
        		r.rotate(arr, 5); 
        		for(int i=0;i<arr.length;i++){
            			System.out.print(arr[i]+" ");
        		}
	}
}
