import java.util.ArrayList;
import java.util.Scanner;

public class Student {

    private String name;

    private int id;

    private ArrayList<Integer> scores;

    private int changeNum;

    public Student(String name, int id){
        this.name = name;
        this.id = id;
        this.scores = new ArrayList<Integer>();
        this.changeNum = 0;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = console.next();
        System.out.printf("Hello, %s!\n", name);
    }

}

