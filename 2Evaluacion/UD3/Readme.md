# Ejecicios UD3. Programación de comunicaciones en red

### 1 Ejercicio.
````
    Para poner en práctica todos los métodos de la clase InetAddress, lleva a cabo un programa en Java que devuelva 
    toda la información del “localhost” y de una dirección web como, por ejemplo, “www.google.es”, de la cual 
    obtendremos además todas las direcciones IP asociadas.
    
````
### 2 Ejercicio.
````
    Para poner en práctica los métodos de la clase URL,lleva acabo las 3 formas de instanciar un objeto URL sobre la 
    web "http://docs.oracle.com/" 
        - Método1: pasándole directamente la URL "http://docs.oracle.com/" 
        - Método2: pasándole el protocolo http, el nombre "docs.oracle.com" y el directorio "/javase /23" 
        - Método3: pasándole todo lo del Método2 y además el puerto 123 entre el nombre y el directorio. 
        Por cada uno de los objetos creados URL llamaremos a todos los métodos de la clase.

````
### 3 Ejercicio.
````
    Sacar los titulares de un diario, “www.epais.es”, teniendo en cuenta que se incri¡sutan en el tag <h2 ...>.

````
### 4 Ejercicio.
````
    Un amigo mio me ha encargado el siguiente trabajo partiendo de su web. Vamos a desarrollar una aplicación en Java
    que procesará un fichero de texto (superheroes.txt) con información sobre superhéroes. Este fichero contendrá 
    registros con los siguientes campos separados por punto y coma (;)
    
        • Id. desuperhéroe: que será un número de 3 cifras que irá precedido de una D si el superhéroe es de DC o de 
            una ‘M’ si es de Marvel (Por ej. utilizamos D001 para identificar a Batman). 
        • Nombredelsuperhéroe. 
        • Identidad secreta. 
        • Descripción del superhéroe.
    
    Con toda esta información, se pretende que el programa Java genere de forma automática 2 páginas webs: marvel.html 
    y dcweb.html con información de héroes de Marvel y de DC respectivamente.
    
    La información en estas páginas web se representará en forma de tabla, de forma que en cada fila insertaremos el 
    nombre del héroe, su identidad secreta, la descripción y una foto del mismo. Esta foto la obtendremos de esta 
    página web, donde tenemos imágenes de todos los superhéroes.
    
    El problema que tenemos es que la página web está protegida contra descargas de imágenes, ya que tiene 
    deshabilitado el botón derecho sobre la misma. La única forma que tenemos de acceder al código fuente de la misma 
    y obtener la ruta de las imágenes es através del método “openStream()” de la clase URL de Java.
    
    Además, cada imagen lleva asociado en su atributo “class” el mismo identificador que tenemos en el fichero de 
    entrada, para que podamos cruzar la información.
    
    Cuando finalices el programa en Java, deberías tener 2 páginas web con el siguiente aspecto: 
        • marvel.html: con información sobre el Capitán América, Spiderman, Iron Man, Thor y Hulk. 
        • dcweb.html: con información sobre Batman, Flash, Superman, Wonder Woman y Aquaman.
    
````
### 5 Ejercicio.
````
    Realiza una clase TCPejemplo1Servidor que recibe un mensaje de un programa cliente y lo muestra por pantalla; 
    después envía un mensaje al cliente. Realiza una clase TCPejemplo1Cliente que envíe un mensaje al programa 
    servidor y después reciba un mensaje del servidor visualizándolo en pantalla.

````

### 6 Ejercicio.
````
   Vamos a realizar en Java la creación de una lista de la compra mediante comunicación con sockets TCP. El esquema a 
   seguir será el siguiente: 
        1. Arranca el servidor. 
        2. Arranca el cliente que solicitará al usuario un producto para añadir a la lista de la compra. 
        3. El cliente escribirá el producto leído en el flujo de salida. 
        4. El servidor lee el producto del flujo de entrada y lo añadirá a un fichero de texto cuyo nombre será el del 
        día de ejecución del programa en formato dd-mm-yyyy.txt (por ejemplo, 09-01-2025.txt). 
        5. El cliente informa Se ha volcado el producto xxx a la lista de la compra y finaliza. 
        6. El servidor informa Se ha recibido el producto xxx y finaliza.

````

