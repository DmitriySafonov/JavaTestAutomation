import java.util.*;
public class DairyProducts extends CustomerGoods {
					private float FatnessPercent;
					private String FoodFlavors;
					private boolean IsFermented;
					
			public void boil() {};
			private void fermentation() {IsFermented = true;};
			public float getFatnessPercent() {
				return FatnessPercent;
			}
			public void setFatnessPercent(float fatnessPercent) {
				FatnessPercent = fatnessPercent;
			}
			public String getFoodFlavors() {
				return FoodFlavors;
			}
			public void setFoodFlavors(String foodFlavors) {
				FoodFlavors = foodFlavors;
			}
			public boolean getIsFermented() {
				return IsFermented;
			}
			public void setIsFermented(boolean isFermented) {
				IsFermented = isFermented;
			};
			
}
