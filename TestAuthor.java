
public class TestAuthor {

	public static void main(String[] args) {
		Author author = new Author("Emir", "emir.student.smajlovic@gmail.com", 'M');
		Book book = new Book("Orlovi ranije padaju", author, 25.00, 10);
		System.out.println(book.toString());

	}

}
