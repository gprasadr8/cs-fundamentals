package com.pw.stack.practices;

import java.util.Stack;

public class SymbolBalancing {

    private static final char OPEN_PARENTHESIS= '(';
    private static final char CLOSE_PARENTHESIS= ')';

    private static final char OPEN_CURLY_BRACE= '{';
    private static final char CLOSE_CURLY_BRACE= '}';

    private static final char OPEN_SQUARE_BRACKET= '[';
    private static final char CLOSE_SQUARE_BRACKET= ']';


    public static void main(String[] args) {
        SymbolBalancing symbolBalancing = new SymbolBalancing();
        String s1 = "[{()}]";
        String s2 = "[{(((())))}]";
        String s3 = "[{(((())))}]{";
        System.out.println(" Expression: "+s1 +" valid: "+symbolBalancing.validateExpressionSymbols(s1));
        System.out.println(" Expression: "+s2 +" valid: "+symbolBalancing.validateExpressionSymbols(s2));
        System.out.println(" Expression: "+s3 +" valid: "+symbolBalancing.validateExpressionSymbols(s3));

    }

    public boolean validateExpressionSymbols(String s){
        Stack<Character> stack = new Stack<>();
        if(s==null || s.isEmpty()){
            System.out.println("Empty String has given");
            return false;
        }

        char[] chars = s.toCharArray();
        for (char character: chars) {
            if(character == OPEN_PARENTHESIS || character == OPEN_CURLY_BRACE || character == OPEN_SQUARE_BRACKET){
                stack.push(character);
                continue;
            }
            if(character == CLOSE_PARENTHESIS){
                if(stack.isEmpty()){
                    System.out.println("Stack is Empty");
                    return false;
                }
                Character openSymbol = stack.pop();
                if(openSymbol != OPEN_PARENTHESIS){
                    System.out.println("Open symbol mismatch for "+character);
                    return false;
                }
            }else if(character == CLOSE_CURLY_BRACE){
                if(stack.isEmpty()){
                    System.out.println("Stack is Empty");
                    return false;
                }
                Character openSymbol = stack.pop();
                if(openSymbol != OPEN_CURLY_BRACE){
                    System.out.println("Open symbol mismatch for "+character);
                    return false;
                }
            }else if(character == CLOSE_SQUARE_BRACKET){
                if(stack.isEmpty()){
                    System.out.println("Stack is Empty");
                    return false;
                }
                Character openSymbol = stack.pop();
                if(openSymbol != OPEN_SQUARE_BRACKET){
                    System.out.println("Open symbol mismatch for "+character);
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
