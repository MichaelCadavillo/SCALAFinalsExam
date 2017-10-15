import utility.Node;

object exercise {
//	var leftNode = new Node(null, null, 17);
//	var rightNode = new Node(null, null, 76);
//	var rootNode = new Node(leftNode, rightNode, 50);
	
//	rootNode.inOrder(rootNode)
//	rootNode.preOrder(rootNode)
//	rootNode.postOrder(rootNode)

	
	
	var parentNode = new Node(null, null, 8); //> parentNode  : utility.Node = Node(null,null,8)
	
	parentNode.addNode(new Node(null, null, 1));
	parentNode.addNode(new Node(null, null, 5));
	parentNode.addNode(new Node(null, null, 5));
	parentNode.addNode(new Node(null, null, 7));
	parentNode.addNode(new Node(null, null, 10));
	parentNode.addNode(new Node(null, null, 11));
	parentNode.addNode(new Node(null, null, 11));
	parentNode.addNode(new Node(null, null, 11));
	parentNode.addNode(new Node(null, null, 15));
	parentNode.addNode(new Node(null, null, 20));
	parentNode.addNode(new Node(null, null, 20));
	parentNode.addNode(new Node(null, null, 1));
	parentNode.setNode(parentNode)
	
	parentNode.inOrder(parentNode);           //> 1
                                                  //| 1
                                                  //| 5
                                                  //| 5
                                                  //| 7
                                                  //| 8
                                                  //| 10
                                                  //| 11
                                                  //| 11
                                                  //| 11
                                                  //| 15
                                                  //| 20
                                                  //| 20
//preOrder
	parentNode.preOrder(parentNode);          //> 8
                                                  //| 1
                                                  //| 1
                                                  //| 5
                                                  //| 5
                                                  //| 7
                                                  //| 10
                                                  //| 11
                                                  //| 11
                                                  //| 11
                                                  //| 15
                                                  //| 20
                                                  //| 20
//postOrder
	parentNode.postOrder(parentNode);         //> 1
                                                  //| 5
                                                  //| 7
                                                  //| 5
                                                  //| 1
                                                  //| 11
                                                  //| 11
                                                  //| 20
                                                  //| 20
                                                  //| 15
                                                  //| 11
                                                  //| 10
                                                  //| 8
	
//closest Node
	var closest = parentNode.closestNode(6)   //> closest  : utility.Node = Node(null,null,5)
	
//minimum
	var min = parentNode.min(parentNode)      //> min  : utility.Node = Node(null,null,1)
	
	
	
/////////STACK////////////////////STACK//////////////////////STACK////////////////////STACK/////////////////////STACK//////////


 var stack = new Node(null, null, 6)              //> stack  : utility.Node = Node(null,null,6)
 //push pop
	stack.push(new Node(null, null, 5))
	stack.push(new Node(null, null, 5))
	stack.push(new Node(null, null, 8))
	stack.push(new Node(null, null, 8))
	stack.push(new Node(null, null, 8))
	stack.push(new Node(null, null, 4))
	stack.print(stack)                        //> 4
                                                  //| 8
                                                  //| 8
                                                  //| 8
                                                  //| 5
                                                  //| 5
                                                  //| 6
	stack.pop(stack)                          //> res0: utility.Node = Node(null,null,4)
	stack.pop(stack)                          //> res1: utility.Node = Node(null,null,8)
	stack.push(new Node(null, null, 15))
	stack.push(new Node(null, null, 8))
	stack.pop(stack)                          //> res2: utility.Node = Node(null,null,8)
	
	stack.print(stack)                        //> 15
                                                  //| 8
                                                  //| 8
                                                  //| 5
                                                  //| 5
                                                  //| 6
//duplicates
stack.removeDuplicates(stack)                     //> 6
                                                  //| 5
                                                  //| 8
                                                  //| 15

}