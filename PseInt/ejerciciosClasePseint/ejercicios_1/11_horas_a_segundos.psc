Algoritmo horas_a_segundos
	Definir horaDada Como Cadena
    Definir horas, min, sec, resultado Como Entero
	
    Escribir "Dime la hora completa con los :"
    leer horaDada
	
    horas = ConvertirANumero(SubCadena(horaDada, 1, 2))
    min = ConvertirANumero(SubCadena(horaDada, 4, 5))
    sec = ConvertirANumero(SubCadena(horaDada, 7, 8))
	
    resultado = horas * 3600 + min * 60 + sec
	
    Escribir "Total de segundos pasados desde la hora dada " resultado
FinAlgoritmo
