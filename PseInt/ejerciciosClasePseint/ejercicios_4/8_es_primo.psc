Algoritmo es_primo
	definir num Como Entero
	Escribir "Dime un numero"
	leer num
	divisor = 0
	
	para i = 1 Hasta num con paso 1 Hacer
		si num mod i = 0 Entonces
			divisor = divisor + 1
		FinSi
	FinPara
	
	si divisor = 2 Entonces
		escribir "Es primo"
	SiNo
		escribir "No es primo"
	FinSi
FinAlgoritmo
