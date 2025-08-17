public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Данте", " Агильери");
        Author author2 = new Author("Уилки", " Коллинз");

        Book book1 = new Book(author1, "Божественная комедия", 1308);
        Book book2 = new Book(author2, "Лунный камень", 1868);

        book1.setPublicationYear(1321);

        System.out.println(" Книга 1: " + book1.getTitleBook() + " , автор: " + book1.getAuthor().getFirstName() + book1.getAuthor().getLastName() + " , год публикации: " + book1.getPublicationYear());
        System.out.println(" Книга 2: " + book2.getTitleBook() + " , автор: " + book2.getAuthor().getFirstName() + book2.getAuthor().getLastName() + " , год публикации: " + book2.getPublicationYear());
    }
}
