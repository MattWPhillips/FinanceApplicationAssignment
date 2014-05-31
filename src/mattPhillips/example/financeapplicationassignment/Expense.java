package mattPhillips.example.financeapplicationassignment;

import android.database.Cursor;

public class Expense {

		public int id;
		public String accounts,
					discrtiption,
					expenseGoalName;
		public Float amount,
					defaultCost;
		public String gps;
		public String timeDate;
	
	
	public Expense(int id, String accounts, String discrtiption,
				String expenseGoalName, Float amount, Float defaultCost,
				String gps, String timeDate) {
			super();
			this.id = id;
			this.accounts = accounts;
			this.discrtiption = discrtiption;
			this.expenseGoalName = expenseGoalName;
			this.amount = amount;
			this.defaultCost = defaultCost;
			this.gps = gps;
			this.timeDate = timeDate;
		}


	public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public String getAccounts() {
			return accounts;
		}


		public void setAccounts(String accounts) {
			this.accounts = accounts;
		}


		public String getDiscrtiption() {
			return discrtiption;
		}


		public void setDiscrtiption(String discrtiption) {
			this.discrtiption = discrtiption;
		}


		public String getExpenseGoalName() {
			return expenseGoalName;
		}


		public void setExpenseGoalName(String expenseGoalName) {
			this.expenseGoalName = expenseGoalName;
		}


		public Float getAmount() {
			return amount;
		}


		public void setAmount(Float amount) {
			this.amount = amount;
		}


		public Float getDefaultCost() {
			return defaultCost;
		}


		public void setDefaultCost(Float defaultCost) {
			this.defaultCost = defaultCost;
		}


		public String getGps() {
			return gps;
		}


		public void setGps(String gps) {
			this.gps = gps;
		}


		public String getTimeDate() {
			return timeDate;
		}


		public void setTimeDate(String timeDate) {
			this.timeDate = timeDate;
		}


	public Cursor add(Cursor cursor)
	{
		
		
		return cursor;
	}
	
	
}
