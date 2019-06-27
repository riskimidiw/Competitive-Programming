package main

import (
	"fmt"
)

func insertionSort(arr []int, n int) {
	for i := 1; i < n; i++ {
		j := i
		for j > 0 && arr[j] < arr[j-1] {
			arr[j], arr[j-1] = arr[j-1], arr[j]
			j--
		}
	}
}

func main() {
	arr := []int {5,4,3,21,2}
	insertionSort(arr, len(arr))

	fmt.Println(arr)
}