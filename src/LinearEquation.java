public class LinearEquation {
    int x1;
    int x2;
    int y1;
    int y2;


    public LinearEquation(int x1, int y1, int x2, int y2) {
    this.x1 = x1;
    this.x2 = x2;
    this.y1 = y1;
    this.y2 = y2;
}


public double distance() {
    return roundedToHundredth(Math.sqrt(Math.pow(x1-x2,2) + Math.pow(y1-y2,2)));
}




public double yIntercept() {
    return roundedToHundredth(y1 - x1 * slope());
}




public double slope() {
    return roundedToHundredth(((double) (y1-y2))/(x1-x2));
}




public String equation() {
    if (slope() == 0) {
        return "y = " +yIntercept();
    }
    else if (slope() == (int)(slope())) {
        return "y = " + slope() + "x +" + yIntercept();
    }
    return "y = " + (y1-y2) + "/" + (x1-x2)  + "x +" + yIntercept();
}




public String coordinateForX(double x){
    return "(" + roundedToHundredth(x) + ", " + roundedToHundredth(x * slope() + yIntercept()) + ")";
}




public String lineInfo() {
    return "The two points are " + coordinateForX(x1) + " and " + coordinateForX(x2) + "\n" +
            "The equation of the line between these two points is: " + equation() + "\n" +
            "The y-intercept of this line is: " + yIntercept() + "\n" +
            "The slope of this line is: " + slope() + "\n" +
            "The distance between these points is: " + distance();
}
public double roundedToHundredth(double toRound){
    return (Math.round(toRound * 100.0))/100.0;
}
}
