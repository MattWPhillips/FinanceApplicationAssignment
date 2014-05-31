package mattPhillips.example.financeapplicationassignment;

public class Account {

	
	public int id;
	public String name;
	public float amount;
	
	public Account(int id, String name, float amount) {
		super();
		this.id = id;
		this.name = name;
		this.amount = amount;
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

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}
	
	
}
