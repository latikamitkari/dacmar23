class Que17{
    public static void main(String[] args){
   Integer i=1576;
    Integer i1= new  Integer(i);
     Integer i2= i1.intValue();
    System.out.println(" integer instance " +i2);

    byte b1=i1.byteValue();
    System.out.println("integer instance into byte" + b1);

    Short s1=i1.shortValue();
    System.out.println("integer instance into short" + s1);

    float f1=i1.floatValue();
    System.out.println("integer instance into float" + f1);

     long l1=i1.longValue();
    System.out.println("integer instance into long" + l1);
    
     double d1=i1.doubleValue();
    System.out.println( "integer instance into double" +d1);
   

    }
}