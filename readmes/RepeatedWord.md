## January 15th 2019: Repeated Word

[code](../src/main/java/repeatedword/RepeatedWord.java)
[test](../src/test/java/repeatedword/RepeatedWordTest.java)


### Challenge:

Implement a method that when passed a long string of words will return the first repeated word in the string.

### Approach and Efficiency:

This method takes the string provided and splits it using regex by any space characters. It places that String array created by splitting into a variable and then iterates through it looking at each individual word. For any word it encounters it then checks to see if a HashTable contains that word and if so returns the word, if not it adds the word to the table and moves to the next. In the event that no words are repeating such as in the sentence "How Now Brown Cow" it will return null.

The method implemented is O(n) Time and Space due to the possibility it may iterate through the entire string and its creation of an Array of the same number of words.