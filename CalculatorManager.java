class Calculator
{
int first;
int second;

int sumResult;
int subResult;
int mulResult;
int remResult;

double divResult;
Calculator(int a,int b)
{
first=a;
second=b;
}

public void performAdd()
{
 sumResult=first+second;
}
public void performSub()
{
 subResult=first-second;
}
public void performMul()
{
 mulResult=first*second;
}
public void performDiv()
{
 divResult=first/second;
}
public void performRem()
{
 remResult=first%second;
}
class CalculatorManager
{
public static void main(String[]args)
{
Calculator c1=new Calculator(10,5);
c1.performAdd();
c1.displaySum();
c1.performSub();
c1.displaySub();
c1.performMul();
c1.displayMul();
c1.performDiv();
c1.displayDiv();
c1.performRem();
c1.displayRem();

}
}
}


















