package account.training.com;

public class Account {

	String _Name;
	int _AcNo;
	double _Balance;

	public Account(String Name, int AcNo, double Balance) {
		_Name = Name;
		_AcNo = AcNo;
		_Balance = Balance;
	}

	public double deposit(double Amt) {
		_Balance = this._Balance + Amt;
		return _Balance;
	}

	public double withdraw(double Amt1) {
		_Balance = this._Balance - Amt1;
		return _Balance;

	}
}
