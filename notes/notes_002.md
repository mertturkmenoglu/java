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