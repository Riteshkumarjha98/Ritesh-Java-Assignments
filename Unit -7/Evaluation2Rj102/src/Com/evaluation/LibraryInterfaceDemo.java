package Com.evaluation;

public class LibraryInterfaceDemo {
	
	static KidUsers kdusers = new KidUsers();
	static AdultUser AdultUser = new AdultUser();

	public static void main(String[] args) {

		FirstCondition();
		
		
	}
	
	private static void FirstCondition() {
		kdusers.setAge(10);
		kdusers.registerAccount();
		kdusers.setAge(20);		
		kdusers.registerAccount();
		
		kdusers.setBookType("kids");
		kdusers.requestbook();
		
		
		kdusers.setBookType("fiction");
		kdusers.requestbook();
		
	}

	
}