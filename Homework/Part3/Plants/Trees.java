public class Trees extends Plants{
			private float WoodQualityGeneral; 
			private float WoodQualityÑurrent;
			private boolean IsFruiter;
			
		public String checkWoodQuality() { 
			String result = (WoodQualityGeneral>WoodQualityÑurrent) ? "bad" : "good";
			return result;
		}
		public boolean checkIsFruiter() {return IsFruiter;};
}
