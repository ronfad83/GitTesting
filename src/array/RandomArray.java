package array;

public class RandomArray
{
	private static int[] array = new int[10];
	
	public static void generateRandomArray()
	{
		for(int i=0;i<array.length;i++)
		{
			array[i] = (int) (Math.random()*10)+10;
		}
	}
	
	public static void cetakArray()
	{
		for(int i=0;i<array.length;i++)
		{
			System.out.print("| " + i + " | ");
			System.out.println(array[i] + " |");
		}
		
		System.out.println();
	}
	
	public static void main(String[] args)
	{	
		generateRandomArray();
		cetakArray();
	}
}
