package Day33ClassAndObject;

public class Dog {
    /*
    Dog
        Attributes /data:
            breed,size,age,color,name , gender

         actions:
            eat,sleep,bark,play...

     */
    String breed;
    String size;
    byte   age;
    String color;
    String name;
    char   gender;
    String food;
    String toy;

public void getInfo(){
    System.out.println(breed+" "+size+" "+age+" years old "+color+", Gender is "+gender+" , Name is : "+name);
}

public void eat(){
    System.out.println(name+" is eating "+food);
}

public void play(){

    System.out.println(breed+" is playing with "+toy);
}


    public static void main(String[] args) {

    }
}
