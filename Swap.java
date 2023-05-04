class Swap{
    public static void main(String[] args) {
        int num1=5;
        int num2=10;
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After swapping, the first number is " + num1+ " and the second number is " + num2);
    }
}