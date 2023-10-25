import java.util.Scanner;

class Activity1 {
public static void main(String[] args) {
Animal animal = new Animal();
int num;
char ans;
Scanner scanner = new Scanner(System.in);

do {
System.out.println("This program will tell the sound of an Animal.");
do {
System.out.println("Enter a number between 1-4");
num = scanner.nextInt();
if (num > 4 || num < 1) {
System.out.println("The number entered is beyond my programming :D\nPlease try again.");
}
} while (num > 4 || num < 1);

switch (num) {
case 1:
animal.goat();
break;
case 2:
animal.cow();
break;
case 3:
animal.snake();
break;
case 4:
animal.cat();
break;
}

System.out.println("\nDo you wish to try again? [Y/N]");
ans = scanner.next().charAt(0);
} while (ans == 'Y' || ans == 'y');

System.out.println("Thank you for using, goodbye!");
scanner.close();
}
}

class Animal {
public void goat() {
System.out.println("Meee!! Meee!! Meee!!");
}

public void cow() {
System.out.println("Moo!! Moo!! Moo!!");
}

public void snake() {
System.out.println("Shhh!! Shhh!! Shhh!!");
}

public void cat() {
System.out.println("Meow!! Meow!! Meow!!");
}
}