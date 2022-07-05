package com.example.Operations;

public class Operations {

    Integer answer;
   Integer number1;
   Integer number2;
   Character symbol;

    public Operations(){}
    public Operations(Integer number1,Character symbol, Integer number2){
        this.number1 = number1;
        this.symbol = symbol;
        this.number2 = number2;
    }
    public Integer doOpration(){
        switch(symbol){
            case '+':
                answer = number1 + number2;
                break;
            case '-':
                answer = number1 - number2;
                break;
            case '*':
                answer = number1 * number2;
                break;
            case '/':
                answer = number1 / number2;
                break;
            case '^':
                answer = number1 ^ number2;
                break;
            case '%':
                answer = number1 % number2;
                break;
            default:
                answer = null;
                break;
        }

        return answer;
    }
    public Character getSymbol() {
        return symbol;
    }

    public void setSymbol(Character symbol) {
        this.symbol = symbol;
    }

    public Integer getNumber1() {
        return number1;
    }

    public void setNumber1(Integer number1) {
        this.number1 = number1;
    }

    public Integer getNumber2() {
        return number2;
    }

    public void setNumber2(Integer number2) {
        this.number2 = number2;
    }
}

