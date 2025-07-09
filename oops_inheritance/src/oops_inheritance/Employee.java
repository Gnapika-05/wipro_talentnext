package oops_inheritance;

public class Employee extends Person {
		double annualSalary;
		int startYear;
		String insuranceNumber;


		public Employee(String name, double annualSalary, int startYear, String insuranceNumber) {
			super(name);
			this.annualSalary = annualSalary;
			this.startYear = startYear;
			this.insuranceNumber = insuranceNumber;
		}
		
		public double getAnnualSalary() {
			return annualSalary;
		}

		public void setAnnualSalary(double annualSalary) {
			this.annualSalary = annualSalary;
		}




		public int getStartYear() {
			return startYear;
		}




		public void setStartYear(int startYear) {
			this.startYear = startYear;
		}




		public String getInsuranceNumber() {
			return insuranceNumber;
		}




		public void setInsuranceNumber(String insuranceNumber) {
			this.insuranceNumber = insuranceNumber;
		}




	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
