package PackageTest.com.horstmann.corejava;

import java.util.*;

public class Employee {
	private String name;
	private double salary;
	private Date hireDay;
	
	public Employee(String _name, double _salary, int _year, int _month, int _day)
	{
		name = _name;
		salary = _salary;
		GregorianCalendar calendar = new GregorianCalendar(_year, _month, _day);
		// GregorianCalendar uses 0 for Jan
		hireDay = calendar.getTime();
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public Date getHireDay()
	{
		return hireDay;
	}
	
	public void raiseSalary(double byPercent)
	{
		double raise = salary * byPercent/100;
		salary += raise;
	}
}
