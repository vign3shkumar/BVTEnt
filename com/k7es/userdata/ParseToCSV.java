package com.k7es.userdata;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ParseToCSV {
	List<String> CSVlines;
	public ParseToCSV(String inputFile) throws IOException{
		String line = null;
		CSVlines = new ArrayList<String>();
		FileReader reader = new FileReader(inputFile);
		BufferedReader bReader = new BufferedReader(reader);
		while((line = bReader.readLine())!= null){
			CSVlines.add(line);
			}
	}
	
	public List<List<String>> readAll(){
		List<List<String>> paramsList = new ArrayList<List<String>>();
		for(String line: CSVlines){
			String[] lineParams = line.split(",");
			List<String> params = Arrays.asList(lineParams);
			paramsList.add(params);
		}
		return paramsList;
	}

}
