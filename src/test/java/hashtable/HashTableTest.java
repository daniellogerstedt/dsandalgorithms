package hashtable;

import org.junit.Test;

import java.util.List;

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

    @Test
    public void leftJoin() {
        HashTable<String> testTableOne = new HashTable<>();
        testTableOne.add("TestDataOne", "One");
        testTableOne.add("TestDataTwo", "Two");
        testTableOne.add("TestDataThree", "Three");
        HashTable<String> testTableTwo = new HashTable<>();
        testTableTwo.add("TestDataOne", "One Isn't Null");
        testTableTwo.add("TestDataThree", "Three Isn't Null");
        testTableTwo.add("TestDataMissing", "This Shouldn't Join");
        List<List> testJoin = HashTable.leftJoin(testTableOne, testTableTwo);

        assertEquals("TestDataTwo", testJoin.get(0).get(0));
        assertEquals("Two", testJoin.get(0).get(1));
        assertNull(testJoin.get(0).get(2));

        assertEquals("TestDataOne", testJoin.get(1).get(0));
        assertEquals("One", testJoin.get(1).get(1));
        assertEquals("One Isn't Null", testJoin.get(1).get(2));

        assertEquals("TestDataThree", testJoin.get(2).get(0));
        assertEquals("Three", testJoin.get(2).get(1));
        assertEquals("Three Isn't Null", testJoin.get(2).get(2));

        assertEquals(3, testJoin.size());

    }
}