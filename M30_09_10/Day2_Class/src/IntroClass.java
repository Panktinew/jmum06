
public class IntroClass {
	
	//data members (variables) ------  private
	
	private int srnol;
	private String name;
	
	
	//member function --- functions   --- public
	
	public int getSrno() {
		return srnol;
	}
	public String getName() {
		return name;
	}
	
	public void setSrno(int srno) {
		 srnol=srno;
	}
	public void setName(String sname) {
		 name=sname;
	}
	public void printData() {
		System.out.println("hello....");
	}

}
