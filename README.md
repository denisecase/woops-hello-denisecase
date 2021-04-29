# woops-hello-denisecase

> Java helps 'encapsulate' code. It makes it easy to create standalone, shareable apps like this one.

> WOOPS = (Amazing) World of Object-Oriented Programming

## Quickstart

Create the jar for sharing (see [build/libs](build/libs)) and run the app standalone.

```
.\gradlew build
.\gradlew run
```

## Developer Tools

- Git
- [VS Code](https://code.visualstudio.com/docs/java/java-tutorial)
- VS Code Extension - [Java Extension Pack](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack)
- Chocolatey (Windows Package Manager)
- Node (used in automation)
- Gradle (build tool) - never do by hand what you can easily automate

Chocolatey makes it easy to get software packages for Windows and keep them updated. 

Open Powershell as Administrator on the desktop and run:

```Powershell
choco list -local
choco install git -y
choco install tortoisegit -y
choco install vscode -y
choco install node -y
choco install gradle -y
choco install openjdk -y
choco upgrade all -y
choco refreshenv
```

## Install Java (JDK) As Needed

Install as many different versions of the Java Development Kit (JDK) as you like.
Depending on your project, you may need JDK 8, or maybe JDK 9, 11, 14, 15, and/or 16.

Check to see where new software gets installed.  
In Windows, we may use the graphical "File Explorer".

JDKs typically install to C:\Program Files\. Check for

- /AdoptOpenJDK (used by VS Code)
- /Java (these are usually from Oracle)
- /OpenJDK (where Chocolatey installs my OpenJDK)

In VS Code, View / Command Palette (), Java Configure Java Runtime.

## Set your Default JDK & Path for Windows

Windows requires only one "default" path to Java commands. 
Note: If you have more than one, Java will not work.

In Windows, click start key and type "Edit the System Enviroment Variables" / Open.
At the bottom of the Advanced tab, click "Environment Variables". 

- Upper half is for editing variables just for the user.
- Lower half is for editing variables for the system. We work here. 

In the lower half, scroll down if neeeded and look for the JAVA_HOME variable.
If you have it, click Edit.., if you don't have it, click New.. 
Set JAVA_HOME to your favorite default. For example:

- JAVA_HOME =  C:\Program Files\OpenJDK\jdk-16

Still in the lower (system) window, edit the path variable. 

- Verify that ```%JAVA_HOME%\bin``` is available (if not, add it)
- Then, scan all other path entries for anything related to Java.
- Delete all others. If you have extras, Java won't work. 
- Double check user variable 'path' in the upper half as well. 
- There must be only one. 

Verify your default has been correctly configured.

```Powershell
java -version
```

## Java is Global - Your Code Must Be Unique

There is a LOT of Java code out there. 

Code must be unique - plan for it to be used by anyone in the world. 

When writing a greeter app, no one else should have the same name. 

In production code, you won't see Student.java or Greeter.java.

Instead, code goes in a unique namespace. 
How? URLs help make websites unique. This logic works well. 
Many namespaces start with edu, com, or org.
They start general, and get progressively more unique. 
Our code could start with edu.nwmissouri.csis.oop, but that gets a bit unweildy.

- We usee "woops" to represent our unique World of Object-Oriented Programming in 241.
- We use "woops.hello" to represent this collaborative effort.
- Use "woops.hello.yourname" to keep your code from conflicting with any other. 

Give your class a unique name as well. For example, this is DeniseCaseGreeter.java.

Your class can run on its own - and be used in bigger projects. 
A bit of planning helps make your code shareable, extensible, and valuable. 

## Java is Great for Code Reuse

- Run your app locally
- Give your app to someone else to try
- Combine your code with other 241 greeters in our collaborative woops.hello
- Add it to our shared web app

## Java Enables Object-Oriented Programming (OOP)

Software projects can be immensely complex. 
Breaking big projects into small, well-organized pieces is critical.
One popular way to do this is by organizing code chunks into objects.
Objects include data methods that can operate on that data. 
For example, you might ask a deck to shuffle its cards. 
You might ask a car to increase its speed by one mile per hour. 

OOP is widely used. Just the JDK is about:

- ~100 modules (each with 1+ packages)
- ~224 packages (each with 1+ classes)
- ~4570 classes (each with 1+ methods and properties)

## OOP Principles

OOP is centered on four key design principles:

1. Encapsulation
2. Abstraction
3. Inheritance
4. Polymorphism

### Encapsulation (hide unnecessary details)

We encapusulate functionality by breaking massive projects into small small, loosely-coupled, highly cohesive parts (called objects). 
Code is written in classes that define the general shape of these objects. 
We use a class to create object instances - items with actual values (state).
For example, we can encapsulate functionality into a Pet class, 
then create a Lexie instance of a Pet with her real name, breed, color and age. 
When we structure code as classes, our implementation stays private, 
and others can only access the methods made available as "public". 
Aside from these public methods (a request that can be made from outside), 
the rest of the code is available only to the class developer. 
We often create unit tests to check that the public methods are performing as expected.
If an object needs something from outside, we try to pass it in through the argument list when we create it.
Everything is wrapped up into small, interacting parts. 

### Abstraction (focus on the key ideas)

We design a software system by getting an idea of what needs to be done. 
We figure out the general roles and context and highlight the key ideas of what is needed.
For example, you might want to use a "list" of strings in your greeting. 
The way Java implements that list is not as critical.  
We can abstract the key ideas needed and organize functionality to make efficient systems.
For example, we in a zoo simulation, 
tigers walk, snakes slither, birds fly, but we could abstract this a bit to say animals "move". 
In a similar way, we might use a more abstract "speak" method 
when we really mean roar, whine, growl, chirp, bellow, or howl. 

We look for general interfaces to our classes, so that we can reuse code. 
We'll look at this more as we refactor our custome greeters. 
Think of things that are common to all greeters (name and utturance) and how could we design a class that would work for all of us - and reuse that class to create an instance for each of us. 

- greeter.getName() 
- greeter.getGreeting()

We'll see how much code we can reduce by applying just these two principles next. 

### Inheritance and Polymorphism

The other two key princples are inheritance and polymorphism - We'll learn more about those in our next project. 

---

## Java Processing

Java ia a compiled programming language. Our source files (text) are converted into optimized bytecode for the Java Virtual Machine. Common tasks include:

1. Compiling .java source files to .class files
2. Combining .class files, local resources (e.g. images), and other code into artifacts (like .jar files) for use. 

Note: After 11, we can run directly a single file with java Main.java - no javac required.

Like all programmers, we're willing to work hard once - so we can be lazy forever. 

Luckily people have written code that makes it easy to compile and build complex apps. 
We invest a bit of time to learn a build tool and we get the returns over our years of development. 

--- 

## By Hand (the old way)

1. Comple to classes using ```javac``` command.
2. Create a modular Java archive, .jar file using ```jar``` command. 
3. Execute code using ```java`` command. 

Explanation

- d = destination
- c = create
- f = file (provide name) 
- e = entry point (provide class with main method)
- v = verbose
- t = table of contents
- x = extract contents
- . = this directory
- asterisk = regular expression for any (wildcard)
- rd = Powershell alias for "Remove-Item" (short and sweet)

- [Cheat Sheet](https://nipafx.dev/build-modules/)

```
javac -d . src/main/java/woops/hello/denisecase/DeniseCaseGreeter.java

jar cvfe woops-hello-denisecase.jar  woops.hello.denisecase.DeniseCaseGreeter woops/hello/denisecase/*.class

jar cvfe woops-hello-denisecase.jar  woops/hello/denisecase/DeniseCaseGreeter woops/hello/denisecase/*.class

jar vtf woops-hello-denisecase.jar

java -jar woops-hello-denisecase.jar

Remove-Item woops

rd woops-hello-denisecase.jar

```

## The New, Groovy Way

Gradle automates common tasks such as:

- gradle clean - cleans up and deletes all the generated content
- gradle run - compile and run the app
- gradle build - compile, build artifacts, and execute the app
- gradle wrapper - create a wrapper so others can run our code easily
- gradle init - draft the build.gradle file to get started

If we have Gradle insalled, we can run those commands. 
When working with our app, it's best to use the gradle wrapper (gradlew).
Powershell won't run a command unless we clearly state location, 
so preface the executable with ./ meaning here, in this directory/folder.

```
.\gradlew clean
.\gradlew run
.\gradlew build
```

## Actions

- Look in build/libs to find the reusable, sharable executable jar file. 
- Share a link to the jar with another developer. Ask them to run it. 
- Get a link from them. Run their custom greeter app. 
- Add your code to other applications - like our collaborative woops.hello.

## Explore

Practice advanced skills - use the Java CLI to Run / Inspect / Extract the Gradle-generated jar.

```
java -jar build/libs/woops-hello-denisecase.jar
jar vtf build/libs/woops-hello-denisecase.jar
jar vxf build/libs/woops-hello-denisecase.jar
```

## Participates In

- Collaborative App [woops-hello](https://github.com/denisecase/woops-hello)

