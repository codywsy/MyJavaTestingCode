
public class TestJava2_1 {

	public static void main(String[] args){
		int j = args.length;
		for(int i=0;i<args.length;i++){
			System.out.println(args[i]);
		}
			
		
/*		Cadre cadre = new Cadre("������", 20, "�ɲ�");
		Student stu = new Student("��С��", 15, "ѧ��");
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
		return "�ɲ�-->������" + this.name + "�� ����:" + this.age + ", ְҵ�� " + this.occupation;
	}
}

class Student extends Person {
	public Student(String name, int age, String occupation){
		this.name = name;
		this.age = age;
		this.occupation = occupation;
	}
	
	public String talk(){
		return "ѧ��-->������" + this.name + "�� ����:" + this.age + ", ְҵ�� " + this.occupation;
	}
}

