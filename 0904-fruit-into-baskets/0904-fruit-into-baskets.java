class Solution {
    public int totalFruit(int[] fruits) {
      Map<Integer , Integer> frequency = new HashMap<>();
      int left = 0;
      int maxFruits = 0;

      for(int right = 0; right < fruits.length; right++) {
        int currentFruit = fruits[right];

           frequency.put(
                currentFruit,
                frequency.getOrDefault(currentFruit, 0) + 1
            );

             while (frequency.size() > 2) {
                int leftFruit = fruits[left];

                frequency.put(
                    leftFruit,
                    frequency.get(leftFruit) - 1
                );

                if (frequency.get(leftFruit) == 0) {
                    frequency.remove(leftFruit);
                }

                left++;
            }

            int windowLength = right - left + 1;
            maxFruits = Math.max(maxFruits, windowLength);
        }

        return maxFruits;
    }
}
        
    
