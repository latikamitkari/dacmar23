 class Que14{
    public static void main(String[] args){
   short i=157;
    Short S1= new Short(i);
    Short s=S1.shortValue();
    System.out.println("Short instance " +s);

    int i1=S1.intValue();
    System.out.println("Short instance into int" + i1);

    float f1=S1.floatValue();
    System.out.println("Short instance into float" + f1);

     long l1=S1.longValue();
    System.out.println("Short instance into long" + l1);
    
     double d1=S1.doubleValue();
    System.out.println( "Short instance into double" +d1);
   

    }
}