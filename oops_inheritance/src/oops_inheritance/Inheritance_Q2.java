package oops_inheritance;

public class Inheritance_Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee("Alice", 75000.0, 2018, "NI123456A");

        // Display employee details
        System.out.println("Name: " + emp.getName());
        System.out.println("Annual Salary: " + emp.getAnnualSalary());
        System.out.println("Year Started: " + emp.getStartYear());
        System.out.println("National Insurance Number: " + emp.getInsuranceNumber());

        // Update some values
        emp.setAnnualSalary(80000.0);
        emp.setName("Alice Smith");

        // Display updated details
        System.out.println("\nUpdated Details:");
        System.out.println("Name: " + emp.getName());
        System.out.println("Annual Salary: " + emp.getAnnualSalary());

	}

}
