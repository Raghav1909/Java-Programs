import java.util.Scanner;

class Train {
    int trainNo;
    String name;
    String source, destination;

    Scanner ip = new Scanner(System.in);

    void readData() {
        System.out.println("Enter the train details: ");
        System.out.println("Enter the train number: ");
        trainNo = ip.nextInt();
        System.out.println("Enter the name of the train: ");
        name = ip.next();
        System.out.println("Enter the source of the train: ");
        source = ip.next();
        System.out.println("Enter the destination of train: ");
        destination = ip.next();
    }

    void display() {
        System.out.println("Train No: " + trainNo + " | " + "Train Name: " + name + " | " + "Source of the train: "
                + source + " | " + "Destination of the train: " + destination);
    }
}

public class MainTrain {
    public static void main(String args[]) {
        Train t[] = new Train[10];

        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the number of trains: ");
        int n = ip.nextInt();

        for (int i = 0; i < n; i++)
            t[i] = new Train();

        for (int i = 0; i < n; i++)
            t[i].readData();

        String source, destination;

        System.out.println("Enter the source of train to be checked: ");
        source = ip.next();

        for (int i = 0; i < n; i++) {
            if (source.equals(t[i].source))
                t[i].display();
        }

        System.out.println("Enter the destination of train to be checked: ");
        destination = ip.next();

        for (int i = 0; i < n; i++) {
            if (destination.equals(t[i].destination))
                t[i].display();
        }

        ip.close();
    }
}
