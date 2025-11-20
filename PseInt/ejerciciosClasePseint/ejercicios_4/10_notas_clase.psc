Algoritmo notas_clase
	Definir nota, contador, alumnos, suma, media, max, min como real
	contador = 0
	suma = 0
	max = 0 
	min = 10
	aprobados = 0
	suspensos = 0
	Repetir
		Escribir "Dime la nota"
		leer nota
		si nota >= 0 Entonces
			contador = contador + 1
			suma = suma + nota 
			si nota > max Entonces
				max = nota 
			FinSi
			si nota < min Entonces
				min = nota
			FinSi
			si nota >= 5 Entonces
				aprobados = aprobados +1
			FinSi
			si nota <= 5 entonces 
				suspensos = suspensos + 1
			FinSi
		FinSi
	Hasta Que nota <= 0 o contador = 30 
	escribir "Ya no hay mas alumnos"
	media = suma / contador 
	escribir "La media de clase es: " media
	escribir "La nota maxima es: " max " y la minima es: " min
	Escribir "han aprobado: " aprobados " alumnos y han suspendido: " suspensos " alumnos"
FinAlgoritmo
