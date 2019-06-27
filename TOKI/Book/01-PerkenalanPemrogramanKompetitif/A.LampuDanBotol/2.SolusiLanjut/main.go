package main

import (
	"fmt"
)

func main() {
	var N int64
	fmt.Scanln(&N)
	num := N

	divisorCount := 1
	for i := int64(2); i*i <= N; i++ {
		factorCount := 0
		for num % i == 0 {
			factorCount++
			num /= i
		}

		divisorCount *= (1 + factorCount)
	}

	if num > 1 {
		divisorCount *= 2
	}

	if (divisorCount % 2 == 0) {
		fmt.Println("lampu mati")
	} else {
		fmt.Println("lampu menyala")
	}
}