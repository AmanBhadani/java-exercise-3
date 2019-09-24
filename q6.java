import java.util.*;

class Q6 {

    public String consecutiveNumbers (String series) {
        String[] numberSeries = series.split(",");
        int[] numberInt = new int[numberSeries.length];
        for (int i=0; i<numberSeries.length; i++) {
            numberInt[i] = Integer.parseInt(numberSeries[i].trim());
        }
        //return "Consecutive series";

        for (int i=0; i<numberSeries.length-2; i++) {
            if ((numberInt[i]-numberInt[i+1]==-1)||(numberInt[i]-numberInt[i+1]==1))
                return "Consecutive series";

        }

        return "Not a consecutive series";
    }
    public static void main (String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the series");

        //to take the seris of numbers in consecutive fashion
        String series = scanner.next();
        Q6 consecNumbers = new Q6();
        String res = consecNumbers.consecutiveNumbers(series);
        System.out.println(res);
    }
}