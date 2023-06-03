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
		d.find2and3digit();
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