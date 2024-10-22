# Ejecicios UD.2 INTRODUCCIÓNALOSHILOS (PSP)

### 1 Ejercicio.
````
    Crea un programa HiloEjemplo1.java que lanze n hilos con su nombre y que ejecuten un contador enel métodorun. 
    
        CREANDO HILO:Hilo 1 
        CREANDO HILO:Hilo 2 
        CREANDO HILO:Hilo 3 
        Hilo:Hilo 1 = 0 
        Hilo:Hilo 1 = 1 
        Hilo:Hilo 1 = 2 
        Hilo:Hilo 2 = 0 
        Hilo:Hilo 2 = 1 
        Hilo:Hilo 2 = 2 
        Hilo:Hilo 3 = 0 
        Hilo:Hilo 3 = 1 
        Hilo:Hilo 3 = 2 
        3 HILOS INICIADOS...y finalizados
    
````
### 2 Ejercicio.
````
    Vamos a crear un programa Simple1.java que lance 5 hilos. Cada hilo incrementará una variable contador de tipo 
    entero en 1000 unidades. Esta variable estará compartida por todos los hilos. Comprueba el resultado final de 
    la variable y reflexiona sobre el resultado.

````
### 3 Ejercicio.
````
        Vamos a crear un programa que actualize el estado de la cuenta corriente cada vez que un usuario retire dinero, 
        para ello tendremos:
            • La clase Cuenta que constará de:
                – Como parámetro int saldo => Saldo de la cuenta
                – int getSaldo(); Devolverá el saldo.
                – void restar(int cantidad) Cuando retiramos dinero
                – void RetirarDinero(int cant, String nom) 
                    * Si el saldo >= cant Saldrá un mensaje 'SE VA A RETIRAR SALDO (ACTUAL ES: ____);' y se restará de la cantidad. 
                    * Si no mostrará el mensaje 'No puede retirar dinero, NO HAY SALDO( saldo actual)'
            • La clase Principal o main donde instanciaremos a la clase Cuenta con una cantidad x, además instanciaremos a difrentes 
              hilos de ejecución con los nombres de usuarios y la variable la clase Cuenta. 
            • La clase SacarDinero tendrá:
                – Como parámetro private Cuenta c. Referencia a la clase cuenta.
                – y en el método run() se invocará al método RetirarDinero de la clase Cuenta, donde le pasaremos el saldo y el 
                  nombre... La ejecución debe de ser algo como: 
                  ““Resultado: 
                  Ana: SE VA A RETIRAR SALDO(ACTUALES:40)
                  Juan: SE VA A RETIRAR SALDO(ACTUAL ES: 40) 
                  Juan retira =>10 ACTUAL(20) 
                  Ana retira =>10 ACTUAL(20) ““

````
### 4 Ejercicio.
````
        Supongamos que tenemos una carrera del gran premio de atletismo(la de 1500 metros).
        String[] corredores={“Hicham El Guerrouj”,“Noah Ngeny”,“Mohamed Farah”,“Bernard Lagat”,“Rashid Ramzi”, “Ryan Gregson”, 
        “Fermín Cacho”, “Teddy Flack” }; 
        Tenemos que crear la clase corredor, que tendrá que implementar un bucle que cuente desde 0 a 1500 (una iteración por 
        metro recorrido). Lanzaremos 8 hilos con los corredores del array. Cuando finalice el bucle, deberá mostrar un mensaje 
        por pantalla indicando el nombre del corredor y que ha finalizado (El corredor Fermín Cacho ha finalizado la prueba). 
        :::tip Si los corredores realizan la carrera muy rápido,se puede introducir, dentro del bucle, un pequeño lapso de 
        tiempo(5 o 10ms) de sueño, mediante el uso del método sleep. ::: 
        
            Ejemplo de salida esperada: 
            -------------------------------------------
            El corredor Teddy Flack ha terminado 
            El corredor Rashid Ramzi ha terminado 
            El corredor Hicham El Guerrouj ha terminado 
            El corredor Mohamed Farah ha terminado 
            El corredor Fermín Cacho ha terminado 
            El corredor Bernard Lagat ha terminado 
            El corredor Ryan Gregson ha terminado 
            El corredor Noah Ngeny ha terminado
    
