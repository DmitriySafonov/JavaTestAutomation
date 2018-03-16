package myPackage01;

import java.util.*;
import java.io.*;
import javax.swing.JOptionPane;

public class PrintedMedia {
			private String Publisher;
			private String Title;
			private Date PublishingDate;
			private String PaperType;
			private String PaperSize;
			private boolean IsColorPrinting;
			private int NumberOfCopies;
			private int NumberOfPages;
			private String TypeOfPrintedMedia; //e.g. newspaper, magazine, brochure
			private String AgeBracket; //e.g. children, teens, adults
			private String PublicationFrequency; //e.g. daily, weekly, non-periodic
			private String SubjectCategory; //e.g. sports, business, fashion
			private String Editor;
			private Map<Integer, String> Content = new HashMap <Integer, String>();
			private int CurrentPage;
			private String CurrentPageContent;
				 	
			
		public void goToPage(int TargetPage) {CurrentPage = TargetPage; showContent();};
		public void readContent() {};
		public void recycle() {};
		public void throwEway() {};
		public void pullOutPage() {};
		public String getDetails() {
			String details;
			details = "Publisher: " + Publisher + "\n" + this.TypeOfPrintedMedia + " \"" + Title+"\""; 
			return details;
		}
		public PrintedMedia makeCopy() {PrintedMedia result = new PrintedMedia(this); return result;};
		public void putBookmark() {};
		
		private void showContent() {CurrentPageContent = Content.get(CurrentPage);};
		private void changeEmotions() {};
		
}
