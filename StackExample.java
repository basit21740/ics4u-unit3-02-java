/*
 * This program pushes and prints a stack.
 *
 * @author  Abdul Basit
 * @version 1.0
 * @since   2022-02-03
 */

/** This program demonstrates a stack. */
final class StackExample {

    /**
     * Prevents instantiation.
     * Throw an exception IllegalStateException when called.
     *
     * @throws IllegalStateException
     *
     */
    private StackExample() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
     * Creates an instance of MrCoxallStack and uses its methods.
     *
     * @param args No args will be used.
     */
    public static void main(final String[] args) {
        final MrCoxallStack aStack = new MrCoxallStack();
        final int number1 = 1;
        final int number2 = 2;
        final int removedElement;

        System.out.println("Pushing #1...");
        aStack.push(number1);
        aStack.showStack();

        System.out.println("\nPushing #2...");
        aStack.push(number2);
        aStack.showStack();

        System.out.println("\nPopping...");
        removedElement = aStack.pop();
        System.out.println("Removed: " + removedElement);
        aStack.showStack();

        System.out.println("\nDone.");
    }
}
