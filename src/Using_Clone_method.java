
public class Using_Clone_method implements Cloneable {

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// invokes the clone() method of the super class
		return super.clone();
	}

	String str = "New Object Created Again";

	public static void main(String[] args) {
		// creating an object of the class
		Using_Clone_method obj1 = new Using_Clone_method();
		//System.out.println(obj1.str);
		// try catch block to catch the exception thrown by the method
		try {
			// creating a new object of the obj1 suing the clone() method
			Using_Clone_method obj2 = (Using_Clone_method) obj1.clone();
			System.out.println(obj2.str);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
