package mattPhillips.example.financeapplicationassignment;

public class GoalExpense {

	
	public int id;
	public String name,
					account;
	public Float ammount;
	public GoalExpense(int id, String name, String account, Float ammount) {
		super();
		this.id = id;
		this.name = name;
		this.account = account;
		this.ammount = ammount;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public Float getAmmount() {
		return ammount;
	}
	public void setAmmount(Float ammount) {
		this.ammount = ammount;
	}
	
	
	
}
