package com.Hibernate_project;

import java.util.*;
import javax.persistence.*;

public class LoginAcc extends Signin {
	public static void login() {

		System.out.println("     Login Here:)👨‍💻👨‍💻👨‍💻      ");
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		System.out.println("Enter your Mobile Number");
		long number = sc.nextLong();
		a1.setNumber(number);
		System.out.println("Enter your Passoword");
		String password = sc.next();
		a1.setPassword(password);
		Query q = em.createQuery("select s from DTO_Data s");
		List<DTO_Data> li = q.getResultList();
		//Iterator i = li.iterator();
		for (DTO_Data d : li) {
			if (d.getNumber()==(number)) {
				if (d.getPassword().equals(password)) {
					System.out.println("Welcome to the Website " + d.getName());
				}
			}
		}
	}

}
