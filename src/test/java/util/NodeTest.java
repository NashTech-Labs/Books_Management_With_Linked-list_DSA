package util;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import org.junit.Test;

public class NodeTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Node#Node(Object)}
     *   <li>{@link Node#setData(Object)}
     *   <li>{@link Node#setNext(Node)}
     *   <li>{@link Node#setPrevious(Node)}
     *   <li>{@link Node#getData()}
     *   <li>{@link Node#getNext()}
     *   <li>{@link Node#getPrevious()}
     * </ul>
     */
    @Test
    public void testConstructor() {
        Node<Object> actualNode = new Node<>("Data");
        actualNode.setData("Data");
        Node<Object> node = new Node<>("Data");
        actualNode.setNext(node);
        Node<Object> node1 = new Node<>("Data");
        actualNode.setPrevious(node1);
        Object data = actualNode.getData();
        Node<Object> next = actualNode.getNext();
        assertSame(data, next.getData());
        Node<Object> previous = actualNode.getPrevious();
        assertSame(data, previous.getData());
        assertSame(node, next);
        assertNull(next.getNext());
        assertNull(previous.getNext());
        assertSame(node1, previous);
        assertNull(previous.getPrevious());
        assertNull(next.getPrevious());
    }
}

