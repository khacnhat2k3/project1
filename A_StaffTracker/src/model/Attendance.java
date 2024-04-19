package model;

public class Attendance {
	 private int attendanceID;
	 private int employeeID;
	 private String date;
	 private String checkIn;
	 private String checkOut;
	 
	public String getCheckIn() {
		return checkIn;
	}
	public void setCheckIn(String checkIn) {
		this.checkIn = checkIn;
	}
	public String getCheckOut() {
		return checkOut;
	}
	public void setCheckOut(String checkOut) {
		this.checkOut = checkOut;
	}
	public int getAttendanceID() {
		return attendanceID;
	}
	public void setAttendanceID(int attendanceID) {
		this.attendanceID = attendanceID;
	}
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Attendance(int attendanceID, int employeeID, String date, String checkIn, String checkOut) {
		super();
		this.attendanceID = attendanceID;
		this.employeeID = employeeID;
		this.date = date;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	 
	
}
