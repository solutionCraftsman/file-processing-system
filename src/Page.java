import java.time.LocalDate;

public class Page {
    private int number;
    private LocalDate date;
    private String heading;
    private String activitiesOfTheDay;

    public Page() {
        this("", "");
    }

    public Page(String heading, String activitiesOfTheDay) {
        this.number = NumberGenerator.generate();
        date = LocalDate.now();
        this.heading = heading;
        this.activitiesOfTheDay = activitiesOfTheDay;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public String getActivitiesOfTheDay() {
        return activitiesOfTheDay;
    }

    public void setActivitiesOfTheDay(String activitiesOfTheDay) {
        this.activitiesOfTheDay = activitiesOfTheDay;
    }

    public int getNumber() {
        return number;
    }
}
