Algoritmo contraseña
    definir contra como cadena
	
    escribir "Dime la contraseña (intento 1)"
    leer contra
	
    si contra = "admin123" entonces
        escribir "Acceso concedido"
		sino
			escribir "Dime la contraseña (intento 2)"
			leer contra
			
			si contra = "admin123" entonces
				escribir "Acceso concedido"
				sino
					escribir "Dime la contraseña (intento 3)"
					leer contra
					
					si contra = "admin123" entonces
						escribir "Acceso concedido"
						sino
							escribir "Acceso denegado"
					FinSi
			FinSi
	FinSi
FinAlgoritmo

