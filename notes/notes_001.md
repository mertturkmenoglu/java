# Java Notes  
***
__Please note that these notes are just collection of my lecture notes and researchs over the internet. They come with ABSOLUTELY NO WARRANTY.__  
***
* __`instanceof`__ is an **operator** which is used to **test** whether given **object** is an **instance of the class** (Or subclass or interface).
* __`instanceof`__ returns a __`Boolean`__ value.
* __`strictfp`__ **ensures** that you get the **same result** on **floating-point** arithmetics.
* __`Synchronized`__ keyword makes a class or method __thread-safe__. It means that at a certain time, only one thread can access to class(or method). This is called __locking__. Other threads must wait until this locking removed.
* An interface with only one abstract method is called a __`functional interface`__. For example,  __`java.lang.Runnable`__ is a functional interface and it has only one abstract method `void run()`.  
* A __`lambda expression`__ implements a functional interface.
* Lambda expressions came with __Java 8__.
* __Lambda expressions__ are functions that __do not have to be an instance of a class__.
* Lambda expressions __can be used as parameters__. They behave as objects.
* A basic __lambda expression__ looks as:
    * `(parameter list) -> (function body)`
***
## Classes
***
* A __method declaration__ is basically:
    * `Modifier - Return type - Method name - Parameter list - Exception list - Method Body`
* __Method Modifier__ Types: 
    * `Public`
    * `Private`
    * `Protected`
    * `Default`
* __`Public`__: Can be access from __anywhere__ in JVM.
* __`Protected`__: Can be access from the __same class__ it's declared __or__ from its __child classes__.
* __`Private`__: Can be access from __only inside__ of the class it is declared.
* __`Default`__: Can be access from the __same package__.  
* __Method signature__ consist of __method name and parameter list__.
* __`Parameter count`__, __`type`__ and __`sequence`__ is __important__.
* __`Return type`__ and __`exception list`__ are __not important__ for method signature.
* __Methods__ are implemented over __stack__.
* In every __method call__, a __`frame` is created__ on stack. 
* Java transfers __parameters__ to this frame and creates __local variables__.
* When a __call ends, JVM deletes__ the frame.
* Java __does not support multi-value return__. If a method has to return multiple value, it may return a __`collection`__. If values have __different types__, they may be __encapsulated__ in a class and an object of that class can be return value.
* Valid __`main method`__ overloadings:
    * `public static void main(String[] args) { }`
    * `static public void main(String[] args) { }`
    * `public static void main(String []args) { }`
    * `public static void main(String args[]) { }`
    * `public static void main(String...args) { }`
    * `public static void main(final String[] args) { }`
    * `public final static void main(String[] args) { }`
    * `public synchronized static void main(String[] args) { }`
    * `public strictfp static void main(String[] args) { }`
    * `final static synchronized strictfp static main(String[] args) { }`
* A __class can extend__ the __class__ which __contains__ the __main method__. __(Inheritance of main method)__
* Java __does not support user defined operator overloading__. But in background, __`+`__ operator is __overloaded__ for __string concatenation__.
* __Overloading: Same name, different signature__.
* __Overriding__: __Same name__ and __same signature__.__Different implementation__ in __different classes__.
* __Overloading__ is an example for __compile time polymorphism__.
* __Overriding__ is an example for __run time polymorphism__.
* __`Private`__ methods are __implicitly final__ because __no class can access and override__ them.
* __Adding__ __`final`__ specifier __to__ __`private`__ methods may __create conflicts__.  
* __Primitive data types__ are just like in __C language__.
* Every __other data type__ is an __Object__.
* __Objects__ are always __referances__ to a certain __memory location__.
* Java creates a __new copy__ of the __referance__ for __parameters__.
***
## Constructors
***
* A __constructor__ can __not__ be __`final`__, __`abstract`__, __`static`__ or __`synchronized`__.
* If you do __not__ __write__ a __constructor__, __compiler__ will __create__ a constructor __automatically__
* If a __constructor__ has __parameters__, it is called __parameterized constructor__.
* __Constructor__ definitions __doesn't have return statements__, __but__ you __may write__. 
* __Constructor returns an instance to class__.
* __Constructor__ does __not__ __return__ __void__.
* __Constructor name__ and __class name__ __must__ be __same__.
* __Constructors__ __can__ be __overloaded__.
* Different from other methods, __constructors__ are __invoked__ during __only__ __object creation__ with __new__ keyword. __Other methods__ can be __called__ __multiple__ times.
* If you __add return type__ to __front__ of a __constructor__, it __behaves__ as any other __method__. But __compiler__ will give you a __warning__: __`Method has constructor name`__ 
* You may __create__ __private constructors__.
* **Private constructors** can be used for __singleton class__ or __internal constructor chaining__.
* __Constructor chaining__: Calling __`super`__ constructor or __`this`__ constructor.
* __No-Args constructor != Default Constructor__
* Every class __needs__ a __constructor__ but you do __not__ have to write __destructor__. Because Java __has garbage collection__.
* __Singleton class__: 
    * At __any__ given __time__, only __one instance__.
    * __Private constructor__
    * Does __not__ use __`new`__ keyword, uses __`getInstance()`__ method(by convention).
    * Method __returns an object__ to the class.
