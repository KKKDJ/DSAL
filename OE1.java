import java.util.Scanner;
import java.io.*;

public class OE1 {
	static int arr[] = {1,2,3,4,5};//Array na ginawa
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		
		
		
		int delete_val,search_val,index_val,vindex_val;
		
		System.out.println("Choose the operation\n1 = Traverse\n2 = Delete\n3 = Search\n4 = Update\nInput:");
		int choice = in.nextInt();
		
		if (choice == 1) {
			traverse(arr);
		}
		else if (choice == 2) {
			System.out.println("input the value to be deleted:");
			delete_val = in.nextInt();
			delete(arr,delete_val);
		}
		
		else if (choice ==3) {
			System.out.println("input the value to be searched:");
			search_val = in.nextInt();
			search(arr,search_val);
		}
		
		else if (choice ==4) {
			System.out.println("input the value to be changed:");
			index_val = in.nextInt();
			System.out.println("input the value to replace:");
			vindex_val = in.nextInt();
			updateValue(arr,index_val,vindex_val);
		}
	}

	//TRAVERSE FUNCTION
	public static void traverse(int arr[]) {
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}	
	}
	
	//DELETE FUNCTION
	public static void delete(int arr[],int val) {
		for(int i =0;i<arr.length-1;i++) {
			if(val == arr[i]) {
				//taga adjust nung value to the left
				for(int j=i;j<arr.length-1;j++) {
					arr[j]=arr[j+1];
				}
			}
			System.out.print(arr[i]+" ");
		}	
	}
	
	//SEARCH FUNCTION
	public static int search(int arr[],int val) {
		boolean found= false;
		for(int i =0;i<arr.length;i++) {
			if(val == arr[i]) {
				System.out.println("I found the value at index: "+i);
				found= true;
			}	
		}
		if(!found) {
			System.out.println("No value found on the array");
			return 0;
		}
		return 0;
	}//end of search
	
	//UPDATE FUNCTION - update the matching index
	public static void updateIndex(int arr[],int ival,int val) {
		for(int i =0; i<arr.length;i++) {
			if(ival == i) {
				arr[i] = val;
			}
			System.out.print(arr[i]+" ");
		}
	}
	
	//UPDATE FUNCTION - update the matching value
	public static void updateValue(int arr[],int dval, int uval) {
		for(int i =0; i<arr.length;i++) {
			if(arr[i] == dval) {
				arr[i] = uval;
			}
			System.out.print(arr[i]+" ");
		}
	}
	
	
}


