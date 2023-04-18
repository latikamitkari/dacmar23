class Que6{
    public static void main(String[] args){
    //boolean into string data
    boolean i=false;
    String s1=Boolean.toString(i);
    System.out.println("String :" +s1);

 //boolean into boolean instance
    boolean i1=false;
    Boolean b = new Boolean(i1);
    System.out.println("boolean instance :" +b);

//   String value into boolean value
   String s2="true";
    Boolean b1 =Boolean.valueOf(s2);
    System.out.println("boolean :" +b1);

// String value into Boolean instance
 String s3="true";
    Boolean b2 =Boolean.valueOf(s2);
    System.out.println("boolean :" +b1);










    }
}