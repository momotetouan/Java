public class TriRapide {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 3, 6, 8};
        quickSort(arr, 0, arr.length - 1);

        System.out.println("Tableau trié :");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Partitionnement du tableau
            int pivotIndex = partition(arr, low, high);

            // Trier les sous-tableaux récursivement
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;

                // Échanger arr[i] et arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Échanger arr[i+1] et arr[high] (le pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}
