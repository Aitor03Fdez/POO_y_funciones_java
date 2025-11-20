Algoritmo suma_cinco_numeros
    definir num como entero 
    definir cantidad como entero
    definir veces como entero
	
    cantidad = 0
    veces = 0
	
    Escribir "Dame un número:"
    Leer num
    cantidad = cantidad + num
    veces = veces + 1
	
    si veces < 5 entonces
        Escribir "Dame otro número:"
        Leer num
        cantidad = cantidad + num
        veces = veces + 1
		
        si veces < 5 entonces
            Escribir "Dame otro número:"
            Leer num
            cantidad = cantidad + num
            veces = veces + 1
			
            si veces < 5 entonces
                Escribir "Dame otro número:"
                Leer num
                cantidad = cantidad + num
                veces = veces + 1
				
                si veces < 5 entonces
                    Escribir "Dame otro número:"
                    Leer num
                    cantidad = cantidad + num
                    veces = veces + 1
					
                    Escribir "La suma es: ", cantidad
                sino
                    Escribir "La suma es: ", cantidad
                finSi
            sino
                Escribir "La suma es: ", cantidad
            finSi
        sino
            Escribir "La suma es: ", cantidad
        finSi
    sino
        Escribir "La suma es: ", cantidad
    finSi
FinAlgoritmo

