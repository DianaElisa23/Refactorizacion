public class ConsoleBasedFizzBuzz implements FizzBuzz {
    @Override
    public void print(int from, int to) {
        for (int num = from; num <= to; num++) {
            System.out.println(getFizzBuzzValue(num));
        }
    }

    private String getFizzBuzzValue(int num) {
        if (num % 3 == 0 && num % 5 == 0) return "FizzBuzz";
        if (num % 3 == 0) return "Fizz";
        if (num % 5 == 0) return "Buzz";
        return num + " ";
    }
}
