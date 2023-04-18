class Que13{
    public static void main(String[] args){
   short i=89;
    String s1=Short.toString(i);
    System.out.println("String :" +s1);

    Short i1=99;
    Short s = new Short(i1);
    System.out.println("short instance :" +s);

    String s2="888";
    Short i3 =Short.valueOf(s2);
    System.out.println("integer instance :" +i3);


    }
} 