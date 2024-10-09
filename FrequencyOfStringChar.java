import java.util.HashMap;

public class FrequencyOfStringChar {
    public static void main(String[] args) {
        String str = "abcasdoasbduiabsdabvsdyavn";
        HashMap<Character, Integer> hm = new HashMap<>();
        char[] ch = str.toCharArray();
        for(int i=0; i<ch.length; i++){
            if(hm.containsKey(ch[i])){
                hm.put(ch[i], hm.get(ch[i])+1);
            }else{
                hm.put(ch[i], 1);
            }
        }
        System.out.println(hm);
    }
}
