class Solution {
    public void duplicateZeros(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Array ke elements ko HashMap me store karo
        for (int i = 0; i < arr.length; i++) {
            map.put(i, arr[i]);
        }

        int index = 0;

        for (int i = 0; i < arr.length && index < arr.length; i++) {

            int value = map.get(i);

            arr[index++] = value;

            // Agar zero mila, to same zero dobara add karo
            if (value == 0 && index < arr.length) {
                arr[index++] = 0;
            }
        }
    }
}  
