//Question7 Dhiraj_93037
package day6CodeExamplesSaturday.beans;

public class Account {

	private int accNO;
	public String accHolderName;

	public Account() {
	}

	public Account(int accNO, String accHolderName) {
		super();
		this.accNO = accNO;
		this.accHolderName = accHolderName;
	}

	public int getAccNO() {
		return accNO;
	}

	public void setAccNO(int accNO) {
		this.accNO = accNO;
	}

	public String getAccHolderName() {
		return accHolderName;
	}

	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}

	@Override
	public String toString() {
		return "Account \n\taccNO=" + accNO + "\n\taccHolderName=" + accHolderName;
	}

}
