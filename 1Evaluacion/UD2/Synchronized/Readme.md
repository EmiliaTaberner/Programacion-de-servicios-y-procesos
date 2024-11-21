# Ejecicios UD.2 SINCRONIZAR HILOS (PSP)

### 1 Ejercicio.
````
    Vamos a simular en Java un programa para sabotear los servidores de la sede de defensa del gobierno de Estados 
    Unidos consolo unas líneas de código malicioso.
    Para ello,el programa solicitará al usuario el número de virus a inyectar. Por cada uno de ellos, el programa 
    funcionará del siguiente modo: 
    
        • Lanzará un hilo de ejecución (codificado en forma de expresión lambda) informando el número de virus (Virus1,
        Virus2,etc...). 
        • En la misma línea, se mostrará una barra de progreso en la que, en cada segundo, acumularemos de forma 
        aleatoria un 5 o un 10, para de esa forma dotar de más realismo, si cabe. 
        • Cuando sumemos un 5 al total, imprimiremos una “X” en la barra de progreso y cuando sumemos 10, 
        imprimiremos “XX”, esperando medio segundo entre impresión e impresión para ir viendo en tiempo real como se va 
        completando. 
        • Cuando lleguemos al 100%, imprimiremos el valor “100%” al lado de la barra de progreso y pasaremos a darle el 
        control al siguiente virus, que se comportará exactamente igual. 
        • Cuando se hayan cargado todos los virus, el programa imprimirá el mensaje “HAS SIDO INFECTADO”. Un ejemplo de
        ejecución sería el siguiente: si queremos cargar 4 virus en el Pentágono, primero se carga el virus1, luego el 
        virus2... 
            
        -------------------------------------------------
           
            Introduzca numero de virus a cargar... 
            3 
            
            Virus1: XXXXXXXXXXXXXXXXXXXX100% 
            Virus2: XXXXXXXXXXXXXXXXXXXX100% 
            Virus3: XXXXXXXXXXXXXXXXXXXX100% 
            HAS SIDO INFECTADO!    
    
````
### 2 Ejercicio.
````
    Sigamos con otro ejemplo sencillo para ilustrar la necesidad de sincronización. Vamos a ver una aplicación que 
    modifica, através de 2 hilos distintos, el valor de un contador. En primer lugar, creamos un objeto de clase 
    Contador que será compartido entre hilos.
    
    --------------------------------------
    public class Contador{ 
        int valor;
         
        public Contador(intvalor){ 
            this.valor=valor; 
        } 
        public void incrementar(){ 
            valor++; 
        } 
        public void decrementar(){ 
            valor--; 
        } 
        public int getValor(){ 
            return valor;
        }
    }
    ---------------------------------------
    
    Y el programa principal, el cual creará 2 tipos de hilos: uno que incrementará el contador en un bucle y otro que 
    lo decrementará.
    Los hilos para incrementar y decrementar los podéis desarrollar de dos maneras bien creando sendas clase que hereden
    de Thread o bien con funciones anónimas.
    Usando la sentencia synchronized, consigue la sincronización de forma que, cada vez que ejecutes el programa éste 
    siempre de 100 como resultado.

````
### 3 Ejercicio.
````
    Vamos a crear un programa que los Empleados digan buenos dias cuando entre el jefe...
    Para ello tendremos tres clases: 
    
    • La clase Principal 
    
    • La clase Empleado 
        String nombre; 
        Saludo saludo; 
        boolean esJefe; 
    
    • La clase saludo extends Thread El método run() comprobará si es el hilo jefe o empleado para saludar... 
        
        Con los métodos: 
            • SaludoEmpleado(String nombre) 
            • Saludo Jefe(String nom)    

````
### 4 Ejercicio.
````
    Crearemos 2 tipos de hilos: 
    • uno Productor que pondrá algunos datos (por ejemplo, un número entero) en un objeto dado (lo llamaremos 
      DatoCompartido), 
    • y otro Consumidor que obtendrá estos datos. 
    
    La clase DatoCompartido será: 
    public class DatoCompartido{ 
        int dato; 
        public int obtener(){ return dato; } 
        public void poner(intnuevoDato){ dato=nuevoDato; } 
    } 
    
    La ejecución debe de ser algo así: 
    Poner(1) 
    Obtener(1) 
    Poner(2) 
    Obtener(2) 
    ... 
    
    •Modificar el código para que el productor introduzca los elementos en un ArrayList datos = new ArrayList<Integer> 
    (limite); y el consumidor los vaya borrando datos.remove(.... 
        
    
````
### 5 Ejercicio.
````
     Crea un proyecto llamado Lavavajillas. Vamos a simular el proceso de lavado de platos en casa, cuando alguien 
     lava los platos y otro más los seca. 
        
        Crea las siguientes clases: 
            • Una clase Plato con solo un atributo entero: el número de plato (para identificar los diferentes platos). 
            
            • Una clase PilaPlatos que almacenará hasta 5 platos. Tendrá un método lavar que pondrá un plato en la pila 
              (si hay espacio disponible) y un método secar que cogerá un plato de la pila (si hay alguno). Tal vez 
              necesites un parámetro Plato en el método lavar para añadir un plato a la pila. 
        
            • Un hilo Friega que recibirá un número N como parámetro y un objeto de tipo PilaPlatos. En su método run 
              pondrá (lavará) N platos en la pila, con una pausa de 50ms entre cada plato. 
            
            • Un hilo Seca que recibirá un número N como parámetro y un objeto de tipo PilaPlatos. En su método run, 
              sacará (secará) N platos de la pila, con una pausa de 100ms entre cada plato. 
            
            • La clase principal creará el objeto PilaPlatos y un hilo de cada tipo (Friega y Seca). Tendrán que 
              lavar/secar 20 platos coordinadamente.
              

````
