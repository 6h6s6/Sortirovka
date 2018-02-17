import java.util.*;

public class sortirovka {
    public static class sString implements Comparable<sString> {
        public String inString;

         sString(String inString)
        {
            this.inString=inString;
        }

        public String getInString() {
            return inString;
        }

        @Override
        public int compareTo(sString o) {
            return inString.toLowerCase().compareTo(o.getInString().toLowerCase());
        }
    }

    public static void main(String[] args) {
    ArrayList<sString> nString=new ArrayList<sString>();
    Scanner sc=new Scanner(System.in);

    while (true)
    {
        String tempString=sc.nextLine();
        if (tempString.equals("e"))
            {break;}
        nString.add(new sString(tempString));

    }
    Collections.sort(nString);

    for (sString a:nString)
    {
        System.out.println(a.getInString());
    }


    }

    }




