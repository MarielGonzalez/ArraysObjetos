> Una **recta** es una figura geométrica delimitada por dos puntos.
> 
> Una **circunferencia** es una figura geométrica que se caracteriza por tener un punto céntrico.
> 
> Si una recta va de un extremo a otro pasando por el punto céntrico de una circunferencia se dice que ésta es su **diámetro**. 


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


# Notas Adicionales
> RECUERDEN COLOCAR MATRICULA Y NOMBRES DE LOS INTEGRANTES EN EL ARCHIVO. DEBEN DE COPIAR Y PEGAR TODAS LAS CLASES EN UN SOLO ARCHIVO DE NOTEPA O TXT Y HACER UNA SOLA ENTREGA POR GRUPO. NO QUIERO ARCHIVO RAR, ZIP NI DE WORD. DEBE SER DE NOTEPAD O TXT.