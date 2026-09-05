
//time complexity :O(n^2)
public class activityselection {

    public static void main(String[] args) {

        int[] start = {1, 3, 0, 5, 8, 5};
        int[] finish = {2, 4, 6, 7, 9, 9};

        //Sort according to finish time
        for (int i = 0; i < finish.length - 1; i++) {
            for (int j = i + 1; j < finish.length; j++) {

                if (finish[i] > finish[j]) {
                    int temp = finish[i];
                    finish[i] = finish[j];
                    finish[j] = temp;

                    temp = start[i];
                    start[i] = start[j];
                    start[j] = temp;
                }
            }
        }

        //Select first activity
        int lastFinish = finish[0];

        System.out.println("Selected activities:");
        System.out.println("Activity 1");

        for (int i = 1; i < start.length; i++) {
            if (start[i] >= lastFinish) {
                System.out.println("Activity " + (i + 1));
                lastFinish = finish[i];
            }
        }
    }
}