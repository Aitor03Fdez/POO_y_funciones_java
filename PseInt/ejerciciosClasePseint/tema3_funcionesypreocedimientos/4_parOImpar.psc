Funcion esPar <- esPar_impar(pvalor)
    Si pvalor MOD 2 = 0 Entonces
        esPar = Verdadero
    Sino
        esPar = Falso
    FinSi
FinFuncion

algoritmo parOImpar
    Definir num Como Entero
    Definir resultado Como Logico
	
    Escribir "Ingresa un número entero:"
    Leer num
	
    resultado = esPar_impar(num)
	
    Si resultado Entonces
        resultado = verdadero
    Sino
        resultado = falso
    FinSi
	
	escribir resultado
FinAlgoritmo

