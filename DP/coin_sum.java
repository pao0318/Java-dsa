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

		int[] dp = new int[target+1];

		dp[0]=1;

		for(int i=1;i<=target;i++){
			for(int j=0;j<input.size();j++){
				if(i-input.get(j)>=0)
					dp[i]= (dp[i]+dp[i-input.get(j)])%MOD;
			}

		}
		System.out.println(dp[target]);



	}



