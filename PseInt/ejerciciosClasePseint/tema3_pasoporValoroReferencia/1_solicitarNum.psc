SubProceso aumentoEn10(referencia, pnum)
	pnum = pnum + 10
	escribir "Tu número aumentado en 10 es: " pnum
FinSubProceso

Algoritmo solicitarNum
	definir num como entero 
	escribir "Dame un número"
	leer num
	aumentoEn10(referencia, num)
	escribir "Este es es el antes del procedimiento: " num
FinAlgoritmo
