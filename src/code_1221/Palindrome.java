package code_1221;

public class
Palindrome {
    public static void main(String[] args) {
        String s = "Was it a bar or a bat I saw?";
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        String r = sb.reverse().toString();
        if(getLetter(s).equals(getLetter(r)))
            System.out.println("true");
        else
            System.out.println("false");
    }

    private static String getLetter(String s) {
        String ns = new String();
        for (int i = 0 ;i <s.length();i++)
        {
          if( Character.isLetter(s.charAt(i)))
              ns += Character.toLowerCase(s.charAt(i));
        }
        return ns;
    }


}
