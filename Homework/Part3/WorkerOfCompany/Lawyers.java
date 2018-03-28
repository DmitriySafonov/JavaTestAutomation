import java.util.*;

public class Lawyers extends WorkerOfCompany{
					private String Practice; //e.g. tax, M&A, banking
					private String IndustrialSector; //e.g. real estate, agriculture, machinery
					private ArrayList Rewards = new ArrayList();
					
			public void addReward(String RewardName) {Rewards.add(new String(RewardName));};
			public String getRewardsList() {return Rewards.toString();};
			public String getPractice() {
				return Practice;
			}
			public void setPractice(String practice) {
				Practice = practice;
			}
			public String getIndustrialSector() {
				return IndustrialSector;
			}
			public void setIndustrialSector(String industrialSector) {
				IndustrialSector = industrialSector;
			};

			
}
