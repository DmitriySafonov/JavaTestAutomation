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
		public String getPublisher() {
			return Publisher;
		}
		public void setPublisher(String publisher) {
			Publisher = publisher;
		}
		public String getTitle() {
			return Title;
		}
		public void setTitle(String title) {
			Title = title;
		}
		public Date getPublishingDate() {
			return PublishingDate;
		}
		public void setPublishingDate(Date publishingDate) {
			PublishingDate = publishingDate;
		}
		public String getPaperType() {
			return PaperType;
		}
		public void setPaperType(String paperType) {
			PaperType = paperType;
		}
		public String getPaperSize() {
			return PaperSize;
		}
		public void setPaperSize(String paperSize) {
			PaperSize = paperSize;
		}
		public boolean getIsColorPrinting() {
			return IsColorPrinting;
		}
		public void setIsColorPrinting(boolean isColorPrinting) {
			IsColorPrinting = isColorPrinting;
		}
		public int getNumberOfCopies() {
			return NumberOfCopies;
		}
		public void setNumberOfCopies(int numberOfCopies) {
			NumberOfCopies = numberOfCopies;
		}
		public int getNumberOfPages() {
			return NumberOfPages;
		}
		public void setNumberOfPages(int numberOfPages) {
			NumberOfPages = numberOfPages;
		}
		public String getTypeOfPrintedMedia() {
			return TypeOfPrintedMedia;
		}
		public void setTypeOfPrintedMedia(String typeOfPrintedMedia) {
			TypeOfPrintedMedia = typeOfPrintedMedia;
		}
		public String getAgeBracket() {
			return AgeBracket;
		}
		public void setAgeBracket(String ageBracket) {
			AgeBracket = ageBracket;
		}
		public String getPublicationFrequency() {
			return PublicationFrequency;
		}
		public void setPublicationFrequency(String publicationFrequency) {
			PublicationFrequency = publicationFrequency;
		}
		public String getSubjectCategory() {
			return SubjectCategory;
		}
		public void setSubjectCategory(String subjectCategory) {
			SubjectCategory = subjectCategory;
		}
		public String getEditor() {
			return Editor;
		}
		public void setEditor(String editor) {
			Editor = editor;
		}
		public Map<Integer, String> getContent() {
			return Content;
		}
		public void setContent(Map<Integer, String> content) {
			Content = content;
		}
		public String getCurrentPageContent() {
			return CurrentPageContent;
		}
		public void setCurrentPageContent(String currentPageContent) {
			CurrentPageContent = currentPageContent;
		}
		public int getCurrentPage() {
			return CurrentPage;
		};


		
}
