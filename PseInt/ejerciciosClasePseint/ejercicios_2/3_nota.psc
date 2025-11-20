Algoritmo nota_switch
	Definir nota Como Entero
	Leer nota
	Según nota Hacer
		0, 1, 2, 4:
			Escribir 'Suspenso'
		5,6:
			Escribir 'aprobado'
		7, 8:
			Escribir 'notable'
		9, 10:
			Escribir 'Sobresaliente'
		De Otro Modo:
			Escribir 'Nota no valida'
	FinSegún
FinAlgoritmo
