package DataStructures.Trees;

import java.util.LinkedList;

/**
*
* @author Varun Upadhyay (https://github.com/varunu28)
*
*/


// Driver Program
public class TreeTraversal {
    public static void main(String[] args) {
        Node tree = new Node(5);
        

        // Prints 5 3 2 4 7 6 8
        System.out.println("Pre order traversal:");
        //tree.printPreOrder();
        System.out.println();
        // Prints 2 3 4 5 6 7 8
        System.out.println("In order traversal:");
        //tree.printInOrder();
        System.out.println();
        // Prints 2 4 3 6 8 7 5
        System.out.println("Post order traversal:");
        //tree.printPostOrder();
        System.out.println();
        // Prints 5 3 7 2 4 6 8
        System.out.println("Level order traversal:");
        //tree.printLevelOrder();
        System.out.println();
    }
}

/**
* The Node class which initializes a Node of a tree
* Consists of all 4 traversal methods: printInOrder, printPostOrder， printPreOrder & printLevelOrder
* printInOrder: LEFT -> ROOT -> RIGHT
* printPreOrder: ROOT -> LEFT -> RIGHT
* printPostOrder: LEFT -> RIGHT -> ROOT
* printLevelOrder: Prints by level (starting at root), from left to right.
*/

