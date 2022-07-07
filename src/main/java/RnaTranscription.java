import java.util.HashMap;

class RnaTranscription {

    private static HashMap<Character, Character> nucleotideMap = new HashMap<>();

    static{
        nucleotideMap.put('G', 'C');
        nucleotideMap.put('C', 'G');
        nucleotideMap.put('T', 'A');
        nucleotideMap.put('A', 'U');
    }
    
    String transcribe(String dnaStrand) {
        String ans = "";
        
        for(int i=0; i<dnaStrand.length(); ++i){
            ans += nucleotideMap.get(dnaStrand.charAt(i));
        }

        return ans;
    }

}
