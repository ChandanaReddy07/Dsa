
public static void Bfs(int s){

    boolean visited[] = new boolean(V);

    //make queue
    LinkedList<Integer> queue= new LinkedList<>();

    queue.add(s);
    visited[0]=true;

    while(queue.size()!=0){

        int p=queue.pop();//dequeue

        System.out.println(p);

        Iterator<Integer> it = graph[p].listIterator();// iterate through the ll

        while(it.hasNext){
            int n =it.next();
            if(!visited[n]){
                queue.add(n);
                visited[n]=true;

            }
        }
  
    }


}