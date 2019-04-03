Activity 3
    1.
    import java.util.Random;
    public static String flip() {
        int result = (int) (Math.random() * 4);
        if (result > 1) {
            return "heads";
        }

        return "tails";
    }
    2. 
    public static boolean arePermutations(int[] arr1, int[] arr2) {
        boolean match = false;
        for(int i = 0; i < arr1.length; i++) {
            for (int k = 0; k < arr1.length; k++) {
                if (arr1[i] == arr2[k]) {
                    match = true;
                }
            }

            if (!match) {
                return false;
            }

            match = false;
        }

        return true;
    } 

    3. 0, 1, 1   