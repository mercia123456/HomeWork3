package array_Demo;

public class ArrayConcepts {
    public static <Char> void main(String [] args){
        int i[]= new int[5];

        i[0] = 10;
        i[1] = 20;
        i[2] = 30;
        i[3] = 40;
        i[4] = 50;

        System.out.println(i [1]);
        System.out.println(i [3]);
        System.out.println(i .length);

        for (int j = 0; j < i.length; j++){
            System.out.println(i [j]);
        }

        double d[]= new  double [5];
        d[0] = 9.33;
        d[1] = 12.51;
        d[2] = 15.11;
        d[3] = 18.12;
        d[4] = 21.14;
        System.out.println(d [2]);

        Character c[] = new Character[4];
        c[0 ] = 'n';
        c[1 ] = 'd';
        c[2 ] = '$';
        c[3 ] = 'b';
        System.out.println(c [2]);{

        }

        String s[] = new String[3];
        s[0] = "test";
        s[1] = "name";
        s[2] = "hello";
        s[3] = "print";
        s[4] = "java";
        System.out.println(s[1]);

        Object ob[] = new Object[4];
        ob[0] = "Farhad";
        ob[1] = 15;
        ob[2] = 12.25;
        ob[3] = "London";
        ob[4] = 'M';
        System.out.println(ob[4]);
        System.out.println();






    }
}
