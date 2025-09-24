

class stringconcept
{
public static void main(String args[])
{
String a="Tutor";
String b="Tutor";

System.out.println("Equals=" +a.equals(b));//like strcmp() in c lang

System.out.println("Equals Ignore case=" +a.equalsIgnoreCase(b));//like strcasecmp()

System.out.println("Length=" +a.length());

System.out.println("charAt=" +a.charAt(0));

System.out.println("Uppercase=" +a.toUpperCase());

System.out.println("Lowercase=" +a.toLowerCase());
}
}
