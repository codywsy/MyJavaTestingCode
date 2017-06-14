package demo.java;

class Person{
  public String talk(){
    return "Person -> talk()";
  }
}

class Hello {
    public static void main(String[] arg){
        System.out.println(new Person().talk());
    }
}
