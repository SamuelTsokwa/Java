public class Array3{
	public static void main(String[] args){

			int[] arr = {1, 2, 1, 2, 3, 4, 5};
			 checkDuplicate(arr);
			//System.out.println(b);


}

public static  checkDuplicate(int[] a)
{
	int[] b = new int[a.length];
	
	
	for(int i = 0; i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i] != a[j])
			{
				b[i]=a[i];

			}
		}
			System.out.println(b[i]);	
	}
	
}

}