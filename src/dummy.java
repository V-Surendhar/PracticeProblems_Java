public class dummy {


    public static void main(String[] args) {



        task1 obj1=new task1();
        obj1.start();
        task2 obj2=new task2();
        obj2.start();


    }


    public static class task1 extends Thread{


        @Override
        public  void run(){


            for(int i=0;i<10;i++){
                Printer.print("$$$$$$$$$");
            }


        }


    }

    public static class task2 extends Thread{



        @Override
        public  void run(int a){


            for(int i=0;i<10;i++){
                Printer.print("&&&&&&");
            }


        }


    }


    public  class Printer{

        static  void  print(String s){

            System.out.println(s);

        }

    }


}