package tree;

import pojo.Node;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class HuffmanTree {


    // 前序遍历
    public static void preOrder(Node root){
        if (root != null){
            root.preOrder();
        }else{
            System.out.println("当前是个空数, 无法遍历");
        }
    }

    public static Node createHuffmanTree(int[] arr){
        List<Node> nodes = new ArrayList<>();

        for (int value: arr){
            nodes.add(new Node(value));
        }

        while(nodes.size()>1){
            Collections.sort(nodes);
            System.out.println("nodes= "+nodes);

            Node leftNode = nodes.get(0);
            Node rightNode = nodes.get(1);

            Node parat = new Node(leftNode.getValue() + rightNode.getValue());
            parat.setLeft(leftNode);
            parat.setRight(rightNode);

            nodes.remove(leftNode);
            nodes.remove(rightNode);

            nodes.add(parat);
        }

        return nodes.get(0);
    }

}
