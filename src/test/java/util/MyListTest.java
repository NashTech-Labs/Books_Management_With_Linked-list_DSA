package util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import entity.Book;
import org.junit.Ignore;
import org.junit.Test;

public class MyListTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link MyList}
     *   <li>{@link MyList#size()}
     * </ul>
     */
    @Test
    public void testConstructor() {
        assertEquals(0, (new MyList()).size());
    }

    /**
     * Method under test: {@link MyList#isEmpty()}
     */
    @Test
    public void testIsEmpty() {
        assertTrue((new MyList()).isEmpty());
    }

    /**
     * Method under test: {@link MyList#isEmpty()}
     */
    @Test
    public void testIsEmpty2() {
        MyList myList = new MyList();
        myList.addLast(new Book("B Code", "Dr", 1, 3, 10.0d));
        assertFalse(myList.isEmpty());
    }

    /**
     * Method under test: {@link MyList#addLast(Book)}
     */
    @Test
    public void testAddLast() {
        MyList myList = new MyList();
        Book book = new Book("B Code", "Dr", 2, 3, 100.0);

        assertSame(book, myList.addLast(book).getData());
        assertEquals(1, myList.getSize());
        assertEquals(1, myList.size());
    }

    /**
     * Method under test: {@link MyList#addLast(Book)}
     */
    @Test
    public void testAddLast2() {
        MyList myList = new MyList();
        myList.addLast(new Book("B Code", "Dr", 2, 3, 1050.0));
        Book book = new Book("B Code", "Dr", 2, 3, 1050.0);

        assertSame(book, myList.addLast(book).getData());
        assertEquals(2, myList.getSize());
        assertEquals(2, myList.size());
    }

    /**
     * Method under test: {@link MyList#addFirst(Book)}
     */
    @Test
    public void testAddFirst() {
        MyList myList = new MyList();
        Book book = new Book("B Code", "Dr", 2, 4, 125.0);

        assertSame(book, myList.addFirst(book).getData());
        assertEquals(1, myList.getSize());
        assertEquals(1, myList.size());
    }

    /**
     * Method under test: {@link MyList#addFirst(Book)}
     */
    @Test
    public void testAddFirst2() {
        MyList myList = new MyList();
        myList.addLast(new Book("B Code", "Dr", 4, 3, 1001.0));
        Book book = new Book("B Code", "Dr", 4, 3, 1020.0);

        Node<Book> actualAddFirstResult = myList.addFirst(book);
        assertSame(book, actualAddFirstResult.getData());
        assertSame(actualAddFirstResult, actualAddFirstResult.getNext().getPrevious());
        assertEquals(2, myList.getSize());
        assertEquals(2, myList.size());
    }

    /**
     * Method under test: {@link MyList#traverse()}
     */
    @Test
    public void testTraverse() {
        MyList myList = new MyList();
        myList.traverse();
        assertEquals(0, myList.getSize());
        assertEquals(0, myList.size());
    }

    /**
     * Method under test: {@link MyList#traverse()}
     */
    @Test
    public void testTraverse2() {
        // TODO: Complete this test.

        MyList myList = new MyList();
        myList.addLast(new Book("B123", "TextBook", 1, 3, 151.0));
        myList.traverse();
    }

    /**
     * Method under test: {@link MyList#traverse()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testTraverse3() {
        // TODO: Complete this test.

        MyList myList = new MyList();
        myList.addLast(null);
        myList.traverse();
    }

    /**
     * Method under test: {@link MyList#getSize()}
     */
    @Test
    public void testGetSize() {
        MyList myList = new MyList();
        assertEquals(0, myList.getSize());
        assertTrue(myList.isEmpty());
    }

    /**
     * Method under test: {@link MyList#getSize()}
     */
    @Test
    public void testGetSize2() {
        MyList myList = new MyList();
        myList.addLast(new Book("B54A1", "Nobel", 1, 2, 1020.0));
        assertEquals(1, myList.getSize());
        assertFalse(myList.isEmpty());
    }

    /**
     * Method under test: {@link MyList#getNode(int)}
     */
    @Test
    public void testGetNode() {
        assertNull((new MyList()).getNode(1));
    }

    /**
     * Method under test: {@link MyList#getNode(int)}
     */
    @Test
    public void testGetNode2() {
        MyList myList = new MyList();
        myList.addLast(new Book("AXBP121", "Geeta", 1, 3, 100.0));
        assertNull(myList.getNode(1));
    }

    /**
     * Method under test: {@link MyList#getNode(int)}
     */
    @Test
    public void testGetNode3() {
        // TODO: Complete this test.

        MyList myList = new MyList();
        myList.addLast(new Book("B12 Code", "NotBook", 1, 3, 10.0d));
        myList.addLast(new Book("B65 Code", "Story", 1, 3, 10.0d));
        myList.getNode(1);
    }

    /**
     * Method under test: {@link MyList#addAfter(Book, int)}
     */
    @Test
    public void testAddAfter() {
        MyList myList = new MyList();
        assertNull(myList.addAfter(new Book("BAC1D", "History", 1, 3, 10.0d), 2));
    }

    /**
     * Method under test: {@link MyList#addAfter(Book, int)}
     */
    @Test
    public void testAddAfter2() {
        MyList myList = new MyList();
        myList.addLast(new Book("B Code", "Dr", 1, 3, 10.0d));
        assertNull(myList.addAfter(new Book("B Code", "Dr", 1, 3, 10.0d), 2));
    }

    /**
     * Method under test: {@link MyList#addAfter(Book, int)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testAddAfter3() {
        // TODO: Complete this test.

        MyList myList = new MyList();
        myList.addLast(new Book("B Code", "Dr", 1, 3, 10.0d));
        myList.addAfter(new Book("B Code", "Dr", 1, 3, 10.0d), 0);
    }

    /**
     * Method under test: {@link MyList#addAfter(Book, int)}
     */
    @Test
    public void testAddAfter4() {
        MyList myList = new MyList();
        myList.addLast(new Book("B Code", "Dr", 1, 3, 10.0d));
        myList.addLast(new Book("B Code", "Dr", 1, 3, 10.0d));
        Book book = new Book("B Code", "Dr", 1, 3, 10.0d);

        Node<Book> actualAddAfterResult = myList.addAfter(book, 0);
        assertSame(book, actualAddAfterResult.getData());
        assertSame(actualAddAfterResult, actualAddAfterResult.getNext().getPrevious());
        assertEquals(3, myList.getSize());
        assertEquals(3, myList.size());
    }

    /**
     * Method under test: {@link MyList#deleteAt(int)}
     */
    @Test
    public void testDeleteAt() {
        assertFalse((new MyList()).deleteAt(1));
    }

    /**
     * Method under test: {@link MyList#deleteAt(int)}
     */
    @Test
    public void testDeleteAt2() {
        MyList myList = new MyList();
        myList.addLast(new Book("List of Books are empty", "Dr", 1, 3, 10.0d));
        assertFalse(myList.deleteAt(1));
    }

    /**
     * Method under test: {@link MyList#deleteAt(int)}
     */
    @Test
    public void testDeleteAt3() {
        MyList myList = new MyList();
        myList.addLast(new Book("Input out of bound!", "Dr", 1, 3, 10.0d));
        myList.addLast(new Book("List of Books are empty", "Dr", 1, 3, 10.0d));
        assertTrue(myList.deleteAt(1));
        assertEquals(1, myList.getSize());
        assertEquals(1, myList.size());
    }

    /**
     * Method under test: {@link MyList#deleteAt(int)}
     */
    @Test
    public void testDeleteAt4() {
        MyList myList = new MyList();
        myList.addLast(new Book("B Code", "Dr", 1, 3, 10.0d));
        myList.addLast(new Book("Input out of bound!", "Dr", 1, 3, 10.0d));
        myList.addLast(new Book("List of Books are empty", "Dr", 1, 3, 10.0d));
        assertTrue(myList.deleteAt(1));
        assertEquals(2, myList.getSize());
        assertEquals(2, myList.size());
    }

    /**
     * Method under test: {@link MyList#deleteAt(int)}
     */
    @Test
    public void testDeleteAt5() {
        MyList myList = new MyList();
        myList.addLast(new Book("List of Books are empty", "Dr", 1, 3, 10.0d));
        assertTrue(myList.deleteAt(0));
        assertEquals(0, myList.getSize());
        assertEquals(0, myList.size());
    }

    /**
     * Method under test: {@link MyList#deleteAt(int)}
     */
    @Test
    public void testDeleteAt6() {
        MyList myList = new MyList();
        myList.addLast(new Book("List of Books are empty", "Dr", 1, 3, 10.0d));
        assertFalse(myList.deleteAt(-1));
    }

    /**
     * Method under test: {@link MyList#search(String)}
     */
    @Test
    public void testSearch() {
        assertNull((new MyList()).search("B Code"));
    }

    /**
     * Method under test: {@link MyList#search(String)}
     */
    @Test
    public void testSearch2() {
        // TODO: Complete this test.

        MyList myList = new MyList();
        myList.addLast(new Book("B Code", "Dr", 1, 3, 10.0d));
        myList.search("B Code");
    }

    /**
     * Method under test: {@link MyList#search(String)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testSearch3() {
        // TODO: Complete this test.

        MyList myList = new MyList();
        myList.addLast(new Book(null, "Dr", 1, 3, 10.0d));
        myList.search("B Code");
    }

    /**
     * Method under test: {@link MyList#search(String)}
     */
    @Test
    public void testSearch4() {
        MyList myList = new MyList();
        myList.addLast(new Book("42", "Dr", 1, 3, 10.0d));
        assertNull(myList.search("B Code"));
    }

    /**
     * Method under test: {@link MyList#search(String)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testSearch5() {

        MyList myList = new MyList();
        myList.addLast(null);
        myList.search("B Code");
    }

    /**
     * Method under test: {@link MyList#sortBooks(boolean)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testSortBooks() {

        (new MyList()).sortBooks(true);
    }

    /**
     * Method under test: {@link MyList#sortBooks(boolean)}
     */
    @Test
    public void testSortBooks2() {

        MyList myList = new MyList();
        myList.addFirst(new Book("B Code", "Dr", 1, 3, 10.0d));
        myList.sortBooks(true);
    }

    /**
     * Method under test: {@link MyList#sortBooks(boolean)}
     */
    @Test
    public void testSortBooks3() {

        MyList myList = new MyList();
        myList.addLast(new Book("-------------------------------------------------------------------", "Dr", 6, 3, 10.0d));
        myList.addFirst(new Book("B Code", "Dr", 1, 3, 10.0d));
        myList.sortBooks(true);
    }

    /**
     * Method under test: {@link MyList#sortBooks(boolean)}
     */
    @Test
    public void testSortBooks4() {

        MyList myList = new MyList();
        myList.addLast(new Book("-------------------------------------------------------------------", "Dr", 1, 3, 10.0d));
        myList.addLast(new Book("-------------------------------------------------------------------", "Dr", 6, 3, 10.0d));
        myList.addFirst(new Book("B Code", "Dr", 1, 3, 10.0d));
        myList.sortBooks(true);
    }

    /**
     * Method under test: {@link MyList#sortBooks(boolean)}
     */
    @Test
    public void testSortBooks5() {

        MyList myList = new MyList();
        myList.addLast(new Book("Code", "Dr", 6, 3, 10.0d));
        myList.addFirst(new Book("B Code", "Dr", 1, 3, 10.0d));
        myList.sortBooks(true);
    }

    /**
     * Method under test: {@link MyList#sortBooks(boolean)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testSortBooks6() {

        MyList myList = new MyList();
        myList.addLast(new Book(null, "Dr", 6, 3, 10.0d));
        myList.addFirst(new Book("B Code", "Dr", 1, 3, 10.0d));
        myList.sortBooks(true);
    }

    /**
     * Method under test: {@link MyList#sortBooks(boolean)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testSortBooks7() {

        MyList myList = new MyList();
        myList.addFirst(null);
        myList.sortBooks(true);
    }

    /**
     * Method under test: {@link MyList#sortBooks(boolean)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testSortBooks8() {

        MyList myList = new MyList();
        myList.addLast(null);
        myList.addFirst(new Book("B Code", "Dr", 1, 3, 10.0d));
        myList.sortBooks(true);
    }

    /**
     * Method under test: {@link MyList#sortBooks(boolean)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testSortBooks9() {

        MyList myList = new MyList();
        myList.addLast(new Book("-------------------------------------------------------------------", "Dr", 6, 3, 10.0d));
        myList.addFirst(null);
        myList.sortBooks(true);
    }

    /**
     * Method under test: {@link MyList#sortBooks(boolean)}
     */
    @Test
    public void testSortBooks10() {

        MyList myList = new MyList();
        myList.addLast(new Book("-------------------------------------------------------------------", "Dr", 6, 3, 10.0d));
        myList.addFirst(new Book("B Code", "Dr", 1, 3, 10.0d));
        myList.sortBooks(false);
    }

    /**
     * Method under test: {@link MyList#sortBooks(boolean)}
     */
    @Test
    public void testSortBooks11() {

        MyList myList = new MyList();
        myList.addLast(new Book("-------------------------------------------------------------------", "Dr", 6, 3, 0.5d));
        myList.addLast(new Book("-------------------------------------------------------------------", "Dr", 6, 3, 10.0d));
        myList.addFirst(new Book("B Code", "Dr", 1, 3, 10.0d));
        myList.sortBooks(false);
    }

    /**
     * Method under test: {@link MyList#sortBooks(boolean)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testSortBooks12() {

        MyList myList = new MyList();
        myList.addLast(null);
        myList.addFirst(new Book("B Code", "Dr", 1, 3, 10.0d));
        myList.sortBooks(false);
    }

    /**
     * Method under test: {@link MyList#sortBooks(boolean)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testSortBooks13() {
        // TODO: Complete this test.

        MyList myList = new MyList();
        myList.addLast(new Book("-------------------------------------------------------------------", "Dr", 6, 3, 10.0d));
        myList.addFirst(null);
        myList.sortBooks(false);
    }
}

