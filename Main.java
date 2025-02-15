// // Read Number From Standard Input JAVA 
// // import java.util.*;
// // public class Main {
// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);
// //         System.out.println("Enter a number: ");
// //         int number = sc.nextInt(); 
// //         System.out.println("You entered: " + number);
// //     }
// // }

// // Get Input from the User java
// // import java.util.*;
// // public class Main {
// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);
// //         System.out.print("Enter your name: ");
// //         String name = sc.nextLine(); 
// //         System.out.print("Enter your age: ");
// //         int age = sc.nextInt();
// //         System.out.println("Hello, " + name + "!");
// //         System.out.println("You are " + age + " years old.");
// //     }
// // }

// // Multiply Two Floating-Point Numbers
// // import java.util.*;
// // public class Main {
// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);
// //         System.out.print("Enter the first number: ");
// //         double num1 = sc.nextDouble();
// //         System.out.print("Enter the second number: ");
// //         double num2 = sc.nextDouble(); 
// //         double result = num1 * num2;
// //         System.out.println("The result of multiplying " + num1 + " and " + num2 + " is: " + result);
// //     }
// // }

// // Swap Two Numbers 
// // import java.util.*;
// // public class Main {
// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);
// //         System.out.print("Enter the first number: ");
// //         int a = sc.nextInt();
// //         System.out.print("Enter the second number: ");
// //         int b = sc.nextInt();
// //         System.out.println("Before swapping: num1 = " + a + ", num2 = " + b);
// //         int c = a;
// //         a = b;
// //         b = c;
// //         System.out.println("After swapping: num1 = " + a + ", num2 = " + b);
// //     }
// // }

// // Add Two Binary Strings
// // public class Main {
// //     public static void main(String[] args) {
// //         String binary1 = "1010";  
// //         String binary2 = "1101"; 
// //         int num1 = Integer.parseInt(binary1, 2);
// //         int num2 = Integer.parseInt(binary2, 2);
// //         int sum = num1 + num2;
// //         String binarySum = Integer.toBinaryString(sum);
// //         System.out.println("Binary 1: " + binary1);
// //         System.out.println("Binary 2: " + binary2);
// //         System.out.println("Sum in Binary: " + binarySum);
// //     }
// // }
// // Add Two Complex Numbers
// // public class Main {
// //     public static void main(String[] args) {
// //         double real1 = 3.0;
// //         double imaginary1 = 4.0;
// //         double real2 = 1.0;
// //         double imaginary2 = 2.0;
// //         double realSum = real1 + real2;
// //         double imaginarySum = imaginary1 + imaginary2;

// //         if (imaginarySum < 0) {
// //             System.out.println("Sum of Complex Numbers: " + realSum + " - " + Math.abs(imaginarySum) + "i");
// //         } else {
// //             System.out.println("Sum of Complex Numbers: " + realSum + " + " + imaginarySum + "i");
// //         }
// //     }
// // }

// // Check Even or Odd Integers
// // import java.util.*;
// // public class EvenOddChecker {
// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);
// //         System.out.print("Enter an integer: ");
// //         int number = sc.nextInt();
// //         if (number % 2 == 0) {
// //             System.out.println(number + " is an Even number.");
// //         } else {
// //             System.out.println(number + " is an Odd number.");
// //         }
// //     }
// // }

// // Find Largest Among 3 Numbers
// // import java.util.*;
// // public class Main {
// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);
// //         System.out.print("Enter first number: ");
// //         int num1 = sc.nextInt();
// //         System.out.print("Enter second number: ");
// //         int num2 = sc.nextInt();
// //         System.out.print("Enter third number: ");
// //         int num3 = sc.nextInt();
// //         if (num1 > num2) {
// //             if (num1 > num3) {
// //                 System.out.println("The largest number is: " + num1);
// //             } else {
// //                 System.out.println("The largest number is: " + num3);
// //             }
// //         } else {
// //             if (num2 > num3) {
// //                 System.out.println("The largest number is: " + num2);
// //             } else {
// //                 System.out.println("The largest number is: " + num3);
// //             }
// //         }
// //     }
// // }
// // // Find LCM of 2 numbers
// // import java.util.*;
// // public class Main {
// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);
// //         System.out.print("Enter first number: ");
// //         int a = sc.nextInt();
// //         System.out.print("Enter second number: ");
// //         int b = sc.nextInt();
// //         int max = (a > b) ? a : b;
// //         int lcm = max;
// //         while (true) {
// //             if (lcm % a == 0 && lcm % b == 0) {
// //                 System.out.println("LCM of " + a + " and " + b + " is " + lcm);
// //                 break;
// //             }
// //             lcm++; 
// //         }
// //     }
// // }

