package myPackage01;

public class NightClubs extends Entertainments {
					private String MusicStyle;
					private boolean HasFaceControl;
					private boolean IsSmokeFree;
		
			public void smoking() {
				if (IsSmokeFree==true) {changeNumberOfParticipantsActual(-1);};
			}
			public String checkMusicStyle() {return MusicStyle;};
			
}
