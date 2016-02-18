
public class Instructor {
	
	private String name;
	private String officeNumber;
	private String rank;
	private String officeHours;
	
	public Instructor(String name, String officeNumber, String rank,
			String officeHours) {
		super();
		this.name = name;
		this.officeNumber = officeNumber;
		this.rank = rank;
		this.officeHours = officeHours;
	}
	
	public Instructor(Instructor i) {
		super();
		this.name = i.getName();
		this.officeNumber = i.getOfficeNumber();
		this.rank = i.getRank();
		this.officeHours = i.getOfficeHours();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOfficeNumber() {
		return officeNumber;
	}

	public void setOfficeNumber(String officeNumber) {
		this.officeNumber = officeNumber;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String getOfficeHours() {
		return officeHours;
	}

	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}

	@Override
	public String toString() {
		return "Instructor: \n\tname=" + name + ", \n\tofficeNumber=" + officeNumber
				+ ", \n\trank=" + rank + ", \n\tofficeHours=" + officeHours;
	}
	
	
}
