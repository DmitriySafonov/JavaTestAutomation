public class Advertisements extends PrintedMedia {
					private String AdvertisingAgencyName;
					private String Marginals;
					private String Disclaimer;
					
		public String getMarginals() {return Marginals;};
		public String getDisclaimer() {return Disclaimer;};
		public String getAdvertisingAgencyName() {
			return AdvertisingAgencyName;
		}
		public void setAdvertisingAgencyName(String advertisingAgencyName) {
			AdvertisingAgencyName = advertisingAgencyName;
		}
		public void setMarginals(String marginals) {
			Marginals = marginals;
		}
		public void setDisclaimer(String disclaimer) {
			Disclaimer = disclaimer;
		};

}
