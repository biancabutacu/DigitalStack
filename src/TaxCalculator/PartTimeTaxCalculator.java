package TaxCalculator;

public class PartTimeTaxCalculator implements TaxCalculator {

	private final int RETIREMENT_TAX_PERCENTAGE =5;
	private final int INCOME_TAX_PERCENTAGE = 16;
	private final int BASE_HEALTH_INSURANCE = 100;

		@Override
		public double calculate(Employee employee) {
			int monthlyIncome = employee.getMonthlyIncome();
			// TODO Auto-generated method stub
			return BASE_HEALTH_INSURANCE+
					(monthlyIncome*RETIREMENT_TAX_PERCENTAGE)/100+
							(monthlyIncome*INCOME_TAX_PERCENTAGE)/100;
		}

}
