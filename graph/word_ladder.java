class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        // add beginWord also to the wordlist.
    wordList.add(beginWord);
	
	// find the index of the endWord in the list if not present return 0
    int endWordIndex=-1;
    int i=0;
    for(i=0;i< wordList.size();i++){
        if(wordList.get(i).equals(endWord)){
            endWordIndex=i;
            break;
        }
    }
   
    if(endWordIndex==-1)return 0;
   
   //Construct undirected graph in adjacency list format by creating edge if there is only one change in character
    ArrayList<ArrayList<Integer>> g=new ArrayList<>();
    for(i=0;i< wordList.size();i++){
        g.add(new ArrayList<Integer>());
    }
    
    int stringSize=beginWord.length();
    for(i=0;i< wordList.size();i++){
        String s=wordList.get(i);
        for(int j=i+1;j< wordList.size();j++){
            String s1=wordList.get(j);
            int count=0;
            for(int k=0;k< stringSize; k++){
                if(s.charAt(k)==s1.charAt(k))count++;
            }
            if(count==stringSize-1){
                g.get(i).add(j);
                g.get(j).add(i);
            }
        }
    }
     
	 //perform BFS and maintain the distance in minDistance graph and when the endWord index is found in the BFS break and return the minDistance of it
    int[]minDistance=new int[wordList.size()];
    int[]visited=new int[wordList.size()];
    
    for(i=0;i< wordList.size();i++){
        minDistance[i]=Integer.MAX_VALUE;
    }
    
    minDistance[wordList.size()-1]=0;
    
    Queue<Integer> q=new LinkedList<>();
    q.add(wordList.size()-1);
    
    while(!q.isEmpty()){
        i=q.poll();
        for(int j: g.get(i)){
            if(visited[j]==0){
                if(j==endWordIndex){
                    return minDistance[i]+2;
                }
                else{
                   minDistance[j]= minDistance[i]+1;
                   visited[j]=1;
                   q.add(j);
                      }
            }            
        }
    }
    
   return 0;
    
    
}
}
