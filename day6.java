// array
// collection of homogeous data
// type -> collection -> set {elements .....}, size, index(position)

class Array{
    public static void main(String[] args){
        // type[] array_name = new type[size];
        // size => length(capacity)
        // index => position - zero based  {0,1,2,....., size-1}
        // array_name.length => returns int
        int[] roll_nos = new int[10] ;
        // element access through index  --- array_name[index]
        roll_nos[0] = 1;
        roll_nos[1] = 2;
        int i=0;
        for(i=0;i <= roll_nos.length-1; i++){
            roll_nos[i] = i+1;
            // i++ => i = i+1
        }
        System.out.println("data of 5th position roll no is : "+ roll_nos[4]);
        i=0;
        while(i<roll_nos.length){           
            System.out.printf("The data of pos (%s) \t=\t %s \n",i, roll_nos[i]);
            i++;
        }
        // type[] name = { list of data};
        String[] names = {"ram","Hari", "Sita" };
        System.out.println("Lenght of Names ="+ names.length);

        for(String name: names)
            System.out.printf("%s \n",name);
        for(i=0; i<names.length ; i++)
            System.out.printf("names[%d] = %s \n",i, names[i]);
        

        // array of Object
        Student[] students = new Student[5];
        students[0] = new Student();
        students[0].name = "Rupak";
        students[0].marks = 40;
        students[1] = new Student();
         students[1].name = "Rupaasdfk";
        students[1].marks = 234;
        students[2] = new Student();
         students[2].name = "sdf";
        students[2].marks = 403;
        students[3] = new Student();
         students[3].name = "sfd";
        students[3].marks = 40;
        students[4] = new Student();
         students[4].name = "Rupak";
        students[4].marks = 40;
        for(i=0; i< students.length; i++)
            System.out.printf("The marks of %s is %s \n", students[i].name, students[i].marks);
        
    }
}

class Student{
    public String name ;
    public float marks;
}
