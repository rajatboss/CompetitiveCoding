package tree;

import java.util.*;

public class naryTreeLvlOrder {
	public List<List<Integer>> levelOrder(Node root) {
		List<List<Integer>> rv = new ArrayList<>();

		LinkedList<Node> q = new LinkedList<>();
		if (root == null)
			return rv;

		q.add(root);

		while (q.size() != 0) {
			LinkedList<Node> temp = new LinkedList<>();
			ArrayList<Integer> list = new ArrayList<>();
			while (q.size() != 0) {
				Node node = q.removeFirst();
				list.addLast(node.val);

				for (Node child : node.children)
					temp.addLast(child);
			}
			q = temp;
			rv.add(list);
		}
		return rv;
	}
}