````
### 5 Ejercicio.
````
        Vamos a realizar un programa que simule la competición de varios coches mediante la ejecución de hilos. La carrera 
        funcionará del siguiente modo: 
            • Se solicitará al usuario el número de coches que van a competir para, a continuación, pedir la marca de cada coche. 
              Además, a cada uno de ellos se le asignará automáticamente un número, es decir, el primer coche que demos de alta 
              tendrá el número 1,el segundo el número 2,etc.. 
            • Una vez tengamos los coches dados de alta, empezará la carrera lanzándose los hilos en ejecución, los cuales 
              correrán siguiendo estos pasos: 
              – Un coche calculará una distancia aleatoria entre 0 y 100
              – Esperará 1 segundo e imprimirá la distancia total recorrida. 
              – Si la distancia iguala o supera los 500 metros (1 vuelta en circuito indoor), entonces se informa que el coche ha
                finalizado. 
              Un ejemplo de ejecución sería el siguiente: 
              Introduzca numero de coches a competir: 3 
              Introduzca marca del coche 1: seat 
              Coche creado: seat(1) 
              Introduzca marca del coche 2: audi 
              Coche creado: audi(2) 
              Introduzca marca del coche 3: volkswagen 
              Coche creado: volkswagen(3) 
              Que empiece la carrera! 
              volkswagen(3) lleva recorrido 57km! 
              seat(1) lleva recorrido 55km! 
              audi(2) lleva recorrido 29km! audi(2) lleva recorrido 109km! 
              volkswagen(3) lleva recorrido 72km! 
              seat(1) lleva recorrido 96km! 
              audi(2) lleva recorrido 164km! 
              seat(1) lleva recorrido 149km! 
              volkswagen(3) lleva recorrido 150km! 
              audi(2) lleva recorrido 224km! 
              volkswagen(3) lleva recorrido 181km! 
              seat(1) lleva recorrido 172km! 
              audi(2) lleva recorrido 320km! 
              seat(1) lleva recorrido 199km! 
              volkswagen(3) lleva recorrido 236km! 
              audi(2) lleva recorrido 340km! 
              seat(1) lleva recorrido 233km! 
              volkswagen(3) lleva recorrido 242km! 
              audi(2) lleva recorrido 410km! 
              volkswagen(3) lleva recorrido 291km! 
              seat(1) lleva recorrido 289km! 
              audi(2) lleva recorrido 497km!
              ----------------------------------------------------------------------
              El audi(2) ha finalizado al recorrer 587km. 
              volkswagen(3) lleva recorrido 348km! 
              seat(1) lleva recorrido 310km! 
              seat(1) lleva recorrido 381km! 
              volkswagen(3) lleva recorrido 391km! 
              volkswagen(3) lleva recorrido 395km! 
              seat(1) lleva recorrido 470km!
              ----------------------------------------------------------------------
              El seat(1) ha finalizado al recorrer 526km. 
              volkswagen(3) lleva recorrido 480km! 
              volkswagen(3) lleva recorrido 485km!
              ----------------------------------------------------------------------
              El volkswagen(3) ha finalizado al recorrer 562km.

````
### 6 Ejercicio.
````
        Vamos a programar en Java la lectura del menú de un restaurante (menu.txt) que ofrece varios primeros, varios segundos 
        y varios postres. Para ello, tendremos 3 hilos que trabajarán del siguiente modo: 
            • Un hilo que lee de menu.txt solo los primeros (que vienen precedidos de la marca 1-) y los vuelca al archivo 
              primeros.txt 
            • Un hilo que lee de menu.txt solo los segundos (que vienen precedidos de la marca 2-) y los vuelca al archivo 
              segundos.txt 
            • Un hilo que lee de menu.txt solo los postres (que vienen precedidos de la marca 3-) y los vuelca al archivo 
              postres.txt 
              
            menu.txt 
            1-PRIMEROS 
            1-Macarrones Carbonara 
            1-Paella Valenciana 
            1-Gazpacho 
            1-Crema de Verduras 
            2-SEGUNDOS 
            2-Cachopo 
            2-Chuleton 
            2-Bacalao 
            2-Croquetas 
            3-POSTRES 
            3-Coulant 
            3-Brownie 
            3-Tarta de queso 
            3-Flan 
            
            El objetivo es que cada hilo trabaje solo una parte del menú y que acabe escribiendo en su fichero pero sin el rótulo 
            correspondiente y sin el número y el guión que precede a cada plato. Es decir, en el fichero primeros.txt solo debería
            aparecer las siguientes lineas:
             
            Macarrones carbonara 
            Paella valenciana 
            Gazpacho 
            Crema de verduras 
            
            Además, el programa imprimirá en cada momento el hilo que está actuando y qué está escribiendo. 
            Un ejemplo de ejecución sería el siguiente, que utiliza el menú.txt En la consola, al finalizar el programa, se 
            mostrarán las siguientes acciones: 
            
            El hilo2 escribe...Cachopo 
            El hilo1 escribe...Macarrones Carbonara 
            El hilo2 escribe...Chuleton 
            El hilo1 escribe...Paella Valenciana 
            El hilo2 escribe...Bacalao 
            El hilo3 escribe...Coulant 
            El hilo1 escribe...Gazpacho 
            El hilo2 escribe...Croquetas 
            El hilo3 escribe...Brownie 
            El hilo3 escribe...Tarta de queso 
            El hilo1 escribe...Crema de Verduras 
            El hilo3 escribe...Flan

````
### 7 Ejercicio.
````
        Se trata de generar un programa para la reserva de entradas a los usuarios. Los usuarios serán 10 hilos concurrentes y se le 
        podrá asignar a cada uno entre 1 y 10 entradas, asignadas aleatorimente. Tendremos variables compartidas: 
            • entradasDisponibles: Número total de entradas inicialmente disponibles (100). 
            • entradasVendidas: Variable estática que contabiliza el total de entradas vendidas entre todos los hilos.
        
        El método reservaEntrada tomará como parámetros el nombre del cliente (hilo) y la cantidad de entradas que desea reservar. 
        Si hay suficientes entradas disponibles, actualiza el número de entradas restantes y añade las entradas vendidas al total 
        acumulado. Si no hay suficientes entradas, imprime un mensaje de que no quedan entradas.
        
        En el método principal, se crean 10 hilos, cada uno representando un cliente diferente que intentará hacer una reserva. 
        Tras ejecutar los hilos, el programa espera 1 segundo para dar tiempo a que todos los hilos completen su ejecución antes de 
        mostrar el total de entradas vendidas.
        
        6 reservadas para Cliente 1 
        10 reservadas para Cliente 7 
        10 reservadas para Cliente 5 
        5 reservadas para Cliente 8 
        2 reservadas para Cliente 6 
        6 reservadas para Cliente 10 
        10 reservadas para Cliente 2 
        10 reservadas para Cliente 9 
        9 reservadas para Cliente 3 
        7 reservadas para Cliente 4 
        Total entradas vendidas: 75
        

````
### 8 Ejercicio.
````
        Utilizando funciones lambda creamos hilos. Uno que me genere un listado de números pares y otro de impares.
````
### 9 Ejercicio.
````

````
