class Que25{
 public static void main(String[] args){
   Float f=1576667f;
    Float F1= new Float(f);
     Float F2=F1.floatValue();
    System.out.println(" Long instance " +F2);

    byte b1=F1.byteValue();
    System.out.println("float instance into byte" + b1);

    Short s1=F1.shortValue();
    System.out.println("short instance into short" + s1);

    long l1=F1.longValue();
    System.out.println("long instance into float" + l1);

     int i1=F1.intValue();
    System.out.println("long instance into integer" + i1);
    
     double d1=F1.doubleValue();
    System.out.println( "integer instance into double" +d1);
   

    }
}