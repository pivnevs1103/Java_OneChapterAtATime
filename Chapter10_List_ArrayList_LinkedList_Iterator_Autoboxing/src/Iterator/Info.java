package Iterator;

public class Info {
    /*
        - So far, I've mainly used for loops to traverse, or step through elements, in an array or list
        - I can use the traditional for loop and an index, to index into a list
        - I can also use the enhanced for loop and a collection, to step through the elements, one at a time

       BUT Java provides other means to traverse a list
       1. Iterator
       2. ListIterator

       ----- Iterator -----------------------------------------------
       - An iterator can be thought of as similar to a database cursor
       - The kind of cursor we are referring to here, can be described as on object, that allows traversal over records
       in a collection
       - When you get an instance of an iterator, you can call the next method, to get the next element in the list
       - You can used the hasNext method, to check if any elements remain to  be processed
       - In the code, you can see a while loop, which uses the iterators hasNext method, to determine if it should
       continue looping
       - In the loop, the next method is called and its value assigned to a local variable, and the local variable
       printed out

       WHAT IT DOES-----------------------
       - This would just print each element in the list, but do it through the iterator object
       - When an iterator is created, its cursor position is pointed at a position before the first element
       - The first call to the next method gets teh first element, and moves the cursor position, to be between the
       first and second element
       - Subsequent, calls to the next method moves the iterators position through the list, as shown, until there are
       no position left, meaning hasNext = false;
     */
}
