public class ConsoleBasedFizzBuzz implements FizzBuzz {
    @Override
    public void IniciarFizzBuzz(int from, int to) {
        for (int num = from; num <= to; num++) {
            String result = getFizzBuzz(num); //Extract Variable: En el método IniciarFizzBuzz se toma la variable result para guardar el resultado de getFizzBuzz(num). 
            System.out.println(result);
        }
    }

        private String getFizzBuzz(int num) { // Replace Temp with Query: En el método getFizzBuzz se usan condiciones para determinar el resultado como una consulta.
        if (num % 3 == 0 && num % 5 == 0) {
            return "FizzBuzz";
        }
        if (num % 3 == 0){
            return "Fizz";
        } 
        if (num % 5 == 0){
            return "Buzz";
        } 
        return num + "";
    }

    
}
