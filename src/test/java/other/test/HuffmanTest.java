package other.test;

import org.junit.Assert;
import other.Huffman;

import java.util.HashMap;
import java.util.Map;

public class HuffmanTest {

    @org.junit.Test
    public void encode() {

        Huffman huffman = new Huffman();
        Map<Character, Integer> frequencyForChar = new HashMap<>();

        frequencyForChar.put('a', 10);
        frequencyForChar.put('b', 20);
        frequencyForChar.put('c', 40);
        frequencyForChar.put('d', 80);

        Map<Character, String> result = huffman.encode(frequencyForChar);
        Map<Character, String> encoding = new HashMap<>();

        encoding.put('a', "000");
        encoding.put('b', "001");
        encoding.put('c', "01");
        encoding.put('d', "1");

        for (Character character : result.keySet()) {
            Assert.assertEquals(result.get(character), encoding.get(character));
        }
    }
}