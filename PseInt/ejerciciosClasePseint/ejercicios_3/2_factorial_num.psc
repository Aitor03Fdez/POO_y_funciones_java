Algoritmo factorial_num
	definir num, factorial, i como entero
	escribir "Dame un número"
	leer num
	
	factorial = 1
	i = 1
	mientras i <= num Hacer
		factorial = factorial * i 
		i = i + 1
	FinMientras
	escribir "El factorial de: " num " es: " factorial 
FinAlgoritmo
