# Tranining on Java Core
-------------------------------------------------------------------------------
Includes the core java basic useful for __Android__

## Tools
* JDK ( OpenJDK or Oracle JDK)
* Text Editor (Any thing- Sublime or Atom or <3 emacs)
* IDE (not recommended :( )

-------------------------------------------------------------------------------
### Language
* How it works? (JDK, JRE, JVM, .java, .class, bytecode)
* write/edit - compile - run (editor, javac, java)
* Type Safe
* Basic Structure
* Comments (Single line or multiline)
* Variables, Data Types (int, char, float, double,bool, String-Refrence Type etc)

`
data_type <identifier>;
// eg
int rollNo; //RollNo rollNo  roll_no;
// No special chars (except _)
String name;
// value assign => Operation Assignment (=)
// Value Type Numeric,char ('SingleQuote') ,String ("Double Quote")
rollNo = 10;
// declar with initialization
String address = "Kathmandu";
`

* Expression + Operators (+,-,* etc)

`
float marks_math=123.90, marks_eng =234.09;
float avg = (marks_math+marks_eng)/2;
`

* Statements/Block - terminate by ; / block-{ }
* if..elseif..else, switch

`
    if(expression){
        // true
    }else{
        // false
    }
    // evaluation operatiors ( ==  <= >=  <  > !(NOT)  !=    AND(&&)   OR(||)
    // !true => false
    // !false => true
    // true && true => true     otherwise false
    // false || false => false   otherwise true
    // eg : percent = 89
    // percent >=60 && percent < 80  => true
    
    float percent = 89;
    if(percent >=60 && percent < 80){
        System.out.println("First Division");
        }
    else{
        System.out.println("Other  Division");
        }

    // else if
    if(percent >=60 && percent < 80){
        System.out.println("First Division");
    }
    else if(percent >=80) {
        System.out.println("Distincition");
        }
    else{
        // else
    }
`
    
* Conditional Operator (? :)
* Iterations: while, for, do-while, foreach

`
while (expn){
    delay(100*60*10)
    // execute this
    }

while(x==8){
    // I can use x here
    x= x+5-y;
}

do{
    // this block execute at least once
}while(expn)

// for ++,
// eg: x++; => x = x+1;
// eg: x--; => x = x-1;
for(counter-init; counter-evaluate; counter-inc-dec; ){
    // loop Body
}

`
* Nested Loop
* Array / Object
* Defining Class
* Getter/Setter
* Different ways of creating Objects
* Overloading
* Calling Methods
* Inheritance (extend/implement)
* Example of implement

### Generics
* List, ArrayList
* Generic Types

### Standard Library
* File handling
* Http handling


-------------------------------------------------------------------------------
