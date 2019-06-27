package main

import (
	"fmt"
)

func main() {
	var N int64
	fmt.Scanln(&N)

	divisorCount := 0
	for i := int64(1); i <= N; i++ {
		if N % i == 0 {
			divisorCount++
		}
	}

	if divisorCount % 2 == 0 {
		fmt.Println("lampu mati")
	}else {
		fmt.Println("lampu menyala")
	}
}