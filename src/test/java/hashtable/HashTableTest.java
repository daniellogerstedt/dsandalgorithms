package hashtable;

import org.junit.Test;

import static org.junit.Assert.*;

public class HashTableTest {

    @Test
    public void testGetHash() {
        HashTable<String> testTable = new HashTable<>();
        int hashAA = testTable.getHash("AA");
        int hashBB = testTable.getHash("BB");
        int hashBA = testTable.getHash("BA");
        int hashEmpty = testTable.getHash("");
        assertEquals(30, hashAA);
        assertEquals(32, hashBB);
        assertEquals(31, hashBA);
        assertEquals(0, hashEmpty);
        System.out.println(testTable.getHash("SCAR"));
    }

    @Test
    public void testAdd() {
        HashTable<String> testTable = new HashTable<>();
        testTable.add("AA", "This is AA");
        assertEquals(1, testTable.buckets[30].size());
        testTable.add("BA", "This is BA");
        testTable.add("AB", "This is AB");
        assertEquals(2, testTable.buckets[31].size());
        testTable.add("CARS", "This is CARS");
        testTable.add("SCAR", "This is SCAR");
        testTable.add("RACS", "This is RACS");
        assertEquals(3, testTable.buckets[97].size());

    }

    @Test
    public void testFind() {
        HashTable<String> testTable = new HashTable<>();
        testTable.add("AA", "This is AA");
        testTable.add("BA", "This is BA");
        testTable.add("AB", "This is AB");
        testTable.add("CARS", "This is CARS");
        testTable.add("SCAR", "This is SCAR");
        testTable.add("RACS", "This is RACS");
        assertEquals("This is SCAR", testTable.find("SCAR"));
        assertEquals("This is AA", testTable.find("AA"));
        assertEquals("This is BA", testTable.find("BA"));

    }

    @Test
    public void testContains() {
        HashTable<String> testTable = new HashTable<>();
        testTable.add("AA", "This is AA");
        testTable.add("BA", "This is BA");
        testTable.add("AB", "This is AB");
        testTable.add("CARS", "This is CARS");
        testTable.add("SCAR", "This is SCAR");
        testTable.add("RACS", "This is RACS");
        assertTrue(testTable.contains("AA"));
        assertTrue(testTable.contains("BA"));
        assertTrue(testTable.contains("AB"));
        assertTrue(testTable.contains("CARS"));
        assertTrue(testTable.contains("SCAR"));
        assertTrue(testTable.contains("RACS"));
    }
}