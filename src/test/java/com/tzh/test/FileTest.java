package com.tzh.test;

import java.io.File;

import org.junit.Test;

import com.tzh.utils.FileUtils;

public class FileTest {

	@Test
	public void testFile() {
		
		String suffixName = FileUtils.getSuffixName("F:\\专高一\\2019-09-小一\\git\\Git&GitHub.pdf");
		System.out.println(suffixName);
	}
	@Test
	public void testDelete() {
		//FileUtils.deleteFiles("D:\\workSpace\\08E");
		/*String homeDirectory = FileUtils.getWorkDirectory();
		System.out.println(homeDirectory);*/
		String fileSize = FileUtils.getFileSize("F:\\专高一\\2019-09-小一\\git\\Git&GitHub.pdf","M");		
		System.out.println(fileSize);
	}
}
