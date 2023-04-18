class Que21{
    public static void main(String[] args){
   Long l=1576667l;
    Long l1= new Long(l);
     Long l2=l1.longValue();
    System.out.println(" Long instance " +l2);

    byte b1=l1.byteValue();
    System.out.println("long instance into byte" + b1);

    Short s1=l1.shortValue();
    System.out.println("short instance into short" + s1);

    float f1=l1.floatValue();
    System.out.println("long instance into float" + f1);

     int i1=l1.intValue();
    System.out.println("long instance into integer" + i1);
    
     double d1=l1.doubleValue();
    System.out.println( "integer instance into double" +d1);
   

    }
}