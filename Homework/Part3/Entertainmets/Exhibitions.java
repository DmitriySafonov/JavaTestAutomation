public class Exhibitions extends Entertainments{
					private String Theme; //e.g. arts, pets, industrial 
					private boolean IsMakePhotoAllowed;
					private float GuideServicesPriceUSD;
					
			public void orderGuide() {};
			public void makePhoto() {
				if(IsMakePhotoAllowed==false) {changeNumberOfParticipantsActual(-1);};
			}
				
}
