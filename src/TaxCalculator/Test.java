package TaxCalculator;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
	
		List<Employee> employees= new ArrayList();
		Employee Anna = new FullTimeEmployee();
		Anna.setFirstName("Anna");
		Anna.setLastName("Smith");
		Anna.setMonthlyIncome(4000);
		Anna.setNbHoursPerWeek(40);
		
		employees.add(Anna);
	
		double totalTaxes=0;
		for(Employee employee: employees) {
			TaxCalculator taxCalculator = TaxCalculatorFactory.create(employee);
			
		double tax= taxCalculator.calculate(employee);
		totalTaxes +=taxCalculator.calculate(employee);
		}
		System.out.println("Total taxes: "+ totalTaxes);
	}

}
