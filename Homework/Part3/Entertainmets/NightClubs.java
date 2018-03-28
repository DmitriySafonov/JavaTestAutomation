public class NightClubs extends Entertainments {
					private String MusicStyle;
					private boolean HasFaceControl;
					private boolean IsSmokeFree;
		
			public void smoking() {
				if (IsSmokeFree==true) {changeNumberOfParticipantsActual(-1);};
			}
			public String checkMusicStyle() {return MusicStyle;};
			public boolean isHasFaceControl() {
				return HasFaceControl;
			}
			public void setHasFaceControl(boolean hasFaceControl) {
				HasFaceControl = hasFaceControl;
			}
			public boolean isSmokeFree() {
				return IsSmokeFree;
			}
			public void setIsSmokeFree(boolean isSmokeFree) {
				IsSmokeFree = isSmokeFree;
			}
			public void setMusicStyle(String musicStyle) {
				MusicStyle = musicStyle;
			};

}
