public class Cactuses {
		private float AvarageSpikesLength;
		private boolean IsPoisonous; 
		private float LiquidPercent;
		private float Weight;
		
	public float getWater() {return  Weight*LiquidPercent;};
	public String touchCactus() {
		String result = (IsPoisonous==false) ? "all white" : "oh shi--";
		return result;
	}
}
