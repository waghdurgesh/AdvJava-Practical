package co.edureka;

public class Student {
	private int rollno;
	private String sname;
	private Address address;

	public Student() {
		rollno = 1;
		sname = "pintu";
		address = new Address("Nashik", "Goa", 422011);
	}

	public Student(int rollno, String sname, Address address) {
		super();
		this.rollno = rollno;
		this.sname = sname;
		this.address = address;
	}
	//constructor injection
	public Student(Address address) {
		this.address = address;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", sname=" + sname + ", address=" + address + "]";
	}

	public void myInit() {
		System.out.println("**Object Initiated**");
	}

	public void myDestroy() {
		System.out.println("**Object Destroy**");
	}
}
