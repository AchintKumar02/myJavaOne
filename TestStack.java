class Stack{
    int stk[] = new int[10];
    int top;

    Stack (){
        top = -1;
    }

    void push(int item){
        if(top == 9)
            System.out.println("Stack full");
        else
            stk[++top] = item;
    }
    int pop(){
        if(top==-1){
            System.out.println("stack empty");
            return 0;
        }else
            return stk[top--];
    }
    void display(){

    }
}
class TestStack{
    public static void main(String args[]){
        Stack myStack1 = new Stack();
        Stack myStack2 = new Stack();

        System.out.println("Add some item in stack");
        for(int i=0; i <= 10; i++)myStack1.push(i);
        for(int i=10; i <= 20; i++)myStack2.push(i);
        
        System.out.println("Item in stack 1");
        for(int i=0; i <= 10; i++)
            System.out.println(myStack1.pop());
        
        System.out.println("Item in stack 2");
        for(int i=10; i <= 20; i++)
            System.out.println(myStack2.pop());

    }
}