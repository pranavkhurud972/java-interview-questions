package interviewQuestions;

public class _4_RemoveZeroFromGivenNumber { 
	 
	 public static int removeZero(int number) {
	        String numberStr = String.valueOf(number);
	        String modifiedStr = numberStr.replaceAll("0", "");
	        return Integer.parseInt(modifiedStr);
	    }
	    public static void main(String[] args) { 
//	        int num=10203040; 
//	        String s=String.valueOf(num); 
//	        String ss=s.replaceAll("0+",""); 
//	        Integer res=Integer.parseInt(ss); 
//	        System.out.println(res); 
//	    }
   	        int number = 501203;
	    	        int result = removeZero(number);
	    	        System.out.println(result);  // Output: 5123
	    	    }
	    	}

	
