Algoritmo diferentes_funciones
	Definir entrada, opcion1 como entero
	Escribir "Elige una de estas opciones: "
	Escribir "1- Ropa con descuento"
	Escribir "2- "
	Escribir "3- salir "
	leer entrada
	
	Segun entrada Hacer
		1:
			Escribir "¿Que quieres saber si tiene descuento?"
			Escribir "1- Chaquetas"
			Escribir "2- Calzado"
			Escribir "3- Camisetas"
			Escribir "4- Pantalones"
			Escribir "5- Salir"
			leer opcion1
			si opcion1 = 1 Entonces
				escribir "Las chaquetas no tienen descuentos"
			SiNo
				si opcion1 = 2 Entonces
					escribir "El calzado no tiene descuento"
				SiNo
					si opcion1 = 3 Entonces
						escribir "Las camisetas tienen un 40% de descuento"
					SiNo
						si opcion1 = 4 Entonces
							escribir "Los pantalones no tiene descuento"
						SiNo
							escribir "Se ha cerrado sesión"
						FinSi
					FinSi
				FinSi
				
			FinSi
		2:
			
		De Otro Modo:
			Escribir "Se ha cerrado la sesión"
	FinSegun

FinAlgoritmo
