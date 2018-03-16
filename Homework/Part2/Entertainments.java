package myPackage01;

import java.util.*;
import java.io.*;
import javax.swing.JOptionPane;

public class Entertainments {
			private String Name;
			private String TypeOfActivity; //e.g. sports, party, gambling
			private String Style; //e.g. country, classic, futuristic
			private String Location;
			private byte MinNumberOfPeople;
			private byte MinAppropriateAge;
			private float EstimatedDurationHours;
			private float PricePerPersonUSD; //USD
			private int NumberOfPartisipants_Claimed;
			private int NumberOfPartisipants_Actual;
			private String Status;
			private Date Beginning;
			private Date Ending;
			private int NotificationPeriodValue;
			private String NotificationPeriodUnit;
			
		public void showDetails() {};
		public void orderEntertainment() {};
		public void cancelEntertainment() {changeStatusOnDemand("Canceled");};
		public void attendEntertainmetn() {
			if (NumberOfPartisipants_Claimed>NumberOfPartisipants_Actual) {
				changeNumberOfParticipantsActual(1);
			}else {
				JOptionPane.showMessageDialog(null, "Unable to attend entertainmetn. Maximun number of participants exceeded.");
			}
		};
		public void leaveEntertainment() {changeNumberOfParticipantsActual(-1);};
		public String checkStatus() {return Status;};
		public void changePeriod(Date NewBeginning, Date NewEnding) {Beginning=NewBeginning; Ending=NewEnding;};
		public void changeLocation(String NewLocation) {Location=NewLocation;};
		public void changeNumberOfParticipartnsClaimed(int NewNumberOfPartisipants_Claimed) {NumberOfPartisipants_Claimed=NewNumberOfPartisipants_Claimed;};
		public void changeNotificationParams(int NewPeriodValue, String NewPeriodUnit) {NotificationPeriodValue=NewPeriodValue; NotificationPeriodUnit=NewPeriodUnit;};
		
		private void changeStatusOnDemand(String NewStatus) {Status=NewStatus;};
		private void changeStatusOnTime() {};
		private void changeNumberOfParticipantsActual(int Value) {NumberOfPartisipants_Actual+=Value;};
		private void sendNotification() {};
		
		
			
}
