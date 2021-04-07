//caseStudy1
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

class SalaryComparator implements Comparator<Employee>{
 
		public int compare(Employee o1, Employee o2) {
			if (o1.getSalary() > o2.getSalary()) {
				return 1;
			}
			return -1;
		}
	
}

class Employee {

	private int eid;
	private String ename;
	private double salary;
	/**
	 * @param eid
	 * @param ename
	 * @param salary
	 */
	public Employee(int eid, String ename, double salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + "]";
	}
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	/**
	 * 
	 */
	public Employee() {
		super();
	}

	
	
}


public class EmployeeSort {
	static ArrayList<Employee> e = new ArrayList<Employee>();
	
	public static void main(String[] args) {
	
		EmployeeSort em = new EmployeeSort();
		Employee e1 = new Employee(1, "bhavya", 1234);
		Employee e2 = new Employee(2, "manoj", 12345);
		Employee e3 = new Employee(3, "shah", 123456);
		Employee e4 = new Employee(4, "akash", 12342);
		
		e.add(e1);
		e.add(e2);
		e.add(e3);
		e.add(e4);
		em.getEmployeesBySalarySort(e);
		System.out.println(e);
		System.out.println(em.countEmployeesSalaryOfGivenRange(1000,10000));
		
		
	}
	
	public ArrayList<Employee> getEmployeesBySalarySort(ArrayList<Employee> e){
		
		Collections.sort(e, new SalaryComparator());
		 
		return e;
		
	}
	public int countEmployeesSalaryOfGivenRange(double minRange, double maxRange){
		int count=0;
		for(Employee i : e) {
			
			if(i.getSalary()>minRange && i.getSalary()<maxRange) {
				count++;
			}
		}
		return count;	
	}
	

}
