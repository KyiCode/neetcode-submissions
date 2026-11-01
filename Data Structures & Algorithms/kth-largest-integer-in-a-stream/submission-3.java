class KthLargest {

    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        for (int num : nums) {
            add(num);
        }

    }
    
    public int add(int val) {
        if (minHeap.size() < k) {
            minHeap.add(val);
            return minHeap.peek();
        } 

        maxHeap.add(val);
        if (maxHeap.peek() > minHeap.peek()) {
            int fromMax = maxHeap.poll();
            int fromMin = minHeap.poll();

            maxHeap.add(fromMin);
            minHeap.add(fromMax);
        }

        return minHeap.peek();



    }
}
