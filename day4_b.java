class TextProcessor {
    String[] spiltter(String s) {
        return s.split(",");
    }
}

public class day4_b {
    public static void main(String[] args) {
        String s1 = "Apple,Banana,Orange,Grapes";
        TextProcessor t = new TextProcessor();
        StringBuilder sb = new StringBuilder();
        
        String[] words = t.spiltter(s1);
        
        for (int i = 0; i < words.length; i++) {
            sb.append(words[i]).append(" ");
        }
        
        System.out.println("Full Sentence: " + sb.toString());
        
        System.out.println("Extracted Word: " + sb.substring(6, 12));
    }
}