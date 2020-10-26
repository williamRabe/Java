package assignment2;

public class PasswordGenerator {
	
// Member variables
	private String word1;
	private String word2;
	private String word3;
	private String word4;
	private String word5;
	private int n;
	
	private String phrase;
	private String pw = "";
	
	
// Methods
	public void setPhrase(
			String str1,
			String str2,
			String str3, 
			String str4,
			String str5)
	{
		this.phrase = str1 + " " + str2 + " " + str3 + " " + str4 + " " + str5;
	}
	
	public String getPhrase()
	{
				
		return this.phrase;
	}
	
	public void setN(int in) 
	{
		this.n = in;
	}
	
	public int getN()
	{
		return this.n;
	}
	
	public void setPassword() 
	{
		pw = (word1.length() < n) ? pw.concat(word1) : pw.concat(word1.substring(0, n)); 
		pw = (word2.length() < n) ? pw.concat(word2) : pw.concat(word2.substring(0, n));
		pw = (word3.length() < n) ? pw.concat(word3) : pw.concat(word3.substring(0, n));
		pw = (word4.length() < n) ? pw.concat(word4) : pw.concat(word4.substring(0, n));
		pw = (word5.length() < n) ? pw.concat(word5) : pw.concat(word5.substring(0, n));
	}
	public String getPassword() 
	{
		return this.pw;
	}
	
	public int getPasswordLength()
	{
		return this.pw.length();
	}
	
	// Constructors
	public PasswordGenerator(String str1, String str2, String str3, String str4, String str5, int in)
	{
		setN(in);
		
		this.word1 = str1;
		this.word2 = str2;
		this.word3 = str3;
		this.word4 = str4;
		this.word5 = str5;
		
		setPhrase(this.word1, this.word2, this.word3, this.word4, this.word5);
		setPassword();
	} 
}
