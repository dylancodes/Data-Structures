public class BST {
    
public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree(4);
                System.out.println(""); 
                
		tree.addValue(7);
             
		tree.addValue(12);
              
		tree.addValue(22);
                
                tree.addValue(3); 
              
                tree.addValue(5); 
               
                tree.addValue(9);
                
               
                
                System.out.println(""); 
                
                tree.search(22, tree.root);
                tree.search(2, tree.root);

	}
}