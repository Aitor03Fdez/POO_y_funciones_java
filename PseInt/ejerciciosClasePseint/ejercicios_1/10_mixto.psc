Algoritmo mixto
	definir num1 Como Real
	definir num2 Como Real
	definir resultado1 Como real
	definir resultadoMayor Como logico
	definir resultadoMenor Como logico
	definir resultadoIgual Como logico
	definir concatenacion Como caracter
	definir resultado3 Como caracter
	
	leer num1
	leer num2
	
	resultado1 = num1 + num2
	resultadoMayor = num1 > num2
	resultadoMenor = num2 > num1
	resultadoIgual = num1 = num2
	concatenacion = Concatenar(ConvertirATexto(num1),ConvertirATexto(num2))
	resultado3 = Concatenar(concatenacion,ConvertirATexto(num1))
	
	escribir "La suma de ambos números es: " resultado1 " y si el numero mayor es el primero es " resultadoMayor " si es el segundo es " resultadoMenor " y si son iguales es " resultadoIgual " y si los concateno es " resultado3
FinAlgoritmo
