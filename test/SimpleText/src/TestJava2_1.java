
public class TestJava2_1 {

	public static void main(String[] args){
		int j = args.length;
		for(int i=0;i<args.length;i++){
			System.out.println(args[i]);
		}
			
		
/*		Cadre cadre = new Cadre("李乐乐", 20, "干部");
		Student stu = new Student("王小六", 15, "学生");
		System.out.println(cadre.talk());
		System.out.println(stu.talk());
*/
	}
}

abstract class Person{
	String name;
	int age;
	String occupation;
	public abstract String talk();
}

class Cadre extends Person {
	public Cadre(String name, int age, String occupation){
		this.name = name;
		this.age = age;
		this.occupation = occupation;
	}
	
	public String talk(){
		return "干部-->姓名：" + this.name + "， 年龄:" + this.age + ", 职业： " + this.occupation;
	}
}

class Student extends Person {
	public Student(String name, int age, String occupation){
		this.name = name;
		this.age = age;
		this.occupation = occupation;
	}
	
	public String talk(){
		return "学生-->姓名：" + this.name + "， 年龄:" + this.age + ", 职业： " + this.occupation;
	}
}

