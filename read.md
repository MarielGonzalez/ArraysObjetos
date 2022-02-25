> Una **recta** es una figura geométrica delimitada por dos puntos.
> 
> Una **circunferencia** es una figura geométrica que se caracteriza por tener un punto céntrico.
> 
> Un numero binario está compuesto por una serie de 1 y 0. Es posible dado un número binario encontrar su equivalente decimal para lo cual puede tenerse, por ejemplo.

10110100        =    45

11110000        =    15

 

>Construya un programa, orientado a objetos, que nos permita convertir un número binario de 8 bits a su correspondiente equivalente decimal. En el programa el número binario ha de ser almacenado en un array de objetos en el que cada bit ha de ser generado de manera aleatoria. En este estará:
>Una clase Bit la cual tendrá sólo dos métodos. Uno de ellos es un setter el cual recibe un parámetro de tipo booleano para setear su atributo que es private y de tipo short. Un getter para el atributo. No habrá algo más en dicha clase.

>Una clase llamada NumeroBinario la cual tendrá un solo atributo que es un array private de tipo Bit. Su método constructor recibe el parámetro pertinente para setear su atributo. Habrá un método setter que no recibe parámetros y que es private para crear todas las instancias de tipo Bit del atributo. Habrá también un setter que recibe dos parámetros uno de tipo booleano y otro de tipo int en el cual se seteará el valor de un bit del arreglo. Habrá un getter para el atributo. No habrá más métodos y atributos en dicha clase.

>Una clase llamada Calculo en la que los atributos pertinentes son private. Su Constructor ha de recibir un parámetro de tipo NumeroBinario para setear uno de sus atributos que ha de ser de ese tipo. Habrá un método private que mostrará el número binario completo usando como recurso un for/each o for/in. Habrá otro método private que estará encargado de generar los 0 y 1 de manera aleatoria que son necesarios para formar el número binario. Habrá también un método que es private que no devuelve valores y que no recibe parámetro que estará encargado de encontrar el equivalente decimal del número binario, usando un algoritmo creado por ustedes y sin utilizar alguna función de lenguaje que convierta directamente un binario a decimal. En su algoritmo con un for/each o for/in giraran en el array. Habrá un método toString para mostrar el número binario generado y su equivalente decimal.
 

>Una **clase principal** en la que se tendrá un objeto de la clase Calculo y se ha de mostrar desde aquí el número binario generado y su equivalente decimal tomando en cuenta a toString. En esta clase principal no puede haber más de 3 líneas de código. Sólo tendrá el main y ningún otro método.


# Requerimientos

Construya un programa, orientado a objetos, que nos permita convertir un número binario de 8 bits a su correspondiente equivalente decimal. En el programa el número binario ha de ser almacenado en un array de objetos en el que cada bit ha de ser generado de manera aleatoria. 


- ## Una clase Punto:
  - [x] cuyo método constructor recibe los parámetros de tipo double para setear sus atributos que son private y de tipo int.
  - [x] Un getter para cada atributo y un setter también.
  - [x] Un método toString() para mostrar los valores de los atributos a través de sus getter.
  - [x] El método toString debe mostrar la información de la  forma (x,y), es decir, deben de aparecer entre paréntesis y separados por una coma “,”.
 
No habrá algo más en esta clase.

- ## Una clase Circunferencia:
  - [x] Tendrá un atributo private del tipo **Punto**
  - [x] Habrán dos constructores:
    - [x] Uno que recibe el parámetro para setear su atributo
    - [x] El otro constructor no ha de recibir parámetro alguno.
  - [x] Ha de haber un getter y un setter.

No habrá algo más en esta clase.

- ## Una clase llamada **Recta**:
  - [x] la cual tendrá los atributos private del tipo **Punto** pertinentes.
  - [x] Tendrá sus setter y  getter y un método toString para mostrar los atributos de la forma (x,y) (x,y) y debe de hacer uso de los getter.

No habrá algo más en esta clase.

- ## Una clase llamada **Diámetro**:
  - [ ] la cual tiene tres atributos private.
    - [ ] Uno del tipo Circunferencia,
    - [ ] Uno del tipo Recta
    - [ ] Uno del tipo Punto.
  - [ ] Su método constructor recibirá los parámetros pertinentes para setear el atributo de tipo Circunferencia y el de tipo Recta empleando los setter que serán private.
  - [ ] Habrá métodos getter, pero no para el atributo del tipo Punto, y un método private que no recibe parámetro y es de tipo booleano que determinará si la Recta es el diámetro de la circunferencia.
  - [ ] El atributo de tipo Punto ha de ser seteado a partir de la recta calculando su punto medio.


- El programa solo debe de terminar la ejecución cuando se determine que la recta es el diámetro de la circunferencia. Este estará generando los puntos de manera aleatoria esperando a que se llegue a determinar que la recta es el diámetro de la circunferencia.
  
- Se precisa mostrar siempre en la pantalla los puntos de la recta y el punto céntrico de la circunferencia, así como también el punto de la recta que puede que se intercepte o no con el punto céntrico de la circunferencia el cual es el punto encontrado con la fórmula.

