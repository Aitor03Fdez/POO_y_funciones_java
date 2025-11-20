SubProceso nombrePerso(pnombre)
	escribir "Hola, " pnombre ", ¡Bienvenido a Pseint!"
FinSubProceso


Algoritmo nombrePersonalzado
	definir nombre, resultado Como Cadena
	escribir "Dime tu nombre"
	leer nombre
	nombrePerso(nombre)
FinAlgoritmo
