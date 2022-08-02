package arrays;

public class SmallestElement 
{  
  

public void sortArr(int arr[])  
{  
int size = arr.length;  
  
for(int i = 0; i < size; i++)  
{  
int temp = i;  
for(int j = i + 1; j < size; j++)  
{  
if(arr[temp] > arr[j])  
{  
temp = j;  
}  
  
  
  
}  
  
  
if(temp != i)  
{  
int t = arr[i];  
arr[i] = arr[temp];  
arr[temp] = t;   
}  
}  
}  
  
  
public int find4thSmallest(int arr[], int sm)  
{  
sortArr(arr);  
  

return arr[sm - 1];  
}  
  
  

public static void main(String argvs[])  
{  
SmallestElement obj = new SmallestElement();  
  
int arr[] = {56, 34, 7, 9, 0, 48, 41, 8};  
  
int size = arr.length;    
  
int arr1[] = {280, 86, 3, 4, 18, 16, 27, 80, 28, 72};  
  
size = arr1.length;  
int sm = 4;  
  
System.out.println("For the array: ");  
for(int i = 0; i < size; i++)  
{  
System.out.print(arr1[i] + " ");  
}  
  
int ele = obj.find4thSmallest(arr1, sm);  
  
System.out.println();  
System.out.println("The " + sm + "th smallest element of the array is: " + ele);  
  
}  
}  