import java.util.*;

public class HashMapNew 
{

	public static void main(String[] args) 
	{
		HashMap<String, Integer> ages = new HashMap<String, Integer>();
		Scanner inp = new Scanner(System.in);
		System.out.println("How many entries do you want to make?");
		int inputs  = inp.nextInt();
		for (int i = 0; i < inputs; i++) 
		{
			System.out.println("Enter Key number " + (i+1));
			Scanner key = new Scanner(System.in);
			String keys = key.nextLine();
			System.out.println("Enter Value number " + (i+1));
			Scanner value = new Scanner(System.in);
			int values = value.nextInt();
			ages.put(keys, values);
		}
		System.out.println(ages);
	}

}
