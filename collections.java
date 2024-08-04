public class collections {
    // Collections Framework:
    // the java collects framework is a set of interfaces and classes
    // in the package java.util and java .util.concurrent. They provide
    // client programs with various models of how to organize their
    // objects, a various implementations of each model.

    // these models are sometimes called abstract data types, and we need
    // them because different programs need different ways of organizing
    // their objects.

    // Example:
    // in one situation, you might want to organize your programs objects
    // in a sequential list because their ordering is important and there
    // are duplicates. in another, a set might be the right data type
    // because now ordering is unimportant, and you want to discard the
    // duplicates.

    // these two data types(and others) are represented by different
    // interfaces in the Collections Framework,


    // Example 2:
    // a linked list may be better than an array implementation of lists
    // for inserting and removing elements from the middle, but much
    // worse for random access.

    // so choosing the right implementation for your program involves
    // knowing how it will be used as well as what is available.


    // COLLECTIONS:
    // 1.Iterable(java.lang) <-- 2.Collection(java.util) <--| 2.1 List(java.util)
    //                                                      | 2.2 Queue(java.util) <-- 2.2.1 Deque(java.util)
    //                                                      | 2.3 Set(java.util)   <-- 2.3.1 SortedSet(java.util) <-- 2.3.1.1 NavigableSet(java.util)

    // 1. Iterable: Allows implementing an object to be the target of "for-each loop" statement
    // 2. Collection: Represent a group of objects/elements. The root interface in collection framework
    // 2.1 List: Maintain elements in insertion order, may contain duplicate elements, may have multiple nulls
    // 2.2 Queue: Holds elements prior to processing. Typically, but not necessarily hold elements in FIFO. Two groups of methods: one which throws exception and other either return null or false or failure.
    // 2.3 Set: doesn't allow duplicate elements. May contain at most one null.
    // 2.2.1 Deque: Allows element insertion and removal at both ends. Short for "double ended queue". Pronounced 'deck'. Supports capacity-restricted dequeue as well
    // 2.3.1 SortedSet: Elements are ordered using their natural ordering, or by a provided Comparator.
    // 2.3.1.1 NavigableSet: May be accessed and traversed in either ascending or descending order. Methods reporting the closest matches for given search targets.
}
