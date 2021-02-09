



# Google Summer of Code (GSoC) -  2020 Project
# Symbolic PathFinder for Neural Network Analysis
## Author: 
Muhammad Usman ([muhammadusman@utexas.edu](mailto:muhammadusman@utexas,edu))

## Mentor: 
- Corina Pasareanu ([corina.pasareanu@west.cmu.edu](mailto:corina.pasareanu@west.cmu.edu)) 
- Yannic Noller ([yannic.noller@informatik.hu-berlin.de](mailto:yannic.noller@informatik.hu-berlin.de)) 
- Sarfraz Khurshid ([khurshid@ece.utexas.edu](mailto:khurshid@ece.utexas.edu))
# Abstract
Symbolic PathFinder (SPF) is a tool that uses Java PathFinder at the back-end and can extract path conditions for a program by executing the program symbolically. Users can specify which variables they want to make symbolic and which methods to run. The Pre-GSoC implementation of Symbolic PathFinder allows only to run symbolic execution with fixed neural network architecture, i.e., ***MNIST0***. We have added another implementation which is more generic and supports symbolic execution for all types of neural network architectures. We evaluated our implementation using a variety of architectures, namely ***MNIST0***, ***MNIST1***, ***MNIST2***, and ***CIFAR***. Evaluation results verified the the correctness of the implementation. We believe that this GSoC implementation will make it easier for researchers to analyze a wide variety of neural networks. This will enable them to improve the neural network performance as well as help in identifying the vulnerabilities in already existing neural network architectures.

# Section I - Introduction

Neural networks are becoming popular and are being used in a variety of applications, including security, self-driving cars, robots, image and speech recognition. Neural networks have gained popularity during recent years. Researchers are doing extensive work to find new architectures to develop neural network models with high test accuracy. Another research area is to analyze the neural networks using techniques from traditional software engineering. One such technique is named as Symbolic Execution. 

Symbolic Execution is a technique in which a program is executed using symbolic inputs rather than concrete inputs. Program is executed multiple times, and path conditions are formed for each path in the program. Theorem provers are then used to see if there are any infeasible paths. Symbolic PathFinder (SPF) is a tool that uses Java PathFinder at the backend and can extract path conditions for a program by executing the program symbolically. Users can specify which variables they want to make symbolic and which methods to run. 

