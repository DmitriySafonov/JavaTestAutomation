package myPackage01;

public class Sports extends Entertainments {
					public String EquipmentRequirements;
					private int CommercialRating;
					private String AttendensSkillLevel; //e.g. professional, admirer, rookie 
					
			public String getEquipmentRequirements() {return EquipmentRequirements;};
			public void changeCommeracialRating(int NewCommercialRating) {CommercialRating=NewCommercialRating;};
}
