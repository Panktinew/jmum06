
public class Person {
	
	private String pname;
	private int income;
	private float tax;
	private String pemail;
	
	//default constructor
	public Person() {
		
		this.pname="test";
		this.pemail="test@test.com";
		this.tax=0.0f;
		this.income=0;
		
	}
	
	
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	
	public int getIncome() {
		return income;
	}
	public void setIncome(int income) {
		this.income = income;
	}
	public float getTax() {
		return tax;
	}
	public void setTax(float tax) {
		this.tax = tax;
	}
	public String getPemail() {
		return pemail;
	}
	public void setPemail(String pemail) {
		this.pemail = pemail;
	}
	@Override
	public String toString() {
		return "Person [pname=" + pname + ", income=" + income + ", tax=" + tax + ", pemail=" + pemail + "]";
	}

}
