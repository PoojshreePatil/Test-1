package WrittenTest2;

public class Employee {
		int id,salary;
		String name,dept,email;
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDept() {
			return dept;
		}
		public void setDept(String dept) {
			this.dept = dept;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		
		public String toString()
		{
			return "Id: "+id+"  Name: "+name+"  Salary: "+salary+"  EmailId: "+email+"  Department: "+dept;
		}
		
	}

