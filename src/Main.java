public class Main {

    public static void main(String[] args) {
        double [] fractionalNums = {2.5, 1.6, -1.7, 6.1, 9.2, 4.5, -0.7, 12.3, 6.8, -9.6, 15.2, 8.2, 3.5, 20.1, 19.0};

        double average = 0.0 ;
        int count = 0;

        for (int a1 = 0; a1 < fractionalNums.length; a1++) {
            if (fractionalNums[a1] < 0) {
                for (int a2 = a1 + 1; a2 < fractionalNums.length; a2++) {
                    if (fractionalNums[a2] > 0) {
                        average = average + fractionalNums[a2];
                        count ++ ;
                    }
                }

                break;
            }
        }
        System.out.println("average " + average);
        System.out.println("count " + count);
        System.out.println("average/count  " + average/count);
    }
    }


