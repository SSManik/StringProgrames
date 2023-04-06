package StringProgrames;
 public class DuplicateString {
	public static void main(String[] args) {
	  String name="manikandan";
	  int count=0;
	  for(int i=0;i<name.length();i++){
		  if(name.charAt(i)=='a'){
             count++;			  
		  }
	    }
	  System.out.println("Duplicate count of : "+ count);
	}
 }
