import java.util.ArrayList;

public class Task {
    private String title;
    private Status status;
    private User assignedUser;

    public Task(String title) {
        this.title = title;
        this.status = Status.TODO;
    }

    public String getTitle() {
        return title;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public User getAssignedUser() {
        return assignedUser;
    }

    public void setAssignedUser(User user) {
        this.assignedUser = user;
    }
}
