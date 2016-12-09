package dsummary.skipgram;



public class FragmenterKSkipNGram {
	
	private String sSentence = "";
	
	private int iSentenceLength = sSentence.length();

	
	public FragmenterKSkipNGram(String _sSentence) {
		
		sSentence = _sSentence;
		iSentenceLength = sSentence.length();		
	}
	
	public static void getIdxKSkipBiGrams(int _sentLen, int _skipLen ) {		
    	
    	for( int i=0; i< _sentLen; i++) {
    		for( int j=i+1; j< _sentLen; j++) {
    			if( (j-i) > _skipLen ) {
					System.out.println( i + "," + j );
    			}
    		}
    	}		
		
	}

	public static void getIdxKSkipTriGrams(int _iSentLen, int _iSkipLen ) {
		
    	for( int i=0; i<= _iSentLen; i++) {
    		for( int j=i+1; j<= _iSentLen; j++) {
    			for( int k=j+1; k<= _iSentLen; k++) {
    				if( (j-i) > _iSkipLen ) {
    					System.out.println( i + "," + j +"," + k);
    				}
    			}
    		}
    	}
		
	}
	
	public static void getIdxKSkipFourGrams(int _iSentLen, int _iSkipLen ) {
		
    	for( int i=0; i<= _iSentLen; i++) {
    		for( int j=i+1; j<= _iSentLen; j++) {
    			for( int k=j+1; k<= _iSentLen; k++) {
    				for( int l=j+1; l<= _iSentLen; l++) {
    					if( (j-i) > _iSkipLen ) {
    						System.out.println( i + "," + j +"," + k + "," + l);
    					}
    				}
    			}
    		}
    	}		
		
	}
	
	public void getKSkipBiGrams(int _skipLen) {
		getIdxKSkipBiGrams( this.iSentenceLength,  _skipLen );		
	}
	
	public void getKSkipTriGrams(int _skipLen) {
		getIdxKSkipFourGrams(this.iSentenceLength,  _skipLen );				
	}
	
	public void getKSkipFourGrams(int _skipLen) {
		getIdxKSkipFourGrams(this.iSentenceLength,  _skipLen );		
	}
	
}
