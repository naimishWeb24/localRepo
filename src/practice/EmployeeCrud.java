package practice;
import java.util.UUID;
import java.text.SimpleDateFormat;
import java.util.*;

public class EmployeeCrud {
	
	private static ArrayList<Employee> employeeList=new ArrayList<>();
	 static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
			EmployeeCrud employee = new EmployeeCrud();
		while(true) {
			System.out.println();
			System.out.println("1.insert");
			System.out.println("2.display");
			System.out.println("3.delete");
			System.out.println("4.update");
			System.out.println("5.sort");
			System.out.println("6.Search");
			System.out.println();
			System.out.println("Enter your Choice : ");
			int choice = scanner.nextInt();
			System.out.println();			
				switch(choice) {
				
					case 1: employee.insert();
							break;	
							
					case 2: employee.display();
							break;
							
					case 3: employee.delete();
							break;
							
					case 4:	employee.update();
							break;
							
					case 5:	employee.sort(employeeList);
							break;
							
					case 6:	employee.search();
							break;
							
					default:System.out.println("Enter Valid Choice : ");
							break;
				}
				
			}	
	}
	// insert Operation
		public void insert() {
			Employee employee = new Employee();
			UUID uid = UUID.randomUUID();
			UUID employeeId = uid;
			employee.setEmployeeId(employeeId);
			employee = getDataFromUser(employee);
			// calling constructor for inserting the data
			employeeList.add(employee);
		}
		
		// Date Validation
		private boolean isValidDate(String date) {
	        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
	        dateFormat.setLenient(false);

	        try {
	            dateFormat.parse(date);
	            return true;
	        } catch (Exception e) {
	            System.out.println("Invalid date format. Please enter the date in dd-MM-yyyy format.");
	            return false;
	        }
	    }
		
		// Method to Validate Age
		private boolean isValidAge(int EmployeeAge) {
			return EmployeeAge > 18 && EmployeeAge < 100;
		}
		
		// Displaying the data
		public  void display() {
			// if data not found then showing data is not found
			if (employeeList.isEmpty()) {
				System.out.print("No data found !!");
			} else {
				// Displaying the data
				System.out.println("Id"+" "+"name"+" "+"skills+"+"  "+"Age"+" "+"salary"+" "+"Joining date");
				int count=0;
				 for (Employee employee : employeeList) {
					 count++;
					System.out.println(count+" "+employee.toString());
				}
			}
		}
		
		// Delete Operation
		public void delete() {		
			System.out.println("enter employee number you want delete : ");
			int number = scanner.nextInt();
			if ( employeeList.isEmpty() ) {
				System.out.println("List is empty !!");
				
			} else {
				employeeList.remove(number);
				System.out.println("Employee Deleted succesfully !!");
				return;
			}
		}	
		
		// Search Operation 
		public void search() {
			// getting input from user for searching employee
			System.out.println("enter employee name you want Search: ");
			String employeeName = scanner.next();
			if(employeeList.isEmpty()) {
				System.out.println("List is empty !!");
			} else {
				for (int i = 0; i < employeeList.size(); i++) {
					Employee e = employeeList.get(i);
					if (e.getEmployeeName().equals(employeeName)) {
						System.out.println( i + "  " + e.toString());
						return;
					}
				}
			}
		}
		
		// Update operation
		public void update() {	
			System.out.println("enter employee number you want update : "); 
			int num = scanner.nextInt();
			if(employeeList.isEmpty()) {
				System.out.println("List is empty !!");
				
			} else {
				Employee employee = employeeList.get(num);
				employee=getDataFromUser(employee);
				employeeList.set(num, employee);
				return;
			}
		}
		
		public void sort (ArrayList<Employee> employeeList) {
			
			int n = employeeList.size();
			for (int i = 1; i < n; i++) {
					Employee  e = employeeList.get(i);
					int j = i - 1;
					
				while (j >= 0 && employeeList.get(j).employeeAge > e.employeeAge) {
					employeeList.set( j + 1 , employeeList.get(j));
					j = j-1;
				}
				employeeList.set( j+1, e);				
			}
			for (int i = 0; i < employeeList.size(); i++) {
				Employee e = employeeList.get(i);		
				System.out.println(i + "  " + e.toString());
			}
		}
		
		public Employee getDataFromUser(Employee employee)
		{
			System.out.println("Enter Employee Name : ");
			employee.setEmployeeName(scanner.next());	
			System.out.println("Enter Employee skills : ");
			employee.setEmployeeSkills(scanner.next());
			int employeeAge;
			do {
				System.out.println("Enter Employee age : ");
				while (!scanner.hasNextInt()) {
					System.out.println("Please enter a Valid Age (a number)  ");
					scanner.next();
				}
				employeeAge = scanner.nextInt();
			} while(!isValidAge(employeeAge));
			employee.setEmployeeAge(employeeAge);
			
			System.out.println("Enter Employee salary : ");
			employee.setEmployeeSalary(scanner.nextDouble()); 
			String date;
			do {
				System.out.println("Enter Employee Joining date : ");
				date = scanner.next();
			} while (!isValidDate(date));
			employee.setDate(date);
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
			Date date2 = null;
			try {
				date2 = dateFormat.parse(date);
			} catch(Exception em) {
				System.out.println("Enter valid Date !!");
				
			}
			return employee;
		}
}
