package StringProgrames;
 public class StringToNumber {
  public static void main(String[] args) {
	String phoneNo ="1234567890";
	long number=0;
	for(int i=0;i<phoneNo.length();i++){
      long no=phoneNo.charAt(i)-48;//48-->ascii value of 0
      number=(number*10)+no;
	}
      System.out.println(number);
	}

}
