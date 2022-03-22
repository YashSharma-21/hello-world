import java.util.Scanner;



class Employee
{
	String name;
	int year;
	float salary;
	String address;


	Employee(String name,int year,float salary,String address)
	{
		this.name=name;
		this.year=year;
		this.salary=salary;
		this.address=address;
	}

	void printDetails()
	{
		System.out.println(name+"\t"+year+"\t\t"+salary+"\t"+address);
	}

}


class Main
{

	

	public static void main(String[] args)
	{

		Scanner sc;
		Employee[] employees=new Employee[3];

		for(int i=0;i<employees.length;i++)
		{

			sc=new Scanner(System.in);

			String name,address;
			int year;
			float salary;

			System.out.print("\nEnter name ");
			name=sc.nextLine();

			System.out.print("\nEnter address ");
			address=sc.nextLine();

			System.out.print("\nEnter salary ");
			salary=sc.nextFloat();

			System.out.print("\nEnter year of joining ");
			year=sc.nextInt();

			employees[i]=new Employee(name,year,salary,address);
		}		
			


		System.out.println("\n\nName\tYear of Joining\tSalary\t\tAddress");

		for(int i=0;i<employees.length;i++)
		employees[i].printDetails();
	}



}