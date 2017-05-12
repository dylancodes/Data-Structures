public class BinarySearchTree {
	static TreeNode root;

	public BinarySearchTree(int data) {
		TreeNode root = new TreeNode();
		root.data = data;
		this.root = root;
                System.out.println(data + " was added to the tree as the root");
	}

	public TreeNode addValue(int data) {
		TreeNode node = new TreeNode();
		node.data = data;
		insert(node,root);
		System.out.println("The Root is: " + root.data);
		return null;
	}

	public boolean search(int num, TreeNode root) {
		if(BinarySearchTree.root == null) {
                    System.out.println("The tree is empty! Add a value first.");
                    return false;
                }
                
		if(root.data == num) {
                    System.out.println("The Number " + num + " was found!");
                    return true;
                }
                
		else if(root.data < num) {
			if(root.rightChild != null){
				return search(num, root.rightChild);
			}
                        else {
                                System.out.println("The Number " + num + " is not in the tree.");
				return false;
			}
		} 
                
                else if(root.data >= num) {
			if(root.leftChild != null){
				return search(num, root.leftChild);
			}
                        else {
                            System.out.println("The Number " + num + " is not in the tree.");
                            return false;
			}
		}
		return false;
	}

	public void insert(TreeNode node, TreeNode root) {
		if (BinarySearchTree.root == null) {
                    BinarySearchTree.root = node;
                }
		else if(node.data >= root.data){
			if(root.rightChild == null) {
                            root.rightChild = node;
                            System.out.println(node.data + " was added to the tree.");
                        }
                        else {
                            insert(node, root.rightChild);
                        }
		} 
                else if (node.data < root.data) {
			if(root.leftChild == null) {
                            root.leftChild = node;
                            System.out.println(node.data + " was added to the tree.");
                        }
			else { 
                            insert(node, root.leftChild);
                        }
		}
	}
}