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
	public float getAvarageSpikesLength() {
		return AvarageSpikesLength;
	}
	public void setAvarageSpikesLength(float avarageSpikesLength) {
		AvarageSpikesLength = avarageSpikesLength;
	}
	public boolean isPoisonous() {
		return IsPoisonous;
	}
	public void setIsPoisonous(boolean isPoisonous) {
		IsPoisonous = isPoisonous;
	}
	public float getLiquidPercent() {
		return LiquidPercent;
	}
	public void setLiquidPercent(float liquidPercent) {
		LiquidPercent = liquidPercent;
	}
	public float getWeight() {
		return Weight;
	}
	public void setWeight(float weight) {
		Weight = weight;
	}

}
