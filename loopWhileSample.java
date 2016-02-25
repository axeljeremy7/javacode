public static void main(String[] args) {
        // TODO code application logic here
        String input;
        boolean cont1 = true;

        input = JOptionPane.showInputDialog("Enter a positive integer in the range [1, 2000]:");
        int num = Integer.parseInt(input);
        while (num <= 1 || num >= 2000) {
            input = JOptionPane.showInputDialog("The number is out of range. Re-enter :");
            num = Integer.parseInt(input);
        }

        System.out.print("The positive divisors of " + num + " are:");
        System.out.println();
        uno(num);

        while (cont1) {
            String input2 = JOptionPane.showInputDialog("Find divisors of another number (Y OR N)?");
            char tres = input2.toLowerCase().charAt(0);

            if (tres == 'y') {
                input = JOptionPane.showInputDialog("Enter a positive integer in the range [1, 2000]:");
                int num1 = Integer.parseInt(input);
                while (num1 <= 1 || num1 >= 2000) {
                    input = JOptionPane.showInputDialog("The number is out of range. Re-enter :");
                    num1 = Integer.parseInt(input);
                }

                System.out.println();
                System.out.print("The positive divisors of " + num1 + " are:");
                System.out.println();
                uno(num1);
            } else if (tres == 'n') {
                System.exit(0);

            }
        }

    }

    public static void uno(int num) {
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {

                System.out.print(i + " ");

            }
        }

    }