### 7 Ejercicio.
````
    Utilizando el mismo cliente que el ejercicio anterior, codifica un Servidor Pro que será mejor que el anterior, ya 
    que se arrancará solo una vez y al que seguirán utilizando los Clientes para ir añadiendo productos a la lista de 
    la compra. El esquema a seguir será el siguiente: 
        1. Arranca el servidor 
        2. Arranca el cliente que solicitará al usuario un producto para añadir a la lista de la compra. 
        3. El cliente escribirá el producto leído en el flujo de salida. 
        4. El servidor lee el producto del flujo de entrada: 
            • Si el producto es salir, el cliente finaliza y el servidor finaliza. 
            • Si el producto no es salir, dicho producto se añadirá a un fichero de texto cuyo nombre será el del día 
            de ejecución del programa en formato dd-mm-yyyy.txt. 
        5. El cliente informa Se ha volcado el producto xxx a la lista de la compra y finaliza.

````
### 8 Ejercicio.
````
    Sea el siguiente arrayList:
        // Crear un ArrayList para almacenar nombres de clientes 
        ArrayList<String> clientes = new ArrayList<>(); 
        
        // Agregar nombres de clientes al ArrayList 
        clientes.add("Juan Pérez"); 
        clientes.add("María López"); 
        clientes.add("Carlos García"); 
        clientes.add("Ana Martínez");
        
    Crea una clase cliente y otra servidor donde se pasa el array, bien del Cliente al Servidor o viceversa.
    Se debe mostrar los siguientes mensajes:
    
        • Si el que recibe el arrayList es el servidor pondremos:
            – Esperando conexión del cliente...
            – ¡Cliente conectado!
            – Objeto recibido del cliente: [Juan Pérez, María López, Carlos García, Ana Martínez]
            – Conexión cerrada.
            
        • Envia el Cliente
            – Iniciando conexión con el servidor...
            – Objeto enviado al servidor: Lista de clientes
            – Objeto recibido del servidor: Mensaje recibido correctamente en el servidor
            – Conexión cerrada.

````
### 9 Ejercicio.
````
    Sea la clase Persona con 2 atributos, nombre y edad, 2 constructores y los métodos get y set. Crear una clase 
    cliente y otra servidor para intercambiar objetos Personas. Se deben de utilizar Socket TCP.
        
        • El programa servidor (TCPObjetoServidor1) crea un objeto Persona, dándole valores, mostrándolo por pantalla y 
        se lo envía al programa cliente. 
        
        • El programa cliente (TCPObjetoCliente1) realiza los cambios oportunos en el objeto y se lo devuelve 
        modificado al servidor que lo muestra por pantalla.

````
### 10 Ejercicio.
````
    Vamos a realizar una práctica en Java mediante el envío de mensajes UDP en la cual un Servidor sea capaz de contar 
    el número de letras a que recibe de un Cliente. Para ello, necesitaremos un Cliente que leerá una cadena de texto 
    de la entrada estándar, la envíe al servidor y espere una respuesta del mismo.
        

