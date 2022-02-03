package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Counting implements ICounting {

	@Override
	public List<String> counting(Map<String, Integer> symptoms, List<String> listeSymptomsBrute) {
		
		List<String> listeSymptoms = new ArrayList<>();
		for (String line : listeSymptomsBrute) {
	       if(symptoms.containsKey(line))
			symptoms.put(line,symptoms.get(line)+1);
	       else {
	    	symptoms.put(line,1);
	       listeSymptoms.add(line);
	       }
		}
		
		// next generate output
		Collections.sort(listeSymptoms);
		return listeSymptoms;
	}

}
