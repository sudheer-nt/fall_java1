package stringclass.akshath;
import java.util.Scanner;
public class ReplaceVowels {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the string");
        String s1=s.nextLine();
        char ch[]=s1.toCharArray();
        for (int i = 0; i < ch.length; i++)
        {
            if (ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u' &&
                    ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U')
            {
                ch[i]='#';
            }
        }
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]);
        }
    }
}