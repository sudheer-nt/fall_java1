package collections.list.anvesh;

public class Professor {
	
	int roomno;
	String name;
	String Branch;
	public int getRoomno() {
		return roomno;
	}
	public void setRoomno(int roomno) {
		this.roomno = roomno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return Branch;
	}
	public void setBranch(String branch) {
		Branch = branch;
	}
	public Professor(int roomno, String name, String branch) {
		super();
		this.roomno = roomno;
		this.name = name;
		Branch = branch;
	}
	@Override
	public String toString() {
		return "Professor [roomno=" + roomno + ", name=" + name + ", Branch=" + Branch + "]";
	} 
	
	}
	

