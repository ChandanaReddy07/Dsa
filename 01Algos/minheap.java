 //basically we use priority queue to implement heap.
// the smallest element will be always on top


//here suppose i wanna get k th largest element ill pop the elements if size is grtr than k finally giving my ans on top



PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        
        for (int num: nums) {
            
            pq.add(num);
            
            if (pq.size() > k) {
                pq.poll();
            }
        }
        return pq.poll();    
    
    }


// for implementing max-heap we use
  PriorityQueue<Integer> pQueue
            = new PriorityQueue<Integer>(
                Collections.reverseOrder());
