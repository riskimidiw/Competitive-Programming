package main

import (
	"math"
	"fmt"
)

func main() {
	var N int64
	fmt.Scanln(&N)

	s := int64(math.Round(math.Sqrt(float64(N))))

	if s * s != N {
		fmt.Println("lampu mati")
	}else {
		fmt.Println("lampu menyala")
	}
}