package banking;

public class Account {

	private int accno;
	private String customerName;

	private String address;
	private double balance;

	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
