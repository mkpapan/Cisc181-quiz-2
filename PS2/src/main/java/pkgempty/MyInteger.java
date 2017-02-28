package pkgempty;

public class MyInteger {

	private int iValue;

	public MyInteger(int iValue) {
	}

	MyInteger iinteger = new MyInteger(iValue);

	public int getiValue() {
		return iValue;
	}

	public void setiValue(int iValue) {
		this.iValue = iValue;
	}

	public boolean isEven() {
		if (iValue % 2 == 0)
			return true;
		else
			;
		return false;
	}

	public boolean isOdd() {
		if (iValue % 2 == 1)
			return true;
		else
			;
		return false;
	}

	public boolean isPrime() {
		if (iValue % 2 == 0)
			return false;
		for (int n = 3; n * n <= iValue; n += 2)
			if (iValue % n == 0)
				return false;
		return true;
	}

	public static boolean isEven(int i) {
		if (i % 2 == 0)
			return true;
		else
			;
		return false;
	}

	public static boolean isOdd(int i) {
		if (i % 2 == 1)
			return true;
		else
			;
		return false;
	}

	public static boolean isPrime(int i) {
		if (i % 2 == 0)
			return false;
		for (int n = 3; n * n <= i; n += 2)
			if (i % n == 0)
				return false;
		return true;
	}

	public static boolean isEven(MyInteger i) {
		return i.isEven();
	}

	public static boolean isOdd(MyInteger i) {
		return i.isOdd();
	}

	public static boolean isPrime(MyInteger i) {
		return i.isPrime();
	}

	public boolean equals(int a) {
		if (a == iValue)
			return true;
		else
			;
		return false;
	}

	public boolean equals(MyInteger a) {
		return a.equals(iValue);
	}
}
