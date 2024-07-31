package com.StringsP;
/*
Problem Description
You are given a string A of size N.
Return the string A after reversing the string word by word.
NOTE:
A sequence of non-space characters constitutes a word.
Your reversed string should not contain leading or trailing spaces, even if it is present in the
input string.If there are multiple spaces between words, reduce them to a single space in the
reversed string.
 */
public class ReverseTheString {
    public static void main(String[] args) {

    }
    public String solve(String A) {
        A=A.trim();
        String[] sArray=A.split(" ");
        String s="";
        for(int i=sArray.length-1;i>=0;i--){
            s +=sArray[i]+" ";
        }
        return s.trim();
    }
}
