class Que9{
    public static void main(String[] args){
   byte i=89;
    Byte B1= new Byte(i);
    byte b1=B1.byteValue();
    System.out.println("Byte instance" +b1);

    Short s1=B1.shortValue();
    System.out.println("Byte instance into short" +s1);

    int i1=B1.intValue();
    System.out.println("Byte instance into int" + i1);

    float f1=B1.floatValue();
    System.out.println("Byte instance into float" + f1);

     long l1=B1.longValue();
    System.out.println("Byte instance into long" + l1);
    
     double d1=B1.doubleValue();
    System.out.println( "Byte instance into double" +d1);
   

    }
}