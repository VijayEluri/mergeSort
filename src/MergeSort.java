public class MergeSort {
	public int data[] = { 23, 342, 42, 83, 3288, 3288, 42, 6843, 424, 341,
			83242 };

	public void merge_sort(int low, int high) {
		int mid;
		if (low < high) {
			mid = (low + high) / 2;
			merge_sort(low, mid);
			merge_sort(mid + 1, high);
			merge(low, mid, high);
		}
	}

	public void merge(int low, int mid, int high) {
		int h, i, j, k;
		int b[] = new int[50];
		h = low;
		i = low;
		j = mid + 1;

		while ((h <= mid) && (j <= high)) {
			if (data[h] <= data[j]) {
				b[i] = data[h];
				h++;
			} else {
				b[i] = data[j];
				j++;
			}
			i++;
		}
		if (h > mid) {
			for (k = j; k <= high; k++) {
				b[i] = data[k];
				i++;
			}
		} else {
			for (k = h; k <= mid; k++) {
				b[i] = data[k];
				i++;
			}
		}
		for (k = low; k <= high; k++)
			data[k] = b[k];
	}

	public MergeSort() {
		merge_sort(1, data.length - 1);
		for (int i = 1; i <= data.length - 1; i++)
			System.out.print(data[i] + ",");
	}

	public static void main(String[] args) {
		new MergeSort();
	}
}
