package dsummary.skipgram;

import org.junit.Ignore;
import org.junit.Test;

public class FragmenterKSkipNgramTst {
	
	//System.out.println("here is a books");
	public static String sSent = " a b c d e f";
	public static String [] sSentArr = sSent.split(" ");
	public static int iSentenceLength = sSentArr.length;
	//System.out.println(sSent[0]);

	@Ignore
	@Test
    public void t1KSkipBiGrams() {
    	
    	// k-skip-n-gram
    	int iSkipLength = 2;
    	FragmenterKSkipNGram ksng = new FragmenterKSkipNGram(sSent); 
    	
    	for( int i=0; i< iSentenceLength; i++) {
    		for( int j=i+1; j< iSentenceLength; j++) {
    			if( (j-i) > iSkipLength ) {
					System.out.println( i + "," + j );
    			}
    		}
    	}
    	    
    }

	
	@Test
    public void t2KSkipTriGrams() {    	
    	
    }

	@Ignore
	@Test
    public void t3KSkipFourGrams() {
    	
    	    
    }        
    
}
