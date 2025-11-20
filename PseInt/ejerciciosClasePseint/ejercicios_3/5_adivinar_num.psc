Algoritmo adivinar_num
	Definir numAdivinar Como Entero
	Definir num Como Entero
	Definir intentos Como Entero
	
	numAdivinar = azar(50) + 1
	intentos = 0
	escribir numAdivinar
	Mientras intentos < 6 y num <> numAdivinar Hacer
		Escribir "Dime un número entre 1 y 50:"
		Leer num
		intentos = intentos + 1
		
		Si num > numAdivinar Entonces
			Escribir "El número es menor"
		SiNo
			Si num < numAdivinar Entonces
				Escribir "El número es mayor"
			FinSi
		FinSi
	FinMientras
	
	Si num = numAdivinar Entonces
		Escribir "Has adivinado el número en " intentos " intentos"
	SiNo
		Escribir "No tienes mas intentos. El número era " numAdivinar
	FinSi
FinAlgoritmo
