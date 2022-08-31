package twentyfive2022;

//wap to search an element
import java.util.Scanner;

public class SearchElement {

	public static void main(String[] args) {
		int i,size,search,arr[];
		boolean flag = false;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size:");
		size=sc.nextInt();
		
		//instantiate array
		arr=new int[size];
		
		//initialize array
		System.out.println("enter "+size+" elements in an array");
		for(i=0;i<size;i++)
		  {
			arr[i]=sc.nextInt();
		  }
		System.out.println("enter element you want searching for: ");
		search=sc.nextInt();
		
		//finding the element
		for(i=0;i<size;i++)
		{
			if(arr[i]==search)
			{
				//pos=i;
				flag = true;
				break;
			}
					
		}
		
		if(flag == true)
		{
			System.out.println("Data found at: "+(i+1)+" position");
		}
		else
			System.out.println("Data not found");
		

	}

}