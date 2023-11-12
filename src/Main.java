import model.Epic;
import model.StatusType;
import model.Subtask;
import model.Task;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        Task task = new Task(1,"task","description",StatusType.DONE);

        Epic epic = new Epic(1,"epic","description", StatusType.NEW);

        Subtask subtask_1 = new Subtask(5,"sbt_1","desc",StatusType.NEW,1);
        Subtask subtask_2 = new Subtask(5,"sbt_2","desc",StatusType.NEW,1);

        System.out.println(task);
        System.out.println(epic);

        System.out.println(subtask_1);


    }
}