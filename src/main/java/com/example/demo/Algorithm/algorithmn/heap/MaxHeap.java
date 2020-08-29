package com.example.demo.Algorithm.algorithmn.heap;

/**
 * @author Geonguk Han
 * @since 2020-08-03
 */
public class MaxHeap {
    private int[] heap;
    private int size;
    private int maxSize;

    public MaxHeap(int maxSize) {
        this.maxSize = maxSize;
        this.size = 0;
        this.heap = new int[maxSize + 1];
        heap[0] = Integer.MAX_VALUE;
    }

    private boolean isLeaf(int pos) {
        if (pos >= (size / 2) && pos <= size) {
            return true;
        }
        return false;
    }

    public int leftChild(int position) {
        return (2 * position);
    }

    public int rightChild(int position) {
        return (2 * position) + 1;
    }

    public int parent(int position) {
        return position / 2;
    }

    public void swap(int fpos, int spos) {
        int temp;
        temp = heap[fpos];
        heap[fpos] = heap[spos];
        heap[spos] = temp;
    }

    public void maxHeapify(int pos) {
        if (isLeaf(pos)) {
            return;
        }

        if (heap[pos] < heap[leftChild(pos)] || heap[pos] < heap[rightChild(pos)]) {
            if (heap[leftChild(pos)] < heap[rightChild(pos)]) {
                swap(heap[pos], heap[rightChild(pos)]);
                maxHeapify(heap[rightChild(pos)]);
            } else {
                swap(heap[pos], heap[leftChild(pos)]);
                maxHeapify(heap[leftChild(pos)]);
            }
        }
    }

    public void insert(int element) {
        heap[++size] = element;
        int current = size;
        while (heap[current] > heap[parent(current)]) {
            swap(heap[current], heap[parent(current)]);
            current = parent(current);
        }
    }

    public int getMax() {
        return heap[0];
    }

    public void print() {
        for (int i = 1; i <= size / 2; i++) {
            System.out.print(" PARENT : " +
                    heap[i] + " LEFT CHILD : " +
                    heap[2 * i] + " RIGHT CHILD :" + heap[2 * i + 1]);
            System.out.println();
        }
    }

    public static void main(String[] args) {

        System.out.println("The Max Heap is ");
        MaxHeap maxHeap = new MaxHeap(15);
        maxHeap.insert(5);
        maxHeap.insert(3);
        maxHeap.insert(17);
        maxHeap.insert(10);
        maxHeap.insert(84);
        maxHeap.insert(19);
        maxHeap.insert(6);
        maxHeap.insert(22);
        maxHeap.insert(9);


        maxHeap.print();

    }
}
