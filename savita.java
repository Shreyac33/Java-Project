 while (true) {
            System.out.println("\n1. Add student");
            System.out.println("2. Mark attendance");
            System.out.println("3. View attendance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    if (studentCount < MAX_STUDENTS) {
                        System.out.print("Enter student name: ");
                        String studentName = scanner.next();
                        students[studentCount++] = studentName;
                        System.out.println("Student added successfully!");
                    } else {
                        System.out.println("Maximum student limit reached!");
                    }
                    break;
                   System.out.println("Start of the attendance");
