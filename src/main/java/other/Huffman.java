package other;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Huffman {

    private class Node implements Comparable<Node> {

        char ch;
        int freq;
        boolean isLeaf;
        Node left, right;


        public Node(char ch, int freq) {
            this.ch = ch;
            this.freq = freq;
            isLeaf = true;
        }


        public Node(Node left, Node right, int freq) {
            this.left = left;
            this.right = right;
            this.freq = freq;
            isLeaf = false;
        }


        @Override
        public int compareTo(Node o) {
            return this.freq - o.freq;
        }
    }


    public Map<Character, String> encode(Map<Character, Integer> frequencyForChar) {

        PriorityQueue<Node> priorityQueue = new PriorityQueue<>();

        for (Character c : frequencyForChar.keySet()) {
            priorityQueue.add(new Node(c, frequencyForChar.get(c)));
        }

        while (priorityQueue.size() != 1) {
            Node node1 = priorityQueue.poll();
            Node node2 = priorityQueue.poll();
            priorityQueue.add(new Node(node1, node2, node1.freq + node2.freq));
        }

        return encode(priorityQueue.poll());
    }


    private Map<Character, String> encode(Node root) {

        Map<Character, String> encodingForChar = new HashMap<>();
        encode(root, "", encodingForChar);
        return encodingForChar;
    }


    private void encode(Node node, String encoding, Map<Character, String> encodingForChar) {

        if (node.isLeaf) {
            encodingForChar.put(node.ch, encoding);
            return;
        }
        encode(node.left, encoding + '0', encodingForChar);
        encode(node.right, encoding + '1', encodingForChar);
    }
}