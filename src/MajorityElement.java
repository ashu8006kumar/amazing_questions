/**
 * This class provides a method to find the majority element in an array.
 * The majority element is defined as an element that appears more than n/2 times
 * in an array of size n. The Boyer-Moore Voting Algorithm is used for finding the majority
 * element, which operates in two phases: candidate selection and candidate verification.
 */
public class MajorityElement {

    /**
     * Finds the majority element in the provided array using the Boyer-Moore Voting Algorithm.
     * This method first finds a potential candidate for the majority element and then verifies it.
     *
     * @param nums the array of integers to be analyzed for a majority element
     * @return the majority element if found, -1 if no majority element exists
     */
    public static int findMajorityElement(int[] nums) {
        int count = 0;
        Integer candidate = null;

        // Phase 1: Find a potential candidate
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        // Phase 2: Verify the candidate
        count = 0;
        for (int num : nums) {
            if (num == candidate) {
                count++;
            }
        }

        // Check if the candidate is actually the majority element
        if (count > nums.length / 2) {
            return candidate;
        }

        return -1; // no majority element found
    }

    /**
     * Main method to demonstrate the functionality of the findMajorityElement method.
     * Provides an example array and prints out the result of the majority element search.
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        int[] nums = {2, 2, 2, 2, 2, 1, 1, 1, 2, 2, 2, 2, 1, 1, 3, 3, 3, 3};
        int result = findMajorityElement(nums);
        if (result != -1) {
            System.out.println("The majority element is: " + result);
        } else {
            System.out.println("No majority element found.");
        }
    }
}