- Se ha de indicar siempre si la recta es o no el diámetro de la circunferencia en cada intento.
  
# Investigar.

- Fórmula del punto medio.

- El método toString y cómo se usa de manera adecuada.

# Observaciones

- Cumplimiento de los requerimientos.
- Conectividad. Orientación a Objetos.
- Lógica empleada.
- Funcionalidad.
- Reutilización del código.
- Uso de recursos.
- Redundancias.
- Implementación de la clase principal.

# Ponderación
|Descripcion|Puntaje|
|-----|-----:|
|Implementaciones del método toString.|1|
|Implementación de la fórmula del punto medio.|2|
|Determinar si la recta es el diámetro de la circunferencia.|1|
|Determinar si la recta es el diámetro de la circunferencia.|1|
|Finalizar el programa dado el requerimiento.|1|
|Clase Circunferencia.|1|
|Clase Recta.|1|
|Clase Diámetro. |1|

# Notas Adicionales
> SOLO QUIERO UN ARCHIVO POR GRUPO.
>
> Recuerden subir un solo archivo de notepad con las matriculas y nombres de los integrantes.
>
> Deben colocar cada archivo de clases del eclipse en un solo archivo de notepad o txt. Esto Lo hacen copiando y pegando el contenido de cada clase.cta va de un extremo a otro pasando por el punto céntrico de una circunferencia se dice que ésta es su **diámetro**. 


# Requerimientos

Construya un programa, orientado a objetos, que pidiendo las coordenadas del punto céntrico por teclado nos determine si la recta que intercepta a la circunferencia es su diámetro. Los puntos de la recta deben de ser generados de manera aleatoria. 


- ## Una clase Punto:
  - [x] cuyo método constructor recibe los parámetros de tipo double para setear sus atributos que son private y de tipo int.
  - [x] Un getter para cada atributo y un setter también.
  - [x] Un método toString() para mostrar los valores de los atributos a través de sus getter.
  - [x] El método toString debe mostrar la información de la  forma (x,y), es decir, deben de aparecer entre paréntesis y separados por una coma “,”.
 
No habrá algo más en esta clase.

- ## Una clase Circunferencia:
  - [x] Tendrá un atributo private del tipo **Punto**
  - [x] Habrán dos constructores:
    - [x] Uno que recibe el parámetro para setear su atributo
    - [x] El otro constructor no ha de recibir parámetro alguno.
  - [x] Ha de haber un getter y un setter.

No habrá algo más en esta clase.

- ## Una clase llamada **Recta**:
  - [x] la cual tendrá los atributos private del tipo **Punto** pertinentes.
  - [x] Tendrá sus setter y  getter y un método toString para mostrar los atributos de la forma (x,y) (x,y) y debe de hacer uso de los getter.

No habrá algo más en esta clase.

- ## Una clase llamada **Diámetro**:
  - [ ] la cual tiene tres atributos private.
    - [ ] Uno del tipo Circunferencia,
    - [ ] Uno del tipo Recta
    - [ ] Uno del tipo Punto.
  - [ ] Su método constructor recibirá los parámetros pertinentes para setear el atributo de tipo Circunferencia y el de tipo Recta empleando los setter que serán private.
  - [ ] Habrá métodos getter, pero no para el atributo del tipo Punto, y un método private que no recibe parámetro y es de tipo booleano que determinará si la Recta es el diámetro de la circunferencia.
  - [ ] El atributo de tipo Punto ha de ser seteado a partir de la recta calculando su punto medio.


- El programa solo debe de terminar la ejecución cuando se determine que la recta es el diámetro de la circunferencia. Este estará generando los puntos de manera aleatoria esperando a que se llegue a determinar que la recta es el diámetro de la circunferencia.
  
- Se precisa mostrar siempre en la pantalla los puntos de la recta y el punto céntrico de la circunferencia, así como también el punto de la recta que puede que se intercepte o no con el punto céntrico de la circunferencia el cual es el punto encontrado con la fórmula.

- Se ha de indicar siempre si la recta es o no el diámetro de la circunferencia en cada intento.
  
# Investigar.

- Fórmula del punto medio.

- El método toString y cómo se usa de manera adecuada.

# Observaciones

- Cumplimiento de los requerimientos.
- Conectividad.
- Orientación a Objetos.
- Lógica empleada.
- Funcionalidad.
- Reutilización del código.
- Uso de recursos.
- Redundancias.
- No se pongan a utilizar arrays que ese tema no lo hemos dado.
- Implementación de la clase principal.

# Ponderación
|Descripcion|Puntaje|
|-----|-----:|
|Implementaciones del método toString.|1|
|

# Notas Adicionales
> RECUERDEN COLOCAR MATRICULA Y NOMBRES DE LOS INTEGRANTES EN EL ARCHIVO. DEBEN DE COPIAR Y PEGAR TODAS LAS CLASES EN UN SOLO ARCHIVO DE NOTEPA O TXT Y HACER UNA SOLA ENTREGA POR GRUPO. NO QUIERO ARCHIVO RAR, ZIP NI DE WORD. DEBE SER DE NOTEPAD O TXT.