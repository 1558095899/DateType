package com.lzw;

public class Basic {
	public static  void main(String[] args) {
				int sum=0;
			for(int i=1;i<11;i++){
				if(i%2==0){
					sum+=i;
					i++;
				}
			}System.out.println(sum);
		}
	}
