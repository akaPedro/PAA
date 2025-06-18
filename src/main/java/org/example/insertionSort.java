import java.sql.SQLOutput;
import java.util.Random;

public static void insertionSort(int[] arr) {
    int n = arr.length;
    for (int i = 1; i < n; i++) {
        int key = arr[i];
        int j = i - 1;
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = key;
    }
}

public static int[] gerarVetorAleatorio(int tamanho) {
    int[] vetor = new int[tamanho];
    Random rand = new Random();

    for (int i = 0; i < tamanho; i++) {
        vetor[i] = rand.nextInt(1_000_000); // números de 0 a 999999
    }

    return vetor;
}

public void main() {
    int[] vec = gerarVetorAleatorio(10);
    long startTime = System.currentTimeMillis();
    insertionSort(vec);
    long endTime = System.currentTimeMillis();
    System.out.println("Tempo: " + (endTime - startTime) + " ms");

    for (int i = 0; i < vec.length; i++) {
        System.out.print(vec[i] + " ");
    }
}

