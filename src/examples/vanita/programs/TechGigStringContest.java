package examples.vanita.programs;

public class TechGigStringContest {

	public static String orignial(String input1)
    {
		String res="";
		String output="";
		StringBuilder sbinput = new StringBuilder(input1);
	    //Write code here
	    int length = input1.length();
	    char[] dst = new char[length];
		int dstBegin = length/2;
	    if(length%2==0){
	        //even length
	        for(int i=0;i<sbinput.length();i++){
	        	
	        }
	        
	    } else {
	        //odd length
	         for(int i=0;i<sbinput.length();i++){
	        	 sbinput.getChars(i, dstBegin, dst, dstBegin);
	        	 sbinput = sbinput.deleteCharAt((i/2));
	        }
	         
	    }
	   output = String.valueOf(dst);
	    System.out.println(output.length() + "index" +output.indexOf("c"));
	    return output;
    }

	public static void main(String[] args) {
       System.out.println(orignial("cbdae"));
	}
}
