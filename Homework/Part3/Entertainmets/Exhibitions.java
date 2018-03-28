public class Exhibitions extends Entertainments{
					private String Theme; //e.g. arts, pets, industrial 
					private boolean IsMakePhotoAllowed;
					private float GuideServicesPriceUSD;
					
			public void orderGuide() {};
			public void makePhoto() {
				if(IsMakePhotoAllowed==false) {changeNumberOfParticipantsActual(-1);};
			}
			public String getTheme() {
				return Theme;
			}
			public void setTheme(String theme) {
				Theme = theme;
			}
			public boolean getIsMakePhotoAllowed() {
				return IsMakePhotoAllowed;
			}
			public void setIsMakePhotoAllowed(boolean isMakePhotoAllowed) {
				IsMakePhotoAllowed = isMakePhotoAllowed;
			}
			public float getGuideServicesPriceUSD() {
				return GuideServicesPriceUSD;
			}
			public void setGuideServicesPriceUSD(float guideServicesPriceUSD) {
				GuideServicesPriceUSD = guideServicesPriceUSD;
			}	
}
