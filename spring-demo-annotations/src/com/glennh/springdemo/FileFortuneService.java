package com.glennh.springdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService {
	private List<String> fortunes = new ArrayList<String>();
	private Random random = new Random();
	
	@PostConstruct
	public void readFortunesFile() throws IOException {
		Path srcDir = Paths.get("src");
		File fortuneFile = new File(srcDir.toString() + "\\fortunes.txt");
		BufferedReader br = new BufferedReader(new FileReader(fortuneFile));
		String line = "";
		while ((line = br.readLine()) != null) {
			this.fortunes.add(line);
		}
		br.close();
	}

	@Override
	public String getFortune() {
		return this.fortunes.get(this.random.nextInt(this.fortunes.size() -1));
	}

}
