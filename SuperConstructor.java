class A
 {
   A()
   {
     System.out.println("hello shruti");
   }
 }

class B extends  A
 {
   B()
    {
      super();
      System.out.println("hello sakshi");
    }
 }

class SuperConstructor
 {
   public static void main(String args[])
    {
      B ref=new B();
      
    }
 } 