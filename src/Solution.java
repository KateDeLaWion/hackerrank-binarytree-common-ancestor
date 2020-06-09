import org.w3c.dom.Node;

public class Solution {

    //https://www.hackerrank.com/challenges/binary-search-tree-lowest-common-ancestor/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=trees


    public static Node lca(Node root, int v1, int v2) {
        // My code starts here.
        if ( v1<root.data && v2<root.data){
            // if v1 and v2 never separated and (either v1 or v2) = root.date, the last root returned will be submitted as answer.
            // an example is binary tree of 8,4,9,1,2,3,6,5.  Find the lowest common ancestor of 1 and 2. 
            return lca(root.left, v1, v2);
        }
        if ( v1>root.data && v2>root.data){
            // if v1 and v2 never separated and (either v1 or v2) = root.date, the last root returned will be submitted as answer.
            return lca(root.right, v1, v2 );
        }
         // Once v1 and v2 are separate, return that ancestor root.
        return root;
         // My code ends here.
    }



}
