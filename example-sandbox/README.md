Example sandbox for javish tasks
================================

There is an implementation of a simple _2sum_ quiz. **Main** class holds a driver code and **Solution** class is an actual implemetation.
Driver basically reads standard input using **java.util.Scanner** and calls **twoSum** function with input values.

There is also an example jUnit test with trivial test case, feel free to add more there. 

Note two helper scripts:

-   **build.sh** - runs maven build for you (including the jUnit tests) and creates an executable jar. To build this up:

        $ ./build.sh

-   **run.sh** - just reads the **input.txt** file for input values and redirects them to the JVM. To run the code:

        $ ./run.sh
 