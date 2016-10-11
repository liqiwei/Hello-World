import java.io.*;
import java.util.*;

public class Analysis {

		public static void main(String[]args) throws FileNotFoundException {
			int word_count = 0;
			int sentences = 0;
			String entire = "";
			Scanner speech = new Scanner(new File("cubanmissle.txt"));
			while(speech.hasNext()) {
				String word = speech.next();
				word_count++; 
				entire+=word;

				}
			for (int i = 0; i< entire.length(); i++) {
				if (entire.charAt(i)=='.'||entire.charAt(i)=='!'|| entire.charAt(i)=='?'){
					sentences++;  }
			//insert next part here, finding the most used words 

			}
			
			

			System.out.println("This document contains "+word_count+" words and "+sentences+" sentences.");
			double average = word_count/sentences;
			System.out.println("On average, there's "+average+" words per sentence.");

			
			
			
		}

	}

