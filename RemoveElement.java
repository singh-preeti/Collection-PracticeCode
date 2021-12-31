package com.polymath;

import java.util.ArrayList;
import java.util.List;

public class RemoveElement {

	public static void main(String[] args) {
		List<String> langauageProgram = new ArrayList<>();
		langauageProgram.add("python");
		langauageProgram.add("C");
		langauageProgram.add("C++");
		langauageProgram.add("Java");
		langauageProgram.add("Kotlin");
		langauageProgram.add("Perl");
		
		System.out.println(langauageProgram);
		
		
		langauageProgram.remove(3);
		
		System.out.println(langauageProgram);
	}
}
