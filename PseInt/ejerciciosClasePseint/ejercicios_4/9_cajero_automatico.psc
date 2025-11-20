Algoritmo cajero_automatico
	definir pin, opc, contador, saldo, ingreso, retirada Como Entero
	contador = 0
	saldo = 1000
	
	Repetir
		Escribir "Dime la contraseña"
		leer pin
		contador = contador + 1
		si pin = 1234 Entonces
			repetir
				escribir "Seleccione una opción"
				escribir "1- Consulta saldo"
				escribir "2- Ingresar dinero"
				escribir "3- Retirar dinero"
				escribir "4- Salir"
				leer opc
				segun opc Hacer
					1:
						escribir "Su saldo es de: " saldo "$"
					2:
						escribir "¿Cuanto desea ingresar?"
						leer ingreso
						saldo = saldo + ingreso
						escribir "Su nuevo saldo es de: " saldo
					3:
						escribir "¿Cuanto dinero desea retirar?"
						leer retirada
						saldo = saldo - retirada 
						Escribir "Su nuevo saldo es de: " saldo
					De Otro Modo:
						Escribir "Esa opción no esta contemplada"
				FinSegun
			Hasta Que opc = 4
			
			escribir "Se ha cerrado la sesión"
		FinSi
	Hasta Que pin = 1234 o contador = 3
	
FinAlgoritmo
