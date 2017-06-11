public class Array5{
	public static void main(String[] args){

			int[] arr = {7,3, 5, 4, 5, 3, 4};
			int answer = checkOne(arr);
			System.out.println(answer);


}

public static int checkOne(int[] a)
{
	boolean checkDuplicate = false;

	for(int i = 0; i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if( a[i] == a[j] )
			{
				checkDuplicate = true;
			}
		}
		if (checkDuplicate == false)
			return a[i];
	}
	return -1;
}

}
