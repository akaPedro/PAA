import java.util.Random;

public static void mergeSort(int[] arr) {
    if (arr.length > 1) {
        int mid = arr.length / 2;

        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];

        System.arraycopy(arr, 0, left, 0, mid);
        System.arraycopy(arr, mid, right, 0, arr.length - mid);

        mergeSort(left);
        mergeSort(right);
        merge(arr, left, right);
    }
}

private static void merge(int[] arr, int[] left, int[] right) {
    int i = 0, j = 0, k = 0;

    while (i < left.length && j < right.length) {
        if (left[i] <= right[j]) {
            arr[k++] = left[i++];
        } else {
            arr[k++] = right[j++];
        }
    }

    while (i < left.length) {
        arr[k++] = left[i++];
    }

    while (j < right.length) {
        arr[k++] = right[j++];
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
    int[] vec = gerarVetorAleatorio(1000000);
    long startTime = System.currentTimeMillis();
    mergeSort(vec);
    long endTime = System.currentTimeMillis();
    System.out.println("Tempo: " + (endTime - startTime) + " ms");

//    for (int i = 0; i < vec.length; i++) {
//        System.out.print(vec[i] + " \n");
//    }
}
