
public class NewInstance_method {
	
	void show() {
		System.out.println("A new object created.");
	}

	public static void main(String[] args) {

		try {
			// creating an instance of Class class
			Class cls = Class.forName("NewInstance_method");
			// creates an instance of the class using the newInstance() method
			NewInstance_method obj = (NewInstance_method) cls.newInstance();
			// invoking the show() method
			obj.show();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}
