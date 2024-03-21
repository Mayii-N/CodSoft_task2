import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Scanner;

public class Calculator  {
    public static void main(String[] args) {

        ArrayList <Double> marks = new ArrayList<>();
        int count = 0;
        double total= 0;
        double average = 0;
        double mark = 0;
        char symbol = 'A';
        String allMarks = JOptionPane.showInputDialog("Enter all your marks\nUse a comma to separate your marks");
        Scanner scanner = new Scanner(allMarks);
        scanner.useDelimiter(",");
        while (scanner.hasNext()){
            mark = scanner.nextInt();
            count++;
            marks.add(mark);
            total = total + mark;
            if (mark >= 85){
                symbol = 'A';
            } else if ((mark > 75)) {
                symbol = 'B';
            } else if (mark > 65) {
                symbol = 'C';
            } else if (mark > 50) {
                symbol = 'D';
            } else if (mark > 35) {
                symbol = 'E';
            }
            else if (mark < 35){
                symbol = 'F';
            }
            System.out.println(mark + "\t" + symbol);
        }
        average = total/count;

        if (average >= 80){
            symbol = 'A';
        } else if ((average > 70)) {
            symbol = 'B';
        } else if (average > 60) {
            symbol = 'C';
        } else if (average > 50) {
            symbol = 'D';
        } else if (average > 30) {
            symbol = 'E';
        }
        else if (average < 35){
            symbol = 'F';
        }
        System.out.println("Total\t\t:\t" + total);
        System.out.println("Average\t\t:\t" + average +"" +
                "\t" + symbol);
        System.out.println("Nr of subjects:" + count);

    }
}
