package sec01;

class human{
    String name;
    int age;
    human(String name, int age){
        this.name = name;
        this.age = age;
    }
    void eat(){}
    void sleep(){}
}

class student extends human{
    int studentID;
    student(String name, int age, int studentId){
        super(name, age);
        this.studentID = studentId;
    }
    void study(){}
}

class worker extends human{
    int workerID;
    worker(String name, int age, int workerID){
        super(name, age);
        this.workerID = workerID;
    }
    void work() {}
}

public class Main{
    public static void main(String[] args)
    {
        human h = new human("자바", 11);
        h.eat();
        h.sleep();

        student s = new student("학생자바", 12, 3);
        s.eat();
        s.sleep();
        s.study();

        worker w = new worker("사원자바", 13, 4);
        w.eat();
        w.sleep();
        w.work();
    }
}