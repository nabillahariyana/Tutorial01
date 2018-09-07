
public class Mahasiswa {
	private String firstName;
	private String lastName;
	private int MhsNPM;
	
	public Mahasiswa(String firstName, String lastName, int mhsNPM) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		MhsNPM = mhsNPM;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getMhsNPM() {
		return MhsNPM;
	}

	public void setMhsNPM(int mhsNPM) {
		MhsNPM = mhsNPM;
	}
	
	
}
