public class Quicksort {
 //quicksort
    public static void quicksort(int[] v, int inicio, int fim) {
    int i = inicio;
    int j = fim;
    int pivo = v[(i + j) / 2];
    while (i <= j) {
    while (v[i] < pivo) {
        i++;
    }
    while (v[j] > pivo) {
        j--;
    }
    if (i <= j) {
        int aux = v[i];
        v[i] = v[j];
        v[j] = aux;
        i++;
        j--;
    }
    }
    if (inicio < j) {
    quicksort(v, inicio, j);
    }
    if (i < fim) {
    quicksort(v, i, fim);
    }
    }
}