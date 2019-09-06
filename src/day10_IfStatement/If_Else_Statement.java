package day10_IfStatement;

public class If_Else_Statement {
public static void main(String[] args) {
	/*
	 *if (condition) {
	 //A}
	  
	  else{//B}
	 */

	if (9>11) {
		System.out.println("Yes");}
		else {
		System.out.println("No");}
	
	if(false== !false) {
		System.out.println("if block");}
	else {
		System.out.println("else block");}
	
	/*
	 TASK 01;
	 if score<60 ==>fail;
	 if score>=60<90 ==> pass;
	 if score >=90 passed with distinction
	 */
	
	
	int score=59;
	
	if (score>=60) {
		System.out.println("passed");}
	else {
		System.out.println("failed");}
	if(score>=90) {
		System.out.println("you have made A+, good job");}
	else {
		System.out.println("you could not make A+");}

	
	/*
	 1)Triangles: has three angles and sum of angles must be equal to 180
	 
	 Solution:
	 - Declare three variables angle1, angle2,angle3
	 -Write a program to check if the triangle is valid or not
	 */
	
	int angle1=20, angle2=160, angle3=0;
	boolean valid=(angle1+angle2+angle3==180);
	
	if(valid) {
		System.out.println("it's a valid triangle");}
	else {
		System.out.println("invalid triangle");}
	// BURADA BUG VAR. TEK ACIYA 180 DERSEK , DIGER ACILAR 0-0 OLUYOR, BU BAUG OLUYOR
	
	
	/*
	 multi branch if statement: if there are more than two possibilities
	 if(condition){//A}
	 else if(condition){//B}
	 else{
	 
	 
	 */
	
	
	}
}
