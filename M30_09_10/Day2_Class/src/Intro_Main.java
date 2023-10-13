
public class Intro_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        IntroClass obj1 = new IntroClass();
        obj1.printData();
        obj1.setSrno(12);
        obj1.setName("nisha");
        
        
        System.out.println(obj1.getSrno() + " " +obj1.getName());
       
        
        Person p1 = new Person();
        
        
        p1.setPname("pooja");
        p1.setIncome(45000);
        p1.setTax(0.0f);
        p1.setPemail("aaaa@ddd.com");
        
        System.out.println(p1.toString());
        
        
        Person p2 =new Person();
        
        System.out.println(p2.toString());
        
       
        
	}

}
