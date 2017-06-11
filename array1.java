public class Array1{
	public static void main(String[] args){

			int[] arr = {-1,2,3,4,5,8,-9};
			 checkSum(arr,-7);
			//System.out.println(b);


}

public static void checkSum(int[] a, int n)
{
	//int[] list = new int[]
	
	if (n==0)
		return ;
	for(int i = 0; i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
			if(a[i] + a[j] == n)
				System.out.println(a[i] + " "+ a[j]);
	}

}

}