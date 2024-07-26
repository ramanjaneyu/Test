package com.test.core.programs.strings;

import java.util.Stack;

/*
Program to check the balanced parenthesis in a given string
Implement the algorithm using Stack Data Structure
Input: String s1="(){}[]";
Output: true
Input: String s2 = "(){}[]]"
Output: false
 */
public class CheckForBalancedParenthesis {
    public static void main(String[] args) {
        String s1 = "[(){}[]]";
        System.out.println(isBalancedUsingStack(s1));
    }
    private static boolean isBalancedUsingStack(String input){
        Stack<Character> st = new Stack<>();
        char[] chars = input.toCharArray();
        for(char it : chars){
            if(it == '(' || it == '{' || it == '[')
                st.push(it);
            else {
                if(st.isEmpty()) return false;
                char ch = st.pop();
                if((it == ')' && ch == '(') || (it == '}' && ch == '{') || (it == ']' && ch == '['))
                    continue;
                else
                    return false;
            }
        }
        return st.isEmpty();
    }
}
