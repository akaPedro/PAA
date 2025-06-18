import java.util.Random;

public static void selectionSort(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n - 1; i++) {
        int minIndex = i;
        for (int j = i + 1; j < n; j++) {
            if (arr[j] < arr[minIndex]) {
                minIndex = j;
            }
        }
        int temp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = temp;
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
    int[] vec = gerarVetorAleatorio(200000);
    long startTime = System.currentTimeMillis();
    selectionSort(vec);
    long endTime = System.currentTimeMillis();
    System.out.println("Tempo: " + (endTime - startTime) + " ms");

//    for (int i = 0; i < vec.length; i++) {
//        System.out.print(vec[i] + " ");
//    }

}

