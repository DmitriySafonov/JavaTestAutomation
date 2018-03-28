public class Trees extends Plants{
			private float WoodQualityGeneral; 
			private float WoodQuality—urrent;
			private boolean IsFruiter;
			
		public String checkWoodQuality() { 
			String result = (WoodQualityGeneral>WoodQuality—urrent) ? "bad" : "good";
			return result;
		}
		public boolean checkIsFruiter() {return IsFruiter;};
		public float getWoodQualityGeneral() {
			return WoodQualityGeneral;
		}
		public void setWoodQualityGeneral(float woodQualityGeneral) {
			WoodQualityGeneral = woodQualityGeneral;
		}
		public float getWoodQuality—urrent() {
			return WoodQuality—urrent;
		}
		public void setWoodQuality—urrent(float woodQuality—urrent) {
			WoodQuality—urrent = woodQuality—urrent;
		}
		public void setIsFruiter(boolean isFruiter) {
			IsFruiter = isFruiter;
		};

}
