package Lec44;

import java.util.HashMap;

public class Trie {

	public class Node {

		char data;
		HashMap<Character, Node> children;
		boolean isterminal;

		public Node(char ch) {
			// TODO Auto-generated constructor stub
			this.data = ch;
			children = new HashMap<>();
			this.isterminal = false;
		}

	}

	private Node root;

	public Trie() {
		// TODO Auto-generated constructor stub
		this.root = new Node('*');
	}

	public void insert(String word) {
		Node curr = this.root;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (!curr.children.containsKey(ch)) {
				Node nn = new Node(ch);
				curr.children.put(ch, nn);
				curr = nn;

			} else {
				curr = curr.children.get(ch);
			}

		}
		curr.isterminal = true;

	}

	public boolean search(String word) {
		Node curr = this.root;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (!curr.children.containsKey(ch)) {
				return false;

			} else {
				curr = curr.children.get(ch);
			}

		}
		return curr.isterminal;

	}

	public boolean startsWith(String prefix) {
		Node curr = this.root;
		for (int i = 0; i < prefix.length(); i++) {
			char ch = prefix.charAt(i);
			if (!curr.children.containsKey(ch)) {
				return false;

			} else {
				curr = curr.children.get(ch);
			}

		}
		return true;
	}
}
