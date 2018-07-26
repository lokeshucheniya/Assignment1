import java.util.*;
class login
{
	public static void main(String args [])
	{
		//Initialization
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter login details");
		int count = 1,flag = 0;
		
		//Validating Login
		while(flag == 0)
		{
			String id = sc.nextLine();
			String pass = sc.nextLine();
			if(id.equals("lokesh") && pass.equals("lokeshucheniya"))
			{
				System.out.println("Welcome "+id);
				flag = 1;
				break;
			}
			else
			{
				if(count>2)
				{
					System.out.println("Contact Admin");
					break;
				}
			}
			count+=1;
		}
	}
}