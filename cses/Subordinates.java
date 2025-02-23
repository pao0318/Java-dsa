//package org.example;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;



public class Main {
    static final int MAXN = 200005;
    static List<Integer>[] adj = new ArrayList[MAXN];
    static int[] subordinates = new int[MAXN];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [] arr= Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for(int i=1;i<=n;i++)
            adj[i] = new ArrayList<>();

        for(int i=0;i<n-1;i++){
            adj[arr[i]].add(i + 2);
        }
        dfs(1);
        for (int i = 1; i <= n; i++) {
            System.out.print(subordinates[i] + " ");
        }
        System.out.println();


    }

    public static void dfs(int node){
        for(int child:adj[node]){
            dfs(child);
            subordinates[node] += subordinates[child]+1;
        }
    }


}







//package org.example;
// import java.io.*;
// import java.util.*;

// public class Main {
//     static List<Integer>[] adj;
//     static int[] subordinates;

//     public static void main(String[] args) throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         StringBuilder sb = new StringBuilder();

//         int n = Integer.parseInt(br.readLine());
//         adj = new ArrayList[n + 1];
//         subordinates = new int[n + 1];

//         for (int i = 1; i <= n; i++) {
//             adj[i] = new ArrayList<>(2);  // Preallocate small initial size
//         }

//         StringTokenizer st = new StringTokenizer(br.readLine());
//         for (int i = 2; i <= n; i++) {
//             int parent = Integer.parseInt(st.nextToken());
//             adj[parent].add(i);
//         }

//         iterativeDFS(n);

//         for (int i = 1; i <= n; i++) {
//             sb.append(subordinates[i]).append(" ");
//         }

//         System.out.println(sb.toString());  // Fast output
//     }

//     public static void iterativeDFS(int n) {
//         Deque<Integer> stack = new ArrayDeque<>();
//         stack.push(1);

//         Deque<Boolean> visited = new ArrayDeque<>();
//         visited.push(false);

//         Map<Integer, Iterator<Integer>> iterators = new HashMap<>();

//         while (!stack.isEmpty()) {
//             int node = stack.peek();
//             boolean isVisited = visited.pop();

//             if (!isVisited) {
//                 visited.push(true);
//                 iterators.put(node, adj[node].iterator());

//                 for (int child : adj[node]) {
//                     stack.push(child);
//                     visited.push(false);
//                 }
//             } else {
//                 stack.pop();
//                 for (int child : adj[node]) {
//                     subordinates[node] += subordinates[child] + 1;
//                 }
//             }
//         }
//     }
// }
