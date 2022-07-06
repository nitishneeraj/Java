package String_Programs;

public class FrequencyCharacters {

	void Frequency_Characters() {
		String str = "Welcome tp digital world ";
		int fr[] = new int[str.length()];

		// Converts given ch into character array
		char ch[] = str.toCharArray();

		for (int i = 0; i < str.length(); i++) {
			fr[i] = 1;
			for (int j = i + 1; j < str.length(); j++) {
				if (ch[i] == ch[j]) {
					fr[i]++;
					// Set ch[j] to 0 to avoid printing visited character
					ch[j] = '0';
				}
			}
		}
		 //Displays the each character and their corresponding frequency    
        System.out.println("Characters and their corresponding frequencies");    
        for(int i = 0; i <fr.length; i++) {  
        	if(ch[i] != ' ' && ch[i] != '0') {
        		System.out.println(ch[i] + "-"+fr[i]);
        	}
        	
        }
    }
	
}
