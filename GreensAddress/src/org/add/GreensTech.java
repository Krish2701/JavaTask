package org.add;

import java.util.Scanner;

public class GreensTech {
int pid;
String prop_name;
int prop_networth;
String p_address;


GreensTech(int id, String name,int worth,String address){
	pid =id;
	prop_name=name;
	prop_networth=worth;
	p_address=address;
}
void greensOmr()
{
	System.out.println(pid);
	System.out.println(prop_name);
	System.out.println(prop_networth);
	System.out.println(p_address);
}
void greensAdayar()
{
	System.out.println(pid);
	System.out.println(prop_name);
	System.out.println(prop_networth);
	System.out.println(p_address);
}
void greensTambaram()
{
	
		
	System.out.println(pid);
	System.out.println(prop_name);
	System.out.println(prop_networth);
	System.out.println(p_address);
}
void greenVelacherry()
{
	System.out.println(pid);
	System.out.println(prop_name);
	System.out.println(prop_networth);
	System.out.println(p_address);
}
void greensAnnaNagar()
{
	System.out.println(pid);
	System.out.println(prop_name);
	System.out.println(prop_networth);
	System.out.println(p_address);
}
void display1() {

	
	greensOmr();
	
}
void display2() {

	
	greensAdayar();
	
}
void display3() {

	
	greensTambaram();
	
}
void display4() {

	
	greenVelacherry();
	
}
void display5() {

	
	greensAnnaNagar();
	
}
@SuppressWarnings("unused")
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	GreensTech GT1= new GreensTech(101,"OMR",100000,"Chennai");
	GreensTech GT2= new GreensTech(102,"Adayar",200000,"Chennai");
	GreensTech GT3= new GreensTech(103,"Tambaram",100000,"EastCoast");
	GreensTech GT4= new GreensTech(104,"Velacherry",400000,"Chennai");
	GreensTech GT5= new GreensTech(105,"AnnaNagar",500000,"Chennai");
	
	GT1.display1();
	System.out.println("**__The Second property__**");
	GT2.display2();
	System.out.println("**__The Third property__**");
	GT3.display3();
	System.out.println("**__The Fourth property__**");
	GT4.display4();
	System.out.println("**__The Fifth property__**");
	GT5.display5();
	
	
	
	
	
	
}
	



}