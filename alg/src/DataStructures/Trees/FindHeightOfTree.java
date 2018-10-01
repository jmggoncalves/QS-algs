package DataStructures.Trees;

/**
 *
 * @author Varun Upadhyay (https://github.com/varunu28)
 *
 */
import java.util.LinkedList;

public class FindHeightOfTree {

    // Driver Program
    public static void main(String[] args) {
        Node tree = new Node(5);
        

        // A level order representation of the tree
        //tree.printLevelOrder();
        System.out.println();

        System.out.println("Height of the tree is: ");
    }
}

/**
 * The Node class which initializes a Node of a tree
 * printLevelOrder: ROOT -> ROOT's CHILDREN -> ROOT's CHILDREN's CHILDREN -> etc
 * findHeight: Returns the height of the tree i.e. the number of links between root and farthest leaf
 */


