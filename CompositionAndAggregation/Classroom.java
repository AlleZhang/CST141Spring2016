
public class Classroom {
	
	private String roomNumber;
	private String buildingName;
	private int numOfComputers;
	private String phone;
	
	public Classroom(String roomNumber, String buildingName,
			int numOfComputers, String phone) {
		super();
		this.roomNumber = roomNumber;
		this.buildingName = buildingName;
		this.numOfComputers = numOfComputers;
		this.phone = phone;
	}
	
	public Classroom(Classroom c) {
		super();
		this.roomNumber = c.getRoomNumber();
		this.buildingName = c.getBuildingName();
		this.numOfComputers = c.getNumOfComputers();
		this.phone = c.getPhone();
	}

	public String getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	public String getBuildingName() {
		return buildingName;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	public int getNumOfComputers() {
		return numOfComputers;
	}

	public void setNumOfComputers(int numOfComputers) {
		this.numOfComputers = numOfComputers;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Classroom: \n\troomNumber=" + roomNumber + ", \n\tbuildingName="
				+ buildingName + ", \n\tnumOfComputers=" + numOfComputers
				+ ", \n\tphone=" + phone;
	}
	
	
}
