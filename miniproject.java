 case 2:
                    if (studentCount == 0) {
                        System.out.println("No students added yet!");
                        break;
                    }

                    if (currentDay >= MAX_DAYS) {
                        System.out.println("Maximum days limit reached for marking attendance!");
                        break;
                    }

                    System.out.println("Marking attendance for day " + (currentDay + 1));
                    for (int i = 0; i < studentCount; i++) {
                        System.out.print("Is " + students[i] + " present on day"+(currentDay+1) +" (Y/N): ");
                        String attendanceStatus = scanner.next().toUpperCase();
                        if (attendanceStatus.equals("Y")) {
                            attendance[i][currentDay] = true;
                        } else if (attendanceStatus.equals("N")) {
                            attendance[i][currentDay] = false;
                        } else {
                            System.out.println("Invalid input! Please enter Y or N.");
                            i--;
                        }
                    }
                    currentDay++;
                    break;
