package entity;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BookTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Book#Book()}
     *   <li>{@link Book#setLended(int)}
     *   <li>{@link Book#setPrice(double)}
     *   <li>{@link Book#setQuantity(int)}
     *   <li>{@link Book#setTitle(String)}
     *   <li>{@link Book#setbCode(String)}
     *   <li>{@link Book#toString()}
     *   <li>{@link Book#getLended()}
     *   <li>{@link Book#getPrice()}
     *   <li>{@link Book#getQuantity()}
     *   <li>{@link Book#getTitle()}
     * </ul>
     */
    @Test
    public void testConstructor() {
        Book actualBook = new Book();
        actualBook.setLended(3);
        actualBook.setPrice(10.0d);
        actualBook.setQuantity(1);
        actualBook.setTitle("Dr");
        actualBook.setbCode("B Code");
        String actualToStringResult = actualBook.toString();
        assertEquals(3, actualBook.getLended());
        assertEquals(10.0d, actualBook.getPrice(), 0.0);
        assertEquals(1, actualBook.getQuantity());
        assertEquals("Dr", actualBook.getTitle());
        assertEquals("B Code    Dr                  1         3         10.0      10.00     ", actualToStringResult);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Book#Book(String, String, int, int, double)}
     *   <li>{@link Book#setLended(int)}
     *   <li>{@link Book#setPrice(double)}
     *   <li>{@link Book#setQuantity(int)}
     *   <li>{@link Book#setTitle(String)}
     *   <li>{@link Book#setbCode(String)}
     *   <li>{@link Book#toString()}
     *   <li>{@link Book#getLended()}
     *   <li>{@link Book#getPrice()}
     *   <li>{@link Book#getQuantity()}
     *   <li>{@link Book#getTitle()}
     * </ul>
     */
    @Test
    public void testConstructor2() {
        Book actualBook = new Book("B Code", "Dr", 1, 3, 10.0d);
        actualBook.setLended(3);
        actualBook.setPrice(10.0d);
        actualBook.setQuantity(1);
        actualBook.setTitle("Dr");
        actualBook.setbCode("B Code");
        String actualToStringResult = actualBook.toString();
        assertEquals(3, actualBook.getLended());
        assertEquals(10.0d, actualBook.getPrice(), 0.0);
        assertEquals(1, actualBook.getQuantity());
        assertEquals("Dr", actualBook.getTitle());
        assertEquals("B Code    Dr                  1         3         10.0      10.00     ", actualToStringResult);
    }

    /**
     * Method under test: {@link Book#getbCode()}
     */
    @Test
    public void testGetbCode() {
        assertEquals("B Code", (new Book("B Code", "Dr", 1, 3, 10.0d)).getbCode());
    }
}

