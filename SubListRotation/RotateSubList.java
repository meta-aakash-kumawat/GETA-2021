public class RotateSubList {
	Node headNode=null;
	Node lastNode=null;
	/**
	 * This Function is used to Add Data into Node  
	 * @param value : value to add in node
	 * @return boolean: true or false for operation success or not
	 * @exception : when adding of element can't be done
	 */
	public boolean add(Node node)
	{
		if(node == null)
		{
			System.out.println("Node Can't Be Null");
		}
		
		if(lastNode==null)
		{
			headNode=node;
			lastNode=node;
		}
		else
		{
			lastNode.next = node;
			lastNode = node;
		}
		return true;
		
	}
	/**
	 * This Method is used to rotate SubList from start to end index
	 * @param start: start index
	 * @param end: end index
	 */
	public void rotateSubList(int start, int end, int rotateIndex){
		Node currentNode = headNode;
		int nodeCount=1;
		int opeartionCount=0;
		validate(start,end,rotateIndex);
		if(rotateIndex > end-start){
			rotateIndex = rotateIndex%(end-start);
			if(rotateIndex == 0){
				rotateIndex = end-start;
			}
		}
		Node startCurrent=null;
		Node startLast=null;
		Node endCurrent=null;
		Node endLast=null;
		int currentStart = start;
		int currentEnd = end;
		while(true){
			if(opeartionCount>=rotateIndex || currentStart == currentEnd){
				currentNode = headNode;
				break;
			}
			if(nodeCount == currentStart){
				startCurrent = currentNode;
				currentNode = currentNode.next;
				nodeCount++;
			}
			else if(nodeCount<currentStart){
				startLast = currentNode;
				currentNode = currentNode.next;
				nodeCount++;
			}
			else if(nodeCount == currentEnd && currentStart == 1){
				endCurrent = currentNode;
				endLast.next = endCurrent.next;
				headNode = endCurrent;
				endCurrent.next = startCurrent;
				currentNode = headNode;
				nodeCount=1;
				opeartionCount++;
					
			}
			else if(nodeCount == currentEnd && (currentEnd-currentStart) == 1){
				endCurrent = currentNode;
				startCurrent.next = endCurrent.next;
				startLast.next = endCurrent;
				endCurrent.next = startCurrent;
				currentNode = headNode;
				nodeCount=1;
				opeartionCount++;
					
			}
			
			else if(nodeCount == currentEnd){
				endCurrent = currentNode;
				endLast.next = endCurrent.next;
				startLast.next = endCurrent;
				endCurrent.next = startCurrent;
				currentNode = headNode;
				nodeCount=1;
				opeartionCount++;
					
			} 
			else{
				endLast = currentNode;
				currentNode = currentNode.next;
				nodeCount++;
			}
		}
		
	}
	/**
	 * this function is for validation of index or validation for index
	 * @param start
	 * @param end
	 * @param rotateIndex
	 * @exception through Exception when got any flase condition
	 */
	private void validate(int start, int end, int rotateIndex) {
	    
		if(start <= 0){
			System.out.println("Start Index Must Be Positive Number");
		}
		if(end >= size()){
			System.out.println("end Index Must Be Less Then Size");
		}
		if(end < start){
			System.out.println("end index can't be less then start index");
		}
	}
	public int size(){
		int size=0;
		Node current = headNode;
		while(current!=null){
		    
			size++;
			current = current.next;
		}
		return size;
	}
	
	public int[] toArray(){
		int size = this.size();
		int resultArray[] = new int[size];
		int index=0;
		Node current = headNode;
		while(current!=null){
			resultArray[index++]=current.value;
			current = current.next;
		}
		return resultArray;
	}
}
