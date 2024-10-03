# Ejecicios UD.1 CREACIÓN DE PROCESOS (PSP)

### 5 Ejercicio.
````
Crea unproyecto llamado ProcessListPNG con un programa que le pida al usuario que introduzca 
unaruta (por ejemplo, /micarpeta/fotos) y luego inicie un proceso que muestre una lista de todas 
las imágenes PNG encontradas en esta ruta.
    
````
### 6 Ejercicio.
````
Crea un proyecto llamado ProcessKillNotepad con un programa que arranque el bloc de notas o 
cualquier editor de texto similar desde tu sistema operativo. Luego, el programa esperará 
10 segundos a que “finalice” el subproceso y, transcurrido ese periodo, será destruido. 
Para dormir 10 segundos, utilice estas instrucciones: Thread.sleep(10000);
````
### 7 Ejercicio.
````
Crear una clase Java que sea capaz de sumar todos los números comprendidos entre dos valores 
incluyendo ambos valores. Para resolverlo crearemos una clase Sumador que tenga un método que 
acepte dos números n1 y n2 y que devuelva la suma de todo el intervalor. Además, incluiremos 
un método main que ejecute la operación de suma tomando los números de la línea de comandos
(esdecir, se pasan como argumentos al main). Una vez hecha la prueba de la clase Sumador y 
crearemos una clase Lanzador que sea capaz de lanzar varios procesos utilizando el ProcessBuilder.

````
### 8 Ejercicio.
````
Crea una clase que me pase una cadena a mayúsculas. Invocalo desde un proceso pasandole la cadena. 
Haz el mismoe jercicio pero Averiguando si es palindromo, “Anitalavalatina”. 
• Mejora: Crear un 3 archivos de tal manera qué: 
    1. palindromo.txt guarda las palabras que son palidromos, (ala, somos,polop,...). 
    2. Nopalindromo.txt las palabras que no son palidromos. 
    3. todas.txt todas las palabras que introducimos.
    
````
### 9 Ejercicio.
````
Vamos a codificar 2 programas Java que se encargarán de interaccionar con el navegador Mozilla 
FireFox del siguiente modo:

    • Leerweb: solicitará al usuario hasta un máximo de 3 páginas webs que quiera abrir en 
    distintas pestañas de Mozilla. Estas paginas webs las introducirá el usuario en una sola 
    línea e irán separadas por el carácter arroba “@”.
    
Por ejemplo, imaginemos que quiere visitar las páginas relacionadas con la Universidad de 
Valencia, la de Alicante y la de Castellón, el usuario debería introducir la siguiente cadena:
www.uv.es@www.uji.es@www.ua.es Una vez el usuario introduzca esta información, el proceso 
“Leerweb” se encargará de reenviarla llamando al proceso “Visitaweb”.

    • Visitaweb: el proceso recogerá la información que el usuario introdujo en “Leerweb” y 
    abrirá las webs en Mozilla. El proceso estará preparado para:
    
    – Recibir 1 web: Abrirá Mozilla con esa web 
    – Recibir 2 webs: Abrirá Mozilla con esas 2 webs,una en cada pestaña.
    – Recibir 3 webs: Abrirá Mozilla con esas 3 webs,una en cada pestaña.
    – Recibir > 3 webs: Informará del ERROR (demasiadas webs!) y finalizará el programa. 
    LeerwebVisitaweb

````
### 10 Ejercicio.
````
Vamos a codificar en Java un programa “Principal.java” que solicitará al usuario una dirección 
de email y la enviará al proceso “ValidaMail.java”, que se encargará de validarlo.

Si el email no supera la validación en 3 ocasiones, el programa “Principal.java” informará al 
usuario de esta circunstancia y finalizará. Por otro lado, si “ValidaMail” decide que el mail 
es correcto, el programa “Principal.java” felicitará al usuario y también finalizará.

Las 4 reglas de validación que tendrá que efectuar “ValidaMail” sobre el email recibido son:

    1. El email ha de contener el carácter “@”. Si no contuviera este carácter, debería imprimir 
    el mensaje: ERROR: El email no contiene una @! 
    
    2. Detrás de la “@”, el email ha de tener un segundo identificador (“hotmail.com” o 
    “gmail.org” p ej.). Si directamente detrás de la “@, no tenemos nada,debería imprimir el 
    mensaje: ERROR: No existe segundo identificador! 
    
    3. Antes de la “@”, el email ha de tener un primer identificador con una longitud mínima de 
    3 caracteres. Si no se cumpliera esta condición, debería imprimir el mensaje:
    ERROR: El primer identificador ha de tener una longitud mínima de 3 caracteres! 
    
    4. Si el dominio del email no es ni “.com”., ni “.es”, ni “.org”, debería imprimir el mensaje: 
    ERROR: El dominio no es ni com/es/org! Si el email supera estas 4 validaciones,entonces el 
    email es válido.

````