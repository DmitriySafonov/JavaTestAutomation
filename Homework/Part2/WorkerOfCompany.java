
import java.time.LocalDate;
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
			
		
			public void fireTheEmploye() {Department="";Position="";Salary=0;AttendanceAtWork="fired";};
			public void giveTask(String NewTaskId, String NewDescription) {
				TasksList.put(NewTaskId, NewDescription);
			};
			public void cancelTask(String taskName) {};
			public String checkEmployesAttendenceAtWork() {return this.AttendanceAtWork;};
			public void changeEmployesDepartment(String newDepartment) {this.Department = newDepartment;};
			public void changeEmployesPosition(String newPosition) {this.Position = newPosition;};
			public void changeEmployesSalary(float newSalary) {this.Salary = newSalary;};
			public Map<String, String> showTaskList() {
				return TasksList;
			};

			private void goToWork() {AttendanceAtWork="at work";};
			private void taskProcessing() {};
			private void takeVacation(Date vacationStart, Date vacationEnd) {this.AbsencePeriod[0] = vacationStart; this.AbsencePeriod[1] = vacationEnd; this.AttendanceAtWork = "on vacation";};
			private void takeSickLeave(Date sickLeaveStart, Date sickLeaveEnd) {this.AbsencePeriod[0] = sickLeaveStart; this.AbsencePeriod[1] = sickLeaveEnd; this.AttendanceAtWork = "on sick leave";};
			private void takeUnpayedLeave(Date unpayedLeaveStart, Date unpayedLeaveEnd) {this.AbsencePeriod[0] = unpayedLeaveStart; this.AbsencePeriod[1] = unpayedLeaveEnd; this.AttendanceAtWork = "on unpayed leave";};
			private void quitTheJob() {Department="";Position="";Salary=0;AttendanceAtWork="quit";};
			private void chageAgeOnBirthDay() {
				LocalDate curr = LocalDate.now(); 
				LocalDate birthDay = LocalDate.of(BirthDay.getYear(), BirthDay.getMonth(), BirthDay.getDay()); 
				Age= (int) java.time.temporal.ChronoUnit.YEARS.between(curr, birthDay);
			}
			public String getId() {
				return Id;
			}
			public void setId(String id) {
				Id = id;
			}
			public String getFirstName() {
				return FirstName;
			}
			public void setFirstName(String firstName) {
				FirstName = firstName;
			}
			public String getLastName() {
				return LastName;
			}
			public void setLastName(String lastName) {
				LastName = lastName;
			}
			public String getGender() {
				return Gender;
			}
			public void setGender(String gender) {
				Gender = gender;
			}
			public Date getBirthDay() {
				return BirthDay;
			}
			public void setBirthDay(Date birthDay) {
				BirthDay = birthDay;
			}
			public int getAge() {
				return Age;
			}
			public void setAge(int age) {
				Age = age;
			}
			public String getTaskInProcessing() {
				return TaskInProcessing;
			}
			public void setTaskInProcessing(String taskInProcessing) {
				TaskInProcessing = taskInProcessing;
			}
			public String getDepartment() {
				return Department;
			}
			public String getPosition() {
				return Position;
			}
			public float getSalary() {
				return Salary;
			}
			public String getAttendanceAtWork() {
				return AttendanceAtWork;
			}
			public Date[] getAbsencePeriod() {
				return AbsencePeriod;
			}
			public Map<String, String> getTasksList() {
				return TasksList;
			};


		
}