````
### 11 Ejercicio.
````
    Vamos a realizar en Java la simulación de cómo sería conectar mediante sockets UDP distintos usuarios a un servidor 
    de venta de Tickets al que llamaremos “TicketServer” y que solo puede vender 4 entradas para un concierto 
    mega-exclusivo. En esta arquitectura, el Cliente será pasivo y el Servidor activo. Es decir, en el lado cliente se 
    solicitará una serie de datos al usuario, que el mismo cliente facilitará al servidor para que este lleve a cabo la 
    correspondiente acción. Los requisitos funcionales para llevar a cabo esta aplicación son los siguientes: 
    
    Usuario.java: 
    El usuario ejecutará en bucle un menú que constará de 4 opciones:
        • Opción1: Listar butacas: Conectará con el servidor, donde se informará de los nombres que ocupan las 4 
          butacas, más los nombres que están en cola dos en una lista de espera, donde están los clientes que están 
          interesados en el evento, pero que no llegaron a tiempo para comprar una entrada. 
        • Opción2: Reservar butacas: el programa pedirá un nombre pararealizarlareservadebutaca. 
        • Opción3: Anular butacas: el programa pedirá el nombre de la reserva que queramos anular. 
        • Opción4: Salir: El programa cliente finalizará.
        
    Además, el usuario tendrá la posibilidad de dejarnos acceder en Modo Root si en dicho menú tecleamos la opción 123
    (que permanece oculta en el menú principal). En esta opción, el cliente apagará el servidor, que inicialmente se 
    ejecutará en un bucle infinito, atendiendo todas las peticiones de clientes que se quieran conectar aél. Si la 
    opción no fuera ni 1, ni 2, ni 3, ni 4, ni 123, el Cliente informará de Opción incorrecta.
    
    Servidor.java: para garantizar la consistencia de la información, admitirá solo la conexión de 1 usuario al mismo 
    tiempo. Constará de un bucle infinito que se comportará de forma distinta en función de la opción que haya tecleado
    el usuario: 
        • Opción1: Imprimirá los nombres de los usuarios que se van a sentar en las butacas. Si no hay una butaca 
          asignada, en este listado aparecerá la palabra LIBRE!. Si hubieran usuarios esperando en una lista de espera, 
          se imprimirán los nombres de dichos usuarios.
          
        • Opción2: Se asignará el nombre de la persona facilitada en el lado cliente a una butaca libre. Estas butacas 
          se irán llenando deforma creciente. Es decir, al primer usuario se le asignará la butaca 1, al segundo la 
          butaca 2, etc.. no pudiendo el mismo usuario comprar más de 1 butaca. En el momento de llenar las 4 butacas, 
          las siguientes solicitudes pasarán a una lista de espera, donde los usuarios quedarán encolados esperando
          alguna anulación.
          
        • Opción 3: Se buscará el nombre de la reserva a anular. Si el nombre no estuviera asignado a ninguna butaca,
          se informará de esta circunstancia. En caso contrario, si el nombre sí estuviera asignado a una butaca, esta
          butaca pasará a “LIBRE!” en caso de no haber nadie en lista de espera. Si hubiera alguien en lista de espera,
          esta butaca libre se le asignará automáticamente, desapareciendo de la cabeza de la lista de espera.
          
        • Opción123: El socket se cerrará, desconectando el servidor y finalizando el programa.
````

