package chapter03;

public class Date {
    int day;
    int month;
    int year;

    String retriveDateToPrinting(){
        return String.format("%d/%d/%d", this.day, this.month, this.year);
    }
}
