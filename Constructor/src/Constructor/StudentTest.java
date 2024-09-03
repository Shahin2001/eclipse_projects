package Constructor;

public class StudentTest {
	public static void main(String[] args) {
		Student s1 = new Student();
		
		//System.out.println(s1.age);//default constructor so 
		//it will give default value that is 0;
		s1.age=30;
		s1.nm="shaina";
		s1.marks=90;
		
		System.out.println("Name:"+s1.nm);
		System.out.println("Age:"+s1.age);
		System.out.println("Marks:"+s1.marks);
		
		System.out.println();
		Student s = new Student();
		s.age=33;
		s.nm="Jay";
		s.marks=99;
		
		System.out.println("Name:"+s.nm);
		System.out.println("Age:"+s.age);
		System.out.println("Marks:"+s.marks);
	}

}

