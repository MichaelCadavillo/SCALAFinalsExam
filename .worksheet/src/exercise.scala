import utility.Node;

object exercise {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(329); 
//	var leftNode = new Node(null, null, 17);
//	var rightNode = new Node(null, null, 76);
//	var rootNode = new Node(leftNode, rightNode, 50);
	
//	rootNode.inOrder(rootNode)
//	rootNode.preOrder(rootNode)
//	rootNode.postOrder(rootNode)

	
	
	var parentNode = new Node(null, null, 8);System.out.println("""parentNode  : utility.Node = """ + $show(parentNode ));$skip(49); ;
	
	parentNode.addNode(new Node(null, null, 1));$skip(46); ;
	parentNode.addNode(new Node(null, null, 5));$skip(46); ;
	parentNode.addNode(new Node(null, null, 5));$skip(46); ;
	parentNode.addNode(new Node(null, null, 7));$skip(47); ;
	parentNode.addNode(new Node(null, null, 10));$skip(47); ;
	parentNode.addNode(new Node(null, null, 11));$skip(47); ;
	parentNode.addNode(new Node(null, null, 11));$skip(47); ;
	parentNode.addNode(new Node(null, null, 11));$skip(47); ;
	parentNode.addNode(new Node(null, null, 15));$skip(47); ;
	parentNode.addNode(new Node(null, null, 20));$skip(47); ;
	parentNode.addNode(new Node(null, null, 20));$skip(46); ;
	parentNode.addNode(new Node(null, null, 1));$skip(32); ;
	parentNode.setNode(parentNode);$skip(36); 
	
	parentNode.inOrder(parentNode);$skip(45); ;
//preOrder
	parentNode.preOrder(parentNode);$skip(47); ;
//postOrder
	parentNode.postOrder(parentNode);$skip(59); ;
	
//closest Node
	var closest = parentNode.closestNode(6);System.out.println("""closest  : utility.Node = """ + $show(closest ));$skip(50); 
	
//minimum
	var min = parentNode.min(parentNode);System.out.println("""min  : utility.Node = """ + $show(min ));$skip(177); 
	
	
	
/////////STACK////////////////////STACK//////////////////////STACK////////////////////STACK/////////////////////STACK//////////


 var stack = new Node(null, null, 6);System.out.println("""stack  : utility.Node = """ + $show(stack ));$skip(49); 
 //push pop
	stack.push(new Node(null, null, 5));$skip(37); 
	stack.push(new Node(null, null, 5));$skip(37); 
	stack.push(new Node(null, null, 8));$skip(37); 
	stack.push(new Node(null, null, 8));$skip(37); 
	stack.push(new Node(null, null, 8));$skip(37); 
	stack.push(new Node(null, null, 4));$skip(20); 
	stack.print(stack);$skip(18); val res$0 = 
	stack.pop(stack);System.out.println("""res0: utility.Node = """ + $show(res$0));$skip(18); val res$1 = 
	stack.pop(stack);System.out.println("""res1: utility.Node = """ + $show(res$1));$skip(38); 
	stack.push(new Node(null, null, 15));$skip(37); 
	stack.push(new Node(null, null, 8));$skip(18); val res$2 = 
	stack.pop(stack);System.out.println("""res2: utility.Node = """ + $show(res$2));$skip(23); 
	
	stack.print(stack);$skip(43); 
//duplicates
stack.removeDuplicates(stack)}

}
