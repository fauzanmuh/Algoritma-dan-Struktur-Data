package pacman;

import java.util.Scanner;

/**
 *
 * @author FauzanOIOI
 */
public class Pacman {
    static Scanner input = new Scanner(System.in);

		
	public static void setting(){
		System.out.println("Game PacMan : ");
		System.out.println("w = Bergerak ke atas");
		System.out.println("s = Bergerak ke bawah");
		System.out.println("a = Bergerak ke kiri");
		System.out.println("d = Bergerak ke kanan");
		
	}

	public static void warning(){
		System.out.println("\n\nMohon masukkan input yang tepat !!!\n\n");
		input();

	}

	public static void over(){
		System.out.println("\n\nKoordinat tidak boleh kurang dari 0 !!!\n\n");
		input();
	}

	public static void input(){
		PacmanInput pc = new PacmanInput();
		pc.width = 5;
		pc.height = 5;

		setting();
		System.out.print("\nMasukkan kontrol : ");
		pc.select = input.nextLine() .toLowerCase();

		switch (pc.select) {
			case "w": 
			if ((pc.y-1) < 0) {
			over();
        		}
                        
			break;
			case "s":
			if ((pc.y + 1) >= pc.width) {
        		over();
			}
                        
			break;
			case "a":	
			if ((pc.x-1) < 0) {
			over();
			}
                        
			break;
			case "d":
			if ((pc.x + 1) >= pc.height) {
                        over();
			}
                        
			break;
			default:
		}

		switch(pc.select){
			case "w" : pc.moveUp();
			break;
			case "s" : pc.moveDown();
			break;
			case "a" : pc.moveLeft();
			break;
			case "d" : pc.moveRight();
			break;
			default: warning();
		}

		pc.printPosition();
		System.out.println("Titik Koordinat adalah (" + pc.x + " , " + pc.y + ")");
		input();
	}

	public static void main(String[]args){
		input();
	}
    }   