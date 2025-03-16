import java.util.Scanner;

public class CallingConventionEscapeRoom {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You are trapped in the stack! Can you navigate through various doors with calling convention questions to escape...");
        room1(scanner);
        scanner.close();
    }

    public static void room1(Scanner scanner) {
        System.out.println("\n*ੈ✩‧₊˚.,⋆｡.⊹⋆`˖⋆✧｡⋆.-*⋆⊹˚ Room 1 .,⋆｡.⊹⋆`˖⋆✧｡⋆.-*⋆⊹˚*ੈ✩‧₊˚\nHow are the first six parameters passed in x86-64?");
        System.out.println("1) Stack\n2) Registers (RDI, RSI, RDX, RCX, R8, R9)\n3) Heap");
        System.out.print("Enter your answer to pass (∩◕ᗜ◕)⊃━☆ﾟ.* : ");

        String answer = scanner.nextLine().trim();
        if (answer.equals("2")) {
            room2(scanner);
        } else {
            System.out.println("Incorrect! Try again.");
            room1(scanner);
        }
    }

    public static void room2(Scanner scanner) {
        System.out.println("\n*ੈ✩‧₊˚.,⋆｡.⊹⋆`˖⋆✧｡⋆.-*⋆⊹˚ Room 2 .,⋆｡.⊹⋆`˖⋆✧｡⋆.-*⋆⊹˚*ੈ✩‧₊˚\nWhat instruction is used to return from a function?");
        System.out.println("1) call\n2) jmp\n3) ret");
        System.out.print("Enter your answer: ");

        String answer = scanner.nextLine().trim();
        if (answer.equals("3")) {
            room3(scanner);
        } else {
            System.out.println("Incorrect! Try again.");
            room2(scanner);
        }
    }

    public static void room3(Scanner scanner) {
        System.out.println("\n*ੈ✩‧₊˚.,⋆｡.⊹⋆`˖⋆✧｡⋆.-*⋆⊹˚ Room 3 .,⋆｡.⊹⋆`˖⋆✧｡⋆.-*⋆⊹˚*ੈ✩‧₊˚\nWhat two instructions set up a new stack frame at the start of a function?");
        System.out.println("1) push rbp; mov rbp, rsp\n2) pop rbp; ret\n3) mov rsp, rbp; pop rbp");
        System.out.print("Enter your answer to pass (∩◕ᗜ◕)⊃━☆ﾟ.* : ");

        String answer = scanner.nextLine().trim();
        if (answer.equals("1")) {
            System.out.println("\n⋆✴︎˚｡⋆Doing good apprentice! Answer more questions to gain more powers⋆✴︎˚｡⋆");
            room4(scanner);
        } else {
            System.out.println("Incorrect! Try again.");
            room3(scanner);
        }
    }

    public static void room4(Scanner scanner) {
        System.out.println("\n*ੈ✩‧₊˚.,⋆｡.⊹⋆`˖⋆✧｡⋆.-*⋆⊹˚ Room 4 .,⋆｡.⊹⋆`˖⋆✧｡⋆.-*⋆⊹˚*ੈ✩‧₊˚\nWhat does the call instruction do in x86-64?");
        System.out.println("1) push rip; jmp function\n2) push rbp; pop rbp\n3) mov rsp, rbp; ret");
        System.out.print("Enter your answer to pass (∩◕ᗜ◕)⊃━☆ﾟ.* : ");

        String answer = scanner.nextLine().trim();
        if (answer.equals("1")) {
            room5(scanner);
        } else {
            System.out.println("Incorrect! Try again.");
            room4(scanner);
        }
    }

    public static void room5(Scanner scanner) {
        System.out.println("\n*ੈ✩‧₊˚.,⋆｡.⊹⋆`˖⋆✧｡⋆.-*⋆⊹˚ Room 5 .,⋆｡.⊹⋆`˖⋆✧｡⋆.-*⋆⊹˚*ੈ✩‧₊˚\nWhat does the leave instruction do?");
        System.out.println("1) mov rsp, rbp; pop rbp\n2) push rbp; mov rbp, rsp\n3) call function");
        System.out.print("Enter your answer to pass (∩◕ᗜ◕)⊃━☆ﾟ.* : ");

        String answer = scanner.nextLine().trim();
        if (answer.equals("1")) {
            room6(scanner);
        } else {
            System.out.println("Incorrect! Try again.");
            room5(scanner);
        }
    }

    public static void room6(Scanner scanner) {
        System.out.println("\n*ੈ✩‧₊˚.,⋆｡.⊹⋆`˖⋆✧｡⋆.-*⋆⊹˚ Room 6 .,⋆｡.⊹⋆`˖⋆✧｡⋆.-*⋆⊹˚*ੈ✩‧₊˚\nHow are parameters passed in 32-bit calling conventions?");
        System.out.println("1) Stored in registers\n2) Pushed onto the stack in reverse order\n3) Allocated on the heap");
        System.out.print("Enter your answer to pass (∩◕ᗜ◕)⊃━☆ﾟ.* : ");

        String answer = scanner.nextLine().trim();
        if (answer.equals("2")) {
            room7(scanner);
        } else {
            System.out.println("Incorrect! Try again.");
            room6(scanner);
        }
    }

    public static void room7(Scanner scanner) {
        System.out.println("\n*ੈ✩‧₊˚.,⋆｡.⊹⋆`˖⋆✧｡⋆.-*⋆⊹˚ Room 7 .,⋆｡.⊹⋆`˖⋆✧｡⋆.-*⋆⊹˚*ੈ✩‧₊˚\nWhat is involved in calling conventions?");
        System.out.println("1) Parameter passing, stack management, returning values\n2) Only function names\n3) Just using registers");
        System.out.print("Enter your answer to pass (∩◕ᗜ◕)⊃━☆ﾟ.* : ");

        String answer = scanner.nextLine().trim();
        if (answer.equals("1")) {
            room8(scanner);
        } else {
            System.out.println("Incorrect! Try again.");
            room7(scanner);
        }
    }

    public static void room8(Scanner scanner) {
        System.out.println("\n*ੈ✩‧₊˚.,⋆｡.⊹⋆`˖⋆✧｡⋆.-*⋆⊹˚ Room 8 .,⋆｡.⊹⋆`˖⋆✧｡⋆.-*⋆⊹˚*ੈ✩‧₊˚\nHow will we get the CPU back to where it should be?");
        System.out.println("1) Storing return address on the stack\n2) Hardcoding return addresses\n3) Using a global variable");
        System.out.print("Enter your answer to pass (∩◕ᗜ◕)⊃━☆ﾟ.* : ");

        String answer = scanner.nextLine().trim();
        if (answer.equals("1")) {
            room9(scanner);
        } else {
            System.out.println("Incorrect! Try again.");
            room8(scanner);
        }
    }

    public static void room9(Scanner scanner) {
        System.out.println("\n*ੈ✩‧₊˚.,⋆｡.⊹⋆`˖⋆✧｡⋆.-*⋆⊹˚ Room 9 .,⋆｡.⊹⋆`˖⋆✧｡⋆.-*⋆⊹˚*ੈ✩‧₊˚\nWhat changes between 64-bit and 32-bit programs?");
        System.out.println("1) Register usage and calling conventions\n2) Only the instruction set\n3) Nothing");
        System.out.print("Enter your answer to pass (∩◕ᗜ◕)⊃━☆ﾟ.* : ");

        String answer = scanner.nextLine().trim();
        if (answer.equals("1")) {
            room10(scanner);
        } else {
            System.out.println("Incorrect! Try again.");
            room9(scanner);
        }
    }

    public static void room10(Scanner scanner) {
        System.out.println("\n*ੈ✩‧₊˚.,⋆｡.⊹⋆`˖⋆✧｡⋆.-*⋆⊹˚ Room 10 .,⋆｡.⊹⋆`˖⋆✧｡⋆.-*⋆⊹˚*ੈ✩‧₊˚\nIn x86-64, how is the stack aligned before a function call?");
        System.out.println("1) 8-byte boundary\n2) 16-byte boundary\n3) 4-byte boundary");
        System.out.print("Enter your answer to pass (∩◕ᗜ◕)⊃━☆ﾟ.* : ");

        String answer = scanner.nextLine().trim();
        if (answer.equals("2")) {
            room11(scanner);
        } else {
            System.out.println("Incorrect! Try again.");
            room10(scanner);
        }
    }

    public static void room11(Scanner scanner) {
        System.out.println("\n*ੈ✩‧₊˚.,⋆｡.⊹⋆`˖⋆✧｡⋆.-*⋆⊹˚ Room 11 .,⋆｡.⊹⋆`˖⋆✧｡⋆.-*⋆⊹˚*ੈ✩‧₊˚\nIn which of the following scenarios would the stack be misaligned?");
        System.out.println("1) When the function call doesn't follow the standard calling convention\n2) When parameters are passed in reverse order\n3) When a program doesn't include an explicit return address");
        System.out.print("Enter your answer to pass (∩◕ᗜ◕)⊃━☆ﾟ.* : ");

        String answer = scanner.nextLine().trim();
        if (answer.equals("1")) {
            room12(scanner);
        } else {
            System.out.println("Incorrect! Try again.");
            room11(scanner);
        }
    }

    public static void room12(Scanner scanner) {
        System.out.println("\n*ੈ✩‧₊˚.,⋆｡.⊹⋆`˖⋆✧｡⋆.-*⋆⊹˚ Room 12 .,⋆｡.⊹⋆`˖⋆✧｡⋆.-*⋆⊹˚*ੈ✩‧₊˚\nWhich of the following is a primary responsibility of the 'callee' in a calling convention?");
        System.out.println("1) Saving the return address\n2) Cleaning up the stack after the function call\n3) Passing parameters to the 'caller'");
        System.out.print("Enter your answer to pass (∩◕ᗜ◕)⊃━☆ﾟ.* : ");

        String answer = scanner.nextLine().trim();
        if (answer.equals("2")) {
            room13(scanner);
        } else {
            System.out.println("Incorrect! Try again.");
            room12(scanner);
        }
    }

    public static void room13(Scanner scanner) {
        System.out.println("\n*ੈ✩‧₊˚.,⋆｡.⊹⋆`˖⋆✧｡⋆.-*⋆⊹˚ Room 13 .,⋆｡.⊹⋆`˖⋆✧｡⋆.-*⋆⊹˚*ੈ✩‧₊˚\n What is the purpose of the 'mov' instruction in the context of calling conventions?");
        System.out.println("1) To move data between registers\n2) To push the return address onto the stack\n3) To adjust the stack pointer before returning");
        System.out.print("Enter your answer to pass (∩◕ᗜ◕)⊃━☆ﾟ.* : ");

        String answer = scanner.nextLine().trim();
        if (answer.equals("1")) {
            room14(scanner);
        } else {
            System.out.println("Incorrect! Try again.");
            room13(scanner);
        }
    }

    public static void room14(Scanner scanner) {
        System.out.println("\n*ੈ✩‧₊˚.,⋆｡.⊹⋆`˖⋆✧｡⋆.-*⋆⊹˚ Room 14 .,⋆｡.⊹⋆`˖⋆✧｡⋆.-*⋆⊹˚*ੈ✩‧₊˚\nWhich of the following is true about the 'RBP' register in the context of x86-64 function calls?");
        System.out.println("1) It holds the return address\n2) It is used for stack frame management\n3) It holds the function's return value");
        System.out.print("Enter your answer to pass (∩◕ᗜ◕)⊃━☆ﾟ.* : ");

        String answer = scanner.nextLine().trim();
        if (answer.equals("2")) {
            room15(scanner);
        } else {
            System.out.println("Incorrect! Try again.");
            room14(scanner);
        }
    }

    public static void room15(Scanner scanner) {
        System.out.println("\n*ੈ✩‧₊˚.,⋆｡.⊹⋆`˖⋆✧｡⋆.-*⋆⊹˚ Room 15 .,⋆｡.⊹⋆`˖⋆✧｡⋆.-*⋆⊹˚*ੈ✩‧₊˚\nIn the System V AMD64 calling convention, which register is used to pass the first integer argument?");
        System.out.println("1) RDI\n2) RSI\n3) RDX");
        System.out.print("Enter your answer to pass (∩◕ᗜ◕)⊃━☆ﾟ.* : ");

        String answer = scanner.nextLine().trim();
        if (answer.equals("1")) {
            System.out.println("\n⋆✴︎˚｡⋆Almost there! Your skills and powers are growing stronger!⋆✴︎˚｡⋆");
            room16(scanner);
        } else {
            System.out.println("Incorrect! Try again.");
            room15(scanner);
        }
    }


    public static void room16(Scanner scanner) {
        System.out.println("\n*ੈ✩‧₊˚.,⋆｡.⊹⋆`˖⋆✧｡⋆.-*⋆⊹˚ Room 16 .,⋆｡.⊹⋆`˖⋆✧｡⋆.-*⋆⊹˚*ੈ✩‧₊˚\nWhat happens to the return address when a function call is made?");
        System.out.println("1) It is stored in the RIP register\n2) It is pushed onto the stack\n3) It is stored in the RBP register");
        System.out.print("Enter your answer to pass (∩◕ᗜ◕)⊃━☆ﾟ.* : ");

        String answer = scanner.nextLine().trim();
        if (answer.equals("2")) {
            room17(scanner);
        } else {
            System.out.println("Incorrect! Try again.");
            room16(scanner);
        }
    }

    public static void room17(Scanner scanner) {
        System.out.println("\n*ੈ✩‧₊˚.,⋆｡.⊹⋆`˖⋆✧｡⋆.-*⋆⊹˚ Room 17 .,⋆｡.⊹⋆`˖⋆✧｡⋆.-*⋆⊹˚*ੈ✩‧₊˚\nWhich register holds the return value in the x86-64 calling convention?");
        System.out.println("1) RAX\n2) RDX\n3) RSI");
        System.out.print("Enter your answer to pass (∩◕ᗜ◕)⊃━☆ﾟ.* : ");

        String answer = scanner.nextLine().trim();
        if (answer.equals("1")) {
            room18(scanner);
        } else {
            System.out.println("Incorrect! Try again.");
            room17(scanner);
        }
    }
    public static void room18(Scanner scanner) {
        System.out.println("\n*ੈ✩‧₊˚.,⋆｡.⊹⋆`˖⋆✧｡⋆.-*⋆⊹˚ Room 18 .,⋆｡.⊹⋆`˖⋆✧｡⋆.-*⋆⊹˚*ੈ✩‧₊˚\nHow do we restore our local variables in x86-64?");
        System.out.println("1) pop rip\n2) call jmp\n3) push rbp ; mov rbp,rsp");
        System.out.print("Enter your answer to pass (∩◕ᗜ◕)⊃━☆ﾟ.* : ");

        String answer = scanner.nextLine().trim();
        if (answer.equals("3")) {
            room19(scanner);
        } else {
            System.out.println("Incorrect! Try again.");
            room18(scanner);
        }
    }

    public static void room19(Scanner scanner) {
        System.out.println("\n*ੈ✩‧₊˚.,⋆｡.⊹⋆`˖⋆✧｡⋆.-*⋆⊹˚ Room 18 .,⋆｡.⊹⋆`˖⋆✧｡⋆.-*⋆⊹˚*ੈ✩‧₊˚\nIn the x86-64 architecture, what is the size of the stack pointer register (RSP)?");
        System.out.println("1) 32 bits\n2) 64 bits\n3) 128 bits");
        System.out.print("Enter your answer to pass (∩◕ᗜ◕)⊃━☆ﾟ.* : ");

        String answer = scanner.nextLine().trim();
        if (answer.equals("2")) {
            System.out.println("You answered correctly! You have escaped the stack!");
            System.out.println("Congratulations! You are now a master sorcerer of calling conventions and stack management!*ੈ✩‧₊˚\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣤⣤⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⠞⠀⠀⠉⠳⢦⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⡎⠀⠀⠀⠀⠀⠀⠈⠉⠳⠦⣄⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡰⠊⠀⠀⠀⠀⠀⠰⣆⠀⠀⠀⠀⠀⠉⠙⠲⠦⣄⣀⡀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡞⠁⠀⠀⠀⠀⠀⠀⠀⠘⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠙⢧⡄⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⡷⠦⠤⣤⣄⣀⣀⣀⣀⡀⠀⠀⢹⣆⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡴⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠹⣄⠀⠀⠀⠀⠀⠈⠉⠻⣦⠀⠀⢻⡄\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⠞⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠻⣄⠀⠀⠀⠀⠀⠀⠀⠙⢧⡀⢸⡇\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⠦⠴⠧⠤⡤⣤⣤⠤⠤⠤⠤⠤⠤⠤⠶⠖⠒⠒⠒⠛⠻⠛⢻⡄⠀⠀⠀⠀⠀⠘⢧⡀⣧\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⡇⠀⠀⠀⠀⠀⠀⠀⠹⣿\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢴⣦⠤⢤⣤⣤⣄⣀⣀⣟⣀⣀⣀⣀⡤⠴⠶⠖⠚⠋⠉⠉⠉⠙⠛⠒⠲⠶⠶⠦⠤⢤⣤⣿⣀⣀⣀⣀⣴⡶⠆⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠲⣤⣀⡀⠀⠉⠉⢉⠉⠉⠉⢀⣀⣀⣀⣀⣤⡤⠤⠤⠶⠶⠶⠶⠦⢤⣤⣠⣀⣀⣄⣀⣀⣠⠴⠟⠁⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⣰⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠙⠛⠻⡿⠛⡟⠛⠋⠉⠁⠀⢀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⡇⠹⣇⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⡏⠙⢿⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⠇⢰⡇⠀⠀⠀⠀⢠⡿⣷⡄⠀⠀⠀⠀⠀⠀⣰⠾⡆⠀⠀⠀⢸⡇⠀⢹⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⣀⣸⡇⠀⠀⠻⠷⢶⣶⣶⡶⠀⠀⠀⠀⠀⠀⠀⣽⠀⢸⡄⠀⠀⠀⠀⢿⣼⠟⠀⠀⠀⠀⠀⠀⠀⣿⣴⡏⠀⠀⠀⢸⡇⠀⢸⡇⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⣠⣶⣿⣯⣽⡆⠀⠀⠀⣶⠞⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⣿⠀⠘⡇⠀⠀⠀⠀⠐⠁⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠀⠀⠀⠀⢸⡇⠀⢸⠃⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠉⠉⠉⣹⠃⣴⣤⡀⠹⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⡄⠀⣇⠀⠀⠀⢀⣠⡤⠞⠛⠛⠛⠛⠓⠲⠶⣤⣤⣀⡀⠀⢀⣿⠀⠀⡞⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⢸⣿⡴⢻⡇⠹⡷⣿⣦⠀⠀⠀⠀⠀⠀⠀⠀⠀⠁⣇⠀⠸⣦⠶⠛⠉⠀⢤⣀⠀⠀⠀⠀⠀⠀⣠⡀⠀⠈⠙⠛⠿⠁⠀⢸⠇⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠘⠿⠇⠈⣷⠀⣧⠈⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⡀⠀⠀⠀⠀⠀⠀⠀⠙⠳⠶⠤⠤⠶⠞⠛⠁⠀⠀⠀⠀⠀⠀⢠⡎⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⣿⡄⢸⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢷⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡾⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⣷⠈⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢳⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡾⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠸⡆⢸⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⡷⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣾⢷⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⡈⢷⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣴⠏⠀⢹⢦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⠛⡇⠈⢧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⢘⣿⣾⣷⣤⡀⠀⠀⠀⠀⠀⠀⣠⡾⠁⠀⠀⢸⠀⠙⢦⣀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⠟⠁⠀⣿⠀⠘⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣯⣬⣤⣤⠉⢳⣤⠀⠀⠀⣴⠟⠀⠀⠀⠀⣸⠀⠀⠀⠉⠳⢤⣄⡀⠀⣀⣤⠞⠋⠀⠀⠀⠀⣿⠀⠀⢸⡆⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣽⣶⣿⠀⣰⡟⠙⠛⠚⠃⠀⠀⠀⠀⣸⡟⠀⠀⠀⠀⠀⠀⠈⠉⠉⠉⠀⠀⠀⠀⠀⠀⠀⣹⠀⠀⠀⢳⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣿⣿⠿⣿⣇⣿⠁⠀⠀⠀⠀⠀⠀⠀⣸⢿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠿⡆⠀⠀⠸⡇⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢿⣿⡉⢿⡷⣤⣤⣀⡀⠀⠀⢀⡾⠃⣸⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⢹⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⡇⠀⢷⠀⠀⠈⠙⠛⠲⠟⠀⢀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣷⠀⠀⠀⠘⡆⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣷⠀⠘⣧⠀⠀⠀⠀⠀⠀⠀⢸⢇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣿⠷⠶⢶⡖⠛⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣶⣤⣿⠄⠀⠀⠀⠀⠀⠀⡜⠈⠙⠓⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠒⠛⣿⠀⠀⣸⡇⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠉⠁⠀⠀⠀⠀⠀⠀⠀⣇⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⣿⣤⣴⠟⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣤⡇⠉⠉⠙⠛⠛⠒⠒⠒⠒⠒⠒⠒⠒⠒⠒⠒⠛⠛⠉⠀⢹⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣧⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠻⢦⣤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣀⣤⣤⠶⠿⠂⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠛⠛⠛⠛⠛⠛⠛⠛⠛⠋⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        } else {
            System.out.println("Incorrect! Try again.");
            room19(scanner);
        }
    }
}
