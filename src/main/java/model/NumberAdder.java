/**  
* Cody Walker - crwalker11  
* CIS171 22149
* Feb 7, 2024  
*/ 
package model;

/**
 * @author User
 *
 */
public class NumberAdder {
	int num1, num2, num3, total;
	
	/**
	 * @return the num1
	 */
	public int getNum1() {
		return num1;
	}

	/**
	 * @param num1 the num1 to set
	 */
	public void setNum1(int num1) {
		this.num1 = num1;
	}

	/**
	 * @return the num2
	 */
	public int getNum2() {
		return num2;
	}

	/**
	 * @param num2 the num2 to set
	 */
	public void setNum2(int num2) {
		this.num2 = num2;
	}

	/**
	 * @return the num3
	 */
	public int getNum3() {
		return num3;
	}

	/**
	 * @param num3 the num3 to set
	 */
	public void setNum3(int num3) {
		this.num3 = num3;
	}

	/**
	 * @return the total
	 */
	public int getTotal() {
		return total;
	}

	/**
	 * @param total the total to set
	 */
	public void setTotal(int total) {
		this.total = total;
	}

	public NumberAdder() {
		super();
	}
	
	public NumberAdder(int num1, int num2, int num3) {
		super();
		
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
		
		addNumbers(num1, num2, num3);
	}

	/**
	 * 
	 */
	private void addNumbers(int num1, int num2, int num3) {
		// TODO Auto-generated method stub
		int total = num1 + num2 + num3;
		
		this.total = total;
	}
	
	@Override
	public String toString() {
		return "NumberAdder [userNumber1=" + num1 + ", userNumber2=" + num2 + ", userNumber3=" + num3 + "]";
	}
}
