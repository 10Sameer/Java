public class GradeEvaluator {
    public static void main(String[] args) {
        int score = 87;
        boolean hasExtraCredit = true;

        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80 && score < 90) {
            if (hasExtraCredit) {
                System.out.println("Grade: A- (with extra credit)");
            } else {
                System.out.println("Grade: B+");
            }
        } else if (score >= 70) {
            System.out.println("Grade: B");
        } else if (score >= 60) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Failing grade.");
        }
    }
}
