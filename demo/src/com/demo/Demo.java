package com.demo;

public class Demo {
	
	int bb=150;
	static String village="sengai";
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("HELLO");
		Demo d=new Demo();
		//d.variable();
		d.viwol();
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