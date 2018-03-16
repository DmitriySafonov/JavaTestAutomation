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
			private String Beginning;
			private String Ending;
			private int NotificationPeriodValue;
			private String NotificationPeriodUnit;
			
		public void showDetails() {};
		public void orderEntertainment() {};
		public void cancelEntertainment() {};
		public void attendEntertainmetn() {};
		public void leaveEntertainment() {};
		public void checkStatus() {};
		public void changePeriod() {};
		public void changeLocation() {};
		public void changeNumberOfParticipartnsClaimed() {};
		public void changeNotificationParams(int NewPeriodValue, String NewPeriodUnit) {NotificationPeriodValue=NewPeriodValue; NotificationPeriodUnit=NewPeriodUnit;};
		
		private void changeStatusOnDemand() {};
		private void changeStatusOnTime() {};
		private void sendNotification() {};
		private void changeNumberOfParticipantsActual() {};
		
			
}
