package array_Demo;

import java.io.*;

public class ExecptionHendling {
    public static void main(String []args){
        FileReader file =null;
        BufferedReader Bfile = null;
        String st = "";

        try{
            file = new FileReader("/Users/nancymondal/Documents/datastructure/src/array_Demo/Reader");
            Bfile = new BufferedReader(file);
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
        try {
            while ((st = Bfile.readLine()) != null) {
                System.out.println(st);


            }
        }catch (IOException e) {
            e.printStackTrace();

        }finally {
            if(file!=null){
                file=null;
            }
            if (Bfile!=null){
                Bfile=null;
            }

        }
    }
}
