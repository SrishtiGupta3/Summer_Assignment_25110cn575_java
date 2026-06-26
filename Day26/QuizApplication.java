import java.util.Scanner;

public class QuizApplication {
    public static void main(String[] args) {
        int i = 0;
        int y;
        System.out.println("WELCOME!.\nTo The Quiz.");
        Scanner a = new Scanner(System.in);
        System.out.println("Answer the Following 5 Ques.");
        System.out.println("Ques1. Which one of the following river flows between Vindhyan and Satpura ranges?"
                + "\n(1) Narmada\n" + "(2) Mahanadi\n" + "(3) Son\n" + "(4) Netravati");
        System.out.print("Enter you response:");
        y = a.nextInt();
        if (y == 1) {
            i = i + 1;
        }

        System.out.println(
                "Ques2. The ratio of the present ages of two brothers is 1 : 2. Five years ago, the ratio was 1 : 3. What will be the ratio of their ages after five years?\n"
                        + "(1) 1:4\n" + "(2) 2:3\n" + "(3) 3:5\n" + "(4) 5:6");
        System.out.print("Enter you response:");
        y = a.nextInt();
        if (y == 3) {
            i = i + 1;
        }

        System.out.println("Ques3. Convert given speed into m/s: Speed = 30 km/h\n" + "1) 1.7\n" + "2) 3.3\n"
                + "3) 8.3\n" + "4) 13.3");
        System.out.print("Enter you response:");
        y = a.nextInt();
        if (y == 3) {
            i = i + 1;
        }

        System.out.println(
                "Q. 1 Ravi was at a family gathering when he pointed to a woman sitting across the room and said, “She is the daughter of my grandfather’s only son.” Everyone turned to look at the woman. How is the woman related to Ravi?\n"
                        + "1) Mother\n" + "2) Aunt\n" + "3) Cousin\n" + "4) Sister");
        System.out.print("Enter you response:");
        y = a.nextInt();
        if (y == 4) {
            i = i + 1;
        }

        System.out.println(
                "Q. 2 A company is considering hiring one of two candidates for a manager position. Candidate A has 7 years of experience in management and strong leadership skills. Candidate B has 5 years of experience and excellent technical expertise. If the company’s priority is technical development, who should they hire?\n"
                        + "1) Candidate A\n" + "2) Candidate B\n" + "3) None\n" + "4) Either");
        System.out.print("Enter you response:");
        y = a.nextInt();
        if (y == 2) {
            i = i + 1;
        }

        System.out.println("Correct Answers are: " + i);
        System.out.println("Score is : " + i + "/5");
        if (i == 5) {
            System.out.println("WellDone!");
        } else if (i == 4) {
            System.out.println("Good");
        }
    }
}
