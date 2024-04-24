`Title:`  Write a java Program for Thread creation and its various methods 

`There are two classes:` ***MyThread and Main***.  
The MyThread class extends the Thread class, and it overrides the run() method to print a message indicating that the thread is running.  
In the Main class, we create an instance of MyThread and call its start() method to execute the code inside the run() method in a separate thread.  
Here are the descriptions of the methods used in this code:  
•	`public void run():` This is the method that is executed when the thread is started. In this case, it simply prints a message to the console.  
•	`public final void start():` This method is used to start the execution of the new thread. The Java Virtual Machine calls the run() method of the new thread when the thread is started.  
•	`public static void sleep(long millis) throws InterruptedException:` This is a static method of the Thread class that causes the currently executing thread to sleep (temporarily cease execution) for the specified number of milliseconds.  
•	`public String getName():` This method returns the name of the thread.  
•	`public void setName(String name):` This method sets the name of the thread.  
•	`public final boolean isAlive():` This method tests if the thread is alive.  
•	`public void join()` throws InterruptedException: This method waits for this thread to die.    
In the Main class, we also print the name and alive status of the thread before and after calling the sleep() method. After that, we call the join() method on the MyThread instance, which causes the main thread to wait until the MyThread instance has completed execution.
