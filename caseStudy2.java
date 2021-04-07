
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


class Employ {

	private int eid;
	private String ename;
	private double salary;

	public Employ(int eid, String ename, double salary) {
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

	public Employ() {
		super();
	}

	
	
}



public class caseStudy2 {
	static HashMap<Integer, Employ> e = new HashMap<>();
	static int i = 1;

	public static void main(String[] args) {
		caseStudy2 m = new caseStudy2();
		Employ e1 = new Employ(1, "bhavya", 41000);
		Employ e2 = new Employ(2, "manoj", 41000);
		Employ e3 = new Employ(3, "shah", 41000);
		
		m.add(e1);
		m.add(e2);
		m.add(e3);
		System.out.println("successfully added"+e);
		
		System.out.println(m.getEmploysByName("shah"));
		
		if(m.removeEmploy(3))
		System.out.println("deleted");

	}

	public void add(Employ employ) {
		e.put(i, employ);
		i++;
	}
	public  List<Employ>  getEmploysByName(String employName){
		List<Employ> l = new ArrayList<Employ>();
		
		for(int j=1;j<e.size()+1;j++) {
		String name = e.get(j).getEname();
		int id = e.get(j).getEid();
		double salary = e.get(j).getSalary();
		//System.out.println(name);
		if(name==employName) {
		//System.out.println(name+id+salary);	
		l.add(new Employ(id, name, salary));
		}
	
		}
		//System.out.println(l);
		return l;

	}
	public   boolean   removeEmploy(int employId){
		boolean flag = false;
		for(int j=1;j<e.size()+1;j++) {
			int id = e.get(j).getEid();
			if(id==employId)
				e.remove(j);
			flag = true;
		}
		return flag;
		//add logic to remove an employ from HashMap
		}

}
