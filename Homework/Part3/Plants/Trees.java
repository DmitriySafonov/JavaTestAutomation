public class Trees extends Plants{
			private float WoodQualityGeneral; 
			private float WoodQuality�urrent;
			private boolean IsFruiter;
			
		public String checkWoodQuality() { 
			String result = (WoodQualityGeneral>WoodQuality�urrent) ? "bad" : "good";
			return result;
		}
		public boolean checkIsFruiter() {return IsFruiter;};
}
