public class Main {
    public static void main(String[] args) {
        TaskService service = new TaskService();

        User user1 = new User("Titya");
        User user2 = new User("Alex");

        service.createTask("Learn Java OOP");
        service.createTask("Build Task Manager");

        service.assignTask(0, user1);
        service.assignTask(1, user2);

        service.markComplete(0);

        service.viewTasks();
    }
}
