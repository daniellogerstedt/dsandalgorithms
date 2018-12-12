package fifoanimalshelter;

import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {

    @Test
    public void enqueue() {
        Queue testQueue = new Queue();
        testQueue.enqueue("Dog", "Sparky");
        testQueue.enqueue("Cat", "Tabby");
        testQueue.enqueue("Cat", "Jimbo");
        assertTrue(testQueue.front instanceof Dog);
        assertTrue(testQueue.front.next instanceof Cat);
        assertTrue(testQueue.front.next.next instanceof Cat);
        assertTrue(testQueue.front.next.next == testQueue.back);
        assertEquals("Sparky", testQueue.front.name);
        assertEquals("Tabby", testQueue.front.next.name);
        assertEquals("Jimbo", testQueue.front.next.next.name);
    }

    @Test
    public void dequeue() {
        Queue testQueue = new Queue();
        testQueue.enqueue("Dog", "Genghis");
        testQueue.enqueue("Dog", "Sparky");
        testQueue.enqueue("Cat", "Tabby");
        testQueue.enqueue("Cat", "Jimbo");
        testQueue.enqueue("Dog", "Daisy");
        Node testTypeless = testQueue.dequeue("None"); // Should be Genghis
        Node testCatBack = testQueue.dequeue("Cat"); // Should be Tabby
        Node testDogFront = testQueue.dequeue("Dog"); // Should be Sparky
        Node testDogBack = testQueue.dequeue("Dog"); // Should be Daisy
        Node testCatFront = testQueue.dequeue("Cat"); // Should be Jimbo
        assertEquals("animal should be Genghis", testTypeless.name, "Genghis");
        assertEquals("animal should be Tabby the Cat", testCatBack.name, "Tabby");
        assertEquals("animal should be Jimbo the Cat", testCatFront.name, "Jimbo");
        assertEquals("animal should be Daisy the Dog", testDogBack.name, "Daisy");
        assertEquals("animal should be Sparky the Dog", testDogFront.name, "Sparky");
        assertTrue(testCatBack instanceof Cat);
        assertTrue(testCatFront instanceof Cat);
        assertTrue(testDogBack instanceof Dog);
        assertTrue(testDogFront instanceof Dog);
    }
}