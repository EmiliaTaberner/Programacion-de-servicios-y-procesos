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


````
### 6 Ejercicio.
````


````