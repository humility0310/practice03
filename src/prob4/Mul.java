package prob4;

public class Mul {

	private int l_value;
	private int r_value;
	private String operator;

	public int getL_value() {
		return l_value;
	}

	public void setL_value(int l_value) {
		this.l_value = l_value;
	}

	public int getR_value() {
		return r_value;
	}

	public void setR_value(int r_value) {
		this.r_value = r_value;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}
	public Mul(int l_value, String perator, int r_value){
		int result = l_value*r_value;
		System.out.println(result);
	}
}
