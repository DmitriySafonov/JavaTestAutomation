import java.util.*;

public class Beverages extends CustomerGoods {
			private boolean IsCarbonated;
			private boolean IsAlcoholic;
			private float AlcoholPercent;
			
		public void leaveOpend() {IsCarbonated = false;};
		public Beverages mixBeverages(Beverages FirstBeverage, Beverages SecondBeverage) {
			Beverages result = new Beverages();
			result.IsAlcoholic = (FirstBeverage.IsAlcoholic==true | SecondBeverage.IsAlcoholic==true) ? true : false;
			result.AlcoholPercent =  (FirstBeverage.AlcoholPercent + SecondBeverage.AlcoholPercent) / 2;
			return result;
		};
}
