Algoritmo numero_negativo
	definir num, total, cantidad, media Como real
	Escribir "Dime un número"
	total = 0
	cantidad = 0
	
	mientras num >= 0 hacer 
		leer num
		si num >=0 Entonces
			total = total + num
			cantidad = cantidad + 1
		FinSi
	FinMientras
	media = total / cantidad 
	Escribir "La media de todos los numeros positivos dados es: " media
FinAlgoritmo
