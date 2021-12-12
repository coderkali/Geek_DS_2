package com.geeks.ds.files;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;



public class FileCopyExample {

	private static final String SRC_FILE = "c:/temp/testoriginal.txt";
	private static final String DEST_FILE = "c:/temp/testcopied.txt";

	public static void main(String[] args) {
		//File source = new File(Paths.get("/Users/kpadhi/Documents/Github Project/Geek_DS2/src/main/java/com/geeks/ds/files/source/source.txt").toFile().getAbsolutePath());
		File source = new File("/Users/kpadhi/Documents/Github Project/Geek_DS2/src/main/java/com/geeks/ds/files/source/source.txt/");
		//File dest = new File(Paths.get("/destination").toFile().getAbsolutePath());
		File dest = new File("/Users/kpadhi/Documents/Github Project/Geek_DS2/src/main/java/com/geeks/ds/files/destination");
		try {
			FileUtils.copyFileToDirectory(source, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

//	private static void fileCopyUsingApacheCommons() throws IOException
//	{
//	    File fileToCopy = new File(SRC_FILE);
//	    File newFile = new File(DEST_FILE);
//
//	    FileUtils.copyFile(fileToCopy, newFile);
//
//	    // OR
//
//	    try(FileInputStream inputStream = new FileInputStream(fileToCopy);
//				FileOutputStream outputStream = new FileOutputStream(newFile))
//		{
//	    	IOUtils.copy(inputStream, outputStream);
//		}
//	}

	private static void fileCopyUsingNIOFilesClass() throws IOException {
		Path source = Paths.get(SRC_FILE);
		Path destination = Paths.get(DEST_FILE);

		Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);
	}

	private static void fileCopyUsingNIOChannelClass() throws IOException {
		File fileToCopy = new File(SRC_FILE);
		File newFile = new File(DEST_FILE);

		try (FileInputStream inputStream = new FileInputStream(fileToCopy);
			 FileOutputStream outputStream = new FileOutputStream(newFile)) {
			FileChannel inChannel = inputStream.getChannel();
			FileChannel outChannel = outputStream.getChannel();
			inChannel.transferTo(0, fileToCopy.length(), outChannel);
		}
	}
}
	
//	void fileCopyUsingGuava() throws IOException
//	{
//		File fileToCopy = new File(SRC_FILE);
//		File newFile = new File(DEST_FILE);
//
//		com.google.common.io.Files.copy(fileToCopy, newFile);
//	}