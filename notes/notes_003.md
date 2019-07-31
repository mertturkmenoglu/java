# Java Multithreading Notes
***
* **Multitasking**: Executing multiple **tasks**.
* **Multithreading**: Executing multiple **threads**.
* **Thread**: **Lightweight** sub-**process**.
***
* **Multitasking**:
    * **Multiprocessing**
    * **Multithreading**
*** 
* We mostly use multithreading.
* **Threads** use a **shared memory** area.
* **Context-switching** between the threads takes **less time**.
* Threads are **independent**. So exceptions **does not affect other thread(s)**.
***
### Multiprocessing
* **Each** process **allocates** a **memory** area.
* **Heavy**
* **High** cost communication
* **Switching** between processes **requires time**.
***
### Multithreading
* Share **same address space**.
* **Light**
* **Low** cost communication
***
### Thread
* **Thread**: Lightweight sub-process.
* **Smallest** processing **unit**.
* A **path** of **execution**.
* **Independent**.
* **Shared memory**.
***
* There can be **multiple threads in a process**.
* There can be **multiple process running on OS**.
* **At a given time, only one thread is executed**.

