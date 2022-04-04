public class Fibonacci {
    public static void main(String[] args) {
        int sequencia[] = new int[20];
        sequencia[0] = 0;
        sequencia[1] = 1;


        for(int i = 2;i < 20;i++) {
            sequencia[i] = sequencia[i-1] + sequencia [i-2];
        }
        for(int num : sequencia) {
            System.out.print(num + " ");
        }
    }
}