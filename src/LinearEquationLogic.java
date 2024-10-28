import java.util.Scanner;
public class LinearEquationLogic {
    public LinearEquationLogic() {}


    public void start() {
        System.out.println("Welcome User!");
        String prompt = "e";
        while (!(prompt.equals("no"))) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter first coordinate point: ");
            String coord1 = scan.nextLine();
            System.out.print("Enter second coordinate point: ");
            String coord2 = scan.nextLine();
            if (getX(coord1)-getX(coord2) != 0) {
                LinearEquation line = new LinearEquation(getX(coord1), getY(coord1), getX(coord2), getY(coord2));
                System.out.println(line.lineInfo());


                System.out.print("Enter an x value to find the y of that point: ");
                System.out.println(line.coordinateForX(scan.nextInt()));
            }
            else {
                System.out.println("This is a vertical line at x = " + getX(coord1) + "!");
            }


            System.out.print("Do you want to try another equation? (say no to quit): ");
            prompt = scan.nextLine();
        }
    }
    public int getX(String coord1){
        return Integer.parseInt(coord1.substring(1,coord1.indexOf(",")));
    }
    public int getY(String coord1){
        return Integer.parseInt(coord1.substring(coord1.indexOf(",")+2,coord1.length()-1));
    }


}
