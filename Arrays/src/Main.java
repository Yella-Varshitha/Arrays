
public class Main {
	public static void main(String[] args) {
		Person person =new Person();
		person.setName("Varshitha");
		person.setAge(25);
		person.setCountry("USA");
		
		
		//Get values from the get methods
		 String name=person.getName();
		 System.out.println("Name:"+name);
		 int age=person.getAge();
		 System.out.println("age:"+age);
		 String country=person.getCountry();
		
		 System.out.println("Country:"+country);
		 
		
		 
		 
		
	}

}
