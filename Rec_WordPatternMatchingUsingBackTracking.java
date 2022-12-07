import java.util.*;

public class Rec_WordPatternMatchingUsingBackTracking {
    public static void main(String[] args) {
        String str = "graphtreegraph";
        String pattern = "pep";

        HashMap<Character, String> map = new HashMap<>();
        patternMatching(str, pattern, map, pattern);
        
    }

    public static void patternMatching(String str, String pattern, HashMap<Character, String> map, String originalPattern){
        if(pattern.length() == 0){
            if(str.length() == 0){
                HashSet<Character> alreadyPrinted = new HashSet<>();
                for(int i = 0; i<originalPattern.length(); i++){
                    
                    if(alreadyPrinted.contains(pattern.charAt(i)) == false){
                        System.out.print(originalPattern.charAt(i) + "->" + map.get(originalPattern.charAt(i)));
                        alreadyPrinted.add(originalPattern.charAt(i));
                    }
                }
                System.out.println();
                
            }
            return;
        }

        char ch = pattern.charAt(0);
        String restOfPattern = pattern.substring(1);
        
        if(map.containsKey(ch)){
            String previousMapping = map.get(ch);
            if(str.length() >= previousMapping.length()){
                String left = str.substring(0, previousMapping.length());
                String right = str.substring(previousMapping.length());
                if(previousMapping.equals(left)){
                    patternMatching(right, restOfPattern, map, originalPattern);
                }
            }
            
            
        }else{
            for(int i = 0; i<str.length(); i++){
                String left = str.substring(0, i+1);
                String right = str.substring(i+1);
                
                map.put(ch, left);
                patternMatching(right, restOfPattern, map, originalPattern); 
                map.remove(ch);
            }
        }   
    }
}