* __Abstraction__: **Hiding details**, **showing functionality**.
* __Encapsulation__: Code and functions **in a single unit**.
* __`new`__ is used to **allocate** **memory** at **runtime**.
* **Anonymous objects** are **nameless** objects. There are **no references** to these objects.
***
## Exception Handling
***
* __Exception__: On __execution__, __distrupts__ flow, __unwanted__, __unexpected__ event.
* __Error__: On __execution__, __problem__ on __system__.
* Exceptions and errors are __sub-classes__ of __`Throwable`__ class.
* __Exceptions__:
    * __Checked__
    * __Unchecked__

* __Errors__: `Virtual Machine errors`, `Assertion error`, ...
* __Checked Exceptions__: `IO Exceptions`, `Compile time Exceptions` ...
* __Unchecked Exceptions__: `Runtime Exception`, `NullPointerException` ...
* __Default exception handling__:
    __1.__ Method __creates__ an __Exception object__ and __sends__ it to __JVM__.
    __2.__ __Exception__ has __name__, __explanation__ and __current program status__.
    __3.__ This process is called exception __throwing__.
    __4.__ In every exception __raise__, there is a list called __Call Stack__ which lists all methods. It is __important__ to write __catch__ blocks with respect to __hierarchy__.
    __5.__ In an __exception raise__, __run-time__ system searches for a __method__ which can __handle__ the __exception__ on the __call stack__.
    __6.__ This code block is called __exception handler__.
    __7.__ If run-time system can __find__ a __related exception handler__, it __transfers__ exception __to method__.
    __8.__ If run-time system can __not find__ a __related exception handler__, it __transfers__ exception __to default exception handler__.
    __9.__ Default exception handler __prints__ exception __information__ and __ends program abnormally__.
    __10.__ __Code__ block that __could raise an exception__, __should__ be written in a __`try-catch`__ block.
    __11.__ __Inside__ of a __try__ block, __exception raises__, try block __throws exception__.
    __12.__ Throwed exception is tried to __catch__ from __one of the catch blocks__.
    __13.__ __System exceptions__ are automatically __throwed__ by __JRE__. 
    __14.__ You may __throw exception manually__.
    __15.__ Every __throwable__ exception should be __written__ on __method definition__.
* Exception messages:
    * __`java.lang.Throwable.printStackTrace()`__
    * __`toString()`__
    * __`getMessage()`__
* Some of the __important__ built-in __exceptions__:
    * `Arithmetic Exception`
    * `ArrayIndexOutOfBoundException`
    * `ClassNotFoundException`
    * `FileNotFoundException`
    * `IOException`
    * `InterruptedException`
    * `NoSuchFieldException`
    * `NoSuchMethodException`
    * `NullPointerException`
    * `NumberFormatException`
    * `RuntimeException`
    * `StringIndexOutOfBoundException`
