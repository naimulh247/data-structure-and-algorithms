

class Fibonacci {

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        var fib = fibonacci.fibonacci(100);
        System.out.println(fib);

    }

    public int fibonacci(int n){
        if(n<0){
            return -1;
        }
        if (n == 0 || n==1){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
    
}
