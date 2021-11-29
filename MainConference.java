class ConferenceHall {
    String name;
    int availSeats;

    ConferenceHall(String name) {
        this.name = name;
        availSeats = 30;
    }

    void enterHall() {
        if (availSeats == 0)
            System.out.println("There are no available seats.");
        else {
            availSeats--;
            display();
        }
    }

    void exitHall() {
        if (availSeats == 30)
            System.out.println("No people in the hall.");
        else {
            availSeats++;
            display();
        }
    }

    void display() {
        System.out.println("The number of available seats is " + availSeats);
    }
}

public class MainConference {
    public static void main(String args[]) {
        ConferenceHall h1 = new ConferenceHall("Conference Hall 1");
        ConferenceHall h2 = new ConferenceHall("Conference Hall 2");
        h1.enterHall();
        h2.enterHall();
        h1.enterHall();
        h2.exitHall();
        h1.display();
    }
}