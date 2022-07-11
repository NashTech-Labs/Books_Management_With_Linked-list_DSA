import entity.Book;
import org.junit.Ignore;
import org.junit.Test;

public class BookListTest {
    /**
     * Method under test: default or parameterless constructor of {@link BookList}
     */
    @Test
    public void testConstructor() {

        new BookList();
    }

    /**
     * Method under test: {@link BookList#importData()}
     */
    @Test
    public void testImportData() {

        (new BookList()).importData();
    }

    /**
     * Method under test: {@link BookList#saveBooks()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testSaveBooks() {


        (new BookList()).saveBooks();
    }

    /**
     * Method under test: {@link BookList#getBook()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGetBook() {

        // Arrange
        // TODO: Populate arranged inputs
        BookList bookList = null;

        // Act
        Book actualBook = bookList.getBook();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link BookList#intReader(String, int, int)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testIntReader() {

        // TODO: Complete this test.
        // Arrange
        // TODO: Populate arranged inputs
        BookList bookList = null;
        String msg = "";
        int startRange = 0;
        int endRange = 0;

        // Act
        int actualIntReaderResult = bookList.intReader(msg, startRange, endRange);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link BookList#addLast()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testAddLast() {

        // TODO: Complete this test.
        // Arrange
        // TODO: Populate arranged inputs
        BookList bookList = null;

        // Act
        bookList.addLast();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link BookList#list()}
     */
    @Test
    public void testList() {


        (new BookList()).list();
    }

    /**
     * Method under test: {@link BookList#search()}
     */
    @Test
    public void testSearch() {

        // TODO: Complete this test.

        (new BookList()).search();
    }

    /**
     * Method under test: {@link BookList#addFirst()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testAddFirst() {
        // TODO: Complete this test.
        // Arrange
        // TODO: Populate arranged inputs
        BookList bookList = null;

        // Act
        bookList.addFirst();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link BookList#addAfter()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testAddAfter() {

        // TODO: Complete this test.
        // Arrange
        // TODO: Populate arranged inputs
        BookList bookList = null;

        // Act
        bookList.addAfter();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link BookList#deleteAt()}
     */
    @Test
    public void testDeleteAt() {

        (new BookList()).deleteAt();
    }

    /**
     * Method under test: {@link BookList#sortBooks(boolean)}
     */
    @Test
    public void testSortBooks() {


        (new BookList()).sortBooks(true);
    }
}