The Pre-GSoC implementation of SPF (Git Commit ID [44cf503](https://github.com/muhammadusman93/jpf-symbc/commit/44cf5038caa5267a86bbafa36e85d427a8b16548)) supports only one neural network architecture. The weights and biases are hard-coded, which makes it impossible for the researchers to run SPF on neural networks that have architecture different than ***MNIST0***. Our goal is to enable the researchers to run SPF on any neural network with any type of architecture. We achieve this by making the SPF implementation for neural network analysis generalizable. The rest of the document explains the steps implemented to achieve the goal mentioned above.  We store weights, activations, and architecture of trained neural networks in JSON files. 
 
# Section II - Instructions on using the code
This repository is a fork of the original Symbolic PathFinder repository. SPF needs JPF-Core to work, so it is essential that JPF-Core is installed first. 

## Instructions on installing JPF-Core
JPF-Core can be downloaded from [https://github.com/javapathfinder/jpf-core](https://github.com/javapathfinder/jpf-core). 
Detailed instructions are provided at the aforementioned repository. 

## Instructions on installing SPF
The current forked code is submitted to the JPF team for approval. Meanwhile, the best way to use GSoC implementation is to clone this repository in place of SPF. The links will be updated upon formal approval from the JPF team. The following subsection gives the instructions on installing SPF. These instructions are taken from the original SPF GitHub Repository. [https://github.com/SymbolicPathFinder/jpf-symbc](https://github.com/SymbolicPathFinder/jpf-symbc)

---------------------------------------------
### Symbolic (Java) PathFinder:

This JPF extension provides symbolic execution for Java bytecode. It performs a non-standard interpretation of byte-codes. It allows symbolic execution on methods with arguments of basic types (int, long, double, boolean, etc.). It also supports symbolic strings, arrays, and user-defined data structures.

SPF now has a "symcrete" mode that executes paths triggered by concrete inputs and collects constraints along the paths

A paper describing Symbolic PathFinder appeared at ISSTA'08:

Title: Combining Unit-level Symbolic Execution and System-level Concrete Execution for Testing NASA Software, Authors: C. S. Pasareanu, P. C. Mehlitz, D. H. Bushnell, K. Gundy-Burlet, M. Lowry, S. Person, M. Pape.

#### [](https://github.com/SymbolicPathFinder/jpf-symbc#getting-started)Getting Started

First of all please use Java 8 (I am afraid our tools do not work with older versions of Java).

Then please download jpf-core from here:  [https://github.com/yannicnoller/jpf-core/tree/0f2f2901cd0ae9833145c38fee57be03da90a64f](https://github.com/yannicnoller/jpf-core/tree/0f2f2901cd0ae9833145c38fee57be03da90a64f)

And jpf-symbc from here:  [https://github.com/SymbolicPathFinder/jpf-symbc](https://github.com/SymbolicPathFinder/jpf-symbc)

Import them in Eclipse as 2 Java projects. Also create a .jpf dir in your home directory and create in it a file called "site.properties" with the following content:

jpf-core = ${user.home}/.../path-to-jpf-core-folder/jpf-core

jpf-symbc = ${user.home}/.../path-to-jpf-core-folder/jpf-symbc

extensions=${jpf-core},${jpf-symbc}

You can then try to run some examples by selecting a .jpf file from the "examples" directory and then selecting a run configuration from the "Run" menu in Eclipse. In particular you should select: "run-JPF-symbc" to run Symbolic PathFinder on your example (configuration "run-JPF-symbc-mac" is tailored for Mac).

Good luck!

-----------------
# Section III - Using SPF for Neural Network Analysis
## Pre-GSoC Implementation
```java
		mnist0.DNNt modelPreGsoc = new mnist0.DNNt();
		DNN.readDataFromFiles(DNNt.path+"params\\");
		modelPreGsoc.biases0 = DNN.getBiases0();
		modelPreGsoc.biases2 = DNN.getBiases2();
		modelPreGsoc.biases6 = DNN.getBiases6();
		modelPreGsoc.biases8 = DNN.getBiases8();
		modelPreGsoc.weights0 = DNN.getWeights0();
		modelPreGsoc.weights2 = DNN.getWeights2();
		modelPreGsoc.weights6 = DNN.getWeights6();
		modelPreGsoc.weights8 = DNN.getWeights8();
```
## GSoC Implementation
  
```java
		mnist0.DNNt modelGsoc = new mnist0.DNNt();
		DNNGeneralize.readDataFromFiles(DNNt.path+"params\\",DNNt.path+"mnist0.json");
		modelGsoc.biases0 = (double[]) DNNGeneralize.get_data("biases0");
		modelGsoc.biases2 = (double[]) DNNGeneralize.get_data("biases2");
		modelGsoc.biases6 = (double[]) DNNGeneralize.get_data("biases6");
		modelGsoc.biases8 = (double[]) DNNGeneralize.get_data("biases8");
		modelGsoc.weights0 = (double[][][][]) DNNGeneralize.get_data("weights0");
		modelGsoc.weights2 = (double[][][][]) DNNGeneralize.get_data("weights2");
		modelGsoc.weights6 = (double[][]) DNNGeneralize.get_data("weights6");
		modelGsoc.weights8 = (double[][]) DNNGeneralize.get_data("weights8");
```
Please note that the Pre-GSoC implementation takes only one argument, i.e., the path to the directory containing weights and biases. However, the GSoC implementation takes an additional argument, that is the path to the JSON file containing the description of the neural network architecture. 

**Additional Steps:** 
-	Path to SPF directory needs to be updated in the following JAVA class. https://github.com/muhammadusman93/jpf-symbc/blob/master/src/examples/paths/paths.java
-	json-simple.jar, located in the lib folder https://github.com/muhammadusman93/jpf-symbc/tree/master/lib, should be added to the build path. 

## Sample Usage
- Sample usage for ***MNIST0*** is provided at https://github.com/muhammadusman93/jpf-symbc/tree/master/src/examples/mnist0  


- Sample usage for ***MNIST1*** is provided at https://github.com/muhammadusman93/jpf-symbc/tree/master/src/examples/mnist1


- Sample usage for ***MNIST2*** is provided at https://github.com/muhammadusman93/jpf-symbc/tree/master/src/examples/mnist2


- Sample usage for ***CIFAR*** is provided at https://github.com/muhammadusman93/jpf-symbc/tree/master/src/examples/cifar

## Section IV: Evaluation
 
We evaluated our implementation on four types of architectures, namely ***MNIST0***, ***MNIST1***, ***MNIST2*** and ***CIFAR***. The detailed architecture for each neural network is given in **Section V**. 

### Evaluation on MNIST0
The Pre-GSoC SPF implementation supports symbolic execution for ***MNIST0*** architecture. While our aim is to support more neural network architectures, it is equally important to make sure that the GSoC implementation still supports ***MNIST0*** architecture. We created a test suite of 11 tests. The first 10 tests in the suite take a sample image and collect constraints at the last layer using Pre-GSoC implementation of SPF. The results are compared to check that Pre-GSoC and GSoC implementations produce the same results. Another test was added to make sure that both the SPF implementations are reading the correct values of weights and biases from the files. All the 11 tests are passing, confirming that the GSoC implementation is consistent with the Pre-GSoC implementation. 


### Evaluation on MNIST1, MNIST2 and CIFAR
While our implementation supports all types of neural network architectures, we select ***MNIST1***, ***MNIST2*** and ***CIFAR*** to evaluate the correctness of our approach. We chose these neural network architectures because of their popularity and the fact that they represent a variety of neural network architectures. Since the Pre-GSoC implementation does not support these architectures, it was impossible to compare results produced using GSoC implementation with Pre-GSoC implementation. Therefore, we used a manual hard-coded code to parse the weights and biases and then compared our implementation with the hard-coded results. All tests passed, and the tests confirmed the correctness of our approach. 

# Section V: Neural Network Architectures
### MNIST0

DNN architecture is as follows. 

        Layer (type)                 Output Shape              Param #   
        =================================================================
        conv2d_1 (Conv2D)            (None, 26, 26, 2)         20        
        _________________________________________________________________
        activation_1 (Activation)    (None, 26, 26, 2)         0         
        _________________________________________________________________
        conv2d_2 (Conv2D)            (None, 24, 24, 4)         76        
        _________________________________________________________________
        activation_2 (Activation)    (None, 24, 24, 4)         0         
        _________________________________________________________________
        max_pooling2d_1 (MaxPooling2 (None, 12, 12, 4)         0         
        _________________________________________________________________
        flatten_1 (Flatten)          (None, 576)               0         
        _________________________________________________________________
        dense_1 (Dense)              (None, 128)               73856     
        _________________________________________________________________
        activation_3 (Activation)    (None, 128)               0         
        _________________________________________________________________
        dense_2 (Dense)              (None, 10)                1290      
        _________________________________________________________________
        activation_4 (Activation)    (None, 10)                0         
        =================================================================
        Total params: 75,242
        Trainable params: 75,242
        Non-trainable params: 0

### MNIST1

DNN architecture is as follows. 

        Layer (type)                 Output Shape              Param #
        =================================================================
        conv2d_1 (Conv2D)            (None, 26, 26, 8)         80
        _________________________________________________________________
        max_pooling2d_1 (MaxPooling2 (None, 13, 13, 8)         0
        _________________________________________________________________
        conv2d_2 (Conv2D)            (None, 11, 11, 16)        1168
        _________________________________________________________________
        max_pooling2d_2 (MaxPooling2 (None, 5, 5, 16)          0
        _________________________________________________________________
        flatten_1 (Flatten)          (None, 400)               0
        _________________________________________________________________
        dense_1 (Dense)              (None, 100)               40100
        _________________________________________________________________
        dense_2 (Dense)              (None, 10)                1010
        =================================================================
        Total params: 42,358
        Trainable params: 42,358
        Non-trainable params: 0

### MNIST2

DNN architecture is as follows. 

      Layer (type)                 Output Shape              Param #
      =================================================================
      dense_1 (Dense)              (None, 50)                39250
      _________________________________________________________________
      dense_2 (Dense)              (None, 10)                510
      _________________________________________________________________
      dense_3 (Dense)              (None, 10)                110
      =================================================================
      Total params: 39,870
      Trainable params: 39,870
      Non-trainable params: 0

### CIFAR

DNN architecture is as follows. 

	Layer (type)                 Output Shape              Param #
	=================================================================
	conv2d_1 (Conv2D)            (None, 30, 30, 32)        896
	_________________________________________________________________
	activation_1 (Activation)    (None, 30, 30, 32)        0
	_________________________________________________________________
	conv2d_2 (Conv2D)            (None, 28, 28, 32)        9248
	_________________________________________________________________
	activation_2 (Activation)    (None, 28, 28, 32)        0
	_________________________________________________________________
	max_pooling2d_1 (MaxPooling2 (None, 14, 14, 32)        0
	_________________________________________________________________
	conv2d_3 (Conv2D)            (None, 12, 12, 64)        18496
	_________________________________________________________________
	activation_3 (Activation)    (None, 12, 12, 64)        0
	_________________________________________________________________
	conv2d_4 (Conv2D)            (None, 10, 10, 64)        36928
	_________________________________________________________________
	activation_4 (Activation)    (None, 10, 10, 64)        0
	_________________________________________________________________
	max_pooling2d_2 (MaxPooling2 (None, 5, 5, 64)          0
	_________________________________________________________________
	flatten_1 (Flatten)          (None, 1600)              0
	_________________________________________________________________
	dense_1 (Dense)              (None, 512)               819712
	_________________________________________________________________
	activation_5 (Activation)    (None, 512)               0
	_________________________________________________________________
	dense_2 (Dense)              (None, 10)                5130
	_________________________________________________________________
	activation_6 (Activation)    (None, 10)                0
	=================================================================
	Total params: 890,410
	Trainable params: 890,410
	Non-trainable params: 0

# Section VI: Conclusion

The Pre-GSoC implementation of Symbolic PathFinder allows to run symbolic execution only with 1 fixed neural network architecture, i.e., ***MNIST0***. We have added another implementation which is more generic and supports symbolic execution for all types of neural network architectures. We evaluated our implementation using a variety of architectures, namely ***MNIST0***, ***MNIST1***, ***MNIST2***, and ***CIFAR***. Evaluation results show the correctness of our GSoC implementation. We believe that this GSoC implementation will make it easier for researchers to analyze a wide variety of neural networks. This will enable them to improve the neural network performance as well as help in identifying the vulnerabilities in already existing neural network architectures.

# ACKNOWLEDGEMENTS

This project is part of Google Summer of Code (GSoC) 2020. Google Summer of Code is a global program with the aim to encourage student developers to write open source code. This program is supported by Google Inc. 

I will like to thank my mentors (Corina Pasareanu, Yannic Noller and Sarfraz Khurshid) for their continued support and guidance. 
