public class AcademicLiterature extends PrintedMedia {
					private String AuthorsList;
					private String ReferencesList;
					private String CoverType;
					
			public String getAuthorsList() {return AuthorsList;};
			public String getReferencesList() {return ReferencesList;};
			public String getCoverType() {
				return CoverType;
			}
			public void setCoverType(String coverType) {
				CoverType = coverType;
			}
			public void setAuthorsList(String authorsList) {
				AuthorsList = authorsList;
			}
			public void setReferencesList(String referencesList) {
				ReferencesList = referencesList;
			};

}
