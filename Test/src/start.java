
public class start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		System.out.println("Hello World ds vfdv ");
		System.out.println("Die Quadratzahl von 5 ist " + quadratZahl(5));
		System.out.println(begruessung("Martin"));

		// Das ist ein Hammerkommentar von keinem Geringeren als Boris
	}
	
	public void copyPaste() {
		System.out.println("Hello World");
		// Das ist von Martin.
		//fhgfhghgfhgfhgfhgfhgf
	}

	// TODO fix method 
	public void copySecond() {
	    // fixed return value
		System.out.println("Hello World");
		//asdasdasdasdasdsad
		System.out.println("Martin");
	}


	private static int quadratZahl(int n) {
		//das it quatsch
	    return n * n;
    }


    private static String begruessung(String name) {
	    return "Hallo " + name + ", schönen Sonntag!";
    }

}
