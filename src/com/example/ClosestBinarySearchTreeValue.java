package com.example;

public class ClosestBinarySearchTreeValue {

    private double currentMin = Double.MAX_VALUE;
    private int currentMinNode = 0;

    public int closestValue(TreeNode root, double target) {

        if(root == null) {
            return currentMinNode;
        }

        double diff = root.val - target;
        if(Math.abs(diff) < currentMin) {
            currentMin = Math.abs(diff);
            currentMinNode = root.val;
        }

        if(diff == 0)
            return root.val;

        else if(diff > 0) {
            return closestValue(root.left, target);
        }
        else{
            return closestValue(root.right, target);
        }
    }

}


class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
}