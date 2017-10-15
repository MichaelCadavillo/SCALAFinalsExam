import utility.Node;

object exercise2 {

	class Stack(head:Node){
	  def push(node:Node): Unit = {
	  	if(head.right != null){
				head.right.push(node);
			}else{
				head.right = node;
			}
	  }
	  
	  def pop(): Node = {
	  	
	  return new Node(null, null, 5);
	  }
	  
	 }
	 
	 
}
