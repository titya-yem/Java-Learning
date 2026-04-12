import java.util.ArrayList;
import java.util.List;

public class TaskService {
    private List<Task> tasks = new ArrayList<>();

    public void createTask (String title) {
        // first create task object and add to List array list
        Task task = new Task(title);
        tasks.add(task);
        System.out.println("Task created" + title);
    }

    public void assignTask (int index, User user) {
        Task task = tasks.get(index);
        task.setAssignedUser(user);

        System.out.println("Assigned task '" + task.getTitle() + "' to user " + user.getName());
    }

    public void markComplete (int index) {
        Task task = tasks.get(index);

        if (task.getStatus() == Status.DONE) {
            System.out.println("Task already completed.");
            return;
        }

        task.setStatus(Status.DONE);
        System.out.println("Marking task '" + task.getTitle() + "' to DONE.");
    }

    public void viewTasks () {
        for (int i = 0; i < tasks.size(); i++) {
            Task task = tasks.get(i);

            String userName = (task.getAssignedUser() != null)
                    ? task.getAssignedUser().getName()
                    : "Unassigned";

            System.out.println(i + ". " + task.getTitle()
                    + " | " + task.getStatus()
                    + " | " + userName);
        }
    }
}