### 12 Ejercicio.
````
    Crear una aplicación cliente-servidor UDP con lo siguiente:
    
    • Cliente
      Este programa enviará al servidor una palabra escrita por el usuario. Intenta configurar un tiempo deespera 
      (por ejemplo, 5 segundos) en el cliente utilizando el método setSoTimeout del socket. 
      
      El funcionamiento:
        DatagramSocket socket = null; try { 
        
        // Create a socket socket = new DatagramSocket(); 
        InetAddress serverAddress = InetAddress.getByName("localhost") ; 
        int serverPort = 6000; 
        
        // Set a timeout of 5 seconds 
        socket.setSoTimeout(5000); 
        ...
    
     Si este tiempo de espera expira, se lanzará una excepción InterruptedIOException, y el cliente deberá imprimir un
     mensaje en la pantalla con el texto: “No se encontró traducción.”.
    
    • Server
      Este programa funcionará en el puerto 6000. Tendrá una colección (como una Hashtable u otra estructura similar)
      con algunas palabras en inglés (como claves) y sus correspondientes traducciones al español(comovalores). El 
      servidor leerá la palabra enviada por el cliente y devolverá la traducción al español de esa palabra. Si la 
      palabra no se encuentra en la colección, el servidor no devolverá nada. 
      
      Ejemplo de funcionamiento:
    
        // Create a dictionary with English-Spanish translations 
        HashMap<String, String> dictionary = new HashMap<>(); 
        dictionary.put("hello", "hola"); 
        dictionary.put("world", "mundo"); 
        dictionary.put("dog", "perro"); 
        dictionary.put("cat", "gato"); 
        dictionary.put("food", "comida"); 
        ... 
        
        // Find the translation 
        String translation = dictionary.getOrDefault(word, "");
    
````

### 13 Ejercicio.
````
    Vamos a simular un escenario donde se produce el envío de un fichero y queremos garantizar la integridad del mismo.
    Es decir, queremos estar seguros que entre el envío y la recepción, no hay terceras partes que modifican el 
    contenido del fichero. Para conseguir esto, serializaremos en un objeto el contenido a transmistir junto a su 
    resumen. Lo haremos del siguiente modo, creando el fichero “Datos.dat”.
    
        //Creamos el fichero de salida 
        FileOutputStream fileout = new FileOutputStream("Datos.dat"); 
        ObjectOutputStream dataOS = new ObjectOutputStream(fileout);
         
        // datos y algoritmo de encriptación 
        MessageDigest md = MessageDigest.getInstance("SHA-256"); 
        String datos = "En un lugar de la Mancha, de cuyo nombre no quiero acordarme"; 
        byte dataBytes[] = datos.getBytes(); 
        // apartir de aquí continuar
````

### 14 Ejercicio.
````
    Una vez sabemos cómo funciona la clase MessageDigest y como escribir una función hash en un fichero 
    (Ejercicio1.java), podremos realizar la verificación de integridad en la recepción del fichero. 
    
    Si en la recepción del fichero extraemos el mensaje original, calculamos su función hash y la comparamos con la
    función hash que viene en el fichero podremos estar seguros de la integridad del mensaje si ambas funciones 
    coinciden. Primero de todo leemos la cadena original y después leemos el resumen de esa cadena:
    
        FileInputStream filein = new FileInputStream("Datos.dat"); 
        ObjectInputStream dataOS = new ObjectInputStream(filein); 
        Object o = dataOS.readObject(); 
        
        // Primera lectura, se obtiene el String 
        String datos = (String) o; 
        System.out.println("Datos: " + datos); 
        
        // Segunda lectura, se obtiene el resumen 
        o = dataOS.readObject(); 
        byte resumenOriginal[] = (byte[]) o;
    
    Acontinuación, calculamos la función hash a partir de la cadena
    
        MessageDigest md = MessageDigest.getInstance("SHA-256"); 
        
        // Se calcula el resumen del String leído del fichero 
        md.update(datos.getBytes()); 
        
        // TEXTO A RESUMIR
        byte resumenActual[] = md.digest(); 
        // SE CALCULA EL RESUMEN
    
    Y comprobamos si el valor calculado coincide con el valor que venía en el fichero:
    
        // Se comparan los dos resúmenes 
        if (MessageDigest.isEqual(resumenActual, resumenOriginal)) {
            System.out.println("DATOS VÁLIDOS");
        }else{
            System.out.println("DATOS NO VÁLIDOS"); }
            
        dataOS.close(); 
        filein.close();
        
````
### 15 Ejercicio.
````
    Realiza en Java el sofware de gestión para todos los profesionales que trabajan en el Ibis Sports Club, 
        • Para ello, codificaremos primero una clase “Profesional” que tendrá los siguientes campos:
            – nombre(String)
            – edad(int)
            – genero(char). Pudiendo ser‘m’(masculino) o ‘f’ (femenino).
            – tipodeprofesional (int). Pudiendo ser 1 (Jugador), 2 (Directivo), 3 (Fisio) 
            
        • Por otro lado, tendremos la clase “Principal” que se encargará de mostrar el siguiente menú: 
        
            SOFTWARE DE GESTIÓN DEL IBIS SPORT CLUB 
            ======================================= 
            1. Introducir datos de un profesional 
            2. Consulta con filtro 
            3. Listado de nombres 
            4. Salir 
        
        1. Introducir datos de un profesional: pedirá los datos que definen a la clase Principal, validando que los 
        datos introducidos son válidos. 
        2. Consulta con filtro, nos llevará al siguiente menú de consultas, que implementaremos con streams: 
        
            Submenú de Consultas 
            -------------------
            1. Profesionales por género 
            2. Profesionales por tipo 
            3. Profesionales por edad 
            4. Volver 
        
            2.1.- Profesionales por género: mostraremos todos los profesionales de género masculino y luego todos los 
            profesionales del género femenino. 
            2.2.- Profesionales por tipo: mostraremos todos los jugadores (tipo 1), luego todos los directivos (tipo 2) 
            y, para finalizar, todos los fisioterapeutas (tipo 3) del club. 
            2.3.-Profesionales por edad: se solicitará una edad mínima y una edad máxima y el programa devolverá a 
            todos los profesionales comprendidos en ese rango. Se validará que el rango es válido (es decir, que la 
            edad mínima es <= que la edad máxima =. 
            2.4.- Volver al menú principal: abandonamos el menú de consultas y volvemos al principal.
            
        3. Listado denombres: codificamos un stream quedándonos solo con el nombre del Profesional y luego los 
        mostraremos separados por una coma (“,”) y finalizando el stream con un punto (“.”). 
        4. Salir: el programa finaliza.
        
````
