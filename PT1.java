import java.util.Scanner;
import java.io.*;



public class PT1 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int element;

        System.out.println("Choose an option:\n1 = Stack\n2 = Queue\nInput:");
		int choice = scanner.nextInt();
		
		if (choice == 1) {
			element = scanner.nextInt();
            stack(element);
		}
		else if (choice == 2) {
            element = scanner.nextInt();
			queue(element);
		}
	}


        //STACK FUNCTION
        public static void stack(int maxsize) {
            Scanner scanner = new Scanner(System.in);
            int top = -1;
            System.out.print("Enter the maximum size of the stack: ");  
            maxsize = scanner.nextInt();
            int[] stack = new int[maxsize];
    
            System.out.println("Enter the elements:");
    
            for (int i = 0; i < maxsize; i++) {
                int element = scanner.nextInt();
                if (top == maxsize - 1) {
                    System.out.println("Stack overflow");
                    break;
                } else {
                    top++;
                    stack[top] = element;
                }
            }
            System.out.printf("The top element of the stack: " + stack[top] +"\n");
            System.out.println("The elements in the stack are:");
            
    
            while (top >= 0) {
                int element = stack[top];
                top--;
                System.out.println(element);
            }
        }
    
        
    //QUEUE FUNCTION
    public static void queue(int maxsize) {
        Scanner scanner = new Scanner(System.in);
        int front, rear;
        front = rear = -1;

        System.out.print("Enter the maximum size of the queue: ");
        maxsize = scanner.nextInt();
        int[] queue = new int[maxsize];

        System.out.println("Enter the elements:");

        for (int i = 0; i < maxsize; i++) {
            int element = scanner.nextInt();
            if (rear == maxsize - 1) {
                System.out.println("Queue overflow");
                break;
            } else {
                if (front == -1) {
                    front = 0;
                }
                rear++;
                queue[rear] = element;
            }
        }

        System.out.printf("The front element in the queue: " + queue[front]);
        System.out.printf("\nThe rear element of the queue: " + queue[rear]);
        

        while (front <= rear) {
            int element = queue[front];
            front++;
        }
        }
    }

