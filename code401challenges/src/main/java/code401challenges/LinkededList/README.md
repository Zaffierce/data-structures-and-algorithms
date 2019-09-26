# Create a LinkedList
Create a LinkedList that can be able to insert new values, check for duplicates and also print out entire LinkedList values.  

 # Methods
 * link.insert(int) - Inserts an integer into the LinkedList.
 * link.includes(int) - Checks the LinkedList to see if this value exists or not.
 * link.toString() - Prints out the entire LinkedList.
 * link.append(int) - Appends an integer to your LinkedList.
 * link.insertBefore(int insertValue, int newValue) - Inserts into LinkedList before your insertValue.  I.e. insertBefore(3, 88) would insert before the item with the value of 3 in your LL.
 * link.insertAfter(int insertValue, int newValue) - Inserts into LinkedList after your insertValue.  I.e. insertAfter(4, 99) would insert after the item with the value of 4 in your LL.
 * link.kthFromEnd(int k) - Returns the value k positions from the end, based on 0 index.  I.e. kthFromEnd(2) where your LL is [1][2][3][4][5]  would return 3.
 * link.insertHead(int) - Inserts a head value into the LinkedList.
 * LinkedList.mergeLists(LinkedList1, LinkedList2) - Takes two linked lists and zips them together.