

package datastractures.stack;


public class Employee {
	
	public String name;
	public String surname;
	public int id;

	public Employee(String name, String surname, int id) {
		this.name = name;
		this.surname = surname;
		this.id = id;
	}

	@Override
	public String toString() {
		return "{ Name: " + this.name + " , Surname:  " + this.surname + " , id " + this.id + "}";
	}


	@Override

	public boolean equals(Object o) {

		if(this == o) return true;

		Employee emp = (Employee)o;

		if(id != emp.id) return false;
		if(!surname.equals(emp.surname)) return false;

		return surname.equals(emp.surname);
	}
}