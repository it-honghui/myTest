package com.wanghonghui.java.node;

public class NodeTest {

    // 创建一个树的节点
    // 每个node存放两个数据
    // 一个左node引用和一个右node引用
    class Node {
        public int iData;
        public double dData;
        public Node leftNode;
        public Node rightNode;

        // 显示树节点信息
        public void showNode() {
            System.out.println("{ " + iData + "," + dData + " }");
        }
    }

    private Node root;

    // 插入Node
    // 插入之前需要判断是否为null
    // 为null需要比较大小直到currentNode为null就插入
    public void insert(int iData, double dData) {
        // 创建node节点
        Node newNode = new Node();
        newNode.iData = iData;
        newNode.dData = dData;
        // 判断root node是否为null
        if (root == null) {
            root = newNode;
        } else {
            Node current = root;
            Node parent;
            while (true) {
                // 保存当current变为null之前的那一个父节点
                parent = current;
                if (iData < current.iData) {
                    // 插入左节点
                    current = current.leftNode;
                    // 不断向左node寻找是否为null
                    if (current == null) {
                        parent.leftNode = newNode;
                        return;
                    }
                } else {
                    // 插入右节点
                    current = current.rightNode;
                    if (current == null) {
                        parent.rightNode = newNode;
                        return;
                    }
                }
            }
        }
    }

    // 在tree中寻找关键字
    // 返回一个Node
    // 显示这个Node
    public Node find(int key) {
        Node current = root;
        while (current.iData != key) {
            if (current.iData > key) {
                current = current.leftNode;
            } else {
                current = current.rightNode;
            }
            if (current == null)
                return null;
        }
        return current;
    }

    // 查找树中的最大值和最小值
    // 最小值存在于一棵树的最下层的最左node
    // 最大值存在于一棵树的最下层的最右node
    public Node[] mVal() {
        Node minNode = null;
        Node maxNode = null;
        Node[] maxminVal = new Node[2];
        Node current = root;//从树的顶部开始搜索
        while (current != null) {
            minNode = current;
            current = current.leftNode;
        }
        maxminVal[0] = minNode;
        current = root;
        while (current != null) {
            maxNode = current;
            current = current.rightNode;
        }
        maxminVal[1] = maxNode;
        return maxminVal;
    }

    public static void main(String[] args) {
        NodeTest tree = new NodeTest();
        tree.insert(3, 3.333);
        tree.insert(1, 1.111);
        tree.insert(2, 2.222);
        tree.insert(4, 4.444);
        tree.insert(5, 5.555);
        tree.insert(6, 6.666);
        Node node = tree.find(3);
        if (node == null) {
            System.out.println("we can not find it");
        } else {
            node.showNode();
        }
        //查找tree中的最值
        Node[] temp = tree.mVal();
        temp[0].showNode();
        temp[1].showNode();
    }
}
