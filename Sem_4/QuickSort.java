package Sem_4;

import java.util.Arrays;

class Main
{
	public static void swap (int[] arr, int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

    // Разделение
	public static int partition(int[] a, int start, int end)
	{
        // Выбираем крайний правый элемент в качестве опорного элемента массива
		int pivot = a[end];

        // элементы, меньшие точки поворота, будут перемещены влево от `pIndex`
        // элементы больше, чем точка поворота, будут сдвинуты вправо от `pIndex`
        // равные элементы могут идти в любом направлении
		int pIndex = start;

        // каждый раз, когда мы находим элемент, меньший или равный опорному,
        // `pIndex` увеличивается, и этот элемент будет помещен
        // перед разворотом.
		for (int i = start; i < end; i++)
		{
			if (a[i] <= pivot)
			{
				swap(a, i, pIndex);
				pIndex++;
			}
		}

        // поменять местами `pIndex` с пивотом
		swap(a, end, pIndex);

        // вернуть `pIndex` (индекс опорного элемента)
		return pIndex;
	}

    // Процедура быстрой сортировки
	public static void quicksort(int[] a, int start, int end)
	{
        // базовое условие
		if (start >= end) {
			return;
		}

        // переставить элементы по оси
		int pivot = partition(a, start, end);

        // повторяемся на подмассиве, содержащем элементов меньше, чем опорный
		quicksort(a, start, pivot - 1);

        // повторяем подмассив, содержащий элементов больше, чем опорный
		quicksort(a, pivot + 1, end);
	}

    // алгоритм Quicksort
	public static void main(String[] args)
	{
		int[] a = {9, -3, 5, 2, 6, 8, -6, 1, 3, -14, 7, 22, -2};

		quicksort(a, 0, a.length - 1);

        // выводим отсортированный массив
		System.out.println(Arrays.toString(a));
	}
}