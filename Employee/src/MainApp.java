class Employee
{
	public void netsalary()
	{
				
	}
	
}
class Intern extends Employee
{
	public void netsalary()
	{
		System.out.println("interns salry");
		
	}
}
class Confirmed extends Employee
{
	public void netsalary()
	{
		System.out.println("confirmed employee salry");
		
	}
	public void transport()
	{
		System.out.print("transport for confirmed employees");
	}
}
class Hr
{
	public Employee Recruit(String empType)
	{
		if(empType.equalsIgnoreCase("I"))
		{
			return new Intern();
		}
		else if(empType.equalsIgnoreCase("C"))
		{
			return new Confirmed();
		}
		return null;
	}
}
 class Finance 
 {
	 public void processSalary(Employee emp)
	 {
		 emp.netsalary();
		 if(emp instanceof Confirmed)
		 {
			 Confirmed conf = (Confirmed) emp; // downcast
			 conf.transport();
		 }
	 }
 }

 public class MainApp
 {
	 public static void main( String args[])
	 {
		 Hr hr= new Hr();
		 Finance finance= new Finance();
	     Employee employee = hr.Recruit("c");
	     if (employee != null)
	     {
	    	 finance.processSalary(employee);
	     }
	 }
 }



