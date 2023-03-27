package enums;

public class EnumPractise {

    enum Week{
        Saturday, sunday, monday,tuesday, wednesday,thursday,friday;


        Week(){
            System.out.println("Printing all week: "+this);
        }

    }

    public static void main(String[] args) {
        Week week=Week.friday;
        System.out.println(week);
    }
}
