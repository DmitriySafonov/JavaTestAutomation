package myPackage01;

import java.util.*;

public class WorkerOfCompany {
			private String id;
			private String firstName;
			private String lastName;
			private String gender;
			private Date birthDay;
			private int age;
			private String department;
			private String position;
			private float salary;
			private String attendanceAtWork;
			private Date[] absencePeriod = new Date[2];
			private String[] tasksList = new String[1];
			private String taskInProcessing;
			
		
		public void fireTheEmploye() {}
		public void giveTask(String taskName) {
			if (this.tasksList[0] == null) {
				this.tasksList[0] = taskName;
			} else {
				int last = this.tasksList.length;
				String[] newTasksList = new String[last+1];
				for (int i=0; i<this.tasksList.length;i++) {
					newTasksList[i] = this.tasksList[i];
				}
				newTasksList[last] = taskName;
				this.tasksList = new String[last+1];
				this.tasksList = newTasksList;
			}
		}
		public void cancelTask(String taskName) {}
		public String checkEmployesAttendenceAtWork() {return this.attendanceAtWork;}
		public void changeEmployesDepartment(String newDepartment) {this.department = newDepartment;}
		public void changeEmployesPosition(String newPosition) {this.position = newPosition;}
		public void changeEmployesSalary(float newSalary) {this.salary = newSalary;}
		public void showTaskList() {
			System.out.println(Arrays.toString(this.tasksList));
		}
		
		private void goToWork() {}
		private void taskProcessing() {}
		private void takeVacation(Date vacationStart, Date vacationEnd) {this.absencePeriod[0] = vacationStart; this.absencePeriod[1] = vacationEnd; this.attendanceAtWork = "on vacation";}
		private void takeSickLeave(Date sickLeaveStart, Date sickLeaveEnd) {this.absencePeriod[0] = sickLeaveStart; this.absencePeriod[1] = sickLeaveEnd; this.attendanceAtWork = "on sick leave";}
		private void takeUnpayedLeave(Date unpayedLeaveStart, Date unpayedLeaveEnd) {this.absencePeriod[0] = unpayedLeaveStart; this.absencePeriod[1] = unpayedLeaveEnd; this.attendanceAtWork = "on unpayed leave";};
		private void quitTheJob() {}
		private void chageAgeOnBirthDay() {}
		
}
