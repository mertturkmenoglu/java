# Java Notes - 002  
***
__Please note that these notes are just collection of my lecture notes and researchs over the internet. They come with ABSOLUTELY NO WARRANTY.__  
***
## Generic Classes
***
* Java supports **generics** since J2SE 5.  
* Java generics supports these **advantages**:  
    * **Type-Safe**: **Holds** only a **single type**.  
    * **Type Casting**: You do **not need** manuel **typecasting**.  
    * Checking at **compile-time**: **Compiler checks** for types.  
* **Generic class**: **Class** can **refer** to **any type**.  
* **Generic class** example:  
```java
    public class GenericClass<T> {  
        private T obj;  
        public GenericClass(T obj) {  
            this.obj = obj;  
        }  
        public T getObj() {  
            return obj;  
        }  
        public void setObj(T obj) {  
            this.obj = obj;  
        }  
    }  
  
    public class DriverCode {  
        public static void main(String[] args) {  
            GenericClass<Integer> genericClass = new GenericClass<Integer>(3);  
            System.out.println(genericClass.getObj());  
        }  
    }  
```  
* **Naming conventions** for generic classes:
    * **T** - **Type**
    * **E** - **Element**
    * **N** - **Number**
    * **K** - **Key**
    * **V** - **Value**
* **Generic Method** example:  
```java  
    public class ArrayExample {  
        public static <E> void arrayPrint(E[] array) {  
            for(E element : array) {  
                System.out.println(element);  
            }  
        }  
    }  
  
    public class DriverCode {  
        public static void main(String[] args) {  
            int[] intArray;  
            for(int i = 0; i < 13; i++) {  
                intArray[i] = i;  
            }  
            String[] strArray = {"Rose", "Martha", "Donna", "Amy", "Clara"};  
            ArrayExample.arrayPrint(intArray);  
            System.out.println();  
            ArrayExample.arrayPrint(strArray);  
        }  
    }  
```  
* **Wildcard** example:  
(`<? extends SpesificClass>`)  
```java  
    public abstract class Animal {  
        public abstract void sound();  
    }  
  
    class Cat extends Animal {  
        @Override  
        public void sound() {  
            System.out.println("Meow");  
        }  
    }  
  
    class Dog extends Animal {  
        @Override  
        public void sound() {  
            System.out.println("Bark");  
        }  
    }  
  
    class GenericTest {  
        public static void genericSoundMaker(List<? extends Animal> animals) {  
            for (Animal animal : animals) {  
                animal.sound();  
            }  
        }  
    }  

    class DriverCode {  
        public static void main(String[] args) {  
            List<Animal> animalList = new ArrayList<Animal>();  
            animalList.add(new Cat());  
            animalList.add(new Cat());  
            animalList.add(new Dog());  
            GenericTest.genericSOundMaker(animalList);  
        }  
    }  
```  
***
## ArrayList
***
* **Dynamic** array.
* **Extends** *AbstractList* 
* **Implements** *List*
* Can **contain duplicates**
* ArrayList is **not synchronized**.
* Allows **random access**.
* **Removing** an element is **slow**.
* **ArrayList** --(Extends)--> **AbstractList** --(Implements)--> **List** --(Extends)--> **Collection** --(Extends)--> **Iterable**
* **`java.util.ArrayList`**
* **`public class ArrayList<E> extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, Serializable {...}`**
* **Allows null** elements.
* Constructors:
    * **`ArrayList()`**
    * **`ArrayList(Collection<? extends E> c)`**
    * **`ArrayList(int initialCapacity)`**
* Methods(some of them):
    * **`boolean add(E e)`**
        * **Append** element to end of list
    * **`void add(int index, E element)`**
        * **Insert** element at the position.
    * **`void clear()`**
        * **Remove all** elements.
    * **`Object clone()`**
        * **Return** a **shallow copy** of the instance.
    * **`boolean contains(Object o)`**
        * Return **`true`** **if** list **contains** the **object**.
    * **`void ensureCapacity(int minCapacity)`**
        * **If necessary, increase capacity**.
    * **`void forEach(Consumer<? super E> action`**
        * **Perform** given **action** **on each element**.
    * **`E get(int index)`**
        * **Return** the **element at the position**.
    * **`int indexOf(Object o)`**
        * **Return** the **index of first occurence. Else, -1.**
    * **`boolean isEmpty()`**
        * Return **`true`** **if** list contains **no elements**.
    * **`Iterator<E> iterator()`**
        * **Return** a **list iterator**.
    * **`E remove(int index)`**
        * **Remove** the **element at the index**.
    * **`boolean remove(Object o)`**
        * **Remove first occurence** if it is present.
    * **`E set(int index, E element)`**
        * **Replace** element **at** the given **index** with given element and return.
    * **`int size()`**
        * Return **number of the elements**.
    * **`void sort(Comparator<? super E> c)`**
        * **Sort** the list **with** given **Comparator**.
    * **`Object[] toArray()`**
        * **Return** an **array** contains all list elements.
