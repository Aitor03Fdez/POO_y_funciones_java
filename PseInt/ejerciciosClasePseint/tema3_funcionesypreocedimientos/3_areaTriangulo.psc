Funcion varFun <- baAltTiangulo ( b,h )
	varFun = b * h / 2
Fin Funcion



Algoritmo areaTriangulo
	definir b, h, resultado como entero
	escribir "Dame la base del triangulo"
	leer b
	escribir "Dame la altura del triangulo"
	leer h
	
	resultado = baAltTiangulo(b,h)
	escribir "El area del triangulo es: " resultado
FinAlgoritmo
