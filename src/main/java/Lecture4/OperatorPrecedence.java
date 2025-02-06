package Lecture4;

public class OperatorPrecedence {
    public static void main(String[] args) {
        int postfixValue = 5, unaryValue = 3;

        // Postfix
        System.out.println("Postfix Increment: " + (postfixValue++)); // Prints 5, then becomes 6
        System.out.println("Postfix Decrement: " + (unaryValue--)); // Prints 3, then becomes 2

        // Unary
        int unaryIncrementValue = 5;
        int unaryDecrementValue = 3;
        System.out.println("Unary Increment: " + (++unaryIncrementValue)); // 6
        System.out.println("Unary Decrement: " + (--unaryDecrementValue)); // 2
        System.out.println("Unary Positive: " + (+unaryIncrementValue)); // 6
        System.out.println("Unary Negative: " + (-unaryDecrementValue)); // -2
        System.out.println("Unary Not: " + (!true)); // false

        // Multiplicative
        int multiplicativeA = 5, multiplicativeB = 3;
        System.out.println("Multiplicative: " + (multiplicativeA * multiplicativeB)); // 15
        System.out.println("Multiplicative: " + (multiplicativeA / multiplicativeB)); // 1
        System.out.println("Multiplicative: " + (multiplicativeA % multiplicativeB)); // 2

        // Additive
        int additiveA = 5, additiveB = 3;
        System.out.println("Additive: " + (additiveA + additiveB)); // 8
        System.out.println("Additive: " + (additiveA - additiveB)); // 2

        // Shift
        int shiftA = 5;
        System.out.println("Shift Left: " + (shiftA << 1)); // 10
        System.out.println("Shift Right: " + (shiftA >> 1)); // 2
        System.out.println("Unsigned Shift Right: " + (shiftA >>> 1)); // 2

        // Relational
        int relationalA = 5, relationalB = 3;
        System.out.println("Relational: " + (relationalA > relationalB)); // true
        System.out.println("Relational: " + (relationalA < relationalB)); // false
        System.out.println("Relational: " + (relationalA >= relationalB)); // true
        System.out.println("Relational: " + (relationalA <= relationalB)); // false

        // Equality
        int equalityA = 5, equalityB = 3;
        System.out.println("Equality: " + (equalityA == equalityB)); // false
        System.out.println("Equality: " + (equalityA != equalityB)); // true

        // Bitwise AND
        int bitwiseANDA = 5, bitwiseANDB = 3;
        System.out.println("Bitwise AND: " + (bitwiseANDA & bitwiseANDB)); // 1

        // Bitwise Exclusive OR
        int bitwiseXORA = 5, bitwiseXORB = 3;
        System.out.println("Bitwise Exclusive OR: " + (bitwiseXORA ^ bitwiseXORB)); // 6

        // Bitwise Inclusive OR
        int bitwiseORA = 5, bitwiseORB = 3;
        System.out.println("Bitwise Inclusive OR: " + (bitwiseORA | bitwiseORB)); // 7

        // Logical AND
        System.out.println("Logical AND: " + (true && false)); // false

        // Logical OR
        System.out.println("Logical OR: " + (true || false)); // true

        // Ternary
        int ternaryA = 5, ternaryB = 3;
        System.out.println("Ternary: " + (ternaryA > ternaryB ? "a is greater" : "b is greater")); // a is greater

        // Assignment
        int assignmentValue = 5;
        assignmentValue += 2; // 7
        System.out.println("Assignment +=: " + assignmentValue);
        assignmentValue -= 2; // 5
        System.out.println("Assignment -=: " + assignmentValue);
        assignmentValue *= 2; // 10
        System.out.println("Assignment *=: " + assignmentValue);
        assignmentValue /= 2; // 5
        System.out.println("Assignment /=: " + assignmentValue);
        assignmentValue %= 2; // 1
        System.out.println("Assignment %=: " + assignmentValue);
    }
}
