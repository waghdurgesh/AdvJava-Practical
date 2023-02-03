package co.edureka;

public class Employee {

	private int eid;
	private String ename;
	private int esalary;

	// Constructors
	public Employee() {
		eid = 1;
		ename = "sachin";
		esalary = 50000;
		System.out.println("*******Employee object Constr*********");
	}

	public Employee(int eid, String ename, int esalary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
	}

	// getter& setter
	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getEsalary() {
		return esalary;
	}

	public void setEsalary(int esalary) {
		this.esalary = esalary;
	}

	// Tostring
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + "]";
	}

	public void myInit() {
		System.out.println("***Object Initialization***");
	}

	public void myDestroy() {
		System.out.println("***Object Destroyed***");
	}

}
