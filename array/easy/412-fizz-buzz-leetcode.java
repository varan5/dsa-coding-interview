class Solution {
    public List<String> fizzBuzz(int number) {
       
        List<String> result = new ArrayList<>();
        
        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result.add("FizzBuzz");
            }
            else if (i % 3 == 0) {
                result.add("Fizz");
            }
            else if (i % 5 == 0) {
                result.add("Buzz");
            }
            else {
                result.add(Integer.toString(i));
            }
        }
        return result;
    }
}
