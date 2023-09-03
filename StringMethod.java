

public class StringMethod {
    
    public static void main(String[] args) {
        String name = "Akshansh";
        //String a1 = new String(Akshansh);
        System.out.println(name);
        
        int value = name.length();
        System.out.println(value);

        String lString = name.toLowerCase();
        System.out.println(lString); 
        
        String nonTrimmedString = "   Akshansh singh   ";
        System.out.println(nonTrimmedString);
        String trimmedString = nonTrimmedString.trim();
        System.out.println(trimmedString);

        System.out.println(trimmedString.substring(3, 8));

        String fiance = "Neha Jethwani";
        System.out.println(fiance                   );
        System.out.println(fiance.replace("Jethwani", "Singh"));
        
        System.out.println(fiance.startsWith("Ne"));

        System.out.println(name.charAt(2));

        System.out.println(name.indexOf("s"));

        System.out.println(fiance.lastIndexOf("Jet", 4));

        System.out.println(name.equals(fiance));
        System.out.println(nonTrimmedString.equalsIgnoreCase(name));
    }
}
