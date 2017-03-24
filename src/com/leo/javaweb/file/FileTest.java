package com.leo.javaweb.file;

import java.io.File;

import org.junit.Test;

public class FileTest {
	public static void main(String[] args) {
		//获取指定目录的文件，如果没有文件则创建.
        File f=new File("d:\\files", "a.txt");
        try {
			//f.createNewFile();
        	if(!f.exists()){
        		f.createNewFile();
        	}
        	System.out.println(f.length());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void mkdir(){
		File f=new File("d:\\files","aaa");
		f.mkdir();
	}
}
