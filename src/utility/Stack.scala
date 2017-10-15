import utility.Node;
import java.util.ArrayList

	class Stack(head:Node){
	  def push(node:Node): Unit = {
	  	if(head.right != null){
				node.right.push(node);
			}else{
				head.right = node;
			}
	  }
	  
	  var stackArray = new ArrayList[Int]()
	  var stackCtr = 0
	  var stackLength = 0;
	  var returnValue = 0;
	  
	  def pop(node:Node): Node = {
	    
	    if(stackCtr == 0){
	      stackLength = getStack(node).toArray().length
	    }
	    
	    //iterate to the last inserted node
	    if(node != null) {
  		  returnValue = node.value
				this.pop(node.right);
			}
	    
	    if(stackCtr == getStack(node).toArray().length - 1){
	      node.right = null
	    }
	    
	    if(stackLength == stackCtr){
	      stackCtr = -1
	      stackLength = 0
	    }

	    //increment
	    stackCtr += 1
	    //return last node
	    return new Node(null, null, returnValue)
	  }
	  
	  
	  def print(node:Node):Unit = {
  		if(node != null) {
				this.print(node.right);
  		  println(node.value);
			}
  	}
	  
	  def getStack(node:Node):ArrayList[Int] = {		  
  		if(node != null) {
				this.getStack(node.right);
  		  stackArray.add(node.value);
			}
  		
  		return stackArray
  	}
	  
	}