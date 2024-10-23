package CroneExample;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class CloneAndScheduleAtSpecificTime {
    public static void main(String[] args) {
        try {
            // Creating and cloning the object
            Person person1 = new Person("John", 30);
            Person person2 = (Person) person1.clone();

            // Scheduling the task at a specific time
            Date specificTime = new Date(System.currentTimeMillis() + 10000);  // 10 seconds from now
            scheduleTaskAtSpecificTime(person2, specificTime);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    // Method to schedule a task at a specific time
    public static void scheduleTaskAtSpecificTime(Person person, Date time) {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {

            @Override
            public void run() {
                System.out.println("Scheduled Task: Displaying Cloned Person");
                System.out.println(person);
            }
        };

        // Scheduling the task at a specific time
        timer.schedule(task, time);
        System.out.println("Task scheduled to run at: " + time);

    }
}