// // Find GCD or HCF of 2 numbers
// // import java.util.*;
// // public class Main {
// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);
// //         System.out.print("Enter first number: ");
// //         int a = sc.nextInt();
// //         System.out.print("Enter second number: ");
// //         int b = sc.nextInt();
// //         while (b != 0) {
// //             int temp = b;
// //             b = a % b;
// //             a = temp;
// //         }
// //         System.out.println("GCD of the given numbers is: " + a);
// //     }
// // }

// // Display All Prime Numbers from 1 to N
// // import java.util.Scanner;
// // public class Main {
// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);
// //         System.out.println("Enter a number:");
// //         int n = sc.nextInt();
// //         if (n == 0 || n == 1) {
// //             System.out.println(n + " is not a prime number");
// //         } else {
// //             boolean isPrime = true;
// //             for (int i = 2; i <= Math.sqrt(n); i++) {
// //                 if (n % i == 0) {
// //                     isPrime = false;
// //                     break; 
// //                 }
// //             }
// //             if (isPrime) {
// //                 System.out.println(n + " is prime");
// //             } else {
// //                 System.out.println(n + " is not prime");
// //             }
// //         }
        
// //         sc.close();
// //     }
// // }

// // Check Leap Year
// // import java.util.*;
// // public class Main{
// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);
// //         int year=sc.nextInt();
// //         if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
// //             System.out.println(year + " is a leap year.");
// //         } else {
// //             System.out.println(year + " is not a leap year.");
// //         }
// //         sc.close();
// //     }
// // }
// // Check Armstrong Number between Two Integers in java without using function
// // import java.util.*;
// // public class Main {
// //     public static void main(String[] args) {
// //         System.out.print("Enter any number: ");
// //         Scanner sc = new Scanner(System.in);
// //         int n = sc.nextInt();
// //         int c = n;   
// //         int arm = 0; 
// //         int rem;   
// //         while (n > 0) {
// //             rem = n % 10; 
// //             arm = (rem * rem * rem) + arm;  
// //             n = n / 10; 
// //         }
// //         if (c == arm) {
// //             System.out.println("Armstrong Number");
// //         } else {
// //             System.out.println("Not an Armstrong Number");
// //         }
// //         sc.close();
// //     }
// // }

// // Java Program to Check if a Number is a Neon Number:
// // import java.util.Scanner;
// // public class Main {
// //     public static void main(String[] args) {
// //         System.out.print("Enter any number: ");
// //         Scanner sc = new Scanner(System.in);
// //         int n = sc.nextInt();
        
// //         int square = n * n;  
// //         int sum = 0;
// //         while (square != 0) {
// //             int rem = square % 10;  
// //             sum += rem;             
// //             square = square / 10;  
// //         }
// //         if (sum == n) {
// //             System.out.println(n + " is a Neon Number");
// //         } else {
// //             System.out.println(n + " is Not a Neon Number");
// //         }
// //         sc.close();
// //     }
// // }

// // Check whether input character is vowel or consonant
// // import java.util.Scanner;
// // public class Main {
// //     public static void main(String[] args) {
// //         System.out.println("Enter a character:");
// //         Scanner sc = new Scanner(System.in);
// //         char ch = sc.next().charAt(0); 
// //         ch = Character.toUpperCase(ch);
// //         switch (ch) {
// //             case 'A':
// //             case 'E':
// //             case 'I':
// //             case 'O':
// //             case 'U':
// //                 System.out.println("Vowel");
// //                 break;
// //             default:
// //                 System.out.println("Consonant");
// //                 break;
// //         }
// //         sc.close();
// //     }
// // }

