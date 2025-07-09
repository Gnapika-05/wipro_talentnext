package oops_inheritance;

	class Author{
		String name;
        String email;
		char gender;
		
	Author(String name,String email,char gender){
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	//getters
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public char getGender() {
		return gender;
	}
	//setters
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	}
	
	
	class Book{
		String name;
		Author author;
		double price;
		int qtyInStock;
		Book(String name, Author author, double price, int qtyInStock) {
			this.name = name;
			this.author = author;
			this.price = price;
			this.qtyInStock = qtyInStock;
		}
		//setters and getters
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Author getAuthor() {
			return author;
		}
		public void setAuthor(Author author) {
			this.author = author;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public int getQtyInStock() {
			return qtyInStock;
		}
		public void setQtyInStock(int qtyInStock) {
			this.qtyInStock = qtyInStock;
		}
		public void displayDetails() {
			System.out.println("Book Name: "+name);
			System.out.println("Price: Rs." + price);
			System.out.println("Quantity in Stock: " + qtyInStock);
	        System.out.println("Author Name: " + author.getName());
	        System.out.println("Author Email: " + author.getEmail());
	        System.out.println("Author Gender: " + author.getGender());
		}
	}
public class Encapsulation_Abstraction_Q1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author a=new Author("Harry","harrypotter@gmail.com",'M');
		
		Book b=new Book("OOPs",a,499.99,5);
		
		b.displayDetails();
	}
}
