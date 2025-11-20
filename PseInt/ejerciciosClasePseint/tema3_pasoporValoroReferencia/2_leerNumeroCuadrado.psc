SubProceso cuadradodDe(pnum) 
	pnum = pnum * 2
	escribir "Este es despues del procedimiento: " pnum
FinSubProceso


Algoritmo leerNumeroCuadrado
	definir num Como Entero
	escribir "Dime un número"
	leer num
	cuadradodDe(num)
	escribir "Este es el valor original: " num
FinAlgoritmo