* __Integer__ div by __0__ will __throw__ __`java.lang.ArithmeticException: / by zero exception`__ 
***
## Garbage Collection
***
* __Mark__ and __Sweep__ - __Shuffling__
* __GC time__: __Decreases__ with __increase__ of __dead object number__, __increases__ with __increase__ of __live object number__.
* __Wrapper class__: `Primitive data type` --> `Object`
* __Wrapper classes__ __helps__ to __use__ __`primitives`__ with __`Collections`__. (__`ArrayList`__, __`Vector`__)
* __`ArrayList`__ and __`Vector`__, both __extends__ __`AbstractList`__ and __`implements`__ __`List`__ interface.
* Objects on __heap memory__ could refer to themselves. This would cause a __loop__. This is called __island of isolation__.
* When an __object__ is __created__ its __sign bit__ is set to __`false`__.
* On __marking phase__, all __reachable__ objects' sign bit is set to __`true`__. To reach, __GC__ uses __DFS__. 
* On __sweep phase__, all objects with __false sign bit__ is __cleaned__ from __heap memory__.
* On every __method call__, method goes to __stack frame__. When it is __popped__, all __members die__(F). If there is __any object__ created __inside__ method, it will __die__(F).
* If a variable __keeps referance__ to an __object__ and programmer __assigns__ __another referance to another object__, first object will be __unreachable__(F).
* If all referances to an object is __`null`__, object will be __unreachable__(F).
* Anonymous object's id is __not__ stored. So it will be __eligible__(F) for __GC__.
* __Wrapping__ of primitive data types are important for __multithreading sync__.
* __Wrapper objects__ are __immutable__. On variable value __changings__, in background, a __new object__ is created, object will be __unboxed__, arithmetic __operation__ will be done, __new value__ will be __boxed__, new object __referance__ will be __assigned__ to the __object__.
***
## JVM - JRE - JDK
***
* Java is __architecture-neutral__. There are __no implementation dependent__ features.
* Having __semicolon__ at the __end__ of a __class__ definition is __optional__.
* JVM Runtime Operations: 
    * __Class__ file is __loaded__ by __Classloader__.
    * __Bytecode verifier__ checks for illegal operations.
    * __Interpreter__ reads __bytecode__ and executes instructions on hardware.
* __JVM__, __JRE__ and __JDK__ are platform __dependent__. Because every __architecture__ needs __different configurations__.
* Language itself is platform independent.
* __JDK__ = __JRE__ + __Dev Tools__
* __JRE__ = __JVM__ + __Libraries__
* __JVM__ = __Classloader__ + __Memory Areas__ + __Execution Engine__ + __Native Method Interface__ + __Native Libraries__
***
## JVM
***
* __Classloader__: Loads class files to JVM. 
    1. __Bootstrap Classloader__: 
        * Loads __rt.jar__ file
        * This file contains:
            * __`java.lang`__
            * __`java.net`__
            * __`java.util`__
            * __`java.io`__
            * __`java.sql`__
    2. __Extension Classloader__:
        * Loads __`$JAVA_HOME/jre/lib/ext`__
    3. __System Classloader__:
        * Loads class files from __classpath__.
        * Default: current directory
* __Memory areas__ allocated by JVM:
    1. __Class Area__:
        * __Stores class structures__
        * Holds constants, member fields and instance method datas.
        * Method codes
    2. __Heap Memory__:
        * __Runtime__ data area
        * __Objects__ are __allocated__ here.
    3. __Stack__:
        * Stores __frames__.
        * Holds __local variables__.
        * Method invocation __(Assembly)__
        * __Return__ value
        * Each __thread__ has private stack.
    4. __PC Register__:
        * Same as __Instructor Pointer(IP)__ in __80x86 Assembly__
    5. __Native Method Stack__:
        * __Contains__ all __native(built-in) methods__ used in program.
* __Execution Engine__ = __Virtual Processor__ + __Interpreter__ + __JIT__
* __JIT__, __compiles__ bytecode __in blocks__(similar functionality).
* __Native Method Interface__: __Interface__ for __other programs__ writte in another language. 
***
* __Writing the state of an object into a byte stream__ is called __serialization__.
* Serialization mostly used on **networking**.
* __`java.io.Serializable`__ is an **interface** used to **mark a class** to provide capabilities.
* __`java.lang.String`__ and __Wrapper classes__ implements __`java.io.Serializable`__.
* Only **objects** which is an instance of a class that **implements** __`java.io.Serializable`__ **can** be **written to streams**.
* __`transient`__ is used in __serialization__. If you __define__ any data as __transient__, it __won't__ be __serialized__. 
***
