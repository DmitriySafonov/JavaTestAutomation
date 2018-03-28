public class Sports extends Entertainments {
					private String EquipmentRequirements;
					private int CommercialRating;
					private String AttendensSkillLevel; //e.g. professional, admirer, rookie 
					
			public String getEquipmentRequirements() {return EquipmentRequirements;};
			public void changeCommeracialRating(int NewCommercialRating) {CommercialRating=NewCommercialRating;};
			public String getAttendensSkillLevel() {
				return AttendensSkillLevel;
			}
			public void setAttendensSkillLevel(String attendensSkillLevel) {
				AttendensSkillLevel = attendensSkillLevel;
			}
			public int getCommercialRating() {
				return CommercialRating;
			}
			public void setEquipmentRequirements(String equipmentRequirements) {
				EquipmentRequirements = equipmentRequirements;
			};
}
