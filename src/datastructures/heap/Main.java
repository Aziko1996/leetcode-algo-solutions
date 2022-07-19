package datastructures.heap;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        MinHeap minHeap = new MinHeap(6);
        minHeap.add(10);
        minHeap.add(8);
        minHeap.add(6);
        minHeap.add(4);
        minHeap.add(2);
        minHeap.add(0);

        System.out.println(Arrays.toString(minHeap.getAllElements()));
        minHeap.poll();
        System.out.println(Arrays.toString(minHeap.getAllElements()));

    }

}
