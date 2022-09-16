package p1;

public class Tree {
	private Node root;
	//API alternatives
	//TreeMap if key value pairs with unique keys
	//TreeSet if there is only an object without a key but instead it uses comparable to sort
	//set types for these with generics
	
	public Tree()
	{
		root = null;
	}
	
	public Node minimum()
	{
		Node current = root;
		Node last = null;
		while(current!= null)
		{
			last = current;
			current = current.leftChild;
		}
		return last;
	}
	
	public boolean delete(int key)
	{
		Node current = root;
		Node parent = root;
		boolean isLeftChild = true;
		
		while(current.iData!=key)
		{
			parent = current;
			if(key< current.iData)
			{
				isLeftChild = true;
				current = current.leftChild;
			}
			else
			{
				isLeftChild = false;
				current = current.rightChild;
			}
			if(current == null)
			{
				return false;
			}
		}
		
		//at this point current is the node we want to delete
		//isLeftChild tells us if it is a left or right
		//parent is the parent of the node
		
		//cases
		//1)Node has no children
		if(current.leftChild == null && current.rightChild==null)
		{
			if(current == root)
			{
				root = null;
			}
			else if(isLeftChild)
			{
				parent.leftChild = null;
			}
			else
			{
				parent.rightChild = null;
			}
		}
		//2)The node has no right child replace with left sub tree
		else if(current.rightChild==null)
		{
			if(current==root)
			{
				root = current.leftChild;
			}
			else if(isLeftChild)
			{
				parent.leftChild = current.leftChild;
			}
			else
			{
				parent.rightChild = current.leftChild;
			}
		}
		//3)The node must have a right child
		else if(current.leftChild == null)
		{
			if(current == root)
			{
				root = current.rightChild;
			}
			else if(isLeftChild)
			{
				parent.leftChild = current.rightChild;
			}
			else
			{
				parent.rightChild = current.rightChild;
			}
		}
		//4)The node has two children (programming moment)
		else
		{
			//get successor
			Node successor = getSuccessor(current);
			if(current==root)
			{
				root = successor;
			}
			else if(isLeftChild)
			{
				parent.leftChild = successor;
			}
			else
			{
				parent.rightChild = successor;
			}
			successor.leftChild = current.leftChild;
		}
		return true;
	}
	
	private Node getSuccessor(Node delNode)
	{
		Node successorParent = delNode;
		Node successor = delNode;
		Node current = delNode.rightChild;
		while(current!= null)
		{
			successorParent = successor;
			successor = current;
			current = current.leftChild;
		}
		
		if(successor != delNode.rightChild)
		{
			successorParent.leftChild = successor.rightChild;
			successor.rightChild = delNode.rightChild;
		}
		
		return successor;
	}
	
	public void traverse(int traverseType)
	{
		switch(traverseType) {
		case 1:
			preOrder(root);
			break;
		case 2:
			inOrder(root);
			break;
		case 3:
			postOrder(root);
			break;
		}
	}
	
	private void postOrder(Node localRoot) { //postfix
		if(localRoot != null)
		{
			preOrder(localRoot.leftChild);
			preOrder(localRoot.rightChild);
			System.out.println(localRoot.iData);
		}
		
	}

	private void inOrder(Node localRoot) { //infix
		if(localRoot != null)
		{
			inOrder(localRoot.leftChild);
			System.out.println(localRoot.iData);
			inOrder(localRoot.rightChild);
		}
		
	}

	private void preOrder(Node localRoot) { //prefix
		if(localRoot != null)
		{
			System.out.println(localRoot.iData);
			preOrder(localRoot.leftChild);
			preOrder(localRoot.rightChild);
		}
		
	}

	public Node maximum()
	{
		Node current = root;
		Node last = null;
		while(current!= null)
		{
			last = current;
			current = current.rightChild;
		}
		return last;
	}
	
	public Node find(int key)
	{
		Node current = root;
		while(current.iData!=key)
		{
			if(key<current.iData)
				current = current.leftChild;
			else
				current = current.rightChild;
			
			if(current == null)
				return null;
		}
		return current;
	}
	
	public void insert(int iData,double dData)
	{
		Node newNode = new Node();
		newNode.iData = iData;
		newNode.dData = dData;
		
		if(root == null)
		{
			root = newNode;
		}
		else
		{
			Node current = root;
			Node parent;
			while(true)
			{
				parent = current;
				if(iData<current.iData)
				{
					current = current.leftChild;
					if(current == null)
					{
						parent.leftChild = newNode;
						return;
					}
				}
				else
				{
					current = current.rightChild;
					if(current == null)
					{
						parent.rightChild = newNode;
						return;
					}
				}
			}
		}
	}
}
