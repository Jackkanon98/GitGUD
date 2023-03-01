import java.util.ArrayList;

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

}

