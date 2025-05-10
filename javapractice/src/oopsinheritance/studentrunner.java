package oopsinheritance;

public class studentrunner {

	public static void main(String[] args) {
//		Person person = new Person();
//		person.setName("Ranga");
//		person.setEmail("gokul@gmail.com");
//		person.setPhoneno("123-456-7890");
//		String value = person.toString();
//		System.out.println(value);
//		System.out.println(person);
		employee emp = new employee("ranga", "title dhan pa");
		emp.setEmail("grj@gmail.com");
		emp.setPhoneno("123-456-7890");
		emp.setEmployeeGrade('A');
		emp.setTitle("programmer analyst");
		System.out.println(emp);
	}

}
