package examples.vanita.programs;

public class TechgigGameConsole {
	 public static int combinationCounts(int level)
	    {
		    int combination = 0;
		    int total = 10;
		    char[][] consoleBox = new char[4][3];
		    boolean functional = true;
		    for(int i=1;i<=4;i++){
		    	for(int j=1;j<=3;j++){
		            if((i==4 && j==1) || (i==4 && j==3)){
		                functional = false;
		            }
		            if(functional) {
		            	   
		            }
		        }
		       
		    }
		    System.out.println("Answer :"+combination);
		    return combination;
	    }
/*	 public static int calculateCombinations(int n, int r) {
		 int c = 0;
		 int mult = getFatorial(n-r);
		 System.out.println("getFatorial(n)" +getFatorial(n));
		 System.out.println("getFatorial(n-r)" +getFatorial(n-r));
		 System.out.println("Math.multiplyExact((getFatorial(r)),mult) " +Math.multiplyExact((getFatorial(r)),mult));
		 c = (getFatorial(n) / (Math.multiplyExact((getFatorial(r)),mult)));
		 return c;
	 }
	 public static int getFatorial(int n) {
		 
		 if(n==1) {
			 return n;
		 } else {
			  return( n * getFatorial(n-1));
		 }
		 
	 }*/
	 
	 public static void main(String arg[]) {
		 System.out.println(combinationCounts(2));
	 }
}
