package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*Pedir hora
	* Leer hora
	* Pedir minutos
	* Leer minutos
	* SI ( hora >=7 AND hora <=14)
	*	SI (hora == 7)
	*		 SI (minutos => 30)
	*			mensaje=“Good Morning”
	*		SI_NO
	*			mensaje=“Good night”
	*		FIN_SI
	*	SI_NO
	*		SI (hora == 14)
	*			SI (minutos ==0)
	*				mensaje=“Good morning”
	*			SI_NO
	*				mensaje=“Good afternoon”
	*			FIN_SI
	*		SI_NO
	*			mensaje=“good morning”
	*SI_NO
	*	SI (hora >=15 AND hora <= 20)
	*		SI (hora == 20)
	*			SI (minutos <= 30)
	*				mensaje=“good afternoon”
	*			SI_NO
	*				Mensaje=“good night”
	*		SI_NO
	*			mensaje=“good afternoon”*/
        Scanner scan=new Scanner(System.in);
        int h=0, m=0;
        System.out.println("Escriba la hora en formato 24h");
        h= scan.nextInt();
        System.out.println("Escriba los minutos");
        m=scan.nextInt();
        if ( h >=7 && h <=14) {
            if (h == 7) {
                if (m>=30){
					System.out.println("Good Morning");
				}else{
                    System.out.println("Good Night");
                }
            }else{
                if (h == 14){
                    if (m==0){
                        System.out.println("Good Morning");
                    }else{
						System.out.println("Good Afternoon");
					}
                }else{
					System.out.println("Good Morning");
				}
            }
        }else{
			if (h >= 15 && h <= 20){
				if (h == 20){
					if (m <=30){
						System.out.println("Good Afternoon");
					}else{
						System.out.println("Good Night");
					}
				}else{
					System.out.println("Good Afternoon");
				}
			}
		}
    }
}
