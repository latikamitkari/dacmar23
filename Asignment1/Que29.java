class Que29{
 public static void main(String[] args){
   Double d=15.9976667;
    Double D1= new Double(d);
     Double D2=D1.doubleValue();
    System.out.println("double instance " +D2);

    byte b1=D1.byteValue();
    System.out.println("double instance into byte" + b1);

    Short s1=D1.shortValue();
    System.out.println("double instance into short" + s1);

    long l1=D1.longValue();
    System.out.println("double instance into float" + l1);

     int i1=D1.intValue();
    System.out.println("double instance into integer" + i1);
    
     float f1=D1.floatValue();
    System.out.println( "double instance into double" +f1);
   

    }
}