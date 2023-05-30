package test01.dfs;

public class Main {

	Node root;//null
	
	void dfs(Node root) {//100,200
		if(root==null) return;
		else {
			System.out.print(root.data+"->");//전위순회출력
			dfs(root.lt);
//			System.out.print(root.data+"->");//중위순회출력
			dfs(root.rt);
//			System.out.print(root.data+"->");//후위순회출력
		}
	}
	
	public static void main(String[] args) {
		// DFS - 전위순회,중위순회,후위순회

		Main tree = new Main();
		tree.root = new Node(1);//100번지
		tree.root.lt = new Node(2);//200
		tree.root.rt = new Node(3);//300
		tree.root.lt.lt = new Node(4);//400
		tree.root.lt.rt = new Node(5);//500
		tree.root.rt.lt = new Node(6);//600
		tree.root.rt.rt = new Node(7);//700
		
		tree.dfs(tree.root);

	}//end main

}//end class

class Node{
	int data;
	Node lt;//left ,null
	Node rt;//right ,null
	public Node(int data) {
		this.data = data;
	}
}