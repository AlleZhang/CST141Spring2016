
public class Textbook {
	private String title;
	private String author;
	private String publisher;
	private double price;
	
	public Textbook(String title, String author, String publisher, double price) {
		super();
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
	}
	
	public Textbook(Textbook t) {
		super();
		this.title = t.getTitle();
		this.author = t.getAuthor();
		this.publisher = t.getPublisher();
		this.price = t.getPrice();
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

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Textbook: \n\ttitle=" + title + ", \n\tauthor=" + author
				+ ", \n\tpublisher=" + publisher + ", \n\tprice=" + price;
	}
	
	

}
