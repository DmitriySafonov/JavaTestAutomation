public class AlbumsForColoring extends PrintedMedia {
						private String Designer;
						private String BookArtist;
						private String TypeOfColoring; //e.g. pencils, paints, tip markers
			
			public void coloring() {};
			public String getTypeOfColoring() {return TypeOfColoring;}
			public void setTypeOfColoring(String typeOfColoring) {
				TypeOfColoring = typeOfColoring;
			};
			public String getDesigner() {
				return Designer;
			}
			public void setDesigner(String designer) {
				Designer = designer;
			}
			public String getBookArtist() {
				return BookArtist;
			}
			public void setBookArtist(String bookArtist) {
				BookArtist = bookArtist;
			}
}
