package arraypractice;

public class SecondLargest {
	public static void main(String[] args) {
		int a[] = {2, 5,9,0,12,1};
        int first = a[0];
        int second = first;

        for (int i = 1; i < a.length; i++) {
            if (a[i] > first) {
                second = first;
                first = a[i];
            } else if (a[i] > second && a[i] != first) {
                second = a[i];
            }
        }

        System.out.println("The second largest element is: " + second);
    }
	}


