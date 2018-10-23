package tests.string;

public class getMaxLengthWord {

	public static void main(String[] args) {
	
		String sentence = "aaaa bbbb eeee ggggggg";
				
		sentence = sentence.replaceAll("[^a-zZ-Z1-9 ]", "");
		
		String[] words = sentence.split(" ");
		
		int maxLenght = 0;
		String maxWord = "";
	    
	    for(int i = 0; i < words.length; i++){
	    	String word = words[i];
	    	
	    	if( word.length() > maxLenght) {
	    		maxLenght = word.length(); 
	    		maxWord = word;
	    	}
	    }
	    
	    System.out.println(maxWord);
	    
	}
	
}
