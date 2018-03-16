package myPackage01;

import java.util.*;

public class WorkerOfCompany {
			private String Id;
			private String FirstName;
			private String LastName;
			private String Gender;
			private Date BirthDay;
			private int Age;
			private String Department;
			private String Position;
			private float Salary;
			private String AttendanceAtWork;
			private Date[] AbsencePeriod = new Date[2];
			private Map<String, String> TasksList = new HashMap<String, String>();
			private String TaskInProcessing;
			
		
		public void fireTheEmploye() {}
		public void giveTask(String NewTaskId, String NewDescription) {
			TasksList.put(NewTaskId, NewDescription);
		}
		public void cancelTask(String taskName) {}
		public String checkEmployesAttendenceAtWork() {return this.AttendanceAtWork;}
		public void changeEmployesDepartment(String newDepartment) {this.Department = newDepartment;}
		public void changeEmployesPosition(String newPosition) {this.Position = newPosition;}
		public void changeEmployesSalary(float newSalary) {this.Salary = newSalary;}
		public Map<String, String> showTaskList() {
			return TasksList;
		}
		
		private void goToWork() {}
		private void taskProcessing() {}
		private void takeVacation(Date vacationStart, Date vacationEnd) {this.AbsencePeriod[0] = vacationStart; this.AbsencePeriod[1] = vacationEnd; this.AttendanceAtWork = "on vacation";}
		private void takeSickLeave(Date sickLeaveStart, Date sickLeaveEnd) {this.AbsencePeriod[0] = sickLeaveStart; this.AbsencePeriod[1] = sickLeaveEnd; this.AttendanceAtWork = "on sick leave";}
		private void takeUnpayedLeave(Date unpayedLeaveStart, Date unpayedLeaveEnd) {this.AbsencePeriod[0] = unpayedLeaveStart; this.AbsencePeriod[1] = unpayedLeaveEnd; this.AttendanceAtWork = "on unpayed leave";};
		private void quitTheJob() {}
		private void chageAgeOnBirthDay() {}
		
}