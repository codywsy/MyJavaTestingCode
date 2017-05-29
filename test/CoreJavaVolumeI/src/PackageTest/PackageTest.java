package PackageTest;

import PackageTest.com.horstmann.corejava.Employee;
import static java.lang.System.*;

/**
 * This class is to test the attribute of package
 * @author ˼Զ
 * @category testing
 */

public class PackageTest {

	public static void main(String[] args) {
		//because of the import statement, we don't have to use Employee here
		Employee harry = new Employee("Harry Hacker", 5000, 1989, 10, 1);
		
		harry.raiseSalary(5);
		
		//because of the static import statement, we don't have to use System.out here
		out.println("name=" + harry.getName() + ", salary=" + harry.getSalary());
		
	}

}
