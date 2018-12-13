package multibracketvalidation;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultiBracketValidationTest {

    @Test
    public void testMultiBracketValidation() {
        String wordS = "(somethings{are[in]brackets}sometimes)";
        String trueS = "[]{{}}{()}";
        String missingS = "[]{{}}{()";
        String unorderedS = "[]{{}}({)}";

        assertTrue("Should return true regardless of the other contents of the string", MultiBracketValidation.multiBracketValidation(wordS));
        assertTrue("Should return true for a string containing properly paired and ordered brackets", MultiBracketValidation.multiBracketValidation(trueS));
        assertFalse("Should return false if a bracket is missing but everything is in order", MultiBracketValidation.multiBracketValidation(missingS));
        assertFalse("Should return false if brackets are out of order", MultiBracketValidation.multiBracketValidation(unorderedS));

    }
}