class Que28{
    public static void main(String[] args){
   Double d=899.89;
    String s1=Double.toString(d);
    System.out.println("String :" +s1);

    Double d1=99.8899999;
    Double s = new Double(d1);
    System.out.println("double instance :" +s);

    String s2="88888";
    Double d3 =Double.valueOf(s2);
    System.out.println("string instance to double instance :" +d3);


    }
} 