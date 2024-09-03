package Constructor;

public class Studentt {
	int roll;
	String name;
	int marks;
	
	Studentt(int r, String n,int m){
		roll=r;
		name=n;
		marks=m;
		
		System.out.println("Roll:"+ roll);
		System.out.println("Name:"+ name);
		System.out.println("Marks:"+ marks);
		System.out.println();
	}
	

	Studentt(int rl,String n){
		roll=rl;
		name=n;
		
		System.out.println("Roll:"+ roll);
		System.out.println("Name:"+ name);
		System.out.println();
	}
	
	Studentt(int rl){
		roll=rl;
		System.out.println("Roll:"+ roll);
		System.out.println();
		
	}
	
	Studentt(Studentt s){
		
		name=s.name;
		roll=s.roll;
		marks=s.marks;
		
        System.out.println(roll);
        System.out.println( name);
        System.out.println( marks);
        System.out.println();
	}
	
	Studentt(Person p){
		name=p.name;
		roll=p.roll;
		marks=p.marks;
		
		 System.out.println(roll);
	     System.out.println( name);
	     System.out.println( marks);
		
		
	}
	
	

}
