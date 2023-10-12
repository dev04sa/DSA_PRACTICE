class Solution
{
    static int majorityElement(int a[], int size)
    {
        // your code here
        int candidate = a[0];
        int count = 1;

        for (int i = 1; i < a.length; i++) {
            if (count == 0) {
                candidate = a[i];
                count = 1;
            } else if (candidate == a[i]) {
                count++;
            } else {
                count--;
            }
        }

        // Validate if the candidate is the majority element.
        int candidateCount = 0;
        for (int num : a) {
            if (num == candidate) {
                candidateCount++;
            }
        }

        if (candidateCount > a.length / 2) {
            return candidate;
        }

        return -1; // No majority element found
    
        
    }
}