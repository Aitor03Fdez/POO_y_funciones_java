SubProceso tablaMultiplicar(pnum)
	definir total Como Entero
	total = 0
	
	para i = 1 hasta 10 con paso 1 Hacer
		total = i * pnum
		escribir pnum " x " i " = " total 
	FinPara
	
FinSubProceso
Algoritmo tablademultiplicar
	definir num Como Entero
	leer num
	tablaMultiplicar(num)
FinAlgoritmo