// // Find Factorial of a number
// // import java.util.*;
// // public class Main {
// //     public static void main(String[] args) {
// //         System.out.println("Enter any number:");
// //         Scanner sc = new Scanner(System.in);
// //         int n = sc.nextInt(); 
// //         int fact = 1;  
// //         for (int i = 1; i <= n; i++) {
// //             fact = fact * i;  
// //         }
// //         System.out.println("The factorial of " + n + " is: " + fact);
// //         sc.close();
// //     }
// // }

// // Find Even Sum of Fibonacci Series Till number N
// // import java.util.*;
// // public class Main {
// //     public static void main(String[] args) {
// //         System.out.print("Enter the number N: ");
// //         Scanner sc = new Scanner(System.in);
// //         int N = sc.nextInt();
// //         int a = 0, b = 1;  
// //         int evenSum = 0;    
// //         while (a <= N) {
// //             if (a % 2 == 0) {
// //                 evenSum += a;  
// //             }
// //             int next = a + b;
// //             a = b;
// //             b = next;
// //         }
// //         System.out.println("The sum of even Fibonacci numbers up to " + N + " is: " + evenSum);

// //         sc.close();
// //     }
// // }

// // Calculate Simple Interest
// // import java.util.Scanner;
// // public class Main {
// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);
// //         System.out.print("Enter principal amount (P): ");
// //         float p = sc.nextFloat();
// //         System.out.print("Enter time period (T) in years: ");
// //         float t = sc.nextFloat();
// //         System.out.print("Enter rate of interest (R) in percentage: ");
// //         float r = sc.nextFloat();
// //         double si = (p * t * r) / 100;
// //         System.out.println("The Simple Interest is: " + si);
// //         sc.close();
// //     }
// // }
// // Calculate Compound Interest
// // import java.util.*;
// // public class Main {
// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);
// //         System.out.print("Enter principal amount (P): ");
// //         float p = sc.nextFloat();
// //         System.out.print("Enter time period (T) in years: ");
// //         float t = sc.nextFloat();
// //         System.out.print("Enter rate of interest (R) in percentage: ");
// //         float r = sc.nextFloat();
// //         double ci = p * Math.pow(1 + (r / 100), t) - p;
// //         System.out.println("The Compound Interest is: " + ci);
// //         sc.close();
// //     }
// // }

// // Find the Perimeter of a Rectangle
// // import java.util.*;
// // public class Main {
// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);
// //         int length = sc.nextInt(); 
// //         int width = sc.nextInt();  
// //         int perimeter = 2 * (length + width);
// //         System.out.println("The perimeter of the rectangle is: " + perimeter);
// //         sc.close();
// //     }
// // }

// // left Triangle Star Pattern
// // public class Main {
// //     public static void main(String[] args) {
// //         int rows = 5; 
// //         for (int i = 1; i <= rows; i++) {
// //             for (int j = 1; j <= i; j++) {
// //                 System.out.print("*");
// //             }
// //             System.out.println();
// //         }
// //     }
// // }

// // Right Triangle Star Pattern
// // public class Main {
// //     public static void main(String[] args) {
// //         int rows = 5; 
// //         for (int i = 1; i <= rows; i++) {
// //             for (int j = i; j < rows; j++) {
// //                 System.out.print(" "); 
// //             }
// //             for (int j = 1; j <= i; j++) {
// //                 System.out.print("*"); 
// //             }
// //             System.out.println(); 
// //         }
// //     }
// // }

// // Pyramid Star Pattern
// // public class Main {
// //     public static void main(String[] args) {
// //         int rows = 5; 
// //         for (int i = 1; i <= rows; i++) {
// //             for (int j = i; j < rows; j++) {
// //                 System.out.print(" ");
// //             }
// //             for (int j = 1; j <= (2 * i - 1); j++) {
// //                 System.out.print("*"); 
// //             }
// //             System.out.println(); 
// //         }
// //     }
// // }

// // Reverse Pyramid Star Pattern   // Mirror Upper Star Triangle Pattern
// // public class Main {
// //     public static void main(String[] args) {
// //         int n = 5;
// //         for (int i = n; i >= 1; i--) {
// //             for (int j = 0; j < n - i; j++) {
// //                 System.out.print(" ");
// //             }
// //             for (int k = 0; k < 2 * i - 1; k++) {
// //                 System.out.print("*");
// //             }
// //             System.out.println();
// //         }
// //     }
// // }

