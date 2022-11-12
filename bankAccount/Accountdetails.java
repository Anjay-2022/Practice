package bankAccount;

public class Accountdetails {
	private String name;
	private long accountnumber;
	private String address;
	private long mobileno;
	private int balance;
	private int withdraw;
	private int deposit;

//	public String getName() {
//		return name;
//	}

	public long getAccountnumber() {
		return accountnumber;
	}

//	public String getAddress() {
//		return address;
//	}
//
//	public long getMobileno() {
//		return mobileno;
//	}
//
//	public int getBalance() {
//		return balance;
//	}
//
//	public int getWithdraw() {
//		return withdraw;
//	}
//
//	public int getDeposit() {
//		return deposit;
//	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAccountnumber(long accountnumber) {
		this.accountnumber = accountnumber;
	}

	public void setAddress(String address) {
		this.address = address;
	}

    public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}

	public void setWithdraw(int withdraw) {
		this.withdraw = withdraw;
		balance = balance - withdraw;
	}

	public void setDeposit(int deposit) {
		this.deposit = deposit;
		balance = balance + deposit;
			
	}

	@Override
	public String toString() {
		return "\nAccountdetails \nAccount Name=" + name + ",\nAccountnumber=" + accountnumber + ",\nAddress=" + address
				+ ",\nMobileno=" + mobileno + ",\nBalance money=" + balance + ",\nLast withdraw=" + withdraw + ",\nLast deposit=" + deposit
				+ "\n";
	}
	
	

}
