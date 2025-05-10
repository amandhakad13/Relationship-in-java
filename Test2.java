class Address {
	String address;
	
	Address(String address) {
		this.address = address;
	}
	
	void address1Display() {
		System.out.println("Address 1 = "+address);
	}
	void address2Display() {
		System.out.println("Address 2 = "+address);
	}
}

class Employee {
	int id;
	String name;
	
	Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	void display() {
		System.out.println("Id = "+id);
		System.out.println("Name = "+name);
	}
	
	Address a1 = new Address("456 Vijay Nagar");
	Address a2 = new Address("657 Shanti Nagar");
}

class Test2 {
	public static void main(String[] args) {
		Employee e = new Employee(1, "Rohit");
		e.display();
		e.a1.address1Display();
		e.a2.address2Display();
	}
}