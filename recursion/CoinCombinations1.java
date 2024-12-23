package com.example.demo;
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


		int ways = solve(target,input);
		System.out.println(ways);
	}
	private static int solve(int target, List<Integer>input){
		if(target ==0)
			return 1;
		else if(target<0)
			return 0;

		int cnt = 0;

		for(int i=0;i<input.size();i++){
			cnt  = (cnt+ solve(target-input.get(i), input)) % MOD;
		}

		return cnt;
	}


