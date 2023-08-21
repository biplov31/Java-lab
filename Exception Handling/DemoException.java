public class DemoException{
	public static void main(String[] args){
		boolean attendanceStatus = false;
		if(!attendanceStatus){
			throw new AttendanceNotFoundException("Attendance is required to enter the classroom.");
		} else {
			System.out.println("You may proceed to the classroom.");
		}
	}
}