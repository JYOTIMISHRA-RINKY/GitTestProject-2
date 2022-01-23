package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitDemoProj1Application {
String a="home";
Integer b=7;
Map<String,Object> map=new HashMap<>();
List<String> l=new ArrayList<>();
public static void main(String[] args) {
		SpringApplication.run(GitDemoProj1Application.class, args);
	}

}
