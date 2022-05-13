# test_assignment_andersen

### Requirements

JDK_17.0.3.1

### Execution

In order to execute program run command below using terminal/cmd:

*java Main.java p1 p2*

### Input

**p1** - number of assignment (1, 2 or 3);

**p2** - assignment input:

-   1st assignment: *number*

-   2nd assignment: *string*

-   3rd assignment: *string - numbers separated by ","*

### Use Cases


**input**: *java Main.java 1 8*, **expected output**: *Hello*

**input**: *java Main.java 1 Hello*, **expected output**: *1st assignment result: ERROR: Please provide a number.*

**input**: *java Main.java 2 Yulia*, **expected output**: *2nd assignment result: There is no such name.*

**input**: *java Main.java 2 Viacheslav*, **expected output**: *2nd assignment result: Hello, Viacheslav*

**input**: *java Main.java 3 1,2,3,4,5,6,7,8,9,10,11,12* , **expected output**: *3 6 9 12*


