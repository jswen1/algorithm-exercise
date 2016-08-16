import java.util.Arrays;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.Stack;



public class SwordToOffer {
	
	private static boolean flag = true;
	private static int Count = 0;
	public static void main(String[] args) {
/*		//题3：二维排序数组的查找
		int[][] arr = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15},{7,9,13,17}};
		System.out.println(findInMatrix(arr, 3));
		int[][] arr1 ={};
		System.out.println(findInMatrix(arr1, 7));*/
		
/*		//题4：替换字符串中的空格
		String s = "we are    family";
		String t = " ";
		System.out.println(replaceBlank(s,' ',"%20"));*/
		
/*		//题5：从尾到头打印链表
		ListNode fifNode = new ListNode(5, null);
		ListNode forNode = new ListNode(4, fifNode);
		ListNode thNode = new ListNode(3, forNode);
		ListNode secNode = new ListNode(2, thNode);
		ListNode head = new ListNode(1, secNode);
		System.out.println(printListFromTailToHead2(head));*/
		
/*		//题6：重建二叉树
		int[] preOrderTraverse = {1,2,4,7,3,5,6,8};
		int[] inOrderTraverse = {4,7,2,1,5,3,8,6};
		TreeNode root = new TreeNode(0, null, null);
		root = rebuildTree(preOrderTraverse,inOrderTraverse);
		System.out.println(root.toString());
		root.print();*/
		
/*		//题7：用2个 栈实现队列
		CQueue queue = new CQueue();
		queue.push("asd");
		queue.push("ase");
		queue.push("asg");
		queue.push("asm");
		queue.push("asx");
		System.out.println(queue.toString());
		queue.pop();
		System.out.println(queue.toString());
		queue.push("asy");
		System.out.println(queue.toString());
		queue.push("asz");
		System.out.println(queue.toString());
		queue.pop();
		System.out.println(queue.toString());
		queue.pop();
		System.out.println(queue.toString());
		queue.pop();
		System.out.println(queue.toString());*/
		
/*		//题7：用2个 队列实现栈
		CStack stack = new CStack();
		stack.push("asd");
		stack.push("ase");
		stack.push("asg");
		stack.push("asm");
		stack.push("asx");
		System.out.println(stack.toString());
		stack.pop();
		System.out.println(stack.toString());
		stack.push("asy");
		System.out.println(stack.toString());
		stack.push("asz");
		System.out.println(stack.toString());
		stack.pop();
		System.out.println(stack.toString());
		stack.pop();
		System.out.println(stack.toString());
		stack.pop();
		System.out.println(stack.toString());*/
		
/*		//二分查找算法
		int sorted[] = {1,4,6,8,9,11,15,18,21,14,28,30,99,121,999,1212};
		System.out.println(binarySearch(sorted, 122));
		System.out.println(binarySearch(sorted, 122, 0, sorted.length-1));*/
		
/*		//快速排序
		int arr[] = {234,45,76,343,89,6,342,61,1,4,6,8,9,11,15,18,6,6,56,6,1,6,6,6,6,6,21,14,28,30,99,121,999,1212};
		//System.out.println(partition(arr, 0, arr.length - 1));
		quickSort(arr, 0, arr.length - 1);
		//Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));*/
	
/*		//题8：旋转数组的最小数字
//		int reverseArr[] = {4,5,6,1,2,3,4};
//		//int reverseArr[] = {4,0,0,1,2,3,4};
//		System.out.println(min(reverseArr));
*/	
		
/*		//题10：二进制中1的个数
		int numberOf1 = 1500;
		System.out.print(numberOf1+"的二进制中1的个数为："+numberOf1(numberOf1));*/
		
/*		//题11：数值的整数次方
		double d = 1e16d;  	  
		double d2 = d +1.0d - d;  
		System.out.println(d2);
		System.out.println(Math.round(-1.5));
		System.out.println(new java.text.DecimalFormat("0.00").format(4.025));*/
	
/*		//题12：打印1到最大的n位数
		print1ToMaxOfNDigits(3);
		print1ToMaxOfNDigits(5);*/
		
/*		//题14：14调整数组元素顺序使奇数位于偶数前面
		int[] reOrder = {1,2,3,4,5,6,7,8,9,10,11,12};
		reOrderOddEven(reOrder);
		System.out.println(Arrays.toString(reOrder));
		//System.out.print(judge(-6));
*/		
	
		//题16：反转链表
		ListNode node5 = new ListNode(5, null);
		ListNode node4 = new ListNode(4, node5);
		ListNode node3 = new ListNode(3, node4);
		ListNode node2 = new ListNode(2, node3);
		ListNode node1 = new ListNode(1, node2);
		printList(node1);
		printList(reverseList2(node1));
		
/*		//题17：合并两个有序的链表
		ListNode node5 = new ListNode(9, null);
		ListNode node4 = new ListNode(7, node5);
		ListNode node3 = new ListNode(5, node4);
		ListNode node2 = new ListNode(3, node3);
		ListNode node1 = new ListNode(1, node2);
		ListNode node10 = new ListNode(10, null);
		ListNode node9 = new ListNode(8, node10);
		ListNode node8 = new ListNode(6, node9);
		ListNode node7 = new ListNode(4, node8);
		ListNode node6 = new ListNode(2, node7);
		printList(mergeList2(node1, node6));*/
	
/*		//题18：判断树B是否是树A的结构
		int[] preOrderTraverse = {1,2,4,7,3,5,6,8};
		int[] inOrderTraverse = {4,7,2,1,5,3,8,6};
		TreeNode root1 = rebuildTree(preOrderTraverse,inOrderTraverse);
		root1.print();
		System.out.println();
		TreeNode root2_left = new TreeNode(5, null, null);
		TreeNode root2_right_left = new TreeNode(8, null, null);
		//TreeNode root2_right_right = new TreeNode(5, null, null);
		TreeNode root2_right = new TreeNode(6, root2_right_left, null);
		TreeNode root2 = new TreeNode(3, root2_left, root2_right);
		root2.print();
		System.out.println();
		System.out.println(hasSubtree(root1, root2));*/
		
/*		//题19：二叉树的镜像
		int[] preOrderTraverse = {1,2,4,7,3,5,6,8};
		int[] inOrderTraverse = {4,7,2,1,5,3,8,6};
		TreeNode root = rebuildTree(preOrderTraverse,inOrderTraverse);
		root.print();
		System.out.println();
		treeMirror(root);
		root.print();*/

/*		//题20：顺时针打印矩阵
		int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16},{17,18,19,20}};
		printMatrixClockwisely(matrix);*/
	
/*		//题22:栈的压入、弹出序列
		int[] push = {1,2,3,4,5};
		int[] pop = {4,3,5,1,2};
		System.out.println(isPopOrder(push, pop));*/
		
		//题23：从上往下打印二叉树(即二叉树的广度优先遍历)
//		int[] preOrderTraverse = {1,2,4,7,3,5,6,8};
//		int[] inOrderTraverse = {4,7,2,1,5,3,8,6};
//		TreeNode root = rebuildTree(preOrderTraverse,inOrderTraverse);
		TreeNode root2_left_left = new TreeNode(4, null, null);
		TreeNode root2_left_right = new TreeNode(8, null, null);
		TreeNode root2_left = new TreeNode(6, root2_left_left, root2_left_right);
		TreeNode root2_right_left = new TreeNode(12, null, null);
		TreeNode root2_right_right = new TreeNode(16, null, null);
		TreeNode root2_right = new TreeNode(14, root2_right_left, root2_right_right);
		TreeNode root2 = new TreeNode(10, root2_left, root2_right);
		//root2.printBreadthFirstTraversal();
		
/*		//题24：二叉搜索树的后续遍历序列
		int post[] = {5,7,6,9,11,10,8};
		System.out.println(verifySquenceOfBST(post, 0, post.length - 1));*/
		
/*		//题25：二叉树中某一条路径的和
		//System.out.println(treeSum(root2));
		//System.out.println(pathSum(root2, 0));
		Stack<Integer> stack = new Stack<Integer>();
		System.out.println(findPath(root2, 0, 17, stack));*/
	
/*		//题27：二叉搜索树转换为双向链表
		//System.out.println(convertBinarySearchTreeToDoubleLinkedList(root2).value);
		printTreeNode(root2,"LeftToRight");
		TreeNode result= convertNode(root2);
		printTreeNode(result.left, "LeftToRight");
		printTreeNode(result.right, "RightToLeft");
		//System.out.println(result.value);
		//System.out.println(result.left.value);
		//System.out.println(result.right.value);
*/		
		
/*		//题28：字符串的排列
		alphabetPermutation2("abc");
		//System.out.println(A(0, 0)); */
		
		/*//八皇后问题
		System.out.println(isMeetEightQueens("42057136"));
		System.out.println(isMeetEightQueens("01234567"));
		alphabetPermutation2("01234567");
		System.out.println("8皇后摆在不同行不同列的情况有："+A(8, 8)+"种");
		System.out.println("满足8皇后摆放条件(不同行不同列并且没有2个或以上在对角线上)的有"+Count+"种");
	
		StringBuilder s = new StringBuilder("kabcdefg");
		System.out.println(s+"反转后为："+s.reverse());
		System.out.println(new StringBuilder('d'));
		System.out.println(strTransform("auaaabccaccbhhhhoo"));
		
		int[] arr = {4,5,6,7,8,9,10,11,12,13};
		System.out.println("移动之前数组："+Arrays.toString(arr));
		System.out.println("移动之后数组："+Arrays.toString(moveElement(arr)));*/
		
		
	}
	/**
	 * 功能：二维排序数组的查找
	 * @param arr 排序二维数组 ，排序规则：从左到右依次递增，从上到下依次递增
	 * @param k 待查找的数
	 * @return 1，找到；0，未找到；-1，输入不合法
	 */
	public static int findInMatrix(int[][] arr,int k){
		if(arr == null || arr.length == 0){
			return -1;
		}
		int row = arr.length;
		int col = arr[0].length;
		//System.out.println(row+"\t"+col);
		int i=0,j=col-1;
		while(i<row && j>=0){
			if(arr[i][j] == k){
				return 1;				
			}else if(arr[i][j] > k){
				j--;
			}else{
				i++;
			}
		}		
		return 0;
	}
	/**
	 * 功能：用replacement替换字符串s中的字符c
	 * @param s 给定字符串
	 * @param c 待替换字符
	 * @param replacement 替换成字符串
	 * @return 替换后的字符串
	 */
	public static String replaceBlank(String s,char c,String replacement){
		if(null == s || s.length() == 0){
			return s;
		}
		/*
		\n 回车(\u000a) 
	    \t 水平制表符(\u0009) 
	    \s 空格(\u0008) 
	    \r 换行(\u000d)
	    \d 数字
	    */
		//repalce与replaceAll区别：前者只支持字符的替换，后者还支持正则替换，如\t。
		//s = s.replace(" ", "%20");
		//s = s.replaceAll(" +", " ");
		//s = s.replaceAll("\\s", ""); //去掉所有空格、换行、回车、制表符
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<s.length();i++){
			if(c == s.charAt(i)){
				sb.append(replacement);
			}else{
				sb.append(s.charAt(i));
			}
		}		
		return sb.toString();
	}
	/**
	 * 功能：从尾到头打印链表 （递归实现）
	 * @param head 头结点
	 * @return 从尾到头节点的value字符串
	 */
	public static String printListFromTailToHead(ListNode head){
		if(head == null){
			return null;
		}
		if(head.next == null){
			System.out.println(head.value);		
			return head.value+""; 
		}
		String result = printListFromTailToHead(head.next);
		System.out.println(head.value);
		return result+"\t"+head.value;
	}
	/**
	 * 功能：从尾到头打印链表 （栈实现）
	 * @param head 头结点
	 * @return 从尾到头节点的value字符串
	 */
	public static String printListFromTailToHead2(ListNode head){
		Stack<ListNode> stack = new Stack<ListNode>();
		String result = "";
		while(head != null){
			stack.push(head);
			head = head.next;
		}
		while(!stack.empty()){
			System.out.println(stack.peek().value);
			result += stack.pop().value;
		}
		return result;
	}
	/**
	 * 功能：根据前序遍历和后续遍历重构二叉树
	 * @param preOrder 前序遍历集合
	 * @param inOrder  后序遍历集合
	 * @return  重构后的二叉树根节点
	 */
	public static TreeNode rebuildTree(int preOrder[],int inOrder[]){
		if(preOrder == null || inOrder == null || preOrder.length <= 0 || 
				inOrder.length <= 0 || preOrder.length != inOrder.length){
			return null;
		}
		return rebuildTreeCore(preOrder,inOrder,0,preOrder.length-1,0,inOrder.length-1);
	}
	/**
	 * 功能：根据前序遍历和后序遍历集合中指定的元素重构二叉树
	 * @param preOrder 前序遍历集合
	 * @param inOrder 后序遍历集合
	 * @param preBegin 前序遍历开始元素位置
	 * @param preEnd  前序遍历结束元素位置
	 * @param inBegin 中序遍历开始元素位置
	 * @param inEnd 中序遍历开始元素位置
	 * @return 重构后的二叉树的根节点
	 */
	public static TreeNode rebuildTreeCore(int preOrder[],int inOrder[],int preBegin,int preEnd,
			int inBegin,int inEnd){
		System.out.println(""+preBegin+preEnd+inBegin+inEnd);
		//前序遍历中第一个结点就是根节点
		int rootValue = preOrder[preBegin];
		TreeNode root = new TreeNode(rootValue,null,null);
		if(preOrder.length ==1 && preOrder[preBegin] == inOrder[inBegin]){
			return root;
		}else if (preOrder.length ==1){
			throw new IllegalArgumentException("参数不合法！");
		}
		//在中序遍历中找到根节点的值
		
		int rootInOrder = 0; //记录中序遍历中根节点的位置
		int leftPreOrderEnd = 0; //记录前序遍历中左子树的结束位置
		int length = preEnd - preBegin + 1; //树结点个数
		int count = 0; //记录前序遍历的根节点在中序遍历中的位置，也即左子树的结点个数
		for(int i=inBegin;i<=inEnd;i++){
			if(rootValue == inOrder[i]){
				rootInOrder = i;
				break;
			}else if(i == inEnd){
				throw new IllegalArgumentException("参数不合法！");
			}else{
				count++;
			}
		}
		leftPreOrderEnd = preBegin + count; 
		if(count > 0){
			//构建左子树
			root.left = rebuildTreeCore(preOrder,inOrder,preBegin+1,leftPreOrderEnd,inBegin,rootInOrder-1);
		}
		if(count < length-1){
			//构建右子树
			root.right = rebuildTreeCore(preOrder,inOrder,leftPreOrderEnd+1,preEnd,rootInOrder+1,inEnd);
		}
		return root;
	}
	/**
	 * 功能：非递归二分查找算法
	 * @param arr 排序好的数组
	 * @param k 待查找的元素
	 * @return 元素所在坐标
	 */
	public static int binarySearch(int[] arr, int k){
		int low = 0;
		int high = arr.length - 1;
		System.out.println("" + low + high);
		while(low <= high){
			int middle = (low + high)/2; //中间位置
			if(k == arr[middle]){
				return middle;
			}else if(k < arr[middle]){
				high = middle - 1;
				System.out.println("" + low + high);
			}else{
				low = middle + 1;
				System.out.println("" + low + high);
			}
		}
		return -1;
	}
	/**
	 * 功能：递归方法实现二分查找法. 
	 * @param arr 排序好的数组
	 * @param k 待查找的元素
	 * @return 元素所在坐标
	 */
	public static int binarySearch(int[] arr, int k, int low, int high){
		System.out.println("" + low + high);
		if(low <= high){
			int middle = (low + high)/2;
			if(k == arr[middle]){
				return middle;
			}else if(k < arr[middle]){
				return binarySearch(arr, k, low, middle - 1);
			}else{
				return binarySearch(arr, k, middle + 1, high);
			}
		}else{
			return -1;
		}
	}
	/**
	 * 功能：给定一个数组arr[]和数组中任意一个元素a，重排数组使得a左边都小于它，右边都不小于它。
	 * @param arr 排序前数组
	 * @param start 开始位置
	 * @param end 结束位置
	 * @return 满足条件的排序后的数组
	 */
	public static int partition2(int[] arr, int start, int end){
		if(arr == null || arr.length ==0 || start < 0 || end >= arr.length){
			throw new IllegalArgumentException("invalid parameters");
		}
		int middle = (start+end)/2;
		int mark = arr[middle]; //选取哨兵元素
		while(start < end){
			while(arr[start] <= mark && start <= end){
				start++;
			}
			while(arr[end] >= mark && end >= start){
				end--;
			}
			if(arr[start] == arr[end] && start == end){
				break;
			}
			else
			if(start < end)
			{
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
			}
		}
		System.out.println(""+start + end);
		return start;
	}
	/**
	 * 功能：给定一个数组arr[]和数组中任意一个元素a，重排数组使得a左边都小于它，右边都不小于它。
	 * @param arr 排序前数组
	 * @param start 开始位置
	 * @param end 结束位置
	 * @return 满足条件的排序后的数组
	 */
	public static int partition(int[] arr, int start, int end){
		if(arr == null || arr.length ==0 || start < 0 || end >= arr.length){
			throw new IllegalArgumentException("invalid parameters");
		}
		int pivot =start;
		int guard = arr[pivot];
		for(int i = start+1; i <= end; ++i){
	         if(arr[i] < guard) {
	        	 ++pivot;
	        	 int temp = arr[i];
	        	 arr[i] = arr[pivot];
	        	 arr[pivot] = temp;       	 
	         }
	     }
		int temp = arr[pivot];
   	   	arr[pivot] = arr[start];
   	   	arr[start] = temp;
   	   	System.out.println("这次排好的是：第"+(pivot)+"位："+arr[pivot]);
		return pivot;
	}
	/**
	 * 功能： 快速排序
	 * @param arr 待排序数组
	 * @param start 排序开始位置
	 * @param end   排序结束位置
	 */
	public static void quickSort(int[] arr, int start, int end){
		if(start == end){
			return;
		}
		int index = partition(arr, start, end);
		if(index > start){
			quickSort(arr, start, index-1);
		}
		if(index < end){
			quickSort(arr, index + 1, end);
		}
	}
	/**
	 * 功能：旋转数组的最小数字(时间复杂度：log(n))
	 * @param arr 数组
	 * @return 数组中最小数字
	 */
	public static int min(int[] arr){
		if(arr == null || arr.length == 0){
			throw new IllegalArgumentException("invalid parameter!");
		}
		int begin = 0;
		int end = arr.length - 1;
		int middle = begin;
		while(arr[begin] >= arr[end]){
			System.out.println(""+begin +"\t"+end);
			if(end - begin == 1){
				return arr[end];
			}
			middle = (begin + end)/2;
			//[1,0,1,1,1,1]和[1,1,1,1,0,1]这种特殊情况要特别处理
			if(arr[middle] == arr[begin] && arr[middle] == arr[end]){
				int min = arr[begin];
				for(int i = begin;i < end; i++){
					if(arr[i] < min){
						min = arr[i];
					}
				}
				return min;
			}
			if(arr[middle] >= arr[begin]){
				begin = middle;
			}else if(arr[middle] <= arr[end]){
				end = middle;
			}
		}
		return arr[middle];
	}
	/**
	 * 功能：一个整数的二进制中1的个数
	 * @param n 整数
	 * @return 1的个数
	 */
	public static int numberOf1(int n){
		int count = 0;
		while (n != 0){
			++count;
			n = n & (n - 1);
		}
		return count;
	}
	public static int power(){
		return 0;
	}
	/**
	 * 功能：打印1到最大的n位数
	 * @param n 数字位数
	 */
	public static void print1ToMaxOfNDigits(int n){
		if(n <= 0){
			return ;
		}
		char[] number = new char[n];
		for(int i = 0; i < 10; i++){
			number[0] = (char) (i + '0');
			print1ToMaxOfNDigitsRecursively(number, 0);
		}
}
	public static void print1ToMaxOfNDigitsRecursively(char[] number, int index) {
		int length = number.length;
		if(index == length - 1){
			printNumber(number);
			return;
		}
		for(int i = 0; i < 10; i++){
			number[index + 1] = (char) (i + '0');
			print1ToMaxOfNDigitsRecursively(number, index + 1);
		}
	}
	public static void printNumber(char[] number) {
		System.out.println(Arrays.toString(number));
		int length = number.length;
		boolean isBegin0 = true;
		for(int i = 0; i < length; i++){
			if(isBegin0 && number[i] != '0'){
				isBegin0 = false;
			}
			if(!isBegin0){
				System.out.print(number[i]);
			}
		}
		System.out.print("\t");
	}
	/**
	 * 功能：调整数组元素顺序使奇数位于偶数前面
	 * @param arr 给定数组
	 */
	public static void reOrderOddEven(int arr[]){
		if(arr == null || arr.length == 0){
			return ;
		}
		int begin = 0;
		int end = arr.length - 1;
		while(begin < end){
			System.out.println(""+begin+"\t"+end);
			while(begin < end && !judge(arr[begin])){
				begin ++;
			}
			while(begin < end && judge(arr[end])){
				end--;
			}
			if(begin < end){
				swap(arr, begin, end);
			}
		}
	}
	public static boolean judge(int begin) {
		if((begin & 1) == 0){
			return true;
		}else{
			return false;
		}
	}
	/**
	 * 功能：交换数组内2个指定位置元素的值
	 * @param arr  给定数组
	 * @param a 位置一
	 * @param b 位置二
	 */
	public static void swap(int[] arr, int a, int b) {
		if(arr == null || arr.length == 0 || a < 0 || a >= arr.length
				|| b < 0 || b >= arr.length){
			return;
		}
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	/**
	 * 功能：反转链表  (递归实现)
	 * @param head 链表头结点
	 * @return 反转链表后的头结点(即原链表的最后一个节点)
	 */
	public static ListNode reverseList(ListNode head){		
		if(head == null || head.next == null){
			return head;
		}
		ListNode next = head.next;
		ListNode last = reverseList(head.next);
		next.next = head;
		head.next = null;
		return last;
	}
	/**
	 * 功能：反转链表  (非递归实现)
	 * @param head 链表头结点
	 * @return 反转链表后的头结点(即原链表的最后一个节点)
	 */
	public static ListNode reverseList2(ListNode head){	
		if(head == null || head.next == null){ 
			return head;
		}
		ListNode pNode = head;//当前结点
		ListNode pPrev = null;//当前结点的前一个结点
		ListNode pNext = head.next; //当前结点的后一个结点
		head.next = null;
		while(pNext != null){
			pPrev = pNode;
			pNode = pNext;
			pNext = pNext.next;
			pNode.next = pPrev;
//			pNext=pNode.next;
//			pNode.next = pPrev;//当前结点指向前一个结点
//			pPrev = pNode;//pPrev和pNode往前移动。
//			pNode=pNext;//这里要使用前面保存下来的pNext，不能使用pNode->m_pNext因为它已经改变了指向			
		}
		return pNode;//返回反转链表头指针。
	}
	/**
	 * 功能：依次打印链表节点值
	 * @param head 链表头结点
	 */
	public static void printList(ListNode head){
		if(head == null){
			return;
		}
		System.out.print("[");
		while(head != null){
			System.out.print(head.value + "\t");
			head = head.next;				
		}
		System.out.println("]");
	}
	/**
	 * 功能：合并两个有序的链表  (递归实现)
	 * @param head1 排序好的链表1
	 * @param head2 排序好的链表2
	 * @return 合并后的链表头结点
	 */
	public static ListNode mergeList(ListNode head1, ListNode head2){
		if(head1 == null){
			return head2;
		}
		if(head2 == null){
			return head1;
		}
		ListNode mergeHead = null;
		if(head1.value <= head2.value){
			mergeHead = head1;
			mergeHead.next = mergeList(head1.next,head2);
		}else{
			mergeHead = head2;
			mergeHead.next = mergeList(head1,head2.next);
		}
		return mergeHead;
	}
	/**
	 * 功能：合并两个有序的链表  (非递归实现)
	 * @param head1 排序好的链表1
	 * @param head2 排序好的链表2
	 * @return 合并后的链表头结点
	 */
	public static ListNode mergeList2(ListNode head1, ListNode head2){
		if(head1 == null){
			return head2;
		}
		if(head2 == null){
			return head1;
		}
		ListNode mergeHead = head1.value <= head2.value ? head1 : head2;
		ListNode mergeTail = new ListNode(0, null);
		while(head1 != null && head2 != null){
			if(head1.value <= head2.value){
				mergeTail.next = head1;
				mergeTail = mergeTail.next;
				head1 = head1.next;
			}else{
				mergeTail.next = head2;
				mergeTail = mergeTail.next;
				head2 = head2.next;
			}
		}
		if(head1 == null){
			mergeTail.next = head2;
		}
		if(head2 == null){
			mergeTail.next = head1;
		}
		return mergeHead;
	}
	/**
	 * 功能：判断以root1为根节点的子树包不包含以root2为根节点的树
	 * @param root1 根节点
	 * @param root2 根节点
	 * @return  tree1 是否包含 tree2
	 */
	public static boolean hasSubtree(TreeNode root1, TreeNode root2){
		if(root1 == null || root2 == null){
			return false;
		}
		boolean result = false;
		if(root1.value == root2.value){
			result = tree1HaveTree2(root1, root2);
		}
		if(!result){
			result = hasSubtree(root1.left, root2);
		}
		if(!result){
			result = hasSubtree(root1.right, root2);
		}
		return result;
	}
	/**
	 * 功能：判断以root1为根节点的子树包不包含以root2为根节点的树
	 * 该函数与上面函数区别：hasSubtree中root1 可以不等于root2，而tree1HaveTree2中root1 必须等于root2，否则返回false。
	 * @param root1 根节点
	 * @param root2 根节点
	 * @return tree1 是否包含 tree2
	 */
	public static boolean tree1HaveTree2(TreeNode root1, TreeNode root2){
		if(root2 == null){
			return true;
		}
		if(root1 == null){
			return false;
		}
		if(root1.value != root2.value){
			return false;
		}
		if(!tree1HaveTree2(root1.left ,root2.left)){
			return false;
		}
		if(!tree1HaveTree2(root1.right ,root2.right)){
			return false;
		}
		return true;
	}
	/**
	 * 功能：输出二叉树的镜像
	 * @param root 二叉树的根节点
	 */
	public static void treeMirror(TreeNode root){
		if(root == null || root.left == null && root.right == null){
			return ;
		}
		TreeNode temp = new TreeNode(0, null, null);
		temp = root.left;
		root.left = root.right;
		root.right = temp;
		
		if(root.left != null){
			treeMirror(root.left);
		}
		if(root.right != null){
			treeMirror(root.right);
		}
	}
	/**
	 * 功能：一层一层顺时针打印矩阵
	 * @param arr 矩阵
	 */
	public static void printMatrixClockwisely(int[][] arr){
		if(arr == null || arr.length == 0 || arr[0].length == 0){
			return;
		}
		int row = arr.length;
		int col = arr[0].length;
		int start = 0;
		while(col > start * 2 && row > start * 2){
			printMatrixInCircle(arr, start);
			start++;
		}
	}
	/**
	 * 功能：打印一层矩阵(从外往里第start+1圈)
	 * @param arr 矩阵
	 * @param start 开始的行号与列号
	 */
	private static void printMatrixInCircle(int[][] arr, int start) {
		int row = arr.length;
		int col = arr[0].length;
		int endCol = col - 1 - start;
		int endRow = row - 1 - start;
		//从左到右打印一行(至少1行1列)
		for(int i = start; i <= endCol; i++){
			int number = arr[start][i];
			System.out.print(number + "\t");			
		}
		System.out.println();
		//从上到下打印一行(至少2行1列)
		if(start < endRow){
			for(int i = start + 1; i <= endRow; i++){
				int number = arr[i][endCol];
				System.out.print(number + "\t");				
			}
			System.out.println();
		}
		//从右到左打印一行(至少2行2列)
		if(start < endCol && start < endRow){
			for(int i = endCol - 1; i >= start; i--){
				int number = arr[endRow][i];
				System.out.print(number + "\t");
			}
			System.out.println();
		}
		//从下到上打印一行(至少3行2列)
		if(start < endCol && start < endRow - 1){
			for(int i = endRow - 1; i >= start + 1; i--){
				int number = arr[i][start];
				System.out.print(number + "\t");
			}
			System.out.println();
		}
	}
	/**
	 * 功能：判断栈的压入、弹出序列
	 * @param push 压入序列
	 * @param pop  弹出序列
	 * @return 返回弹出序列是否可能是压入序列的弹出序列
	 */
	public static boolean isPopOrder(int[] push, int[] pop){
		if(push == null || pop == null || push.length == 0 || pop.length ==0 
				|| push.length != pop.length){
			return false;
		}
		boolean possible = false;	
		int lengh = push.length;
		int nextPush = 0;
		int nextPop = 0;
		Stack<Integer> stack = new Stack<Integer>();
		while(nextPop < lengh){
			while(stack.empty() || stack.peek() != pop[nextPop]){
				if(nextPush == lengh){
					break;
				}
				stack.push(push[nextPush]);
				nextPush++;
			}
			if(stack.peek() != pop[nextPop]){
				break;
			}
			stack.pop();
			nextPop++;
		}
		if(nextPop == lengh){
			possible = true;
		}
		return possible;
	}
	/**
	 * 功能：判断数组的某段序列是不是某棵二叉搜索树的后续遍历序列
	 * @param arr 给定数组
	 * @param begin 开始元素位置
	 * @param end  结束元素位置
	 * @return true or false
	 */
	public static boolean verifySquenceOfBST(int[] arr, int begin, int end){
		if(arr == null || arr.length == 0 || begin < 0 || end > arr.length 
				|| begin > end){
			return false;
		}
		int root = arr[end];
		
		//在二叉搜索树中左子数的节点小于根节点
		int flag = begin;  //注意：一定都要用begin初始化，因为下面的for可能一次都没执行
		for(int i = begin; i < end; i++){
			if(arr[i] > root){
				flag = i;
				break;
			}
		}
		
		//在二叉搜索树中右子数的节点小于根节点
		for(int j = flag; j < end; j++){
			if(arr[j] < root){
				return false;
			}
		} 
		//判断左子树是不是二叉搜素树
		boolean left= true;
		if(flag > begin){
			left = verifySquenceOfBST(arr, begin, flag - 1);
		}
		//判断右子树是不是二叉搜素树
		boolean right= true;
		if(flag < end - 1){
			right = verifySquenceOfBST(arr, flag, end - 1);
		}	
		return left && right;
	}
	/**
	 * 功能：求二叉树所有节点上值的和 
	 * @param root 根节点
	 * @return 和
	 */
	public static int treeSum(TreeNode root){
		if(root == null){
			return 0;
		}
		//System.out.println(root.value);
		int sum = root.value;
		sum += treeSum(root.left);
		sum += treeSum(root.right);
//		if(root.left != null){
//			sum += pathSum(root.left);
//		}
//		if(root.right != null){
//			sum += pathSum(root.right);
//		}
		return sum;
	}
	/**
	 * 功能：打印出所有叶节点的路径和，并返回所有节点值的和
	 * @param root 根节点
	 * @param currentSum 当前节点的路径和
	 * @return 二叉树中所有节点值的和
	 */
	public static int pathSum(TreeNode root, int currentSum){
		if(root == null){
			return 0;
		}
		//System.out.println(root.value);
		int sum = root.value + currentSum;
		//判断当前节点 是否是叶子节点
		if(root.left == null && root.right == null){
			System.out.println("叶子节点"+root.value+"的路径和为："+sum);
		}
		int left = 0;
		int right = 0;
		if(root.left != null){
			left= pathSum(root.left, sum);
		}
		if(root.right != null){
			right = pathSum(root.right, sum);
		}	
		return left + right + root.value;
	}
	/**
	 * 功能：找到满足条件的路径，打印出所有根节点到叶节点的路径，并返回所有节点值的和
	 * @param root 根结点
	 * @param currentSum 当前结点的路径和
	 * @param expectedSum 指定路径和
	 * @param stack 辅助栈，存放树中结点
	 * @return 所有结点路径和
	 */
	public static int findPath(TreeNode root, int currentSum, int expectedSum, Stack<Integer> stack){
		if(root == null){
			return 0;
		}
		stack.push(root.value);  //将当前节点放入队列
		int sum = root.value + currentSum;
		//判断当前节点 是否是叶子节点
		if(root.left == null && root.right == null && sum == expectedSum){
			System.out.println("叶子节点"+root.value+"的路径和为："+sum);
			System.out.println(stack.toString());
		}
		int left = 0;
		int right = 0;
		if(root.left != null){
			left= findPath(root.left, sum, expectedSum, stack);
		}
		if(root.right != null){
			right = findPath(root.right, sum, expectedSum, stack);
		}
		stack.pop();  //在返回到父结点之前，删除队列中的当前结点
		return left + right + root.value;
	}
	/**
	 * 功能：将二叉搜索树转换成双向链表，使结点依次从小到大排列
	 * @param root 根节点
	 * @return 链表头结点(即最小值结点)
	 */
	public static TreeNode convertBinarySearchTreeToDoubleLinkedList(TreeNode root){
		if(root == null){
			return null;
		}
		TreeNode result = convertNode(root);
		if(flag == false){
			flag = true;
			throw new IllegalArgumentException("invalid parameter");
		}else{
			return result.left;
		}
	}
	/**
	 * 功能：将二叉搜索树转换成双向链表，使结点依次从小到大排列
	 * @param root 根节点
	 * @return 一个树节点(相当于头指针)，他的左指针指向链表的头结点，右指针指向链表尾结点
	 */
	public static TreeNode convertNode(TreeNode root){
		if(root == null){
			return new TreeNode(0, null, null);
		}		
		//返回结点，左、右结点记录二叉搜索树转换成双向链表后的最小值结点和最大值结点
		TreeNode result = new TreeNode(0, null, null);
		//临时结点，获得子结点转换成双向链表后的返回值
		TreeNode temp = new TreeNode(0, null, null);
		//若有左子树，则处理左子结点
		if(root.left != null){
			 temp = convertNode(root.left); //获得左子树返回值
			 result.left = temp.left;       //设置返回结点左指针指向左子树最小值结点
			//以下两部将左子树与根结点链接起来
			 root.left = temp.right;		//设置根节点的左指针指向左子树的最大值结点
//			 if(temp.right.value > root.value){
//				 flag = false;
//			 }
			 temp.right.right = root; 		//将左子树中最大值结点右指针指向根节点
		}else{
			result.left = root; 			//若没有左子树，则将返回结点左指针指向根节点
		}
		
		//若有右子树，则处理右子结点
		if(root.right != null){
			 temp = convertNode(root.right);//获得右子树返回值
			 result.right = temp.right;		//设置返回结点右指针指向右子树最大值结点
			 //以下两部将根结点与右子树链接起来
			 root.right = temp.left;		//设置根节点的右指针指向右子树的最小值结点
//			 if(temp.left.value < root.value){
//				 flag = false;
//			 }
			 temp.left.left = root; 		//将右子树中最小值结点左指针指向根节点
		}else{
			result.right = root;
		}
		return result;
	}
	/**
	 * 功能：打印树节点双向链表(头结点开始，从左往右；尾节点开始，从右往左)
	 * @param root 开始结点
	 * @param str 打印顺序
	 */	
	public static void printTreeNode(TreeNode root, String str){
		if(root == null){
			return;
		}
		int flag = root.value;
		System.out.print(root.value + "\t");
		if("LeftToRight" == str){
			root = root.right;
		}else if("RightToLeft" == str){
			root = root.left;
		}else{
			return;
		}	
		while(root != null){
			System.out.print(root.value + "\t");
			if("LeftToRight" == str){
				root = root.right;
			}else if("RightToLeft" == str){
				root = root.left;
			}else{
				break;
			}		
		}
		System.out.println();
	}
	/**
	 * 功能：字符串的排列
	 * @param str 指定字符串数组(可以有重复字符)
	 * @param num 排列中不同字符的个数
	 * @return 数组，该数组记录了str字符串中选取num个不同字符组成排列的所有情况
	 */
	public static void alphabetPermutation(String str, int num){
		if(str == null || str.length() == 0 || num <= 0 || num > str.length()){
			return;
		}
		char[] arr1 = str.toCharArray();
		char[] arr2 = removeRepeatedChar2(arr1);
		System.out.println(Arrays.toString(arr2));
 		System.out.println(Arrays.toString(alphabetPermutation(arr2, num)));
	}
	/**
	 * 功能：字符数组的排列
	 * @param str 指定字符数组(元素不重复)
	 * @param num 排列中字符的个数
	 * @return 数组，该数组记录了str字符数组中选取num个字符组成排列的所有情况
	 */
	public static String[] alphabetPermutation(char[] str, int num){
		if(str == null || str.length == 0 || num <= 0 || num > str.length){
			return null;
		}
		if(num  == 1){
			String[] result = new String[str.length];
			for(int i = 0; i < str.length; i++){
				result[i] = str[i] + "";
			}
			return result;
		}
		String[] temp = alphabetPermutation(str, num - 1); // 从begin+1开始所有的排列
		System.out.println(Arrays.toString(temp));
		
		int size = A(str.length, temp[0].length() + 1);		//n个字符选取m个组成的排序列数
		String[] result = new String[size]; 				//新建数组存放从begin开始的所有排列，排列数目等于A(n,m)
		int count = 0;										//每找到一个符合条件的就把它放到result数组中
		for(int i = 0; i < str.length; i++){
			for(int j = 0; j < temp.length; j++)
			{
				if(temp[j].indexOf(str[i]) == -1){
					result[count++] = str[i] + temp[j];
				}
			}
		}
		return result; 
	}
	/**
	 * 功能：去掉字符数组中重复的字符
	 * @param str 字符数组
	 * @return 去掉字符数组中重复的字符后的数组
	 */
	public static char[] removeRepeatedChar(char[] str){
		if(str == null || str.length == 0){
			return null;
		}
		HashSet<Character> set = new HashSet<Character>();
		for(int i = 0; i < str.length; i++){
			set.add(str[i]);
		}
		char[] arr = new char[set.size()];
		int i= 0;
		Iterator<Character> iterator = set.iterator();
		while(iterator.hasNext()){
			arr[i] = (Character) iterator.next();
			i++;
		}
		return arr;
	}
	/**
	 * 功能：去掉字符数组中重复的字符
	 * @param str 字符数组
	 * @return 去掉字符数组中重复的字符后的数组
	 */
	public static char[] removeRepeatedChar2(char[] str){
		if(str == null || str.length == 0){
			return null;
		}
		Arrays.sort(str);
		StringBuilder sb = new StringBuilder();
		sb.append(str[0]);
		char ch = str[0];
		for(int i = 1; i < str.length; i++){
			if(str[i] != ch){
				sb.append(str[i]);
				ch = str[i];
			}
		}
		return sb.toString().toCharArray();
	}
	/**
	 * 功能：计算排列数量
	 * @param n 元素总数
	 * @param m 参与排列的元素个数
	 * @return 排列数量
	 */
	public static int A(int n, int m){
		if(n < 0 || m < 0 || n < m){
			return 0;
		}		
		if(m > 1){
			return A(n, m-1) * (n-m+1);
		}else if(m == 1){
			return n;
		}else{
			return 1;
		}
	}
	/**
	 * 功能：字符串的排列
	 * @param str 指定字符串数组(可以有重复字符)
	 * @param num 排列中不同字符的个数
	 * @return 数组，该数组记录了str字符串中选取num个不同字符组成排列的所有情况
	 */
	public static void alphabetPermutation2(String str){
		if(str == null || str.length() == 0){
			return;
		}
		if(str.length() == 1){
			System.out.println(str);
		}
		StringBuilder sb = new StringBuilder();
		char[] temp = str.toCharArray();
		temp = removeRepeatedChar2(temp);
		sb.append(temp);
		alphabetPermutation2(sb, 0);
	}
	public static void alphabetPermutation2(StringBuilder sb, int begin){
		if(sb == null || sb.length() == 0 || sb.toString().isEmpty()){
			return ;
		}
		if(begin == sb.length() && isMeetEightQueens(sb.toString())){
			System.out.println(sb);
			Count++;
			return;
		}
		for(int i = begin; i < sb.length(); i++){
			//将字符串中第begin个字符与其后面的字符依次交换(包括自己)
			char temp = sb.charAt(i);
			sb.setCharAt(i, sb.charAt(begin));
			sb.setCharAt(begin, temp);
			//将字符串中第begin+1个字符与其后面的字符依次交换(包括自己)
			alphabetPermutation2(sb, begin + 1);
			//向上层回溯时将字符换回来
			temp = sb.charAt(i);			
			sb.setCharAt(i, sb.charAt(begin));
			sb.setCharAt(begin, temp);
		}
		//System.out.println(sb);
	}
	
	public static boolean isMeetEightQueens(String str){
		if(str == null || str.length() == 0 || str.length() >= 10){
			return false;
		}
		char[] arr = str.toCharArray();
		int length = arr.length;
		for(int i = 0; i < length; i++){
			for(int j = 0; j < length; j++){
				if((i != j) && ((i - j == arr[i] - arr[j]) || (j - i == arr[i] - arr[j]))){
					return false;
				}
			}
		}
		return true;
	}
	public static String[] eightQueens(int num){
		if(num <= 0){
			return null;
		}
		if(num >= 10){
			return null;
		}
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < num; i++){
			sb.append(i);
		}
		return null;
	}

	public static String strTransform(String str){
		if(null == str || 0 == str.length()){
			return str;
		}
		int length = str.length();
		char[] arr = str.toCharArray();
		int count = 1; //记录元素重复次数
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i < length; i++){
			if(arr[i] == arr[i-1]){
				count++;
			}else if(1 == count){
				sb.append(arr[i-1]);
			}else{
				sb.append(arr[i-1]);
				sb.append((char)(count + '0'));
				count = 1;
			}
		}
		sb.append(arr[length-1]);
		if(1 != count){			
			sb.append((char)(count + '0'));
		}
		return sb.toString();
	}
	
	public static int[] moveElement(int[] arr){
		if(null == arr || 0 == arr.length){
			return arr;
		}
		int length = arr.length;
		int begin = 0;
		int end = length-1;
		while(begin < end){
			while((begin&1) == 1){
				begin++;
			}
			while((end&1) == 0){
				end--;
			}
			if(begin < end){
				System.out.println("begin:"+begin+"\t"+"end:"+end);
				int temp = arr[begin];
				arr[begin] = arr[end];
				arr[end] = temp;
				begin++;
				end--;
			}
		}
		return arr;
	}
}
class ListNode{
	int value;
	ListNode next;
	public ListNode(int value,ListNode next) {
		this.value = value;
		this.next = next;
	}
}
class TreeNode{
	int value;
	TreeNode left;
	TreeNode right;
	public TreeNode(int value,TreeNode left,TreeNode right) {
		this.value = value;
		this.left = left;
		this.right = right;
	}	
	public String toString(){
		if(this == null){
			return "[]";
		}
		String result = "";
		result +=  value;
		if(left != null){
			result += left.toString();
		}
		//result +=  value;
		if(right != null){
			result += right.toString();
		}
		//result +=  value;
		return result;
	}
	public void print(){
		if(this == null){
			return;
		}
		System.out.print(value+"\t");
		if(left != null){
			left.print();
		}
		//System.out.print(value+"\t");
		if(right != null){
			right.print();
		}
		//System.out.print(value+"\t");
	}
	public void printBreadthFirstTraversal() {
		if(this == null){
			return ;
		}
		Deque<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(this);
		while(queue.size() > 0){
			
			System.out.print(queue.remove().value + "\t");
			if(this.left != null){
				queue.offer(this.left);
			}
			if(this.right != null){
				queue.offer(this.right);
			}
			break;
		}
	}
	public int size(){
		if(this == null){
			return 0;
		}
		int size = 1;
		if(left != null){
			size += left.size();
		}
		if(right != null){
			size += right.size();
		}
		return size;
	}
}
enum Print{
	LeftToRight(0),RightToLeft(1);
	
	private int method;
	private Print(int i){
		this.method = i;
	}
	public String toString() {
        return String.valueOf(this.method);
    }
}
