package utility
import scala.collection.mutable.ListBuffer
import java.util.ArrayList
import scala.util.control.Breaks._
  
case class Node(var left:Node, var right:Node, var value:Int){
  
  var tree = new ArrayList[Int]();
  var node:Node = _;
  var returnValue = 0;
  
    //Left -> Root -> Right
		def inOrder(node: Node):Unit = {
			if(node != null) {
				this.inOrder(node.left);
				println(node.value)
				this.inOrder(node.right);
			}
		}
  
  	//Left -> Right -> Root
  	def postOrder(node:Node):Unit = {
  		//insert here
  		if(node != null) {
				this.postOrder(node.left);
				this.postOrder(node.right);
				println(node.value);
			}
  	}
  	
  	//Root -> Left -> Right
  	def preOrder(node:Node):Unit = {
  		//insert here
  		if(node != null) {
  			println(node.value);
				this.preOrder(node.left);
				this.preOrder(node.right);
			}
  	}

		//Return the nearest node value
  	def closestNode(num:Int):Node = {
  	  var target = new Node(null, null, num)
  		val tree = getTree(node)  //returns inOrder arraylist
  		val treeArray = tree.toArray(); 
  		
  		var returnValue:Node = null; 
  		var ctr:Int = 0;
  		var ctr1:Int = 0
  		var lowest = Math.abs(Integer.parseInt(tree.get(0).toString()) - target.value); 
	      	  
  		breakable {
  		  for(x<-treeArray){
  		    if((Math.abs(Integer.parseInt(tree.get(ctr1 + 1).toString()) - target.value)) == lowest){
  	         lowest = Math.abs(Integer.parseInt(tree.get(ctr1).toString()) - target.value)
  	         
  	      }else if((Math.abs(Integer.parseInt(tree.get(ctr1 + 1).toString()) - target.value)) < lowest){
  	          lowest = Math.abs(Integer.parseInt(tree.get(ctr1 + 1).toString()) - target.value)
  	          
    	    }
  		    
  		    if(ctr1 + 1 >= treeArray.length - 1){
  	        break
  	      }
  		    ctr1 += 1;
  		  }
  		}
  		  
  		 breakable {
    	  for(x <- treeArray){
  	    
  	      if(x.toString().equals(target.value)){
    	      returnValue = new Node(null, null, target.value);
    	      break
  	      }else if(Math.abs(Integer.parseInt(tree.get(ctr).toString()) - target.value) <= lowest){
    	      returnValue = new Node(null, null, Integer.parseInt(tree.get(ctr).toString()));
    	      break
  	      }else{
    	      returnValue = new Node(null, null, tree.get(ctr+1))
  	      }
  	    
  	      if(ctr + 1 >= treeArray.length - 1){
  	        break
  	      }
  	    
  	      ctr += 1;
  	    }
  		}
  	  
  	  return returnValue
  	}	
		
		def getTree(node: Node):ArrayList[Int] = {
			if(node != null) {
				this.getTree(node.left);
				tree.add(node.value)
				this.getTree(node.right);
			}
		  
		  return tree
		}
		
		def setNode(node: Node) = {
		  this.node = node;
		}
		
		def addNode(newNode:Node):Unit = {
			if(value < newNode.value){
				if(right != null){
					right.addNode(newNode);
				}else{ 
				right = newNode;
				}
			}else{
				if(left != null){
					left.addNode(newNode);
				}else{
				left = newNode;
				}
			}
		}
		
		def push(node:Node): Unit = {
			if(right != null){
				right.push(node);
			}else{
				right = node;
			}
		}
	    var poppedNode = 0
	    
	  def pop(node:Node): Node = {
	    if(node.right != null){
	      if((node.right).right == null){
			    poppedNode = node.right.value
	        node.right = null;
				}else{
				  this.pop(node.right);
				}
			}
	    return new Node(null, null, poppedNode)
	  }
	    
	    def print(node:Node):Unit = {
  		if(node != null) {
				this.print(node.right);
  		  println(node.value);
			}
  	}
	  
	  def min(node: Node): Node = {
	    var num = 0;
	    
  		if(node != null) {
  		  var curr = node.value
  		  
				this.min(node.right);
  		  if(node.left != null){
  		    if(node.left.value <= curr){
				    num = node.left.value
				  }  
  		  }else{
  		    num = node.value
  		  }
				this.min(node.left);
				
				
			}
  		
  		return new Node(null, null, num)
  	}
	  
	  var possiblyDuplicate = 0
	  
	  def removeDuplicates(node:Node): Unit = {
	    if(node != null){
  		  if(node.right != null){
	        if(node.right.value == node.value){ //compare next with the current
	          println(node.value)
  				  this.removeDuplicates(node.right.right); //call function again but instead skipping the next similar number
				  }else{  //else just print normally
				    println(node.value)
				    this.removeDuplicates(node.right);
				  }
			  }else{
			    println(node.value)
			  }
	    }
	  }
	}