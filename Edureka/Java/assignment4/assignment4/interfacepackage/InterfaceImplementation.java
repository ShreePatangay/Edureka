package assignment4.interfacepackage;

import java.util.ArrayList;

public class InterfaceImplementation implements Queue {

	public InterfaceImplementation() {
		// TODO Auto-generated constructor stub
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceImplementation thisList = new InterfaceImplementation();
		ArrayList<String> list = new ArrayList<>();
		thisList.insert(list, "Johnny");
		System.out.println(list);
		thisList.insert(list,"Cage");
		System.out.println(list);
		thisList.insert(list, "Ghost Rider");
		System.out.println(list);
		thisList.delete(list, "Ghost Rider");
		System.out.println(list);
	}


	@Override
	public void insert(ArrayList<String> list, String element) {
		// TODO Auto-generated method stub
		list.add(element);
	}


	@Override
	public void delete(ArrayList<String> list, String element) {
		// TODO Auto-generated method stub
		list.remove(element);
	}
}
