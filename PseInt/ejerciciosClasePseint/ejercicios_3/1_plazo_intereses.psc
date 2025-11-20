Algoritmo plazo_intereses
	definir precio como entero
	definir resultado como entero
	precio = 5
	resultado = 0
	
	para i=0 hasta 11 con paso 1 hacer
		resultado = resultado + precio
		precio = precio * 2
	FinPara
	Escribir resultado
FinAlgoritmo
