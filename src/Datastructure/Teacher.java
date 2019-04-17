package Datastructure;

public class Teacher {

    String name,gender;
    int phone;

    //void setInformation(String n,String m,int ph){

    Teacher(String n,String m, int ph){  //use constraction

        name = n;
        gender = m;
        phone = ph;

    }


    void displayInformation(){
        System.out.println("Name:"+name);
        System.out.println("gender:"+gender);
        System.out.println("phone:"+phone);
        System.out.println("\n\n");


    }

}
