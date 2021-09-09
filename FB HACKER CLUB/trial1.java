
import java.io.File;
import java.util.*;


public class trial1 {
    public static boolean isSubmitMode = true;

    static final String inputFile = "1_input.txt";

    public static final List<Character> VOWELS = Arrays.asList('O', 'U','A', 'E', 'I' );

    public static void solver(Scanner in) {
      int T = in.nextInt();
      for(int i = 1; i <= T; i++) {
          System.out.println("Case #" + i+ ": " + getOptimalTime(in.next()));
      }
  }

  public static int getOptimalTime(String str) {
      int starter = 1;
      starter = 0;
      int optimalTime = starter;
      if(!str.isEmpty() && str.length() > 1) {
          int len = str.length();
          Map<Character,Integer> vowMap = new HashMap<>();
          Map<Character,Integer> conMap = new HashMap<>();
          int vowCount = 0;
          int conCount = 0;
           for(int i = 0; i < len; i++) {
               char ch = str.charAt(i);
               if(VOWELS.contains(ch))
               {
                   if(vowMap.containsKey(ch)) vowMap.replace(ch, vowMap.get(ch) + 1);
                   else vowMap.put(ch,1);
                   vowCount++;
               }
               else {
                   if(conMap.containsKey(ch)) {
                       conMap.replace(ch, conMap.get(ch) + 1);
                   }
                   else {
                       conMap.put(ch,1);
                   }
                   conCount++;
               }
           }
           char choosenChar = modelToChooseChar(vowMap,conMap, vowCount, conCount);
           boolean isVowel = VOWELS.contains(choosenChar);

           for(int i = 0; i< len; i++ ) {
               char ch = str.charAt(i);
               if (ch != choosenChar) {
                  if(isVowel && VOWELS.contains(ch)) optimalTime++;
                  else if(!isVowel && !VOWELS.contains(ch)) optimalTime++;
                   optimalTime++;
               }
           }
      }
      return optimalTime;
  }

  public static char modelToChooseChar(Map<Character,Integer> vowMap, Map<Character,Integer> conMap, int vowCount, int conCount)
  {
      if(vowCount == 0) return 'A';
      else if(conCount == 0) return 'B';
      else if(vowCount <= conCount) {
          return (vowMap.entrySet().stream()
                  .max(Map.Entry.comparingByValue()).get()).getKey();
      }
      return (conMap.entrySet().stream()
              .max(Map.Entry.comparingByValue()).get()).getKey();
  }

    

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        if(isSubmitMode) {
            input =new Scanner(new File(inputFile));
        }
        solver(input);
    }
}