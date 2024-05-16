package LinkedList;

public class Info {

    /*
        LINKED LIST:
        - is not indexed
        - There is no array, storing the addresses in a neat ordered way, as we saw with the ArrayList
        - Instead, each element thats added to a linked list, forms a chain, and the chain has links to the previous
          and the next element.
        - Doubly Linked List: Meaning an element is linked to the next element, but its also linked to a previous
          element, in this chain of elements
        - The beginning of the chain is called the head of the list, and the end is called the tail
        - This can also be considered a queue,a double ended queue, because we can traverse both backwards and
          forwards, through these elements
        - To find an element, we'd need to start at the head of tail, and check if the element matches, or keep track
          of the number of elements traversed, if we are matching by an index, because the index isnt stored as part
          of the list
        - For example, even if you know, you want to find the 5th element, you would still have to traverse the chain
          this way, to get that fifth element
        - This type of retrieval is considered expensive in computer currency, which is processing time and memory usage
        - On the other hand, inserting and removing an element, is much simpler for this type of collection
        - In contrast to an ArrayList, inserting or removing an item in a LinkedList, is just a matter of breaking two
          links in the chain, and re-establishing two different links.
        - No new array  needs to be created, and elements do not need to be shifted
        - inserting and removing elements is considered cheap in computer currency, compared to ArrayList
          */
}
