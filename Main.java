package dsa_15_10_2024;



class base {
	String crdString;
	String sectionString ;
	int number ;
	int room_number;
	String crString;
	public base(String crdString, String sectionString, int number, int room_number, String crString) {
		super();
		this.crdString = crdString;
		this.sectionString = sectionString;
		this.number = number;
		this.room_number = room_number;
		this.crString = crString;
	}
	@Override
	public String toString() {
		return "base [crdString=" + crdString + ", sectionString=" + sectionString + ", number=" + number
				+ ", room_number=" + room_number + ", crString=" + crString + "]";
	}
	
}
public class Main {

	public static void main(String[] args) {
//		base sectionaBase=new base(, null, 0, 0, null)
		base setiondDBase=new base("krisnanand sir ","d",71,408,"amal");
		base setiondABase=new base("nmm ","A",71,408,"mohit");
		base setiondBBase=new base("kiriti mshra ","B",71,408,"rohit");
		base setiondCBase=new base("rohit ","C",71,408,"mohan");
		System.out.println( setiondABase.toString());
		System.out.println( setiondBBase.toString());
		System.out.println( setiondCBase.toString());
		System.out.println( setiondDBase.toString());
	
	

	}

}
