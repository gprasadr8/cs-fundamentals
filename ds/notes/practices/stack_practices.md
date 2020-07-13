### Checking Balance of Symbols:

1. create stack <br>
2. while(input not reached end) <br>
    a). If the character is not a symbol ignore it. <br>
    b). If the character is an opening symbol like (, { and \[ then push it to stack. <br>
    c). If teh character is a closing symbol like ), } and ] then if the stack is empty report an error. Otherwise pop the stack.<br>
    d). If the popped symbol is not corresponding opening symbol report an error <br>
3. at the end of the input if the stack is not empty report an error. <br>

[Implementation](#)