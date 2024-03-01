case 3:
                    if (studentCount == 0) {
                        System.out.println("No students added yet!");
                        break;
                    }
                    System.out.print("Name\t\t");
                    for (int days=0;days<31;days++)
                    {
                       System.out.print("Day-"+(days+1)+"\t\t");
                    }
                    System.out.println();
                    for (int i = 0; i < studentCount; i++) {
                        System.out.print(students[i] + "\t");
                        for (int j = 0; j < currentDay; j++) {
                            System.out.print("  ");
                            System.out.print(attendance[i][j] ? "\tPresent " : "\tAbsent ");
                        }
                        System.out.println();
                    }
                    break;

System.out.println(Hello world);
