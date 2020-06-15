package APITesting.Classes.Object;

public class complexobjectclass {
	
	String id;
	String title;
	String author;
	private complexobjectinformationclass information;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public complexobjectinformationclass getinformation() {
		return information;
	}
	public void setinformation(complexobjectinformationclass information) {
		this.information = information;
	}

}
