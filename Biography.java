import java.util.ArrayList;
import java.util.Scanner;

public class Biography {
    public static void main(String[] args) {

        /**
         * WORK ON BOOK AND AUTHOR CLASSES FIRST
         This will be our actual program that we define author and his books
         In this program we will write the biography of Stefan Zweig, an Austrian novelist.


         Write a program that will get information from user and
         -Print information for the favorite author
         -Print information of the books of favorite author

         Full name = Stefan Zweig
         County = Austria
         Is still alive: No (28 November 1881 – 22 February 1942)
         Some of his books as listed below:

         BookName                            Genre           TotalPage
         Amok                                tale            189
         The Royal Game                      novella         53
         24 Hours in the Life of a Woman     novella         80
         */

        /*
        Expected result:
        Author's information = Author{firstName='Stefan', lastName='Zweig', country='Austria', isAlive=false}
        Author's books are as listed below:
        Book{name='Amok', genre:'tale', page=189}
        Book{name='The Royal Game', tale='novella', page=53}
        Book{name='24 Hours in the Life of a Woman', tale='novella', page=80}
         */

        //YOUR CODE HERE
        Scanner input = new Scanner(System.in);
        System.out.println(BiographyQuestions.askFirstName);
        String firstName = input.nextLine();

        System.out.println(BiographyQuestions.askLastName);
        String lastName = input.nextLine();

        System.out.println(BiographyQuestions.askCountry);
        String country = input.nextLine();

        System.out.println(BiographyQuestions.askIfAlive);
        String isAlive = input.nextLine();

        int age = 0;
        if (isAlive.toLowerCase().charAt(0) == 'y') {
            System.out.println(BiographyQuestions.askAge);
            age = input.nextInt();
            input.nextLine();
        }



        ArrayList<Book> listOfBooks = new ArrayList<>();

        String askToEnterABook;
        do {
            System.out.println(BiographyQuestions.askToEnterBook);
            askToEnterABook = input.nextLine();
            if (askToEnterABook.toLowerCase().charAt(0) == 'y') {

                System.out.println(BiographyQuestions.askBookName);
                String name = input.nextLine();

                System.out.println(BiographyQuestions.askGenre);
                String genre = input.nextLine();

                System.out.println(BiographyQuestions.askPages);
                int page = input.nextInt();
                input.nextLine();
                Book book = new Book(name, genre, page);
                listOfBooks.add(book);
            }
        }
        while (askToEnterABook.toLowerCase().charAt(0) == 'y');

        Author author = new Author(firstName, lastName, country, isAlive, age, listOfBooks);

        System.out.println(author);

        for (Book book : author.listOfBooks) {
            System.out.println(book);
        }
    }
}