// // upper star tringle patteren
// // public class Main {
// //     public static void main(String[] args) {
// //         int n = 5;
// //         for (int i = 1; i <= n; i++) {
// //             for (int j = 0; j < n - i; j++) {
// //                 System.out.print(" ");
// //             }
// //             for (int k = 0; k < 2 * i - 1; k++) {
// //                 System.out.print("*");
// //             }
// //             System.out.println();
// //         }
// //     }
// // }
// // Downward Triangle Star Pattern
// // public class Main {
// //     public static void main(String[] args) {
// //         int n = 5;
// //         for (int i = n; i >= 1; i--) {
// //             for (int j = 1; j <= i; j++) {
// //                 System.out.print("*");
// //             }
// //             System.out.println();
// //         }
// //     }
// // }

// // Mirror Lower Star Triangle Pattern
// // public class Main {
// //     public static void main(String[] args) {
// //         int n = 5;
// //         for (int i = n; i >= 1; i--) {
// //             for (int j = i; j < n; j++) {
// //                 System.out.print(" ");
// //             }
// //             for (int k = 1; k <= i; k++) {
// //                 System.out.print("*");
// //             }
// //             System.out.println();
// //         }
// //     }
// // }
// // starPascalsTriangle  pattern 
// // import java.util.Scanner;

// // public class Main {
// //     public static void main(String[] args) {
// //         Scanner scanner = new Scanner(System.in);
// //         System.out.print("Enter the number of rows: ");
// //         int rows = scanner.nextInt();
// //         scanner.close();
// //         for (int i = 0; i < rows; i++) {
// //             for (int j = 0; j < rows - i; j++) {
// //                 System.out.print(" ");
// //             }
// //             int number = 1;
// //             for (int j = 0; j <= i; j++) {
// //                 System.out.print("* ");
// //                 number = number * (i - j) / (j + 1);
// //             }
// //             System.out.println();
// //         }
// //     }
// // }

// //  Diamond Star Pattern in java
// import java.util.Scanner;

// public class DiamondStarPattern {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter the number of rows: ");
//         int rows = scanner.nextInt();
//         scanner.close();
//         for (int i = 1; i <= rows; i++) {
//             for (int j = rows - i; j > 0; j--) {
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <= (2 * i - 1); j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         for (int i = rows - 1; i > 0; i--) {
//             for (int j = rows - i; j > 0; j--) {
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <= (2 * i - 1); j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// Square Star Pattern in java
// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter the size of the square: ");
//         int size = scanner.nextInt();
//         scanner.close();

//         for (int i = 0; i < size; i++) {
//             for (int j = 0; j < size; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

// Pyramid Star Pattern
// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter the number of rows: ");
//         int rows = scanner.nextInt();
//         scanner.close();

//         for (int i = 1; i <= rows; i++) {
//             for (int j = rows - i; j > 0; j--) {
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <= (2 * i - 1); j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


// Spiral Pattern of Numbers
// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter the size of the spiral: ");
//         int n = scanner.nextInt();
//         scanner.close();

//         int[][] spiral = new int[n][n];
//         int value = 1, minRow = 0, minCol = 0, maxRow = n - 1, maxCol = n - 1;

//         while (value <= n * n) {
//             for (int i = minCol; i <= maxCol && value <= n * n; i++) {
//                 spiral[minRow][i] = value++;
//             }
//             minRow++;

//             for (int i = minRow; i <= maxRow && value <= n * n; i++) {
//                 spiral[i][maxCol] = value++;
//             }
//             maxCol--;

//             for (int i = maxCol; i >= minCol && value <= n * n; i--) {
//                 spiral[maxRow][i] = value++;
//             }
//             maxRow--;

//             for (int i = maxRow; i >= minRow && value <= n * n; i--) {
//                 spiral[i][minCol] = value++;
//             }
//             minCol++;
//         }

//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 System.out.printf("%3d ", spiral[i][j]);
//             }
//             System.out.println();
//         }
//     }
// }
