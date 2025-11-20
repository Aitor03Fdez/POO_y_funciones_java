Algoritmo compara_dos_numeros
	Definir num1 Como Entero
	Definir num2 Como Entero
	Definir resultadoMayor Como logico
	Definir resultadoMenor Como Logico
	Definir resultadoIgual Como Logico
	Definir resultadoDistinto Como Logico
	
	Leer num1
	Leer num2
	
	resultadoMayor = num1 > num2
	resultadoMenor = num2 > num1
	resultadoIgual = num1 == num2
	resultadoDistinto = num1 <> num2
	
	escribir "Si el primero es mayor que el segundo es: " resultadoMayor " si es menor " resultadoMenor " si es igual " resultadoIgual " y si es distinto es " resultadoDistinto
	
FinAlgoritmo
