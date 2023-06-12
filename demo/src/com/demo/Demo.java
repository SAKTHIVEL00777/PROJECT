package com.demo;

public class Demo {
	
	int bb=150;
	static String village="sengai";
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("HELLO");
		Demo d=new Demo();
		//d.variable();
		//d.viwol();
		//d.find2and3digit();
		//d.reverse();
		//d.sort();
		d.equalSum();
	}
	private void equalSum() {
		// TODO Auto-generated method stub
		int ar[]={3,4,6,7,8};
		int target=10;
		for(int i=0;i<ar.length;i++){
			
			for(int j=i+1;j<ar.length;j++){
				if(ar[i]+ar[j]==target){
					System.out.println("("+ar[i]+","+ar[j]+")");
				}
			}
		}
		
	}
	private void sort() {
		// TODO Auto-generated method stub
		int[] c={4,2,9,5,7};
		for(int i=0;i<c.length;i++){
			int temp=0;
			for(int k=1;k<c.length;k++){
				if(c[k-1]>c[k]){
					temp=c[k-1];
					c[k-1]=c[k];
					c[k]=temp;
				}
			}
		}
		System.out.println();
		System.out.println("ASCENDING ORDER");
		for(int i=0;i<c.length;i++){
			System.out.print(c[i]+" ");
		}
		
	}
	private void reverse() {
		// TODO Auto-generated method stub
		String name="I am an Indian.";
		for(int i=name.length()-1;i>=0;i--){
			System.out.print(name.charAt(i));
		}
	}
	private void find2and3digit() {
		// TODO Auto-generated method stub
		int arr[]={101, 422, 33, 441, 572, 163, 770, 782, 499, 500};
		int count=0;
		for(int i=0;i<arr.length;i++){
			
			if(arr[i]%10==2){
				System.out.print(arr[i]+" ");
				count++;
			}
			
		}
		System.out.print(" count="+count+" ");
		System.out.println();
		count=0;
		for(int i=0;i<arr.length;i++){
			 if(arr[i]%10==3){
				System.out.print(arr[i]+" ");
				count++;
			}
			
		}
		System.out.print(" count="+count+" ");
	}
	private void viwol() {
		// TODO Auto-generated method stub
		//a=@, e=$, i=&, o=%, u=#
		String name="Hello Qantler";
		String word="";
		char ch[]=name.toCharArray();
		for(int i=0;i<name.length();i++){
			if(name.charAt(i)=='a'){
				word+='@';
			}
			else if(name.charAt(i)=='e'){
				word+='$';
			}
			else if(name.charAt(i)=='i'){
				word+='&';
			}
			else if(name.charAt(i)=='o'){
				word+='%';
			}
			else if(name.charAt(i)=='u'){
				word+='#';
			}
			else{
				word+=ch[i];
			}
		}
		System.out.println(word);
		}
	private void variable() {
		// TODO Auto-generated method stub
		int a=25;
	    String name="ABD";
	    Boolean boo=true;
	    Float f=523.5f;
	    Double d=9856d;
	    long set=987654093;
	    Character let='c';
	    
		System.out.println(a);
		System.out.println(bb);
		System.out.println(village);
        System.out.println(name);
        System.out.println(boo);
        System.out.println(f);
        System.out.println(d);
        System.out.println(set);
        System.out.println(let);

		
		
	}

}