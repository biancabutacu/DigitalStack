package TaxCalculator;

public class InternTaxCalculator implements TaxCalculator {
	
	private final int INCOME_TAX_PERCENTAGE = 16;


		@Override
		public double calculate(Employee employee) {
			int monthlyIncome = employee.getMonthlyIncome();
		
			return monthlyIncome*INCOME_TAX_PERCENTAGE;
		}

}