######
* **Ways** to **iterate**:
    * **Iterator**
    * **ListIterator**
    * **for-each** loop
    * Classic **for** loop
    * **`forEach()`**
* With an **Iterator**:  
```java
    ...  
    ArrayList<Object> myList = new ArrayList<Object>();  
    ...  
    Iterator iterator = myList.iterator();  
    while(iterator.hasNext()) {  
        ...  
    }  
```  
* With a **for-each loop**:  
```java  
    for(Object o : myList) {  
        ...  
    }  
```  
* With **`forEach()`**:
```java  
    myList.forEach(obj -> {  
        ...  
    });  
```  
***  
## Collections
***  
* Collection **methods**: 
    * **`boolean add(E e)`**
    * **`boolean remove(Object element)`**
    * **`boolean retainAll(Collection<?> c)`**
    * **`int size()`**
    * **`void clear()`**
    * **`boolean contains(Object element)`**
    * **`Iterator iterator()`**
    * **`Object[] toArray()`**
    * **`<T> T[] toArray(T[] a)`**
    * **`boolean isEMpty()`**
    * **`boolean equals(Object element)`**
    * **`int hashCode()`**
* Iterator **methods**:
    * **`boolen hasNext()`**
    * **`Object next()`**
    * **`void remove()`**
* **Iterable** is an **interface**.
* **Collection** is an **interface**.
* **Sub**-interfaces of **Collection**:
    * **List**
    * **Queue**
    * **Set**
* **Sub**-classes of **List**:
    * **ArrayList**
    * **LinkedList**
    * **Vector**
    * **Stack**
* **Sub**-classes of **Queue**:
    * **PriorityQueue**
    * **ArrayDeque** (**Deque** + **LinkedList**)
* **Sub**-classes of **Set**:
    * **HashSet**
    * **LinkedHashSet**
***
* **ArrayList**(Class):
    * Implements **List**.
    * **Dynamic** array
    * **Allows duplicate** elements
    * **Non-synchronized**
    * Allows **random-access**
* **LinkedList**(Class):
    * Implements **List**.
    * **Doubly linked list**
    * **Allows duplicate** elements
    * **Non-synchronized**
    * Fast manipulation
    * **No random-access**
* **Vector**(Class):
    * Similar to **ArrayList**
    * **Synchronized**
    * Other methods than Collecon
* **Stack**(Class):
    * Extends **Vector**
    * **LIFO**
    * **`push()`**
    * **`peek()`**
    * **`pop()`**
* **Queue**(Interface):
    * **FIFO**
    * **Ordered** List
* **PriorityQueue**(Class):
    * Implements **Queue**
    * Holds by object **priorities**
    * Does **not allow `null`**
* **Deque**(Interface):
    * Extends **Queue** interface
    * Remove and add from **both side**
    * **Double-ended** queue
* **ArrayDeque**(Class):
    * Implements **Deque**
    * **Faster** than ArrayList and Stack
* **Set**(Interface):
    * Extends Collection interface.
    * **Unordered** elements
    * Does **not allow duplicates**.
    * **Max one `null`** value
* **HashSet**(Class):
    * Implements **Set** 
    * **HashTable**
    * **Unique**
* **LinkedHashSet**(Class):
    * **LinkedList** + **Set**
    * Extends **HashSet**
    * Keeps **insertion order**
    * **Allows null** elements
* **SortedSet**(Interface):
    * Total **ordering**
    * **Ascending** order
* **TreeSet**(Class):
    * Implements **Set**
    * **Unique**
    * **Access** is **fast**
    * **Ascending** order
***