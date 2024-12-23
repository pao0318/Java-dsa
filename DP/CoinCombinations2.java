//package com.example.demo;
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;


public class DemoApplication {
	static final int MOD = 1000000007;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// Read inputs

		String[] s = br.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int target = Integer.parseInt(s[1]);

		List<Integer> input = Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

		int[] combinations =  new int[target+1];
		combinations[0]=1;

		for(int i=0;i<n;i++){
			int idx = input.get(i);
			for(int j=1;j<=target;j++){
				if(j-idx>=0)
					combinations[j] = (combinations[j] + combinations[j-idx])%MOD;
			}
		}

		System.out.println(combinations[target]);


	}

