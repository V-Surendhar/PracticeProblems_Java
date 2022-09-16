package Enum;

public class Enum_Example {


    enum Week implements display{
        Monday,Tuesday , Wednesday , Thursday , Friday , Saturday , Sunday;



        Week(){
            System.out.println(this);
        }


        @Override
        public void hellomessage() {
            System.out.println("Hello surendhar !");
        }

    }

    public static void main(String[] args){

        Week week=Week.Sunday;
        System.out.println(week.ordinal());

        for(Week day : Week.values()){
            System.out.println(day);
        }
        week.hellomessage();
        System.out.println("");

        Week[] arr=Week.values();
        for(Week day : arr){
            System.out.println(day);
        }

    }

}
