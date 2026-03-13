This project implements the xDSL of a standard hierarchical UML state machine. 
It supports composite states and history states, yet no parallel states.
The metamodel has been edited with [Xmodeling Studio](https://github.com/h-richard/Xmodeling_Studio) allowing it to define business actions on states (entry, do, exit) and transitions.

Execution is launched using the StateMachineController.java in StateMachine/src/
Events are entered in the console and processed by the state machine.  

This project comes with example .stm models in StateMachine/model/  
You may change the interpreted model in the StateMachineController (value of the constant "MODEL")  
Each model has an associated service class in StateMachine/src/ext/, which are already linked up in the StateMachineController  

### Microwave (microwave.stm)
A state chart of a functional microwave with two composite states (open/close) and a history state in 'close'.
In this example, multiple transitions are possible when the state 'baking' is active.  
In accordance to standard UML semantics, the most specific transition is taken (here from 'baking' to 'paused').  
  
![State chart of a microwave](/images/microwave.png)

### Stack (stack.stm)
A state chart representing a stack.  
This example illustrates the use of guards to control which transition is taken when multiple are available.  
It also contains two transitions from the state 'NotEmpty' to itself.  
  
<img src="/images/stack.png" width="678" height="225" alt="State chart of a stack"/>

### Car (car.stm)
A state chart representing a car with changing speed. 
Here again, multiple transitions are available from the composite state 'moving', as well as transitions from 'moving' to itself.  

![State chart of a car](/images/car.png)
