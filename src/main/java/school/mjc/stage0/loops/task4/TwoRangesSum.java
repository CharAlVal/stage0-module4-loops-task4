package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        int sum = 0;
        int skip = 0;
        for (int i = 0; i <= lastInRow; ++i){
            sum += i;
            if (numberToSkip > lastInRow){
                System.out.println("number to skip is bugger then the last");
                break;
            }
            else if (lastInRow < 0){
                System.out.println("last number in row is negative");
                break;
            }
            else if (i == numberToSkip) {
                skip = sum;
            }
            else if (i == lastInRow){
                sum -= skip;
                System.out.println("skipped sum is "+skip+" counted sum is "+sum);
            }
        }

    }
}
