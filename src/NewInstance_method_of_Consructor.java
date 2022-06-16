import java.lang.reflect.Constructor;

public class NewInstance_method_of_Consructor {

	private String str;

	NewInstance_method_of_Consructor() {

	}

	public void setName(String str) {
		this.str = str;
	}
	
	public static void main(String[] args) {
		
		try {
			Constructor<NewInstance_method_of_Consructor> con =  NewInstance_method_of_Consructor.class.getDeclaredConstructor();   
			NewInstance_method_of_Consructor r = con.newInstance();   
			r.setName("JavaTpoint");   
			System.out.println(r.str);   
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
