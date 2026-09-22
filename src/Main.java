public class Main{
    static void main()
    {
        int intOperandA = 23;
        int intOperandB = 34;
        int intSum = 0;
        int intProduct = 0;
        int intDifference = 0;
        int intQuotient = 0;
        int intModulo = 0;

        intSum = intOperandA + intOperandB;
            IO.println("The sum of " + intOperandA + " + " + intOperandB + " = " + intSum);
        intProduct = intOperandA * intOperandB;
            IO.println("The product of " + intOperandA + " * " + intOperandB + " = " + intProduct);
        intDifference = intOperandB - intOperandA;
            IO.println("The difference of " + intOperandB + " = " + intOperandA + " = " + intDifference);
        intQuotient = intOperandB / intOperandA;
            IO.println("The quotient of " + intOperandB + " / " + intOperandA + " = " + intQuotient);
        intModulo = intOperandB % intOperandA;
            IO.println("The reminder of " + intOperandB + " and " + intOperandA + " is " + intModulo);

        double doubleOperandA = 14.50;
        double doubleOperandB = 21.45;
        double doubleSum = 0;
        double doubleProduct = 0;
        double doubleDifference = 0;
        double doubleQuotient = 0;

        doubleSum = doubleOperandA + doubleOperandB;
            IO.println("The sum of " + doubleOperandA + " + " + doubleOperandB + " = " + doubleSum);
        doubleProduct = doubleOperandA * doubleOperandB;
            IO.println("The product of " + doubleOperandA + " * " + doubleOperandB + " = " + doubleProduct);
        doubleProduct = doubleOperandB - doubleOperandA;
            IO.println("The difference of " + doubleOperandB + " = " + doubleOperandA + " = " + doubleDifference);
        doubleQuotient = doubleOperandB / doubleOperandA;
            IO.println("The quotient of " + doubleOperandB + " / " + doubleOperandA + " = " + doubleQuotient);


    }
}