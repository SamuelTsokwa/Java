public class Array2{
	public static void main(String[] args){

			int[] arr = {-1,2,3,4,5,8,-9};
			int[] arr1 = {12,131,24,5,8,9};
			 checkSame(arr,arr1);
			//System.out.println(b);


}

public static void checkSame(int[] a, int[] b)
{
	//int[] list = new int[]
	
	
	for(int i = 0; i<a.length;i++)
	{
		for(int j=0;j<b.length;j++)
			if(a[i] == b[j])
				System.out.println(a[i]);
	}

}

}