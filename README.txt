# LABORATORIO AREP 01

Se realizo este repositorio cumpliendo con los requerimientos de un problema planteado en clase por el profesor y que consiste en realizar diferentes calculos como lo es calcular la media y la desviacion estandar,guardando estos datos en una Linkedlist que contiene Nodos con el valor deseados y sus respectivos apuntadores a los otros Nodos.

## Utilidades
 
- Podra calcular la Media de una LinkedList que extiende de List.
- Podra calcular la desviacion estandar de una LinkedList.
- Encontrar implementada la LinkedList en el codigo fuente.
- Se encuentra en el codigo fuente la implementacion de un Nodo con sus apuntadores.

## Como Instalarla:
1. Clonar el este Git

![Imagenes](https://github.com/checho1998/AREP-LAB-01/blob/master/imagenes/clon.PNG)

2. En su CMD o consola ingresar mvn package

![Imagenes](https://github.com/checho1998/AREP-LAB-01/blob/master/imagenes/package.PNG)

3. En su CMD o consola ingresar mvn test

![Imagenes](https://github.com/checho1998/AREP-LAB-01/blob/master/imagenes/test.PNG)

## Pruebas del programa

- Para probar se pueden realizar pruebas de cualquier utilidad, como las siguientes y correrlas con el codigo ya indicado anteriormente

``` Java
     @Test
    public void pruebaAgregarLinkedList () {
        Nodo nod1 = new Nodo(186.0);
        Nodo nod2 = new Nodo(699.0);
        LinkedList list = new LinkedList();
        list.add(nod1);
        list.add(nod2);
        assertTrue(nod1.equalsNodo(list.get(1)));
        assertTrue(nod2.equalsNodo(list.get(2)));
    }
    
    @Test
    public void pruebaBorrarNodoLinkedList () {
    	Nodo nod1 = new Nodo(186.0);
        Nodo nod2 = new Nodo(699.0);
        Nodo nod3 = new Nodo(64.0);
        LinkedList list = new LinkedList();
        list.add(nod1);
        list.add(nod2);
        list.add(nod3);
        list.remove(2);
        assertTrue(list.getSize()==2);
    }
    
    @Test
    public void pruebaLinkedListMedia () {
    	Calculos calculadora = new Calculos();
    	Nodo nod1 = new Nodo(10.0);
        Nodo nod2 = new Nodo(20.0);
        Nodo nod3 = new Nodo(30.0);
        LinkedList list = new LinkedList();
        list.add(nod1);
        list.add(nod2);
        list.add(nod3);
        calculadora.media(list);
        assertTrue(calculadora.media(list) == 20.0);
    }
    
    @Test
    public void pruebaLinkedListDesviacionEstandar () {
    	Calculos calculadora = new Calculos();
    	Nodo nod1 = new Nodo(160.0);
        Nodo nod2 = new Nodo(591.0);
        Nodo nod3 = new Nodo(114.0);
        Nodo nod4 = new Nodo(229.0);
        Nodo nod5 = new Nodo(230.0);
        Nodo nod6 = new Nodo(270.0);
        Nodo nod7 = new Nodo(128.0);
        Nodo nod8 = new Nodo(1657.0);
        Nodo nod9 = new Nodo(624.0);
        Nodo nod10 = new Nodo(1503.0);
        LinkedList list = new LinkedList();
        list.add(nod1);
        list.add(nod2);
        list.add(nod3);
        list.add(nod4);
        list.add(nod5);
        list.add(nod6);
        list.add(nod7);
        list.add(nod8);
        list.add(nod9);
        list.add(nod10);
        calculadora.media(list);
        assertTrue(calculadora.desviacionEstandar(list) == 572.03);
    }
```
## Como Instalar y Correr el Codigo

- Debe estar en el directorio donde quiere traer el repositorio
- Para traer el repositorio a el directorio que usted desee, debe abrir la consola del PC e ingresar este codigo:
```
$ git clone https://github.com/checho1998/Libreria-Numeros-Complejos.git
```
- luego debe ingresar el siguiente codigo para limpiar y compilar el programa desde el directorio donde este el programa
```
$ mvn clean install 
```
- Podria tambien usar el siguiente codigo para provar las pruebas y ver su completa funcionalidad
```
$ mvn test
```
## Construido en lenguaje
  
  - Java (V8)
  
## Ejecutar Pruebas

Las pruebas estan desarrolladas con la dependencia de JUnit 5, por lo tanto es necesario tenerla
en el pc donde se corran.

## Autor

- Sergio Alejandro Nuñez Mendivelso
