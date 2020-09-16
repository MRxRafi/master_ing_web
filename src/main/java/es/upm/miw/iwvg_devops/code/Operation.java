package es.upm.miw.iwvg_devops.code;

public class Operation {
    private int firstNumber;
    private int secondNumber;
    private int sape;
    public Operation(int firstNumber, int secondNumber){
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public int sumOperator(){
        return firstNumber + secondNumber;
    }

    public int substractOperator(){
        return firstNumber - secondNumber;
    }
}
