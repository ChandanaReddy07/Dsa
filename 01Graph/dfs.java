public void  dfs(int node,boolean vis[],ArrayList<ArrayList<Integer>> adj,ArrayList<Integer> storeDfs){
  storeDfs.add(node);
    vis[node]= true;
    for(Integer it: adj.get(node)){
        if(vis[it]==false){
            dfs(it,vis,adj,storeDfs);
        }
    }
}

public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj){

    ArrayList<Integer> storeDfs=new ArrayList<>();
    boolean vis[]= new boolean[V+1];

    for(int i=1;i<=V;i++){
        if(vis[i]==0){
            dfs(i,vis,adj,storeDfs);
        }
    }

    return storeDfs;
}