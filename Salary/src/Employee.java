
public class Employee {

	String name;
	double salary;
	int workHours;
	int hireYear;
	
	Employee(String name,double salary,int workHours,int hireYear){
		this.name=name;
		this.salary=salary;
		this.workHours=workHours;
		this.hireYear=hireYear;
	}
	
	public double tax(double salary) {
		if(salary<1000)return 0;
		else return salary*0.03;
	}
	
	public double bonus(int workHours) {
		if(workHours<=40) return 0;
		else return (workHours-40)*30;
					
	}
	
	public double raiseSalary(int hireYear) {
		int worked =2021-hireYear;
		if(worked<9) return this.salary*0.05;
		else if(worked>=9&&worked<19)return this.salary*0.1;
		else return this.salary*0.15;
	}
	
	public double calcSalary(Employee e){
		return e.salary + bonus(e.workHours) + raiseSalary(e.hireYear) - tax(e.salary); 
	}
	
	public void printEmployee(Employee e) {
		System.out.println("Employee Name : "+e.name);
		System.out.println("Salary : "+e.salary);
		System.out.println("Worked Hours : "+ e.workHours);
		System.out.println("Hired Year : "+e.hireYear);
		System.out.println("Tax : "+tax(e.salary));
		System.out.println("Bonus : "+ bonus(e.workHours));
		System.out.println("Raise of Salary : "+raiseSalary(e.hireYear));
		System.out.println("Net Salary : "+calcSalary(e));
	}
}
